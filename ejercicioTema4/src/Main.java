public class Main {
    public static void main(String[] args) {

        // CONDICIONALES

        int numeroIf = 1;

        if (numeroIf > 0) {
            System.out.println("es positivo");
        } else if (numeroIf < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println("es 0");
        }

        //BUCLE WHILE

        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //BUCLE DO-WHILE

        int numDoWhile = 0;

         do{
             System.out.println(numDoWhile);
             numDoWhile++;
         }
         while (numDoWhile < 1);


         //BUCLE FOR

         for (int numeroFor=0; numeroFor<3; numeroFor++) {
             System.out.println(numeroFor);
         }


         //SWITCH CASE

         var estacion = "OTOÑO";

         switch(estacion) {
             case "VERANO":
                 System.out.println("es verano");
                 break;

             case "OTOÑO":
                 System.out.println("es otoño");
                 break;

             case "PRIMAVERA":
                 System.out.println("es primavera");
                 break;

             case "INVIERNO":
                 System.out.println("es invierno");
                 break;

             default:
                 System.out.println("ingrese una estacion");




        }

    }


}