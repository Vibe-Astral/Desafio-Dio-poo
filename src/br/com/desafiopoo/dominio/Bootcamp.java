package br.com.desafiopoo.dominio;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate datainicial = LocalDate.now();
    private final LocalDate datafinal = datainicial.plusDays(45);
    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> Conteudos = new LinkedHashSet<>();
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public String getDescricao() {
      return descricao;
    }
    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }
    public LocalDate getDatainicial() {
      return datainicial;
    }
    public LocalDate getDatafinal() {
      return datafinal;
    }
    public Set<Dev> getDevsIncritos() {
      return devsIncritos;
    }
    public void setDevsIncritos(Set<Dev> devsIncritos) {
      this.devsIncritos = devsIncritos;
    }
    public Set<Conteudo> getConteudos() {
      return Conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
      Conteudos = conteudos;
    }
    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((nome == null) ? 0 : nome.hashCode());
      result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
      result = prime * result + ((datainicial == null) ? 0 : datainicial.hashCode());
      result = prime * result + ((datafinal == null) ? 0 : datafinal.hashCode());
      result = prime * result + ((devsIncritos == null) ? 0 : devsIncritos.hashCode());
      result = prime * result + ((Conteudos == null) ? 0 : Conteudos.hashCode());
      return result;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Bootcamp other = (Bootcamp) obj;
      if (nome == null) {
        if (other.nome != null)
          return false;
      } else if (!nome.equals(other.nome))
        return false;
      if (descricao == null) {
        if (other.descricao != null)
          return false;
      } else if (!descricao.equals(other.descricao))
        return false;
      if (datainicial == null) {
        if (other.datainicial != null)
          return false;
      } else if (!datainicial.equals(other.datainicial))
        return false;
      if (datafinal == null) {
        if (other.datafinal != null)
          return false;
      } else if (!datafinal.equals(other.datafinal))
        return false;
      if (devsIncritos == null) {
        if (other.devsIncritos != null)
          return false;
      } else if (!devsIncritos.equals(other.devsIncritos))
        return false;
      if (Conteudos == null) {
        if (other.Conteudos != null)
          return false;
      } else if (!Conteudos.equals(other.Conteudos))
        return false;
      return true;
    }

}