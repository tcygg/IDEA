package com.fzy.pms.web.controller;

import com.fzy.pms.entity.dto.MenuDto;
import com.fzy.pms.entity.rest.Result;
import com.fzy.pms.entity.security.Menu;
import com.fzy.pms.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @program: MenuController
 * @description:
 * @author: fzy
 * @date: 2019-03-30 21:10
 **/
@RestController
@RequestMapping("/menus")
@Api(value = "菜单接口",description = "菜单相关的接口")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping
    @ApiOperation(value = "添加菜单",notes = "添加菜单")
    public Result create(@Validated @RequestBody Menu menu){
        MenuDto menuDTO = menuService.create(menu);
        return Result.success(menuDTO);
    }

    @PutMapping
    @ApiOperation(value = "修改菜单",notes = "修改菜单")
    public Result update(@Validated(Menu.Update.class) @RequestBody Menu menu){
            menuService.update(menu);
        return Result.success();
    }

    @DeleteMapping("{id:\\d+}")
    @ApiOperation(value = "删除菜单",notes = "根据id 删除菜单")
    public Result deleteMenu(@PathVariable Long id){
        menuService.delete(id);
        return Result.success();
    }

    @GetMapping("/menuList")
    @ApiOperation(value = "查询当前用户菜单列表",notes = "查询当前用户菜单列表")
    public Result getCurrMenuList(){
        return Result.success(menuService.getCurrMenuTree());
    }

    @GetMapping("/findAllMenus")
    @ApiOperation(value = "查询全部菜单列表",notes = "查询全部菜单列表")
    public Result findAllMenus(){
        return Result.success(menuService.findAllByMenuTree());
    }

}
