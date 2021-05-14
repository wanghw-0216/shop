package com.zt.shop.service;

import com.github.pagehelper.PageInfo;
import com.zt.shop.entity.dto.GoodsInfoDTO;
import com.zt.shop.entity.dto.QueryDTO;

/**
 * @InterfaceName ShopService
 * @Description TODO
 * @Date 2021/5/13 16:42
 * @Version 1.0
 **/
public interface ShopService {
    PageInfo getGoodsList(QueryDTO dto);

    GoodsInfoDTO getGoodsDetail(Integer id);
}
