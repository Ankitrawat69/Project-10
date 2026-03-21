package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.NotificationLogDTO;

@Repository
public class NotificationLogDAOImpl extends BaseDAOImpl<NotificationLogDTO> implements NotificationLogDAOInt {

    @Override
    public Class<NotificationLogDTO> getDTOClass() {
        return NotificationLogDTO.class;
    }

    @Override
    protected void populate(NotificationLogDTO dto, UserContext userContext) {
      
    }

    @Override
    protected List<Predicate> getWhereClause(NotificationLogDTO dto, CriteriaBuilder builder,
            Root<NotificationLogDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<Predicate>();

        if (!isEmptyString(dto.getLogCode())) {
            whereCondition.add(builder.like(qRoot.get("logCode"), dto.getLogCode() + "%"));
        }

        if (!isEmptyString(dto.getNotificationType())) {
            whereCondition.add(builder.like(qRoot.get("notificationType"), dto.getNotificationType() + "%"));
        }

        if (!isEmptyString(dto.getLogStatus())) {
            whereCondition.add(builder.like(qRoot.get("logStatus"), dto.getLogStatus() + "%"));
        }

        if (isNotNull(dto.getSentTime())) {
            whereCondition.add(builder.equal(qRoot.get("sentTime"), dto.getSentTime()));
        }

        return whereCondition;
    }
}