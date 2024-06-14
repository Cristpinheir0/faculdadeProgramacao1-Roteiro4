public class main {

    public static void main(String[] args) {
        var p1 = new Programador("Fulano", "123456");
        var p2 = new Programador("Ciclano", "123456");

        p1.addLinguagem("java");
        p1.addExperiencia(7);
        p2.addLinguagem("java");
        p2.addExperiencia(8);

        p1.addLinguagem("python");
        p1.addExperiencia(9);
        p2.addLinguagem("python");
        p2.addExperiencia(8);

        p1.addLinguagem("rust");
        p1.addExperiencia(7);
        p2.addLinguagem("rust");
        p2.addExperiencia(5);

        String linguagemComparada = "java";
        int resultado = compararExperiencia(p1, p2, linguagemComparada);

        if (resultado > 0) {
            System.out.println("Fulano tem mais experiência em " + linguagemComparada);
        } else if (resultado < 0) {
            System.out.println("Ciclano tem mais experiência em " + linguagemComparada);
        } else {
            System.out.println("Fulano e Ciclano têm a mesma experiência em " + linguagemComparada);
        }

    }

    // Método para comparar a experiência de dois programadores em uma linguagem
    public static int compararExperiencia(Programador programador1, Programador programador2, String linguagem) {
        int experienciaProgramador1 = programador1.getExperienciaNaLinguagem(linguagem);
        int experienciaProgramador2 = programador2.getExperienciaNaLinguagem(linguagem);

        if (experienciaProgramador1 > experienciaProgramador2) {
            return 1; // Programador 1 tem mais experiência
        } else if (experienciaProgramador1 < experienciaProgramador2) {
            return -1; // Programador 2 tem mais experiência
        } else {
            return 0; // Mesma experiência
        }
    }

}
