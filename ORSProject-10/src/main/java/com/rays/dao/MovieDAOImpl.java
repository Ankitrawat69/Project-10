package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MovieDTO;

@Repository
public class MovieDAOImpl extends BaseDAOImpl<MovieDTO> implements MovieDAOInt {

	@Override
	public Class<MovieDTO> getDTOClass() {
		return MovieDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(MovieDTO dto, CriteriaBuilder builder, Root<MovieDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getMovieTitle())) {

			whereCondition.add(builder.like(qRoot.get("movieTitle"), dto.getMovieTitle() + "%"));
		}

		if (!isEmptyString(dto.getReviewerName())) {

			whereCondition.add(builder.like(qRoot.get("reviewerName"), dto.getReviewerName() + "%"));
		}

		return whereCondition;
	}

}
