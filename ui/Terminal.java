package ui;

import model.ContaBancaria;
import service.ValidacaoService;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();
        while (!ValidacaoService.validarNumeroConta(numeroConta)) {
            System.out.print("Número de conta inválido. Tente novamente: ");
            numeroConta = scanner.nextLine();
        }
        ContaBancaria conta = new ContaBancaria(numeroConta, 1000.0);
        boolean executando = true;
        while (executando) {
            System.out.println("\nMenu:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
                    break;
                case "2":
                    System.out.print("Valor para depositar: ");
                    try {
                        double valorDeposito = Double.parseDouble(scanner.nextLine());
                        if (conta.depositar(valorDeposito)) {
                            System.out.println("Depósito realizado com sucesso!");
                        } else {
                            System.out.println("Valor inválido para depósito.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Digite um número válido.");
                    }
                    break;
                case "3":
                    System.out.print("Valor para saque: ");
                    try {
                        double valorSaque = Double.parseDouble(scanner.nextLine());
                        if (conta.sacar(valorSaque)) {
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente ou valor inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Digite um número válido.");
                    }
                    break;
                case "4":
                    executando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}