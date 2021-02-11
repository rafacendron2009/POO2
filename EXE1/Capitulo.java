package exe1;

public class Capitulo {
       Integer numero;
       Livro livro;
       
       Capitulo(Livro livro){
           this.livro = livro;
           this.numero = numero;
       }

    Capitulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
