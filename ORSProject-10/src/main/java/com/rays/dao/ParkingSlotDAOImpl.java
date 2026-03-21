package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ParkingSlotDTO;

@Repository
public class ParkingSlotDAOImpl extends BaseDAOImpl<ParkingSlotDTO> implements ParkingSlotDAOInt {

	@Override
	public Class<ParkingSlotDTO> getDTOClass() {
		return ParkingSlotDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ParkingSlotDTO dto, CriteriaBuilder builder, Root<ParkingSlotDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getVehicleNumber())) {
			
			whereCondition.add(builder.like(qRoot.get("vehicleNumber"),dto.getVehicleNumber()+ "%"));
		}
		return whereCondition;
	}

}
