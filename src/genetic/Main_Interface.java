package genetic;

import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Main_Interface extends javax.swing.JFrame {

    public Evolution evolution;
    public Parameters propertiesWindow;
    public long runTime;
    
    public Main_Interface() {
        initComponents();
        this.setVisible(true);
        this.setTitle("TSP Genetic");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        evolution = new Evolution();
        StartButton.setEnabled(false);
        propertiesWindow = new Parameters(this);
        
        propertiesWindow.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent ce) {
                //palette.nodes = nodes;
                palette.repaint();
            }

            @Override
            public void componentMoved(ComponentEvent ce) {
                //palette.nodes = nodes;
                palette.repaint();
            }

            @Override
            public void componentShown(ComponentEvent ce) {
                //palette.nodes = nodes;
                palette.repaint();
            }

            @Override
            public void componentHidden(ComponentEvent ce) {
                //palette.nodes = nodes;
                palette.repaint();
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ControlPanel = new javax.swing.JPanel();
        InsertMethodCheckBox = new javax.swing.JCheckBox();
        Random1Button = new javax.swing.JButton();
        Random5Button = new javax.swing.JButton();
        Random10Button = new javax.swing.JButton();
        Random100Button = new javax.swing.JButton();
        StartButton = new javax.swing.JButton();
        ConfigButton = new javax.swing.JButton();
        saveMapButton = new javax.swing.JButton();
        loadMapButton = new javax.swing.JButton();
        Gen1Button = new javax.swing.JButton();
        Gen5Button = new javax.swing.JButton();
        Gen10Button = new javax.swing.JButton();
        Gen100Button = new javax.swing.JButton();
        palette = new genetic.Palette();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Panel"));

        InsertMethodCheckBox.setText("Insert Manually");

        Random1Button.setText("1 Random Node");
        Random1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Random1ButtonActionPerformed(evt);
            }
        });

        Random5Button.setText("5 Random Nodes");
        Random5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Random5ButtonActionPerformed(evt);
            }
        });

        Random10Button.setText("10 Random Nodes");
        Random10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Random10ButtonActionPerformed(evt);
            }
        });

        Random100Button.setText("100 Random Nodes");
        Random100Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Random100ButtonActionPerformed(evt);
            }
        });

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        ConfigButton.setText("Config");
        ConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigButtonActionPerformed(evt);
            }
        });

        saveMapButton.setText("Save map");
        saveMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMapButtonActionPerformed(evt);
            }
        });

        loadMapButton.setText("Load map");
        loadMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMapButtonActionPerformed(evt);
            }
        });

        Gen1Button.setText("Do 1 Generation");
        Gen1Button.setEnabled(false);
        Gen1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gen1ButtonActionPerformed(evt);
            }
        });

        Gen5Button.setText("Do 5 Generations");
        Gen5Button.setEnabled(false);
        Gen5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gen5ButtonActionPerformed(evt);
            }
        });

        Gen10Button.setText("Do 10 Generations");
        Gen10Button.setEnabled(false);
        Gen10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gen10ButtonActionPerformed(evt);
            }
        });

        Gen100Button.setText("Do 100 Generations");
        Gen100Button.setEnabled(false);
        Gen100Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gen100ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfigButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InsertMethodCheckBox)
                            .addComponent(saveMapButton)
                            .addComponent(loadMapButton))
                        .addGap(18, 18, 18)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Random1Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Random5Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Random10Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Random100Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Gen10Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gen100Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gen5Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gen1Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertMethodCheckBox)
                    .addComponent(Random1Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Random5Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Random10Button)
                    .addComponent(saveMapButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Random100Button)
                    .addComponent(loadMapButton))
                .addGap(12, 12, 12)
                .addComponent(ConfigButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Gen1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gen5Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gen10Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gen100Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        palette.setBackground(new java.awt.Color(0, 0, 0));
        palette.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paletteMousePressed(evt);
            }
        });

        DisplayArea.setColumns(20);
        DisplayArea.setRows(5);
        jScrollPane1.setViewportView(DisplayArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(palette, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(palette, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Random1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Random1ButtonActionPerformed
        int amount = 1;
        Random r = new Random();
        Point p;
        for (int i=0; i<amount; i++){
            int x = r.nextInt(palette.getWidth());
            int y = r.nextInt(palette.getHeight());
            p = new Point(x, y);
            Genetic.nodes.add(p);
            palette.paintCity(p);
        }
    }//GEN-LAST:event_Random1ButtonActionPerformed

    private void Random5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Random5ButtonActionPerformed
        int amount = 5;
        Random r = new Random();
        Point p;
        for (int i=0; i<amount; i++){
            int x = r.nextInt(palette.getWidth());
            int y = r.nextInt(palette.getHeight());
            p = new Point(x, y);
            Genetic.nodes.add(p);
            palette.paintCity(p);
        }
    }//GEN-LAST:event_Random5ButtonActionPerformed

    private void Random10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Random10ButtonActionPerformed
        int amount = 10;
        Random r = new Random();
        Point p;
        for (int i=0; i<amount; i++){
            int x = r.nextInt(palette.getWidth());
            int y = r.nextInt(palette.getHeight());
            p = new Point(x, y);
            Genetic.nodes.add(p);
            palette.paintCity(p);
        }
    }//GEN-LAST:event_Random10ButtonActionPerformed

    private void Random100ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Random100ButtonActionPerformed
        int amount = 100;
        Random r = new Random();
        Point p;
        for (int i=0; i<amount; i++){
            int x = r.nextInt(palette.getWidth());
            int y = r.nextInt(palette.getHeight());
            p = new Point(x, y);
            Genetic.nodes.add(p);
            palette.paintCity(p);
        }
    }//GEN-LAST:event_Random100ButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        if (StartButton.getText() == "Start"){    
            if (Genetic.nodes.isEmpty()) return;
            disableInput();
            evolution.setNodes(Genetic.nodes);
            StartButton.setText("Do Generations ASAP");
            StartButton.setToolTipText("Calculates generations, until 1000 generations without progress");
            evolution.firstGeneration();
            DisplayArea.setText("Generation: "+evolution.generation + "\n" + "Grade: " + evolution.getBestOne().getGrade());
            palette.paintSpeciman(evolution.getBestOne());
        }else{
            long startTime = System.currentTimeMillis();
            Specimen best = evolution.getBestOne();
            int i=0;
            double similarity;
            while (true){
                evolution.evolve();
                if ((int)evolution.getBestOne().getGrade() <  (int)best.getGrade()){
                    best = evolution.getBestOne();
                    i=0;
                }else i++;
                palette.paintSpeciman(evolution.getBestOne());
                //if (i == 1000) break;
                similarity = evolution.similarityPercent();
                if ((i == 1000) || similarity >= 0.1) break;
            }
            long endTime = System.currentTimeMillis();
            runTime = endTime - startTime;
            Result result = new Result(evolution.getBestOne().getGrade(), runTime, evolution.generation);
            DisplayArea.setText("Generation: "+evolution.generation + "\n" + "Grade: " + evolution.getBestOne().getGrade() + "\nRuntime: "+runTime);
            try {
                FileManager.saveResult(result);
            } catch (IOException ex) {
                Logger.getLogger(Main_Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_StartButtonActionPerformed

    private void paletteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paletteMousePressed
        if (InsertMethodCheckBox.isSelected()){
           Point p = new Point(evt.getX(), evt.getY());
           Genetic.nodes.add(p);
           palette.paintCity(p);
        }
    }//GEN-LAST:event_paletteMousePressed

    private void ConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigButtonActionPerformed
        propertiesWindow.setVisible(true);        
    }//GEN-LAST:event_ConfigButtonActionPerformed

    private void saveMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMapButtonActionPerformed
        FileManager fm = new FileManager();
        try {
            fm.saveToFile(Genetic.nodes);
        } catch (IOException ex) {
            return;
        }
    }//GEN-LAST:event_saveMapButtonActionPerformed

    private void loadMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMapButtonActionPerformed
        FileManager fm = new FileManager();
        try {
            ArrayList<Point> temp;
            temp = fm.loadFromFile();
            if (temp != null) Genetic.nodes = temp;
        } catch (IOException ex) {
            return;
        }
        palette.lastSpecimen = null;
        palette.repaint();
    }//GEN-LAST:event_loadMapButtonActionPerformed

    private void Gen1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gen1ButtonActionPerformed
        if (evolution.generation == 0) evolution.firstGeneration();
        else evolution.evolve();
        DisplayArea.setText("Generation: "+evolution.generation + "\n" + "Best: [ "+evolution.getBestOne()+"]" + "\n" + "Grade: " + evolution.getBestOne().getGrade());
        palette.paintSpeciman(evolution.getBestOne());
    }//GEN-LAST:event_Gen1ButtonActionPerformed

    private void Gen5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gen5ButtonActionPerformed
        for(int i=0; i<5; i++){
            if (evolution.generation == 0) evolution.firstGeneration();
            else evolution.evolve();
        }
        DisplayArea.setText("Generation: "+evolution.generation + "\n" + "Best: [ "+evolution.getBestOne()+"]" + "\n" + "Grade: " + evolution.getBestOne().getGrade());
        palette.paintSpeciman(evolution.getBestOne());
    }//GEN-LAST:event_Gen5ButtonActionPerformed

    private void Gen10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gen10ButtonActionPerformed
        for(int i=0; i<10; i++){
            if (evolution.generation == 0) evolution.firstGeneration();
            else evolution.evolve();
        }
        DisplayArea.setText("Generation: "+evolution.generation + "\n" + "Best: [ "+evolution.getBestOne()+"]" + "\n" + "Grade: " + evolution.getBestOne().getGrade());
        palette.paintSpeciman(evolution.getBestOne());
    }//GEN-LAST:event_Gen10ButtonActionPerformed

    private void Gen100ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gen100ButtonActionPerformed
        for(int i=0; i<100; i++){
            if (evolution.generation == 0) evolution.firstGeneration();
            else evolution.evolve();
        }
        DisplayArea.setText("Generation: "+evolution.generation + "\n" + "Best: [ "+evolution.getBestOne()+"]" + "\n" + "Grade: " + evolution.getBestOne().getGrade());
        palette.paintSpeciman(evolution.getBestOne());
    }//GEN-LAST:event_Gen100ButtonActionPerformed
      
    public void setEnableStartButton(){
        StartButton.setEnabled(evolution.isValid());
    }
        
    public void disableInput(){
        ConfigButton.setEnabled(false);
        Random100Button.setEnabled(false);
        Random10Button.setEnabled(false);
        Random1Button.setEnabled(false);
        Random5Button.setEnabled(false);
        InsertMethodCheckBox.setSelected(false);
        InsertMethodCheckBox.setEnabled(false);
        loadMapButton.setEnabled(false);
        Gen1Button.setEnabled(true);
        Gen5Button.setEnabled(true);
        Gen10Button.setEnabled(true);
        Gen100Button.setEnabled(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfigButton;
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JTextArea DisplayArea;
    private javax.swing.JButton Gen100Button;
    private javax.swing.JButton Gen10Button;
    private javax.swing.JButton Gen1Button;
    private javax.swing.JButton Gen5Button;
    private javax.swing.JCheckBox InsertMethodCheckBox;
    private javax.swing.JButton Random100Button;
    private javax.swing.JButton Random10Button;
    private javax.swing.JButton Random1Button;
    private javax.swing.JButton Random5Button;
    private javax.swing.JButton StartButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadMapButton;
    private genetic.Palette palette;
    private javax.swing.JButton saveMapButton;
    // End of variables declaration//GEN-END:variables
}
