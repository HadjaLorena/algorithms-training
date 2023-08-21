public class PrintarArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,4,5,3};
        int valor = 9;
        
        for(int i=0;i<array.length;i++){

            if(valor == array[i]){
                System.out.println("Achou");
                System.exit(0);
            }
            
        }
        System.out.println("Não existe");
            System.out.println();
        }

    }
