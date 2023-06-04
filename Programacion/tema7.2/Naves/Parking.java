package Naves;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Parking {

    public static void main(String[] args) {
        List<Nave> misNaves = new ArrayList<>();
        int opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        leerFichero(misNaves);

        do {
            System.out.println("Introduzca la opcion deseada: \n" +
                    "1. Aniadir nave \n" +
                    "2. Eliminar nave \n" +
                    "3. Ver naves \n" +
                    "0. Salir");
            try {
                opcion = Integer.parseInt(br.readLine());

                switch (opcion) {
                    case 1 -> addNave(misNaves, br);
                    case 2 -> delNave(misNaves, br);
                    case 3 -> showNave(misNaves);
                    case 0 -> System.out.println("Adios");
                    default -> System.out.println("Opcion no contemplada");
                }

            } catch (NumberFormatException | IOException e) {
                System.out.println("Opcion no valida");
            }
        } while (opcion != 0);

        try {
            escribirFichero(misNaves);
        } catch (IOException e) {
            System.out.println("Error de E/S");
        }
    }

    private static void leerFichero(List<Nave> naves) {
        BufferedReader br = null;
        String[] linea = null;

        try {
            br = new BufferedReader(new FileReader("parking.csv"));
            while (br.ready()) {
                linea = br.readLine().split(";");
                if (linea[0].equalsIgnoreCase("w")) {
                    naves.add(new Wing(linea[1], Boolean.parseBoolean(linea[2]),
                            Integer.parseInt(linea[3])));
                } else if (linea[0].equalsIgnoreCase("t")) {
                    naves.add(new Tie(linea[1], Boolean.parseBoolean(linea[2]),
                            Float.parseFloat(linea[3])));
                }
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Cuidado, no existe el fichero.");
        } catch (IOException ex) {
            System.out.println("Error de E/S");
        }
    }

    public static void escribirFichero(List<Nave> naves) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("parking.csv"));
        for (Nave nave : naves) {
            bw.write(nave.toFichero());
            bw.newLine();
        }
        bw.close();
    }

    public static void addNave(List<Nave> naves, BufferedReader br) {
        String[] datos = new String[3];
        boolean run = true;

        while (run) {
            System.out.println("Introduce matricula: ");
            try {
                datos[0] = br.readLine();
                run = false;
            } catch (IOException e) {
                System.out.println("Error al introducir la matrícula.");
            }
        }
        run = true;
        while (run) {
            System.out.println("Pertenece al imperio S/N: ");
            try {
                datos[1] = br.readLine().toLowerCase();
                run = !(datos[1].charAt(0) == 's' || datos[1].charAt(0) == 'n');
            } catch (IOException e) {
                System.out.println("Error al introducir el bando.");
            }
        }
        run = true;
        while (run) {

            System.out.println("Introduce el tipo de nave: (Wing o Tie)");
            try {
                switch (br.readLine().toLowerCase().charAt(0)) {
                    case 'w':
                        System.out.println("Introduce numero de motores que tiene: ");
                        datos[2] = br.readLine();
                        naves.add(new Wing(datos[0],
                                (datos[1].charAt(0) == 's'),
                                Integer.parseInt(datos[2])));
                        run = false;
                        break;
                    case 't':
                        System.out.println("Introduce las cilindradas que tiene: ");
                        datos[2] = br.readLine();
                        naves.add(new Tie(datos[0],
                                (datos[1].charAt(0) == 's'),
                                Float.parseFloat(datos[2].replace(",", "."))));
                        run = false;
                        break;
                    default:
                        System.out.println("Tipo de nave no contemplada.");

                }
            } catch (IOException e) {
                System.out.println("Error al introducir el tipo de nave.");
            }
        }
    }

    public static void showNave(List<Nave> misNaves) {
        for (Nave nave : misNaves) {
            System.out.println(nave);
        }
    }

    public static void delNave(List<Nave> misNaves, BufferedReader br) {
        String matricula = "";
        System.out.println("Indique la matricula de la nave a eliminar.");
        showNave(misNaves);

        try {
            matricula = br.readLine();
            boolean removed = false;
            for (int i = 0; i < misNaves.size(); i++) {
                Nave nave = misNaves.get(i);
                if (nave.getMatricula().equalsIgnoreCase(matricula)) {
                    misNaves.remove(i);
                    removed = true;
                    break;
                }
            }
            if (removed) {
                System.out.println("Elemento eliminado.");
            } else {
                System.out.println("Matricula no existe.");
            }

        } catch (IOException ex) {
            System.out.println("Error en la E/S");
        }
    }
}
