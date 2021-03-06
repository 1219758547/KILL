package com.zx.server.service.impl;

import com.zx.model.entity.ItemKill;
import com.zx.model.mapper.ItemKillMapper;
import com.zx.server.service.IItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemService implements IItemService {

    private static final Logger log = LoggerFactory.getLogger(ItemService.class);


    @Autowired(required = false)
    private ItemKillMapper itemKillMapper;

    /**
     * 获取待秒杀商品列表
     * @return
     * @throws Exception
     */
    @Override
    public List<ItemKill> getKillItems() throws Exception {
        return itemKillMapper.selectAll();
    }

    @Override
    public ItemKill getKillDetail(Integer id) throws Exception {
        ItemKill entity = itemKillMapper.selectById(id);
        if(entity == null){
            throw new Exception("获取秒杀商品详情-待秒杀商品记录不存在");
        }
        return entity;
    }

}
