package app;
import java.security.MessageDigest;

public class Usuario {
    String login;
    String senhaCriptografada;

    Usuario(String log, String sen) {
        login = log;
        senhaCriptografada = criptografarSenha(sen);
    }

    static String criptografarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(senha.getBytes());
            StringBuilder hex = new StringBuilder();
            for (byte b : hash) hex.append(String.format("%02x", b));
            return hex.toString();
        } catch (Exception e) {
            return null;
        }
    }

    void exibirUsuario() {
        System.out.println("Login: " + login);
        System.out.println("Senha criptografada: " + senhaCriptografada);
    }
}
