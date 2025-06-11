package service;

public class ValidacaoService {
    public static boolean validarValor(double valor) {
        return valor > 0;
    }

    public static boolean validarNumeroConta(String numeroConta) {
        return numeroConta != null && !numeroConta.trim().isEmpty();
    }
}