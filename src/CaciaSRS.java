import java.util.*;

public class CaciaSRS {
    public static void main(String[] args) {

        introduction();

    }

    public static void introduction() {

        String name = "Cacia Rodrigues";
        String type = "FullStack";
        String level = "Junior";

        Set<String> techSkills = new HashSet<>();
        Collections.addAll(techSkills, "Java", "C", "React", "JavaScript");

        Set<String> softSkills = new HashSet<>();
        Collections.addAll(softSkills, "Criatividade", "Persistência", "Atenção ao Detalhe", "Adaptabilidade");

        System.out.printf("Olá, me chamo %s e sou Dev %s %s.\n", name, type, level);

        System.out.println("\nLinguagens: \n");
        for (String skill : techSkills) {
            System.out.println(skill);
        }

        System.out.println("\nPrincipais SoftSkills: \n");
        for (String skill : softSkills) {
            System.out.println(skill);

        }
    }
}