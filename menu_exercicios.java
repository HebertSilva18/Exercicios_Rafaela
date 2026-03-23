import java.util.Scanner;

public class menu_exercicios {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("       MENU DE EXERCÍCIOS     ");
            System.out.println(" 1  - Par ou ímpar");
            System.out.println(" 2  - Maior de dois");
            System.out.println(" 3  - Calculadora com menu");
            System.out.println(" 4  - Validação de entrada");
            System.out.println(" 5  - Sentinela (parada no 0)");
            System.out.println(" 6  - Simulador de caixa");
            System.out.println(" 7  - Desconto por categoria");
            System.out.println(" 8  - Contagem de valores");
            System.out.println(" 9  - Soma de 1 até N");
            System.out.println(" 10 - Contagem regressiva e soma");
            System.out.println(" 0  - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:  parOuImpar();           break;
                case 2:  maiorDeDois();          break;
                case 3:  calculadoraComMenu();   break;
                case 4:  validacaoDeEntrada();   break;
                case 5:  sentinela();            break;
                case 6:  simuladorDeCaixa();     break;
                case 7:  descontoPorCategoria(); break;
                case 8:  contagemDeValores();    break;
                case 9:  somaDe1AteN();          break;
                case 10: contagemRegressivaSoma(); break;
                case 0:  System.out.println("Fechando o programa."); break;
                default: System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }

    // 1. Par ou ímpar
    static void parOuImpar() {
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }

    // 2. Maior de dois 
    static void maiorDeDois() {
        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O maior é: " + n1);
        } else if (n1 < n2) {
            System.out.println("O maior é: " + n2);
        } else {
            System.out.println("São iguais!");
        }
    }

    // 3. Calculadora com menu 
    static void calculadoraComMenu() {
        System.out.println("Calculadora");
        System.out.println("01 Soma +");
        System.out.println("02 Subtrair -");
        System.out.println("03 Multiplicar *");
        System.out.println("04 Dividir /");
        System.out.print("Digite uma opção: ");
        int operacao = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        if (operacao == 1) {
            System.out.println("Resultado: " + (n1 + n2));
        } else if (operacao == 2) {
            System.out.println("Resultado: " + (n1 - n2));
        } else if (operacao == 3) {
            System.out.println("Resultado: " + (n1 * n2));
        } else if (operacao == 4) {
            if (n2 == 0) {
                System.out.println("Não é possível dividir por zero!");
            } else {
                System.out.println("Resultado: " + (n1 / n2));
            }
        } else {
            System.out.println("Opção inválida!");
        }
    }

    // 4. Validação de entrada 
    static void validacaoDeEntrada() {
        System.out.print("Digite uma nota entre 0 e 100: ");
        int nota = sc.nextInt();

        while (nota < 0 || nota > 100) {
            System.out.println("Nota não permitida! Digite um valor entre 0 e 100.");
            System.out.print("Digite novamente: ");
            nota = sc.nextInt();
        }

        System.out.println("Nota permitida: " + nota);
    }

    // 5. Sentinela (parada no 0) 
    static void sentinela() {
        System.out.print("Digite um número (0 para parar): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            System.out.println("O número digitado foi: " + numero);
            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();
        }

        System.out.println("Você digitou zero, então o programa terminou!");
    }

    // 6. Simulador de caixa 
    static void simuladorDeCaixa() {
        double saldo = 1000.00;
        int opcao;

        System.out.println("Caixa 24h");

        do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Qual valor de depósito? ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Erro! O depósito tem que ser maior que zero reais.");
                    }
                    break;
                case 2:
                    System.out.print("Qual valor de saque? ");
                    double saque = sc.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Erro! Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo: R$ " + saldo);
                    break;
                case 4:
                    System.out.println("Atendimento Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma opção válida.");
            }

        } while (opcao != 4);
    }

    // 7. Desconto por categoria 
    static void descontoPorCategoria() {
        System.out.print("Valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        System.out.print("Categoria (1 = Comum, 2 = Premium, 3 = Funcionário): ");
        int categoria = sc.nextInt();

        double percentual;

        switch (categoria) {
            case 1: percentual = 0.05; break;
            case 2: percentual = 0.10; break;
            case 3: percentual = 0.15; break;
            default:
                System.out.println("Categoria inválida.");
                return;
        }

        double desconto = valorCompra * percentual;
        double valorFinal = valorCompra - desconto;

        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
    }

    // 8. Contagem de valores 
    static void contagemDeValores() {
        int positivos = 0, negativos = 0, zeros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();
            if (n > 0) positivos++;
            else if (n < 0) negativos++;
            else zeros++;
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }

    // 9. Soma de 1 até N 
    static void somaDe1AteN() {
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 até " + n + " é: " + soma);
    }

    // 10. Contagem regressiva e soma 
    static void contagemRegressivaSoma() {
        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        int soma = 0;
        System.out.println("Contagem regressiva:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma dos números de " + numero + " até 0 é: " + soma);
    }
}
