package practicasexamenes;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Medicos med=new Medicos("Marta","Tirador",12,"1234e","cirujano",123423f,0);
		Enfermeros enfer=new Enfermeros("Rosa", "Rodrigues", 699132841,"21223e","guardia",1200.00f, 0);
		Pacientes paci=new Pacientes("Paco","Rodriguez",123455123,"123312312e", LocalDate.now());
		

		System.out.println(enfer.getNomina(6));
		System.out.println(med.getNomina(8));
		System.out.println(paci.mostrarCitas());
		
	}

}
