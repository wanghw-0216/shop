package com.zt.shop.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zt.shop.entity.ResultDTO;
import com.zt.shop.entity.dto.GoodsInfoDTO;
import com.zt.shop.entity.dto.QueryDTO;
import com.zt.shop.service.ShopService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ShopController
 * @Description TODO
 * @Date 2021/5/13 16:25
 * @Version 1.0
 **/
@RestController
@RequestMapping("shop")
public class ShopController {

    @Resource
    private ShopService shopService;
    @RequestMapping("getGoodsList")
    public ResultDTO getGoodsList(@RequestBody QueryDTO dto){
        PageInfo goodsList = shopService.getGoodsList(dto);
        return ResultDTO.getSuccess(goodsList);
    }

    @RequestMapping("getGoodsDetail")
    public ResultDTO getGoodsDetail(@RequestParam Integer id){
        GoodsInfoDTO goods = shopService.getGoodsDetail(id);
        return ResultDTO.getSuccess(goods);
    }
}
