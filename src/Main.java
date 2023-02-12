import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso1 =new Curso();
      curso1.setTitulo("curso Java");
      curso1.setDescricao("descriçao curso java");
      curso1.setCargaHoraria(8);
      System.out.println(curso1);
      Curso curso2 =new Curso();
      curso2.setTitulo("curso html");
      curso2.setDescricao("descriçao curso html");
      curso2.setCargaHoraria(4);
      System.out.println(curso2);

      Mentoria mentoria1 = new Mentoria();
      mentoria1.setTitulo("Mentoria java");
      mentoria1.setDescricao("Ensinado a melhorar no java");
      mentoria1.setData(LocalDate.now());
      System.out.println(mentoria1);

      Bootcamp bootcamp1 = new Bootcamp();
      bootcamp1.setNome("java bootcamp");
      bootcamp1.setDescricao("descricao java");
      bootcamp1.getConteudos().add(curso1);
      bootcamp1.getConteudos().add(curso2);
      bootcamp1.getConteudos().add(mentoria1);
      
    }
}