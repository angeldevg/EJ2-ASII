/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2asii;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author Evelyn
 */
public class LeerArchivo  implements ILeer {
 
    public void leerarchivo(String archivo) {
      File archivovar = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivovar = new File (archivo);
         fr = new FileReader (archivovar);
         br = new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null)
            System.out.println(linea);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
    
    
    
}
