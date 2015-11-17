package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdcShiftExceptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcShiftExceptionExample() {
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

        public Criteria andExceptionDateIsNull() {
            addCriterion("EXCEPTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExceptionDateIsNotNull() {
            addCriterion("EXCEPTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionDateEqualTo(Date value) {
            addCriterionForJDBCDate("EXCEPTION_DATE =", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXCEPTION_DATE <>", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EXCEPTION_DATE >", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXCEPTION_DATE >=", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateLessThan(Date value) {
            addCriterionForJDBCDate("EXCEPTION_DATE <", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXCEPTION_DATE <=", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateIn(List<Date> values) {
            addCriterionForJDBCDate("EXCEPTION_DATE in", values, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXCEPTION_DATE not in", values, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXCEPTION_DATE between", value1, value2, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXCEPTION_DATE not between", value1, value2, "exceptionDate");
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andSchIdIsNull() {
            addCriterion("SCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchIdIsNotNull() {
            addCriterion("SCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchIdEqualTo(Long value) {
            addCriterion("SCH_ID =", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotEqualTo(Long value) {
            addCriterion("SCH_ID <>", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThan(Long value) {
            addCriterion("SCH_ID >", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SCH_ID >=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThan(Long value) {
            addCriterion("SCH_ID <", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThanOrEqualTo(Long value) {
            addCriterion("SCH_ID <=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdIn(List<Long> values) {
            addCriterion("SCH_ID in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotIn(List<Long> values) {
            addCriterion("SCH_ID not in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdBetween(Long value1, Long value2) {
            addCriterion("SCH_ID between", value1, value2, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotBetween(Long value1, Long value2) {
            addCriterion("SCH_ID not between", value1, value2, "schId");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldIsNull() {
            addCriterion("EXCEPTION_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldIsNotNull() {
            addCriterion("EXCEPTION_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldEqualTo(String value) {
            addCriterion("EXCEPTION_FIELD =", value, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldNotEqualTo(String value) {
            addCriterion("EXCEPTION_FIELD <>", value, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldGreaterThan(String value) {
            addCriterion("EXCEPTION_FIELD >", value, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_FIELD >=", value, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldLessThan(String value) {
            addCriterion("EXCEPTION_FIELD <", value, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_FIELD <=", value, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldLike(String value) {
            addCriterion("EXCEPTION_FIELD like", value, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldNotLike(String value) {
            addCriterion("EXCEPTION_FIELD not like", value, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldIn(List<String> values) {
            addCriterion("EXCEPTION_FIELD in", values, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldNotIn(List<String> values) {
            addCriterion("EXCEPTION_FIELD not in", values, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldBetween(String value1, String value2) {
            addCriterion("EXCEPTION_FIELD between", value1, value2, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andExceptionFieldNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_FIELD not between", value1, value2, "exceptionField");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("CHECK_TIME =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("CHECK_TIME <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("CHECK_TIME >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("CHECK_TIME <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("CHECK_TIME in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("CHECK_TIME not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeIsNull() {
            addCriterion("ACTUAL_CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeIsNotNull() {
            addCriterion("ACTUAL_CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeEqualTo(Date value) {
            addCriterion("ACTUAL_CHECK_TIME =", value, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeNotEqualTo(Date value) {
            addCriterion("ACTUAL_CHECK_TIME <>", value, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeGreaterThan(Date value) {
            addCriterion("ACTUAL_CHECK_TIME >", value, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_CHECK_TIME >=", value, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeLessThan(Date value) {
            addCriterion("ACTUAL_CHECK_TIME <", value, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_CHECK_TIME <=", value, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeIn(List<Date> values) {
            addCriterion("ACTUAL_CHECK_TIME in", values, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeNotIn(List<Date> values) {
            addCriterion("ACTUAL_CHECK_TIME not in", values, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_CHECK_TIME between", value1, value2, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andActualCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_CHECK_TIME not between", value1, value2, "actualCheckTime");
            return (Criteria) this;
        }

        public Criteria andProcStateIsNull() {
            addCriterion("PROC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andProcStateIsNotNull() {
            addCriterion("PROC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcStateEqualTo(String value) {
            addCriterion("PROC_STATE =", value, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateNotEqualTo(String value) {
            addCriterion("PROC_STATE <>", value, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateGreaterThan(String value) {
            addCriterion("PROC_STATE >", value, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_STATE >=", value, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateLessThan(String value) {
            addCriterion("PROC_STATE <", value, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateLessThanOrEqualTo(String value) {
            addCriterion("PROC_STATE <=", value, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateLike(String value) {
            addCriterion("PROC_STATE like", value, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateNotLike(String value) {
            addCriterion("PROC_STATE not like", value, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateIn(List<String> values) {
            addCriterion("PROC_STATE in", values, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateNotIn(List<String> values) {
            addCriterion("PROC_STATE not in", values, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateBetween(String value1, String value2) {
            addCriterion("PROC_STATE between", value1, value2, "procState");
            return (Criteria) this;
        }

        public Criteria andProcStateNotBetween(String value1, String value2) {
            addCriterion("PROC_STATE not between", value1, value2, "procState");
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

        public Criteria andProcMemoIsNull() {
            addCriterion("PROC_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andProcMemoIsNotNull() {
            addCriterion("PROC_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andProcMemoEqualTo(String value) {
            addCriterion("PROC_MEMO =", value, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoNotEqualTo(String value) {
            addCriterion("PROC_MEMO <>", value, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoGreaterThan(String value) {
            addCriterion("PROC_MEMO >", value, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_MEMO >=", value, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoLessThan(String value) {
            addCriterion("PROC_MEMO <", value, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoLessThanOrEqualTo(String value) {
            addCriterion("PROC_MEMO <=", value, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoLike(String value) {
            addCriterion("PROC_MEMO like", value, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoNotLike(String value) {
            addCriterion("PROC_MEMO not like", value, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoIn(List<String> values) {
            addCriterion("PROC_MEMO in", values, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoNotIn(List<String> values) {
            addCriterion("PROC_MEMO not in", values, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoBetween(String value1, String value2) {
            addCriterion("PROC_MEMO between", value1, value2, "procMemo");
            return (Criteria) this;
        }

        public Criteria andProcMemoNotBetween(String value1, String value2) {
            addCriterion("PROC_MEMO not between", value1, value2, "procMemo");
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

        public Criteria andRequestidIsNull() {
            addCriterion("requestid is null");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNotNull() {
            addCriterion("requestid is not null");
            return (Criteria) this;
        }

        public Criteria andRequestidEqualTo(Integer value) {
            addCriterion("requestid =", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotEqualTo(Integer value) {
            addCriterion("requestid <>", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThan(Integer value) {
            addCriterion("requestid >", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("requestid >=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThan(Integer value) {
            addCriterion("requestid <", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThanOrEqualTo(Integer value) {
            addCriterion("requestid <=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidIn(List<Integer> values) {
            addCriterion("requestid in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotIn(List<Integer> values) {
            addCriterion("requestid not in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidBetween(Integer value1, Integer value2) {
            addCriterion("requestid between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotBetween(Integer value1, Integer value2) {
            addCriterion("requestid not between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagIsNull() {
            addCriterion("FTriggerFlag is null");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagIsNotNull() {
            addCriterion("FTriggerFlag is not null");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagEqualTo(Integer value) {
            addCriterion("FTriggerFlag =", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagNotEqualTo(Integer value) {
            addCriterion("FTriggerFlag <>", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagGreaterThan(Integer value) {
            addCriterion("FTriggerFlag >", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("FTriggerFlag >=", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagLessThan(Integer value) {
            addCriterion("FTriggerFlag <", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagLessThanOrEqualTo(Integer value) {
            addCriterion("FTriggerFlag <=", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagIn(List<Integer> values) {
            addCriterion("FTriggerFlag in", values, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagNotIn(List<Integer> values) {
            addCriterion("FTriggerFlag not in", values, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagBetween(Integer value1, Integer value2) {
            addCriterion("FTriggerFlag between", value1, value2, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagNotBetween(Integer value1, Integer value2) {
            addCriterion("FTriggerFlag not between", value1, value2, "ftriggerflag");
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