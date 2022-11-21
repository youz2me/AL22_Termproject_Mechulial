import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level3_2 extends JFrame {
    Level3_2(int totalEgg, int favoriteFood, int favoriteType, int ranking[]){
        //타이틀
        super("Level3.2");

        //화면 구성
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        JButton buttonKorea = new JButton("한식");
        buttonKorea.setBounds(19, 128, 123, 116);
        jPanel.add(buttonKorea);
        if(ranking[0] == 0)
        	buttonKorea.setVisible(false);

        buttonKorea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 ranking[1] = 0;
                 new Level3_3(totalEgg, favoriteFood, favoriteType, ranking);
                 setVisible(false);
            }
        });

        JButton buttonJapan = new JButton("일식");
        buttonJapan.setBounds(154, 128, 123, 116);
        jPanel.add(buttonJapan);
        if(ranking[0] == 1)
        	buttonJapan.setVisible(false);

        buttonJapan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ranking[1] = 1;
                new Level3_3(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonChina = new JButton("중식");
        buttonChina.setBounds(289, 128, 123, 116);
        jPanel.add(buttonChina);
        if(ranking[0] == 2)
        	buttonChina.setVisible(false);

        buttonChina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ranking[1] = 2;
                new Level3_3(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonWestern = new JButton("양식");
        buttonWestern.setBounds(424, 128, 123, 116);
        jPanel.add(buttonWestern);
        if(ranking[0] == 3)
        	buttonWestern.setVisible(false);

        buttonWestern.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ranking[1] = 3;
                new Level3_3(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonSnack = new JButton("분식");
        buttonSnack.setBounds(559, 128, 123, 116);
        jPanel.add(buttonSnack);
        if(ranking[0] == 4)
        	buttonSnack.setVisible(false);

        buttonSnack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ranking[1] = 4;
                new Level3_3(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        }); 

        //화면 중앙에 띄우기
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}