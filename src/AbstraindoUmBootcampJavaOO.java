
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apferreira
 */
public class AbstraindoUmBootcampJavaOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Angular 8");
        curso2.setDescricao("Curso de Angular 8");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Java OO");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Start #3 Java");
        bootcamp.setDescricao("Hey Dev, já considerou a possibilidade de se tornar ainda mais potente para o mercado, se especializando na tecnologia de desenvolvimento mais utilizada no mundo? Se sim, este é o seu momento de brilhar! O Bootcamp GFT Start #3 Java foi pensado exclusivamente para o seu desenvolvimento na tecnologia de Java, contendo uma sequência completa de cursos, mentorias e desafios. Não perca essa chance e inscreva-se já!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("dev1");
        dev1.inscreverBootcamp(bootcamp);
        imprimir(dev1);
        dev1.progredir();
        dev1.progredir();
        imprimir(dev1);

        Dev dev2 = new Dev();
        dev2.setNome("dev2");
        dev2.inscreverBootcamp(bootcamp);
        imprimir(dev2);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        imprimir(dev2);

    }

    static void imprimir(Dev d) {        
        System.out.println("Nome: " + d.getNome());
        System.out.println("");
        System.out.println("Conteúdos Inscritos: ");
        if (d.getConteudosInscritos().isEmpty()) {
            System.out.println("- Nenhum");
        }
        for (Conteudo ci : d.getConteudosInscritos()) {
            System.out.println("- " + ci.getTitulo());
        }
        System.out.println("");
        System.out.println("Conteúdos Concluídos: ");
        if (d.getConteudosConcluidos().isEmpty()) {
            System.out.println("- Nenhum");
        }
        for (Conteudo cd : d.getConteudosConcluidos()) {
            System.out.println("- " + cd.getTitulo());
        }
        System.out.println("");
        System.out.println("XP: " + d.calcularTotalXp());
        System.out.println("");
        System.out.println("-------");
        System.out.println("");
    }

}
