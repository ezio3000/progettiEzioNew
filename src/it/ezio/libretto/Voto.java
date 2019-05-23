package it.ezio.libretto;

import java.time.LocalDate;

public class Voto {
       private int voto;
       private String nome;
       private LocalDate data;
  
       
       public Voto(int voto,String nome,LocalDate data) {
    	  // super();
    	   this.voto=voto;
    	   this.nome=nome;
    	   this.data=data;
    	   
       }


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return String.format("Voto [voto=%s, nome=%s, data=%s]", voto, nome, data);
	}
}
