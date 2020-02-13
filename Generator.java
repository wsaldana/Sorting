/**
 * @author Walter Saldaña
 * 
 * Clase que genera 3000 numeros aleatorios y los almacena en un archivo de texto
 */

 import java.io.*;
import java.util.ArrayList;
import java.util.Random;

 public class Generator{

    /**
     * Constructor sin parametros
     */
     public Generator(){}

     /**
      * metodo que genera los numeros alreatorios en el archivo datos.txt
      */
    public void create(){
        String cad = "";

        //Generacion de numeros aleatorios
        for(int i = 0; i<3000; i++){
            Random rand = new Random();
            int n = rand.nextInt(3000);
            cad += String.valueOf(n) + "\n";
        }
        cad = cad.substring(0, cad.length() - 1); //Eliminando espacio en blanco

        //Manejo de archivos txt
        try{
            String verify, putData;
            File file = new File("datos.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(cad);
            bw.flush();
            bw.close();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
     }

     public ArrayList<Integer> leer(){
        ArrayList<Integer> arreglo = new ArrayList<Integer>();
         try {
            File file = new File("datos.txt");
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            while((line = br.readLine()) != null){
                arreglo.add(Integer.parseInt(line));
                //System.out.println(line);
            }
            br.close();
         }catch (Exception e) {
            System.out.println("Ocurrio un Error con el Archivo");
         }
         return arreglo;
     }

 }