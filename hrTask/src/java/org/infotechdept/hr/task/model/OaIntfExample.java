package org.infotechdept.hr.task.model;

import java.util.ArrayList;
import java.util.List;

public class OaIntfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OaIntfExample() {
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

        public Criteria andKsrqIsNull() {
            addCriterion("KSRQ is null");
            return (Criteria) this;
        }

        public Criteria andKsrqIsNotNull() {
            addCriterion("KSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andKsrqEqualTo(String value) {
            addCriterion("KSRQ =", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqNotEqualTo(String value) {
            addCriterion("KSRQ <>", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqGreaterThan(String value) {
            addCriterion("KSRQ >", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqGreaterThanOrEqualTo(String value) {
            addCriterion("KSRQ >=", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqLessThan(String value) {
            addCriterion("KSRQ <", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqLessThanOrEqualTo(String value) {
            addCriterion("KSRQ <=", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqLike(String value) {
            addCriterion("KSRQ like", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqNotLike(String value) {
            addCriterion("KSRQ not like", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqIn(List<String> values) {
            addCriterion("KSRQ in", values, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqNotIn(List<String> values) {
            addCriterion("KSRQ not in", values, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqBetween(String value1, String value2) {
            addCriterion("KSRQ between", value1, value2, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqNotBetween(String value1, String value2) {
            addCriterion("KSRQ not between", value1, value2, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKssjIsNull() {
            addCriterion("KSSJ is null");
            return (Criteria) this;
        }

        public Criteria andKssjIsNotNull() {
            addCriterion("KSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKssjEqualTo(String value) {
            addCriterion("KSSJ =", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotEqualTo(String value) {
            addCriterion("KSSJ <>", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThan(String value) {
            addCriterion("KSSJ >", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThanOrEqualTo(String value) {
            addCriterion("KSSJ >=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThan(String value) {
            addCriterion("KSSJ <", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThanOrEqualTo(String value) {
            addCriterion("KSSJ <=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLike(String value) {
            addCriterion("KSSJ like", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotLike(String value) {
            addCriterion("KSSJ not like", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjIn(List<String> values) {
            addCriterion("KSSJ in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotIn(List<String> values) {
            addCriterion("KSSJ not in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjBetween(String value1, String value2) {
            addCriterion("KSSJ between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotBetween(String value1, String value2) {
            addCriterion("KSSJ not between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andJsrqIsNull() {
            addCriterion("JSRQ is null");
            return (Criteria) this;
        }

        public Criteria andJsrqIsNotNull() {
            addCriterion("JSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJsrqEqualTo(String value) {
            addCriterion("JSRQ =", value, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqNotEqualTo(String value) {
            addCriterion("JSRQ <>", value, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqGreaterThan(String value) {
            addCriterion("JSRQ >", value, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqGreaterThanOrEqualTo(String value) {
            addCriterion("JSRQ >=", value, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqLessThan(String value) {
            addCriterion("JSRQ <", value, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqLessThanOrEqualTo(String value) {
            addCriterion("JSRQ <=", value, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqLike(String value) {
            addCriterion("JSRQ like", value, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqNotLike(String value) {
            addCriterion("JSRQ not like", value, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqIn(List<String> values) {
            addCriterion("JSRQ in", values, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqNotIn(List<String> values) {
            addCriterion("JSRQ not in", values, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqBetween(String value1, String value2) {
            addCriterion("JSRQ between", value1, value2, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJsrqNotBetween(String value1, String value2) {
            addCriterion("JSRQ not between", value1, value2, "jsrq");
            return (Criteria) this;
        }

        public Criteria andJssjIsNull() {
            addCriterion("JSSJ is null");
            return (Criteria) this;
        }

        public Criteria andJssjIsNotNull() {
            addCriterion("JSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJssjEqualTo(String value) {
            addCriterion("JSSJ =", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotEqualTo(String value) {
            addCriterion("JSSJ <>", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThan(String value) {
            addCriterion("JSSJ >", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThanOrEqualTo(String value) {
            addCriterion("JSSJ >=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThan(String value) {
            addCriterion("JSSJ <", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThanOrEqualTo(String value) {
            addCriterion("JSSJ <=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLike(String value) {
            addCriterion("JSSJ like", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotLike(String value) {
            addCriterion("JSSJ not like", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjIn(List<String> values) {
            addCriterion("JSSJ in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotIn(List<String> values) {
            addCriterion("JSSJ not in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjBetween(String value1, String value2) {
            addCriterion("JSSJ between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotBetween(String value1, String value2) {
            addCriterion("JSSJ not between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNull() {
            addCriterion("WORKCODE is null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNotNull() {
            addCriterion("WORKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeEqualTo(String value) {
            addCriterion("WORKCODE =", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotEqualTo(String value) {
            addCriterion("WORKCODE <>", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThan(String value) {
            addCriterion("WORKCODE >", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKCODE >=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThan(String value) {
            addCriterion("WORKCODE <", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThanOrEqualTo(String value) {
            addCriterion("WORKCODE <=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLike(String value) {
            addCriterion("WORKCODE like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotLike(String value) {
            addCriterion("WORKCODE not like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIn(List<String> values) {
            addCriterion("WORKCODE in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotIn(List<String> values) {
            addCriterion("WORKCODE not in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeBetween(String value1, String value2) {
            addCriterion("WORKCODE between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotBetween(String value1, String value2) {
            addCriterion("WORKCODE not between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andCllxIsNull() {
            addCriterion("CLLX is null");
            return (Criteria) this;
        }

        public Criteria andCllxIsNotNull() {
            addCriterion("CLLX is not null");
            return (Criteria) this;
        }

        public Criteria andCllxEqualTo(String value) {
            addCriterion("CLLX =", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotEqualTo(String value) {
            addCriterion("CLLX <>", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThan(String value) {
            addCriterion("CLLX >", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThanOrEqualTo(String value) {
            addCriterion("CLLX >=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThan(String value) {
            addCriterion("CLLX <", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThanOrEqualTo(String value) {
            addCriterion("CLLX <=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLike(String value) {
            addCriterion("CLLX like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotLike(String value) {
            addCriterion("CLLX not like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxIn(List<String> values) {
            addCriterion("CLLX in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotIn(List<String> values) {
            addCriterion("CLLX not in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxBetween(String value1, String value2) {
            addCriterion("CLLX between", value1, value2, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotBetween(String value1, String value2) {
            addCriterion("CLLX not between", value1, value2, "cllx");
            return (Criteria) this;
        }

        public Criteria andClbzIsNull() {
            addCriterion("CLBZ is null");
            return (Criteria) this;
        }

        public Criteria andClbzIsNotNull() {
            addCriterion("CLBZ is not null");
            return (Criteria) this;
        }

        public Criteria andClbzEqualTo(String value) {
            addCriterion("CLBZ =", value, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzNotEqualTo(String value) {
            addCriterion("CLBZ <>", value, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzGreaterThan(String value) {
            addCriterion("CLBZ >", value, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzGreaterThanOrEqualTo(String value) {
            addCriterion("CLBZ >=", value, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzLessThan(String value) {
            addCriterion("CLBZ <", value, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzLessThanOrEqualTo(String value) {
            addCriterion("CLBZ <=", value, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzLike(String value) {
            addCriterion("CLBZ like", value, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzNotLike(String value) {
            addCriterion("CLBZ not like", value, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzIn(List<String> values) {
            addCriterion("CLBZ in", values, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzNotIn(List<String> values) {
            addCriterion("CLBZ not in", values, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzBetween(String value1, String value2) {
            addCriterion("CLBZ between", value1, value2, "clbz");
            return (Criteria) this;
        }

        public Criteria andClbzNotBetween(String value1, String value2) {
            addCriterion("CLBZ not between", value1, value2, "clbz");
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

        public Criteria andRequestidEqualTo(Long value) {
            addCriterion("requestid =", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotEqualTo(Long value) {
            addCriterion("requestid <>", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThan(Long value) {
            addCriterion("requestid >", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThanOrEqualTo(Long value) {
            addCriterion("requestid >=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThan(Long value) {
            addCriterion("requestid <", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThanOrEqualTo(Long value) {
            addCriterion("requestid <=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidIn(List<Long> values) {
            addCriterion("requestid in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotIn(List<Long> values) {
            addCriterion("requestid not in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidBetween(Long value1, Long value2) {
            addCriterion("requestid between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotBetween(Long value1, Long value2) {
            addCriterion("requestid not between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andWriteDateIsNull() {
            addCriterion("write_date is null");
            return (Criteria) this;
        }

        public Criteria andWriteDateIsNotNull() {
            addCriterion("write_date is not null");
            return (Criteria) this;
        }

        public Criteria andWriteDateEqualTo(String value) {
            addCriterion("write_date =", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotEqualTo(String value) {
            addCriterion("write_date <>", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateGreaterThan(String value) {
            addCriterion("write_date >", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateGreaterThanOrEqualTo(String value) {
            addCriterion("write_date >=", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateLessThan(String value) {
            addCriterion("write_date <", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateLessThanOrEqualTo(String value) {
            addCriterion("write_date <=", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateLike(String value) {
            addCriterion("write_date like", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotLike(String value) {
            addCriterion("write_date not like", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateIn(List<String> values) {
            addCriterion("write_date in", values, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotIn(List<String> values) {
            addCriterion("write_date not in", values, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateBetween(String value1, String value2) {
            addCriterion("write_date between", value1, value2, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotBetween(String value1, String value2) {
            addCriterion("write_date not between", value1, value2, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIsNull() {
            addCriterion("write_time is null");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIsNotNull() {
            addCriterion("write_time is not null");
            return (Criteria) this;
        }

        public Criteria andWriteTimeEqualTo(String value) {
            addCriterion("write_time =", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotEqualTo(String value) {
            addCriterion("write_time <>", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeGreaterThan(String value) {
            addCriterion("write_time >", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("write_time >=", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLessThan(String value) {
            addCriterion("write_time <", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLessThanOrEqualTo(String value) {
            addCriterion("write_time <=", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLike(String value) {
            addCriterion("write_time like", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotLike(String value) {
            addCriterion("write_time not like", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIn(List<String> values) {
            addCriterion("write_time in", values, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotIn(List<String> values) {
            addCriterion("write_time not in", values, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeBetween(String value1, String value2) {
            addCriterion("write_time between", value1, value2, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotBetween(String value1, String value2) {
            addCriterion("write_time not between", value1, value2, "writeTime");
            return (Criteria) this;
        }

        public Criteria andTxrcodeIsNull() {
            addCriterion("txrcode is null");
            return (Criteria) this;
        }

        public Criteria andTxrcodeIsNotNull() {
            addCriterion("txrcode is not null");
            return (Criteria) this;
        }

        public Criteria andTxrcodeEqualTo(String value) {
            addCriterion("txrcode =", value, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeNotEqualTo(String value) {
            addCriterion("txrcode <>", value, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeGreaterThan(String value) {
            addCriterion("txrcode >", value, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("txrcode >=", value, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeLessThan(String value) {
            addCriterion("txrcode <", value, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeLessThanOrEqualTo(String value) {
            addCriterion("txrcode <=", value, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeLike(String value) {
            addCriterion("txrcode like", value, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeNotLike(String value) {
            addCriterion("txrcode not like", value, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeIn(List<String> values) {
            addCriterion("txrcode in", values, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeNotIn(List<String> values) {
            addCriterion("txrcode not in", values, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeBetween(String value1, String value2) {
            addCriterion("txrcode between", value1, value2, "txrcode");
            return (Criteria) this;
        }

        public Criteria andTxrcodeNotBetween(String value1, String value2) {
            addCriterion("txrcode not between", value1, value2, "txrcode");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Float value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Float value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Float value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Float value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Float value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Float value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Float> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Float> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Float value1, Float value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Float value1, Float value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andHoursIsNull() {
            addCriterion("hours is null");
            return (Criteria) this;
        }

        public Criteria andHoursIsNotNull() {
            addCriterion("hours is not null");
            return (Criteria) this;
        }

        public Criteria andHoursEqualTo(Float value) {
            addCriterion("hours =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(Float value) {
            addCriterion("hours <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(Float value) {
            addCriterion("hours >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(Float value) {
            addCriterion("hours >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(Float value) {
            addCriterion("hours <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(Float value) {
            addCriterion("hours <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<Float> values) {
            addCriterion("hours in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<Float> values) {
            addCriterion("hours not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(Float value1, Float value2) {
            addCriterion("hours between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(Float value1, Float value2) {
            addCriterion("hours not between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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