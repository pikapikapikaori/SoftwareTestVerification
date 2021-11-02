package edu.sei.st.logicalcoverage;

import java.math.BigDecimal;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepayMCDCTest {
    private Repay reptest;

    @Test
    void test1() {
        Repay repay1 = new Repay(true, true, new BigDecimal(10000), true, false, new BigDecimal(1000));
        assertEquals("success", repay1.doRepay());
    }

    @Test
    void test2() {
        Repay repay2 = new Repay(false, true, new BigDecimal(10000), true, false, new BigDecimal(1000));
        assertEquals("card invalid or name invalid or balance <=0 ", repay2.doRepay());
    }

    @Test
    void test3() {
        Repay repay3 = new Repay(true, false, new BigDecimal(10000), true, false, new BigDecimal(1000));
        assertEquals("card invalid or name invalid or balance <=0 ", repay3.doRepay());
    }

    @Test
    void test4() {
        Repay repay4 = new Repay(true, true, new BigDecimal(0), true, false, new BigDecimal(1000));
        assertEquals("card invalid or name invalid or balance <=0 ", repay4.doRepay());
    }

    @Test
    void test5() {
        Repay repay5 = new Repay(true, true, new BigDecimal(10000), false, false, new BigDecimal(1000));
        assertEquals("return", repay5.doRepay());
    }

    @Test
    void test6() {
        Repay repay6 = new Repay(true, true, new BigDecimal(10000), false, true, new BigDecimal(0));
        assertEquals("not enough balance ", repay6.doRepay());
    }
}