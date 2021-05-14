package com.zt.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zt.shop.dao.ZTSkuMapper;
import com.zt.shop.entity.ZTSku;
import com.zt.shop.entity.dto.GoodsInfoDTO;
import com.zt.shop.entity.dto.QueryDTO;
import com.zt.shop.service.ShopService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

/**
 * @ClassName ShopServiceImpl
 * @Description TODO
 * @Date 2021/5/13 16:42
 * @Version 1.0
 **/
@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    private ZTSkuMapper ztSkuMapper;
    @Override
    public PageInfo getGoodsList(QueryDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<ZTSku> ztSkus = ztSkuMapper.selectAll();
        PageInfo pageInfo =  new PageInfo(ztSkus);
        List<GoodsInfoDTO> rtList = new ArrayList<>();
        for (ZTSku sku : ztSkus) {
            GoodsInfoDTO rtDTO = new GoodsInfoDTO();
            rtDTO.setId(sku.getId());
            rtDTO.setPrice(sku.getPrice());
            rtDTO.setGoodsImg(Arrays.asList(sku.getSkuImg().split(",")));
            rtDTO.setGoodsName(sku.getSkuName());
            rtList.add(rtDTO);
        }
        pageInfo.setList(rtList);
        return pageInfo;
    }

    @Override
    public GoodsInfoDTO getGoodsDetail(Integer id) {
        ZTSku ztSku = ztSkuMapper.selectByPrimaryKey(id);
        GoodsInfoDTO rtDTO = new GoodsInfoDTO();
        rtDTO.setGoodsName(ztSku.getSkuName());
        rtDTO.setGoodsNum(ztSku.getSkuNum());
        rtDTO.setPrice(ztSku.getPrice());
        rtDTO.setId(ztSku.getId());
        rtDTO.setGoodsImg(Arrays.asList(ztSku.getSkuImg().split(",")));
        rtDTO.setGoodsDes(ztSku.getSkuDes());
        return rtDTO;
    }


}
