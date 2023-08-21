public class PrintarCincoUltimosNumeros {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int valorDoPrint = 5;
        int tamanhoDoArray = array.length;
        int posicaoNoArray = tamanhoDoArray - valorDoPrint;

        if(posicaoNoArray < 0){
            posicaoNoArray = 0;

        }
            
       for(int i=posicaoNoArray; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}