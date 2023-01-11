import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Estudando Java");
        curso1.setCargaHoraria(40);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Js");
        curso2.setDescricao("Estudando JavaScript");
        curso2.setCargaHoraria(35);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria De Java");
        mentoria1.setDescricao("Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JavaScript");
        mentoria2.setDescricao("JavaScript");
        mentoria2.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1);
        // System.out.println(mentoria2);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome(null);
        bootCamp.setDescricao(null);
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev devWelton = new Dev();
        devWelton.setNome("Welton");
        devWelton.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Insc: " + devWelton.getConteudosInscritos());
        devWelton.progredir();
        System.out.println("-");
        System.out.println("-");
        System.out.println("Conteudos Incritos: " +devWelton.getConteudosInscritos());
        System.out.println("Conteudos Incritos: " + devWelton.getConteudosConcluidos());
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootCamp);
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Insc: " + devWelton.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("-");
        System.out.println("Conteudos Incritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devJoao.getConteudosConcluidos());    
    }
}
