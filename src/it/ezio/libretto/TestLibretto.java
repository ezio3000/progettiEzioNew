package it.ezio.libretto;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libr=new Libretto();
		
		libr.add(new Voto(30,"esame1",LocalDate.of(2017,05,12)));
		libr.add(new Voto(18,"esame2",LocalDate.of(2017,06,12)));
		libr.add(new Voto(25,"esame3",LocalDate.of(2017,07,12)));
		libr.add(new Voto(26,"esame4",LocalDate.of(2017,9,12)));
		libr.add(new Voto(27,"esame5",LocalDate.of(2017,8,12)));
		libr.add(new Voto(18,"esame6",LocalDate.of(2017,10,12)));
		libr.add(new Voto(30,"esame7",LocalDate.of(2017,11,12)));
		libr.add(new Voto(10,"esame8",LocalDate.of(2017,12,12)));
		
		

	}

}
