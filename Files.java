import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Files {
    
    public int[] fileToIntArray(String fileName){
        File file; //apuntar a un archivo fisico de disco duro
        FileReader reader; //llave con permiso de solo lectura 
        BufferedReader bufer;
        String linea; //una linea del archivo 
        int[] array = null; //arreglo de numeros resultante 
        int i=0; //indice
        int t; //tamaño
        try{
            t = countFiles(fileName);
            array = new int[t];
            file = new File("C:\\archivos\\" + fileName);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
        }catch(Exception e){
            System.out.println("Error al leer el archivo:" + e.toString());
        }
    }
    
}
