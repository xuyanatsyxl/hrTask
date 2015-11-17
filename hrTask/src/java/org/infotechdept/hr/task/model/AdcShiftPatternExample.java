package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdcShiftPatternExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcShiftPatternExample() {
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

        public Criteria andPatternIdIsNull() {
            addCriterion("PATTERN_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatternIdIsNotNull() {
            addCriterion("PATTERN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatternIdEqualTo(String value) {
            addCriterion("PATTERN_ID =", value, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdNotEqualTo(String value) {
            addCriterion("PATTERN_ID <>", value, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdGreaterThan(String value) {
            addCriterion("PATTERN_ID >", value, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdGreaterThanOrEqualTo(String value) {
            addCriterion("PATTERN_ID >=", value, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdLessThan(String value) {
            addCriterion("PATTERN_ID <", value, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdLessThanOrEqualTo(String value) {
            addCriterion("PATTERN_ID <=", value, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdLike(String value) {
            addCriterion("PATTERN_ID like", value, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdNotLike(String value) {
            addCriterion("PATTERN_ID not like", value, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdIn(List<String> values) {
            addCriterion("PATTERN_ID in", values, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdNotIn(List<String> values) {
            addCriterion("PATTERN_ID not in", values, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdBetween(String value1, String value2) {
            addCriterion("PATTERN_ID between", value1, value2, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternIdNotBetween(String value1, String value2) {
            addCriterion("PATTERN_ID not between", value1, value2, "patternId");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameIsNull() {
            addCriterion("PATTERN_SHIFT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameIsNotNull() {
            addCriterion("PATTERN_SHIFT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameEqualTo(String value) {
            addCriterion("PATTERN_SHIFT_NAME =", value, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameNotEqualTo(String value) {
            addCriterion("PATTERN_SHIFT_NAME <>", value, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameGreaterThan(String value) {
            addCriterion("PATTERN_SHIFT_NAME >", value, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("PATTERN_SHIFT_NAME >=", value, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameLessThan(String value) {
            addCriterion("PATTERN_SHIFT_NAME <", value, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameLessThanOrEqualTo(String value) {
            addCriterion("PATTERN_SHIFT_NAME <=", value, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameLike(String value) {
            addCriterion("PATTERN_SHIFT_NAME like", value, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameNotLike(String value) {
            addCriterion("PATTERN_SHIFT_NAME not like", value, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameIn(List<String> values) {
            addCriterion("PATTERN_SHIFT_NAME in", values, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameNotIn(List<String> values) {
            addCriterion("PATTERN_SHIFT_NAME not in", values, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameBetween(String value1, String value2) {
            addCriterion("PATTERN_SHIFT_NAME between", value1, value2, "patternShiftName");
            return (Criteria) this;
        }

        public Criteria andPatternShiftNameNotBetween(String value1, String value2) {
            addCriterion("PATTERN_SHIFT_NAME not between", value1, value2, "patternShiftName");
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

        public Criteria andRegularCycleIsNull() {
            addCriterion("REGULAR_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andRegularCycleIsNotNull() {
            addCriterion("REGULAR_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andRegularCycleEqualTo(String value) {
            addCriterion("REGULAR_CYCLE =", value, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleNotEqualTo(String value) {
            addCriterion("REGULAR_CYCLE <>", value, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleGreaterThan(String value) {
            addCriterion("REGULAR_CYCLE >", value, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleGreaterThanOrEqualTo(String value) {
            addCriterion("REGULAR_CYCLE >=", value, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleLessThan(String value) {
            addCriterion("REGULAR_CYCLE <", value, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleLessThanOrEqualTo(String value) {
            addCriterion("REGULAR_CYCLE <=", value, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleLike(String value) {
            addCriterion("REGULAR_CYCLE like", value, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleNotLike(String value) {
            addCriterion("REGULAR_CYCLE not like", value, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleIn(List<String> values) {
            addCriterion("REGULAR_CYCLE in", values, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleNotIn(List<String> values) {
            addCriterion("REGULAR_CYCLE not in", values, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleBetween(String value1, String value2) {
            addCriterion("REGULAR_CYCLE between", value1, value2, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleNotBetween(String value1, String value2) {
            addCriterion("REGULAR_CYCLE not between", value1, value2, "regularCycle");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitIsNull() {
            addCriterion("REGULAR_CYCLE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitIsNotNull() {
            addCriterion("REGULAR_CYCLE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitEqualTo(String value) {
            addCriterion("REGULAR_CYCLE_UNIT =", value, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitNotEqualTo(String value) {
            addCriterion("REGULAR_CYCLE_UNIT <>", value, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitGreaterThan(String value) {
            addCriterion("REGULAR_CYCLE_UNIT >", value, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitGreaterThanOrEqualTo(String value) {
            addCriterion("REGULAR_CYCLE_UNIT >=", value, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitLessThan(String value) {
            addCriterion("REGULAR_CYCLE_UNIT <", value, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitLessThanOrEqualTo(String value) {
            addCriterion("REGULAR_CYCLE_UNIT <=", value, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitLike(String value) {
            addCriterion("REGULAR_CYCLE_UNIT like", value, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitNotLike(String value) {
            addCriterion("REGULAR_CYCLE_UNIT not like", value, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitIn(List<String> values) {
            addCriterion("REGULAR_CYCLE_UNIT in", values, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitNotIn(List<String> values) {
            addCriterion("REGULAR_CYCLE_UNIT not in", values, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitBetween(String value1, String value2) {
            addCriterion("REGULAR_CYCLE_UNIT between", value1, value2, "regularCycleUnit");
            return (Criteria) this;
        }

        public Criteria andRegularCycleUnitNotBetween(String value1, String value2) {
            addCriterion("REGULAR_CYCLE_UNIT not between", value1, value2, "regularCycleUnit");
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