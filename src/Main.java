import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso cursoJavaDev = new Curso();
        cursoJavaDev.setTitulo("Curso Java Desenvolvedor");
        cursoJavaDev.setDescricao("Curso para Desenvolvedores Java");
        cursoJavaDev.setCargaHoraria(87);

        Curso cursoAzure = new Curso();
        cursoAzure.setTitulo("Curso Microsoft Azure");
        cursoAzure.setDescricao("Curso para Desenvolvedores Azure");
        cursoAzure.setCargaHoraria(54);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(cursoJavaDev);
        System.out.println(cursoAzure);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprendizado para se tornar desenvolvedor Java");
        bootcamp.getConteudos().add(cursoJavaDev);
        bootcamp.getConteudos().add(cursoAzure);
        bootcamp.getConteudos().add(mentoria);

        Dev devIggo = new Dev();
        devIggo.inscreverBootcamp(bootcamp);
        devIggo.setNome("Iggo Nicollas");
        System.out.println("Conteudos Inscritos" + devIggo.getConteudosInscritos());
        devIggo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devIggo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devIggo.getConteudosConcluidos());

        System.out.println("--------------------------");

        Dev devCaio = new Dev();
        devCaio.inscreverBootcamp(bootcamp);
        devCaio.setNome("Caio Glauber");
        System.out.println("Conteudos Inscritos" + devCaio.getConteudosInscritos());
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devCaio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devCaio.getConteudosConcluidos());
    }
}