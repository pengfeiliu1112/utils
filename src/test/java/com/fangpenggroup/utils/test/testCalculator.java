package com.fangpenggroup.utils.test;

import com.fangpenggroup.utils.number.CalculatorUtil;
import org.junit.Test;

import java.math.BigInteger;

public class testCalculator {

    @Test
    public void test() {
        BigInteger a = new BigInteger("123");
        BigInteger b = new BigInteger("234");
        String name = a.getClass().getName();
        Number number = CalculatorUtil.add(a, b);
        System.out.println(number.intValue());
    }

    @Test
    public void testSub() {
        BigInteger a = new BigInteger("123");
        BigInteger b = new BigInteger("234");
        String name = a.getClass().getName();
        Number number = CalculatorUtil.subtract(a, b);
        System.out.println(number.intValue());
    }
}
