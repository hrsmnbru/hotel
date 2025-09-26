package controller.cadastros;

import controller.buscas.ControllerBuscaVagaEstacionamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadVagaEstacionamento;
import view.TelaBuscaVagaEstacionamento;

public class ControllerCadVagaEstacionamento implements ActionListener {
    TelaCadVagaEstacionamento telaCadVagaEstacionamento;

    public ControllerCadVagaEstacionamento(TelaCadVagaEstacionamento telaCadVagaEstacionamento) {
        this.telaCadVagaEstacionamento = telaCadVagaEstacionamento;
        
        this.telaCadVagaEstacionamento.getjButtonNovo().addActionListener(this);
        this.telaCadVagaEstacionamento.getjButtonBuscar().addActionListener(this);
        this.telaCadVagaEstacionamento.getjButtonSalvar().addActionListener(this);
        this.telaCadVagaEstacionamento.getjButtonCancelar().addActionListener(this);
        this.telaCadVagaEstacionamento.getjButtonFechar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadVagaEstacionamento.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadVagaEstacionamento.getjPanelDados(), false);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadVagaEstacionamento.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadVagaEstacionamento.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadVagaEstacionamento.getjPanelDados(), true);
            
        }else if(e.getSource() == this.telaCadVagaEstacionamento.getjButtonBuscar()) {
            TelaBuscaVagaEstacionamento telaBuscaVagaEstacionamento = new TelaBuscaVagaEstacionamento(null, true);
            ControllerBuscaVagaEstacionamento controllerBuscaVagaEstacionamento = new ControllerBuscaVagaEstacionamento(telaBuscaVagaEstacionamento);
            telaBuscaVagaEstacionamento.setVisible(true);
            
        }else if(e.getSource() == this.telaCadVagaEstacionamento.getjButtonSalvar()) {
            utilities.Utilities.ativaDesativa(this.telaCadVagaEstacionamento.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadVagaEstacionamento.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadVagaEstacionamento.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadVagaEstacionamento.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadVagaEstacionamento.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadVagaEstacionamento.getjButtonFechar()) {
            this.telaCadVagaEstacionamento.dispose();
        }
    }
}