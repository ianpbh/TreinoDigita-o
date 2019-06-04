import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class Fase1 extends JFrame {

	private JPanel contentPane;
	private JButton btnY;

	/**
	 * Launch the application.
	 */
	public String faseUmfraseUm = "O rato roeu a roupa do rei de roma";
	public String faseUmfraseDois = "Quarenta presos foram encontrados mortos dentro de cadeias em Manaus nesta segunda-feira, informou a Secretaria de Administração Penitenciária";
	public String faseUmfraseTres = "Se tu me amas, ama-me baixinho\n" + 
			"Não o grites de cima dos telhados\n" + 
			"Deixa em paz os passarinhos\n" + 
			"Deixa em paz a mim!\n" + 
			"Se me queres,\n" + 
			"enfim,\n" + 
			"tem de ser bem devagarinho, Amada,\n" + 
			"que a vida é breve, e o amor mais breve ainda...";
	
	byte numeroFrase = 0;
	
	String frasesFaseUmUnidas = faseUmfraseUm + faseUmfraseDois + faseUmfraseTres;
	float quantidadeDeLetrasFaseUm = frasesFaseUmUnidas.length(); 
	float quantidadeDeLetrasQuePodeErrar = quantidadeDeLetrasFaseUm - ((quantidadeDeLetrasFaseUm / 100) * 80); 
	int errors = 0;
	int fase = 1;
	
	public static void main(String[] args) {
		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	            System.err.println(ex);
	        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase1 frame = new Fase1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Fase1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTab = new JButton("Tab");
		btnTab.setBounds(10, 467, 73, 23);
		contentPane.add(btnTab);
		
		JButton btnCaps = new JButton("Caps");
		btnCaps.setBounds(10, 501, 73, 23);
		contentPane.add(btnCaps);
		
		JButton btnShift = new JButton("Shift");
		btnShift.setBounds(10, 535, 89, 23);
		contentPane.add(btnShift);
		
		JButton buttonUm = new JButton("1");
		buttonUm.setBounds(75, 433, 55, 23);
		contentPane.add(buttonUm);
		
		JButton buttonDois = new JButton("2");
		buttonDois.setBounds(140, 433, 55, 23);
		contentPane.add(buttonDois);
		
		JButton buttonTres = new JButton("3");
		buttonTres.setBounds(205, 433, 55, 23);
		contentPane.add(buttonTres);
		
		JButton buttonQuatro = new JButton("4");
		buttonQuatro.setBounds(270, 433, 55, 23);
		contentPane.add(buttonQuatro);
		
		JButton buttonCinco = new JButton("5");
		buttonCinco.setBounds(335, 433, 55, 23);
		contentPane.add(buttonCinco);
		
		JButton buttonSeis = new JButton("6");
		buttonSeis.setBounds(400, 433, 55, 23);
		contentPane.add(buttonSeis);
		
		JButton buttonSete = new JButton("7");
		buttonSete.setBounds(465, 433, 55, 23);
		contentPane.add(buttonSete);
		
		JButton buttonOito = new JButton("8");
		buttonOito.setBounds(530, 433, 55, 23);
		contentPane.add(buttonOito);
		
		JButton buttonNove = new JButton("9");
		buttonNove.setBounds(595, 433, 55, 23);
		contentPane.add(buttonNove);
		
		JButton buttonZero = new JButton("0");
		buttonZero.setBounds(660, 433, 55, 23);
		contentPane.add(buttonZero);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(725, 433, 55, 23);
		contentPane.add(btnMinus);
		
		JButton btnBackspace = new JButton("Backspace");
		btnBackspace.setBounds(790, 433, 116, 23);
		contentPane.add(btnBackspace);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(93, 467, 46, 23);
		contentPane.add(btnQ);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(93, 501, 46, 23);
		contentPane.add(btnA);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(109, 535, 46, 23);
		contentPane.add(btnZ);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(149, 467, 46, 23);
		contentPane.add(btnW);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(149, 501, 46, 23);
		contentPane.add(btnS);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(165, 535, 46, 23);
		contentPane.add(btnX);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(205, 467, 46, 23);
		contentPane.add(btnE);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(205, 501, 46, 23);
		contentPane.add(btnD);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(221, 535, 46, 23);
		contentPane.add(btnC);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(261, 467, 46, 23);
		contentPane.add(btnR);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(261, 501, 46, 23);
		contentPane.add(btnF);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(277, 535, 46, 23);
		contentPane.add(btnV);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(317, 467, 46, 23);
		contentPane.add(btnT);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(317, 501, 46, 23);
		contentPane.add(btnG);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(335, 535, 46, 23);
		contentPane.add(btnB);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(429, 467, 46, 23);
		contentPane.add(btnU);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(373, 501, 46, 23);
		contentPane.add(btnH);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(391, 535, 46, 23);
		contentPane.add(btnN);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(485, 467, 46, 23);
		contentPane.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(429, 501, 46, 23);
		contentPane.add(btnJ);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(447, 535, 46, 23);
		contentPane.add(btnM);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(539, 467, 46, 23);
		contentPane.add(btnO);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(485, 501, 46, 23);
		contentPane.add(btnK);
		
		JButton btnComma = new JButton(",");
		btnComma.setBounds(503, 535, 46, 23);
		contentPane.add(btnComma);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(595, 467, 46, 23);
		contentPane.add(btnP);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(539, 501, 46, 23);
		contentPane.add(btnL);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(605, 501, 89, 23);
		contentPane.add(btnEnter);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(559, 535, 46, 23);
		contentPane.add(btnDot);
		
		JButton espaco = new JButton("");
		espaco.setBounds(236, 577, 414, 35);
		contentPane.add(espaco);
	
		
		JLabel lblInstrucoes = new JLabel("Bem Vindo \u00E0 fase 1 do treinamento de digita\u00E7\u00E3o. Clique em \"come\u00E7ar\" para iniciar o teste.");
		lblInstrucoes.setBounds(37, 26, 772, 41);
		contentPane.add(lblInstrucoes);
		
		JTextPane textFrases = new JTextPane();
		textFrases.setBounds(34, 59, 791, 137);
		contentPane.add(textFrases);
		textFrases.setEditable(false);
		textFrases.hide();		
		
		JTextArea textArea = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				System.out.println(e.getKeyCode());
				
				switch(e.getKeyCode())
				{
                    case 8:
						btnBackspace.setBackground(Color.BLUE);
						errors++;
						break;
					case 9:
						btnTab.setBackground(Color.BLUE);
						int tab;
						break;
					case 10:
						btnEnter.setBackground(Color.BLUE);
						break;
					case 16:
						btnShift.setBackground(Color.BLUE);
						break;
					case 20:
						btnCaps.setBackground(Color.BLUE);
						break;
					case 32:
						espaco.setBackground(Color.BLUE);
						break;
					case 44:
						btnComma.setBackground(Color.BLUE);
						break;
                    case 45:
						btnMinus.setBackground(Color.BLUE);
						break;
					case 46:
						btnDot.setBackground(Color.BLUE);
						break;
                    case 48:
						btnComma.setBackground(Color.BLUE);
						break;
                    case 49:
						buttonUm.setBackground(Color.BLUE);
						break;
                    case 50:
						buttonDois.setBackground(Color.BLUE);
						break;
                    case 51:
						buttonTres.setBackground(Color.BLUE);
						break;
                    case 52:
						buttonQuatro.setBackground(Color.BLUE);
						break;
                    case 53:
						buttonCinco.setBackground(Color.BLUE);
						break;
                    case 54:
						buttonSeis.setBackground(Color.BLUE);
						break;
                    case 55:
						buttonSete.setBackground(Color.BLUE);
						break;
                    case 56:
						buttonOito.setBackground(Color.BLUE);
						break;
                    case 57:
						buttonNove.setBackground(Color.BLUE);
						break;
					case 65:
						int A;
						btnA.setBackground(Color.BLUE);
						break;
					case 66 :
						int B;
						btnB.setBackground(Color.BLUE);
						break;
					case 67:
						btnC.setBackground(Color.BLUE);
						int C;
						break;
					case 68:
						btnD.setBackground(Color.BLUE);
						int D;
						break;
					case 69:
						btnE.setBackground(Color.BLUE);
						int E;
						break;
					case 70:
						btnF.setBackground(Color.BLUE);
						int F;
						break;
					case 71:
						btnG.setBackground(Color.BLUE);
						int G;
						break;
					case 72:
						btnH.setBackground(Color.BLUE);
						int H;
						break;
					case 73:
						btnI.setBackground(Color.BLUE);
						int I;
						break;
					case 74:
						btnJ.setBackground(Color.BLUE);
						int J;
						break;
					case 75:
						btnK.setBackground(Color.BLUE);
						int K;
						break;
					case 76:
						btnL.setBackground(Color.BLUE);
						int L;
						break;
					case 77:
						btnM.setBackground(Color.BLUE);
						int M;
						break;
					case 78:
						btnN.setBackground(Color.BLUE);
						int N;
						break;
					case 79:
						btnO.setBackground(Color.BLUE);
						int O;
						break;
					case 80:
						btnP.setBackground(Color.BLUE);
						int P;
						break;
					case 81:
						btnQ.setBackground(Color.BLUE);
						int Q;
						break;
					case 82:
						btnR.setBackground(Color.BLUE);
						int R;
						break;
					case 83:
						btnS.setBackground(Color.BLUE);
						int S;
						break;
					case 84:
						btnT.setBackground(Color.BLUE);
						int T;
						break;
					case 85:
						btnU.setBackground(Color.BLUE);
						int U;
						break;
					case 86:
						btnV.setBackground(Color.BLUE);
						int V;
						break;
					case 87:
						btnW.setBackground(Color.BLUE);
						int W;
						break;
					case 88:
						btnX.setBackground(Color.BLUE);
						int X;
						break;
					case 89:
						btnY.setBackground(Color.BLUE);
						int Y;
						break;
					case 90:
						btnZ.setBackground(Color.BLUE);
						int Z;
						break;
				}	
						
			}
			
			public void keyReleased(KeyEvent e) {
				
				switch(e.getKeyCode())
				{
                    case 8:
						btnBackspace.setBackground(Color.WHITE);
						break;
					case 9:
						btnTab.setBackground(Color.WHITE);
						int tab;
						break;
					case 10:
						btnEnter.setBackground(Color.WHITE);
						break;
					case 16:
						btnShift.setBackground(Color.WHITE);
						break;
					case 20:
						btnCaps.setBackground(Color.WHITE);
						break;
					case 32:
						espaco.setBackground(Color.WHITE);
						break;
					case 44:
						btnComma.setBackground(Color.WHITE);
						break;
					case 45:
						btnMinus.setBackground(Color.WHITE);
						break;
					case 46:
						btnDot.setBackground(Color.WHITE);
						break;
                    case 48:
						buttonZero.setBackground(Color.WHITE);
						break;
                    case 49:
						buttonUm.setBackground(Color.WHITE);
						break;
                    case 50:
						buttonDois.setBackground(Color.WHITE);
						break;
                    case 51:
						buttonTres.setBackground(Color.WHITE);
						break;
                    case 52:
						buttonQuatro.setBackground(Color.WHITE);
						break;
                    case 53:
						buttonCinco.setBackground(Color.WHITE);
						break;
                    case 54:
						buttonSeis.setBackground(Color.WHITE);
						break;
                    case 55:
						buttonSete.setBackground(Color.WHITE);
						break;
                    case 56:
						buttonOito.setBackground(Color.WHITE);
						break;
                    case 57:
						buttonNove.setBackground(Color.WHITE);
						break;
					case 65:
						int A;
						btnA.setBackground(Color.WHITE);
						break;
					case 66 :
						int B;
						btnB.setBackground(Color.WHITE);
						break;
					case 67:
						btnC.setBackground(Color.WHITE);
						int C;
						break;
					case 68:
						btnD.setBackground(Color.WHITE);
						int D;
						break;
					case 69:
						btnE.setBackground(Color.WHITE);
						int E;
						break;
					case 70:
						btnF.setBackground(Color.WHITE);
						int F;
						break;
					case 71:
						btnG.setBackground(Color.WHITE);
						int G;
						break;
					case 72:
						btnH.setBackground(Color.WHITE);
						int H;
						break;
					case 73:
						btnI.setBackground(Color.WHITE);
						int I;
						break;
					case 74:
						btnJ.setBackground(Color.WHITE);
						int J;
						break;
					case 75:
						btnK.setBackground(Color.WHITE);
						int K;
						break;
					case 76:
						btnL.setBackground(Color.WHITE);
						int L;
						break;
					case 77:
						btnM.setBackground(Color.WHITE);
						int M;
						break;
					case 78:
						btnN.setBackground(Color.WHITE);
						int N;
						break;
					case 79:
						btnO.setBackground(Color.WHITE);
						int O;
						break;
					case 80:
						btnP.setBackground(Color.WHITE);
						int P;
						break;
					case 81:
						btnQ.setBackground(Color.WHITE);
						int Q;
						break;
					case 82:
						btnR.setBackground(Color.WHITE);
						int R;
						break;
					case 83:
						btnS.setBackground(Color.WHITE);
						int S;
						break;
					case 84:
						btnT.setBackground(Color.WHITE);
						int T;
						break;
					case 85:
						btnU.setBackground(Color.WHITE);
						int U;
						break;
					case 86:
						btnV.setBackground(Color.WHITE);
						int V;
						break;
					case 87:
						btnW.setBackground(Color.WHITE);
						int W;
						break;
					case 88:
						btnX.setBackground(Color.WHITE);
						int X;
						break;
					case 89:
						btnY.setBackground(Color.WHITE);
						int Y;
						break;
					case 90:
						btnZ.setBackground(Color.WHITE);
						int Z;
						break;
				}
						
			}
		});
		
		textArea.setBounds(31, 234, 936, 149);
		contentPane.add(textArea);
		
		JButton btnComecar = new JButton("Come\u00E7ar");
		btnComecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFrases.show();
				
				switch(numeroFrase)
				{
					case 0:
						JOptionPane.showMessageDialog(null, "Lembre-se, para passar, você deve seguir todas as orientações do texto, tais como espaços, quebras de linha, vírgulas, etc");
						lblInstrucoes.setText("Frase 1: ");
						
						textFrases.setText(faseUmfraseUm);
						
						textArea.setText("");
						btnComecar.setText("Proxima frase");
						numeroFrase++;
						break;
				
				
					case 1:
						String textoDigitado = textArea.getText().intern().replace("\n", " ");
						if(textoDigitado.intern() == faseUmfraseUm)
						{
							lblInstrucoes.setText("Frase 2:");	
							textFrases.setText(faseUmfraseDois);
							textArea.setText("");
							numeroFrase++;
						}	
						else
						{
							JOptionPane.showMessageDialog(null, "A frase digitada não corresponde com a que deverá ser escrita");
						}

						break;
					case 2:
						textoDigitado = textArea.getText().intern().replace("\n", " ");
						if(textoDigitado.intern() == faseUmfraseDois)
						{
							lblInstrucoes.setText("Frase 3: ");
							btnComecar.setText("Finalizar");
							textArea.setText("");
							textFrases.setText(faseUmfraseTres);
							numeroFrase++;
						}	
						else
						{
							JOptionPane.showMessageDialog(null, "A frase digitada não corresponde com a que deverá ser escrita");
						}
						break;
						
					case 3:
						textoDigitado = textArea.getText().intern();
						if(textoDigitado.intern() == faseUmfraseTres)
						{
							lblInstrucoes.setText("Frase 3:");
							textArea.setText("");
							if(errors > quantidadeDeLetrasQuePodeErrar)
							{
								JOptionPane.showMessageDialog(null, "Você não acertou mais de 80% das letras das frases, será necessário repetir o teste");
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Parabéns, você passou no teste!");
								System.exit(ABORT);
							}
						}	
						else
						{
							JOptionPane.showMessageDialog(null, "A frase digitada não corresponde com a que deverá ser escrita");
						}
						
						
						
				}				
			}
		});
		btnComecar.setBounds(855, 138, 132, 35);
		contentPane.add(btnComecar);
		
		btnY = new JButton("Y");
		btnY.setBounds(373, 467, 46, 23);
		contentPane.add(btnY);
		
		JLabel lblDigiteAqui = new JLabel("Digite aqui");
		lblDigiteAqui.setBounds(37, 207, 93, 14);
		contentPane.add(lblDigiteAqui);
		
		
	}
}
