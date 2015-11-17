package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.List;

public class DeptemplExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptemplExample() {
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

        public Criteria andDeptnameIsNull() {
            addCriterion("DEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("DEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("DEPTNAME =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("DEPTNAME <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("DEPTNAME >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTNAME >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("DEPTNAME <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("DEPTNAME <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("DEPTNAME like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("DEPTNAME not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("DEPTNAME in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("DEPTNAME not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("DEPTNAME between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("DEPTNAME not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andZbzwidIsNull() {
            addCriterion("ZBZWID is null");
            return (Criteria) this;
        }

        public Criteria andZbzwidIsNotNull() {
            addCriterion("ZBZWID is not null");
            return (Criteria) this;
        }

        public Criteria andZbzwidEqualTo(Integer value) {
            addCriterion("ZBZWID =", value, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andZbzwidNotEqualTo(Integer value) {
            addCriterion("ZBZWID <>", value, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andZbzwidGreaterThan(Integer value) {
            addCriterion("ZBZWID >", value, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andZbzwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZBZWID >=", value, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andZbzwidLessThan(Integer value) {
            addCriterion("ZBZWID <", value, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andZbzwidLessThanOrEqualTo(Integer value) {
            addCriterion("ZBZWID <=", value, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andZbzwidIn(List<Integer> values) {
            addCriterion("ZBZWID in", values, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andZbzwidNotIn(List<Integer> values) {
            addCriterion("ZBZWID not in", values, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andZbzwidBetween(Integer value1, Integer value2) {
            addCriterion("ZBZWID between", value1, value2, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andZbzwidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZBZWID not between", value1, value2, "zbzwid");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("JOBNAME is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("JOBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("JOBNAME =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("JOBNAME <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("JOBNAME >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("JOBNAME >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("JOBNAME <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("JOBNAME <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("JOBNAME like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("JOBNAME not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("JOBNAME in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("JOBNAME not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("JOBNAME between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("JOBNAME not between", value1, value2, "jobname");
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