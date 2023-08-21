public class SomaDeInteiros {
    public static void main(String[] args) {
        int resultadoDaSomaDeInteiros = somaDeInteiros(1, 1);
        System.out.println(resultadoDaSomaDeInteiros);
        
    }

    public static int somaDeInteiros(int primeiroValor, int segundoValor){

        int somaDeInteiros = primeiroValor + segundoValor;
        return somaDeInteiros;
    }
}