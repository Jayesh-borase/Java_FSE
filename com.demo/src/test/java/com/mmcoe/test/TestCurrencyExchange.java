package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mmcoe.pojo.CurrencyExchange;
import com.mmcoe.pojo.ExchangeService;

@ExtendWith(MockitoExtension.class)
public class TestCurrencyExchange 
{
 @Mock
 private ExchangeService service;
 
 @InjectMocks
 private CurrencyExchange ex;
 
 @Test
 public void testConvert()
 {
	 when(service.usdToInr(100)).thenReturn(9100.0);
	 
	 double result=ex.convert(100);
	 
	 assertEquals(9100,result);
 }
}
