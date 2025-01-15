O padrão Adapter é utilizado para adaptar a interface de uma classe para outra interface esperada, permitindo que 
classes incompatíveis trabalhem juntas. Ele é amplamente usado para integrar bibliotecas ou serviços externos sem modificar seu código original.

# Contexto: Sistema de Pagamento
Imagine que estamos desenvolvendo um sistema de e-commerce e precisamos integrar uma API de pagamento de terceiros. A API externa tem um método com uma assinatura diferente do esperado pelo nosso sistema. Usamos um Adapter para adaptar essa API.

# Explicação
PaymentProcessor (Interface): Define a interface padrão com o método pay(double amount) que o sistema usa.
ThirdPartyPaymentService: Serviço de terceiros com um método makePayment(double value) que possui uma assinatura diferente.
ThirdPartyPaymentAdapter: Implementa PaymentProcessor e adapta o método pay() para chamar makePayment().
Classe Main: Utiliza o PaymentProcessor sem saber que está chamando um serviço de terceiros por trás do adapter.
