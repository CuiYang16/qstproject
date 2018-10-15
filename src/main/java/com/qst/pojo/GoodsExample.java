package com.qst.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeIsNull() {
            addCriterion("goods_describe is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeIsNotNull() {
            addCriterion("goods_describe is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeEqualTo(String value) {
            addCriterion("goods_describe =", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotEqualTo(String value) {
            addCriterion("goods_describe <>", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeGreaterThan(String value) {
            addCriterion("goods_describe >", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_describe >=", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeLessThan(String value) {
            addCriterion("goods_describe <", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeLessThanOrEqualTo(String value) {
            addCriterion("goods_describe <=", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeLike(String value) {
            addCriterion("goods_describe like", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotLike(String value) {
            addCriterion("goods_describe not like", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeIn(List<String> values) {
            addCriterion("goods_describe in", values, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotIn(List<String> values) {
            addCriterion("goods_describe not in", values, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeBetween(String value1, String value2) {
            addCriterion("goods_describe between", value1, value2, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotBetween(String value1, String value2) {
            addCriterion("goods_describe not between", value1, value2, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeIsNull() {
            addCriterion("goods_createtime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeIsNotNull() {
            addCriterion("goods_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeEqualTo(Date value) {
            addCriterion("goods_createtime =", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeNotEqualTo(Date value) {
            addCriterion("goods_createtime <>", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeGreaterThan(Date value) {
            addCriterion("goods_createtime >", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_createtime >=", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeLessThan(Date value) {
            addCriterion("goods_createtime <", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_createtime <=", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeIn(List<Date> values) {
            addCriterion("goods_createtime in", values, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeNotIn(List<Date> values) {
            addCriterion("goods_createtime not in", values, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeBetween(Date value1, Date value2) {
            addCriterion("goods_createtime between", value1, value2, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_createtime not between", value1, value2, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Integer value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Integer value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Integer value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Integer value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Integer value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Integer> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Integer> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Integer value1, Integer value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(Integer value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(Integer value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(Integer value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(Integer value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<Integer> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<Integer> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgIsNull() {
            addCriterion("goods_coverimg is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgIsNotNull() {
            addCriterion("goods_coverimg is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgEqualTo(String value) {
            addCriterion("goods_coverimg =", value, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgNotEqualTo(String value) {
            addCriterion("goods_coverimg <>", value, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgGreaterThan(String value) {
            addCriterion("goods_coverimg >", value, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_coverimg >=", value, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgLessThan(String value) {
            addCriterion("goods_coverimg <", value, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgLessThanOrEqualTo(String value) {
            addCriterion("goods_coverimg <=", value, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgLike(String value) {
            addCriterion("goods_coverimg like", value, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgNotLike(String value) {
            addCriterion("goods_coverimg not like", value, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgIn(List<String> values) {
            addCriterion("goods_coverimg in", values, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgNotIn(List<String> values) {
            addCriterion("goods_coverimg not in", values, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgBetween(String value1, String value2) {
            addCriterion("goods_coverimg between", value1, value2, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverimgNotBetween(String value1, String value2) {
            addCriterion("goods_coverimg not between", value1, value2, "goodsCoverimg");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1IsNull() {
            addCriterion("goods_img1 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1IsNotNull() {
            addCriterion("goods_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1EqualTo(String value) {
            addCriterion("goods_img1 =", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1NotEqualTo(String value) {
            addCriterion("goods_img1 <>", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1GreaterThan(String value) {
            addCriterion("goods_img1 >", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1GreaterThanOrEqualTo(String value) {
            addCriterion("goods_img1 >=", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1LessThan(String value) {
            addCriterion("goods_img1 <", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1LessThanOrEqualTo(String value) {
            addCriterion("goods_img1 <=", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1Like(String value) {
            addCriterion("goods_img1 like", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1NotLike(String value) {
            addCriterion("goods_img1 not like", value, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1In(List<String> values) {
            addCriterion("goods_img1 in", values, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1NotIn(List<String> values) {
            addCriterion("goods_img1 not in", values, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1Between(String value1, String value2) {
            addCriterion("goods_img1 between", value1, value2, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg1NotBetween(String value1, String value2) {
            addCriterion("goods_img1 not between", value1, value2, "goodsImg1");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2IsNull() {
            addCriterion("goods_img2 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2IsNotNull() {
            addCriterion("goods_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2EqualTo(String value) {
            addCriterion("goods_img2 =", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2NotEqualTo(String value) {
            addCriterion("goods_img2 <>", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2GreaterThan(String value) {
            addCriterion("goods_img2 >", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2GreaterThanOrEqualTo(String value) {
            addCriterion("goods_img2 >=", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2LessThan(String value) {
            addCriterion("goods_img2 <", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2LessThanOrEqualTo(String value) {
            addCriterion("goods_img2 <=", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2Like(String value) {
            addCriterion("goods_img2 like", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2NotLike(String value) {
            addCriterion("goods_img2 not like", value, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2In(List<String> values) {
            addCriterion("goods_img2 in", values, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2NotIn(List<String> values) {
            addCriterion("goods_img2 not in", values, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2Between(String value1, String value2) {
            addCriterion("goods_img2 between", value1, value2, "goodsImg2");
            return (Criteria) this;
        }

        public Criteria andGoodsImg2NotBetween(String value1, String value2) {
            addCriterion("goods_img2 not between", value1, value2, "goodsImg2");
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