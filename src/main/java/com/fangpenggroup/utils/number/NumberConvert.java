package com.fangpenggroup.utils.number;

import com.fangpenggroup.utils.enums.NumbersUnitNumber;
import com.fangpenggroup.utils.utils.RegularUtils;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

import static com.fangpenggroup.utils.common.NumberConst.*;

/**
 * 数字转换类
 *
 * @author 刘鹏飞
 * 2018年6月1日 17点26分
 */
public class NumberConvert {
    /**
     * 中文数字转换成小写数字
     *
     * @param str 大写金额
     * @return 小写金额
     */
    public static BigDecimal getLowerCase(String str) {
        return getAddLowerCase(str, new BigDecimal("0.00"));
    }

    /**
     * 指定金额累加中文金额 获取小写金额
     *
     * @param str    大写金额
     * @param result 初始小写金额
     * @return 小写金额
     */
    private static BigDecimal getAddLowerCase(String str, BigDecimal result) {

        if (str.contains(ZHENG)) str = str.replace(ZHENG, "");

        String type = RegularUtils.getContent(CHINESE_NUMBERS_CONVERT_UNIT, str);

        if (StringUtils.isEmpty(type)) {
            return result;
        }
        String contain = RegularUtils.getContent(CHINESE_NUMBERS_CONTAIN_ZERO, str);
        if (!StringUtils.isEmpty(contain)) {
            for (int i = 0; i < CHINESE_NUMBER_ARRAY.length; i++) {
                str = str.replaceAll(CHINESE_NUMBER_ARRAY[i], NUMBERS[i]);
            }
        }
        double unitNumber = NumbersUnitNumber.isUnitNumber(type);
        String tempNumber = str.substring(str.indexOf(type) - 1, str.indexOf(type));
        str = str.replace(type, "");
        result = result.add(new BigDecimal(tempNumber).multiply(new BigDecimal(unitNumber)).setScale(2, BigDecimal.ROUND_DOWN));

        return NumberConvert.getAddLowerCase(str, result);
    }

}
