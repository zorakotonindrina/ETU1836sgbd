package frame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import frame.Fenetre;
public class Response extends JPanel { 
    Object myobject;
    JTable jt;

    public Response(Object obj) {
        this.myobject = obj;
        //.out.println("efa le reponseeee ");
        //System.out.println(myobject);
        String[][] resp=null;
        String [] resp1=null;
        String resp2=null;
        if(myobject instanceof String[][]){
            resp=(String[][])myobject;
            jt=new JTable(resp, resp[0]);
            jt.setBounds(10, 10, 400, 400);
            print(resp);
            this.add(jt);
        }

        if(myobject instanceof String[]){
            resp1=(String[])myobject;
            jt=new JTable(resp, resp1);
            mprint(resp1);
            this.add(jt);
        }
        
        else if(myobject instanceof String){
            resp2=(String)myobject;
            JLabel jl=new JLabel(resp2);
            jl.setBounds(400, 100, 400, 100);
            jl.setSize(20,20);
            System.out.println(myobject);
            this.add(jl);
        }
        
    }

    public Object getMyobject() {
        return myobject;
    }

    public void setMyobject(Object myobject) {
        this.myobject = myobject;
    }

    public JTable getJt() {
        return jt;
    }

    public void setJt(JTable jt) {
        this.jt = jt;
    }

    public void print(String[][] tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println(tab[i][j]);
            }
            System.out.println("----------------------------------------------");
        }
    }


    public void mprint(String[] tab){
        for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i]);
        }
    }
    
}
