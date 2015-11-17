package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdcShiftSchedulingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcShiftSchedulingExample() {
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

        public Criteria andSchDateIsNull() {
            addCriterion("SCH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSchDateIsNotNull() {
            addCriterion("SCH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSchDateEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_DATE =", value, "schDate");
            return (Criteria) this;
        }

        public Criteria andSchDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_DATE <>", value, "schDate");
            return (Criteria) this;
        }

        public Criteria andSchDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SCH_DATE >", value, "schDate");
            return (Criteria) this;
        }

        public Criteria andSchDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_DATE >=", value, "schDate");
            return (Criteria) this;
        }

        public Criteria andSchDateLessThan(Date value) {
            addCriterionForJDBCDate("SCH_DATE <", value, "schDate");
            return (Criteria) this;
        }

        public Criteria andSchDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SCH_DATE <=", value, "schDate");
            return (Criteria) this;
        }

        public Criteria andSchDateIn(List<Date> values) {
            addCriterionForJDBCDate("SCH_DATE in", values, "schDate");
            return (Criteria) this;
        }

        public Criteria andSchDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SCH_DATE not in", values, "schDate");
            return (Criteria) this;
        }

        public Criteria andSchDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCH_DATE between", value1, value2, "schDate");
            return (Criteria) this;
        }

        public Criteria andSchDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SCH_DATE not between", value1, value2, "schDate");
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

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("GROUP_ID like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("GROUP_ID not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
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

        public Criteria andRecIdIsNull() {
            addCriterion("REC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("REC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Long value) {
            addCriterion("REC_ID =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Long value) {
            addCriterion("REC_ID <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Long value) {
            addCriterion("REC_ID >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REC_ID >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Long value) {
            addCriterion("REC_ID <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Long value) {
            addCriterion("REC_ID <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Long> values) {
            addCriterion("REC_ID in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Long> values) {
            addCriterion("REC_ID not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Long value1, Long value2) {
            addCriterion("REC_ID between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Long value1, Long value2) {
            addCriterion("REC_ID not between", value1, value2, "recId");
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

        public Criteria andWorkTimeEqualTo(Date value) {
            addCriterion("WORK_TIME =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterion("WORK_TIME <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterion("WORK_TIME >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WORK_TIME >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterion("WORK_TIME <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterion("WORK_TIME <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterion("WORK_TIME in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterion("WORK_TIME not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterion("WORK_TIME between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterion("WORK_TIME not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeIsNull() {
            addCriterion("ACTUAL_WORK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeIsNotNull() {
            addCriterion("ACTUAL_WORK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeEqualTo(Date value) {
            addCriterion("ACTUAL_WORK_TIME =", value, "actualWorkTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeNotEqualTo(Date value) {
            addCriterion("ACTUAL_WORK_TIME <>", value, "actualWorkTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeGreaterThan(Date value) {
            addCriterion("ACTUAL_WORK_TIME >", value, "actualWorkTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_WORK_TIME >=", value, "actualWorkTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeLessThan(Date value) {
            addCriterion("ACTUAL_WORK_TIME <", value, "actualWorkTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_WORK_TIME <=", value, "actualWorkTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeIn(List<Date> values) {
            addCriterion("ACTUAL_WORK_TIME in", values, "actualWorkTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeNotIn(List<Date> values) {
            addCriterion("ACTUAL_WORK_TIME not in", values, "actualWorkTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_WORK_TIME between", value1, value2, "actualWorkTime");
            return (Criteria) this;
        }

        public Criteria andActualWorkTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_WORK_TIME not between", value1, value2, "actualWorkTime");
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

        public Criteria andOffTimeEqualTo(Date value) {
            addCriterion("OFF_TIME =", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotEqualTo(Date value) {
            addCriterion("OFF_TIME <>", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThan(Date value) {
            addCriterion("OFF_TIME >", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OFF_TIME >=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThan(Date value) {
            addCriterion("OFF_TIME <", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThanOrEqualTo(Date value) {
            addCriterion("OFF_TIME <=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIn(List<Date> values) {
            addCriterion("OFF_TIME in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotIn(List<Date> values) {
            addCriterion("OFF_TIME not in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeBetween(Date value1, Date value2) {
            addCriterion("OFF_TIME between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotBetween(Date value1, Date value2) {
            addCriterion("OFF_TIME not between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeIsNull() {
            addCriterion("ACTUAL_OFF_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeIsNotNull() {
            addCriterion("ACTUAL_OFF_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeEqualTo(Date value) {
            addCriterion("ACTUAL_OFF_TIME =", value, "actualOffTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeNotEqualTo(Date value) {
            addCriterion("ACTUAL_OFF_TIME <>", value, "actualOffTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeGreaterThan(Date value) {
            addCriterion("ACTUAL_OFF_TIME >", value, "actualOffTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_OFF_TIME >=", value, "actualOffTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeLessThan(Date value) {
            addCriterion("ACTUAL_OFF_TIME <", value, "actualOffTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_OFF_TIME <=", value, "actualOffTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeIn(List<Date> values) {
            addCriterion("ACTUAL_OFF_TIME in", values, "actualOffTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeNotIn(List<Date> values) {
            addCriterion("ACTUAL_OFF_TIME not in", values, "actualOffTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_OFF_TIME between", value1, value2, "actualOffTime");
            return (Criteria) this;
        }

        public Criteria andActualOffTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_OFF_TIME not between", value1, value2, "actualOffTime");
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

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("PRIORITY like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("PRIORITY not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Double value) {
            addCriterion("COUNT =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Double value) {
            addCriterion("COUNT <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Double value) {
            addCriterion("COUNT >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Double value) {
            addCriterion("COUNT >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Double value) {
            addCriterion("COUNT <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Double value) {
            addCriterion("COUNT <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Double> values) {
            addCriterion("COUNT in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Double> values) {
            addCriterion("COUNT not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Double value1, Double value2) {
            addCriterion("COUNT between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Double value1, Double value2) {
            addCriterion("COUNT not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolIsNull() {
            addCriterion("SHIFT_SYMBOL is null");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolIsNotNull() {
            addCriterion("SHIFT_SYMBOL is not null");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolEqualTo(String value) {
            addCriterion("SHIFT_SYMBOL =", value, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolNotEqualTo(String value) {
            addCriterion("SHIFT_SYMBOL <>", value, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolGreaterThan(String value) {
            addCriterion("SHIFT_SYMBOL >", value, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFT_SYMBOL >=", value, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolLessThan(String value) {
            addCriterion("SHIFT_SYMBOL <", value, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolLessThanOrEqualTo(String value) {
            addCriterion("SHIFT_SYMBOL <=", value, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolLike(String value) {
            addCriterion("SHIFT_SYMBOL like", value, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolNotLike(String value) {
            addCriterion("SHIFT_SYMBOL not like", value, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolIn(List<String> values) {
            addCriterion("SHIFT_SYMBOL in", values, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolNotIn(List<String> values) {
            addCriterion("SHIFT_SYMBOL not in", values, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolBetween(String value1, String value2) {
            addCriterion("SHIFT_SYMBOL between", value1, value2, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andShiftSymbolNotBetween(String value1, String value2) {
            addCriterion("SHIFT_SYMBOL not between", value1, value2, "shiftSymbol");
            return (Criteria) this;
        }

        public Criteria andTmIsNull() {
            addCriterion("TM is null");
            return (Criteria) this;
        }

        public Criteria andTmIsNotNull() {
            addCriterion("TM is not null");
            return (Criteria) this;
        }

        public Criteria andTmEqualTo(Date value) {
            addCriterion("TM =", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotEqualTo(Date value) {
            addCriterion("TM <>", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThan(Date value) {
            addCriterion("TM >", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThanOrEqualTo(Date value) {
            addCriterion("TM >=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThan(Date value) {
            addCriterion("TM <", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThanOrEqualTo(Date value) {
            addCriterion("TM <=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmIn(List<Date> values) {
            addCriterion("TM in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotIn(List<Date> values) {
            addCriterion("TM not in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmBetween(Date value1, Date value2) {
            addCriterion("TM between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotBetween(Date value1, Date value2) {
            addCriterion("TM not between", value1, value2, "tm");
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