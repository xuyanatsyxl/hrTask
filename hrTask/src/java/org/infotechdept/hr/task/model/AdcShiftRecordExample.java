package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdcShiftRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcShiftRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRecIdIsNull() {
            addCriterion("REC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("REC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Long value) {
            addCriterion("REC_ID =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Long value) {
            addCriterion("REC_ID <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Long value) {
            addCriterion("REC_ID >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REC_ID >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Long value) {
            addCriterion("REC_ID <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Long value) {
            addCriterion("REC_ID <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Long> values) {
            addCriterion("REC_ID in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Long> values) {
            addCriterion("REC_ID not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Long value1, Long value2) {
            addCriterion("REC_ID between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Long value1, Long value2) {
            addCriterion("REC_ID not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("APPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("APPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Long value) {
            addCriterion("APPLY_ID =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Long value) {
            addCriterion("APPLY_ID <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Long value) {
            addCriterion("APPLY_ID >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLY_ID >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Long value) {
            addCriterion("APPLY_ID <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Long value) {
            addCriterion("APPLY_ID <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Long> values) {
            addCriterion("APPLY_ID in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Long> values) {
            addCriterion("APPLY_ID not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Long value1, Long value2) {
            addCriterion("APPLY_ID between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Long value1, Long value2) {
            addCriterion("APPLY_ID not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andInitDateIsNull() {
            addCriterion("INIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInitDateIsNotNull() {
            addCriterion("INIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInitDateEqualTo(Date value) {
            addCriterionForJDBCDate("INIT_DATE =", value, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("INIT_DATE <>", value, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("INIT_DATE >", value, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INIT_DATE >=", value, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitDateLessThan(Date value) {
            addCriterionForJDBCDate("INIT_DATE <", value, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INIT_DATE <=", value, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitDateIn(List<Date> values) {
            addCriterionForJDBCDate("INIT_DATE in", values, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("INIT_DATE not in", values, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INIT_DATE between", value1, value2, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INIT_DATE not between", value1, value2, "initDate");
            return (Criteria) this;
        }

        public Criteria andInitPositionIsNull() {
            addCriterion("INIT_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andInitPositionIsNotNull() {
            addCriterion("INIT_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andInitPositionEqualTo(Integer value) {
            addCriterion("INIT_POSITION =", value, "initPosition");
            return (Criteria) this;
        }

        public Criteria andInitPositionNotEqualTo(Integer value) {
            addCriterion("INIT_POSITION <>", value, "initPosition");
            return (Criteria) this;
        }

        public Criteria andInitPositionGreaterThan(Integer value) {
            addCriterion("INIT_POSITION >", value, "initPosition");
            return (Criteria) this;
        }

        public Criteria andInitPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("INIT_POSITION >=", value, "initPosition");
            return (Criteria) this;
        }

        public Criteria andInitPositionLessThan(Integer value) {
            addCriterion("INIT_POSITION <", value, "initPosition");
            return (Criteria) this;
        }

        public Criteria andInitPositionLessThanOrEqualTo(Integer value) {
            addCriterion("INIT_POSITION <=", value, "initPosition");
            return (Criteria) this;
        }

        public Criteria andInitPositionIn(List<Integer> values) {
            addCriterion("INIT_POSITION in", values, "initPosition");
            return (Criteria) this;
        }

        public Criteria andInitPositionNotIn(List<Integer> values) {
            addCriterion("INIT_POSITION not in", values, "initPosition");
            return (Criteria) this;
        }

        public Criteria andInitPositionBetween(Integer value1, Integer value2) {
            addCriterion("INIT_POSITION between", value1, value2, "initPosition");
            return (Criteria) this;
        }

        public Criteria andInitPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("INIT_POSITION not between", value1, value2, "initPosition");
            return (Criteria) this;
        }

        public Criteria andHoliableIsNull() {
            addCriterion("HOLIABLE is null");
            return (Criteria) this;
        }

        public Criteria andHoliableIsNotNull() {
            addCriterion("HOLIABLE is not null");
            return (Criteria) this;
        }

        public Criteria andHoliableEqualTo(String value) {
            addCriterion("HOLIABLE =", value, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableNotEqualTo(String value) {
            addCriterion("HOLIABLE <>", value, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableGreaterThan(String value) {
            addCriterion("HOLIABLE >", value, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableGreaterThanOrEqualTo(String value) {
            addCriterion("HOLIABLE >=", value, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableLessThan(String value) {
            addCriterion("HOLIABLE <", value, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableLessThanOrEqualTo(String value) {
            addCriterion("HOLIABLE <=", value, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableLike(String value) {
            addCriterion("HOLIABLE like", value, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableNotLike(String value) {
            addCriterion("HOLIABLE not like", value, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableIn(List<String> values) {
            addCriterion("HOLIABLE in", values, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableNotIn(List<String> values) {
            addCriterion("HOLIABLE not in", values, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableBetween(String value1, String value2) {
            addCriterion("HOLIABLE between", value1, value2, "holiable");
            return (Criteria) this;
        }

        public Criteria andHoliableNotBetween(String value1, String value2) {
            addCriterion("HOLIABLE not between", value1, value2, "holiable");
            return (Criteria) this;
        }

        public Criteria andValidStartDateIsNull() {
            addCriterion("VALID_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andValidStartDateIsNotNull() {
            addCriterion("VALID_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidStartDateEqualTo(Date value) {
            addCriterion("VALID_START_DATE =", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateNotEqualTo(Date value) {
            addCriterion("VALID_START_DATE <>", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateGreaterThan(Date value) {
            addCriterion("VALID_START_DATE >", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VALID_START_DATE >=", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateLessThan(Date value) {
            addCriterion("VALID_START_DATE <", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateLessThanOrEqualTo(Date value) {
            addCriterion("VALID_START_DATE <=", value, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateIn(List<Date> values) {
            addCriterion("VALID_START_DATE in", values, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateNotIn(List<Date> values) {
            addCriterion("VALID_START_DATE not in", values, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateBetween(Date value1, Date value2) {
            addCriterion("VALID_START_DATE between", value1, value2, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andValidStartDateNotBetween(Date value1, Date value2) {
            addCriterion("VALID_START_DATE not between", value1, value2, "validStartDate");
            return (Criteria) this;
        }

        public Criteria andRecStateIsNull() {
            addCriterion("REC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRecStateIsNotNull() {
            addCriterion("REC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecStateEqualTo(String value) {
            addCriterion("REC_STATE =", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateNotEqualTo(String value) {
            addCriterion("REC_STATE <>", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateGreaterThan(String value) {
            addCriterion("REC_STATE >", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateGreaterThanOrEqualTo(String value) {
            addCriterion("REC_STATE >=", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateLessThan(String value) {
            addCriterion("REC_STATE <", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateLessThanOrEqualTo(String value) {
            addCriterion("REC_STATE <=", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateLike(String value) {
            addCriterion("REC_STATE like", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateNotLike(String value) {
            addCriterion("REC_STATE not like", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateIn(List<String> values) {
            addCriterion("REC_STATE in", values, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateNotIn(List<String> values) {
            addCriterion("REC_STATE not in", values, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateBetween(String value1, String value2) {
            addCriterion("REC_STATE between", value1, value2, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateNotBetween(String value1, String value2) {
            addCriterion("REC_STATE not between", value1, value2, "recState");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME not between", value1, value2, "operateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}