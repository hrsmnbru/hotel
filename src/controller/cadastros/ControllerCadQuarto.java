package controller.cadastros;

import controller.buscas.ControllerBuscaQuarto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadQuarto;
import view.TelaBuscaQuarto;

public class ControllerCadQuarto implements ActionListener {
    TelaCadQuarto telaCadQuarto;

    public ControllerCadQuarto(TelaCadQuarto telaCadQuarto) {
        this.telaCadQuarto = telaCadQuarto;
        
        this.telaCadQuarto.getjButtonNovo().addActionListener(this);
        this.telaCadQuarto.getjButtonBuscar().addActionListener(this);
        this.telaCadQuarto.getjButtonSalvar().addActionListener(this);
        this.telaCadQuarto.getjButtonCancelar().addActionListener(this);
        this.telaCadQuarto.getjButtonFechar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadQuarto.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadQuarto.getjPanelDados(), false);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadQuarto.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadQuarto.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadQuarto.getjPanelDados(), true);
            
        }else if(e.getSource() == this.telaCadQuarto.getjButtonBuscar()) {
            TelaBuscaQuarto telaBuscaQuarto = new TelaBuscaQuarto(null, true);
            ControllerBuscaQuarto controllerBuscaQuarto = new ControllerBuscaQuarto(telaBuscaQuarto);
            telaBuscaQuarto.setVisible(true);
            
        }else if(e.getSource() == this.telaCadQuarto.getjButtonSalvar()) {
            utilities.Utilities.ativaDesativa(this.telaCadQuarto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadQuarto.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadQuarto.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadQuarto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadQuarto.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadQuarto.getjButtonFechar()) {
            this.telaCadQuarto.dispose();
        }
    }
}