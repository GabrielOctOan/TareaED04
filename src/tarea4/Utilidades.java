/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

public class Utilidades {

    /*Determina si un año es bisiesto o no
     * 
     * @param anio El año a calcular
     * @return true si el año es bisiesto, falso en caso cotrario
     */
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    /*Convierte una velocidad en km/h a km/3.6s
     * @param km Velocidad km/h
     * @return kmh/3.6 Velocidad
    */
    public static double kmhAms(double kmh) {
        return kmh / 3.6;
    }
    
    /*Convierte grados decimales a grados radianes
     * @param grados
     * @return los grados convertidos a radieanes
    */

    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }
    /*Convierte grados
     * @param grados radianes 
     * @return  gradosaradianes
    */
    public static double gradosARadianes(int grados, int minutos, int segundos) {
        return gradosARadianes(grados + (minutos / 60.0) + (segundos / 3600.0));
    }
    /*Convierte grados celsius a fahrenheit
     * @param grados celsius
     * @return grados fahrenheit
    */

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    /*Convierte grados fahrenheit a grados celsius
     * @param grados fahrenheit
     * @return grados celsius
    */
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    /*Calcula el área de un circulo
     * @param radio de un circulo
     * @return el área de un circulo
    */
    public static double areaCirculo(double radio) {
        return Math.PI * alCuadrado(radio);
    }
    /*Calcula la longitud de una circuferencia
     * @param radio
     * @return el area de la circuferencia
    */
    public static double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }
    /*Calcula un núemro al cuadrado
     * @param num número
     * @return el número al cuadrado
    */
    public static double alCuadrado(double num) {
        return Math.pow(num, 2.0);
    }
    /*Calcula la hipotenusa
     * @param gcateto1
     * @param catet2
     * @return hipotenusa
    */
    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(alCuadrado(cateto1) + alCuadrado(cateto2));
    }
    /*Calcula el catetoA
     * @param hipotenusa
     * @param cateto2
     * @return catetoA
    */
    public static double catetoA(double hipotenusa, double cateto2) {
        return Math.sqrt(alCuadrado(hipotenusa) - alCuadrado(cateto2));
    }
    /*Convierte mph a km/H
     * @param mph
     * @return km/h
    */
    public static double mphAKmh(double mph) {
        return mph * 1.60934;
    }
    /*Convierte km/h a mph
     * @param km/h
     * @return mph
    */
    public static double kmhAMph(double kmh) {
        return kmh / 1.60934;
    }

}

