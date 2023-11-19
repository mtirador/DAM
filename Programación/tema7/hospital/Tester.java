package hospital;

import java.time.LocalDate;

import hospital.Medicos;
import hospital.Pacientes;

public class Tester {
	
	public static void main(String[]args) {
		
		Enfermeros enfer=new Enfermeros("Rosa", "Rodrigues", 699132841,"21223e","guardia",1200.00f, 0);
		Medicos medi=new Medicos("Paco","Rodriguez",123455123,"123312312e","cirujano",1500.00f, 0);
		Pacientes paci=new Pacientes("Paco","Rodriguez",123455123,"123312312e", LocalDate.now());
		
		
		System.out.println(enfer.getNomina(6));
		System.out.println(medi.getNomina(8));
		System.out.println(paci.mostrarCitas());
	}

}
