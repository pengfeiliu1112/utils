package com.fangpenggroup.utils.enums;


public enum NumberTypeEnum {
    BYTE, SHORT, INTEGER, LONG, FLOAT, DOUBLE, BIGINTEGER, BIGDECIMAL;

    public static NumberTypeEnum getValue(Class clazz) {
        NumberTypeEnum numberTypeEnum = null;
        String name = clazz.getName();
        name = name.substring(name.lastIndexOf(".") + 1);
        switch (name.toUpperCase()) {
            case "BYTE":
                numberTypeEnum = BYTE;
                break;
            case "SHORT":
                numberTypeEnum = SHORT;
                break;
            case "INTEGER":
                numberTypeEnum = INTEGER;
                break;
            case "LONG":
                numberTypeEnum = LONG;
                break;
            case "FLOAT":
                numberTypeEnum = FLOAT;
                break;
            case "DOUBLE":
                numberTypeEnum = DOUBLE;
                break;
            case "BIGINTEGER":
                numberTypeEnum = BIGINTEGER;
                break;
            case "BIGDECIMAL":
                numberTypeEnum = BIGDECIMAL;
                break;
        }
        return numberTypeEnum;
    }
}