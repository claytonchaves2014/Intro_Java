// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções o que eles sabem fazer
    public static void main(String[] args) {

    calcularModoCurto();
    calcularAreaModoExtenso();

    }

    public static void calcularModoCurto(){
        System.out.println("Cálculo de área modo curto");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;
        System.out.println("Para a largura de " + largura + "m e  o comprimento de "
                + comprimento + "m A área é de " + largura * comprimento + "m2");
            }


      public static void calcularAreaModoExtenso(){
          // Calculo de área - Exemplo: o Tamanho do tapete ou do piso

          System.out.println("Cálculo de área modo Extenso");

          int largura;
          int comprimento;
          int resultado;

          largura = 5; //largura recebe 4
          comprimento = 6;

          resultado = largura * comprimento;
          System.out.println("Para a largura de " + largura + "m e  o comprimento de "
                  + comprimento + "m A área é de " + resultado + "m2");

    }
}






