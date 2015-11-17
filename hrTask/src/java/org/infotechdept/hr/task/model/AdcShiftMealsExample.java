package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdcShiftMealsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcShiftMealsExample() {
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

        public Criteria andMealsDateIsNull() {
            addCriterion("MEALS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMealsDateIsNotNull() {
            addCriterion("MEALS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMealsDateEqualTo(Date value) {
            addCriterionForJDBCDate("MEALS_DATE =", value, "mealsDate");
            return (Criteria) this;
        }

        public Criteria andMealsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MEALS_DATE <>", value, "mealsDate");
            return (Criteria) this;
        }

        public Criteria andMealsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("MEALS_DATE >", value, "mealsDate");
            return (Criteria) this;
        }

        public Criteria andMealsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEALS_DATE >=", value, "mealsDate");
            return (Criteria) this;
        }

        public Criteria andMealsDateLessThan(Date value) {
            addCriterionForJDBCDate("MEALS_DATE <", value, "mealsDate");
            return (Criteria) this;
        }

        public Criteria andMealsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MEALS_DATE <=", value, "mealsDate");
            return (Criteria) this;
        }

        public Criteria andMealsDateIn(List<Date> values) {
            addCriterionForJDBCDate("MEALS_DATE in", values, "mealsDate");
            return (Criteria) this;
        }

        public Criteria andMealsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MEALS_DATE not in", values, "mealsDate");
            return (Criteria) this;
        }

        public Criteria andMealsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEALS_DATE between", value1, value2, "mealsDate");
            return (Criteria) this;
        }

        public Criteria andMealsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MEALS_DATE not between", value1, value2, "mealsDate");
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

        public Criteria andRoomIdIsNull() {
            addCriterion("ROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("ROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("ROOM_ID =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("ROOM_ID <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("ROOM_ID >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_ID >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("ROOM_ID <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("ROOM_ID <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("ROOM_ID like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("ROOM_ID not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("ROOM_ID in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("ROOM_ID not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("ROOM_ID between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("ROOM_ID not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andMealsTypeIsNull() {
            addCriterion("MEALS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMealsTypeIsNotNull() {
            addCriterion("MEALS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMealsTypeEqualTo(String value) {
            addCriterion("MEALS_TYPE =", value, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeNotEqualTo(String value) {
            addCriterion("MEALS_TYPE <>", value, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeGreaterThan(String value) {
            addCriterion("MEALS_TYPE >", value, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEALS_TYPE >=", value, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeLessThan(String value) {
            addCriterion("MEALS_TYPE <", value, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeLessThanOrEqualTo(String value) {
            addCriterion("MEALS_TYPE <=", value, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeLike(String value) {
            addCriterion("MEALS_TYPE like", value, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeNotLike(String value) {
            addCriterion("MEALS_TYPE not like", value, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeIn(List<String> values) {
            addCriterion("MEALS_TYPE in", values, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeNotIn(List<String> values) {
            addCriterion("MEALS_TYPE not in", values, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeBetween(String value1, String value2) {
            addCriterion("MEALS_TYPE between", value1, value2, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTypeNotBetween(String value1, String value2) {
            addCriterion("MEALS_TYPE not between", value1, value2, "mealsType");
            return (Criteria) this;
        }

        public Criteria andMealsTimesIsNull() {
            addCriterion("MEALS_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andMealsTimesIsNotNull() {
            addCriterion("MEALS_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andMealsTimesEqualTo(Integer value) {
            addCriterion("MEALS_TIMES =", value, "mealsTimes");
            return (Criteria) this;
        }

        public Criteria andMealsTimesNotEqualTo(Integer value) {
            addCriterion("MEALS_TIMES <>", value, "mealsTimes");
            return (Criteria) this;
        }

        public Criteria andMealsTimesGreaterThan(Integer value) {
            addCriterion("MEALS_TIMES >", value, "mealsTimes");
            return (Criteria) this;
        }

        public Criteria andMealsTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEALS_TIMES >=", value, "mealsTimes");
            return (Criteria) this;
        }

        public Criteria andMealsTimesLessThan(Integer value) {
            addCriterion("MEALS_TIMES <", value, "mealsTimes");
            return (Criteria) this;
        }

        public Criteria andMealsTimesLessThanOrEqualTo(Integer value) {
            addCriterion("MEALS_TIMES <=", value, "mealsTimes");
            return (Criteria) this;
        }

        public Criteria andMealsTimesIn(List<Integer> values) {
            addCriterion("MEALS_TIMES in", values, "mealsTimes");
            return (Criteria) this;
        }

        public Criteria andMealsTimesNotIn(List<Integer> values) {
            addCriterion("MEALS_TIMES not in", values, "mealsTimes");
            return (Criteria) this;
        }

        public Criteria andMealsTimesBetween(Integer value1, Integer value2) {
            addCriterion("MEALS_TIMES between", value1, value2, "mealsTimes");
            return (Criteria) this;
        }

        public Criteria andMealsTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("MEALS_TIMES not between", value1, value2, "mealsTimes");
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