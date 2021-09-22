package com.zcj.ddd.web.user;

import com.zcj.ddd.config.Swagger2Enum;
import io.swagger.annotations.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = Swagger2Enum.USER_TITLE)
@RestController
@RequestMapping("/user")
@Log4j2
public class UserController {

    @GetMapping("/selectUserById")
    @ApiOperation(value = "根据用户id查询用户")
    public String selectUserById(){
        return "zcj";
    }

    @GetMapping("/selectAllUser")
    @ApiOperation(value = "查询所有用户")
    public String selectAllUser(){
        return "zcj";
    }

    @GetMapping("/selectUserByCondition")
    @ApiOperation(value = "根据条件查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",dataType = "String",readOnly = true),
            @ApiImplicitParam(name = "sex",value = "性别",dataType = "String",readOnly = true),
    })
    public String selectUserByCondition(String username,String sex){
        int i = 1 / 0;
        log.error(username + sex);
        return username + sex;
    }

}
