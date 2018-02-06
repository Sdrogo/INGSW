package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import jsyntaxpane.DefaultSyntaxKit;
import jsyntaxpane.actions.CaretMonitor;
import jsyntaxpane.syntaxkits.JavaSyntaxKit;

public final class Frame extends javax.swing.JFrame {
    
    /////////////////////////////////INIT//////////////////////
    
    public Frame() {
        
        initComponents();                                                       //inizializza i componenti del design netbeans
        EditorPannel.setSelectedTextColor(Color.black);                         //seleziona il colore del testo
        EditorPannel.setEditorKit(new JavaSyntaxKit());                         //implementa di default il linguaggio java
        DefaultSyntaxKit.initKit();                                             //inizializza il kit sintattico
        setLenguageBox("java");                                                  //setta il box di scelta linguaggio su java
        CaretMonitor caretMonitor = new CaretMonitor(EditorPannel, IndiceRigaDoc); //monitora l'indice di riga e carattere del documento
         try {
            loadFile("./target/INGSW_README.java");
        } catch (IOException ex) {

            JOptionPane p = new JOptionPane("Documento di default non trovato");
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
        SaveDialogNavigator = new javax.swing.JDialog();
        SaveNavSi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SaveNavAnnulla = new javax.swing.JButton();
        SaveNavNo = new javax.swing.JButton();
        SaveDialog = new javax.swing.JDialog();
        siSaveDialogButton = new javax.swing.JButton();
        noSaveDialogButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AnnullaSaveDialogButton = new javax.swing.JButton();
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

        ExtensionDialog.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".sh", ".c", ".cpp", ".h", ".clj", ".dat", ".groovy",".java",".js", ".jflex", ".lua", ".properties", ".py", ".rb", ".scala", ".sql", ".tal", ".xhtml", ".xml", ".xpath" }));

        PathDialogLabel.setText("Source fodler : ");

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

        SaveNavSi.setText("Yes");
        SaveNavSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNavSiActionPerformed(evt);
            }
        });

        jLabel2.setText("Do you want to save the current Document?");

        SaveNavAnnulla.setText("Cancel");
        SaveNavAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNavAnnullaActionPerformed(evt);
            }
        });

        SaveNavNo.setText("No");
        SaveNavNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNavNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SaveDialogNavigatorLayout = new javax.swing.GroupLayout(SaveDialogNavigator.getContentPane());
        SaveDialogNavigator.getContentPane().setLayout(SaveDialogNavigatorLayout);
        SaveDialogNavigatorLayout.setHorizontalGroup(
            SaveDialogNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaveDialogNavigatorLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(SaveDialogNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(SaveDialogNavigatorLayout.createSequentialGroup()
                        .addComponent(SaveNavSi)
                        .addGap(18, 18, 18)
                        .addComponent(SaveNavNo)
                        .addGap(18, 18, 18)
                        .addComponent(SaveNavAnnulla)))
                .addGap(38, 38, 38))
        );

        SaveDialogNavigatorLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SaveNavAnnulla, SaveNavNo, SaveNavSi});

        SaveDialogNavigatorLayout.setVerticalGroup(
            SaveDialogNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaveDialogNavigatorLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(SaveDialogNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveNavSi)
                    .addComponent(SaveNavNo)
                    .addComponent(SaveNavAnnulla))
                .addGap(14, 14, 14))
        );

        siSaveDialogButton.setText("Yes");
        siSaveDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siSaveDialogButtonActionPerformed(evt);
            }
        });

        noSaveDialogButton.setText("No");
        noSaveDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSaveDialogButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Do you want to save the current Document?");

        AnnullaSaveDialogButton.setText("Cancel");
        AnnullaSaveDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnullaSaveDialogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SaveDialogLayout = new javax.swing.GroupLayout(SaveDialog.getContentPane());
        SaveDialog.getContentPane().setLayout(SaveDialogLayout);
        SaveDialogLayout.setHorizontalGroup(
            SaveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaveDialogLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(SaveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(SaveDialogLayout.createSequentialGroup()
                        .addComponent(siSaveDialogButton)
                        .addGap(18, 18, 18)
                        .addComponent(noSaveDialogButton)
                        .addGap(18, 18, 18)
                        .addComponent(AnnullaSaveDialogButton)))
                .addGap(36, 36, 36))
        );

        SaveDialogLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AnnullaSaveDialogButton, noSaveDialogButton, siSaveDialogButton});

        SaveDialogLayout.setVerticalGroup(
            SaveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaveDialogLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(SaveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siSaveDialogButton)
                    .addComponent(noSaveDialogButton)
                    .addComponent(AnnullaSaveDialogButton))
                .addGap(14, 14, 14))
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
        ChangeWorkspaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeWorkspaceButtonActionPerformed(evt);
            }
        });
        Toolbar.add(ChangeWorkspaceButton);

        SplitPanel.setDividerLocation(200);

        TreeNavigator.setModel(new FileSystemModel(new File(workspace)));
        TreeNavigator.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                TreeNavigatorValueChanged(evt);
            }
        });
        ScrollTree.setViewportView(TreeNavigator);

        SplitPanel.setLeftComponent(ScrollTree);

        EditorPannel.setBorder(null);
        EditorPannel.setMinimumSize(new java.awt.Dimension(300, 14));
        EditorScroll.setViewportView(EditorPannel);

        SplitPanel.setRightComponent(EditorScroll);

        IndiceRigaDoc.setText("Current Position");

        SelezioneLing.setModel(new DefaultComboBoxModel(DefaultSyntaxKit.getContentTypes()));
        SelezioneLing.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SelezioneLingItemStateChanged(evt);
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
                    .addComponent(Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(SplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelLingLabel)
                    .addComponent(SelezioneLing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IndiceRigaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ////////////////////////////////LISTENER/////////////////////
    
    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
                                                                                //Bulsante della toolbar per il caricamento di un documento
        
        if(changed){                                                            //verifica se il documento ha delle modifiche non salvate
            SaveDialog.setVisible(true);                                        //in quel caso mostra una dialog per gestire il caso
            SaveDialog.setSize(330, 120);
            SaveDialog.setLocationRelativeTo(null);
          }
        else{                                                                   //altrimenti
             showFileChooseLoad();                                              //mostra un filechooser per caricare il documento
        }
        
    }//GEN-LAST:event_LoadButtonActionPerformed
    
    private void SelezioneLingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SelezioneLingItemStateChanged
        //listener del box di selezione linguaggio
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {  
            String lang = SelezioneLing.getSelectedItem().toString();           //memorizza il linguaggio in una stringa
            String oldText = EditorPannel.getText();                            //memorizza il testo del coumento
            setLenguage(lang.substring(5));                                     //setta il linguaggio
            EditorPannel.setContentType(lang);                                  //modifica il tipo di documento nel EditorPannel
            Toolbar.removeAll();                                                //distrugge la vecchia toolbar
            Toolbar.add(NewFileButton);                                         //inserisce i button
            Toolbar.add(LoadButton);
            Toolbar.add(SaveButton);
            Toolbar.add(SaveAsButton);
            Toolbar.add(ChangeWorkspaceButton);                             
            EditorKit kit = EditorPannel.getEditorKit();                        //inserisce nella toolbar il kit del linguaggio    
            if (kit instanceof DefaultSyntaxKit) {                              
                DefaultSyntaxKit defaultSyntaxKit = (DefaultSyntaxKit) kit;     
                defaultSyntaxKit.addToolBarActions(EditorPannel, Toolbar);
            }
            Toolbar.validate();
            try {
                Document doc = kit.createDefaultDocument();                     //ricrea il Documento con il testo memorizzato 
                doc.insertString(0, oldText, null);
                EditorPannel.setDocument(doc);
            } catch (Exception ex) {
                JOptionPane p = new JOptionPane("errore nel cambio di linguaggio");
            }
        }
        EditorPannel.requestFocusInWindow();
    }//GEN-LAST:event_SelezioneLingItemStateChanged
    
    private void ChangeWorkspaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeWorkspaceButtonActionPerformed
        
        //apre un file chooser per selezionare un path come nuova workspace
        workspace = showPathFileChooser();
        TreeNavigator.setModel(new FileSystemModel(new File(workspace)));       //resetta il navigatore con il nuovo workspace
        
    }//GEN-LAST:event_ChangeWorkspaceButtonActionPerformed
    
    private void PathBrowseButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PathBrowseButtonDialogActionPerformed
        
        //listener per il pulsante per cambiare il path nella dialogFrame per creare un nuovo documento
        PathDialog.setText(showPathFileChooser());
        
    }//GEN-LAST:event_PathBrowseButtonDialogActionPerformed
    
    private void OkButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonDialogActionPerformed
      
        //il pulsante ok della dialogFrame della creazione di un nuovo documento
        EditorPannel.setDocument(EditorPannel.getEditorKit().createDefaultDocument()); //crea il nuovo documento
        className = nameDialogTxt.getText();                                    //memorizza il nome
        classExtention=ExtensionDialog.getSelectedItem().toString();            //memorizza l'estensione
        setLenguage(classExtention);                                            //setta il linguaggio
        path = PathDialog.getText();                                            //memorizza il path
        NewClassDialog.dispose();                                               //elimina la dialogFrame
        saveFile();                                                             //salva il file
    }//GEN-LAST:event_OkButtonDialogActionPerformed
    
    private void CancelButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonDialogActionPerformed
        //il pulsante per annullare la creazione della nuova classe
        NewClassDialog.dispose();                                               //elimina la dialogFrame
    }//GEN-LAST:event_CancelButtonDialogActionPerformed
    
    private void NewFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFileButtonActionPerformed
        //crea e mostra la DialogFrame per la creazione di un nuovo documento
        ExtensionDialog.setSelectedItem(classExtention);                        //seleziona il linguaggio attualmente implementato nella box della dialogFrame
        PathDialog.setText(path);                                               //setta il path attuale a quello per la creazione
        NewClassDialog.setVisible(true);                                        //rende visibile, setta la dimensione e la posizione della DialogFrame
        NewClassDialog.setSize(450, 220);
        NewClassDialog.setLocationRelativeTo(null);     
    }//GEN-LAST:event_NewFileButtonActionPerformed
    
    private void SaveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsButtonActionPerformed
     
        //listener del pulsante salva con nome
        JFileChooser fc= new JFileChooser(path);                                //inizializza una filechooser
        fc.setSelectedFile(new File(path + "\\" + className +classExtention));  //setta il file selezionato di default a quello auttualmente aperto
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.sh","sh"));    //filtri delle estensioni
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.c","c"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.cpp","cpp"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.h","h"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.clj","clj"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.dat","dat"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.groovy","groovy"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.java","java"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.js","javaScript"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.jflex","jflex"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.lua","lua"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.properties",".properties"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.py","pyton"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.rb","ruby"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.scala","scala"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.sql","sql"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.tal","tal"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.xhtml","xhtml"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.html","html"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.xml","xml"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.xpath","xpath"));
        
        int returnVal = fc.showSaveDialog(Frame.this);                          //memorizza la risposta del filechooser
        if (returnVal == JFileChooser.APPROVE_OPTION) {                         //se è un valore accettato
            String temp = fc.getSelectedFile().getAbsolutePath();               //memorizza il path su una stringa temporanea
            path=temp.substring(0, temp.lastIndexOf("\\"));                     //setta il path
            className = temp.substring(temp.lastIndexOf("\\"), temp.lastIndexOf("."));  //setta il nome
            classExtention = temp.substring(temp.lastIndexOf("."),temp.length());       //setta l'estensione
            saveFile();                                                         //salva il file
            TreeNavigator.setModel(new FileSystemModel(new File(workspace)));   //aggiorna il navigatore
        }
    }//GEN-LAST:event_SaveAsButtonActionPerformed
    
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
    //listener per il semplice salvataggio
        saveFile();                                         
    }//GEN-LAST:event_SaveButtonActionPerformed
    
    private void TreeNavigatorValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_TreeNavigatorValueChanged
        //listener per il navigatore
        if (TreeNavigator.getSelectionPath().toString().contains(".")) {        //se l'elemento selezionato è un documento
            try{
                int j = oldPath.lastIndexOf("/");                               //estrapola il vecchio path
                oldPath = oldPath.substring(0,j);
            }catch(Exception e){
                JOptionPane p = new JOptionPane("errore nel caricare il path "+oldPath);
            }
             if(changed){                                                        //se il documento ha delle modifiche non salvate
                SaveDialogNavigator.setVisible(true);                           //crea, dimensiona e posiziona una DialogFrame per salvare
                SaveDialogNavigator.setSize(320, 120);
                SaveDialogNavigator.setLocationRelativeTo(null);
            }else{                                                              //se non ci sono modiche
                navigatorLoad();                                                //carica il documento selezionato
            }
        }
    }//GEN-LAST:event_TreeNavigatorValueChanged
    
    private void siSaveDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siSaveDialogButtonActionPerformed
        //pulsante per salvare nella DialogFrame di salvataggio di un documento modificato quando ne viene caricato uno tramite il pulsante in toolbar
        saveFile();                                                             //salva il fle
        SaveDialog.dispose();                                                   //chiude la DialogFrame
        showFileChooseLoad();                                                   //mostra il filechooser
    }//GEN-LAST:event_siSaveDialogButtonActionPerformed
    
    private void noSaveDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSaveDialogButtonActionPerformed
        //pulsante no del DialogFrame di salvataggio di documenti modificato quando ne viene caricato uno tramite il pulsante in toolbar
        SaveDialog.dispose();                                                   //chiude la DialogFrame   
        showFileChooseLoad();                                                   //mostra il fileChooser
    }//GEN-LAST:event_noSaveDialogButtonActionPerformed
    
    private void AnnullaSaveDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnullaSaveDialogButtonActionPerformed
        //pulsante annulla del DialogFrame di salvataggio di documenti modificato quando ne viene caricato uno tramite il pulsante in toolbar
        SaveDialog.dispose();                                                   //chiudi la DialogFrame
    }//GEN-LAST:event_AnnullaSaveDialogButtonActionPerformed
    
    private void SaveNavAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNavAnnullaActionPerformed
        //pulsante annulla del DialogFrame di salvataggio di documenti modificato quando ne viene caricato uno tramite il navigatore
        path=oldPath;                                                           //aggiorna il path
        SaveDialogNavigator.dispose();                                          //chiude la DialogFrame
    }//GEN-LAST:event_SaveNavAnnullaActionPerformed
    
    private void SaveNavSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNavSiActionPerformed
          //pulsante Si del DialogFrame di salvataggio di documenti modificato quando ne viene caricato uno tramite il navigatore
        saveFileNav(oldPath);                                                   //chiama un metodo specifico per salvare il file
        SaveDialogNavigator.dispose();                                          //chiude la DialogFrame
        navigatorLoad();                                                        //chiama un metodo specifico per caricare il file
    }//GEN-LAST:event_SaveNavSiActionPerformed
    
    private void SaveNavNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNavNoActionPerformed
        //pulsante no del DialogFrame di salvataggio di documenti modificato quando ne viene caricato uno tramite il navigatore
        SaveDialogNavigator.dispose();                                          //chiude la DialogFrame
        navigatorLoad();                                                        //chiama un metodo specifico per caricare il file
    }//GEN-LAST:event_SaveNavNoActionPerformed
    
    
    ////////////////////////METODI DI UTILITA'//////////////////////////////////
    
    private void saveFile(){
        //metodo per il salvataggio del Documento
        try {                                                                   //try - catch
            FileWriter out = new FileWriter(new File(path, className + classExtention));    //crea il file con un filewriter
            out.write(EditorPannel.getText());                                  //vi inserisce il testo
            out.close();                                                        //chiude il filewriter 
            changed = false;                                                    //il documento non ha subito modifiche
        } catch (IOException ex) {
            JOptionPane p = new JOptionPane("errore nel salvataggio del file");
        }
        TreeNavigator.setModel(new FileSystemModel(new File(workspace)));       //resetta il navigatore
    }
    private void saveFileNav(String path){
        //metodo di salvataggio specifico per il navigatore, si può specificare il path
        try {
            FileWriter out = new FileWriter(new File(path, className + classExtention));//crea il file con un filewriter
            out.write(EditorPannel.getText());                                  //vi inserisce il testo
            out.close();                                                        //chiude il filewriter
            changed = false;                                                    //il documento non ha subito modifiche
        } catch (IOException ex) {
            JOptionPane p = new JOptionPane("errore nel salvataggio del file");
        }
        TreeNavigator.setModel(new FileSystemModel(new File(workspace)));       //resetta il navigatore
    }
    
    private void loadFile(String filename) throws IOException {
        //metodo per caricare un file attraverso il path assoluto
        Document doc = EditorPannel.getEditorKit().createDefaultDocument();     //crea un nuovo documento
        String str = new String(Files.readAllBytes(Paths.get(filename)));       //memorizza in una stringa tutti i byte del file di path specificato
        try {                                                                   //Blocco try/catch
            doc.insertString(0, str, null);                                     //crea un documento dove inserisce la stringa concenente tutti i caratteri del Documento
            EditorPannel.setDocument(doc);                                      //Setta il documento a quello creato
            EditorPannel.getDocument().addDocumentListener(new GUI.DocumentListner());  //aggiunge un listener per le modifiche apportate al documento
            changed = false;                                                    //il documento appena caricato non è ancora stato modificato
        } catch (BadLocationException ex) {
            JOptionPane p = new JOptionPane("errore nel metodo di caricamento del file");
        }
         TreeNavigator.setModel(new FileSystemModel(new File(workspace)));      //aggiorna il navigatore
    }
    
    private void showFileChooseLoad(){
        //metodo per mostrare il fileChooser per caricare un nuovo Documento
        
        final JFileChooser fc = new JFileChooser(workspace);                    //crea il FileChooser, impostando il workspace come root
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.sh","sh"));    //creazione dei filtri
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.c","c"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.cpp","cpp"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.h","h"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.clj","clj"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.dat","dat"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.groovy","groovy"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.java","java"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.js","javaScript"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.jflex","jflex"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.lua","lua"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.properties",".properties"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.py","pyton"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.rb","ruby"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.scala","scala"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.sql","sql"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.tal","tal"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.xhtml","xhtml"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.html","html"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.xml","xml"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("*.xpath","xpath"));
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);                       //il FileChooser accetta solo file
        int returnVal = fc.showOpenDialog(this);                                //memorizza quello che viene restituito dal FileChooser  
        if (returnVal == JFileChooser.APPROVE_OPTION) {                         //se questo valore è accettato
            try {                                                               //Blocco Try/catch
                path = fc.getSelectedFile().getAbsolutePath();                  //Memorizza il path
                int j = path.lastIndexOf("\\");                                 //trova l'ultima \ che corrisponde alla fine del path
                path = path.substring(0, j);                                    //estrapola la sottostringa
                className = fc.getName(fc.getSelectedFile());                   //memorizza il nome della classe
                int i = fc.getSelectedFile().getPath().lastIndexOf(".");        //trova il punto
                setLenguage(fc.getSelectedFile().getPath().substring(i + 1));   //estrapola l'estensione e setta il linguaggio
                loadFile(fc.getSelectedFile().getPath());                       //carica il file
            } catch (IOException ex) {
                JOptionPane p = new JOptionPane("errore nel caricamento del file");
            }
        }
    }
    
    private void navigatorLoad(){
    //Metodo per caricare un file attraverso il navigatore
        oldPath = path;                                                         //memorizza l'elemento caricato precedentemente
        path = TreeNavigator.getSelectionPath().toString()                      //setta il nuovo path, manipolando la stringa per renderla appropriata
                            .replaceAll("[\\[\\]]", "").replace(", ", "/"); 

        if (path.contains(".")) {                                               //se l'ememento è un Documento
            try {                                                               //Blocco Try/Catch
                String result[] = path.split("/");                              //separa la stringa del path
                String returnValue = result[result.length - 1];                 //memorizza l'ultima parte(nome file + estensione)
                int i = returnValue.lastIndexOf(".");                           //trova il punto per separare nome ed estensione
                int j = path.lastIndexOf("/");                                  //e trova l'ultima cartella del path
                path = path.substring(0, j);                                    //setta il path estrapolando la sottostringa appropriata
                className = returnValue.substring(0, i);                        //setta il nome del Documento estrapolando la sottostringa appropriata
                setLenguage(returnValue.substring(i + 1));                      //setta l'estensione del Documento estrapolando la sottostringa appropriata
                loadFile(TreeNavigator.getSelectionPath().toString()            //carica il Documento
                         .replaceAll("[\\[\\]]", "").replace(", ", "\\"));
                changed = false;                                                //il documento appena caricato non ha subito modifiche
            } catch (IOException ex) {
                JOptionPane p = new JOptionPane("errore nel caricamento del file tramite navigator");
            }
        }
    }
    
    public static void setChanged(boolean b){                                   //serve al listener per modificare il booleano che tiene conto dei cambiamenti
        changed = b;                                                           
    }
    
    public void setLenguage(String s) {                                         //metodo per settare il linguaggio
        
        setLenguageBox(s);                                                      //Chiama il metodo per settare il linguaggio nel box di selezione
        if (s.equals("bash")) {                                                 //verifica una serie di linguaggi impostando le estensioni appropriate
            classExtention = ".sh";
            return;
        }
        if (s.equals("clojure")) {
            classExtention = ".clj";
            return;
        }
        if (s.equals("dosbatch")) {
            classExtention = ".dat";
            return;
        }
        if (s.equals("javascript")) {
            classExtention = ".js";
            return;
        }
        if (s.equals("plain")) {
            classExtention = ".txt";
            return;
        }
        if (s.equals("python")) {
            classExtention = ".py";
            return;
        }
        if (s.equals("ruby")) {
            classExtention = ".rb";
            return;
        }
        classExtention = "."+s;
    }
    
    public void setLenguageBox(String s) {                                      //metodo per settare il linguaggio del box di selezione a quello specificato in input
        EditorPannel.setContentType("text/" + s);                               //setta il tipo di Documento nel Editor Pannel
        SelezioneLing.setSelectedItem("text/" + s);                             //setta il linguaggio nel Box
        ExtensionDialog.setSelectedItem("."+s);                                 //setta l'estensione nella DialogFrame per la creazione di un nuovo Documento
    }
    
    public String showPathFileChooser(){                                        //il metodo crea e mostra a schermo un filechooser per selezionare un path
        final JFileChooser fc = new JFileChooser(workspace);                    //inizializza il filechooser
        fc.setFileSelectionMode(1);                                             //che vede solo le cartelle
        int returnVal = fc.showOpenDialog(this);                                //memorizza il risultato
        if (returnVal == JFileChooser.APPROVE_OPTION) {                         //se è un file accettato
            return fc.getSelectedFile().getAbsolutePath();                      //restituisce il path selezionato
        }
        return null;
    }    
    ///////////////////MAIN/////////////////
    
    
    public static void main(String args[]) {                                    //main
        try {
            UIManager.setLookAndFeel(                                           //carica il look and feel utilizzato dal sistema operativo
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            JOptionPane p = new JOptionPane("errore nel caricamento del look and feel");
        } catch (InstantiationException ex) {
            JOptionPane p = new JOptionPane("errore nel caricamento del look and feel");
        } catch (IllegalAccessException ex) {
            JOptionPane p = new JOptionPane("errore nel caricamento del look and feel");
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane p = new JOptionPane("errore nel caricamento del look and feel");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {                        //Main Thread
            public void run() {                                                 //metoro run
                new Frame().setVisible(true);                                   //crea e rende visibile la Frame
            }
        });
    }
    
    ///////////////////////////////DICHIARAZIONE OGGETTI/////////////////////////
    
    private String workspace = "C:\\Users\\Rum\\workspace\\INGSW";              //tiene memoria del workspace
    private String className = "INGSW_README";                                  //il nome del Documento attualmente aperto
    private String path = "./target/";                                          //Il path del Documento attualmente aperto
    private String classExtention = ".java";                                    //L'estensione del Documento
    private String oldPath = path;                                              //Stringa per memorizzare il path del Docuemnto aperto dal Navigator
    private static boolean changed = false;                                     //Il Booleano memorizza del il Documento ha subito delle modifiche
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();        //la dimensioni dello schermo
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnnullaSaveDialogButton;
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
    private javax.swing.JDialog SaveDialog;
    private javax.swing.JDialog SaveDialogNavigator;
    private javax.swing.JButton SaveNavAnnulla;
    private javax.swing.JButton SaveNavNo;
    private javax.swing.JButton SaveNavSi;
    private javax.swing.JScrollPane ScrollTree;
    private javax.swing.JLabel SelLingLabel;
    private javax.swing.JComboBox<String> SelezioneLing;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JToolBar Toolbar;
    private javax.swing.JTree TreeNavigator;
    private javax.swing.JLabel TypreDialogLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameDialogTxt;
    private javax.swing.JButton noSaveDialogButton;
    private javax.swing.JButton siSaveDialogButton;
    // End of variables declaration//GEN-END:variables
}
