package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdcShiftLeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcShiftLeaveExample() {
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

        public Criteria andXidIsNull() {
            addCriterion("XID is null");
            return (Criteria) this;
        }

        public Criteria andXidIsNotNull() {
            addCriterion("XID is not null");
            return (Criteria) this;
        }

        public Criteria andXidEqualTo(Long value) {
            addCriterion("XID =", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidNotEqualTo(Long value) {
            addCriterion("XID <>", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidGreaterThan(Long value) {
            addCriterion("XID >", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidGreaterThanOrEqualTo(Long value) {
            addCriterion("XID >=", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidLessThan(Long value) {
            addCriterion("XID <", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidLessThanOrEqualTo(Long value) {
            addCriterion("XID <=", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidIn(List<Long> values) {
            addCriterion("XID in", values, "xid");
            return (Criteria) this;
        }

        public Criteria andXidNotIn(List<Long> values) {
            addCriterion("XID not in", values, "xid");
            return (Criteria) this;
        }

        public Criteria andXidBetween(Long value1, Long value2) {
            addCriterion("XID between", value1, value2, "xid");
            return (Criteria) this;
        }

        public Criteria andXidNotBetween(Long value1, Long value2) {
            addCriterion("XID not between", value1, value2, "xid");
            return (Criteria) this;
        }

        public Criteria andAdcDateIsNull() {
            addCriterion("ADC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAdcDateIsNotNull() {
            addCriterion("ADC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAdcDateEqualTo(Date value) {
            addCriterion("ADC_DATE =", value, "adcDate");
            return (Criteria) this;
        }

        public Criteria andAdcDateNotEqualTo(Date value) {
            addCriterion("ADC_DATE <>", value, "adcDate");
            return (Criteria) this;
        }

        public Criteria andAdcDateGreaterThan(Date value) {
            addCriterion("ADC_DATE >", value, "adcDate");
            return (Criteria) this;
        }

        public Criteria andAdcDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ADC_DATE >=", value, "adcDate");
            return (Criteria) this;
        }

        public Criteria andAdcDateLessThan(Date value) {
            addCriterion("ADC_DATE <", value, "adcDate");
            return (Criteria) this;
        }

        public Criteria andAdcDateLessThanOrEqualTo(Date value) {
            addCriterion("ADC_DATE <=", value, "adcDate");
            return (Criteria) this;
        }

        public Criteria andAdcDateIn(List<Date> values) {
            addCriterion("ADC_DATE in", values, "adcDate");
            return (Criteria) this;
        }

        public Criteria andAdcDateNotIn(List<Date> values) {
            addCriterion("ADC_DATE not in", values, "adcDate");
            return (Criteria) this;
        }

        public Criteria andAdcDateBetween(Date value1, Date value2) {
            addCriterion("ADC_DATE between", value1, value2, "adcDate");
            return (Criteria) this;
        }

        public Criteria andAdcDateNotBetween(Date value1, Date value2) {
            addCriterion("ADC_DATE not between", value1, value2, "adcDate");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Long value) {
            addCriterion("DEPTID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Long value) {
            addCriterion("DEPTID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Long value) {
            addCriterion("DEPTID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPTID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Long value) {
            addCriterion("DEPTID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Long value) {
            addCriterion("DEPTID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Long> values) {
            addCriterion("DEPTID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Long> values) {
            addCriterion("DEPTID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Long value1, Long value2) {
            addCriterion("DEPTID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Long value1, Long value2) {
            addCriterion("DEPTID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("EMPID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Long value) {
            addCriterion("EMPID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Long value) {
            addCriterion("EMPID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Long value) {
            addCriterion("EMPID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Long value) {
            addCriterion("EMPID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Long value) {
            addCriterion("EMPID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Long value) {
            addCriterion("EMPID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Long> values) {
            addCriterion("EMPID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Long> values) {
            addCriterion("EMPID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Long value1, Long value2) {
            addCriterion("EMPID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Long value1, Long value2) {
            addCriterion("EMPID not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andAdcIdIsNull() {
            addCriterion("ADC_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdcIdIsNotNull() {
            addCriterion("ADC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdcIdEqualTo(String value) {
            addCriterion("ADC_ID =", value, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdNotEqualTo(String value) {
            addCriterion("ADC_ID <>", value, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdGreaterThan(String value) {
            addCriterion("ADC_ID >", value, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdGreaterThanOrEqualTo(String value) {
            addCriterion("ADC_ID >=", value, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdLessThan(String value) {
            addCriterion("ADC_ID <", value, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdLessThanOrEqualTo(String value) {
            addCriterion("ADC_ID <=", value, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdLike(String value) {
            addCriterion("ADC_ID like", value, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdNotLike(String value) {
            addCriterion("ADC_ID not like", value, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdIn(List<String> values) {
            addCriterion("ADC_ID in", values, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdNotIn(List<String> values) {
            addCriterion("ADC_ID not in", values, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdBetween(String value1, String value2) {
            addCriterion("ADC_ID between", value1, value2, "adcId");
            return (Criteria) this;
        }

        public Criteria andAdcIdNotBetween(String value1, String value2) {
            addCriterion("ADC_ID not between", value1, value2, "adcId");
            return (Criteria) this;
        }

        public Criteria andShiftIdIsNull() {
            addCriterion("SHIFT_ID is null");
            return (Criteria) this;
        }

        public Criteria andShiftIdIsNotNull() {
            addCriterion("SHIFT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShiftIdEqualTo(String value) {
            addCriterion("SHIFT_ID =", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotEqualTo(String value) {
            addCriterion("SHIFT_ID <>", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdGreaterThan(String value) {
            addCriterion("SHIFT_ID >", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFT_ID >=", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLessThan(String value) {
            addCriterion("SHIFT_ID <", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLessThanOrEqualTo(String value) {
            addCriterion("SHIFT_ID <=", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLike(String value) {
            addCriterion("SHIFT_ID like", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotLike(String value) {
            addCriterion("SHIFT_ID not like", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdIn(List<String> values) {
            addCriterion("SHIFT_ID in", values, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotIn(List<String> values) {
            addCriterion("SHIFT_ID not in", values, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdBetween(String value1, String value2) {
            addCriterion("SHIFT_ID between", value1, value2, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotBetween(String value1, String value2) {
            addCriterion("SHIFT_ID not between", value1, value2, "shiftId");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoIsNull() {
            addCriterion("ADDITION_INFO is null");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoIsNotNull() {
            addCriterion("ADDITION_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoEqualTo(String value) {
            addCriterion("ADDITION_INFO =", value, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoNotEqualTo(String value) {
            addCriterion("ADDITION_INFO <>", value, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoGreaterThan(String value) {
            addCriterion("ADDITION_INFO >", value, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ADDITION_INFO >=", value, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoLessThan(String value) {
            addCriterion("ADDITION_INFO <", value, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoLessThanOrEqualTo(String value) {
            addCriterion("ADDITION_INFO <=", value, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoLike(String value) {
            addCriterion("ADDITION_INFO like", value, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoNotLike(String value) {
            addCriterion("ADDITION_INFO not like", value, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoIn(List<String> values) {
            addCriterion("ADDITION_INFO in", values, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoNotIn(List<String> values) {
            addCriterion("ADDITION_INFO not in", values, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoBetween(String value1, String value2) {
            addCriterion("ADDITION_INFO between", value1, value2, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionInfoNotBetween(String value1, String value2) {
            addCriterion("ADDITION_INFO not between", value1, value2, "additionInfo");
            return (Criteria) this;
        }

        public Criteria andAffDaysIsNull() {
            addCriterion("AFF_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andAffDaysIsNotNull() {
            addCriterion("AFF_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andAffDaysEqualTo(Double value) {
            addCriterion("AFF_DAYS =", value, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffDaysNotEqualTo(Double value) {
            addCriterion("AFF_DAYS <>", value, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffDaysGreaterThan(Double value) {
            addCriterion("AFF_DAYS >", value, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffDaysGreaterThanOrEqualTo(Double value) {
            addCriterion("AFF_DAYS >=", value, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffDaysLessThan(Double value) {
            addCriterion("AFF_DAYS <", value, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffDaysLessThanOrEqualTo(Double value) {
            addCriterion("AFF_DAYS <=", value, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffDaysIn(List<Double> values) {
            addCriterion("AFF_DAYS in", values, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffDaysNotIn(List<Double> values) {
            addCriterion("AFF_DAYS not in", values, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffDaysBetween(Double value1, Double value2) {
            addCriterion("AFF_DAYS between", value1, value2, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffDaysNotBetween(Double value1, Double value2) {
            addCriterion("AFF_DAYS not between", value1, value2, "affDays");
            return (Criteria) this;
        }

        public Criteria andAffHoursIsNull() {
            addCriterion("AFF_HOURS is null");
            return (Criteria) this;
        }

        public Criteria andAffHoursIsNotNull() {
            addCriterion("AFF_HOURS is not null");
            return (Criteria) this;
        }

        public Criteria andAffHoursEqualTo(Double value) {
            addCriterion("AFF_HOURS =", value, "affHours");
            return (Criteria) this;
        }

        public Criteria andAffHoursNotEqualTo(Double value) {
            addCriterion("AFF_HOURS <>", value, "affHours");
            return (Criteria) this;
        }

        public Criteria andAffHoursGreaterThan(Double value) {
            addCriterion("AFF_HOURS >", value, "affHours");
            return (Criteria) this;
        }

        public Criteria andAffHoursGreaterThanOrEqualTo(Double value) {
            addCriterion("AFF_HOURS >=", value, "affHours");
            return (Criteria) this;
        }

        public Criteria andAffHoursLessThan(Double value) {
            addCriterion("AFF_HOURS <", value, "affHours");
            return (Criteria) this;
        }

        public Criteria andAffHoursLessThanOrEqualTo(Double value) {
            addCriterion("AFF_HOURS <=", value, "affHours");
            return (Criteria) this;
        }

        public Criteria andAffHoursIn(List<Double> values) {
            addCriterion("AFF_HOURS in", values, "affHours");
            return (Criteria) this;
        }

        public Criteria andAffHoursNotIn(List<Double> values) {
            addCriterion("AFF_HOURS not in", values, "affHours");
            return (Criteria) this;
        }

        public Criteria andAffHoursBetween(Double value1, Double value2) {
            addCriterion("AFF_HOURS between", value1, value2, "affHours");
            return (Criteria) this;
        }

        public Criteria andAffHoursNotBetween(Double value1, Double value2) {
            addCriterion("AFF_HOURS not between", value1, value2, "affHours");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNull() {
            addCriterion("REQUESTID is null");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNotNull() {
            addCriterion("REQUESTID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestidEqualTo(Long value) {
            addCriterion("REQUESTID =", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotEqualTo(Long value) {
            addCriterion("REQUESTID <>", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThan(Long value) {
            addCriterion("REQUESTID >", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThanOrEqualTo(Long value) {
            addCriterion("REQUESTID >=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThan(Long value) {
            addCriterion("REQUESTID <", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThanOrEqualTo(Long value) {
            addCriterion("REQUESTID <=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidIn(List<Long> values) {
            addCriterion("REQUESTID in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotIn(List<Long> values) {
            addCriterion("REQUESTID not in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidBetween(Long value1, Long value2) {
            addCriterion("REQUESTID between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotBetween(Long value1, Long value2) {
            addCriterion("REQUESTID not between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("SOURCE_TYPE =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("SOURCE_TYPE <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("SOURCE_TYPE >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("SOURCE_TYPE <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("SOURCE_TYPE like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("SOURCE_TYPE not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("SOURCE_TYPE in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("SOURCE_TYPE not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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