import java.util.Scanner;

public class MenuFM {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int respuesta = 0;
        int contador = 0;
        int cantidadLados;
        Double areaL, areaT, volumen, area;
        Double longitudLados, altura, anchura, diagonal;
        Double generatriz, arista, numeroGrados, base;
        Double radioMenor, radio, radioMayor, longMayor, longMenor;

        do {
            try {
            System.out.println("Menu de opciones: ");
            System.out.println("1. Prisma");
            System.out.println("2. Cilindro");
            System.out.println("3. Piramide");
            System.out.println("4. Cono");
            System.out.println("5. Esfera");
            System.out.println("6. Zona esferica");
            System.out.println("7. Casquete esferico");
            System.out.println("8. Huso esferico y cuña esferica");
            System.out.println("9. Ortoedro");
            System.out.println("10. Tetraedro");
            System.out.println("11. Hexaedro");
            System.out.println("12. Octaedro");
            System.out.println("13. Dodecaedro");
            System.out.println("14. Icosaedro");
            System.out.println("15. Tronco de cono");
            System.out.println("16. Tronco de piramide");
            respuesta = lector.nextInt();
            contador++;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ingrese un valor valido.");
                lector.nextLine();
            }
        } while (respuesta > 12 || respuesta < 0 && contador < 3);

