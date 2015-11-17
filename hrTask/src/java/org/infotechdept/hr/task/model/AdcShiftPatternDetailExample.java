package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.List;

public class AdcShiftPatternDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcShiftPatternDetailExample() {
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

        public Criteria andPositionIdIsNull() {
            addCriterion("POSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("POSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("POSITION_ID =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("POSITION_ID <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("POSITION_ID >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("POSITION_ID >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("POSITION_ID <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("POSITION_ID <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("POSITION_ID in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("POSITION_ID not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("POSITION_ID between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("POSITION_ID not between", value1, value2, "positionId");
            return (Criteria) this;
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

        public Criteria andSortNoIsNull() {
            addCriterion("SORT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("SORT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(String value) {
            addCriterion("SORT_NO =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(String value) {
            addCriterion("SORT_NO <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(String value) {
            addCriterion("SORT_NO >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(String value) {
            addCriterion("SORT_NO >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(String value) {
            addCriterion("SORT_NO <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(String value) {
            addCriterion("SORT_NO <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLike(String value) {
            addCriterion("SORT_NO like", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotLike(String value) {
            addCriterion("SORT_NO not like", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<String> values) {
            addCriterion("SORT_NO in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<String> values) {
            addCriterion("SORT_NO not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(String value1, String value2) {
            addCriterion("SORT_NO between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(String value1, String value2) {
            addCriterion("SORT_NO not between", value1, value2, "sortNo");
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