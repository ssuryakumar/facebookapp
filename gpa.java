import java.awt.*;
import java.applet.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;
public class gpa extends Applet{

	public double sub_ss,sub_se,sub_cn,sub_toc,sub_dm,sub_pp,sub_java,sub_cn_lab,sub_ss_lab,sum;
    public JLabel ans;
    /*public void init()
    {
        new gpa();
    }
    */
   public gpa()
    {
      //  JFrame f=new JFrame("Anna University 5th sem cse - GPA ");
       // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setVisible(true);
        //f.setSize(1000,500);
        
        
        
        // panel for buttons and textboxes with grid layout
    
      /*  JLabel head=new JLabel("ANNA UNIVERSITY 5TH SEM GPA CALCULATION");
        head.setLocation(0,0);
        head.setSize(100,100);
        add(head,BorderLayout.NORTH);*/
        
    
        JPanel p=new JPanel();
        p.setBackground(Color.white);
        p.setVisible(true);
        //set layout
        GridLayout g=new GridLayout(13,2,10,10);
        p.setLayout(g);
        p.setBounds(50,150,80,25);
        
        // label for system software
        JLabel ss = new JLabel("SYSTEM SOFTWARE");
        p.add(ss);
        final JComboBox combo_ss=new JComboBox();
        combo_ss.addItem("none");
        combo_ss.addItem("S");
        combo_ss.addItem("A");
        combo_ss.addItem("B");
        combo_ss.addItem("C");
        combo_ss.addItem("D");
        combo_ss.addItem("E");
        p.add(combo_ss);
        combo_ss.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            if(combo_ss.getSelectedIndex()== 1)
            {
                sub_ss=4 * 10;
                
            }
            
            else if(combo_ss.getSelectedIndex()== 2)
            {
                sub_ss=4 * 9;
                
            }
            else if(combo_ss.getSelectedIndex()== 3)
            {
                sub_ss=4 * 8;
                
            }
            else if(combo_ss.getSelectedIndex()== 4)
            {
                sub_ss=4 * 7;
                
            }
            
            else if(combo_ss.getSelectedIndex()== 5)
            {
                sub_ss=4 * 6;
                
            }
            
            else if(combo_ss.getSelectedIndex()== 6)
            {
                sub_ss=4 * 5;
                
            }
            
            else
            {
              System.out.println("enter pls");
            }
            
            
         }  
        });
        
    
        JLabel se=new JLabel("SOFTWARE ENGINEERING");
        p.add(se);
        final JComboBox combo_se=new JComboBox();
        combo_se.addItem("none");
        combo_se.addItem("S");
        combo_se.addItem("A");
        combo_se.addItem("B");
        combo_se.addItem("C");
        combo_se.addItem("D");
        combo_se.addItem("E");
        p.add(combo_se);
        
        combo_se.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            if(combo_se.getSelectedIndex()== 1)
            {
                sub_se=3 * 10;
                
            }
            
            else if(combo_se.getSelectedIndex()== 2)
            {
                sub_se=3 * 9;
                
            }
            else if(combo_se.getSelectedIndex()== 3)
            {
                sub_se=3 * 8;
                
            }
            else if(combo_se.getSelectedIndex()== 4)
            {
                sub_se=3 * 7;
                
            }
            
            else if(combo_se.getSelectedIndex()== 5)
            {
                sub_se=3 * 6;
                
            }
            
            else if(combo_se.getSelectedIndex()== 6)
            {
                sub_se=3 * 5;
                
            }
            
            else
            {
              System.out.println("enter pls");
            }
         }
        });

        
        JLabel toc=new JLabel("THEORY OF COMPUTATION");
        p.add(toc);
        final JComboBox combo_toc=new JComboBox();
        combo_toc.addItem("none");
        combo_toc.addItem("S");
        combo_toc.addItem("A");
        combo_toc.addItem("B");
        combo_toc.addItem("C");
        combo_toc.addItem("D");
        combo_toc.addItem("E");
        p.add(combo_toc);
        
        combo_toc.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            if(combo_toc.getSelectedIndex()== 1)
            {
                sub_toc=4 * 10;
                
            }
            
            else if(combo_toc.getSelectedIndex()== 2)
            {
                sub_toc=4 * 9;
                
            }
            else if(combo_toc.getSelectedIndex()== 3)
            {
                sub_toc=4 * 8;
                
            }
            else if(combo_toc.getSelectedIndex()== 4)
            {
                sub_toc=4 * 7;
                
            }
            
            else if(combo_toc.getSelectedIndex()== 5)
            {
                sub_toc=4 * 6;
                
            }
            
            else if(combo_toc.getSelectedIndex()== 6)
            {
                sub_toc=4 * 5;
                
            }
            
            else
            {
              System.out.println("enter pls");
            }
         }
        });
        
        JLabel dm=new JLabel("DISCRETE MATHEMATICS");
        p.add(dm);
        final JComboBox combo_dm=new JComboBox();
        combo_dm.addItem("none");
        combo_dm.addItem("S");
        combo_dm.addItem("A");
        combo_dm.addItem("B");
        combo_dm.addItem("C");
        combo_dm.addItem("D");
        combo_dm.addItem("E");
        p.add(combo_dm);
        
        combo_dm.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            if(combo_dm.getSelectedIndex()== 1)
            {
                sub_dm=4 * 10;
                
            }
            else if(combo_dm.getSelectedIndex()== 2)
            {
                sub_dm=4 * 9;
                
            }
            else if(combo_dm.getSelectedIndex()== 3)
            {
                sub_dm=4 * 8;
                
            }
            else if(combo_dm.getSelectedIndex()== 4)
            {
                sub_dm=4 * 7;
                
            }
            
            else if(combo_dm.getSelectedIndex()== 5)
            {
                sub_dm=4 * 6;
                
            }
            
            else if(combo_dm.getSelectedIndex()== 6)
            {
                sub_dm=4 * 5;
                
            }
            
            else
            {
              System.out.println("enter pls");  
            }
         }
        });
        
        JLabel cn=new JLabel("COMPUTER NETWORKS");
        p.add(cn);
        final JComboBox combo_cn=new JComboBox();
        combo_cn.addItem("none");
        combo_cn.addItem("S");
        combo_cn.addItem("A");
        combo_cn.addItem("B");
        combo_cn.addItem("C");
        combo_cn.addItem("D");
        combo_cn.addItem("E");
        p.add(combo_cn);
        
        combo_cn.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            if(combo_cn.getSelectedIndex()== 1)
            {
                sub_cn=3 * 10;
                
            }
            else if(combo_cn.getSelectedIndex()== 2)
            {
                sub_cn=3 * 9;
                
            }
            else if(combo_cn.getSelectedIndex()== 3)
            {
                sub_cn=3 * 8;
                
            }
            else if(combo_cn.getSelectedIndex()== 4)
            {
                sub_cn=3 * 7;
                
            }
            
            else if(combo_cn.getSelectedIndex()== 5)
            {
                sub_cn=3 * 6;
                
            }
            
            else if(combo_cn.getSelectedIndex()== 6)
            {
                sub_cn=3 * 5;
                
            }
            
            else
            {
              System.out.println("enter pls"); 
            }
         }
        });
        JLabel pp=new JLabel("PROGRAMMING PARADIGM");
        p.add(pp);
        final JComboBox combo_pp=new JComboBox();
        combo_pp.addItem("none");
        combo_pp.addItem("S");
        combo_pp.addItem("A");
        combo_pp.addItem("B");
        combo_pp.addItem("C");
        combo_pp.addItem("D");
        combo_pp.addItem("E");
        p.add(combo_pp);
        combo_pp.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            if(combo_pp.getSelectedIndex()== 1)
            {
                sub_pp=3 * 10;
                
            }
            else if(combo_pp.getSelectedIndex()== 2)
            {
                sub_pp=3 * 9;
                
            }
            else if(combo_pp.getSelectedIndex()== 3)
            {
                sub_pp=3 * 8;
                
            }
            else if(combo_pp.getSelectedIndex()== 4)
            {
                sub_pp=3 * 7;
                
            }
            
            else if(combo_pp.getSelectedIndex()== 5)
            {
                sub_pp=3 * 6;
                
            }
            
            else if(combo_pp.getSelectedIndex()== 6)
            {
                sub_pp=3 * 5;
                
            }
            
            else
            {
              System.out.println("enter pls");
            }
         }
        });
        
        JLabel pp_l_l=new JLabel("JAVA LAB");
        p.add(pp_l_l);
        final JComboBox combo_pp_l=new JComboBox();
        combo_pp_l.addItem("none");
        combo_pp_l.addItem("S");
        combo_pp_l.addItem("A");
        combo_pp_l.addItem("B");
        combo_pp_l.addItem("C");
        combo_pp_l.addItem("D");
        combo_pp_l.addItem("E");
        p.add(combo_pp_l);
        
        combo_pp_l.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            if(combo_pp_l.getSelectedIndex()== 1)
            {
                sub_java=2 * 10;
                
            }
            else if(combo_pp_l.getSelectedIndex()== 2)
            {
                sub_java=2 * 9;
                
            }
            else if(combo_pp_l.getSelectedIndex()== 3)
            {
                sub_java=2 * 8;
                
            }
            else if(combo_pp_l.getSelectedIndex()== 4)
            {
                sub_java=2 * 7;
                
            }
            
            else if(combo_pp_l.getSelectedIndex()== 5)
            {
                sub_java=2 * 6;
                
            }
            
            else if(combo_pp_l.getSelectedIndex()== 6)
            {
                sub_java=2 * 5;
                
            }
            
            else
            {
              System.out.println("enter pls"); 
            }
         }
        });
        
        JLabel cn_l_l=new JLabel("COMPUTER NETWORKS LAB");
        p.add(cn_l_l);
        final JComboBox combo_cn_l=new JComboBox();
        combo_cn_l.addItem("none");
        combo_cn_l.addItem("S");
        combo_cn_l.addItem("A");
        combo_cn_l.addItem("B");
        combo_cn_l.addItem("C");
        combo_cn_l.addItem("D");
        combo_cn_l.addItem("E");
        p.add(combo_cn_l);
        
        combo_cn_l.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            if(combo_cn_l.getSelectedIndex()== 1)
            {
                sub_cn_lab=2 * 10;
                
            }
            else if(combo_cn_l.getSelectedIndex()== 2)
            {
                sub_cn_lab=2 * 9;
                
            }
            else if(combo_cn_l.getSelectedIndex()== 3)
            {
                sub_cn_lab=2 * 8;
                
            }
            else if(combo_cn_l.getSelectedIndex()== 4)
            {
                sub_cn_lab=2 * 7;
                
            }
            
            else if(combo_cn_l.getSelectedIndex()== 5)
            {
                sub_cn_lab=2 * 6;
                
            }
            
            else if(combo_cn_l.getSelectedIndex()== 6)
            {
                sub_cn_lab=2 * 5;
                
            }
            
            else
            {
              System.out.println("enter pls");  
            }
         }
        });
        
        JLabel ss_l = new JLabel("SYSTEM SOFTWARE LAB");
        p.add(ss_l);
        final JComboBox combo_ss_l=new JComboBox();
        combo_ss_l.addItem("none");
        combo_ss_l.addItem("S");
        combo_ss_l.addItem("A");
        combo_ss_l.addItem("B");
        combo_ss_l.addItem("C");
        combo_ss_l.addItem("D");
        combo_ss_l.addItem("E");
        p.add(combo_ss_l);
        
        combo_ss_l.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            if(combo_ss_l.getSelectedIndex()== 1)
            {
                sub_ss_lab=2 * 10;
                
            }
            else if(combo_ss_l.getSelectedIndex()== 2)
            {
                sub_ss_lab=2 * 9;
                
            }
            else if(combo_ss_l.getSelectedIndex()== 3)
            {
                sub_ss_lab=2 * 8;
                
            }
            else if(combo_ss_l.getSelectedIndex()== 4)
            {
                sub_ss_lab=2 * 7;
                
            }
            
            else if(combo_ss_l.getSelectedIndex()== 5)
            {
                sub_ss_lab=2 * 6;
                
            }
            
            else if(combo_ss_l.getSelectedIndex()== 6)
            {
                sub_ss_lab=2 * 5;
                
            }
            
            else
            {
            
                System.out.println("enter pls"); 
            }
         }
        });
        
        JButton calc=new JButton("CALCULATE");
        p.add(calc);
        
       
        
        calc.addActionListener(new ActionListener()
        {                       
           public void actionPerformed(ActionEvent e)
           {
            double temp;
            temp= sub_ss + sub_se + sub_cn + sub_toc + sub_dm + sub_pp + sub_java + sub_cn_lab + sub_ss_lab;
            sum=temp/27;
            System.out.println(sum);
            ans.setText("Answer: " +sum);
                               
           }
        });
        
        ans=new JLabel("answer");
        p.add(ans);
        /*
        JLabel surya=new JLabel("developed by surya");
        p.add(surya);*/
        add(p,BorderLayout.CENTER);
    }
}
