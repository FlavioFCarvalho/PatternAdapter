package com.adapter;

import com.processor.PaymentProcessor;
import com.service.ThirdPartyPaymentService;

//Adapter que implementa a interface esperada e adapta a API de terceiros
public class ThirdPartyPaymentAdapter implements PaymentProcessor {
 private ThirdPartyPaymentService thirdPartyPaymentService;

 // Construtor
 public ThirdPartyPaymentAdapter() {
     this.thirdPartyPaymentService = new ThirdPartyPaymentService();
 }

 // Adapta o método `pay()` para `makePayment()`
 @Override
 public void pay(double amount) {
     thirdPartyPaymentService.makePayment(amount);
 }
}
