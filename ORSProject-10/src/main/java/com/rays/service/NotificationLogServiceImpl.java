package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.NotificationLogDAOInt;
import com.rays.dto.NotificationLogDTO;

@Service
@Transactional
public class NotificationLogServiceImpl extends BaseServiceImpl<NotificationLogDTO, NotificationLogDAOInt> implements NotificationLogServiceInt {

}
