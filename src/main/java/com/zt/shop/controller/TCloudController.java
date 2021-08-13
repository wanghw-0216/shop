package com.zt.shop.controller;

import com.zt.shop.dao.ZTSkuMapper;
import com.zt.shop.entity.ZTSku;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName TCloudController
 * @Description TODO
 * @Date 2021/5/6 10:45
 * @Version 1.0
 **/
@RestController
@RequestMapping("/zt")
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
public class TCloudController {

    @Resource
    private ZTSkuMapper ztSkuMapper;

    @RequestMapping("uploadImg")
    public String uploadImg(@RequestParam("file") MultipartFile[] file, @RequestParam("skuName") String skuName, @RequestParam("price") BigDecimal price,
                                  @RequestParam("skuNum") String skuNum, @RequestParam("skuDes") String skuDes, HttpServletRequest request) throws IOException {
        System.out.println("start upload");
        String imgUrl = "";
        List<String> list = new ArrayList<>();
        for (MultipartFile multipartFile : file) {
            String returnUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
            String originalFilename = multipartFile.getOriginalFilename();
            String filePath = System.getProperty("user.dir")+"/img/" + skuNum;
            File dir = new File(filePath);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            String fileSavePath = filePath + File.separator + originalFilename;
            imgUrl = returnUrl+"/img/" + skuNum + File.separator + originalFilename;
            System.out.println("保存图片的地址是：" + fileSavePath);
            System.out.println("访问图片的地址是：" + imgUrl);
            File imgFile = new File(fileSavePath);

            multipartFile.transferTo(imgFile);
            list.add(imgUrl);
        }
        ZTSku ztSku = new ZTSku();
        ztSku.setSkuImg(String.join("," , list));
        ztSku.setSkuName(skuName);
        ztSku.setSkuNum(skuNum);
        ztSku.setPrice(price);
        ztSkuMapper.insert(ztSku);
        return imgUrl;
    }


    @RequestMapping("test")
    public String test() {
        return "ok";
    }
}