        switch (respuesta) {
            case 1:
                System.out.println("1. Prisma");

                System.out.println("Ingrese la cantidad de lados: ");
                cantidadLados = lector.nextInt();
                System.out.println("Ingrese la longitud de los lados: ");
                longitudLados = lector.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura = lector.nextDouble();

                areaL = aLPrisma(cantidadLados, longitudLados, altura);
                areaT = aTPrisma(longitudLados, cantidadLados, altura);
                volumen = vPrisma(altura, cantidadLados, longitudLados);

                System.out.println("Area lateral: " + areaL);
                System.out.println("Area total: " + areaT);
                System.out.println("Volumen: " + volumen);
            break;

            case 2:
                System.out.println("2. Cilindro");

                System.out.println("Ingrese el radio: ");
                radio = lector.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura = lector.nextDouble();

                areaL = aLCilindro(radio, altura);
                areaT = aTCilindro(radio, altura);
                volumen = vCilindro(altura, radio);

                System.out.println("Area lateral : " + areaL);             
                System.out.println("Area total : " + areaT);
                System.out.println("Volumen : " + volumen);

            break;

            case 3:
                System.out.println("3. Piramide");

                System.out.println("Ingrese la altura: ");
                altura = lector.nextDouble();
                System.out.println("Ingrese la longitud de los lados");
                longitudLados = lector.nextDouble();
                System.out.println("Ingrese la anchura de los lados");
                anchura = lector.nextDouble();

                areaL = aLPiramide(altura, anchura, longitudLados);
                areaT = aTPiramide(longitudLados, altura, anchura);
                volumen = vPiramide(longitudLados, altura);

                System.out.println("Area lateral: " + areaL);
                System.out.println("Area total" + areaT);
                System.out.println("Volumen: " + volumen);

            break;

            case 4:
                System.out.println("4. Cono");

                System.out.println("Ingrese el radio: ");
                radio = lector.nextDouble();
                System.out.println("Ingrese la generatriz: ");
                generatriz = lector.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura = lector.nextDouble();
               
                areaL = aLCono(radio, generatriz);
                areaT = aTCono(radio, generatriz);
                volumen = vCono(altura, radio);

                System.out.println("Area lateral: " + areaL);
                System.out.println("Area total: " + areaT);
                System.out.println("Volumen: " + volumen);

            break;

            case 5:
                System.out.println("5. Esfera");

                System.out.println("Ingrese el radio");
                radio = lector.nextDouble();

                area = aEsfera(radio);
                volumen = vEsfera(radio);

                System.out.println("Area: " + area);
                System.out.println("Volumen: " + volumen);

            break;

            case 6:
                System.out.println("6. Zona esferica");

                System.out.println("Ingrese la altura: ");
                altura = lector.nextDouble();
                System.out.println("Ingrese el radio menor: ");
                radioMenor = lector.nextDouble();
                System.out.println("Ingrese el radio mayor: ");
                radioMayor = lector.nextDouble();

                area = aZEsferica(radioMayor, altura);
                volumen = vZEsferica(radioMenor, radioMayor, altura);

                System.out.println("Area: " + area);
                System.out.println("Volumen: " + volumen);

            break;

            case 7:
                System.out.println("7. Casquete esferico");

                System.out.println("Ingrese el radio mayor de la esfera: ");
                radioMayor = lector.nextDouble();
                System.out.println("Ingrese la altura de la esfera: ");
                altura = lector.nextDouble();

                area = aCEsferico(radioMayor, altura);
                volumen = vCEsferico(radioMayor, altura);

                System.out.println("Area: " + area);           
                System.out.println("Volumen: " + volumen);

            break;

            case 8:
                System.out.println("8. Huso esferico y cuña esferica");

                System.out.println("Ingrese el radio: ");
                radio = lector.nextDouble();
                System.out.println("Ingrese el numero de grados: ");
                numeroGrados = lector.nextDouble();
            
                area =  aHEyCE(radio, numeroGrados);
                volumen = vHEyCE(radio);

                System.out.println("Area: " + area);           
                System.out.println("Volumen: " + volumen);

            break;

            case 9:
                System.out.println("9. Ortoedro");

                System.out.println("Ingrese la altura");
                altura = lector.nextDouble();
                System.out.println("Ingrese la base:");
                base = lector.nextDouble();
                System.out.println("Ingrese la arista:");
                arista = lector.nextDouble();

                area = aOrtoedro(arista, base, altura);
                diagonal = dOrtoedro(arista, base, altura);
                volumen = vOrtoedro(arista, base, altura);

                System.out.println("Area: " + area);
                System.out.println("Diagonal: " + diagonal);
                System.out.println("Volumen: " + volumen);

            break;

            case 10:
                System.out.println("10. Tetaedro");

                System.out.println("Arista: ");
                arista = lector.nextDouble();

                volumen = vTetraedro(arista);
                area = aTetraedro(arista);

                System.out.println("Area: " + area);
                System.out.println("Volumen: " + volumen);

            break;

            case 11:
                System.out.println("11. Hexaedro");

                System.out.println("Arista: ");
                arista = lector.nextDouble();
             
                area = aHexaedro(arista);
                volumen = vHexaedro(arista);

                System.out.println("Area: " + area);
                System.out.println("Volumen: " + volumen);

            break;

            case 12:
                System.out.println("12.Octaedro");

                System.out.println("Arista: ");
                arista = lector.nextDouble();
         
                area = aOctaedro(arista);
                volumen = vOctaedro(arista);

                System.out.println("Area: " + area);
                System.out.println("Volumen: " + volumen);

            break;

            case 13:
                System.out.println("13. Dodecaedro");

                System.out.println("Arista: ");
                arista = lector.nextDouble();

                area = aDodecaedro(arista);
                volumen = vDodecaedro(arista);

                System.out.println("Area: " + area);
                System.out.println("Volumen: " + volumen);

            break;

            case 14:
                System.out.println("14. Icosaesdro");

                System.out.println("Arista: ");
                arista = lector.nextDouble();

                area = aIcosaedro(arista);
                volumen = vIcosaedro(arista);

                System.out.println("Area: " + area);
                System.out.println("Volumen : " + volumen);

            break;

            case 15:
                System.out.println("15. Tronco de cono");

                System.out.println("Ingrese la altura: ");
                altura = lector.nextDouble();
                System.out.println("ingrese el radio mayor: ");
                radioMayor = lector.nextDouble();
                System.out.println("Ingrese el radio menor");
                radioMenor = lector.nextDouble();
                System.out.println("Ingrese la generatriz: ");
                generatriz = lector.nextDouble();
                
                areaL = aLTroncoCono(generatriz, radioMenor, radioMayor);
                areaT = aTTroncoCono(generatriz, radioMenor, radioMayor);
                volumen = vTroncoCono(altura, radioMenor, radioMayor);

                System.out.println("Area lateral: " + areaL);
                System.out.println("Area total : " + areaT);
                System.out.println("Volumen : " + volumen);

            break;

            case 16:
                System.out.println("16. Tronco de piramide");

                System.out.println("Ingrese la longitud del lado mayor");
                longMayor = lector.nextDouble();
                System.out.println("Ingrese la longitud del lado menor");
                longMenor = lector.nextDouble();
                System.out.println("Ingrese la altura");
                altura = lector.nextDouble();

                areaL = aLTroncoPiramide(longMayor, longMenor, altura);
                areaT = aTTroncoPiramide(longMayor, longMenor, altura);
                volumen = vTroncoPiramie(altura, longMayor, longMenor);

                System.out.println("Area lateral: " + areaL);
                System.out.println("Area total: " + areaT);
                System.out.println("Volumen: " + volumen);

            break;
        } //Switch

