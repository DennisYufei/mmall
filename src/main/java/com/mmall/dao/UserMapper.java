package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 检查用户名
     *
     * @param username 用户名
     * @return 条数
     */
    int checkUsername(String username);

    /**
     * 检查电邮
     *
     * @param eamil 电邮
     * @return 条数
     */
    int checkEmail(String eamil);

    /**
     * 判断是否登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户类
     */
    User selectLogin(@Param("username") String username, @Param("password") String password);

    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    /**
     * 忘记密码的重设密码
     */
    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);

    String selectQuestionByUsername(String username);

    int checkPassword(@Param("password") String password, @Param("userId") Integer userId);

    int checkEmailByUserId(@Param("email") String email, @Param("userId") Integer userId);
}