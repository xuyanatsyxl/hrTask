package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdcShiftBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcShiftBasicExample() {
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

        public Criteria andBasicShiftNameIsNull() {
            addCriterion("BASIC_SHIFT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameIsNotNull() {
            addCriterion("BASIC_SHIFT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameEqualTo(String value) {
            addCriterion("BASIC_SHIFT_NAME =", value, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameNotEqualTo(String value) {
            addCriterion("BASIC_SHIFT_NAME <>", value, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameGreaterThan(String value) {
            addCriterion("BASIC_SHIFT_NAME >", value, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("BASIC_SHIFT_NAME >=", value, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameLessThan(String value) {
            addCriterion("BASIC_SHIFT_NAME <", value, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameLessThanOrEqualTo(String value) {
            addCriterion("BASIC_SHIFT_NAME <=", value, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameLike(String value) {
            addCriterion("BASIC_SHIFT_NAME like", value, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameNotLike(String value) {
            addCriterion("BASIC_SHIFT_NAME not like", value, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameIn(List<String> values) {
            addCriterion("BASIC_SHIFT_NAME in", values, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameNotIn(List<String> values) {
            addCriterion("BASIC_SHIFT_NAME not in", values, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameBetween(String value1, String value2) {
            addCriterion("BASIC_SHIFT_NAME between", value1, value2, "basicShiftName");
            return (Criteria) this;
        }

        public Criteria andBasicShiftNameNotBetween(String value1, String value2) {
            addCriterion("BASIC_SHIFT_NAME not between", value1, value2, "basicShiftName");
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

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("DEPTID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("DEPTID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("DEPTID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("DEPTID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("DEPTID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("DEPTID like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("DEPTID not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("DEPTID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("DEPTID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("DEPTID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("DEPTID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("WORK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("WORK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(String value) {
            addCriterion("WORK_TIME =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(String value) {
            addCriterion("WORK_TIME <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(String value) {
            addCriterion("WORK_TIME >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TIME >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(String value) {
            addCriterion("WORK_TIME <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("WORK_TIME <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLike(String value) {
            addCriterion("WORK_TIME like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotLike(String value) {
            addCriterion("WORK_TIME not like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<String> values) {
            addCriterion("WORK_TIME in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<String> values) {
            addCriterion("WORK_TIME not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(String value1, String value2) {
            addCriterion("WORK_TIME between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(String value1, String value2) {
            addCriterion("WORK_TIME not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNull() {
            addCriterion("OFF_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNotNull() {
            addCriterion("OFF_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOffTimeEqualTo(String value) {
            addCriterion("OFF_TIME =", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotEqualTo(String value) {
            addCriterion("OFF_TIME <>", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThan(String value) {
            addCriterion("OFF_TIME >", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OFF_TIME >=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThan(String value) {
            addCriterion("OFF_TIME <", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThanOrEqualTo(String value) {
            addCriterion("OFF_TIME <=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLike(String value) {
            addCriterion("OFF_TIME like", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotLike(String value) {
            addCriterion("OFF_TIME not like", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIn(List<String> values) {
            addCriterion("OFF_TIME in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotIn(List<String> values) {
            addCriterion("OFF_TIME not in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeBetween(String value1, String value2) {
            addCriterion("OFF_TIME between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotBetween(String value1, String value2) {
            addCriterion("OFF_TIME not between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andShiftTypeIsNull() {
            addCriterion("SHIFT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShiftTypeIsNotNull() {
            addCriterion("SHIFT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShiftTypeEqualTo(String value) {
            addCriterion("SHIFT_TYPE =", value, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeNotEqualTo(String value) {
            addCriterion("SHIFT_TYPE <>", value, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeGreaterThan(String value) {
            addCriterion("SHIFT_TYPE >", value, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFT_TYPE >=", value, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeLessThan(String value) {
            addCriterion("SHIFT_TYPE <", value, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeLessThanOrEqualTo(String value) {
            addCriterion("SHIFT_TYPE <=", value, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeLike(String value) {
            addCriterion("SHIFT_TYPE like", value, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeNotLike(String value) {
            addCriterion("SHIFT_TYPE not like", value, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeIn(List<String> values) {
            addCriterion("SHIFT_TYPE in", values, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeNotIn(List<String> values) {
            addCriterion("SHIFT_TYPE not in", values, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeBetween(String value1, String value2) {
            addCriterion("SHIFT_TYPE between", value1, value2, "shiftType");
            return (Criteria) this;
        }

        public Criteria andShiftTypeNotBetween(String value1, String value2) {
            addCriterion("SHIFT_TYPE not between", value1, value2, "shiftType");
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

        public Criteria andIntervalStartTimeIsNull() {
            addCriterion("INTERVAL_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeIsNotNull() {
            addCriterion("INTERVAL_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeEqualTo(String value) {
            addCriterion("INTERVAL_START_TIME =", value, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeNotEqualTo(String value) {
            addCriterion("INTERVAL_START_TIME <>", value, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeGreaterThan(String value) {
            addCriterion("INTERVAL_START_TIME >", value, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVAL_START_TIME >=", value, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeLessThan(String value) {
            addCriterion("INTERVAL_START_TIME <", value, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeLessThanOrEqualTo(String value) {
            addCriterion("INTERVAL_START_TIME <=", value, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeLike(String value) {
            addCriterion("INTERVAL_START_TIME like", value, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeNotLike(String value) {
            addCriterion("INTERVAL_START_TIME not like", value, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeIn(List<String> values) {
            addCriterion("INTERVAL_START_TIME in", values, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeNotIn(List<String> values) {
            addCriterion("INTERVAL_START_TIME not in", values, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeBetween(String value1, String value2) {
            addCriterion("INTERVAL_START_TIME between", value1, value2, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalStartTimeNotBetween(String value1, String value2) {
            addCriterion("INTERVAL_START_TIME not between", value1, value2, "intervalStartTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeIsNull() {
            addCriterion("INTERVAL_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeIsNotNull() {
            addCriterion("INTERVAL_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeEqualTo(String value) {
            addCriterion("INTERVAL_END_TIME =", value, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeNotEqualTo(String value) {
            addCriterion("INTERVAL_END_TIME <>", value, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeGreaterThan(String value) {
            addCriterion("INTERVAL_END_TIME >", value, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVAL_END_TIME >=", value, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeLessThan(String value) {
            addCriterion("INTERVAL_END_TIME <", value, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeLessThanOrEqualTo(String value) {
            addCriterion("INTERVAL_END_TIME <=", value, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeLike(String value) {
            addCriterion("INTERVAL_END_TIME like", value, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeNotLike(String value) {
            addCriterion("INTERVAL_END_TIME not like", value, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeIn(List<String> values) {
            addCriterion("INTERVAL_END_TIME in", values, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeNotIn(List<String> values) {
            addCriterion("INTERVAL_END_TIME not in", values, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeBetween(String value1, String value2) {
            addCriterion("INTERVAL_END_TIME between", value1, value2, "intervalEndTime");
            return (Criteria) this;
        }

        public Criteria andIntervalEndTimeNotBetween(String value1, String value2) {
            addCriterion("INTERVAL_END_TIME not between", value1, value2, "intervalEndTime");
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

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("ENABLED like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("ENABLED not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
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