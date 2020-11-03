class Fibo{
    public static void main(String args[]){

        int Valor1 = 4;
        int Valor2 = 3;
        int Iterador = 0;
        System.out.println(Valor1);
        System.out.println(Valor2);
        do{
            Iterador = Iterador +1;
            int Valor3 = Valor1 + Valor2;
            System.out.println(Valor3);

            Valor1 = Valor2;
            Valor2 = Valor3;
        }
        while(Iterador <= 2);
       
    }
}