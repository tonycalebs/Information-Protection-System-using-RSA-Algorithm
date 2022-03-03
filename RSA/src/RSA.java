import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;
/**
 *
 * @author Alice Ojima
 */
public class RSA extends javax.swing.JFrame {
    
RSAPublicKeySpec pub = null;
RSAPrivateKeySpec priv = null;
String enkeyname = null;
String puse = null;   
private static File fileToSave;
private static File sff;
static String dispubKey;
static String disprivKey;
static String disprivKey1;
 protected JFileChooser eChooser;
    protected JFileChooser dChooser;
    private static File inputFile;
    protected JFileChooser pChooser;
    protected PipedInputStream in;
    protected File c;
    protected File d;
    protected int state;
    private static String keyString;
    File outDirectory;
    public String outString;
    public String fileToSave1;
    PublicKey publicKey;
    PrivateKey privateKey;  
    public RSA() {
               
        initComponents();
        
                
    }

    
    
     public static BufferedReader readDataFile(String filename) {
        BufferedReader inputReader = null;
        
        try {
            inputReader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + filename);
        }
        
        return inputReader;
    }
    
     
     
     
//********************saveToFile*******************
// This fuction is used to save the keys to a file
// Input: File name to be saved, modulus and esponent
// for encypting keys
// Output: Key files
//
public static void saveToFile(String fileName, BigInteger mod, BigInteger exp)throws IOException {
ObjectOutputStream fileOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
try {
fileOut.writeObject(mod);
fileOut.writeObject(exp);
 }
 catch (Exception e) {
 throw new IOException("Unexpected error");
 }
 finally {
 fileOut.close();
 }
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENCRYPTION AND DECRYPTION SYSTEM USING RSA ALGORITHM BY ANTHONY CALEB AKOJI");
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton3.setText("Save Key");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Load Key");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Key Size in Bits (At least)");

        jButton4.setText("Create Public/Private Key Pair");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Clear");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Load Key");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setToolTipText("RSA Private Key");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jButton8.setText("Save Key");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("RSA Public Key");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Encrypt File");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton9.setText("Decrypt File");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel4.setText("File Operation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "512", "1024", "2048" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setViewportView(jList1);

        jLabel5.setText("Public Key");

        jLabel6.setText("Private Key");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(19, 19, 19))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option = chooser.showSaveDialog(RSA.this);
        if (option == JFileChooser.APPROVE_OPTION) {
         try {
             String fname = ((chooser.getSelectedFile()!=null)? chooser.getSelectedFile().getName():"nothing");
             File fileToSave = chooser.getSelectedFile();
             File psave = chooser.getCurrentDirectory();
             puse = psave + "/" + fname+".key";
             boolean createNewFile = fileToSave.createNewFile();
             if (createNewFile == true)
             saveToFile(puse, pub.getModulus(),pub.getPublicExponent());
             
         } catch (IOException ex) {
             Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
         }
              JOptionPane.showMessageDialog(null,"Public keys saved.");
        }
        else {
          JOptionPane.showMessageDialog(null,"Key not Saved.");
        }
              
              
              
         
    

    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        int option = chooser.showOpenDialog(RSA.this);
        if (option == JFileChooser.APPROVE_OPTION) {
          File[] sf = chooser.getSelectedFiles();
          String filelist = "nothing";
          if (sf.length > 0) filelist = sf[0].getName();
          for (int i = 1; i < sf.length; i++) {
            filelist += ", " + sf[i].getName();
          }
          
                    
              File pp = chooser.getCurrentDirectory();
              puse = pp+ "/"+filelist; 
              
          KeyFactory fact = null;
      try {
          fact = KeyFactory.getInstance("RSA");
      } catch (NoSuchAlgorithmException ex) {
          Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
      }

          try {
              try {
                  pub = fact.getKeySpec(readKeyFromFile(puse),RSAPublicKeySpec.class);
                  jTextArea1.setText(pub.getModulus().toString());
              } catch (IOException ex) {
                  Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
              }
          } catch (InvalidKeySpecException ex) {
              Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
          }
      
        }
        else {
          //statusbar.setText("You canceled.");
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    
   //********************rsaEncrypt***********************
 // This fuction encypyts the file using the public key
 // Input: File to be encrypted and name of encrypted
 // file
 // Output: An encrypted file
 //
public void rsaEncrypt(String file_loc, String file_des) throws Exception {
byte[] data = new byte[52428800*2]; // 50 Megebytes
int i;
System.out.println("start encyption");
Key pubKey = readKeyFromFile(puse);
Cipher cipher = Cipher.getInstance("RSA");
cipher.init(Cipher.ENCRYPT_MODE, pubKey);
FileInputStream fileIn = new FileInputStream(file_loc);
FileOutputStream fileOut = new FileOutputStream(file_des);
// Read in the data from the file and encrypt it
    try (CipherOutputStream cipherOut = new CipherOutputStream(fileOut, cipher)) {
        // Read in the data from the file and encrypt it
        while ((i = fileIn.read(data)) != -1) {
            System.out.println(" i:"+ i);
            cipherOut.write(data, 0, i);
        }
        // Close the encrypted file
    }
  
System.out.println("encrypted file created");
 }

//********************rsaDecrypt***********************
// This fuction decypyts the file using the pivate key
 // Input: File to be decypyts and name of decrypted
 // file
 // Output: An decrypted file
 //
public static void rsaDecrypt(String file_loc, String file_des) throws Exception {
  byte[] data = new byte[52428800]; // 50 Megebytes
int i;
 System.out.println("start decyption");
 Key priKey = readKeyFromFile("private.key");
 Cipher cipher = Cipher.getInstance("RSA");
 cipher.init(Cipher.DECRYPT_MODE, priKey);
 FileInputStream fileIn = new FileInputStream(file_loc);
 CipherInputStream cipherIn = new CipherInputStream(fileIn, cipher);
 FileOutputStream fileOut = new FileOutputStream(file_des);
 // Write data to new file
 RandomAccessFile raFile;
	    	raFile = new RandomAccessFile(file_des,"rw");
 while ((i = cipherIn.read(data)) != -1) {
   System.out.println(" i:"+ i);
 //fileOut.write(data,0 , i);
 raFile.write(data,0,i);
 
 }
 // Close the file
 cipherIn.close();
 fileOut.close();
 System.out.println("decrypted file created");
}
    
    
    
    static Key readKeyFromFile(String keyFileName) throws IOException {
   InputStream in = new FileInputStream(keyFileName);
 ObjectInputStream oin = new ObjectInputStream(new BufferedInputStream(in));
 try {
 BigInteger m = (BigInteger) oin.readObject();
 BigInteger e = (BigInteger) oin.readObject();
 KeyFactory fact = KeyFactory.getInstance("RSA");
 if (keyFileName.startsWith("public")){
 return fact.generatePrivate(new RSAPrivateKeySpec(m, e));
 
 // disprivKey = fact.generatePrivate(new RSAPrivateKeySpec(m,e));

 }else
  return fact.generatePublic(new RSAPublicKeySpec(m, e));
 }
 catch (Exception e) {
 throw new RuntimeException("Spurious serialisation error", e);
 }
 finally {
 oin.close();
 }
 }
    
    
    
    
    
    //==================================================
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
// KEYLENGHT is the length of the keys to be generated. There are two normal formats, 1024 or 2048
// 1024 RSA key length is sufficient for many medium-security purposes such as web site logins
// 2048 RSA key length is for high-security applications1 or for data that needs to remain confidential for more than a few years
// Key lenght > 2048 is used keep data confidential for more than the next two decades, RSA recommends a key size larger than 2048 bits
// Key length data gathered from
  String ck = jList1.getSelectedValue().toString();
  int KEYLENTGH = Integer.parseInt(ck);
 KeyPairGenerator kpg = null;
      try {
          kpg = KeyPairGenerator.getInstance("RSA");
      } catch (NoSuchAlgorithmException ex) {
          Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
      }
kpg.initialize(KEYLENTGH);
KeyPair kp = kpg.genKeyPair();
publicKey = kp.getPublic();
privateKey = kp.getPrivate();
System.out.println("keys created");
KeyFactory fact = null;
      try {
          fact = KeyFactory.getInstance("RSA");
      } catch (NoSuchAlgorithmException ex) {
          Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
      }

      try {
          pub = fact.getKeySpec(publicKey,RSAPublicKeySpec.class);
      } catch (InvalidKeySpecException ex) {
          Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
      }
      try {
          priv = fact.getKeySpec(privateKey,RSAPrivateKeySpec.class);
      } catch (InvalidKeySpecException ex) {
          Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
      }
    jTextArea1.setText(pub.getModulus().toString());
    jTextArea2.setText(priv.getPrivateExponent().toString());

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        int option = chooser.showOpenDialog(RSA.this);
        if (option == JFileChooser.APPROVE_OPTION) {
      try {
          File[] sf = chooser.getSelectedFiles();
          String filelist = "nothing";
          if (sf.length > 0) filelist = sf[0].getName();
          for (int i = 1; i < sf.length; i++) {
              filelist += ", " + sf[i].getName();
          }
          
          
          File pp1 = chooser.getCurrentDirectory();
          puse = pp1+ "/"+filelist;
          
          KeyFactory fact1 = null;
          try {
              fact1 = KeyFactory.getInstance("RSA");
              
          } catch (NoSuchAlgorithmException ex) {
              Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
          }
          
        //  pub = fact.getKeySpec(readKeyFromFile(puse),RSAPublicKeySpec.class);
          try {
              priv = fact1.getKeySpec(readKeyFromFile(puse),RSAPrivateKeySpec.class);
              jTextArea2.setText(priv.getPrivateExponent().toString());
          } catch (IOException ex) {
              Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          
      } catch (InvalidKeySpecException ex) {
          Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
      }
              
      
        }
        else {
          //statusbar.setText("You canceled.");
        }  
    }      /*        

    //================================================
    
    
    
   
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
*/

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt){
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option = chooser.showSaveDialog(RSA.this);
        if (option == JFileChooser.APPROVE_OPTION) {
         try {
             String fname = ((chooser.getSelectedFile()!=null)? chooser.getSelectedFile().getName():"nothing");
             File fileToSave = chooser.getSelectedFile();
             File psave = chooser.getCurrentDirectory();
             puse = psave + "/" + fname+".key";
             boolean createNewFile = fileToSave.createNewFile();
             if (createNewFile == true)
             saveToFile(puse, priv.getModulus(),priv.getPrivateExponent());
             
         } catch (IOException ex) {
             Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
         }
              JOptionPane.showMessageDialog(null,"Private keys saved.");
        }
        else {
          JOptionPane.showMessageDialog(null,"Key not Saved.");
        }
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        String cc = null;
          JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option = chooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) 
        cc = chooser.getCurrentDirectory()+"/"+chooser.getSelectedFile().getName();
          //c = chooser.getCurrentDirectory();
        // String filelist = "nothing";
    
        
        //++++++++++++++++++++++++++++++++++++++++++++++
        
        /*
        JFileChooser chooser1 = new JFileChooser();
        chooser1.setMultiSelectionEnabled(false);
        chooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option1 = chooser1.showOpenDialog(RSA.this);
        
        if (option1 == JFileChooser.APPROVE_OPTION) {
        
        //String fname = ((chooser1.getSelectedFile()!=null)? chooser1.getSelectedFile().getName():"nothing");
        fileToSave1 = chooser1.getCurrentDirectory().toString();//+"/"+chooser1.getSelectedFile().getName();
        //String k = fileToSave.getPath()+"/"+fname;
        //String kk = sff.getAbsolutePath();
        //File d = new File(fileToSave.getParent());
        //boolean createNewFile = fileToSave.createNewFile();
        //if(createNewFile == true)
        }
        
        */
        byte[] data = new byte[52428800]; // 50 Megebytes
        int i;
        JFileChooser chooser1 = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option1 = chooser1.showSaveDialog(RSA.this);
        if (option1 == JFileChooser.APPROVE_OPTION) {
         
             String fname = ((chooser1.getSelectedFile()!=null)? chooser1.getSelectedFile().getName():"nothing");
             File fileToSave = chooser1.getSelectedFile();
             File psave = chooser1.getCurrentDirectory();
             puse = psave + "/" + fname+".txt";
             boolean createNewFile = false;
            try {
                createNewFile = psave.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
            }
             if (createNewFile == true)
    
      System.out.println("start encyption");
    Key pubKey = null;
   
        //pubKey = readKeyFromFile(puse);
        pubKey = publicKey;
   
    Cipher cipher = null;
    try {
        cipher = Cipher.getInstance("RSA");
    } catch (NoSuchAlgorithmException | NoSuchPaddingException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
    } catch (InvalidKeyException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    FileInputStream fileIn = null;
    try {
        fileIn = new FileInputStream(cc);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    FileOutputStream fileOut = null;
   
   try {
        fileOut = new FileOutputStream(puse);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    // Read in the data from the file and encrypt it
        CipherOutputStream cipherOut = new CipherOutputStream(fileOut, cipher);
       
     RandomAccessFile raFile = null;
    try {
        raFile = new RandomAccessFile(puse,"rw");
    } catch (FileNotFoundException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }              
        
    try {
        // Read in the data from the file and encrypt it
        while ((i = fileIn.read(data)) != -1) {
           cipherOut.write(data, 0, i); 
            System.out.println(" i:"+ i);
            
             System.out.println("cipherOut");
          //  raFile.write(data,0,i);
            //System.out.println("raFile");
            
        }
        
        
        // Close the encrypted file
    } catch (IOException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        cipherOut.close();
        System.out.println("Finished encrypting");
        //raFile.close();
        
//try {
        /*        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option = chooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
        sff = chooser.getSelectedFile().getParentFile();
        //  File c = chooser.getCurrentDirectory();
        // String filelist = "nothing";
        
        
        //++++++++++++++++++++++++++++++++++++++++++++++
        
        
        JFileChooser chooser1 = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option1 = chooser1.showOpenDialog(RSA.this);
        
        if (option1 == JFileChooser.APPROVE_OPTION) {
        try {
        String fname = ((chooser1.getSelectedFile()!=null)? chooser1.getSelectedFile().getName():"nothing");
        fileToSave = chooser1.getSelectedFile();
        String k = fileToSave.getPath()+"/"+fname;
        String kk = sff.getAbsolutePath();
        //File d = new File(fileToSave.getParent());
        //boolean createNewFile = fileToSave.createNewFile();
        //if(createNewFile == true)
        
        */         //    rsaEncrypt(kk,k);
        // rsaEncrypt("MEDICAL CENTRE LETTER.docx","encrypted.docx");
        /*     } catch (IOException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
        }    catch (Exception ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Public keys saved.");
        }
        else {
        JOptionPane.showMessageDialog(null,"Key not Saved.");
        }
        */
        
        //+++++++++++++++++++++++++++++++++++++++++++++++++
        
        //  }
        // else {
        //statusbar.setText("You canceled.");
        // }
        // } catch (Exception ex) {
        //   Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
        // }
    } catch (IOException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    
    
        }        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   
        String cc = null;
          JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option = chooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) 
        cc = chooser.getCurrentDirectory()+"/"+chooser.getSelectedFile().getName();
          //c = chooser.getCurrentDirectory();
        // String filelist = "nothing";
    
        
        //++++++++++++++++++++++++++++++++++++++++++++++
        
        /*
        JFileChooser chooser1 = new JFileChooser();
        chooser1.setMultiSelectionEnabled(false);
        chooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option1 = chooser1.showOpenDialog(RSA.this);
        
        if (option1 == JFileChooser.APPROVE_OPTION) {
        
        //String fname = ((chooser1.getSelectedFile()!=null)? chooser1.getSelectedFile().getName():"nothing");
        fileToSave1 = chooser1.getCurrentDirectory().toString();//+"/"+chooser1.getSelectedFile().getName();
        //String k = fileToSave.getPath()+"/"+fname;
        //String kk = sff.getAbsolutePath();
        //File d = new File(fileToSave.getParent());
        //boolean createNewFile = fileToSave.createNewFile();
        //if(createNewFile == true)
        }
        
        */
        byte[] data = new byte[52428800]; // 50 Megebytes
        int i;
        JFileChooser chooser1 = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option1 = chooser1.showSaveDialog(RSA.this);
        if (option1 == JFileChooser.APPROVE_OPTION) {
         
             String fname = ((chooser1.getSelectedFile()!=null)? chooser1.getSelectedFile().getName():"nothing");
             File fileToSave = chooser1.getSelectedFile();
             File psave = chooser1.getCurrentDirectory();
             puse = psave + "/" + fname+".txt";
             boolean createNewFile = false;
            try {
                createNewFile = psave.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
            }
             if (createNewFile == true)
    
      System.out.println("start encyption");
    Key pubKey = null;
   
        //pubKey = readKeyFromFile(puse);
        pubKey = privateKey;
   
    Cipher cipher = null;
    try {
        cipher = Cipher.getInstance("RSA");
    } catch (NoSuchAlgorithmException | NoSuchPaddingException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        cipher.init(Cipher.DECRYPT_MODE, pubKey);
    } catch (InvalidKeyException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    FileInputStream fileIn = null;
    try {
        fileIn = new FileInputStream(cc);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    FileOutputStream fileOut = null;
   
   try {
        fileOut = new FileOutputStream(puse);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    // Read in the data from the file and encrypt it
        CipherOutputStream cipherOut = new CipherOutputStream(fileOut, cipher);
       
     RandomAccessFile raFile = null;
    try {
        raFile = new RandomAccessFile(puse,"rw");
    } catch (FileNotFoundException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }              
        
    try {
        // Read in the data from the file and encrypt it
        while ((i = fileIn.read(data)) != -1) {
           cipherOut.write(data, 0, i); 
            System.out.println(" i:"+ i);
            
             System.out.println("cipherOut");
          //  raFile.write(data,0,i);
            //System.out.println("raFile");
            
        }
        
        
        // Close the encrypted file
    } catch (IOException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        cipherOut.close();
        System.out.println("Finished decrypting");
        //raFile.close();
        
//try {
        /*        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option = chooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
        sff = chooser.getSelectedFile().getParentFile();
        //  File c = chooser.getCurrentDirectory();
        // String filelist = "nothing";
        
        
        //++++++++++++++++++++++++++++++++++++++++++++++
        
        
        JFileChooser chooser1 = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int option1 = chooser1.showOpenDialog(RSA.this);
        
        if (option1 == JFileChooser.APPROVE_OPTION) {
        try {
        String fname = ((chooser1.getSelectedFile()!=null)? chooser1.getSelectedFile().getName():"nothing");
        fileToSave = chooser1.getSelectedFile();
        String k = fileToSave.getPath()+"/"+fname;
        String kk = sff.getAbsolutePath();
        //File d = new File(fileToSave.getParent());
        //boolean createNewFile = fileToSave.createNewFile();
        //if(createNewFile == true)
        
        */         //    rsaEncrypt(kk,k);
        // rsaEncrypt("MEDICAL CENTRE LETTER.docx","encrypted.docx");
        /*     } catch (IOException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
        }    catch (Exception ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Public keys saved.");
        }
        else {
        JOptionPane.showMessageDialog(null,"Key not Saved.");
        }
        */
        
        //+++++++++++++++++++++++++++++++++++++++++++++++++
        
        //  }
        // else {
        //statusbar.setText("You canceled.");
        // }
        // } catch (Exception ex) {
        //   Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
        // }
    } catch (IOException ex) {
        Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    
    
        }        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    jTextArea2.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RSA().setVisible(true);
            }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
