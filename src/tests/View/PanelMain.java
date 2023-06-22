package View;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Presentation.Presentation;

public class PanelMain extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private Container c;
	private CardLayout card;
	private Presentation main;
	
	private PanelWelcome pw;
	private PanelTransport ptr;
	private PanelFood pf;
	private PanelEmpreinteNumerique pen;
	
	private PanelThanks pth;

	// Getters
	public PanelWelcome getPw() {
		return pw;
	}
	public PanelTransport getPtr() {
		return ptr;
	}
	public PanelFood getPf() {
		return pf;
	}
	public PanelEmpreinteNumerique getPen() {
		return pen;
	}
	public PanelThanks getPth() {
		return pth;
	}
	
	// Constructor
	public PanelMain(Presentation m, JFrame f) {
		this.c = f.getContentPane();
		this.main = m;
		
		card = new CardLayout();
		c.setLayout(card);
		
		this.pw = new PanelWelcome();
		this.ptr = new PanelTransport(main);
		this.pf = new PanelFood(main);
		this.pen = new PanelEmpreinteNumerique(main);
		
		this.pth = new PanelThanks(main);
		
		c.add(this.pw);
		c.add(this.ptr);
		c.add(this.pf);
		c.add(this.pen);
		
		c.add(this.pth);
	}

	// Methods
	public void changePanel() {
		pth.refresh();
		card.next(c);
	}

}