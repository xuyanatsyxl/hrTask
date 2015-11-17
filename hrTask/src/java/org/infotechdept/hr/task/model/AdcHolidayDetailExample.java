package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdcHolidayDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcHolidayDetailExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHCodeIsNull() {
            addCriterion("H_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHCodeIsNotNull() {
            addCriterion("H_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHCodeEqualTo(String value) {
            addCriterion("H_CODE =", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeNotEqualTo(String value) {
            addCriterion("H_CODE <>", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeGreaterThan(String value) {
            addCriterion("H_CODE >", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeGreaterThanOrEqualTo(String value) {
            addCriterion("H_CODE >=", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeLessThan(String value) {
            addCriterion("H_CODE <", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeLessThanOrEqualTo(String value) {
            addCriterion("H_CODE <=", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeLike(String value) {
            addCriterion("H_CODE like", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeNotLike(String value) {
            addCriterion("H_CODE not like", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeIn(List<String> values) {
            addCriterion("H_CODE in", values, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeNotIn(List<String> values) {
            addCriterion("H_CODE not in", values, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeBetween(String value1, String value2) {
            addCriterion("H_CODE between", value1, value2, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeNotBetween(String value1, String value2) {
            addCriterion("H_CODE not between", value1, value2, "hCode");
            return (Criteria) this;
        }

        public Criteria andHDateIsNull() {
            addCriterion("H_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHDateIsNotNull() {
            addCriterion("H_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHDateEqualTo(Date value) {
            addCriterionForJDBCDate("H_DATE =", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("H_DATE <>", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateGreaterThan(Date value) {
            addCriterionForJDBCDate("H_DATE >", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("H_DATE >=", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateLessThan(Date value) {
            addCriterionForJDBCDate("H_DATE <", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("H_DATE <=", value, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateIn(List<Date> values) {
            addCriterionForJDBCDate("H_DATE in", values, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("H_DATE not in", values, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("H_DATE between", value1, value2, "hDate");
            return (Criteria) this;
        }

        public Criteria andHDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("H_DATE not between", value1, value2, "hDate");
            return (Criteria) this;
        }

        public Criteria andStringDateIsNull() {
            addCriterion("STRING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStringDateIsNotNull() {
            addCriterion("STRING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStringDateEqualTo(Date value) {
            addCriterionForJDBCDate("STRING_DATE =", value, "stringDate");
            return (Criteria) this;
        }

        public Criteria andStringDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STRING_DATE <>", value, "stringDate");
            return (Criteria) this;
        }

        public Criteria andStringDateGreaterThan(Date value) {
            addCriterionForJDBCDate("STRING_DATE >", value, "stringDate");
            return (Criteria) this;
        }

        public Criteria andStringDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STRING_DATE >=", value, "stringDate");
            return (Criteria) this;
        }

        public Criteria andStringDateLessThan(Date value) {
            addCriterionForJDBCDate("STRING_DATE <", value, "stringDate");
            return (Criteria) this;
        }

        public Criteria andStringDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STRING_DATE <=", value, "stringDate");
            return (Criteria) this;
        }

        public Criteria andStringDateIn(List<Date> values) {
            addCriterionForJDBCDate("STRING_DATE in", values, "stringDate");
            return (Criteria) this;
        }

        public Criteria andStringDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STRING_DATE not in", values, "stringDate");
            return (Criteria) this;
        }

        public Criteria andStringDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STRING_DATE between", value1, value2, "stringDate");
            return (Criteria) this;
        }

        public Criteria andStringDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STRING_DATE not between", value1, value2, "stringDate");
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