package frame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listner.Listner;

import javax.swing.*;
import java.net.InetAddress;
import java.awt.*;
import java.awt.event.*;
import ope.*;
import socket.SocketClient;
public class Fenetre extends JFrame{
    SocketClient kill;
    JTextField jtext;
    Object res;
    Response myrep;

    public Fenetre(SocketClient kil)throws Exception
    {
        this.kill=kil;
       // kill=new SocketClient(InetAddress.getLocalHost().getHostName(), 9876);
        this.setLayout(null);
        this.setTitle("Fanoratana requette");
        JPanel jp=new JPanel();
        JLabel jl=new JLabel("Soumettre la requettre ");
       jtext=new JTextField();
        jl.setBounds(10, 10, 300, 20);
        jtext.setBounds(10, 50, 350, 50);
        //Commit boot=new Commit(kill,requette);
        JButton boot=new JButton("Commit");
        boot.addMouseListener(new Listner(this));
        boot.setBounds(50, 150, 100, 50);
        this.setLayout(null);
        this.add(jl);
        this.add(jtext);
        this.add(boot);
        Response res=new Response("you are connected ");
        this.myrep=res;
        this.add(myrep);
        this.setBackground(Color.PINK);
        this.setSize(600, 300);
        this.setVisible(true);

    }

    public SocketClient getKill() {
        return kill;
    }

    public void setKill(SocketClient kill) {
        this.kill = kill;
    }

    public JTextField getJtext() {
        return jtext;
    }

    public void setJtext(JTextField jtext) {
        this.jtext = jtext;
    }

    public Object getRes() {
        return res;
    }

    public void setRes(Object res) {
        this.res = res;
    }

    public Response getMyrep() {
        return myrep;
    }

    public void setMyrep(Response myrep) {
        this.myrep = myrep;
    }

}
