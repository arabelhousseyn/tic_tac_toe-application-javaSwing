
package tic_tac_toe;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Tic_tac_toe extends JFrame{
    
    //////////////////// welcome page
    JPanel welcome;
    JButton sing_btn;
    JButton mult_btn;
    JButton set_btn;
    JButton about;
    JButton exit;
    
    
    //////////////////////////////// single player
    JPanel Single_player;
    JLabel player_name;
    JTextField text_p;
    JButton start_sing;
    JButton back_sing;
    boolean stop =false;
    boolean stop2=false;
    boolean out = false;
    boolean grand = false;
    /////////////////////////// multiplayer
    JPanel mult_play;
    JLabel playerx;
    JLabel playerO;
    JButton start_mult;
    JButton back_mult;
    JTextField text_p1;
    JTextField text_p2;
    //////////////////////////// sttings
    JPanel seeting;
    JLabel size;
    JComboBox select;
    JButton reset;
    JButton back_set;
    //////////////////////////// game page
    JPanel game;
    JLabel x;
    JLabel o;
    JLabel center;
    JLabel count1;
    JLabel count2;
    JButton back;
    JButton resett;
    JButton resett2;
    JButton b1;JButton b2;JButton b3;
    JButton b4;JButton b5;JButton b6;
    JButton b7;JButton b8;JButton b9;
    JButton turn;
    JButton turn1;
    String sel ;
    ArrayList <Object> buttons;
    ArrayList <Object> compo;
    int cnt = 0;
    int cnt2 = 0;
    int i=0;
    Font medium = new Font("Serif",Font.CENTER_BASELINE,16);
    Font large = new Font("Serif",Font.CENTER_BASELINE,28);
    private void gamepage()
    {
       game = new JPanel(null);
       JPanel pane2 = new JPanel(new GridLayout(3, 3, 8, 8));
       x = new JLabel("player");
       o= new JLabel("player");
       center = new JLabel();
       count1 = new JLabel("0");
       count2 = new JLabel("0");
       back = new JButton("back");
       resett = new JButton("reset");
       resett2 = new JButton("reset");
       turn = new JButton("turn");
       turn1 = new JButton("turn");
       b1 = new JButton();b2 = new JButton();b3 = new JButton();
       b4 = new JButton();b5 = new JButton();b6 = new JButton();
       b7 = new JButton();b8 = new JButton();b9 = new JButton();
       buttons = new ArrayList <Object>();
       buttons.add(b1);buttons.add(b2);buttons.add(b3);
       buttons.add(b4);buttons.add(b5);buttons.add(b6);
       buttons.add(b7);buttons.add(b8);buttons.add(b9);
       for(Object kf:buttons)
       {
           pane2.add((Component) kf);
       }
       game.add(pane2);
       pane2.setBounds(35, 130, 330, 280);
       x.setBounds(20, 20, 120, 20);
       o.setBounds(320, 20, 120, 20);
       center.setBounds(200, 20, 120, 20);
       count1.setBounds(20, 50, 120, 20);
       count2.setBounds(350, 50, 120, 20);
       back.setBounds(20, 470, 120, 20);
       resett.setBounds(250, 470, 120, 20);
       resett2.setBounds(250, 470, 120, 20);
       turn.setBounds(150, 470, 90, 20);
       turn.setBackground(Color.GREEN);
       game.add(x);game.add(o);game.add(center);
       game.add(count1);game.add(count2);game.add(back);
       game.add(resett);
       game.add(turn);
       turn1.setBounds(150, 470, 90, 20);
       turn1.setBackground(Color.GREEN);
       game.add(turn1);
       game.add(resett2);
       
    }
    private void checkWiner()
    {
        if(b1.getText().equals("x") && b2.getText().equals("x")&& b3.getText().equals("x"))
        {
            String win = "the winner is "+x.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt++;
            count1.setText(String.valueOf(cnt));
            b4.setEnabled(false);b7.setEnabled(false);
            b5.setEnabled(false);b8.setEnabled(false);
            b6.setEnabled(false);b9.setEnabled(false);
        }
        if(b1.getText().equals("x") && b5.getText().equals("x")&& b9.getText().equals("x"))
        {
            String win = "the winner is "+x.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            
            cnt++;
            count1.setText(String.valueOf(cnt));
            b4.setEnabled(false);b7.setEnabled(false);
            b2.setEnabled(false);b8.setEnabled(false);
            b6.setEnabled(false);b3.setEnabled(false);
        }
        if(b1.getText().equals("x") && b4.getText().equals("x")&& b7.getText().equals("x"))
        {
            String win = "the winner is "+x.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt++;
            count1.setText(String.valueOf(cnt));
            b2.setEnabled(false);b3.setEnabled(false);
            b5.setEnabled(false);b8.setEnabled(false);
            b6.setEnabled(false);b9.setEnabled(false);
        }
        if(b2.getText().equals("x") && b5.getText().equals("x")&& b8.getText().equals("x"))
        {
            String win = "the winner is "+x.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt++;
            count1.setText(String.valueOf(cnt));
            b4.setEnabled(false);b7.setEnabled(false);
            b1.setEnabled(false);b3.setEnabled(false);
            b6.setEnabled(false);b9.setEnabled(false);
        }
        
        if(b3.getText().equals("x") && b6.getText().equals("x")&& b9.getText().equals("x"))
        {
            String win = "the winner is "+x.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt++;
            count1.setText(String.valueOf(cnt));
            cnt = 0;
            b4.setEnabled(false);b7.setEnabled(false);
            b5.setEnabled(false);b8.setEnabled(false);
            b1.setEnabled(false);b2.setEnabled(false);
        }
        
        if(b3.getText().equals("x") && b5.getText().equals("x")&& b7.getText().equals("x"))
        {
            String win = "the winner is "+x.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt++;
            count1.setText(String.valueOf(cnt));
            b4.setEnabled(false);b1.setEnabled(false);
            b2.setEnabled(false);b8.setEnabled(false);
            b6.setEnabled(false);b9.setEnabled(false);
        }
        
        if(b4.getText().equals("x") && b5.getText().equals("x")&& b6.getText().equals("x"))
        {
            String win = "the winner is "+x.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt++;
            count1.setText(String.valueOf(cnt));
            b1.setEnabled(false);b7.setEnabled(false);
            b2.setEnabled(false);b8.setEnabled(false);
            b3.setEnabled(false);b9.setEnabled(false);
        }
        if(b7.getText().equals("x") && b8.getText().equals("x")&& b9.getText().equals("x"))
        {
            String win = "the winner is "+x.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt++;
            count1.setText(String.valueOf(cnt));
            b4.setEnabled(false);b1.setEnabled(false);
            b5.setEnabled(false);b2.setEnabled(false);
            b6.setEnabled(false);b3.setEnabled(false);
        }
        
        
        if(b1.getText().equals("o") && b2.getText().equals("o")&& b3.getText().equals("o"))
        {
            String win = "the winner is "+o.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt2++;
            count2.setText(String.valueOf(cnt2));
            
            b4.setEnabled(false);b7.setEnabled(false);
            b5.setEnabled(false);b8.setEnabled(false);
            b6.setEnabled(false);b9.setEnabled(false);
        }
        if(b1.getText().equals("o") && b5.getText().equals("o")&& b9.getText().equals("o"))
        {
            String win = "the winner is "+o.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            
            cnt2++;
            count2.setText(String.valueOf(cnt2));
            b4.setEnabled(false);b7.setEnabled(false);
            b2.setEnabled(false);b8.setEnabled(false);
            b6.setEnabled(false);b3.setEnabled(false);
        }
        if(b1.getText().equals("o") && b4.getText().equals("o")&& b7.getText().equals("o"))
        {
            String win = "the winner is "+o.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt2++;
            count2.setText(String.valueOf(cnt2));
            b2.setEnabled(false);b3.setEnabled(false);
            b5.setEnabled(false);b8.setEnabled(false);
            b6.setEnabled(false);b9.setEnabled(false);
        }
        if(b2.getText().equals("o") && b5.getText().equals("o")&& b8.getText().equals("o"))
        {
            String win = "the winner is "+o.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt2++;
            count2.setText(String.valueOf(cnt2));
            b4.setEnabled(false);b7.setEnabled(false);
            b1.setEnabled(false);b3.setEnabled(false);
            b6.setEnabled(false);b9.setEnabled(false);
        }
        
        if(b3.getText().equals("o") && b6.getText().equals("o")&& b9.getText().equals("o"))
        {
            String win = "the winner is "+o.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt2++;
            count2.setText(String.valueOf(cnt2));
            b4.setEnabled(false);b7.setEnabled(false);
            b5.setEnabled(false);b8.setEnabled(false);
            b1.setEnabled(false);b2.setEnabled(false);
        }
        
        if(b3.getText().equals("o") && b5.getText().equals("o")&& b7.getText().equals("o"))
        {
            String win = "the winner is "+o.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt2++;
            count2.setText(String.valueOf(cnt2));
            b4.setEnabled(false);b1.setEnabled(false);
            b2.setEnabled(false);b8.setEnabled(false);
            b6.setEnabled(false);b9.setEnabled(false);
        }
        
        if(b4.getText().equals("o") && b5.getText().equals("o")&& b6.getText().equals("o"))
        {
            String win = "the winner is "+o.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt2++;
            count2.setText(String.valueOf(cnt2));
            b1.setEnabled(false);b7.setEnabled(false);
            b2.setEnabled(false);b8.setEnabled(false);
            b3.setEnabled(false);b9.setEnabled(false);
        }
        if(b7.getText().equals("o") && b8.getText().equals("o")&& b9.getText().equals("o"))
        {
            String win = "the winner is "+o.getText();
            JOptionPane.showMessageDialog(null, win, playerx.getText(), JOptionPane.INFORMATION_MESSAGE);
            cnt2++;
            count2.setText(String.valueOf(cnt2));
            b4.setEnabled(false);b1.setEnabled(false);
            b5.setEnabled(false);b2.setEnabled(false);
            b6.setEnabled(false);b3.setEnabled(false);
        }
        
    }
    
    private void play()
    {
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setText(sel);
                checkWiner();
                b1.setEnabled(false);
            } 
        });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                b2.setText(sel);
                checkWiner();
                 b2.setEnabled(false);
            }
        });
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                b3.setText(sel);
                checkWiner();
                 b3.setEnabled(false);
            }
        });
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                b4.setText(sel);
                checkWiner();
                 b4.setEnabled(false);
            }
        });
        b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                b5.setText(sel);
                checkWiner();
                 b5.setEnabled(false);
            }
        });
        b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                b6.setText(sel);
                checkWiner();
                 b6.setEnabled(false);
            }
        });
        b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                b7.setText(sel);
                checkWiner();
                 b7.setEnabled(false);
            }
        });
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                b8.setText(sel);
                checkWiner();
                 b8.setEnabled(false);
            }
        });
        b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                b9.setText(sel);
                checkWiner();
                 b9.setEnabled(false);
            }
        });
        
                
    }
    private void swap()
    {
        if(center.getText().equals("x"))
        {
            sel = "o";
            sel.equals("o");
            center.setText(sel);
        }else{
            sel = "x";
            sel.equals("x");
            center.setText(sel);
        }
    }
    private void computer()
    {
                buttons = new ArrayList <Object>();
        buttons.add(b1);buttons.add(b2);buttons.add(b3);
        buttons.add(b4);buttons.add(b5);buttons.add(b6);
        buttons.add(b7);buttons.add(b8);buttons.add(b9);
       
        int btns = buttons.size();
        if(center.getText().equals("o") && out == false)
        {
            while(stop == false)
            {
                
            int rannd = (int)(Math.random()*btns);
            if(buttons.get(rannd) == b1 && b1.isEnabled() == true)
            {
                if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
                b1.setText(sel);
                b1.setEnabled(false);
                stop = true;
                 stop2=false;
                 grand = true;

            }
            if(buttons.get(rannd) == b2 && b2.isEnabled() == true)
            {
                if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
                b2.setText(sel);
                b2.setEnabled(false);
                stop = true;
                stop2=false;
                grand = true;

            }
            if(buttons.get(rannd) == b3 && b3.isEnabled() == true)
            {
                if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
                b3.setText(sel);
                b3.setEnabled(false);
                stop = true;
                stop2=false;
                grand = true;
            }
            if(buttons.get(rannd) == b4 && b4.isEnabled() == true)
            {
                if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
                b4.setText(sel);
                b4.setEnabled(false);
                stop = true;
                stop2=false;
                grand = true;
            }
            if(buttons.get(rannd) == b5 && b5.isEnabled() == true)
            {
                if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
                b5.setText(sel);
                b5.setEnabled(false);
                stop = true;
                stop2=false;
                grand = true;
            }
            if(buttons.get(rannd) == b6 && b6.isEnabled() == true)
            {
                if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
                
                b6.setText(sel);
                b6.setEnabled(false);
                stop = true;
                stop2=false;
                out = true;
                grand = true;
            }
            if(buttons.get(rannd) == b7 && b7.isEnabled() == true)
            {
                if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
                b7.setText(sel);
                b7.setEnabled(false);
                stop = true;
                stop2=false;
                grand = true;
            }
            if(buttons.get(rannd) == b8 && b8.isEnabled() == true)
            {
                if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
                b8.setText(sel);
                b8.setEnabled(false);
                stop = true;
                stop2=false;
                grand = true;
            }
            if(buttons.get(rannd) == b9 && b9.isEnabled() == true)
            {
                if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
                b9.setText(sel);
                b9.setEnabled(false);
                stop = true;
                stop2=false;
                grand = true;

            }
            if(sel.equals("x"))
                 {
                  sing_player();
                  out = true;
                 }
            }
        }
    }
    private void sing_player()
            
    {
   
   if(center.getText().equals("x") && stop2 == false){

              b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(center.getText().equals("o"))
                {
                    computer();
                    stop2=true;
                }
                b1.setText(sel);
                b1.setEnabled(false);
                stop = false;
                out = false;
                grand = true;
                
            } 
        });
          
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sel.equals("o"))
                {
                    computer();
                   stop2=true;
                }
                b2.setText(sel);
                 b2.setEnabled(false);
                 stop = false;
                  out = false;
                  grand = true;
                 
            }
        });
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sel.equals("o"))
                {
                    computer();
                   stop2=true;
                }
                b3.setText(sel);
                 b3.setEnabled(false);
                 stop = false;
                  out = false;
                  grand = true;
            }
        });
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sel.equals("o"))
                {
                    
                    
                    computer();
                    stop2=true;
                   
                }
                b4.setText(sel);
                 b4.setEnabled(false);
                 stop = false;
                  out = false;
                  grand = true;
            }
        });
        b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sel.equals("o"))
                {
                    
                    
                    computer();
                    stop2=true;
                   
                }
                b5.setText(sel);
                 b5.setEnabled(false);
                 stop = false;
                  out = false;
                  grand = true;

            }
        });
        b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sel.equals("o"))
                {
                    
                    
                    computer();
                    stop2=true;
                   
                }
                b6.setText(sel);
                 b6.setEnabled(false);
                 stop = false;
                  out = false;
                  grand = true;

                  
            }
        });
        b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sel.equals("o"))
                {
                    
                    
                    computer();
                    stop2=true;
                   
                }
                b7.setText(sel);
                 b7.setEnabled(false);
                 stop = false;
                  out = false;
                  grand = true;
            }
        });
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sel.equals("o"))
                {
                    
                    
                    computer();
                    stop2=true;
                   
                }
                b8.setText(sel);
                 b8.setEnabled(false);
                 stop = false;
                  out = false;
                  grand = true;
            }
        });
        b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sel.equals("o"))
                {
                    computer();
                    stop2=true;
                }
                b9.setText(sel);
                 b9.setEnabled(false);
                 stop = false;
                  out = false;
                  grand = true;
            }
        });  
          if(center.getText().equals("o"))
                {
                    computer();
                    stop2=true;
                }
        }
       }
    
    private void welcome(){
       welcome = new JPanel(null);
       sing_btn = new JButton("single player");
       mult_btn = new JButton("multiplayer");
       set_btn = new JButton("settings");
       about = new JButton("about");
       exit = new JButton("exit");
       welcome.add(sing_btn);
       welcome.add(mult_btn);
       welcome.add(set_btn);
       welcome.add(about);
       welcome.add(exit);
       sing_btn.setBounds(128, 80, 125, 50);
       mult_btn.setBounds(128, 150, 125, 50);
       set_btn.setBounds(125, 220, 125, 50);
       about.setBounds(125, 290, 125, 50);
       exit.setBounds(125, 360, 125, 50);
    }
    private void single(){
        Single_player = new JPanel(null);
        player_name = new JLabel("player name ");
        start_sing = new JButton("play");
        back_sing = new JButton("back");
        text_p = new JTextField();
        Single_player.add(player_name);
        Single_player.add(start_sing);
        Single_player.add(back_sing);
        Single_player.add(text_p);
        player_name.setBounds(100, 204, 120, 20);
        text_p.setBounds(180, 200, 120, 29);
        start_sing.setBounds(100,290,200,29);
        back_sing.setBounds(100,350,200,29);
    }
    private void mult()
    {
       mult_play = new JPanel(null); 
       playerx = new JLabel("playerX");
       playerO = new JLabel("playerO");
       start_mult = new JButton("play");
       back_mult = new JButton("back");
       text_p1 = new JTextField();
       text_p2 = new JTextField();
       mult_play.add(playerx);
       mult_play.add(playerO);
       mult_play.add(start_mult);
       mult_play.add(back_mult);
       mult_play.add(text_p1);
       mult_play.add(text_p2);
       playerx.setBounds(100, 204, 120, 20);
       playerO.setBounds(100, 250, 120, 20);
       text_p1.setBounds(150, 204, 120, 20);
       text_p2.setBounds(150, 250, 120, 20);
       start_mult.setBounds(130, 290, 150, 40);
       back_mult.setBounds(130, 340, 150, 40);
    }
    private void seetings(){
     seeting = new JPanel(null);
     size = new JLabel("font Size");
     String[] sel = {"medium","large"};
     select = new JComboBox(sel);
     reset = new JButton("reset");
     back_set = new JButton("back");
     seeting.add(size);
     seeting.add(select);
     seeting.add(reset);
     seeting.add(back_set);
     size.setBounds(120, 204, 120, 20);
     select.setBounds(180, 204, 80, 20);
     reset.setBounds(130, 250, 150, 40);
     back_set.setBounds(130, 310, 150, 40);
    }
  
    public Tic_tac_toe(){
        init();
    }
    private void init(){
        welcome();
        single();
        mult();
        seetings();
        gamepage();
        add(welcome);
        add(Single_player);
        add(mult_play);
        add(seeting);
        add(game);
        
        
        CardLayout card =new CardLayout();
        Container c = getContentPane();
        c.setLayout(card);
        
        c.getLayout().addLayoutComponent("welcome", welcome);
        c.getLayout().addLayoutComponent("single", Single_player);
        c.getLayout().addLayoutComponent("mult", mult_play);
        c.getLayout().addLayoutComponent("set", seeting);
        c.getLayout().addLayoutComponent("gamepage", game);
        
        
        turn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                swap();
                grand = false;
                
            }
        });
        
        sing_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               card.show(c, "single");
            }
        });
        
        mult_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(c, "mult");
            }
        });
        
        set_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(c, "set");
            }
        });
        
        
        about.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "this game it was"
                       + " developed by elhousseyn arab"
                       + " you can even develop it thank you ", "about", JOptionPane.PLAIN_MESSAGE);
            }
        });
        
        
        back_sing.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(c, "welcome");
            }
        });
        
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(null, "are you want to exit :", "exit",JOptionPane.YES_NO_OPTION);
                switch(n)
                {
                    case JOptionPane.OK_OPTION : System.exit(0);break;
                    case JOptionPane.NO_OPTION : ;break;
                }
            }
        });
        back_mult.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               card.show(c, "welcome");
            }
        });
        back_set.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(c, "welcome");
            }
        });
        reset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               select.setSelectedIndex(0);
            }
        });
        start_mult.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text_p1.getText().equals("") && !text_p2.getText().equals(""))
                {
                    if(text_p1.getText().equals(text_p2.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "enter two names player diffirent", "warning", JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        start_mult.setEnabled(true);
                        String[] chose = {"x","o"};
                    int n = chose.length;
                    int rand = (int) (Math.random()*n);
                     sel = chose[rand];
                    center.setText(sel);
                    cnt = 0;
                    cnt2 = 0;
                    play();
                    x.setText(text_p1.getText() + " x");
                    o.setText(text_p2.getText() + " o");
                    card.show(c, "gamepage");
                        turn.setVisible(true);
                   turn1.setVisible(false);
                   resett.setVisible(true);
                   resett2.setVisible(false);
                    }
                    
                } else{
                    start_mult.setEnabled(false);
                }
            }
        });
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(c, "welcome");
                count1.setText("0");
               count2.setText("0");
               b1.setText("");b2.setText("");b3.setText("");
               b4.setText("");b5.setText("");b6.setText("");
               b7.setText("");b8.setText("");b9.setText("");
               b1.setEnabled(true);b2.setEnabled(true);b3.setEnabled(true);
               b4.setEnabled(true);b7.setEnabled(true);
            b5.setEnabled(true);b8.setEnabled(true);
            b6.setEnabled(true);b9.setEnabled(true);
            }
        });
        start_sing.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text_p.getText().equals(""))
                {
                    
                    String[] chose = {"x","o"};
                    int n = chose.length;
                    System.out.println(n);
                    int rand = (int) (Math.random()*n);
                    center.setText(chose[rand]);
                    sel = chose[rand];
                    cnt = 0;
                    cnt2 = 0;
                   x.setText(text_p.getText() + " x");
                   o.setText("computer o");
                   sing_player();
                   computer();
                   card.show(c,"gamepage");
                   turn.setVisible(false);
                   turn1.setVisible(true);
                   resett.setVisible(false);
                   resett2.setVisible(true);
                   
                } else{
                    start_sing.setEnabled(false);
                }
            }
        });
        turn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               swap();
               sing_player();
               computer();
               checkWiner();
            }
        });
        resett.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               b1.setText("");b2.setText("");b3.setText("");
               b4.setText("");b5.setText("");b6.setText("");
               b7.setText("");b8.setText("");b9.setText("");
               b1.setEnabled(true);b2.setEnabled(true);b3.setEnabled(true);
               b4.setEnabled(true);b7.setEnabled(true);
            b5.setEnabled(true);b8.setEnabled(true);
            b6.setEnabled(true);b9.setEnabled(true);
            String[] chose = {"x","o"};
                    int n = chose.length;
                    System.out.println(n);
                    int rand = (int) (Math.random()*n);
                    center.setText(chose[rand]);
                    sel = chose[rand];
            }
        });
        resett2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               b1.setText("");b2.setText("");b3.setText("");
               b4.setText("");b5.setText("");b6.setText("");
               b7.setText("");b8.setText("");b9.setText("");
               b1.setEnabled(true);b2.setEnabled(true);b3.setEnabled(true);
               b4.setEnabled(true);b7.setEnabled(true);
            b5.setEnabled(true);b8.setEnabled(true);
            b6.setEnabled(true);b9.setEnabled(true);
            String[] chose = {"x","o"};
                    int n = chose.length;
                    System.out.println(n);
                    int rand = (int) (Math.random()*n);
                    center.setText(chose[rand]);
                    sel = chose[rand];
                    computer();
            }
        });
        select.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = select.getSelectedItem().toString();
               if(n.equals("medium"))
                {
                  sing_btn.setFont(medium);mult_btn.setFont(medium);
                  set_btn.setFont(medium);about.setFont(medium);
                  exit.setFont(medium);
                    
                } else if(n.equals("large"))
                {
                    
                } 
            }
        });
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 550);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Tic_tac_toe();
                
            }
        });
       
    }

    
}
