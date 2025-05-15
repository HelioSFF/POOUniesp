package controller;

import model.Paciente;
import model.TipoAtendimento;
import service.PacienteService;

import java.util.List;
import java.util.Scanner;

public class PacienteController {
    private final PacienteService service;
    private final Scanner scanner = new Scanner(System.in);

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    public void iniciar() {
        System.out.println("=== Sistema de Fichas Médicas ===");

        String continuar;
        do {
            System.out.print("Nome do paciente: ");
            String nome = scanner.nextLine();

            System.out.print("Observações: ");
            String obs = scanner.nextLine();

            TipoAtendimento tipo = escolherTipoAtendimento();

            service.registrarPaciente(nome, obs, tipo);

            System.out.print("Deseja adicionar outro paciente? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        exibirPacientes();
    }

    private TipoAtendimento escolherTipoAtendimento() {
        System.out.println("Tipo de Atendimento:");
        System.out.println("1 - REGULAR");
        System.out.println("2 - PRIORIDADE");
        System.out.println("3 - PRIORIDADE DA PRIORIDADE");
        System.out.print("Escolha uma opção: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        return switch (opcao) {
            case 1 -> TipoAtendimento.REGULAR;
            case 2 -> TipoAtendimento.PRIORIDADE;
            case 3 -> TipoAtendimento.PRIORIDADE_DA_PRIORIDADE;
            default -> {
                System.out.println("Opção inválida. Usando REGULAR por padrão.");
                yield TipoAtendimento.REGULAR;
            }
        };
    }

    private void exibirPacientes() {
        List<Paciente> pacientes = service.listarPacientesOrdenados();
        System.out.println("\n=== Pacientes Ordenados ===");
        for (Paciente p : pacientes) {
            System.out.println(p);
        }
    }
}
