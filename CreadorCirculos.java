import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CreadorCirculos{
    private ArrayList<Circulo> circulos;
    private String[] colores = {"Blanco", "Azul", "Rojo", "Verde", "Morado", "Amarillo", "Negro"};

    public CreadorCirculos(){
        circulos = new ArrayList<>();
    }

    public void agregarCirculo(Circulo circuloNuevo){
        circulos.add(circuloNuevo);
    }

    public double calcularAreaPromedio(){
        double promedios=0;
        int cont=0;
        for(Circulo i : circulos){
            promedios += i.getArea();
            cont++;
        }

        if(cont>0){
            promedios = promedios / cont;
        }

        return promedios;
    }

    public void  agregar5CirculosAleatorios(){
        Random rmd = new Random();
        for(int i=0; i<5; i++){
            int radioRandom = rmd.nextInt(6) + 1;
            int x = rmd.nextInt(500) + 1;
            int y = rmd.nextInt(500) + 1;
            int colorRandom = rmd.nextInt(colores.length);
            String colorNuevo = colores[colorRandom];
            Circulo circuloNuevo = new Circulo(radioRandom, colorNuevo, x, y);
            circulos.add(circuloNuevo);
        }
    }


    public void mostrarMayoresAlAreaPromedio(){
        circulos.forEach((e) -> {
            if(e.getArea() > calcularAreaPromedio()) {
                System.out.println("Circulo con area mayor a promedio: " + e.toString());
            }
        });
    }


    public boolean esMayorAlAreaPromedio(Circulo circuloNuevo){
        if(circuloNuevo.getArea() > calcularAreaPromedio()) {
            return true;
        }
        return false;
    }

    public void mostraCirculos(){
        for(Circulo i : circulos){
            System.out.println(circulos.indexOf(i) + ") "+ i.toString());
        }
    }

    public Circulo getCirculo(int index){
        return circulos.get(index);
    }

    public void eliminarCirculo(int index){
        circulos.remove(index);
    }

    public void eliminarTodo(char eliminar){
        if(eliminar == 's' || eliminar == 'S'){
            System.out.println("Se han eliminado todos los circulos");
            circulos.clear();
        }

    }
}
