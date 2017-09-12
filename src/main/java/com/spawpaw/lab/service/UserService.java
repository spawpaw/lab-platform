package com.spawpaw.lab.service;

import com.spawpaw.lab.common.controller.CommonResponseWithPageHelper;
import com.spawpaw.lab.dao.UserMapper;
import com.spawpaw.lab.entity.User;
import com.spawpaw.lab.entity.UserExample;
import com.spawpaw.lab.exception.UserNotFoundException;
import com.spawpaw.lab.exception.WrongPasswordException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
@RestController
@RequestMapping(path = "/user")
public class UserService {
    @Resource
    UserMapper userMapper;

    /**
     * 登录的接口
     */
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    User login(HttpSession session, @RequestBody User user) {
        //定义一个示例,让mybatis根据这个示例从数据库中查找用户
        UserExample example = new UserExample();
        example.or().andUsernameEqualTo(user.getUsername());

        //返回一个User类型的数组
        List<User> userInDatabase = userMapper.selectByExample(example);


        //先判断是否存在该用户
        if (userInDatabase == null || userInDatabase.size() < 1)
            throw new UserNotFoundException("登录失败,没有找到该用户");
        //判断密码是否正确
        if (!userInDatabase.get(0).getPassword().equals(user.getPassword()))
            throw new WrongPasswordException("登录失败,密码错误");

        return userInDatabase.get(0);
    }

    /**
     * 注册用户
     */
    @RequestMapping(path = "", method = RequestMethod.POST)
    void create(HttpSession session, @RequestBody User user) {
        userMapper.insert(user);
    }

    @RequestMapping(path = "", method = RequestMethod.PUT)
    void update(HttpSession session, @RequestBody User requestBody) {
        userMapper.updateByPrimaryKey(requestBody);
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    CommonResponseWithPageHelper<List<User>> getList(HttpSession session,
                                                     @RequestParam("currentPage") Integer currentPage,
                                                     @RequestParam("pageSize") Integer pageSize) {
        return null;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    User getById(HttpSession session, @PathVariable("id") Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    void delete(HttpSession session, @PathVariable("id") Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }


}
