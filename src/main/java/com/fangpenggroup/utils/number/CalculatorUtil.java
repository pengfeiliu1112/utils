package com.fangpenggroup.utils.number;

import com.fangpenggroup.utils.enums.NumberTypeEnum;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @Author: pengfeiliu
 * @Description: 
 * @Date: 17:28 2018/4/25
 * @Modified By:
 */
public class CalculatorUtil {

    /**
     * 计算加法
     *
     * @param numbers
     * @return Number 计算结果
     */
    public static Number add(Number... numbers) {
        Number result = 0;
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
     * 计算减法
     *
     * @param numbers
     * @return Number 计算结果
     */
    public static Number subtract(Number... numbers) {
        Number result = 0;
        if(numbers.length > 0){
            result = numbers[0];
        }

        for (Number num : numbers) {
            if(num == numbers[0]){
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
}
