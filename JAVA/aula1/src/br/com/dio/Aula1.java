package br.com.dio;

public class Aula1 {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício da Calculadora");

        Calculadora.soma(8, 7);
        Calculadora.subtracao(78, 70);
        Calculadora.multiplicacao(45.4, 78);
        Calculadora.divisao(7.8, 3);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}

 /*       int k =10;

        int i = ++k;
        int j = k--;
        int x = k;

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println(" i ; " + i);
        System.out.println(" j : " + j);
        System.out.println(" x : " + x);
        System.out.println();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
      double d = (double) int
//      }
    }
}

    /*    byte  b1 = 10;
        byte b2 = 20;

        short s1 = 10;
        short s2 = 500;

        long l1 = 10008888888888L;
        long l2 = 50000000000L;

        float  f1 = 10.8999f;
        float f2 =  5.45f;

        double d1  =  34.34;
        double d2 = 89.98;

        char c1 = 'T';
       // char c2 = 'T2'; apenas um caractere
        char c3 ='\u0057';

        String st1 = "11/07/2022  <<< é bom evitar trabalhar com datas dessa maneira";

        boolean bo1 = false;
        boolean bo2 = true;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(bo1);
        System.out.println(bo2);
    }

}
      /*  int i;
        //  int i;        variável ja existente
        int I;
        // int 1a;      variavel começando com número
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //  j=15;    j é final
        int asrn24678md;
        //   int asrn24678 md;  nome com espaço
        int asrn2$4678_md;
        //   int asrn2$4678%_md;   caractere  não permitido %

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        //    final int numeroTentativas  = 5;   // evite minusculas em final
        int QUANTIDADE_OPCOES = 25; // evite maisuculas  em dec normais
        //    int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);*/