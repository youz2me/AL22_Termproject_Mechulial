import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class setEgg {
	void clickButton(JButton button, int totalEgg) {
		if(totalEgg == 1)
			button.setIcon(new ImageIcon(Start.class.getResource("/data/start_egg1.png")));
		else if(totalEgg == 2)
			button.setIcon(new ImageIcon(Start.class.getResource("/data/start_egg2.png")));
		else if(totalEgg == 3)
			button.setIcon(new ImageIcon(Start.class.getResource("/data/start_egg3.png")));
		else if(totalEgg == 4)
			button.setIcon(new ImageIcon(Start.class.getResource("/data/start_egg4.png")));
		else
			button.setIcon(new ImageIcon(Start.class.getResource("/data/start_egg5.png")));
	}
}

public class Start extends JFrame {
	int totalEgg = 3;
	setEgg setVal = new setEgg();
	public Start() {

		//타占쏙옙틀
		super("Start");

		//화占쏙옙 占쏙옙占쏙옙
		JPanel mainPanel = new JPanel();
		setSize(700, 400);
		mainPanel.setLayout(null);
		
		///踰꾪듉 �깮�꽦
		JButton buttonToLevel1 = new JButton(""); 
		buttonToLevel1.setIcon(new ImageIcon(Start.class.getResource("/data/start_default.png")));
		buttonToLevel1.setBounds(275, 107, 120, 150);
		buttonToLevel1.setBorderPainted(false);
		buttonToLevel1.setContentAreaFilled(false);
		buttonToLevel1.setFocusPainted(false);
		
		 //占쏙옙튼 占쌩곤옙
		mainPanel.add(buttonToLevel1);
		getContentPane().add(mainPanel);
		
		//占쏙옙튼 클占쏙옙 占싱븝옙트
		buttonToLevel1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.setOutputNum(totalEgg);
				new Level1();
				setVisible(false);
			}
		});
		
		JButton minusEgg = new JButton("-");
		minusEgg.setBounds(234, 168, 29, 29);
		mainPanel.add(minusEgg);
		minusEgg.setIcon(new ImageIcon(Start.class.getResource("/data/minus.png")));
		minusEgg.setBorderPainted(false);
		minusEgg.setContentAreaFilled(false);
		minusEgg.setFocusPainted(false);
		
		minusEgg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(totalEgg >= 2)
					totalEgg = totalEgg - 1;
				else if(totalEgg == 1)
					totalEgg = 1;
				
				setVal.clickButton(buttonToLevel1, totalEgg);
			}
		});
		
		JButton plusEgg = new JButton("+");
		plusEgg.setBounds(407, 168, 29, 29);
		mainPanel.add(plusEgg);
		plusEgg.setIcon(new ImageIcon(Start.class.getResource("/data/plus.png")));
		plusEgg.setBorderPainted(false);
		plusEgg.setContentAreaFilled(false);
		plusEgg.setFocusPainted(false);
		
		plusEgg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(totalEgg <= 4)
					totalEgg = totalEgg + 1;
				else if(totalEgg == 5)
					totalEgg = 5;
				
				setVal.clickButton(buttonToLevel1, totalEgg);
			}
		});

		//화占쏙옙 占쌩앙울옙 占쏙옙占쏙옙
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
}