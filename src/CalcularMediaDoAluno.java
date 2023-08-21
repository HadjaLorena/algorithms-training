public class CalcularMediaDoAluno {
    public static void main(String[] args) {
        //nota<3 = aluno reprovado; nota>3 = aluno em recuperacao; nota>7 aluno aprovado por média
        int notaUm = 3;
        int notaDois = 3;
        int notaTres = 3;
        int mediaDoAluno = calcularMediaDoAluno(notaUm, notaDois, notaTres);
        calcularResultadoDoAluno(mediaDoAluno);

    }

    public static int calcularMediaDoAluno(int notaUm, int notaDois, int notaTres){
       int mediaDoAluno = (notaUm + notaDois + notaTres) / 3;
       return mediaDoAluno;
    }

    public static void calcularResultadoDoAluno(int mediaDoAluno){
        if(mediaDoAluno <= 3){
            System.out.println("Aluno REPROVADO");
        }else if(mediaDoAluno < 7){
            System.out.println("Aluno em RECUPERAÇÃO");
        }else{
            System.out.println("Aluno APROVADO por média");
        }
    }
}
