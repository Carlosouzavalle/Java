public enum Dia {
    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);


    private final int numeroDia;

    private Dia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    public int getNumeroDia() {
        return this.numeroDia;
    }
}

// 2 Uso do enum no programa principal 
class ExemploEnum {
    public static void main(String[] args) {
        Dia hoje = Dia.DOMINGO;

        // exibe o nome da constante e o valor associado

        System.out.println("Hoje é: " + hoje);
        System.out.println("Número do dia: " + hoje.getNumeroDia());

        switch (hoje) {
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA:
                System.out.println("É um dia da semana.");
                break;
            case DOMINGO, SABADO:
                System.out.println("É um dia de descanso.");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }



        
    }
}


// Destaques do Funcionamento:

// **Atributos e Construtor**: Ao definir cada constante (como `DOMINGO(1)`), o Java invoca automaticamente o construtor do `enum` para associar o valor ao campo `numeroDia`[3]

// **Acesso via Métodos**: É possível declarar métodos como `getNumeroDia()` para recuperar os dados associados a cada constante

// **Eficiência com** **switch**: Avaliar um `enum` em instruções `switch` é mais rápido e legível do que comparar textos (`String`), além de evitar erros de digitação[1]

// **Métodos Utilitários Nativos**: Como todo `enum` herda implicitamente de `java.lang.Enum`[8][9], ele possui métodos prontos como `values()` (retorna um array com todas as constantes) e `valueOf()` (converte um texto na constante correspondente)[6]



