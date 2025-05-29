import java.util.List;


public class Pagina {

    public void avancar(List paginas){
            paginas.add(paginas.size() + 1);
            System.out.println("Página " + paginas.size());
    }

    public void voltar(List paginas){
            if (paginas.size() == 1){
                System.out.println("Você já está na primeira página.");
                return;

            }
            paginas.remove(paginas.size()-1);
            System.out.println("Página " + paginas.size());
    }
}
