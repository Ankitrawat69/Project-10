package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ScheduleDAOInt;
import com.rays.dto.ScheduleDTO;

@Service
@Transactional
public class ScheduleServiceImpl extends BaseServiceImpl<ScheduleDTO, ScheduleDAOInt> implements ScheduleServiceInt {

}
