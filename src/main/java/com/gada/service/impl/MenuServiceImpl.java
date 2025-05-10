package com.gada.service.impl;

import com.gada.dao.MenuDao;
import com.gada.model.Menu;
import com.gada.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> get() {

        List<Menu> menuList = menuDao.findAll();
        log.info("menu: {}", menuList.size());

        return menuList;
    }
}
