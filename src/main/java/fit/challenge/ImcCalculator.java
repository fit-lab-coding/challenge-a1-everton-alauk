package fit.challenge;

public class ImcCalculator {
    private static final String MAGREZA = "Magreza";
    private static final String NORMAL = "Normal";
    private static final String SOBREPESO = "Sobrepeso";
    private static final String OBESIDADE = "Obesidade";

    public static String calculate(double peso, double altura){
        Double indice = peso / Math.pow(altura, 2);

        if (indice < 18.5) return MAGREZA;
	    if (indice < 24.9) return NORMAL;
        if (indice < 30) return SOBREPESO;
        return OBESIDADE;
        
    }
}
