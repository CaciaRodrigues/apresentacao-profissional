import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class CaciaSRS {
    public static void main(String[] args) {

        String nome = "Cacia Rodrigues";
        String tipo = "FullStack";
        String nivel = "Junior";

        Queue<String> competenciasTech = new LinkedList<>();
        Collections.addAll(competenciasTech, "Java", "C", "React", "JavaScript");

        Queue<String> softSkills = new LinkedList<>();
        Collections.addAll(softSkills, "Criatividade", "Persistência", "Atenção ao Detalhe", "Adaptabilidade");

        System.out.printf("Olá, me chamo %s e sou Dev %s %s.\n", nome, tipo, nivel);

        System.out.println("\nLinguagens: \n");
        for (String competencia : competenciasTech) {
            System.out.println(competencia);
        }

        System.out.println("\nPrincipais SoftSkills: \n");
        for (String skill : softSkills) {
            System.out.println(skill);




















































        }
    }
}