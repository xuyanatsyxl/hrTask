package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.List;

public class AdcDinnerRoomDkjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcDinnerRoomDkjExample() {
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

        public Criteria andDkjidIsNull() {
            addCriterion("DKJID is null");
            return (Criteria) this;
        }

        public Criteria andDkjidIsNotNull() {
            addCriterion("DKJID is not null");
            return (Criteria) this;
        }

        public Criteria andDkjidEqualTo(String value) {
            addCriterion("DKJID =", value, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidNotEqualTo(String value) {
            addCriterion("DKJID <>", value, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidGreaterThan(String value) {
            addCriterion("DKJID >", value, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidGreaterThanOrEqualTo(String value) {
            addCriterion("DKJID >=", value, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidLessThan(String value) {
            addCriterion("DKJID <", value, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidLessThanOrEqualTo(String value) {
            addCriterion("DKJID <=", value, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidLike(String value) {
            addCriterion("DKJID like", value, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidNotLike(String value) {
            addCriterion("DKJID not like", value, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidIn(List<String> values) {
            addCriterion("DKJID in", values, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidNotIn(List<String> values) {
            addCriterion("DKJID not in", values, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidBetween(String value1, String value2) {
            addCriterion("DKJID between", value1, value2, "dkjid");
            return (Criteria) this;
        }

        public Criteria andDkjidNotBetween(String value1, String value2) {
            addCriterion("DKJID not between", value1, value2, "dkjid");
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