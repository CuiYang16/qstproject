package com.qst.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
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

        public Criteria andAuthorityManageGoodsIsNull() {
            addCriterion("authority_manage_goods is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsIsNotNull() {
            addCriterion("authority_manage_goods is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsEqualTo(String value) {
            addCriterion("authority_manage_goods =", value, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsNotEqualTo(String value) {
            addCriterion("authority_manage_goods <>", value, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsGreaterThan(String value) {
            addCriterion("authority_manage_goods >", value, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("authority_manage_goods >=", value, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsLessThan(String value) {
            addCriterion("authority_manage_goods <", value, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsLessThanOrEqualTo(String value) {
            addCriterion("authority_manage_goods <=", value, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsLike(String value) {
            addCriterion("authority_manage_goods like", value, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsNotLike(String value) {
            addCriterion("authority_manage_goods not like", value, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsIn(List<String> values) {
            addCriterion("authority_manage_goods in", values, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsNotIn(List<String> values) {
            addCriterion("authority_manage_goods not in", values, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsBetween(String value1, String value2) {
            addCriterion("authority_manage_goods between", value1, value2, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageGoodsNotBetween(String value1, String value2) {
            addCriterion("authority_manage_goods not between", value1, value2, "authorityManageGoods");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserIsNull() {
            addCriterion("authority_manage_user is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserIsNotNull() {
            addCriterion("authority_manage_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserEqualTo(String value) {
            addCriterion("authority_manage_user =", value, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserNotEqualTo(String value) {
            addCriterion("authority_manage_user <>", value, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserGreaterThan(String value) {
            addCriterion("authority_manage_user >", value, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserGreaterThanOrEqualTo(String value) {
            addCriterion("authority_manage_user >=", value, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserLessThan(String value) {
            addCriterion("authority_manage_user <", value, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserLessThanOrEqualTo(String value) {
            addCriterion("authority_manage_user <=", value, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserLike(String value) {
            addCriterion("authority_manage_user like", value, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserNotLike(String value) {
            addCriterion("authority_manage_user not like", value, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserIn(List<String> values) {
            addCriterion("authority_manage_user in", values, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserNotIn(List<String> values) {
            addCriterion("authority_manage_user not in", values, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserBetween(String value1, String value2) {
            addCriterion("authority_manage_user between", value1, value2, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageUserNotBetween(String value1, String value2) {
            addCriterion("authority_manage_user not between", value1, value2, "authorityManageUser");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderIsNull() {
            addCriterion("authority_manage_order is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderIsNotNull() {
            addCriterion("authority_manage_order is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderEqualTo(String value) {
            addCriterion("authority_manage_order =", value, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderNotEqualTo(String value) {
            addCriterion("authority_manage_order <>", value, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderGreaterThan(String value) {
            addCriterion("authority_manage_order >", value, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderGreaterThanOrEqualTo(String value) {
            addCriterion("authority_manage_order >=", value, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderLessThan(String value) {
            addCriterion("authority_manage_order <", value, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderLessThanOrEqualTo(String value) {
            addCriterion("authority_manage_order <=", value, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderLike(String value) {
            addCriterion("authority_manage_order like", value, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderNotLike(String value) {
            addCriterion("authority_manage_order not like", value, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderIn(List<String> values) {
            addCriterion("authority_manage_order in", values, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderNotIn(List<String> values) {
            addCriterion("authority_manage_order not in", values, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderBetween(String value1, String value2) {
            addCriterion("authority_manage_order between", value1, value2, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityManageOrderNotBetween(String value1, String value2) {
            addCriterion("authority_manage_order not between", value1, value2, "authorityManageOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessIsNull() {
            addCriterion("authority_business is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessIsNotNull() {
            addCriterion("authority_business is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessEqualTo(String value) {
            addCriterion("authority_business =", value, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessNotEqualTo(String value) {
            addCriterion("authority_business <>", value, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessGreaterThan(String value) {
            addCriterion("authority_business >", value, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("authority_business >=", value, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessLessThan(String value) {
            addCriterion("authority_business <", value, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessLessThanOrEqualTo(String value) {
            addCriterion("authority_business <=", value, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessLike(String value) {
            addCriterion("authority_business like", value, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessNotLike(String value) {
            addCriterion("authority_business not like", value, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessIn(List<String> values) {
            addCriterion("authority_business in", values, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessNotIn(List<String> values) {
            addCriterion("authority_business not in", values, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessBetween(String value1, String value2) {
            addCriterion("authority_business between", value1, value2, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityBusinessNotBetween(String value1, String value2) {
            addCriterion("authority_business not between", value1, value2, "authorityBusiness");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationIsNull() {
            addCriterion("authority_authorization is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationIsNotNull() {
            addCriterion("authority_authorization is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationEqualTo(String value) {
            addCriterion("authority_authorization =", value, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationNotEqualTo(String value) {
            addCriterion("authority_authorization <>", value, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationGreaterThan(String value) {
            addCriterion("authority_authorization >", value, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationGreaterThanOrEqualTo(String value) {
            addCriterion("authority_authorization >=", value, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationLessThan(String value) {
            addCriterion("authority_authorization <", value, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationLessThanOrEqualTo(String value) {
            addCriterion("authority_authorization <=", value, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationLike(String value) {
            addCriterion("authority_authorization like", value, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationNotLike(String value) {
            addCriterion("authority_authorization not like", value, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationIn(List<String> values) {
            addCriterion("authority_authorization in", values, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationNotIn(List<String> values) {
            addCriterion("authority_authorization not in", values, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationBetween(String value1, String value2) {
            addCriterion("authority_authorization between", value1, value2, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthorityAuthorizationNotBetween(String value1, String value2) {
            addCriterion("authority_authorization not between", value1, value2, "authorityAuthorization");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperIsNull() {
            addCriterion("authority_super is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperIsNotNull() {
            addCriterion("authority_super is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperEqualTo(String value) {
            addCriterion("authority_super =", value, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperNotEqualTo(String value) {
            addCriterion("authority_super <>", value, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperGreaterThan(String value) {
            addCriterion("authority_super >", value, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperGreaterThanOrEqualTo(String value) {
            addCriterion("authority_super >=", value, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperLessThan(String value) {
            addCriterion("authority_super <", value, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperLessThanOrEqualTo(String value) {
            addCriterion("authority_super <=", value, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperLike(String value) {
            addCriterion("authority_super like", value, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperNotLike(String value) {
            addCriterion("authority_super not like", value, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperIn(List<String> values) {
            addCriterion("authority_super in", values, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperNotIn(List<String> values) {
            addCriterion("authority_super not in", values, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperBetween(String value1, String value2) {
            addCriterion("authority_super between", value1, value2, "authoritySuper");
            return (Criteria) this;
        }

        public Criteria andAuthoritySuperNotBetween(String value1, String value2) {
            addCriterion("authority_super not between", value1, value2, "authoritySuper");
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