        lector.close();
    }

    public static double aLPrisma(int cantidadLados, double longitudLados, double altura){
        try {
            double PbaseMenor = cantidadLados * longitudLados;
            double areaL = PbaseMenor * altura;
    
            return areaL;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return 0.0;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return 0.0; 
        }
    }

    public static double aTPrisma(double longitudLados, int cantidadLados, double altura) {
        try {
            double PbaseMenor = cantidadLados * longitudLados;
            double areaL = PbaseMenor * altura;
            double alfa = (Math.PI / 180) * (380 / cantidadLados);
            double apotema = longitudLados / (2 * Math.tan((alfa) / 2));
            double AbaseMenor = (PbaseMenor * apotema) / 2;
            double areaT = areaL + AbaseMenor;
    
            return areaT;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return 0.0; 
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vPrisma(double altura, int cantidadLados, double longitudLados) {
        try {
            double alfa = (Math.PI / 180) * (380 / cantidadLados);
            double apotema = longitudLados / (2 * Math.tan((alfa) / 2));
            double PbaseMenor = cantidadLados * longitudLados;
            double AbaseMenor = (PbaseMenor * apotema) / 2;
            double volumen = AbaseMenor + altura;
    
            return volumen;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return 0.0; 
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return 0.0; 
        }
    }

    public static double aLCilindro(double radio, double altura){
        try {
            double PbaseMenor = 2 * Math.PI * radio;
            double areaL = PbaseMenor * altura;
            return areaL;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aTCilindro(double radio, double altura){
        try {
            double PbaseMenor = 2 * Math.PI * radio;
            double areaT = PbaseMenor * (altura + radio);
            return areaT;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vCilindro(double radio, double altura){
        try {
            double AbaseMenor = Math.PI * Math.pow(radio, 2);
            double volumen = AbaseMenor * altura;
            return volumen;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aLPiramide(double altura, double anchura, double longitudLados){
        try {
            double PbaseMenor = 2 * longitudLados + 2 * anchura;
            double apotema = longitudLados / 2;
            double APiramide = Math.sqrt(Math.pow(altura, 2)) + Math.pow(apotema, 2);
            double areaL = (PbaseMenor * APiramide) / 2;
            return areaL;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aTPiramide(double longitudLados, double altura, double anchura){
        try {
            double PbaseMenor = 2 * longitudLados + 2 * anchura;
            double apotema = longitudLados / 2;
            double apiramide = Math.sqrt(Math.pow(altura, 2)) + Math.pow(apotema, 2);
            double areaL = (PbaseMenor * apiramide) / 2;
            double areaT = areaL + PbaseMenor;
            return areaT;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vPiramide(double longitudLados, double altura){
        try {
            double AbaseMenor = longitudLados / 2;
            double volumen = (AbaseMenor * altura) / 3;
            return volumen;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return 0.0; 
        }
    }    

    public static double aLCono(double radio, double generatriz){
        try {
            double areaL = Math.PI * radio * generatriz;
            return areaL;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aTCono(double radio, double generatriz){
        try {
            double AbaseMenor = Math.PI * Math.pow(radio, 2);
            double areaL = Math.PI * radio * generatriz;
            double areaT = areaL + AbaseMenor;
            return areaT;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vCono(double radio, double altura){
        try {
            double AbaseMenor = Math.PI * Math.pow(radio, 2);
            double volumen = (AbaseMenor * altura) / 3;
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aEsfera(double radio){
        try {
            double area = 4 * Math.PI * Math.pow(radio, 2);
            return area;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vEsfera(double radio){
        try {
            double volumen = (4 / 3.0) * Math.PI * Math.pow(radio, 3);
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }    

    public static double aZEsferica(double radioMayor, double altura) {
        try {
            double area = 2 * Math.PI * radioMayor * altura;
            return area;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vZEsferica(double radioMenor, double radioMayor, double altura) {
        try {
            double volumen = (Math.PI * altura * (Math.pow(altura, 2) + 3 * Math.pow(radioMenor, 2) + 3 * Math.pow(radioMayor, 2)) / 6);
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aCEsferico(double radioMayor, double altura) {
        try {
            double area = 2 * Math.PI * radioMayor * altura;
            return area;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vCEsferico(double radioMayor, double altura) {
        try {
            double volumen = (Math.PI * Math.pow(altura, 2) * (3 * radioMayor - altura)) / 3;
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aHEyCE(double radio, double numeroGrados) {
        try {
            double area = (4 * Math.PI * Math.pow(radio, 2) * numeroGrados) / 360;
            return area;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vHEyCE(double radio) {
        try {
            double volumen = (4 / 3.0) * ((Math.PI * Math.pow(radio, 3)) / 360);
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }

    public static double aOrtoedro(double arista, double base, double altura) {
        try {
            double area = 2 * (arista * base + arista * altura + base * altura);
            return area;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double dOrtoedro(double aristas, double base, double altura) {
        try {
            double diagonal = Math.sqrt(Math.pow(aristas, 2) + Math.pow(base, 2) + Math.pow(altura, 2));
            return diagonal;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vOrtoedro(double arista, double base, double altura) {
        try {
            double volumen = arista * base * altura;
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aTetraedro(double arista) {
        try {
            double area = arista * Math.sqrt(3);
            return area;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0;
        }
    }
    
    public static double vTetraedro(double arista) {
        try {
            double volumen = (Math.sqrt(2.0 / 12.0)) * Math.pow(arista, 3);
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0;
        }
    }
    
    public static double aHexaedro(double arista) {
        try {
            double area = 6 * Math.pow(arista, 2);
            return area;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vHexaedro(double arista) {
        try {
            double volumen = Math.pow(arista, 3);
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aOctaedro(double arista) {
        try {
            double area = 2 * Math.pow(arista, 2) * Math.sqrt(3);
            return area;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vOctaedro(double arista) {
        try {
            double volumen = Math.pow(arista, 3) * Math.sqrt(2.0 / 3.0);
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aDodecaedro(double arista) {
        try {
            double area = 3 * Math.pow(arista, 3) * (Math.sqrt(25 + 10) * Math.sqrt(5));
            return area;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vDodecaedro(double arista) {
        try {
            double volumen = (1.0 / 4) * (15 + 7 * Math.sqrt(5)) * Math.pow(arista, 3);
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aIcosaedro(double arista) {
        try {
            double area = 5 * Math.pow(arista, 2) * Math.sqrt(3);
            return area;
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
            return 0.0;
        }
    }
    
    public static double vIcosaedro(double arista) {
        try {
            double volumen = (5.0 / 12) * (3 + Math.sqrt(5)) * Math.pow(arista, 3);
            return volumen;
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aLTroncoCono(double generatriz, double radioMenor, double radioMayor) {
        try {
            double areaL = Math.PI * generatriz * (radioMayor + radioMenor);
            return areaL;
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aTTroncoCono(double generatriz, double radioMenor, double RadioMayor) {
        try {
            double ABaseMayor = Math.PI * Math.pow(RadioMayor, 2);
            double AbaseMenor = Math.PI * Math.pow(radioMenor, 2);
            double areaL = Math.PI * generatriz * (RadioMayor + radioMenor);
            double areaT = areaL + ABaseMayor + AbaseMenor;
            return areaT;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vTroncoCono(double altura, double radioMenor, double radioMayor) {
        try {
            double volumen = (1.0 / 3) * Math.PI * altura * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) + radioMayor * radioMenor);
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }

    public static double aLTroncoPiramide(double longMayor, double longMenor, double altura) {
        try {
            double LongMayor_Mitad = longMayor / 2;
            double APiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(LongMayor_Mitad, 2));
            double PBaseMayor = longMayor * 4;
            double PbaseMenor = longMenor * 4;
            double areaL = ((PBaseMayor + PbaseMenor) / 2) * APiramide;
            return areaL;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double aTTroncoPiramide(double longMayor, double longMenor, double altura) {
        try {
            double LongMayor_Mitad = longMayor / 2;
            double APiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(LongMayor_Mitad, 2));
            double PBaseMayor = longMayor * 4;
            double PbaseMenor = longMenor * 4;
            double areaL = ((PBaseMayor + PbaseMenor) / 2) * APiramide;
            double ABaseMayor = Math.pow(longMayor, 2);
            double AbaseMenor = Math.pow(longMenor, 2);
            double areaT = areaL + ABaseMayor + AbaseMenor;
            return areaT;
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
            return 0.0; 
        }
    }
    
    public static double vTroncoPiramide(double altura, double longMayor, double longMenor) {
        try {
            double ABaseMayor = Math.pow(longMayor, 2);
            double AbaseMenor = Math.pow(longMenor, 2);
            double volumen = ((1.0 / 3) * altura * (ABaseMayor + AbaseMenor + Math.sqrt(ABaseMayor * AbaseMenor)));
            return volumen;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return 0.0; 
        }
    }

}
