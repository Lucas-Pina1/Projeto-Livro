package projetolivro;

public interface Publicacao {
    String detalhes();

    public void abrir();

    public void fechar();

    public void folhear(int pagina);

    public void avancarPagina();

    public void voltarPagina();
}
