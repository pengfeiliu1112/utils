package com.fangpenggroup.utils.number;

import com.fangpenggroup.utils.enums.NumberTypeEnum;
import com.fangpenggroup.utils.exception.NumberException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Author: pengfeiliu
 * @Description:
 * @Date: 17:28 2018/4/25
 * @Modified By:
 */
public class CalculatorUtil {
    /**
     * 记录日志
     */
    private static final Logger log = LoggerFactory.getLogger(CalculatorUtil.class);

    /**
     * 数组起始位置索引
     */
    private static int INDEX_FIRST_PLACE = 0;

    /**
     * 数组长度0
     */
    private static int ARRAY_LENGTH_ZERO = 0;

    /**
     * 数组长度1
     */
    private static int ARRAY_LENGTH_ONE = 1;

    /**
     * number初始值
     */
    private static int NUMBER_INIT_VALUE = 0;

    /**
     * 两个数相加
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Number add(Number num1, Number num2) {
        return add(num1, num2);
    }

    /**
     * 计算加法
     *
     * @param numbers
     * @return Number 计算结果
     */
    public static Number add(Number... numbers) {
        Number result = NUMBER_INIT_VALUE;
        for (Number num : numbers) {
            NumberTypeEnum numberTypeEnum = NumberTypeEnum.getValue(num.getClass());

            switch (numberTypeEnum) {
                case BYTE:
                    result = result.byteValue() + num.byteValue();
                    break;
                case SHORT:
                    result = result.shortValue() + num.shortValue();
                    break;
                case INTEGER:
                    result = result.intValue() + num.intValue();
                    break;
                case LONG:
                    result = result.longValue() + num.longValue();
                    break;
                case FLOAT:
                    result = result.floatValue() + num.floatValue();
                    break;
                case DOUBLE:
                    result = result.doubleValue() + num.doubleValue();
                    break;
                case BIGINTEGER:
                    result = ((BigInteger) result).add(new BigInteger(String.valueOf(num)));
                    break;
                case BIGDECIMAL:
                    result = ((BigDecimal) result).add(new BigDecimal(String.valueOf(num)));
                    break;
            }
        }
        return result;
    }

    /**
     * 两个数相减
     *
     * @param subtraction
     * @param reduced
     * @return
     */
    public static Number subtract(Number subtraction, Number reduced) {
        return subtract(subtraction, reduced);
    }

    /**
     * 计算减法
     *
     * @param numbers
     * @return Number 计算结果
     */
    public static Number subtract(Number... numbers) throws NumberException {
        Number result = null;
        try {
            result = getNumberInit(numbers);
        } catch (NumberException ex) {
            throw ex;
        }
        for (Number num : numbers) {
            if (num == numbers[INDEX_FIRST_PLACE]) {
                continue;
            }
            NumberTypeEnum numberTypeEnum = NumberTypeEnum.getValue(num.getClass());
            switch (numberTypeEnum) {
                case BYTE:
                    result = result.byteValue() - num.byteValue();
                    break;
                case SHORT:
                    result = result.shortValue() - num.shortValue();
                    break;
                case INTEGER:
                    result = result.intValue() - num.intValue();
                    break;
                case LONG:
                    result = result.longValue() - num.longValue();
                    break;
                case FLOAT:
                    result = result.floatValue() - num.floatValue();
                    break;
                case DOUBLE:
                    result = result.doubleValue() - num.doubleValue();
                    break;
                case BIGINTEGER:
                    result = ((BigInteger) result).subtract(new BigInteger(String.valueOf(num)));
                    break;
                case BIGDECIMAL:
                    result = ((BigDecimal) result).subtract(new BigDecimal(String.valueOf(num)));
                    break;
            }
        }
        return result;
    }

    /**
     * 获取集合中第一个元素值
     *
     * @param numbers
     * @return
     */
    private static Number getNumberInit(Number[] numbers) throws NumberException {
        Number result = null;
        if (numbers.length == ARRAY_LENGTH_ZERO) {
            throw new NumberException(NumberException.ARRAY_LENGTH_EMPTY_ERROR);
        }
        if (numbers.length == ARRAY_LENGTH_ONE) {
            throw new NumberException(NumberException.ARRAY_LENGTH_INSUFFICIENT_ERROR);
        }
        result = numbers[INDEX_FIRST_PLACE];
        return result;
    }

    /**
     * 乘法
     *
     * @param numbers
     * @return
     */
    public static Number multiplication(Number... numbers) throws NumberException {
        Number result = null;
        try {
            result = getNumberInit(numbers);
        } catch (NumberException ex) {
            throw ex;
        }

        for (Number num : numbers) {
            if (num == numbers[INDEX_FIRST_PLACE]) {
                continue;
            }
            NumberTypeEnum numberTypeEnum = NumberTypeEnum.getValue(num.getClass());
            switch (numberTypeEnum) {
                case BYTE:
                    result = result.byteValue() * num.byteValue();
                    break;
                case SHORT:
                    result = result.shortValue() * num.shortValue();
                    break;
                case INTEGER:
                    result = result.intValue() * num.intValue();
                    break;
                case LONG:
                    result = result.longValue() * num.longValue();
                    break;
                case FLOAT:
                    result = result.floatValue() * num.floatValue();
                    break;
                case DOUBLE:
                    result = result.doubleValue() * num.doubleValue();
                    break;
                case BIGINTEGER:
                    result = ((BigInteger) result).multiply(new BigInteger(String.valueOf(num)));
                    break;
                case BIGDECIMAL:
                    result = ((BigDecimal) result).multiply(new BigDecimal(String.valueOf(num)));
                    break;
            }
        }
        return result;
    }

    /**
     * 除法
     *
     * @param numbers
     * @return
     * @throws NumberException
     */
    public static Number division(Number... numbers) throws NumberException {
        Number result = null;
        try {
            result = getNumberInit(numbers);
        } catch (NumberException ex) {
            throw ex;
        }

        for (Number num : numbers) {
            if (num == numbers[INDEX_FIRST_PLACE]) {
                continue;
            }
            NumberTypeEnum numberTypeEnum = NumberTypeEnum.getValue(num.getClass());
            switch (numberTypeEnum) {
                case BYTE:
                    result = result.byteValue() / num.byteValue();
                    break;
                case SHORT:
                    result = result.shortValue() / num.shortValue();
                    break;
                case INTEGER:
                    result = result.intValue() / num.intValue();
                    break;
                case LONG:
                    result = result.longValue() / num.longValue();
                    break;
                case FLOAT:
                    result = result.floatValue() / num.floatValue();
                    break;
                case DOUBLE:
                    result = result.doubleValue() / num.doubleValue();
                    break;
                case BIGINTEGER:
                    result = ((BigInteger) result).divide(new BigInteger(String.valueOf(num)));
                    break;
                case BIGDECIMAL:
                    result = ((BigDecimal) result).divide(new BigDecimal(String.valueOf(num)));
                    break;
            }
        }
        return result;
    }

}
