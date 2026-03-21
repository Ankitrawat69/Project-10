package com.rays.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ScheduleDTO;

@Repository
public class ScheduleDAOImpl extends BaseDAOImpl<ScheduleDTO> implements ScheduleDAOInt {

	@Override
	public Class<ScheduleDTO> getDTOClass() {
		return ScheduleDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ScheduleDTO dto, CriteriaBuilder builder, Root<ScheduleDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getScheduleName())) {

			whereCondition.add(builder.like(qRoot.get("ScheduleName"), dto.getScheduleName() + "%"));
		}
		return whereCondition;
	}

}
