package io;

public class Libro implements Comparable<Libro>{

	String ISBN;
	String titulo;
	String autor;
	String editorial;
	int edicion;
	int anno_publicacion;
	
	public Libro(){
		ISBN = null;
		titulo = null;
		autor = null;
		editorial = null;
		edicion = 0;
		anno_publicacion = 0;
	}
	
	public void setISBN(String string) {
		
		ISBN = string;
		
	}

	public void setTitulo(String string) {
		titulo = string;
		
	}

	public void setAutor(String string) {
		autor = string;
		
	}

	public void setEditorial(String string) {
		editorial = string;
		
	}

	public void setEdicion(int num) {
		edicion = num;
		
	}

	public void setAnno_de_publicacion(int anno) {
		anno_publicacion = anno;
		
	}

	@Override
	public int compareTo(Libro l) {
        return l.ISBN.compareTo(ISBN);
	}
}
