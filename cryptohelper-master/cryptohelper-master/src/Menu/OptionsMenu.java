package Menu;

import ServiceImpl.CipherServiceImpl;
import Services.CipherService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class OptionsMenu {

    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;
    private JMenuItem findFromCursorPosMenuItem;
    private JMenuItem findAgainMenuItem;

    private JPopupMenu optionsMenu;


    private CipherService cipherService;


    public OptionsMenu(){

        copyMenuItem = new JMenuItem();
        pasteMenuItem = new JMenuItem();
        findFromCursorPosMenuItem = new JMenuItem();
        findAgainMenuItem = new JMenuItem();

        optionsMenu = new JPopupMenu();

        cipherService = new CipherServiceImpl();

        initializeCopy();
        initializePaste();
        initializeFindFromCursor();
        initializeFindAgain();

        optionsMenu.add(copyMenuItem);
        optionsMenu.add(pasteMenuItem);
        optionsMenu.add(findFromCursorPosMenuItem);
        optionsMenu.add(findAgainMenuItem);

    }

    private void initializeCopy(){
        copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
        copyMenuItem.setText("Copy");
        copyMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
    }

    private void initializePaste(){
        pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
        pasteMenuItem.setText("Paste");
        pasteMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
    }


    private void initializeFindFromCursor(){
        findFromCursorPosMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
        findFromCursorPosMenuItem.setText("Find from Cursor's Position");
        findFromCursorPosMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                findFromCursorActionPerformed(evt);
            }
        });
    }

    private void initializeFindAgain(){
        findAgainMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
        findAgainMenuItem.setText("Find Again");
        findAgainMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                findAgainActionPerformed(evt);
            }
        });
    }


    private void findAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        cipherService.performSearchAgain((JTextArea)((JPopupMenu)((JMenuItem)evt.getSource()).getParent()).getInvoker());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void findFromCursorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        cipherService.performSearch((JTextArea)((JPopupMenu)((JMenuItem)evt.getSource()).getParent()).getInvoker());
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ((JTextArea)((JPopupMenu)((JMenuItem)evt.getSource()).getParent()).getInvoker()).paste();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ((JTextArea)((JPopupMenu)((JMenuItem)evt.getSource()).getParent()).getInvoker()).copy();
    }

    public JPopupMenu getOptionsMenu() {
        return optionsMenu;
    }

    public void setOptionsMenu(JPopupMenu optionsMenu) {
        this.optionsMenu = optionsMenu;
    }
}
