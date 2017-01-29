/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodulacionv1.pkg1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ibrah
 */
public class JPPortadorasModulacionCosPm extends javax.swing.JPanel {

    /**
     * Creates new form JPanelModPm
     */
    double vc,vm,fc,fm,k,tiempo;
    public JPPortadorasModulacionCosPm(double vc,double vm,double fc,double fm,double k,double tiempo) {
        initComponents();
        this.vc=vc;
        this.vm=vm;
        this.fc=fc;
        this.fm=fm;
        this.k=k;
        this.tiempo=tiempo;
        graficarPortadoraModuladaCos_Cos();
    
    }

           // Creamos y rellenamos el modelo de datos
        public void graficarPortadoraModuladaCos_Cos(){
        double señalModulada=0.00;
        double Wc=2*Math.PI*fc;
        double Wm=2*Math.PI*fm;
        double t=0.0;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        while(t<tiempo){
            
        señalModulada=vc*Math.cos(Wc*t+k*vm*Math.cos(Wm*t));
        
        dataset.setValue(señalModulada,"", ""+t);
                 t+=0.01;
        }
    // dibujando el grafico
    JFreeChart chart = ChartFactory.createLineChart("Modulacion PM COS-COS", "TIEMPO",
   "FRECUENCIA", dataset, PlotOrientation.VERTICAL, true,
   true, false);
    
    // Creación del panel con el gráfico
ChartPanel panel = new ChartPanel(chart);

panel.setBounds(0, 0, this.getWidth(), this.getHeight());
            panel.setBackground(Color.yellow);


            this.setLayout(new BorderLayout());
            this.add(panel, BorderLayout.CENTER);
            this.setPreferredSize(new Dimension(920,90));
            this.validate();
            this.repaint();
            this.repaint();
            this.setBackground(Color.yellow);


}
        
                  // Creamos y rellenamos el modelo de datos
        public void graficarPortadoraModuladaCos_Sen(){
        double señalModulada=0.00;
        double Wc=2*Math.PI*fc;
        double Wm=2*Math.PI*fm;
        double t=0.0;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        while(t<tiempo){
            
        señalModulada=vc*Math.sin(Wc*t+k*vm*Math.cos(Wm*t));
        
        dataset.setValue(señalModulada,"", ""+t);
                 t+=0.02;
        }
    // dibujando el grafico
    JFreeChart chart = ChartFactory.createLineChart("Modulacion PM COS-SEN", "TIEMPO",
   "FRECUENCIA", dataset, PlotOrientation.VERTICAL, true,
   true, false);
    
    // Creación del panel con el gráfico
ChartPanel panel = new ChartPanel(chart);

panel.setBounds(0, 0, this.getWidth(), this.getHeight());
            panel.setBackground(Color.yellow);


            this.setLayout(new BorderLayout());
            this.add(panel, BorderLayout.CENTER);
            this.setPreferredSize(new Dimension(920,90));
            this.validate();
            this.repaint();
            this.repaint();
            this.setBackground(Color.yellow);


}
        
                  // Creamos y rellenamos el modelo de datos
        public void graficarPortadoraModuladaCos_Tri(){
        double señalModulada=0.00;
        double Wc=2*Math.PI*fc;
        double Wm=2*Math.PI*fm;
        double t=0.0;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        while(t<tiempo){
            
        señalModulada=(2*vc/Math.PI)*Math.asin(Math.sin(Wc*t+k*vm*Math.cos(Wm*t)));
        
        dataset.setValue(señalModulada,"", ""+t);
                 t+=0.02;
        }
    // dibujando el grafico
    JFreeChart chart = ChartFactory.createLineChart("Modulacion PM COS-TRI", "TIEMPO",
   "FRECUENCIA", dataset, PlotOrientation.VERTICAL, true,
   true, false);
    
    // Creación del panel con el gráfico
ChartPanel panel = new ChartPanel(chart);

panel.setBounds(0, 0, this.getWidth(), this.getHeight());
            panel.setBackground(Color.yellow);


            this.setLayout(new BorderLayout());
            this.add(panel, BorderLayout.CENTER);
            this.setPreferredSize(new Dimension(920,90));
            this.validate();
            this.repaint();
            this.repaint();
            this.setBackground(Color.yellow);


}
        
        
        
        
        
        
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
