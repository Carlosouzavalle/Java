package DesafiosDIO.desafio8;

public class SMS implements ServicoMsg{
    @Override
    public void enviarMensagem(String msg) {
        System.out.println("Eii!!! Tem Novidade pra você: " + msg);
    }
}
