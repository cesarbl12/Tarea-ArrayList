import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreadorCirculos cr = new CreadorCirculos();
        Scanner scanner = new Scanner(System.in);
        int opcionMenu;
        boolean salir = false;

        while(!salir) {
            System.out.println("~~~Menu~~~");
            System.out.println("1) Agregar un circulo");
            System.out.println("2) Modificar un circulo");
            System.out.println("3) Eliminar un circulo");
            System.out.println("4) Mostrar circulos");
            System.out.println("5) Eliminar todos los circulos");
            System.out.println("6) Agregar 5 circulos aleatorios");
            System.out.println("7) Circulos con area mayor al promedio");
            System.out.println("8) Salir");
            System.out.print("Seleccione una opcion: ");
            opcionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.print("Ingrese el radio del circulo: ");
                    double radioNuevo = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Ingrese el color del circulo: ");
                    String colorNuevo = scanner.nextLine();

                    System.out.print("Ingrese la coordenada en x del circulo: ");
                    int x = scanner.nextInt();

                    System.out.print("Ingrese la coordenada en y del circulo: ");
                    int y = scanner.nextInt();

                    Circulo circuloNuevo = new Circulo(radioNuevo, colorNuevo, x, y);
                    cr.agregarCirculo(circuloNuevo);
                    break;

                case 2:
                    int opcionModificar;
                    System.out.println("~~~Circulos~~~");
                    cr.mostraCirculos();
                    System.out.print("Seleccione un circulo: ");
                    int circuloAModificar = scanner.nextInt();
                    System.out.println("1) Modificar radio");
                    System.out.println("2) Modificar Color");
                    System.out.println("3) Modificar posicion en X");
                    System.out.println("4) Modificar posicion en Y");
                    System.out.println("¿Que desea modificar?");
                    opcionModificar = scanner.nextInt();
                    switch(opcionModificar){
                        case 1:
                            System.out.print("Ingrese el nuevo radio: ");
                            int nuevoRadio = scanner.nextInt();
                            Circulo newCirculoRadio = cr.getCirculo(circuloAModificar);
                            newCirculoRadio.setRadio(nuevoRadio);
                            break;
                        case 2:
                            System.out.print("Ingrese el nuevo color: ");
                            String newColor = scanner.nextLine();
                            Circulo newCirculoColor = cr.getCirculo(circuloAModificar);
                            newCirculoColor.setColor(newColor);
                            break;
                        case 3:
                            System.out.print("Ingrese la nueva coordenada en X: ");
                            int newCoordenadaX = scanner.nextInt();
                            Circulo newCirculoX = cr.getCirculo(circuloAModificar);
                            newCirculoX.setPosX(newCoordenadaX);
                            break;
                        case 4:
                            System.out.print("Ingrese la nueva coordenada en Y: ");
                            int newCoordenadaY = scanner.nextInt();
                            Circulo newCirculoY = cr.getCirculo(circuloAModificar);
                            newCirculoY.setPosY(newCoordenadaY);
                            break;
                        default:
                            System.out.println("Error al cambiar datos del circulo");
                    }
                    break;

                case 3:
                    System.out.println("~~~Circulos~~~");
                    cr.mostraCirculos();
                    System.out.print("Seleccione un circulo: ");
                    int circuloAEliminar = scanner.nextInt();
                    cr.eliminarCirculo(circuloAEliminar);
                    break;

                case 4:
                    System.out.println("~~~Circulos~~~");
                    cr.mostraCirculos();
                    break;

                case 5:
                    System.out.println("¿Desea eliminar todos los circulos?(s/n)");
                    char eliminar = scanner.next().charAt(0);
                    cr.eliminarTodo(eliminar);
                    break;

                case 6:
                    cr.agregar5CirculosAleatorios();
                    break;

                case 7:
                    cr.mostrarMayoresAlAreaPromedio();
                    break;

                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
}