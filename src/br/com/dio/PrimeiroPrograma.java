package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
    }
}

class Livro {
    private String nome;
    private Integer nPaginas;

    public Livro(String nome, Integer nPaginas) {
        this.nome = nome;
        this.nPaginas = nPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(Integer nPaginas) {
        this.nPaginas = nPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nPaginas=" + nPaginas +
                '}';
    }
}