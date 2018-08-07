package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.Map;

/**
 * @auther Dennis
 * @date 2018/8/7
 */
public interface IOrderService {

    ServerResponse pay(Long orderNo, Integer userId, String path);

    ServerResponse aliCallback(Map<String,String> params);

    ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);
}
