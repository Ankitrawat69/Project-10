package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CateringDAOInt;
import com.rays.dto.CateringDTO;

@Service
@Transactional
public class CateringServiceImpl extends BaseServiceImpl<CateringDTO,CateringDAOInt> implements CateringServiceInt {

}
