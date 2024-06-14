import java.util.ArrayList;
import java.util.List;

public class Programador extends Funcionario {
    private List<String> linguagens;
    private List<Integer> experiencias;

    public Programador(String nome, String cpf) {
        super(nome, cpf);
        this.linguagens = new ArrayList<>(3);
        this.experiencias = new ArrayList<>(3);
    }

    public List<String> getLinguagens() {
        return linguagens;
    }

    public List<Integer> getExperiencia() {
        return experiencias;
    }

    public void addLinguagem(String linguagem) {
        if (linguagens.size() == 3) {
            System.out.println("Necessário remover linguagem");
            return;
        }
        this.linguagens.add(linguagem);
    }

    public void removeLinguagem(String linguagem) {
        this.linguagens.remove(linguagem);
    }

    public void addExperiencia(Integer experiencia) {
        if (experiencias.size() == 3) {
            System.out.println("Necessário remover experiencia");
            return;
        }
        this.experiencias.add(experiencia);
    }

    public void removeExperiencia(String experiencia) {
        this.experiencias.remove(experiencia);
    }

    // Obtém a experiência do programador na linguagem especificada
    public int getExperienciaNaLinguagem(String linguagem) {
        int indiceLinguagem = linguagens.indexOf(linguagem);
        if (indiceLinguagem != -1) {
            return experiencias.get(indiceLinguagem);
        } else {
            System.out.println("Linguagem não encontrada para este programador.");
            return 0; // Ou outro valor padrão, dependendo do seu caso
        }
    }
}
