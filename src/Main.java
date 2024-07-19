import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(cursoJavaDev);
        System.out.println(cursoAzure);
        System.out.println(mentoria);

    }
}