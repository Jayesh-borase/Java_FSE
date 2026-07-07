package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mmcoe.pojo.Accounts;
import com.mmcoe.pojo.IllegalAmountException;

public class TestAccounts {

    private Accounts a;

    @BeforeEach
    public void init() {
        a = new Accounts(1000.0);
    }

    @Test
    public void testGetBalance() {
        assertEquals(1000.0, a.getBalance());
    }

    @Test
    public void testDeposit() {
        assertEquals(1700.0, a.deposit(700));
    }

    @Test
    public void testNegativeDeposit() {
        assertThrows(IllegalArgumentException.class,
                () -> a.deposit(-200));
    }

    @Test
    public void testWithdraw() {
        assertEquals(700.0, a.withdraw(300));
    }

    @Test
    public void testNegativeWithdraw() {
        assertThrows(IllegalArgumentException.class,
                () -> a.withdraw(-500));
    }

    @Test
    public void testInsufficientFunds() {
        assertThrows(IllegalAmountException.class,
                () -> a.withdraw(1500));
    }
}