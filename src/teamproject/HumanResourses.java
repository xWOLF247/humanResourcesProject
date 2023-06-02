package teamproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class HumanResourses {

    static Employee employeeList[] = new Employee[10];
    static double netSalary = 0.0;
    static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    static int k = 0;
    static Position position[] = new Position[4];

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Antes de ingresar, favor asignarle el salario base a los cargos");
        preloadPositions();
        System.out.println("Bienvenido a recursos humanos \n----------------------");

        mainMenu();
    }

    public static void mainMenu() throws IOException, InterruptedException {
        System.out.println("Seleccion una opcion \n-----------------------\n 1. Gestion de empleados \n 2. Gestion de jornada \n 3. Imprimir la planilla \n 4. Ayuda \n 5. Salir");
        int positionition = Integer.parseInt(lector.readLine());
        switch (positionition) {
            case 1: {
                employeeManagement();
                break;
            }
            case 2: {
                if (employeeList[0] != null) {
                    workdayManagement();
                } else {
                    System.out.println("No hay empleados registrados");
                    System.out.println(" ");
                    mainMenu();
                }

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
                System.out.println("Gracias por utilizar nuestro sistema, vuelva pronto.");
                System.exit(0);
                break;
            }
            default:
                System.err.println("Opción incorrecta");
                mainMenu();
        }

    }

    private static void employeeManagement() throws IOException, InterruptedException {
        System.out.println("Gestion de empleados \n 1. Contratar empleado \n 2. "
                + "Editar empleado \n 3. Despedir empleado \n 4. Asignar una incapacidad \n 5. Asignar pago \n 6. Regresar al menú principal");
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
                    System.out.println("Editar empleado\n----------------");
                    for (int i = 0; i < k; i++) {
                        System.out.println("Id:" + employeeList[i].getId() + " "
                                + "Nombre: " + employeeList[i].getFirstName()
                                + " Apellido: " + employeeList[i].getFirstLastName());
                    }
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
                if (employeeList[0] != null) {
                    disability();
                } else {
                    System.out.println("No hay empleados registrados");
                    System.out.println(" ");
                    employeeManagement();
                }
                break;
            }
            case 5: {
                if (employeeList[0] != null) {
                    assignPayment();
                    mainMenu();
                } else {
                    System.out.println("No hay empleados registrados");
                    System.out.println(" ");
                    employeeManagement();
                }
                break;
            }
            case 6: {
                System.out.println(" ");
                mainMenu();
                break;
            }
            default: {
                System.err.println("Opción incorrecta\n");
                employeeManagement();
            }
        }
    }

    private static void workdayManagement() throws IOException, InterruptedException {
        System.out.println("Asignar jornada laboral \n-------------------------------");
        for (int i = 0; i < k; i++) {
            System.out.println("Id:" + employeeList[i].getId() + " Nombre: " + employeeList[i].getFirstName() + " Apellido: " + employeeList[i].getFirstLastName());
        }
        System.out.println("Ingrese el id del empleado al que desea asignarle la jornada laboral");
        Employee employee = searchEmployee(Integer.parseInt(lector.readLine()));
        if (employee != null) {
            asigWorkday(employee);
            mainMenu();
        } else {
            System.out.println("El empleado no fue encontrado");
            System.out.println(" ");
            mainMenu();
        }
    }

    private static void help() throws IOException, InterruptedException {
        System.out.println("Ayuda \n ----------");
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
        System.out.println("Contratar empleado\n-----------------------");
        Position position2 = new Position();
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
        System.out.println("Ingrese el cargo que desea asignarle al  \n 1. "
                + "Administrador \n 2. Conserje \n 3. Seguridad \n 4. Cajero");
        position2.setId(lector.readLine());
        for (int i = 0; i < 4; i++) {
            if (position2.getId().equals(position[i].getId())) {
                position2.setKindPosition(position[i].getKindPosition());
                position2.setSalary(position[i].getSalary());
            }
        }
        employee.setPositionEmployee(position2);
        System.out.println("Fecha de vinculacion: ");
        Date date = Calendar.getInstance().getTime();
        employee.setDateVinculation(date);
        System.out.println(date);
        System.out.println(" ");
        return employee;

    }

    private static void editEmployee(Employee employee) throws IOException, InterruptedException {
        Position position3 = new Position();
        System.out.println("¿Qué datos va a cambiar?");
        System.out.println("1. La cedula \n 2. Primer nombre \n 3. Segundo nombre \n 4. Primer apellido \n 5. Segundo apellido \n 6. Cargo");
        int choice = Integer.parseInt(lector.readLine());
        switch (choice) {
            case 1: {
                System.out.println("Nueva cédula: ");
                int ced = Integer.parseInt(lector.readLine());
                employee.setId(ced);
                employeeManagement();
                break;
            }
            case 2: {
                System.out.println("Primer nombre nuevo: ");
                String nfName = lector.readLine();
                employee.setFirstName(nfName);
                employeeManagement();
                break;
            }
            case 3: {
                System.out.println("Segundo nombre nuevo: ");
                String nsName = lector.readLine();
                employee.setSecondName(nsName);
                employeeManagement();
                break;
            }
            case 4: {
                System.out.println("Primer apellido nuevo");
                String fiName = lector.readLine();
                employee.setFirstLastName(fiName);
                employeeManagement();
                break;
            }
            case 5: {
                System.out.println("Segundo apellido nuevo:");
                String scName = lector.readLine();
                employee.setSecondLastName(scName);
                employeeManagement();
                break;
            }
            case 6: {
                System.out.println("Nuevo cargo: ");
                System.out.println("1. Administrador \n 2. Conserje \n 3. Seguridad \n 4. Cajero");
                position3.setId(lector.readLine());
                for (int i = 0; i < 4; i++) {
                    if (position3.getId().equals(position[i].getId())) {
                        position3.setKindPosition(position[i].getKindPosition());
                        position3.setSalary(position[i].getSalary());
                    }
                }
                employee.setPositionEmployee(position3);
                employeeManagement();
                break;
            }
        }
    }

    private static void fireEmployee() throws IOException, InterruptedException {
        System.out.println("Despedir empleado\n------------------------");
        Employee employee = new Employee();
        for (int i = 0; i < k; i++) {
            System.out.println("Posicion: "+i + " Nombre: " + employeeList[i].getFirstName() + " Apellido: " + employeeList[i].getFirstLastName());
        }
        System.out.println("\n Ingrese la posicion del empleado que desea elminiar");
        int position2 = Integer.parseInt(lector.readLine());
        employeeList[position2] = new Employee();
        System.out.println("El empleado fue despedido.");
        System.out.println("Fecha de despido: ");
        Date fecha = Calendar.getInstance().getTime();
        employee.setDismisallDate(fecha);
        System.out.println(fecha);
        System.out.println(" ");
        mainMenu();
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

    private static void printForm() throws IOException, InterruptedException {
        System.out.println("Cargando....\n");
        Thread.sleep(3 * 1000);
        for (int i = 0; i < k; i++) {
//            System.out.println("Cargo del empleado: " + employeeList[i].getPositionEmployee().getKindPosition());
            System.out.println("ID: " + employeeList[i].getId());
            System.out.println("Nombre completo: " + employeeList[i].getFirstName() + " "
                    + employeeList[i].getSecondName() + " " + employeeList[i].getFirstLastName() + " "
                    + employeeList[i].getSecondLastName());
            System.out.println("Fecha de vinculacion: " + employeeList[i].getDateVinculation());
            System.out.println("Tipo de pago: " + employeeList[i].getPaymentType());
            System.out.println("Salario neto: " + netSalary);
            if (employeeList[i].getDisalibityId() == 0) {
                System.out.println("Hora de entrada: " + employeeList[i].getEntryTime());
                System.out.println("Hora de salida: " + employeeList[i].getDepartureTime());
            } else {
                System.out.println("\n-----------------------------");
                System.out.println("El empleado tiene una incapacidad");
                System.out.println("Fecha de incapacidad: " + employeeList[i].getDisabilityEntry());
                System.out.println("Dias de incapacidad: " + employeeList[i].getIncapacityDays());
                System.out.println("Id de la incapacidad: " + employeeList[i].getDisalibityId());
            }
            System.out.println("----------------------------- ");
        }
        mainMenu();
    }

    private static void disability() throws IOException, InterruptedException {
        System.out.println("Asignar de discapacidad\n----------------------------");
        for (int i = 0; i < k; i++) {
            System.out.println("Id:" + employeeList[i].getId() + " Nombre: " + employeeList[i].getFirstName() + " Apellido: " + employeeList[i].getFirstLastName());
        }
        System.out.println("Ingrese el id del empleado al que desea ponerle la incapacidad");
        Employee employee = searchEmployee(Integer.parseInt(lector.readLine()));
        if (employee != null) {
            asigDisabiity(employee);
            mainMenu();
        } else {
            System.out.println("El empleado no fue encontrado");
            System.out.println(" ");
            employeeManagement();
        }
    }

    private static Person asigDisabiity(Employee employee) throws IOException {
        System.out.println(" ");
        System.out.println("Fecha de incapacidad: ");
        Date fecha = Calendar.getInstance().getTime();
        employee.setDisabilityEntry(fecha);
        System.out.println(fecha);
        System.out.println("Ingrese los dias de incapacidad");
        int days = Integer.parseInt(lector.readLine());
        employee.setIncapacityDays(days);
        System.out.println("Ingrese el id de la incapacidad");
        int incapid = Integer.parseInt(lector.readLine());
        employee.setDisalibityId(incapid);
        return employee;
    }

    private static Person asigWorkday(Employee employee) throws IOException, InterruptedException {
        System.out.println("Tipo de jornada laboral\n----------------------- \n 1. Diurna \n 2. Nocturna");
        int typeWork = Integer.parseInt(lector.readLine());
        switch (typeWork) {
            case 1: {
                System.out.println("Asignar de horas laborales\n------------------------------");                             
                        System.out.println("Ingrese la hora de entrada");
                        String entryHour = lector.readLine();
                        employee.setEntryTime(entryHour + " a.m.");
                        System.out.println("Ingrese la hora de salida");
                        String outHour = lector.readLine();
                        employee.setDepartureTime(outHour + " p.m.");
                        mainMenu();
                break;
            }
            case 2: {
                System.out.println("Asignar de horas laborales\n------------------------------");
                        System.out.println("Ingrese la hora de entrada");
                        String entryHour2 = lector.readLine();
                        employee.setEntryTime(entryHour2 + " p.m.");
                        System.out.println("Ingrese la hora de salida");
                        String outHour2 = lector.readLine();
                        employee.setDepartureTime(outHour2 + " a.m.");
                        mainMenu();
                break;
            }
            default:{
                System.out.println("Opcion incorrecta");
                asigWorkday(employee);
            }
        }
        return employee;
    }

    private static void assignPayment() throws IOException, InterruptedException {
        System.out.println("Asignar de pago\n-------------------------");
        for (int i = 0; i < k; i++) {
            System.out.println("Id:" + employeeList[i].getId() + " Nombre: " + employeeList[i].getFirstName() + " Apellido: " + employeeList[i].getFirstLastName());
        }
        System.out.println("Ingrese el id del empleado al que desea pagarle");
        Employee employee = searchEmployee(Integer.parseInt(lector.readLine()));
        if (employee != null) {
            payment(employee);
            mainMenu();
        } else {
            System.out.println("El empleado no fue encontrado");
            System.out.println(" ");
            employeeManagement();
        }
    }

    private static Person payment(Employee employee) throws IOException {
        System.out.println("¿Cómo le pagará al empleado?\n 1. Cheque \n 2. Deposito \n 3. Efectivo");
        int type = Integer.parseInt(lector.readLine());
        switch (type) {
            case 1: {
                employee.setPaymentType("Cheque");
                break;
            }
            case 2: {
                employee.setPaymentType("Deposito");
                break;
            }
            case 3: {
                employee.setPaymentType("Efectivo");
                break;
            }
            default: {
                System.out.println("Ingrese una opción válida");
                payment(employee);
            }
        }
        netSalary = employee.getPositionEmployee().getSalary();
        netSalary = netSalary * 0.9;
        double salaryHour = netSalary / 192;
        double halfSalary = (salaryHour / 2);
        salaryHour = salaryHour + halfSalary;
        System.out.println("¿Cuántas horas extras trabajo el empleado? ");
        double extras = Double.parseDouble(lector.readLine());
        extras = extras * salaryHour;
        System.out.println("");
        netSalary = netSalary + extras;
        return employee;
    }

    private static void preloadPositions() throws IOException {
        Position position2 = new Position();
        position2.setId("1");
        position2.setKindPosition("Administrador");
        System.out.println("Cuál es el salario base de un administrador");
        position2.setSalary(Double.parseDouble(lector.readLine()));
        position[0] = position2;

        Position position1 = new Position();
        position1.setId("2");
        position1.setKindPosition("Conserje");
        System.out.println("Cuál es el salario base de un conserje");
        position1.setSalary(Double.parseDouble(lector.readLine()));
        position[1] = position1;

        Position position3 = new Position();
        position3.setId("3");
        position3.setKindPosition("Seguridad");
        System.out.println("Cuál es el salario base de un guarda");
        position3.setSalary(Double.parseDouble(lector.readLine()));
        position[2] = position3;

        Position position4 = new Position();
        position4.setId("4");
        position4.setKindPosition("Cajero");
        System.out.println("Cuál es el salario base de un cajero");
        position4.setSalary(Double.parseDouble(lector.readLine()));
        position[3] = position4;
    }
}
