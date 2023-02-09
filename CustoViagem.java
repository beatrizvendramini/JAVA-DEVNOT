public class CustoViagem {
    public static void main(String[] args) {
        int distanciaPercorrida = 300;
        // distancia percorrida em km
        int custoCombustível = 5;
        // custo por litro de combustível
        int autonomiaPorLitro = 12;
        // quantidade de km por litro de combustível
        float CustoViagem = distanciaPercorrida / autonomiaPorLitro * custoCombustível;

        System.out.println("o custo da viagem é " + CustoViagem);
    }

}
