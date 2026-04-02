package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SubscriptionDTO;

@Repository
public class SubscriptionDAOImpl extends BaseDAOImpl<SubscriptionDTO> implements SubscriptionDAOInt{

	@Override
	public Class<SubscriptionDTO> getDTOClass() {
		return SubscriptionDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SubscriptionDTO dto, CriteriaBuilder builder,
			Root<SubscriptionDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPlanId())) {
			whereCondition.add(builder.like(qRoot.get("planId"), dto.getPlanId() + "%"));
		}
		return whereCondition;
	}

}
