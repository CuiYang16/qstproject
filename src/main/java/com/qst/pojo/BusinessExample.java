package com.qst.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdIsNull() {
            addCriterion("business_pwd is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdIsNotNull() {
            addCriterion("business_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdEqualTo(String value) {
            addCriterion("business_pwd =", value, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdNotEqualTo(String value) {
            addCriterion("business_pwd <>", value, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdGreaterThan(String value) {
            addCriterion("business_pwd >", value, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdGreaterThanOrEqualTo(String value) {
            addCriterion("business_pwd >=", value, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdLessThan(String value) {
            addCriterion("business_pwd <", value, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdLessThanOrEqualTo(String value) {
            addCriterion("business_pwd <=", value, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdLike(String value) {
            addCriterion("business_pwd like", value, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdNotLike(String value) {
            addCriterion("business_pwd not like", value, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdIn(List<String> values) {
            addCriterion("business_pwd in", values, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdNotIn(List<String> values) {
            addCriterion("business_pwd not in", values, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdBetween(String value1, String value2) {
            addCriterion("business_pwd between", value1, value2, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessPwdNotBetween(String value1, String value2) {
            addCriterion("business_pwd not between", value1, value2, "businessPwd");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIsNull() {
            addCriterion("business_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIsNotNull() {
            addCriterion("business_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeEqualTo(Date value) {
            addCriterion("business_time =", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotEqualTo(Date value) {
            addCriterion("business_time <>", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeGreaterThan(Date value) {
            addCriterion("business_time >", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("business_time >=", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeLessThan(Date value) {
            addCriterion("business_time <", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeLessThanOrEqualTo(Date value) {
            addCriterion("business_time <=", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIn(List<Date> values) {
            addCriterion("business_time in", values, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotIn(List<Date> values) {
            addCriterion("business_time not in", values, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeBetween(Date value1, Date value2) {
            addCriterion("business_time between", value1, value2, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotBetween(Date value1, Date value2) {
            addCriterion("business_time not between", value1, value2, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessImgIsNull() {
            addCriterion("business_img is null");
            return (Criteria) this;
        }

        public Criteria andBusinessImgIsNotNull() {
            addCriterion("business_img is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessImgEqualTo(String value) {
            addCriterion("business_img =", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgNotEqualTo(String value) {
            addCriterion("business_img <>", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgGreaterThan(String value) {
            addCriterion("business_img >", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgGreaterThanOrEqualTo(String value) {
            addCriterion("business_img >=", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgLessThan(String value) {
            addCriterion("business_img <", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgLessThanOrEqualTo(String value) {
            addCriterion("business_img <=", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgLike(String value) {
            addCriterion("business_img like", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgNotLike(String value) {
            addCriterion("business_img not like", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgIn(List<String> values) {
            addCriterion("business_img in", values, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgNotIn(List<String> values) {
            addCriterion("business_img not in", values, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgBetween(String value1, String value2) {
            addCriterion("business_img between", value1, value2, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgNotBetween(String value1, String value2) {
            addCriterion("business_img not between", value1, value2, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameIsNull() {
            addCriterion("business_realname is null");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameIsNotNull() {
            addCriterion("business_realname is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameEqualTo(String value) {
            addCriterion("business_realname =", value, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameNotEqualTo(String value) {
            addCriterion("business_realname <>", value, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameGreaterThan(String value) {
            addCriterion("business_realname >", value, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("business_realname >=", value, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameLessThan(String value) {
            addCriterion("business_realname <", value, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameLessThanOrEqualTo(String value) {
            addCriterion("business_realname <=", value, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameLike(String value) {
            addCriterion("business_realname like", value, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameNotLike(String value) {
            addCriterion("business_realname not like", value, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameIn(List<String> values) {
            addCriterion("business_realname in", values, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameNotIn(List<String> values) {
            addCriterion("business_realname not in", values, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameBetween(String value1, String value2) {
            addCriterion("business_realname between", value1, value2, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessRealnameNotBetween(String value1, String value2) {
            addCriterion("business_realname not between", value1, value2, "businessRealname");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityIsNull() {
            addCriterion("business_identity is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityIsNotNull() {
            addCriterion("business_identity is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityEqualTo(String value) {
            addCriterion("business_identity =", value, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityNotEqualTo(String value) {
            addCriterion("business_identity <>", value, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityGreaterThan(String value) {
            addCriterion("business_identity >", value, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("business_identity >=", value, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityLessThan(String value) {
            addCriterion("business_identity <", value, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityLessThanOrEqualTo(String value) {
            addCriterion("business_identity <=", value, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityLike(String value) {
            addCriterion("business_identity like", value, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityNotLike(String value) {
            addCriterion("business_identity not like", value, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityIn(List<String> values) {
            addCriterion("business_identity in", values, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityNotIn(List<String> values) {
            addCriterion("business_identity not in", values, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityBetween(String value1, String value2) {
            addCriterion("business_identity between", value1, value2, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessIdentityNotBetween(String value1, String value2) {
            addCriterion("business_identity not between", value1, value2, "businessIdentity");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNull() {
            addCriterion("authority_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("authority_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(Integer value) {
            addCriterion("authority_id =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(Integer value) {
            addCriterion("authority_id <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(Integer value) {
            addCriterion("authority_id >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority_id >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(Integer value) {
            addCriterion("authority_id <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("authority_id <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<Integer> values) {
            addCriterion("authority_id in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<Integer> values) {
            addCriterion("authority_id not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(Integer value1, Integer value2) {
            addCriterion("authority_id between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("authority_id not between", value1, value2, "authorityId");
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