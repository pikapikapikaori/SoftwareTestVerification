package edu.sei.st.logicalcoverage;

import java.math.BigDecimal;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepayDecisionCoverageTest {
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
        Repay repay3 = new Repay(true, true, new BigDecimal(10000), false, false, new BigDecimal(1000));
        assertEquals("return", repay3.doRepay());
    }

    @Test
    void test4() {
        Repay repay4 = new Repay(true, true, new BigDecimal(10000), true, false, new BigDecimal(0));
        assertEquals("not enough balance ", repay4.doRepay());
    }
}