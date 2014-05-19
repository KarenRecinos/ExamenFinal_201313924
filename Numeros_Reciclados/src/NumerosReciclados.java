/**
 * Created by Karen on 17/05/14.
 */

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class NumerosReciclados {

    public static String leerTexto(String ruta){

        String texto = "";
        String numero1 ="";
        String numero2 ="";
        File archivo = new File(ruta);
        int numLines=0;

        try {

            FileReader fr = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(fr);
            boolean fin = false;
            StringBuffer sbf = new StringBuffer(); //guarda lineas de texto
            String nl = System.getProperty("line.separator");  // salta lineas de texto
            String linea = buffer.readLine();
            StringTokenizer st = new StringTokenizer(linea);

            while (st.hasMoreTokens()){
                numero1 = st.nextToken();
                numero2 = st.nextToken();
                NumerosReciclados n1= new NumerosReciclados();
                n1.Ordenar(numero1, numero2);
            }

            while(fin == false){
                 linea = buffer.readLine();

                if(linea != null){
                    sbf.append(linea + nl);
                }
                else{
                    fin = true;
                }
                numLines++;
            }
            texto = sbf.toString();
            System.out.print(numLines);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return texto;
    }

    public void Ordenar(String numero1, String numero2){
        int num1;
        int num2;
        int num3;
        int contador =0;

        num1 = Integer.parseInt(numero1.toString());
        num2 = Integer.parseInt(numero2.toString());

        for (int x=num1; x<=num2; x++){
            num3 = x;
            if (num3<=10){
                contador = contador +0;
            }
            else{
                if(num3%10==0){
                    contador = contador+0;
                }
                else {
                    if((num3>10)&&(num3<99)){
                        int d1, d2 = 0;
                        int temp = 0;
                        d1  = num3/10;
                        d2 = (num3%10);
                        temp = d1;
                        d1 = d2;
                        d2 = temp;
                        temp = (d1*10) + d2;
                        for(int y=num1; y<=num2; y++){
                            if(temp==y){
                                contador = contador + 1;
                            }
                            else{
                                contador = contador +0;
                            }
                        }
                    }
                    else {
                        if((num3>99)&&(num3<999)){
                            int d1, d2, d3 = 0;
                            int temp,temp1 = 0;
                            d1  = num3/100;
                            d2 = (num3%100)/10;
                            d3 = (num3%10);
                            temp = d1;
                            d1 = d2;
                            d2 = d3;
                            d3 = temp;
                            temp = (d1*100) + (d2*10) +d3;

                            temp1 = d1;
                            d1 =d3;
                            d3 =d2;
                            d2 = temp1;
                            temp1 = (d1*100)+(d2*10) + d3;
                            for(int y=num1; y<=num2; y++){
                                if(temp==y){
                                    contador = contador + 1;
                                }
                                else{
                                    if (temp1==y){
                                        contador = contador +1;
                                    }
                                    else{
                                        contador = contador+0;
                                    }
                                }
                            }
                        }
                        else{
                            if((num3>999)&&(num3<9999)){
                                int d1, d2, d3, d4 = 0;
                                int temp = 0;
                                d1  = num3/1000;
                                d2 = (num3%1000)/100;
                                d3 = (num3%100)/10;
                                d4 = (num3%10);
                                temp = d1;
                                d1 = d3;
                                d3 = temp;
                                temp = d2;
                                d2 = d4;
                                d4 = temp;
                                temp = (d1*1000) + (d2*100) +(d3*10) +d4;

                                for(int y=num1; y<=num2; y++){
                                    if(temp==y){
                                        contador = contador + 1;
                                    }
                                    else{
                                            contador = contador+0;
                                     }
                                }
                            }
                            else{
                                if((num3>9999)&&(num3<99999)){
                                    int d1, d2, d3, d4, d5 = 0;
                                    int temp, temp1 = 0;
                                    d1  = num3/10000;
                                    d2 = (num3%10000)/1000;
                                    d3 = (num3%1000)/100;
                                    d4 = (num3%100)/10;
                                    d5 = (num3%10);
                                    temp = d1;
                                    d1 = d3;
                                    d3 = d5;
                                    d5 = d2;
                                    d2 = d4;
                                    d4 = temp;
                                    temp = (d1*10000)+(d2*1000)+(d3*100)+(d4*10)+d5;

                                    temp1 = d1;
                                    d1= d4;
                                    d4 = d2;
                                    d2 =d5;
                                    d5= d3;
                                    d3= temp1;
                                    temp1 = (d1*10000)+(d2*1000)+(d3*100)+(d4*10)+d5;
                                    for(int y=num1; y<=num2; y++){
                                        if(temp==y){
                                            contador = contador + 1;
                                        }
                                        else{
                                            if(temp1==y){
                                                contador = contador +1;
                                            }
                                            else{
                                            contador = contador+0;
                                            }
                                        }
                                    }
                                }
                                else {
                                    if((num3>99999)&&(num3<999999)){
                                        int d1, d2, d3, d4, d5, d6 = 0;
                                        int temp = 0;
                                        d1  = num3/100000;
                                        d2 = (num3%100000)/10000;
                                        d3 = (num3%10000)/1000;
                                        d4 = (num3%1000)/100;
                                        d5 = (num3%100)/10;
                                        d6 = (num3%10);
                                        temp = d1;
                                        d1 = d4;
                                        d4 = temp;
                                        temp = d2;
                                        d2 = d5;
                                        d5 = temp;
                                        temp = d3;
                                        d3 = d6;
                                        d6 = temp;
                                        temp = (d1*100000)+(d2*10000)+(d3*1000)+(d4*100)+(d5*10)+d6;

                                        for(int y=num1; y<=num2; y++){
                                            if(temp==y){
                                                contador = contador + 1;
                                            }
                                            else{
                                                contador = contador+0;
                                            }
                                        }
                                    }
                                    else{
                                        if((num3>999999)&&(num3<9999999)){
                                            int d1, d2, d3, d4, d5, d6, d7 = 0;
                                            int temp, temp1 = 0;
                                            d1  = num3/1000000;
                                            d2 = (num3%1000000)/100000;
                                            d3 = (num3%100000)/10000;
                                            d4 = (num3%10000)/1000;
                                            d5 = (num3%1000)/100;
                                            d6 = (num3%100)/10;
                                            d7 = (num3%10);
                                            temp = d1;
                                            d1 = d5;
                                            d5 = d2;
                                            d2 = d6;
                                            d6 = d3;
                                            d3 = d7;
                                            d7 = d4;
                                            d4 = temp;
                                            temp = (d1*1000000)+(d2*100000)+(d3*10000)+(d4*1000)+(d5*100)+(d6*10)+d7;

                                            temp1 = d1;
                                            d1= d4;
                                            d4 = d7;
                                            d7 =d3;
                                            d3= d6;
                                            d6 =d2;
                                            d2= d5;
                                            d5 = temp1;
                                            temp1 = (d1*1000000)+(d2*100000)+(d3*10000)+(d4*1000)+(d5*100)+(d6*10)+d7;
                                            for(int y=num1; y<=num2; y++){
                                                if(temp==y){
                                                    contador = contador + 1;
                                                }
                                                else{
                                                    if(temp1==y){
                                                        contador = contador +1;
                                                    }
                                                    else{
                                                        contador = contador+0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.print("caso"+contador+"\n");
        if(num1==num2){
            contador = contador +1;
            System.out.print("caso"+contador+"\n");
        }
        else{
            contador = contador+0;
        }
    }
    public static void main(String[] args) {
        String nota = NumerosReciclados.leerTexto("numeros.txt");
        System.out.println(nota);

        // LeerArchivo leer = LeerArchivo();
        //leer.leerArch("numeros.txt");
    }
}