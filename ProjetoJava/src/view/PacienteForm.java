package view;

import model.Paciente;
import model.TipoAtendimento;
import service.PacienteService;
import repository.PacienteRepositoryMemoria;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class PacienteForm {
    private JPanel painelPrincipal;
    private JTextField campoNome;
    private JTextArea campoObservacoes;
    private JComboBox<TipoAtendimento> comboPrioridade;
    private JButton botaoSalvar;
    private JTextArea areaLista;

    private final PacienteService service;

    public PacienteForm() {
        this.service = new PacienteService(new PacienteRepositoryMemoria());

        for (TipoAtendimento tipo : TipoAtendimento.values()) {
            comboPrioridade.addItem(tipo);
        }

        botaoSalvar.addActionListener(e -> {
            String nome = campoNome.getText();
            String obs = campoObservacoes.getText();
            TipoAtendimento tipo = (TipoAtendimento) comboPrioridade.getSelectedItem();

            Paciente paciente = new Paciente(nome, obs, tipo, LocalDate.now(), service.getNovaOrdem());
            service.registrarPaciente(paciente);

            atualizarLista();
            limparCampos();
        });
    }

    private void atualizarLista() {
        StringBuilder sb = new StringBuilder();
        for (Paciente p : service.listarPacientesOrdenados()) {
            sb.append(p.toString()).append("\n");
        }
        areaLista.setText(sb.toString());
    }

    private void limparCampos() {
        campoNome.setText("");
        campoObservacoes.setText("");
        comboPrioridade.setSelectedIndex(0);
    }

    // getPainelPrincipal()
    public JPanel getPainelPrincipal() {
        if (painelPrincipal == null) {
            painelPrincipal = new JPanel(new BorderLayout());
            JPanel formulario = new JPanel(new GridLayout(5, 2));
            campoNome = new JTextField();
            campoObservacoes = new JTextArea(3, 20);
            comboPrioridade = new JComboBox<>();
            botaoSalvar = new JButton("Salvar");
            areaLista = new JTextArea();
            areaLista.setEditable(false);

            // Preenche o combo de prioridade aqui
            for (TipoAtendimento tipo : TipoAtendimento.values()) {
                comboPrioridade.addItem(tipo);
            }

            formulario.add(new JLabel("Nome:"));
            formulario.add(campoNome);
            formulario.add(new JLabel("Observações:"));
            formulario.add(new JScrollPane(campoObservacoes));
            formulario.add(new JLabel("Prioridade:"));
            formulario.add(comboPrioridade);
            formulario.add(new JLabel());
            formulario.add(botaoSalvar);

            painelPrincipal.add(formulario, BorderLayout.NORTH);
            painelPrincipal.add(new JScrollPane(areaLista), BorderLayout.CENTER);

            // Ação do botão salvar
            botaoSalvar.addActionListener(e -> {
                String nome = campoNome.getText();
                String obs = campoObservacoes.getText();
                TipoAtendimento tipo = (TipoAtendimento) comboPrioridade.getSelectedItem();

                Paciente paciente = new Paciente(nome, obs, tipo, LocalDate.now(), service.getNovaOrdem());
                service.registrarPaciente(paciente);

                atualizarLista();
                limparCampos();
            });
        }
        return painelPrincipal;
    }


}
