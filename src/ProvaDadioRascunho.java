import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class ProvaDadioRascunho {
    public static void main(String[] args) throws IOException {
       String linha;
       Double n;
       int Pos, i;
 
       Pos=0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       for (double count = 1; count <= 3; ++count     ) {
           linha = br.readLine();
           n = Double.parseDouble(linha);
           if(n>=0    )Pos++;
       }
 
       System.out.println("" + Pos + " valores positivos");
    }
}