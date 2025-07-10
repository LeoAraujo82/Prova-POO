public class MensagemConsole implements IMensagem{
    @Override
    public void mensagem(String mensagem) {
        System.out.println("[Console] " + mensagem);
    }
}
