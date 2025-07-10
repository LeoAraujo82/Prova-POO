public class Main {

    public static void main(String[] args) {

        IMensagem mensagem = new NotificadorWhatsapp();

        Biblioteca biblioteca = new Biblioteca(mensagem);

        UsuarioBiblioteca aluno = new Aluno(

                "Pablo",

                19

        );

        UsuarioBiblioteca professor = new Professor(

                "Laila",

                7

        );

        UsuarioBiblioteca visitante = new Visitante(

                "Gustavo",

                11

        );



        biblioteca.processarUsuarioBiblioteca(aluno);

        biblioteca.processarUsuarioBiblioteca(professor);

        biblioteca.processarUsuarioBiblioteca(visitante);

    }

}