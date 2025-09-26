package controller.cadastros;

import controller.buscas.ControllerBuscaModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadModelo;
import view.TelaBuscaModelo;

public class ControllerCadModelo implements ActionListener {
    TelaCadModelo telaCadModelo;

    public ControllerCadModelo(TelaCadModelo telaCadModelo) {
        this.telaCadModelo = telaCadModelo;
        
        this.telaCadModelo.getjButtonNovo().addActionListener(this);
        this.telaCadModelo.getjButtonBuscar().addActionListener(this);
        this.telaCadModelo.getjButtonSalvar().addActionListener(this);
        this.telaCadModelo.getjButtonCancelar().addActionListener(this);
        this.telaCadModelo.getjButtonFechar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadModelo.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadModelo.getjPanelDados(), false);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadModelo.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadModelo.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadModelo.getjPanelDados(), true);
            
        }else if(e.getSource() == this.telaCadModelo.getjButtonBuscar()) {
            TelaBuscaModelo telaBuscaModelo = new TelaBuscaModelo(null, true);
            ControllerBuscaModelo controllerBuscaModelo = new ControllerBuscaModelo(telaBuscaModelo);
            telaBuscaModelo.setVisible(true);
            
        }else if(e.getSource() == this.telaCadModelo.getjButtonSalvar()) {
            utilities.Utilities.ativaDesativa(this.telaCadModelo.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadModelo.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadModelo.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadModelo.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadModelo.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadModelo.getjButtonFechar()) {
            this.telaCadModelo.dispose();
        }
    }
}