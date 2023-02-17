
package s5.e1p1_eduardochinchilla;

import java.util.Scanner;

public class E1P1_EduardoChinchilla {
    
    static Scanner read= new Scanner(System.in);
    
    public static void main(String[] args) {
        
         int opcion =0;
      
         do{
          
           
           System.out.println("Menu");
           System.out.println("1. Numero Valido");
           System.out.println("2. Reordenado de Cadenas ");
           System.out.println("3. Trigonometria");
           System.out.println("4. Salir");
           
           opcion = read.nextInt();
           
           switch(opcion){
               case 1:{
                   System.out.println("Ingrese cadena a reordenar: ");
                   String s = read.next();
                   numero_valido(s);
                   break;
               }
               case 2:{
                   System.out.println("Ingrese la cadena que desea reordenar: ");
                   String s = read.next();
                   reordenar_cadenas(s);
                   break;
               }
               case 3:{
                   System.out.println("Ingrese el angulo que desea calcular: ");
                   double angulo = read.nextDouble();
                   System.out.println("Ingrese la precision deseada: ");
                   int precision = read.nextInt();
                   trigonometria(angulo,precision);
                   break;
               }
               
               
               
               
               
               
               default:
           }// fin switch
                   
       }//fin do while
       while(opcion !=4);
    }//fin main
    public static void numero_valido(String s){
        String negativo = "";
        String punto = "";
        boolean t= true;
        char pos;
        int pos1;

        for (int i = 0; i<s.length();i++){
            pos = s.charAt(i);
            pos1 = pos;
            if(pos1> 45 && pos1 <47){
            t=true;
            
            }else if(pos1>44 && pos1<46){
              t=true;
              
            }else if(t==true){
                System.out.print("El numero es valido");
            }else{
                System.out.println("el numero no es valido");
            }
           
      }
         

    }
    public static void reordenar_cadenas(String s){
        String num = "";
        String min = "";
        String mayus = "";
        String sym = "";
        String cadenanueva="";
        int numero=0;
        char let;
        char symb;
        char may;
        char minu;
        int mayusculas;
        int minusculas;
        int symb2;
        for (int i = 0; i<s.length();i++){
            let = s.charAt(i);
               numero = let;
               if (numero>=48 && numero<=57){
                   num = num + let;
                   
               }
           }
           
           for (int j = 0; j<s.length();j++){
               symb = s.charAt(j);
               symb2 = symb;
               if (symb2>=1 && symb2<=47 || symb2>=58 && symb2<=64){
                   sym = sym + symb;
                   
               }
           }
         
           for (int k=0; k<s.length();k++){
               may = s.charAt(k);
               mayusculas = may;
               if (mayusculas>=65 && mayusculas <=90){
                   mayus = mayus + may;
                   
           }
           }
       
           for (int l = 0; l<s.length();l++){
               minu = s.charAt(l);
               minusculas = minu;
               if(minusculas>=97 && minusculas<=122){
                   min = min + minu;
                   
               }
           }
           
           System.out.println("La cadena ordenada es: "+num+min+mayus+sym);
           
    }
    public static void trigonometria(double angulo,int precision){
        double angrad = angulo * Math.PI/180;
        double arriba = 0;
        double factorial=precision;
        double contador2=precision;
        int exponente=0;
        double division=0;
        int cont = 0;
        double result = 0;
 
        while (cont<=precision){
            int i = cont+1;
            exponente=(2*i+1);
            
            arriba = (Math.pow(-1, i)* Math.pow(angrad,exponente));
            
            contador2=(2*i+1);
            factorial=(2*i+1);
             do{
           
            contador2--;
            factorial= factorial*(contador2);
            }
            while(contador2>1);
             
             division=division + (arriba/factorial);
           
            ;
            cont++;
            
        }
        System.out.print("sin"+angrad + "=" +division);
    }
}//fin class
