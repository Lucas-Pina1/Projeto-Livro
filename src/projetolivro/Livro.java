package projetolivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalDePaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    @Override
    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                "\n, autor='" + autor + '\'' +
                "\n, totalDePaginas=" + totalDePaginas +
                "\n, paginaAtual=" + paginaAtual +
                "\n, aberto=" + aberto +
                "\n, leitor=" + leitor.getNome() +
                "\n, idade=" + leitor.getIdade() +
                "\n sexo=" + leitor.getSexo() +
                '}';
    }

    public Livro(String titulo, String autor, int totalDePaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalDePaginas = totalDePaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }


    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {

    }

    @Override
    public void fechar() {

    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.totalDePaginas) {
            this.paginaAtual = 0;
        } else {
            this.paginaAtual = pagina;
        }
    }

    @Override
    public void avancarPagina() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual--;
    }
}
