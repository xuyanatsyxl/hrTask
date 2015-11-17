package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.List;

public class AdcShiftStafferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcShiftStafferExample() {
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

        public Criteria andRecordTypeIsNull() {
            addCriterion("RECORD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNotNull() {
            addCriterion("RECORD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeEqualTo(String value) {
            addCriterion("RECORD_TYPE =", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotEqualTo(String value) {
            addCriterion("RECORD_TYPE <>", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThan(String value) {
            addCriterion("RECORD_TYPE >", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_TYPE >=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThan(String value) {
            addCriterion("RECORD_TYPE <", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThanOrEqualTo(String value) {
            addCriterion("RECORD_TYPE <=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLike(String value) {
            addCriterion("RECORD_TYPE like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotLike(String value) {
            addCriterion("RECORD_TYPE not like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIn(List<String> values) {
            addCriterion("RECORD_TYPE in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotIn(List<String> values) {
            addCriterion("RECORD_TYPE not in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeBetween(String value1, String value2) {
            addCriterion("RECORD_TYPE between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotBetween(String value1, String value2) {
            addCriterion("RECORD_TYPE not between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordNameIsNull() {
            addCriterion("RECORD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRecordNameIsNotNull() {
            addCriterion("RECORD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRecordNameEqualTo(String value) {
            addCriterion("RECORD_NAME =", value, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameNotEqualTo(String value) {
            addCriterion("RECORD_NAME <>", value, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameGreaterThan(String value) {
            addCriterion("RECORD_NAME >", value, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_NAME >=", value, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameLessThan(String value) {
            addCriterion("RECORD_NAME <", value, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameLessThanOrEqualTo(String value) {
            addCriterion("RECORD_NAME <=", value, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameLike(String value) {
            addCriterion("RECORD_NAME like", value, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameNotLike(String value) {
            addCriterion("RECORD_NAME not like", value, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameIn(List<String> values) {
            addCriterion("RECORD_NAME in", values, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameNotIn(List<String> values) {
            addCriterion("RECORD_NAME not in", values, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameBetween(String value1, String value2) {
            addCriterion("RECORD_NAME between", value1, value2, "recordName");
            return (Criteria) this;
        }

        public Criteria andRecordNameNotBetween(String value1, String value2) {
            addCriterion("RECORD_NAME not between", value1, value2, "recordName");
            return (Criteria) this;
        }

        public Criteria andProcClassIsNull() {
            addCriterion("PROC_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andProcClassIsNotNull() {
            addCriterion("PROC_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andProcClassEqualTo(String value) {
            addCriterion("PROC_CLASS =", value, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassNotEqualTo(String value) {
            addCriterion("PROC_CLASS <>", value, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassGreaterThan(String value) {
            addCriterion("PROC_CLASS >", value, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_CLASS >=", value, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassLessThan(String value) {
            addCriterion("PROC_CLASS <", value, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassLessThanOrEqualTo(String value) {
            addCriterion("PROC_CLASS <=", value, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassLike(String value) {
            addCriterion("PROC_CLASS like", value, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassNotLike(String value) {
            addCriterion("PROC_CLASS not like", value, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassIn(List<String> values) {
            addCriterion("PROC_CLASS in", values, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassNotIn(List<String> values) {
            addCriterion("PROC_CLASS not in", values, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassBetween(String value1, String value2) {
            addCriterion("PROC_CLASS between", value1, value2, "procClass");
            return (Criteria) this;
        }

        public Criteria andProcClassNotBetween(String value1, String value2) {
            addCriterion("PROC_CLASS not between", value1, value2, "procClass");
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