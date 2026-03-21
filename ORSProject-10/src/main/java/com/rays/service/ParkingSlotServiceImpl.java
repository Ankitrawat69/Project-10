package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ParkingSlotDAOInt;
import com.rays.dto.ParkingSlotDTO;

@Service
@Transactional
public class ParkingSlotServiceImpl extends BaseServiceImpl<ParkingSlotDTO, ParkingSlotDAOInt> implements ParkingSlotServiceInt{

}
