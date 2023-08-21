public class PrintarDeZeroADez {
    public static void main(String[] args) {
        printarComWhile();
        printarComDoWhile();
    }

    public static void printarComWhile(){
        int contador = 0;

        while(contador <= 10){
            System.out.println(contador);
            contador = contador + 1;
        }
    }

    public static void printarComDoWhile(){
        int contador = 0;
        do{
            System.out.println(contador);
            contador = contador + 1;
        }while(contador <= 10);
    }
}
