package com.wp.weixin.repository;

import com.wp.weixin.entity.WechatMsg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by pengwan on 2017/5/15.
 */
public interface WechatMsgRepository extends JpaRepository<WechatMsg, UUID> {
}
