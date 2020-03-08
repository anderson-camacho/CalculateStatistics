package datosestadisticos;

import java.util.Arrays;

/**
 * @Title: Entregable de clase.
 * @author SinH camachosinh@gmail.com
 */
public class Estadisitica extends FrontEndOpera {

    /*  Variables  */
    private int intNumeroDatos;
    private int[] intListaDatos;
    private int[] intListaDatosOrdenados;
    private double dblMediaAritmetica;
    private int[] intModaEstadistica;
    private int[][] intMatrizDesviacionEstandar;
    private double dblDesviacionEstandar;

    /*  Constructores  */
    public Estadisitica() {
    }

    public Estadisitica(int intNumeroDatos) {
        this.intNumeroDatos = intNumeroDatos;

    }

    /*  getters and setters  */
    public int getIntNumeroDatos() {
        return intNumeroDatos;
    }

    public void setIntNumeroDatos(int intNumeroDatos) {
        this.intNumeroDatos = intNumeroDatos;
    }

    public int[] getIntListaDatos() {
        return intListaDatos;
    }

    public void setIntListaDatos(int[] intListaDatos) {
        this.intListaDatos = intListaDatos;
    }

    public int[] getIntListaDatosOrdenados() {
        return intListaDatosOrdenados;
    }

    public void setIntListaDatosOrdenados(int[] intListaDatosOrdenados) {
        this.intListaDatosOrdenados = intListaDatosOrdenados;
    }

    public double getDblMediaAritmetica() {
        return dblMediaAritmetica;
    }

    public void setDblMediaAritmetica(double dblMediaAritmetica) {
        this.dblMediaAritmetica = dblMediaAritmetica;
    }

    public int[] getIntModaEstadistica() {
        return intModaEstadistica;
    }

    public void setIntModaEstadistica(int[] intModaEstadistica) {
        this.intModaEstadistica = intModaEstadistica;
    }

    public int[][] getIntMatrizDesviacionEstandar() {
        return intMatrizDesviacionEstandar;
    }

    public void setIntMatrizDesviacionEstandar(int[][] intMatrizDesviacionEstandar) {
        this.intMatrizDesviacionEstandar = intMatrizDesviacionEstandar;
    }

    public double getDblDesviacionEstandar() {
        return dblDesviacionEstandar;
    }

    public void setDblDesviacionEstandar(double dblDesviacionEstandar) {
        this.dblDesviacionEstandar = dblDesviacionEstandar;
    }

    /*  Methods  */
    //Generate number Ramdom type Double
    private double dblGenerarAleatorio() {
        double dblNumeroAleatorio;
        dblNumeroAleatorio = (double) (Math.random() * 20) + 1;
        return dblNumeroAleatorio;
    }

    //Generador de numero aleatorios tipo Integer
    private int intGenerarAleatorio() {
        int dblNumeroAleatorio;
        dblNumeroAleatorio = (int) (Math.random() * 20) + 1;
        return dblNumeroAleatorio;
    }

    //Generar la cantidad de datos que tendra la lista
    private void GenerarCantidadNumerosAleatorios() {
        int intLocalNumeroDatos;
        intLocalNumeroDatos = intGenerarAleatorio();
        this.intNumeroDatos = intLocalNumeroDatos;
        System.out.println("El valor anexado a inNumero datos es: " + this.intNumeroDatos);
    }

    //incializador de la lista de datos cuando se anexa el valor de datos que tendra la misma
    private void InicializarListaDatos() {
        this.intListaDatos = new int[this.intNumeroDatos];
        this.intListaDatosOrdenados = new int[this.intNumeroDatos];
    }

    //Almacenar datos en la lista de forma aleatoria
    private void AlmacenarListaDatos() {
        int dblValorAleatorioAsignar;
        for (int i = 0; i < this.intNumeroDatos; i++) {
            dblValorAleatorioAsignar = intGenerarAleatorio();
            this.intListaDatos[i] = dblValorAleatorioAsignar;
        }
    }

