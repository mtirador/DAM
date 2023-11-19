package AmachonManu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Manuel
 * @version 1.0
 * 
 */
public class CestaAmachon {

	public static void main(String[] arg) {

		// Declaramos una lista de tipo ArrayList
		ArrayList<Productos> lista = new ArrayList<Productos>();
		Scanner ent = new Scanner(System.in);
		int opcion = 0;

		/*
		 * Men� de opciones
		 * 
		 * 1�) Listar productos 2�) A�adir producto 3�) Modificar producto 4�) Eliminar
		 * producto 0�) Salir
		 * 
		 */

		do {
			System.out.println("1�) Listar productos \n" + "2�) A�adir producto \n" + "3�) Modificar producto \n"
					+ "4�) Eliminar producto \n" + "0�) Salir ");
			try {
				opcion = Integer.parseInt(ent.nextLine());

				switch (opcion) {
				case 1:
					listar(lista);
					break;

				case 2:
					addProducto(lista);
					break;

				case 3:
					break;

				case 4:
					break;

				case 0:
					break;
				default:
					System.out.println("Opci�n no v�lida");

				}

			} catch (NumberFormatException ex) {
				System.out.println("Dato no num�rico");
				opcion = 99;
			}

		} while (opcion != 0);
		System.out.println("�dios");
	}

	public static void listar(ArrayList<Productos> lista) {
		System.out.println("Cesta con " + lista.size() + " producto/s");
		for (Productos p : lista) {
			System.out.println(p);
		}
	}

	public static void addProducto(ArrayList<Productos> lista) {

		Scanner ent = new Scanner(System.in);
		String nombre = "", desc = "", entTeclado = "";
		float cant = 0.0f;
		double precio = 0.0;
		Categorias cat = null;
		boolean sinErrores = true, salir = false;

		// Control del nombre
		do {
			sinErrores = true;
			System.out.println("Introduce el nombre del producto(introduzca salir para parar)");
			nombre = ent.nextLine().trim();
			if (nombre.equalsIgnoreCase("salir")) {
				System.out.println("�dios");
				sinErrores = false;
				salir = true;
			} else if (!Validaciones.validarString(nombre, 25)) {
				System.out.println("Nombre no puede ser vac�o o mas de 25 letras");
				sinErrores = false;
			}
		} while (!sinErrores && !salir);

		if (!salir) {
			// Control descripci�n
			do {
				sinErrores = true;
				System.out.println("Introduzca una descripci�n(introduzca salir para parar)");
				desc = ent.nextLine();
				if (desc.equalsIgnoreCase("salir")) {
					sinErrores = false;
					salir = true;
				} else if (!Validaciones.validarString(desc, 50)) {
					System.out.println("Descripci�n no puede ser vac�o o mas de 50 letras");
					sinErrores = false;
				}

			} while (!sinErrores && !salir);
		}

		// Control de la categor�a del producto
		if (!salir) {
			do {
				for (int i = 0; i < Categorias.values().length; i++) {
					System.out.println((i + 1) + "�) " + Categorias.values()[i]);
				}
				System.out.println("Introduce la categor�a del producto: (introduzca salir para parar)");
				entTeclado = ent.nextLine().toUpperCase();
				if (Validaciones.chkCategorias(entTeclado) != null) {
					cat = Validaciones.chkCategorias(entTeclado);
					
				} else if (entTeclado.equals("salir")) {
					salir = true;
					sinErrores = false;
				} else {
					System.out.println("Categor�a incorrecta");
					sinErrores = false;
				}

			} while (!sinErrores && !salir);
		}

		// control de las unidades
		if (!salir) {

			do {
				System.out.println("�Cu�ntas unidades desea?.(Introduzca salir para parar) ");
				try {
					entTeclado = ent.nextLine().replace(",", ".");
					cant = Float.parseFloat(entTeclado);
					if (cant > 0) {
						sinErrores = true;
					} else {
						System.out.println("No se pueden ingresar n�meros negativos o cero");
						sinErrores = false;
					}

				} catch (NumberFormatException ex) {
					if (entTeclado.equalsIgnoreCase("Salir"))
						;
					salir = true;
					System.out.println("Dato no Num�rico en las unidades");
					sinErrores = false;
				}

			} while (!sinErrores && !salir);

		}

		// control del importe

		if (!salir) {
			do {

				try {
					System.out.println("Introduzca el importe del producto ");
					entTeclado = ent.nextLine().replace(',', '.');
					precio = Double.parseDouble(entTeclado);
					if (precio > 0) {
						sinErrores = true;
					} else {
						System.out.println("El importe ha de ser mayor que 0");
						sinErrores = false;
					}

				} catch (NumberFormatException ex) {
					if (entTeclado.equalsIgnoreCase("Salir")) {
						salir = true;
					} else {
						System.out.println("Dato no Num�rico en las unidades");
						sinErrores = false;
					}
				}
			} while (!sinErrores && !salir);

			if (sinErrores) {
				lista.add(new Productos(nombre, desc, null, cant, precio));
			}
		}
	}
}
