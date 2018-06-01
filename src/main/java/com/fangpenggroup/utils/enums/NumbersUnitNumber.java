package com.fangpenggroup.utils.enums;

/**
 * 数字单位枚举类
 */
public enum NumbersUnitNumber {
    MINUTE(0.01), ANGLE(0.1), YUAN(1), TEN(10), HUNDRED(100), THOUSAND(1000), TEN_THOUSAND(10000), HUNDRED_THOUSAND(100000), MILLION(1000000), TEN_MILLION(10000000), Billion(100000000);
    private double unitNumber;

    /**
     * 数字单位枚举构造器
     *
     * @param unitNumber 数字单位
     */
    NumbersUnitNumber(double unitNumber) {
        this.unitNumber = unitNumber;
    }

    /**
     * 获取单位数量方法
     *
     * @param unit 数字单位中文符号
     * @return 数字
     */
    public static double isUnitNumber(String unit) {
        double result = 0.00;
        switch (unit) {
            case "分":
                result = MINUTE.unitNumber;
                break;
            case "角":
                result = ANGLE.unitNumber;
                break;
            case "元":
                result = YUAN.unitNumber;
                break;
            case "拾":
                result = TEN.unitNumber;
                break;
            case "佰":
                result = HUNDRED.unitNumber;
                break;
            case "仟":
                result = THOUSAND.unitNumber;
                break;
            case "万":
                result = TEN_THOUSAND.unitNumber;
                break;
            case "拾万":
                result = HUNDRED_THOUSAND.unitNumber;
                break;
            case "佰万":
                result = MILLION.unitNumber;
                break;
            case "仟万":
                result = TEN_MILLION.unitNumber;
                break;
            case "亿":
                result = Billion.unitNumber;
                break;
        }
        return result;
    }
}
