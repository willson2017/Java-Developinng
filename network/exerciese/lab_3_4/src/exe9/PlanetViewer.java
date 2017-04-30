package exe9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PlanetViewer extends JFrame implements ItemListener {
	private static final long serialVersionUID = 1L;
	JRadioButton r1, r2, r3, r4;
	JTextArea txtArea;

	public PlanetViewer() {
		this.setSize(500, 250);
		this.setTitle("PlanetViewer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// set JTextArea
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		txtArea = new JTextArea();
		txtArea.setLineWrap(true);
		txtArea.setEditable(false);
		txtArea.setBorder(BorderFactory.createLoweredBevelBorder());
		//txtArea.setBackground(Color.LIGHT_GRAY);
		
		//set scroll
		JScrollPane scroll = new JScrollPane(txtArea, 
											JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
											JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(10, 10, 200, 200);
		//scroll.setAutoscrolls(true);
		scroll.setBorder(BorderFactory.createEtchedBorder());
		this.add(scroll, BorderLayout.CENTER);

		//set radio button
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(5, 1));
		p1.setBorder(BorderFactory.createEtchedBorder());
		r1 = new JRadioButton("Mercury");
		r2 = new JRadioButton("Versus");
		r3 = new JRadioButton("Earth");
		r4 = new JRadioButton("Mars");
		
		//set exit button
		JButton btn = new JButton("Exit");
		btn.setHorizontalAlignment(JButton.CENTER);
		btn.setBorder(BorderFactory.createEtchedBorder());
		//add radio button to panel
		p1.add(r1);
		p1.add(r2);
		p1.add(r3);
		p1.add(r4);
		p1.add(btn);
		
		//only one can be selected
		ButtonGroup bgroup1 = new ButtonGroup();
		bgroup1.add(r1);
		bgroup1.add(r2);
		bgroup1.add(r3);
		bgroup1.add(r4);
		contentPane.add(p1, BorderLayout.LINE_END);

		//add listener for changing item
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
		r4.addItemListener(this);

		// click button to exit
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == r1) {
			txtArea.setText("");
			txtArea.setText("Mercury is selected\nMercury is the smallest "
					+ "and innermost planet in the Solar System. Its orbital period around the "
					+ "Sun of 88 days is the shortest of all the planets in the Solar System. "
					+ "It is named after the Roman deity Mercury, the messenger to the gods.\nLike Venus, "
					+ "Mercury orbits the Sun within Earth's orbit as an inferior planet, "
					+ "so it can only be seen visually in the morning or the evening sky, and never exceeds 28° "
					+ "away from the Sun. Also, like Venus and the Moon, the planet displays the complete range of phases "
					+ "as it moves around its orbit relative to Earth. Seen from Earth, this cycle of phases reoccurs "
					+ "approximately every 116 days, the so-called synodic period. Although Mercury can appear "
					+ "as a bright star-like object when viewed from Earth, its proximity to the Sun often makes "
					+ "it more difficult to see than Venus.");
		} else if (e.getSource() == r2) {
			txtArea.setText("");
			txtArea.setText("Versus is selected");
		} else if (e.getSource() == r3) {
			txtArea.setText("");
			txtArea.setText("Earth is selected !\nEarth"
					+ "otherwise known as the World (especially in geopolitics and geography),[n 6] or the Globe, "
					+ "is the third planet from the Sun and the only object in the Universe known to harbor life. "
					+ "It is the densest planet in the Solar System and the largest of the four terrestrial planets.");
		} else {
			txtArea.setText("");
			txtArea.setText("Mars is selected");
		}
	}

	public static void main(String[] args) {
		PlanetViewer viewer = new PlanetViewer();
		viewer.setVisible(true);
	}

}
