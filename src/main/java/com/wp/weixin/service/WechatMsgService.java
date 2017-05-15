package com.wp.weixin.service;

import com.wp.weixin.entity.WechatMsg;
import com.wp.weixin.repository.WechatMsgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pengwan on 2017/5/15.
 */
@Service
public class WechatMsgService {
    @Autowired
    WechatMsgRepository wechatMsgRepository;
    public WechatMsg save(WechatMsg wechatMsg) {
        return wechatMsgRepository.save(wechatMsg);
    }
}
