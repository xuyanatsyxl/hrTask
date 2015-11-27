package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.List;

public class EadeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EadeptExample() {
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

        public Criteria andDeptidIsNull() {
            addCriterion("DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Long value) {
            addCriterion("DEPTID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Long value) {
            addCriterion("DEPTID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Long value) {
            addCriterion("DEPTID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPTID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Long value) {
            addCriterion("DEPTID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Long value) {
            addCriterion("DEPTID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Long> values) {
            addCriterion("DEPTID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Long> values) {
            addCriterion("DEPTID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Long value1, Long value2) {
            addCriterion("DEPTID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Long value1, Long value2) {
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

        public Criteria andCascadeidIsNull() {
            addCriterion("CASCADEID is null");
            return (Criteria) this;
        }

        public Criteria andCascadeidIsNotNull() {
            addCriterion("CASCADEID is not null");
            return (Criteria) this;
        }

        public Criteria andCascadeidEqualTo(String value) {
            addCriterion("CASCADEID =", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotEqualTo(String value) {
            addCriterion("CASCADEID <>", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidGreaterThan(String value) {
            addCriterion("CASCADEID >", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidGreaterThanOrEqualTo(String value) {
            addCriterion("CASCADEID >=", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLessThan(String value) {
            addCriterion("CASCADEID <", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLessThanOrEqualTo(String value) {
            addCriterion("CASCADEID <=", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLike(String value) {
            addCriterion("CASCADEID like", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotLike(String value) {
            addCriterion("CASCADEID not like", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidIn(List<String> values) {
            addCriterion("CASCADEID in", values, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotIn(List<String> values) {
            addCriterion("CASCADEID not in", values, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidBetween(String value1, String value2) {
            addCriterion("CASCADEID between", value1, value2, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotBetween(String value1, String value2) {
            addCriterion("CASCADEID not between", value1, value2, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("PARENTID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("PARENTID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNull() {
            addCriterion("CUSTOMID is null");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNotNull() {
            addCriterion("CUSTOMID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomidEqualTo(String value) {
            addCriterion("CUSTOMID =", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotEqualTo(String value) {
            addCriterion("CUSTOMID <>", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThan(String value) {
            addCriterion("CUSTOMID >", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMID >=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThan(String value) {
            addCriterion("CUSTOMID <", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMID <=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLike(String value) {
            addCriterion("CUSTOMID like", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotLike(String value) {
            addCriterion("CUSTOMID not like", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidIn(List<String> values) {
            addCriterion("CUSTOMID in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotIn(List<String> values) {
            addCriterion("CUSTOMID not in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidBetween(String value1, String value2) {
            addCriterion("CUSTOMID between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotBetween(String value1, String value2) {
            addCriterion("CUSTOMID not between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNull() {
            addCriterion("DEPTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNotNull() {
            addCriterion("DEPTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDepttypeEqualTo(String value) {
            addCriterion("DEPTTYPE =", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotEqualTo(String value) {
            addCriterion("DEPTTYPE <>", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThan(String value) {
            addCriterion("DEPTTYPE >", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTTYPE >=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThan(String value) {
            addCriterion("DEPTTYPE <", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThanOrEqualTo(String value) {
            addCriterion("DEPTTYPE <=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLike(String value) {
            addCriterion("DEPTTYPE like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotLike(String value) {
            addCriterion("DEPTTYPE not like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeIn(List<String> values) {
            addCriterion("DEPTTYPE in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotIn(List<String> values) {
            addCriterion("DEPTTYPE not in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeBetween(String value1, String value2) {
            addCriterion("DEPTTYPE between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotBetween(String value1, String value2) {
            addCriterion("DEPTTYPE not between", value1, value2, "depttype");
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

        public Criteria andSortnoIsNull() {
            addCriterion("SORTNO is null");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("SORTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSortnoEqualTo(Integer value) {
            addCriterion("SORTNO =", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotEqualTo(Integer value) {
            addCriterion("SORTNO <>", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThan(Integer value) {
            addCriterion("SORTNO >", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORTNO >=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThan(Integer value) {
            addCriterion("SORTNO <", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThanOrEqualTo(Integer value) {
            addCriterion("SORTNO <=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoIn(List<Integer> values) {
            addCriterion("SORTNO in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotIn(List<Integer> values) {
            addCriterion("SORTNO not in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoBetween(Integer value1, Integer value2) {
            addCriterion("SORTNO between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotBetween(Integer value1, Integer value2) {
            addCriterion("SORTNO not between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andLeafIsNull() {
            addCriterion("LEAF is null");
            return (Criteria) this;
        }

        public Criteria andLeafIsNotNull() {
            addCriterion("LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andLeafEqualTo(String value) {
            addCriterion("LEAF =", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotEqualTo(String value) {
            addCriterion("LEAF <>", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThan(String value) {
            addCriterion("LEAF >", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThanOrEqualTo(String value) {
            addCriterion("LEAF >=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThan(String value) {
            addCriterion("LEAF <", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThanOrEqualTo(String value) {
            addCriterion("LEAF <=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLike(String value) {
            addCriterion("LEAF like", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotLike(String value) {
            addCriterion("LEAF not like", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafIn(List<String> values) {
            addCriterion("LEAF in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotIn(List<String> values) {
            addCriterion("LEAF not in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafBetween(String value1, String value2) {
            addCriterion("LEAF between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotBetween(String value1, String value2) {
            addCriterion("LEAF not between", value1, value2, "leaf");
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