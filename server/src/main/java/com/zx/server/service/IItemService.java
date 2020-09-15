package com.zx.server.service;

import com.zx.model.entity.ItemKill;

import java.util.List;


public interface IItemService {
    List<ItemKill> getKillItems() throws Exception;

    ItemKill getKillDetail(Integer id) throws Exception;
}
