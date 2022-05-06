import java.util.ArrayList;
import java.util.Scanner;

public class Controle {

    public void criar(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while(true){
            System.out.println("insirao nome");
            String nome = sc.next();
            if(nome.equals("fim") | nome.equals("FIM")){
                System.out.println("Fim");
                break;
            }
            else{
                System.out.println("Insira nota1");
                int media1 = sc.nextInt();
                System.out.println("Insira nota1");
                int media2 = sc.nextInt();

                Aluno a = new Aluno(nome, media1, media2);
                alunos.add(a);
            }
            System.out.println(alunos.size());
        }

        double media = 0, somatorio = 0; int quntreprovado = 0, quntfinal = 0,qunaprovados = 0;


        for(Aluno a : alunos){
            double notaDoAluno = a.getNotaFinal();
            somatorio += notaDoAluno;
            if(notaDoAluno > 7){
                qunaprovados++;
            }
            else if(notaDoAluno >=2.0){
                quntfinal++;
            }
            else{
                quntreprovado++;
            }

            media = somatorio /alunos.size();
        }

        System.out.println("media da truma: "+ media);
        System.out.println("Reprovados: "+quntreprovado);
        System.out.println("Qauntidade na final: "+quntfinal);
        System.out.println("Quantidade aprovados: "+qunaprovados);

        sc.close();

    }


}
