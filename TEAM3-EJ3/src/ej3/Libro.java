package ej3;

//@Author Eloy Martorell
//19/04/2022

public class Libro {

	//variables
	String isbn;
	String titulo;
	String autor;
	int numeroPaginas;
	
	protected Libro(String isbn, String titulo, String autor, int numeroPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "El libro " + titulo +  " con ISBN:" + isbn + " del autor " + autor + " tiene " 
				+ numeroPaginas + " paginas.";
	}
	
}
