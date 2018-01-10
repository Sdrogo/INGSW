
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import jsyntaxpane.DefaultSyntaxKit;
import jsyntaxpane.actions.CaretMonitor;
import jsyntaxpane.syntaxkits.JavaSyntaxKit;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        
        initComponents();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        EditorPannel.setEditorKit(new JavaSyntaxKit());
        DefaultSyntaxKit.initKit();

        EditorPannel.setContentType("text/java");
        SelezioneLing.setSelectedItem("text/java");
     
        new CaretMonitor(EditorPannel, IndiceRigaDoc);
        
        try {
           
            loadFile("./target/generated-sources/jflex/jsyntaxpane/lexers/ClojureLexer.java");
        } catch (IOException ex) {
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewClassDialog = new javax.swing.JDialog();
        NameDialogLabel = new javax.swing.JLabel();
        nameDialogTxt = new javax.swing.JTextField();
        TypreDialogLabel = new javax.swing.JLabel();
        ExtensionDialog = new javax.swing.JComboBox();
        PathDialogLabel = new javax.swing.JLabel();
        PathDialog = new javax.swing.JTextField();
        PathBrowseButtonDialog = new javax.swing.JButton();
        CancelButtonDialog = new javax.swing.JButton();
        OkButtonDialog = new javax.swing.JButton();
        Toolbar = new javax.swing.JToolBar();
        NewFileButton = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        SaveAsButton = new javax.swing.JButton();
        ChangeWorkspaceButton = new javax.swing.JButton();
        SplitPanel = new javax.swing.JSplitPane();
        ScrollTree = new javax.swing.JScrollPane();
        TreeNavigator = new javax.swing.JTree();
        EditorScroll = new javax.swing.JScrollPane();
        EditorPannel = new javax.swing.JEditorPane();
        IndiceRigaDoc = new javax.swing.JLabel();
        SelezioneLing = new javax.swing.JComboBox();
        SelLingLabel = new javax.swing.JLabel();

        NameDialogLabel.setText("Name :");

        TypreDialogLabel.setText("Type :");

        ExtensionDialog.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "java", "cpp", "py", "xml", "html" }));

        PathDialogLabel.setText("Source fodler : ");

        PathDialog.setText(workspace);

        PathBrowseButtonDialog.setText("Browse...");
        PathBrowseButtonDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PathBrowseButtonDialogActionPerformed(evt);
            }
        });

        CancelButtonDialog.setText("Cancel");
        CancelButtonDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonDialogActionPerformed(evt);
            }
        });

        OkButtonDialog.setText("OK");
        OkButtonDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewClassDialogLayout = new javax.swing.GroupLayout(NewClassDialog.getContentPane());
        NewClassDialog.getContentPane().setLayout(NewClassDialogLayout);
        NewClassDialogLayout.setHorizontalGroup(
            NewClassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewClassDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewClassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PathDialogLabel)
                    .addComponent(TypreDialogLabel)
                    .addComponent(NameDialogLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewClassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameDialogTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExtensionDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NewClassDialogLayout.createSequentialGroup()
                        .addComponent(PathDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PathBrowseButtonDialog)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewClassDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkButtonDialog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelButtonDialog)
                .addContainerGap())
        );
        NewClassDialogLayout.setVerticalGroup(
            NewClassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewClassDialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(NewClassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameDialogLabel)
                    .addComponent(nameDialogTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewClassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExtensionDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypreDialogLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewClassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PathDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PathDialogLabel)
                    .addComponent(PathBrowseButtonDialog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(NewClassDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButtonDialog)
                    .addComponent(OkButtonDialog))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JEdit - Progetto INGSW : Elia - Partenope");
        setPreferredSize(dim);

        Toolbar.setFloatable(false);

        NewFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jsyntaxpane/images/small-icons/icon1.png"))); // NOI18N
        NewFileButton.setToolTipText("New File");
        NewFileButton.setFocusable(false);
        NewFileButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewFileButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NewFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewFileButtonActionPerformed(evt);
            }
        });
        Toolbar.add(NewFileButton);

        LoadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jsyntaxpane/images/small-icons/folder.png"))); // NOI18N
        LoadButton.setToolTipText("Load File");
        LoadButton.setFocusable(false);
        LoadButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoadButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });
        Toolbar.add(LoadButton);

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jsyntaxpane/images/small-icons/save.png"))); // NOI18N
        SaveButton.setToolTipText("Save File");
        SaveButton.setFocusable(false);
        SaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SaveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        Toolbar.add(SaveButton);

        SaveAsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jsyntaxpane/images/small-icons/table_save.png"))); // NOI18N
        SaveAsButton.setToolTipText("Save File As");
        SaveAsButton.setFocusable(false);
        SaveAsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SaveAsButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SaveAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsButtonActionPerformed(evt);
            }
        });
        Toolbar.add(SaveAsButton);

        ChangeWorkspaceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jsyntaxpane/images/small-icons/ajaxLoader.gif"))); // NOI18N
        ChangeWorkspaceButton.setToolTipText("Change Workspace");
        ChangeWorkspaceButton.setFocusable(false);
        ChangeWorkspaceButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ChangeWorkspaceButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ChangeWorkspaceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeWorkspaceButtonMouseClicked(evt);
            }
        });
        ChangeWorkspaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeWorkspaceButtonActionPerformed(evt);
            }
        });
        Toolbar.add(ChangeWorkspaceButton);

        SplitPanel.setDividerLocation(200);
        SplitPanel.setDividerSize(10);

        TreeNavigator.setModel(new FileSystemModel(new File(workspace)));
        TreeNavigator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreeNavigatorMouseClicked(evt);
            }
        });
        ScrollTree.setViewportView(TreeNavigator);

        SplitPanel.setLeftComponent(ScrollTree);

        EditorScroll.setViewportView(EditorPannel);

        SplitPanel.setRightComponent(EditorScroll);

        IndiceRigaDoc.setText("Current Position");

        SelezioneLing.setModel(new DefaultComboBoxModel(DefaultSyntaxKit.getContentTypes()));
        SelezioneLing.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SelezioneLingItemStateChanged(evt);
            }
        });
        SelezioneLing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelezioneLingActionPerformed(evt);
            }
        });

        SelLingLabel.setText("Select Lenguage: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SplitPanel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SelLingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelezioneLing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 585, Short.MAX_VALUE)
                        .addComponent(IndiceRigaDoc))
                    .addComponent(Toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(SplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelLingLabel)
                    .addComponent(SelezioneLing, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IndiceRigaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        
        final JFileChooser fc = new JFileChooser(workspace);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fc.getSelectedFile();
                path = file.getAbsolutePath();
                int j = path.lastIndexOf("\\");
                path = path.substring(0, j);
                className = fc.getName(file);
                int i =  fc.getSelectedFile().getPath().lastIndexOf(".");
                classExtention = fc.getSelectedFile().getPath().substring(i+1);
                EditorPannel.setContentType("text/"+classExtention);
                SelezioneLing.setSelectedItem("text/"+classExtention);
                loadFile(fc.getSelectedFile().getPath());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_LoadButtonActionPerformed


    private void SelezioneLingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SelezioneLingItemStateChanged
       
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            String lang = SelezioneLing.getSelectedItem().toString();
            classExtention = lang.substring(5);
        
            if("python".equals(classExtention)) 
                classExtention = "py";

            String oldText = EditorPannel.getText();
            EditorPannel.setContentType(lang);
            Toolbar.removeAll(); 
            Toolbar.add(NewFileButton);
            Toolbar.add(LoadButton);
            Toolbar.add(SaveButton);
            Toolbar.add(SaveAsButton);
            Toolbar.add(ChangeWorkspaceButton);
            EditorKit kit = EditorPannel.getEditorKit();
            
            if (kit instanceof DefaultSyntaxKit) {
                DefaultSyntaxKit defaultSyntaxKit = (DefaultSyntaxKit) kit;
                defaultSyntaxKit.addToolBarActions(EditorPannel, Toolbar);
            }
            Toolbar.validate();
            try {
                 EditorPannel.read(new StringReader(oldText), lang);
         /*      Document doc = kit.createDefaultDocument();
                doc.insertString(0, oldText, null);
                EditorPannel.setDocument(doc);*/
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        EditorPannel.requestFocusInWindow();

    }//GEN-LAST:event_SelezioneLingItemStateChanged

    private void TreeNavigatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreeNavigatorMouseClicked
        
        path = TreeNavigator.getSelectionPath().toString().replaceAll("[\\[\\]]", "").replace(", ", "/");
   
        System.out.println(path);
        if(path.contains(".")){
            try {
                String result[] = path.split("/");
                String returnValue = result[result.length - 1];
                int i = returnValue.lastIndexOf(".");
                int j = path.lastIndexOf("/");
                path = path.substring(0, j);

                classExtention = returnValue.substring(i+1);
                SelezioneLing.setSelectedItem(ABORT);
                className = returnValue.substring(0, i);
                EditorPannel.setContentType("text/"+classExtention);
                SelezioneLing.setSelectedItem("text/"+classExtention);

                loadFile(TreeNavigator.getSelectionPath().toString().replaceAll("[\\[\\]]", "").replace(", ", "\\"));

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_TreeNavigatorMouseClicked

    private void ChangeWorkspaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeWorkspaceButtonActionPerformed
        final JFileChooser fc = new JFileChooser(workspace);
         fc.setFileSelectionMode(1);
         int returnVal = fc.showOpenDialog(this);
         if (returnVal == JFileChooser.APPROVE_OPTION) {                    
             workspace = fc.getSelectedFile().getAbsolutePath();
             TreeNavigator.setModel(new FileSystemModel(new File(workspace)));
        }
    }//GEN-LAST:event_ChangeWorkspaceButtonActionPerformed

    private void ChangeWorkspaceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeWorkspaceButtonMouseClicked
         final JFileChooser fc = new JFileChooser(workspace);
         fc.setFileSelectionMode(1);
         int returnVal = fc.showOpenDialog(this);
         if (returnVal == JFileChooser.APPROVE_OPTION) {                    
             workspace = fc.getSelectedFile().getAbsolutePath();
             TreeNavigator.setModel(new FileSystemModel(new File(workspace)));
        }
    }//GEN-LAST:event_ChangeWorkspaceButtonMouseClicked

    private void PathBrowseButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PathBrowseButtonDialogActionPerformed
        final JFileChooser fc = new JFileChooser(workspace);
        fc.setFileSelectionMode(1);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {                    
            PathDialog.setText(fc.getSelectedFile().getAbsolutePath());
            
        }
       // TODO add your handling code here:
    }//GEN-LAST:event_PathBrowseButtonDialogActionPerformed

    private void OkButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonDialogActionPerformed
        EditorPannel.setDocument(EditorPannel.getEditorKit().createDefaultDocument());
        className = nameDialogTxt.getText();
        // classExtention = ExtensionDialog.getSelectedItem().toString();
        path = PathDialog.getText();
        NewClassDialog.dispose();
        FileWriter out;
        try {
            out = new FileWriter(new File(path, className+"."+classExtention)); 
            out.write(EditorPannel.getText());
            out.close();
            TreeNavigator.setModel(new FileSystemModel(new File(workspace))); 
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       // TODO add your handling code here:
    }//GEN-LAST:event_OkButtonDialogActionPerformed

    private void CancelButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonDialogActionPerformed
        NewClassDialog.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonDialogActionPerformed

    private void NewFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFileButtonActionPerformed
      
        NewClassDialog.setVisible(true);
        NewClassDialog.setSize(400,180);             
        
    }//GEN-LAST:event_NewFileButtonActionPerformed

    private void SelezioneLingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelezioneLingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelezioneLingActionPerformed

    private void SaveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsButtonActionPerformed
        JFileChooser fc;
        if(path == null){
           fc = new JFileChooser(workspace);
           fc.setSelectedFile(new File(workspace+"\\"+className+"."+classExtention));
        }
        else{
            
            fc = new JFileChooser(path);
            fc.setSelectedFile(new File(path+"\\"+className+"."+classExtention));
        }
      
         int returnVal = fc.showSaveDialog(Frame.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fc.getSelectedFile();
                FileWriter out = new FileWriter(new File(fc.getCurrentDirectory(), className+"."+classExtention));
                out.write(EditorPannel.getText());
                out.close();
           } catch (IOException ex) {
               ex.printStackTrace();
           } 
        }
    }//GEN-LAST:event_SaveAsButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
          try {
                FileWriter out = new FileWriter(new File(path, className+"."+classExtention));
                out.write(EditorPannel.getText());
                out.close();
           } catch (IOException ex) {
               ex.printStackTrace();
           } 
    }//GEN-LAST:event_SaveButtonActionPerformed
 
    private void loadFile(String filename) throws IOException {
        // This will load a file:
       // EditorPannel.read(new FileInputStream(filename), null);

        // ... however, the default read() will trigger a call to insertString() for each line
        // of the document which again will a call to parse(), making the UI freeze for large files.
        // Therefore, for large texts, its best to create a new document and insert the data in
        // a single operation:
        Document doc = EditorPannel.getEditorKit().createDefaultDocument();
        String str = new String(Files.readAllBytes(Paths.get(filename)));
        try {
            doc.insertString(0, str, null);
        } catch (BadLocationException ex) {
            throw new IOException(ex); // Should never happen
        }
        EditorPannel.setDocument(doc);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    private String workspace = "C:\\Users\\Rum\\workspace\\INGSW";
    private String className;
    private String path;
    private String classExtention = "java";
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButtonDialog;
    private javax.swing.JButton ChangeWorkspaceButton;
    private javax.swing.JEditorPane EditorPannel;
    private javax.swing.JScrollPane EditorScroll;
    private javax.swing.JComboBox<String> ExtensionDialog;
    private javax.swing.JLabel IndiceRigaDoc;
    private javax.swing.JButton LoadButton;
    private javax.swing.JLabel NameDialogLabel;
    private javax.swing.JDialog NewClassDialog;
    private javax.swing.JButton NewFileButton;
    private javax.swing.JButton OkButtonDialog;
    private javax.swing.JButton PathBrowseButtonDialog;
    private javax.swing.JTextField PathDialog;
    private javax.swing.JLabel PathDialogLabel;
    private javax.swing.JButton SaveAsButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JScrollPane ScrollTree;
    private javax.swing.JLabel SelLingLabel;
    private javax.swing.JComboBox<String> SelezioneLing;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JToolBar Toolbar;
    private javax.swing.JTree TreeNavigator;
    private javax.swing.JLabel TypreDialogLabel;
    private javax.swing.JTextField nameDialogTxt;
    // End of variables declaration//GEN-END:variables
}
