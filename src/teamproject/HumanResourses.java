package teamproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class HumanResourses {

    static Employee employeeList[] = new Employee[10];
    static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    public static Payroll form = new Payroll();
    static int k = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenido a recursos humanos \n----------------------");
        mainMenu();
    }

    public static void mainMenu() throws IOException {
        System.out.println("Seleccion una opcion \n 1. Gestion de empleados \n 2. Gestion de jornada \n 3. Imprimir la planilla \n 4. Ayuda \n 5. Salir");
        int position = Integer.parseInt(lector.readLine());
        switch (position) {
            case 1: {
                employeeManagement();
                break;
            }
            case 2: {
                workdayManagement();
                break;
            }
            case 3: {
                if (employeeList[0] != null) {
                    printForm();
                    System.out.println(" ");
                    mainMenu();
                } else {
                    System.out.println("No hay empleados registrados");
                    System.out.println(" ");
                    mainMenu();
                }
                break;
            }
            case 4: {
                help();
                break;
            }
            case 5: {
                System.exit(0);
                break;
            }
            default:
                System.out.println("Por favor ingrese una opcion válida");
                mainMenu();
        }

    }

    private static void employeeManagement() throws IOException {
        System.out.println("Gestion de empleados \n 1. Contratar empleado \n 2. "
                + "Editar empleado \n 3. Despedir empleado \n 4. Regresar al menú principal");
        int option3 = Integer.parseInt(lector.readLine());
        switch (option3) {
            case 1: {
                employeeList[k] = (Employee) hireEmployee();
                k++;
                mainMenu();
                break;
            }
            case 2: {
                if (employeeList[0] != null) {
                    System.out.println("Editar empleado");
                    System.out.println(" ");
                    System.out.println("Ingrese el ID del empleado");
                    Employee employee = searchEmployee(Integer.parseInt(lector.readLine()));
                    if (employee != null) {
                        editEmployee(employee);
                    } else {
                        System.out.println("El empleado no fue encontrado");
                        System.out.println(" ");
                        employeeManagement();
                    }

                } else {
                    System.out.println("No hay empleados registrados");
                    System.out.println(" ");
                    employeeManagement();
                }
                break;
            }
            case 3: {
                if (employeeList[0] != null) {
                    fireEmployee();
                } else {
                    System.out.println("No hay empleados registrados");
                    System.out.println(" ");
                    employeeManagement();
                }
                break;
            }
            case 4: {
                System.out.println(" ");
                mainMenu();
            }
        }
    }

    private static void workdayManagement() {

    }

    private static void help() throws IOException {
        System.out.println("¿Sobre cuál opción de las anteriores desea saber?");
        int option2 = Integer.parseInt(lector.readLine());
        switch (option2) {
            case 1: {
                System.out.println("La primera opción trata sobre ingresar "
                        + "todos los datos del empleado que va a contratar.");
                System.out.println(" ");
                mainMenu();
            }
            case 2: {
                System.out.println("La segunda opción es sobre agregarle al "
                        + "empleado las horas que trabajó, horas extra, etc.");
                System.out.println(" ");
                mainMenu();
            }
            case 3: {
                System.out.println("La tercera opción es donde se va a imprimr "
                        + "la lista de los empledos junto con cada uno de sus "
                        + "atributos como el salario.");
                System.out.println(" ");
                mainMenu();
            }
        }
    }

    private static Person hireEmployee() throws IOException {
        Employee employee = new Employee();
        System.out.println("Cedula: ");
        int id = Integer.parseInt(lector.readLine());
        employee.setId(id);
        System.out.println("Primer nombre: ");
        String fName = lector.readLine();
        employee.setFirstName(fName);
        System.out.println("Segundo nombre: ");
        String sName = lector.readLine();
        employee.setSecondName(sName);
        System.out.println("Primer apellido: ");
        String flName = lector.readLine();
        employee.setFirstLastName(flName);
        System.out.println("Segundo apellido: ");
        String slName = lector.readLine();
        employee.setSecondLastName(slName);
        
        return employee;

    }

    private static void editEmployee(Employee employee) throws IOException {
        System.out.println("¿Qué datos va a cambiar?");
        System.out.println("1. La cedula \n 2. Primer nombre \n 3. Segundo nombre \n 4. Primer apellido \n 5. Segundo apellido ");
        int choice = Integer.parseInt(lector.readLine());
        switch (choice) {
            case 1: {
                System.out.println("Digite la nueva cédula");
                int ced = Integer.parseInt(lector.readLine());
                employee.setId(ced);
                employeeManagement();
                break;
            }
            case 2: {
                System.out.println("Digite el nuevo primer nombre");
                String nfName = lector.readLine();
                employee.setFirstName(nfName);
                employeeManagement();
                break;
            }
            case 3: {
                System.out.println("Digite el nuevo segundo nombre");
                String nsName = lector.readLine();
                employee.setSecondName(nsName);
                employeeManagement();
                break;
            }
            case 4: {
                System.out.println("Digite el nuevo primer apellido");
                String fiName = lector.readLine();
                employee.setFirstLastName(fiName);
                employeeManagement();
                break;
            }
            case 5: {
                System.out.println("Digite el nuevo segundo nombre");
                String scName = lector.readLine();
                employee.setSecondLastName(scName);
                employeeManagement();
                break;
            }
        }
    }

    private static void fireEmployee() throws IOException {
        for (int i = 0; i < k; i++) {
            System.out.println("Posicion: " + i + " Nombre: " + employeeList[i].getFirstName() + " Apellido: " + employeeList[i].getFirstLastName());
            System.out.println("Ingrese la posicion del empleado que desea elminiar");
            int position = Integer.parseInt(lector.readLine());
            employeeList[position] = new Employee();
            mainMenu();
        }
    }

    private static Employee searchEmployee(int cod) {
        for (int i = 0; i < k; i++) {
            if (cod == employeeList[i].getId()) {
                Employee found;
                found = employeeList[i];
                return found;
            }
        }
        return null;
    }

    private static void printForm() {
        for (int i = 0; i < k; i++) {
            System.out.println("ID: " + employeeList[i].getId());
            System.out.println("Primer nombre: " + employeeList[i].getFirstName());
            System.out.println("Segundo nombre: " + employeeList[i].getSecondName());
            System.out.println("Primer apellido: " + employeeList[i].getFirstLastName());
            System.out.println("Segundo apellido: " + employeeList[i].getSecondLastName());
            System.out.println(" ");
        }
    }
}
