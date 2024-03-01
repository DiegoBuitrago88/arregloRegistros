
import java.util.Scanner;

public class ArregloRegistro {
    static class Ficha{
        String Equipo = "";
        int partidos = 0;
        int goles =0;
    }
    
    public static void main(String[] args) {      
        final int m = 3;
        Scanner sc = new Scanner(System.in);
        int sumaPartido=0;
        int sumagoles=0;
        Ficha vector[] = new Ficha [m];
        char resp = 'S';
        int cont =0;
        
        
        System.out.println("Deseas incluir nuevo registro? (S/N) ");
        resp = sc.next().charAt(0);
        String aux=sc.nextLine();
                
        while((resp=='S')|(resp=='s')){
           Ficha x = new Ficha();
           System.out.println("Digite Equipo ---> ");
           x.Equipo=sc.nextLine();
           
           System.out.println("Digite partidos Ganados  ---> ");
           x.partidos=sc.nextInt();
           
           System.out.println("Digite Goles a Favor ---> ");
           x.goles=sc.nextInt();
           
                     
           vector[cont]=x;
           cont++;
           
           System.out.println("Deseas incluir otro registro? (S/N) ");
           resp = sc.next().charAt(0);
           aux=sc.nextLine();
        }
        for(int i=0;i<cont;i++){
           System.out.println(vector[i].Equipo  +  " Partidos Ganados : " +vector[i].partidos + " Goles : " +vector[i].goles);
        }
        
        for(int i=0;i<cont;i++){
           sumaPartido=sumaPartido+vector[i].partidos;
           sumagoles = sumagoles+vector[i].goles;
        }
        float promP= sumaPartido/cont;
        System.out.println("PROMEDIO DE PARTIDOS GANADOS: : "+promP);
         
        int promG = (int) sumagoles;
        System.out.println("TOTAL DE GOLES : "+promG);
    }
    
}
