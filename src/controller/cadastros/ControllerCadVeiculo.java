package controller.cadastros;

import controller.buscas.ControllerBuscaVeiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadVeiculo;
import view.TelaBuscaVeiculo;

public class ControllerCadVeiculo implements ActionListener {
    TelaCadVeiculo telaCadVeiculo;

    public ControllerCadVeiculo(TelaCadVeiculo telaCadVeiculo) {
        this.telaCadVeiculo = telaCadVeiculo;
        
        this.telaCadVeiculo.getjButtonNovo().addActionListener(this);
        this.telaCadVeiculo.getjButtonBuscar().addActionListener(this);
        this.telaCadVeiculo.getjButtonSalvar().addActionListener(this);
        this.telaCadVeiculo.getjButtonCancelar().addActionListener(this);
        this.telaCadVeiculo.getjButtonFechar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadVeiculo.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadVeiculo.getjPanelDados(), false);       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadVeiculo.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadVeiculo.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadVeiculo.getjPanelDados(), true);
            
        }else if(e.getSource() == this.telaCadVeiculo.getjButtonBuscar()) {
            TelaBuscaVeiculo telaBuscaVeiculo = new TelaBuscaVeiculo(null, true);
            ControllerBuscaVeiculo controllerBuscaVeiculo = new ControllerBuscaVeiculo(telaBuscaVeiculo);
            telaBuscaVeiculo.setVisible(true);
            
        }else if(e.getSource() == this.telaCadVeiculo.getjButtonSalvar()) {
            utilities.Utilities.ativaDesativa(this.telaCadVeiculo.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadVeiculo.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadVeiculo.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadVeiculo.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadVeiculo.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadVeiculo.getjButtonFechar()) {
            this.telaCadVeiculo.dispose();
        }
    }
}
