package interfacee;

public interface Vehicicle {
    void startEngine();
    void stopEngine();
}



// an interface is a reference type that acts as a blueprint for classes by defining a strict contract of behaviors. It specifies what a class must do, but not how it does it, allowing you to achieve 100% abstraction and loose coupling in your 

// Por padrão, qualquer método comum que você declara em uma interface é implicitamente um método abstrato (ou seja, ele possui o modificador public abstract automaticamente, mesmo que você não escreva essas palavras).


//  A Exceção (Java 8+)Embora o foco principal das interfaces sejam os métodos abstratos, o Java evoluiu. Hoje em dia, se você precisar que um método na interface tenha código (corpo), você pode usar duas palavras-chave específicas:default methods: Métodos com corpo que as classes que implementam a interface herdam automaticamente (útil para adicionar funções novas sem quebrar códigos antigos).static methods: Métodos utilitários que pertencem à interface, e não aos objetos criedos a partir dela.

// A Exceção (Java 9+)A partir do Java 9, você também pode declarar métodos privados em interfaces. Eles podem ser úteis para encapsular código que é compartilhado entre os métodos default e static da interface, mas não deve ser exposto publicamente.

// A regra de ouro em interfaces Java é: Você não pode usar protected, mas pode usar private (a partir do Java 9).


// protected em Interfaces (Proibido)Você nunca pode usar protected dentro de uma interface. Se tentar, o código não vai compilar.Por quê? O objetivo de uma interface é definir um contrato público para o mundo externo. O modificador protected serve para restringir o acesso apenas à própria classe, suas subclasses e classes do mesmo pacote. Como a interface precisa que qualquer classe externa possa implementá-la livremente, permitir protected violaria essa regra.Comportamento padrão: Se você não escrever nada antes de um método abstrato (ex: void test();), o Java assume automaticamente que ele é public abstract.