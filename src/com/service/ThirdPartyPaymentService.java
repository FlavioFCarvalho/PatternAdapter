package com.service;

//Classe externa com m�todo de pagamento diferente
public class ThirdPartyPaymentService {
 public void makePayment(double value) {
     System.out.println("Pagamento realizado com sucesso no valor de: $" + value);
 }
}

