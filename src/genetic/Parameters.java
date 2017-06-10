package genetic;

import javax.swing.JFrame;

public class Parameters extends javax.swing.JFrame {

    public Main_Interface parent;
    public Parameters(Main_Interface par) {
        initComponents();
        parent = par;
        setTitle("Properties");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        populationSizeBox = new javax.swing.JComboBox<>();
        populationSizeLabel = new javax.swing.JLabel();
        mutationPercantageLabel = new javax.swing.JLabel();
        mutationPercantageSlider = new javax.swing.JSlider();
        reproductionLabel = new javax.swing.JLabel();
        reproductionBox = new javax.swing.JComboBox<>();
        mutationMethodLabel = new javax.swing.JLabel();
        mutationMethodBox = new javax.swing.JComboBox<>();
        selectionLabel = new javax.swing.JLabel();
        selectionBox = new javax.swing.JComboBox<>();
        repacementPercentageLabel = new javax.swing.JLabel();
        ReplacementPercantageSlider = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeButton.setText("OK");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        populationSizeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "1000", "10000" }));
        populationSizeBox.setSelectedIndex(2);
        populationSizeBox.setToolTipText("");

        populationSizeLabel.setText("Population size");

        mutationPercantageLabel.setText("Mutation percantage: 5%");

        mutationPercantageSlider.setMaximum(10);
        mutationPercantageSlider.setValue(5);
        mutationPercantageSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mutationPercantageSliderStateChanged(evt);
            }
        });

        reproductionLabel.setText("Reproduction method");

        reproductionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PMX Operator", "OX Operator", "CX Operator" }));

        mutationMethodLabel.setText("Mutation method");

        mutationMethodBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple inversion", "Partial inversion", "Scramble mutation" }));

        selectionLabel.setText("Selection method");

        selectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roulette wheel", "Ranking method (10%)" }));

        repacementPercentageLabel.setText("Replace percantage: 40%");

        ReplacementPercantageSlider.setMaximum(50);
        ReplacementPercantageSlider.setMinimum(10);
        ReplacementPercantageSlider.setValue(40);
        ReplacementPercantageSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ReplacementPercantageSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reproductionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mutationPercantageLabel)
                                    .addComponent(mutationMethodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mutationMethodBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectionBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mutationPercantageSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reproductionBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(repacementPercentageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(populationSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReplacementPercantageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(populationSizeBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(populationSizeBox)
                    .addComponent(populationSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReplacementPercantageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repacementPercentageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(selectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reproductionBox)
                    .addComponent(reproductionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mutationPercantageSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mutationPercantageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mutationMethodLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mutationMethodBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(closeButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        parent.evolution.populationSize = Integer.parseInt((String)populationSizeBox.getSelectedItem());
        parent.evolution.mutationPercent = mutationPercantageSlider.getValue();
        parent.evolution.mutationMethod = (String) mutationMethodBox.getSelectedItem();
        parent.evolution.selectionMethod = (String) selectionBox.getSelectedItem();
        parent.evolution.reproductionMethod = (String) reproductionBox.getSelectedItem();
        parent.evolution.population = new Specimen[parent.evolution.populationSize];
        parent.evolution.repChances = new double[parent.evolution.populationSize];
        parent.evolution.replacementPercent = ReplacementPercantageSlider.getValue();
        parent.setEnableStartButton();
        //parent.repaint();
        
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed
    
    private void mutationPercantageSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mutationPercantageSliderStateChanged
        mutationPercantageLabel.setText("Mutation percantage: "+mutationPercantageSlider.getValue() + "%");
    }//GEN-LAST:event_mutationPercantageSliderStateChanged

    private void ReplacementPercantageSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ReplacementPercantageSliderStateChanged
        repacementPercentageLabel.setText("Replace percentage: "+ReplacementPercantageSlider.getValue()+"%");
    }//GEN-LAST:event_ReplacementPercantageSliderStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider ReplacementPercantageSlider;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> mutationMethodBox;
    private javax.swing.JLabel mutationMethodLabel;
    private javax.swing.JLabel mutationPercantageLabel;
    private javax.swing.JSlider mutationPercantageSlider;
    private javax.swing.JComboBox<String> populationSizeBox;
    private javax.swing.JLabel populationSizeLabel;
    private javax.swing.JLabel repacementPercentageLabel;
    private javax.swing.JComboBox<String> reproductionBox;
    private javax.swing.JLabel reproductionLabel;
    private javax.swing.JComboBox<String> selectionBox;
    private javax.swing.JLabel selectionLabel;
    // End of variables declaration//GEN-END:variables
}
