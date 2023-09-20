package med.voll.api.domain.usuario;

public record DadosDetalhamentoUsuario(String login) {
    public DadosDetalhamentoUsuario(Usuario usuario) {
        this(usuario.getLogin());
    }

}
