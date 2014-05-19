/**
 * Created by Karen on 18/05/14.
 */

import java.io.*;
import java.util.StringTokenizer;

public class LeerArchivo{
    File archivo;
    FileReader lector;
    BufferedReader buffer;
    String contenido="";
    StringTokenizer st;
    String linea;
    String numero1;
    String numero2;

   /* st = new StringTokenizer(linea);
    while (st.hasMoreTokens()){
        numero1 = st.nextToken();
        numero2 = st.nextToken();

        System.out.println(numero1 + " ");
        System.out.println(numero2 + " ");
    }*/

    public LeerArchivo(){
        contenido="";
        buffer=null;
        lector=null;
        archivo=null;
    }

    public String leerArch(String direccion){
        contenido="";
        //Iniciamos la lectura del archivo
        try{
            archivo = new File(direccion);
            lector = new FileReader(archivo);
            buffer = new BufferedReader(lector);
            st = new StringTokenizer(linea);

            while((linea=buffer.readLine())!=null){
                if(contenido.length()==0)
                {
                    contenido=linea;
                    while (st.hasMoreTokens()){
                        String numero1 = st.nextToken();
                        String numero2 = st.nextToken();

                        System.out.println(numero1 + " ");
                        System.out.println(numero2 + " ");
                    }
                }else{
                    contenido+="\n"+linea;
                }
            }
        }catch(Exception ex){//Si hay un error imprimimos el error
            System.out.println(ex.getMessage());
        }

        //Cerramos el fichero al finalizar cualquier accion
        try{
            if(lector!=null)
            {
                lector.close();
                buffer.close();
            }
        }catch(Exception ex){//Si hay un error imprimimos el error
            System.out.println(ex.getMessage());
        }

        return contenido;
    }
}
