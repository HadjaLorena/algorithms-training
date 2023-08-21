import java.lang.reflect.Array;

public class PrintarCincoPrimeirosArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int valorMaxDoPrint = 5;
        int tamanhoDoArray = array.length;

        if(array.length < valorMaxDoPrint){
            valorMaxDoPrint = tamanhoDoArray;
        }
        
        for(int i=0;i<valorMaxDoPrint;i++){
            System.out.println(array[i]);
        }

        
    }
}
