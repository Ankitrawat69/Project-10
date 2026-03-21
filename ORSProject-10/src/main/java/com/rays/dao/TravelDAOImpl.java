package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TravelDTO;

@Repository
public class TravelDAOImpl extends BaseDAOImpl<TravelDTO> implements TravelDAOInt {
	
	@Override
	public Class<TravelDTO> getDTOClass() {
		return TravelDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(TravelDTO dto, CriteriaBuilder builder, Root<TravelDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getTravelerName())) {

			whereCondition.add(builder.like(qRoot.get("travelerName"), dto.getTravelerName() + "%"));
		}
		
		if (!isEmptyString(dto.getDestination())) {
			
			whereCondition.add(builder.like(qRoot.get("destination"), dto.getDestination() + "%"));
		}
		return whereCondition;
	}

}
