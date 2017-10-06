/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep.lpoo.ej2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EpLpooEJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("seleccione telefono");
        System.out.println("1.movil1");
        System.out.println("2.movil2");
        System.out.println("3.movil3");
        int op1=input.nextInt();
        switch(op1){
            case 1:
                System.out.println("seleccione operador:");
                System.out.println("1=claro/2=movistar/3=entel");
                int op2=input.nextInt();
                switch(op2){
                    case 1:
                        System.out.println("seleccione plan:");
                        System.out.println("1.plan 99");
                        System.out.println("2.plan 109");
                        System.out.println("3.plan 199");
                        int op3=input.nextInt();
                        switch(op3){
                            case 1:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.5");
                                System.out.println("camara: 10mp");
                                System.out.println("procesador: 1.46 ghz");
                                System.out.println("operadora: claro");
                                System.out.println("plan 99");
                                System.out.println("precio total: $750");
                                break;
                            case 2:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.5");
                                System.out.println("camara: 10mp");
                                System.out.println("procesador: 1.46 ghz");
                                System.out.println("operadora: claro");
                                System.out.println("plan 109");
                                System.out.println("precio total: $752");
                                break;
                            case 3:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.5");
                                System.out.println("camara: 10mp");
                                System.out.println("procesador: 1.46 ghz");
                                System.out.println("operadora: claro");
                                System.out.println("plan 199");
                                System.out.println("precio total: $760");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("seleccione plan:");
                        System.out.println("1.plan 99");
                        System.out.println("2.plan 109");
                        System.out.println("3.plan 199");
                        int op4=input.nextInt();
                        switch(op4){
                            case 1:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.5");
                                System.out.println("camara: 10mp");
                                System.out.println("procesador: 1.46 ghz");
                                System.out.println("operadora: movistar");
                                System.out.println("plan 99");
                                System.out.println("precio total: $650");
                                break;
                            case 2:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.5");
                                System.out.println("camara: 10mp");
                                System.out.println("procesador: 1.46 ghz");
                                System.out.println("operadora: movidtar");
                                System.out.println("plan 109");
                                System.out.println("precio total: $670");
                                break;
                            case 3:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.5");
                                System.out.println("camara: 10mp");
                                System.out.println("procesador: 1.46 ghz");
                                System.out.println("operadora: movistar");
                                System.out.println("plan 199");
                                System.out.println("precio total: $680");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("seleccione plan:");
                        System.out.println("1.plan 99");
                        System.out.println("2.plan 109");
                        System.out.println("3.plan 199");
                        int op5=input.nextInt();
                        switch(op5){
                            case 1:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.5");
                                System.out.println("camara: 10mp");
                                System.out.println("procesador: 1.46 ghz");
                                System.out.println("operadora: entel");
                                System.out.println("plan 99");
                                System.out.println("precio total: $850");
                                break;
                            case 2:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.5");
                                System.out.println("camara: 10mp");
                                System.out.println("procesador: 1.46 ghz");
                                System.out.println("operadora: entel");
                                System.out.println("plan 109");
                                System.out.println("precio total: $950");
                                break;
                            case 3:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.5");
                                System.out.println("camara: 10mp");
                                System.out.println("procesador: 1.46 ghz");
                                System.out.println("operadora: entel");
                                System.out.println("plan 199");
                                System.out.println("precio total: $1050");
                                break;
                        }
                        break;
                }
                break;
            case 2:
                 System.out.println("seleccione operador:");
                System.out.println("1=claro/2=movistar/3=entel");
                int op6=input.nextInt();
                switch(op6){
                    case 1:
                        System.out.println("seleccione plan:");
                        System.out.println("1.plan 99");
                        System.out.println("2.plan 109");
                        System.out.println("3.plan 199");
                        int op7=input.nextInt();
                        switch(op7){
                            case 1:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.7");
                                System.out.println("camara: 12mp");
                                System.out.println("procesador: 1.67 ghz");
                                System.out.println("operadora: claro");
                                System.out.println("plan 99");
                                System.out.println("precio total: $1750");
                                break;
                            case 2:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.7");
                                System.out.println("camara: 12mp");
                                System.out.println("procesador: 1.67 ghz");
                                System.out.println("operadora: claro");
                                System.out.println("plan 109");
                                System.out.println("precio total: $1850");
                                break;
                            case 3:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.7");
                                System.out.println("camara: 12mp");
                                System.out.println("procesador: 1.67 ghz");
                                System.out.println("operadora: claro");
                                System.out.println("plan 199");
                                System.out.println("precio total: $1950");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("seleccione plan:");
                        System.out.println("1.plan 99");
                        System.out.println("2.plan 109");
                        System.out.println("3.plan 199");
                        int op8=input.nextInt();
                        switch(op8){
                            case 1:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.7");
                                System.out.println("camara: 12mp");
                                System.out.println("procesador: 1.67 ghz");
                                System.out.println("operadora: movistar");
                                System.out.println("plan 99");
                                System.out.println("precio total: $2450");
                                break;
                            case 2:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.7");
                                System.out.println("camara: 12mp");
                                System.out.println("procesador: 1.67 ghz");
                                System.out.println("operadora: movistar");
                                System.out.println("plan 109");
                                System.out.println("precio total: $2750");
                                break;
                            case 3:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.7");
                                System.out.println("camara: 12mp");
                                System.out.println("procesador: 1.67 ghz");
                                System.out.println("operadora: movistar");
                                System.out.println("plan 199");
                                System.out.println("precio total: $3050");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("seleccione plan:");
                        System.out.println("1.plan 99");
                        System.out.println("2.plan 109");
                        System.out.println("3.plan 199");
                        int op9=input.nextInt();
                        switch(op9){
                            case 1:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.7");
                                System.out.println("camara: 12mp");
                                System.out.println("procesador: 1.67 ghz");
                                System.out.println("operadora: entel");
                                System.out.println("plan 99");
                                System.out.println("precio total: $1050");
                                break;
                            case 2:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.7");
                                System.out.println("camara: 12mp");
                                System.out.println("procesador: 1.67 ghz");
                                System.out.println("operadora: entel");
                                System.out.println("plan 109");
                                System.out.println("precio total: $1090");
                                break;
                            case 3:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 4.7");
                                System.out.println("camara: 12mp");
                                System.out.println("procesador: 1.67 ghz");
                                System.out.println("operadora: entel");
                                System.out.println("plan 199");
                                System.out.println("precio total: $1250");
                                break;
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("seleccione operador:");
                System.out.println("1=claro/2=movistar/3=entel");
                int op9=input.nextInt();
                switch(op9){
                    case 1:
                        System.out.println("seleccione plan:");
                        System.out.println("1.plan 99");
                        System.out.println("2.plan 109");
                        System.out.println("3.plan 199");
                        int op10=input.nextInt();
                        switch(op10){
                            case 1:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 5.1");
                                System.out.println("camara: 7mp");
                                System.out.println("procesador: 2.03 ghz");
                                System.out.println("operadora: claro");
                                System.out.println("plan 99");
                                break;
                            case 2:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 5.1");
                                System.out.println("camara: 7mp");
                                System.out.println("procesador: 2.03 ghz");
                                System.out.println("operadora: claro");
                                System.out.println("plan 109");
                                break;
                            case 3:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 5.1");
                                System.out.println("camara: 7mp");
                                System.out.println("procesador: 2.03 ghz");
                                System.out.println("operadora: claro");
                                System.out.println("plan 199");
                                break;
                        } 
                        break;
                    case 2:
                        System.out.println("seleccione plan:");
                        System.out.println("1.plan 99");
                        System.out.println("2.plan 109");
                        System.out.println("3.plan 199");
                        int op11=input.nextInt();
                        switch(op11){
                            case 1:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 5.1");
                                System.out.println("camara: 7mp");
                                System.out.println("procesador: 2.03 ghz");
                                System.out.println("operadora: movistar");
                                System.out.println("plan 99");
                                break;
                            case 2:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 5.1");
                                System.out.println("camara: 7mp");
                                System.out.println("procesador: 2.03 ghz");
                                System.out.println("operadora: movistar");
                                System.out.println("plan 109");
                                break;
                            case 3:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 5.1");
                                System.out.println("camara: 7mp");
                                System.out.println("procesador: 2.03 ghz");
                                System.out.println("operadora: movistar");
                                System.out.println("plan 199");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("seleccione plan:");
                        System.out.println("1.plan 99");
                        System.out.println("2.plan 109");
                        System.out.println("3.plan 199");
                        int op12=input.nextInt();
                        switch(op12){
                            case 1:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 5.1");
                                System.out.println("camara: 7mp");
                                System.out.println("procesador: 2.03 ghz");
                                System.out.println("operadora: entel");
                                System.out.println("plan 99");
                                break;
                            case 2:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 5.1");
                                System.out.println("camara: 7mp");
                                System.out.println("procesador: 2.03 ghz");
                                System.out.println("operadora: entel");
                                System.out.println("plan 109");
                                break;
                            case 3:
                                System.out.println("caracteristicas:");
                                System.out.println("pantalla: 5.1");
                                System.out.println("camara: 7mp");
                                System.out.println("procesador: 2.03 ghz");
                                System.out.println("operadora: entel");
                                System.out.println("plan 199");
                                break;
                        }
                        break;
                }
                break;
                
        }
    }
    
}
