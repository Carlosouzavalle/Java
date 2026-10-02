// package DesafiosDIO;

// public class desafio8 {

//     public static void main(String[] args) 
//     {
//         String mengagem = "Confira nossas promoções!";

//         SMS sms = new SMS();
//         Email email =new Email();
//         RedeSocial redeSocial = new RedeSocial();
//         Whatzapp whatzapp = new Whatzapp();

//         sms.eviarMensagem(mengagem);
//         email.eviarMensagem(mengagem);
//         redeSocial.eviarMensagem(mengagem);
//         whatzapp.eviarMensagem(mengagem);
//     }
// }

// class SMS {
//     void eviarMensagem(String msg) {
//         System.out.println("SMS: " + msg);
//     }
// }

// class Email {
//     void eviarMensagem(String msg) {
//         System.out.println("Email: " + msg);
//     }
// }

// class RedeSocial {
//     void eviarMensagem(String msg) {
//         System.out.println("RedeSocial: " + msg);
//     }
// }

// class Whatzapp {
//     void eviarMensagem(String msg) {
//         System.out.println("Whatzapp: " + msg);
//     }
// }



// // 1 - Escreva um código para enviar mensagens de marketing, para isso você deve ter a possibilidade de enviar a mesma mensagem para serviços diferentes, esses serviços devem ter um método para receber a mensagem como parâmetro, os serviços que devem estar disponíveis são:

// //     SMS;
// //     E-mail;
// //     Redes Sociais;
// //     WhatsApp