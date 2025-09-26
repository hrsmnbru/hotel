package controller.buscas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaVagaEstacionamento;

public class ControllerBuscaVagaEstacionamento implements ActionListener {
    TelaBuscaVagaEstacionamento telaBuscaVagaEstacionamento;

    public ControllerBuscaVagaEstacionamento(TelaBuscaVagaEstacionamento telaBuscaVagaEstacionamento) {
        this.telaBuscaVagaEstacionamento = telaBuscaVagaEstacionamento;
        
        this.telaBuscaVagaEstacionamento.getjButtonCarregar().addActionListener(this);
        this.telaBuscaVagaEstacionamento.getjButtonCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaVagaEstacionamento.getjButtonCarregar()) {
            if (this.telaBuscaVagaEstacionamento.getjTableDados().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado selecionado.");
            } else {
                JOptionPane.showMessageDialog(null, "Aguarde, carregando dados");
            }
        } else if (e.getSource() == this.telaBuscaVagaEstacionamento.getjButtonCancelar()) {
            this.telaBuscaVagaEstacionamento.dispose();
        }
    }
}