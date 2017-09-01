/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Hangman;
import java.util.*;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author Peter
 */
public class HangmanUI extends javax.swing.JFrame {

    /**
     * Creates new form HangmanUI
     */
    
    private String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private List<String> usedLetters = new ArrayList<String>();
    private String[] secretWordArrayList = {"doctor","animal","pirate","wizard","cloud","clown","fright","music","sunshine","triplet","pillow","raptor","sickly","radical"};
    private List<String> secretWordLetters = new ArrayList<String>();
    private int guessesLeft = 5;
    private int totalGuesses = 5;
    private String chosenWord = "";
    private String[] hangmanDrawings = {"________\n"
            + "|       |\n"
            + "|\n"
            + "|\n"
            + "|\n"
            + "|\n"
            + "|_______\n"
            + "|_______|_\n"
            + "|_________|",
            "________\n"
            + "|       |\n"
            + "|       0\n"
            + "|\n"
            + "|\n"
            + "|\n"
            + "|_______\n"
            + "|_______|_\n"
            + "|_________|",
            "________\n"
            + "|       |\n"
            + "|       0\n"
            + "|       |\\ \n"
            + "|\n"
            + "|\n"
            + "|_______\n"
            + "|_______|_\n"
            + "|_________|",
            "________\n"
            + "|       |\n"
            + "|       0\n"
            + "|      /|\\ \n"
            + "|\n"
            + "|\n"
            + "|_______\n"
            + "|_______|_\n"
            + "|_________|",
            "________\n"
            + "|       |\n"
            + "|       0\n"
            + "|      /|\\ \n"
            + "|       |\n"
            + "|        \\ \n"
            + "|_______\n"
            + "|_______|_\n"
            + "|_________|",
            "________\n"
            + "|       |\n"
            + "|       0\n"
            + "|      /|\\ \n"
            + "|       |\n"
            + "|      / \\ \n"
            + "|_______\n"
            + "|_______|_\n"
            + "|_________|"};
                                        
    
    public HangmanUI() {
        initComponents();
        
        Hangman_Drawing_Text.setText(hangmanDrawings[0]);
        chosenWord = secretWordArrayList[(int)Math.round(Math.random()*secretWordArrayList.length)];
        
        secretWordLetters = Arrays.asList(chosenWord.split(""));
        
        String secretWordString = "";
        for(int i=0;i<secretWordLetters.size();i++) {
            if(usedLetters.contains(secretWordLetters.get(i)))
                secretWordString += String.format(" %s ", secretWordLetters.get(i));
            else
                secretWordString += " _ ";
            
            
        }
        
        Word_Guess_Text.setText(secretWordString);        
        }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Make_A_Guess_Button = new javax.swing.JButton();
        Guess_Progress_Bar = new javax.swing.JProgressBar();
        LetterInputField = new javax.swing.JTextField();
        Submit_Letter_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Title_Text_Area = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Word_Guess_Text = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Hangman_Drawing_Text = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Make_A_Guess_Button.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Make_A_Guess_Button.setText("Make A Guess");
        Make_A_Guess_Button.setFocusable(false);
        Make_A_Guess_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Make_A_Guess_ButtonMouseClicked(evt);
            }
        });

        LetterInputField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Submit_Letter_Button.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Submit_Letter_Button.setText("Submit Letter");
        Submit_Letter_Button.setAlignmentY(0.0F);
        Submit_Letter_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Submit_Letter_Button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Submit_Letter_Button.setMaximumSize(new java.awt.Dimension(50, 23));
        Submit_Letter_Button.setMinimumSize(new java.awt.Dimension(97, 23));
        Submit_Letter_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Submit_Letter_ButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Please Enter Your Letter:");

        Title_Text_Area.setEditable(false);
        Title_Text_Area.setColumns(20);
        Title_Text_Area.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        Title_Text_Area.setLineWrap(true);
        Title_Text_Area.setRows(1);
        Title_Text_Area.setTabSize(1);
        Title_Text_Area.setText("HANGMAN");
        Title_Text_Area.setAlignmentX(0.0F);
        Title_Text_Area.setDragEnabled(true);
        jScrollPane3.setViewportView(Title_Text_Area);

        Word_Guess_Text.setEditable(false);
        Word_Guess_Text.setColumns(20);
        Word_Guess_Text.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        Word_Guess_Text.setRows(5);
        jScrollPane4.setViewportView(Word_Guess_Text);
        Word_Guess_Text.getAccessibleContext().setAccessibleParent(null);

        Hangman_Drawing_Text.setColumns(20);
        Hangman_Drawing_Text.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Hangman_Drawing_Text.setRows(5);
        jScrollPane5.setViewportView(Hangman_Drawing_Text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guess_Progress_Bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Submit_Letter_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Make_A_Guess_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LetterInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LetterInputField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_Letter_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Make_A_Guess_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guess_Progress_Bar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Submit_Letter_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Submit_Letter_ButtonMouseClicked
        if(LetterInputField.getText().length()!=1) {
            JOptionPane.showMessageDialog(null,"Error: You have not entered an input of the correct length.","Incorrect Input", JOptionPane.WARNING_MESSAGE);
            LetterInputField.setText("");
            return;
        } 
        else if(usedLetters.contains(LetterInputField.getText())) {
            JOptionPane.showMessageDialog(null,"Error: You have already guessed this letter.","Letter Used", JOptionPane.WARNING_MESSAGE);
            LetterInputField.setText("");
            return;
        }
        
       String userGuess = LetterInputField.getText();
       usedLetters.add(userGuess);
       if (!secretWordLetters.contains(userGuess)) {
           IncorrectGuess();
       }
        
       //Add to string telling user if they're correct or not
       secretWordLetters = Arrays.asList(chosenWord.split(""));
        
        String secretWordString = "";
        int lettersCorrectCount = 0;
        for(int i=0;i<secretWordLetters.size();i++) {
            if(usedLetters.contains(secretWordLetters.get(i))) {
                secretWordString += String.format(" %s ", secretWordLetters.get(i));
                lettersCorrectCount++;
            }
            else
                secretWordString += " _ ";
            
        }
        if (lettersCorrectCount==chosenWord.length())
            GameWon();
        Word_Guess_Text.setText(secretWordString);
       
       String usedLetterString = "";
        //move to lower level
        for(int i = 0;i<usedLetters.size();i++) {
            usedLetterString += String.format("%s  ",usedLetters.get(i));
        }
        Title_Text_Area.setText(String.format("Hangman\nUsed Letters: %s\nGuesses Left: %d", usedLetterString, guessesLeft));
    
    }//GEN-LAST:event_Submit_Letter_ButtonMouseClicked

    private void Make_A_Guess_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Make_A_Guess_ButtonMouseClicked
        // TODO add your handling code here:
        String userGuess = JOptionPane.showInputDialog(null, "Please enter your guess:","Guess",JOptionPane.PLAIN_MESSAGE);
        
        
        if(userGuess.toLowerCase().equals(chosenWord))
            GameWon();
        else {
            JOptionPane.showMessageDialog(null,String.format("Sorry, this isn't right... The word is not %s!",userGuess),"Incorrect", JOptionPane.PLAIN_MESSAGE);
            IncorrectGuess();
        }
    }//GEN-LAST:event_Make_A_Guess_ButtonMouseClicked

    
    private void GameWon() {
        JOptionPane.showMessageDialog(null,String.format("Congratulations, you got it! The word was indeed '%s'!",chosenWord),"You Are Winner!", JOptionPane.PLAIN_MESSAGE);
        Make_A_Guess_Button.setEnabled(false);
        Submit_Letter_Button.setEnabled(false);
    }
    
    private void IncorrectGuess() {
        guessesLeft--;
           if(guessesLeft==0){
               JOptionPane.showMessageDialog(null,"Sorry, You're out of guesses, better luck next time!","Out of Guesses", JOptionPane.INFORMATION_MESSAGE);
               Make_A_Guess_Button.setEnabled(false);
               Submit_Letter_Button.setEnabled(false);
               Word_Guess_Text.setText(String.format("The secret word was '%s'",chosenWord));
           }
           Guess_Progress_Bar.setValue(100-((int)(((float)guessesLeft/totalGuesses)*100)));
           Hangman_Drawing_Text.setText(hangmanDrawings[totalGuesses-guessesLeft]);
    }
    
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
            java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Guess_Progress_Bar;
    private javax.swing.JTextArea Hangman_Drawing_Text;
    private javax.swing.JTextField LetterInputField;
    private javax.swing.JButton Make_A_Guess_Button;
    private javax.swing.JButton Submit_Letter_Button;
    private javax.swing.JTextArea Title_Text_Area;
    private javax.swing.JTextArea Word_Guess_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