    //Calcular media aritmetica returna un valor espcifico
    private double CalcularMedia() {
        double dblLocalMediaAritmetica = 0;
        for (int i = 0; i < this.intNumeroDatos; i++) {
            dblLocalMediaAritmetica = this.intListaDatos[i] + dblLocalMediaAritmetica;
        }
        this.dblMediaAritmetica = dblLocalMediaAritmetica / this.intNumeroDatos;
        return dblLocalMediaAritmetica;
    }

    //Ordenador de datos generado para poder sacar la moda
    private void OrdenarListaDatos() {
        System.arraycopy(this.intListaDatos, 0, this.intListaDatosOrdenados, 0, this.intNumeroDatos);
        Arrays.sort(this.intListaDatosOrdenados);
        /*
        Pruebas unitarias del ordenador.
        for (int i = 0; i < this.intNumeroDatos; i++) {
            System.out.println("dato f " + (i + 1) + " es " + this.intListaDatos[i]);
        }
        for (int i = 0; i < this.intNumeroDatos; i++) {
            System.out.println("dato " + (i + 1) + " es " + this.intListaDatosOrdenados[i]);
        }
        for (int intListaDatosOrdenados : intListaDatosOrdenados) {
            System.out.println(intListaDatosOrdenados);
        }
         */
    }

    //Genewerador de Moda Estaditica
    private void CalcularModa() {
        int[] intCantidadUnitariaDatos = new int[this.intNumeroDatos];
        for (int i = 0; i < this.intNumeroDatos; i++) {//Esapcio en el cual se hace recorrido y sumatoria de los datos repetidos
            intCantidadUnitariaDatos[this.intListaDatosOrdenados[i] - 1] = (intCantidadUnitariaDatos[this.intListaDatosOrdenados[i] - 1] + 1);
        }

        int intDato = 0;
        int intRepeticiones = 0;
        for (int i = 0; i < this.intNumeroDatos; i++) {
            if (intCantidadUnitariaDatos[i] > intDato) {
                intDato = intCantidadUnitariaDatos[i];
                intRepeticiones = 1;
            } else {
                if (intCantidadUnitariaDatos[i] == intDato) {
                    intRepeticiones++;
                } else {
//                    System.out.println("Dato menor que el valor");
                }
            }
        }
        int[] intModaLocal = new int[intRepeticiones];
        int intRecorridoModa = 0;
        for (int i = 0; i < this.intNumeroDatos; i++) {
            if (intCantidadUnitariaDatos[i] == intDato) {
                intModaLocal[intRecorridoModa] = i + 1;
                intRecorridoModa++;
            } else {

//                System.out.println("Datos no pertenece a la moda");
            }
        }
        /*
        for (int intListaDatosOrdenados : intListaDatosOrdenados) {
            System.out.print(intListaDatosOrdenados + " ");
        }
        for (int i = 0; i < intModaLocal.length; i++) {
            System.out.println("\nModa lista: " + intModaLocal[i]);
        }*/
        this.intModaEstadistica = intModaLocal;
    }

//Calculate the number for Deviation Standard
    private void CalcularDesviacionEstandar() {
        //realizar desvicaion con formula especificada
        //s=sqrt((sumatoria(x-media))/numero de datos - 1)
        double intSumatoria = 0.0; //(x-media)
        double a = 0.0;
        for (int i = 0; i < this.intNumeroDatos; i++) {
            a = (double) this.intListaDatosOrdenados[i] - this.dblMediaAritmetica;
            a = Math.pow(a, 2);
            intSumatoria = intSumatoria + a;
        }
        double intLocalDesviacionEstandar;
        intLocalDesviacionEstandar = Math.sqrt((a) / (this.intNumeroDatos - 1));
        this.dblDesviacionEstandar = intLocalDesviacionEstandar;
//        System.out.println("dsuma: " + intLocalDesviacionEstandar);
    }

    /*Contac FrontEndOpera*/
    void BotonCalcular() {
        InicializarListaDatos();
        AlmacenarListaDatos();
        OrdenarListaDatos();
        CalcularMedia();
        CalcularModa();
        CalcularDesviacionEstandar();
    }

}
