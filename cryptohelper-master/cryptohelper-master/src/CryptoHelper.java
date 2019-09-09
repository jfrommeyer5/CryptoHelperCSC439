/*
 * CryptoHelper.java
 *
 * Created on January 11, 2005, 7:37 PM
 */

package cryptohelper;

import javax.swing.*;
import javax.swing.text.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.*;

/**
 *
 * @author  Harlock
 */
public class CryptoHelper extends javax.swing.JFrame {
    
    /** Creates new form CryptoHelper */
    public CryptoHelper() {
        initComponents();

        jTextArea10.append("GNU GENERAL PUBLIC LICENSE\n");
        jTextArea10.append("\n");
        jTextArea10.append("Version 2, June 1991\n");
        jTextArea10.append("\n");
        jTextArea10.append("Copyright (C) 1989, 1991 Free Software Foundation, Inc.  \n");
        jTextArea10.append("59 Temple Place - Suite 330, Boston, MA  02111-1307, USA\n");
        jTextArea10.append("\n");
        jTextArea10.append("Everyone is permitted to copy and distribute verbatim copies\n");
        jTextArea10.append("of this license document, but changing it is not allowed.\n");
        jTextArea10.append("\n");
        jTextArea10.append("Preamble\n");
        jTextArea10.append("\n");
        jTextArea10.append("The licenses for most software are designed to take away your freedom to share and change it. By contrast, the GNU General Public License is intended to guarantee your freedom to share and change free software--to make sure the software is free for all its users. This General Public License applies to most of the Free Software Foundation's software and to any other program whose authors commit to using it. (Some other Free Software Foundation software is covered by the GNU Library General Public License instead.) You can apply it to your programs, too.\n");
        jTextArea10.append("\n");
        jTextArea10.append("When we speak of free software, we are referring to freedom, not price. Our General Public Licenses are designed to make sure that you have the freedom to distribute copies of free software (and charge for this service if you wish), that you receive source code or can get it if you want it, that you can change the software or use pieces of it in new free programs; and that you know you can do these things.\n");
        jTextArea10.append("\n");
        jTextArea10.append("To protect your rights, we need to make restrictions that forbid anyone to deny you these rights or to ask you to surrender the rights. These restrictions translate to certain responsibilities for you if you distribute copies of the software, or if you modify it.\n");
        jTextArea10.append("\n");
        jTextArea10.append("For example, if you distribute copies of such a program, whether gratis or for a fee, you must give the recipients all the rights that you have. You must make sure that they, too, receive or can get the source code. And you must show them these terms so they know their rights.\n");
        jTextArea10.append("\n");
        jTextArea10.append("We protect your rights with two steps: (1) copyright the software, and (2) offer you this license which gives you legal permission to copy, distribute and/or modify the software.\n");
        jTextArea10.append("\n");
        jTextArea10.append("Also, for each author's protection and ours, we want to make certain that everyone understands that there is no warranty for this free software. If the software is modified by someone else and passed on, we want its recipients to know that what they have is not the original, so that any problems introduced by others will not reflect on the original authors' reputations.\n");
        jTextArea10.append("\n");
        jTextArea10.append("Finally, any free program is threatened constantly by software patents. We wish to avoid the danger that redistributors of a free program will individually obtain patent licenses, in effect making the program proprietary. To prevent this, we have made it clear that any patent must be licensed for everyone's free use or not licensed at all.\n");
        jTextArea10.append("\n");
        jTextArea10.append("The precise terms and conditions for copying, distribution and modification follow.\n");
        jTextArea10.append("TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION\n");
        jTextArea10.append("\n");
        jTextArea10.append("0. This License applies to any program or other work which contains a notice placed by the copyright holder saying it may be distributed under the terms of this General Public License. The \"Program\", below, refers to any such program or work, and a \"work based on the Program\" means either the Program or any derivative work under copyright law: that is to say, a work containing the Program or a portion of it, either verbatim or with modifications and/or translated into another language. (Hereinafter, translation is included without limitation in the term \"modification\".) Each licensee is addressed as \"you\".\n");
        jTextArea10.append("\n");
        jTextArea10.append("Activities other than copying, distribution and modification are not covered by this License; they are outside its scope. The act of running the Program is not restricted, and the output from the Program is covered only if its contents constitute a work based on the Program (independent of having been made by running the Program). Whether that is true depends on what the Program does.\n");
        jTextArea10.append("\n");
        jTextArea10.append("1. You may copy and distribute verbatim copies of the Program's source code as you receive it, in any medium, provided that you conspicuously and appropriately publish on each copy an appropriate copyright notice and disclaimer of warranty; keep intact all the notices that refer to this License and to the absence of any warranty; and give any other recipients of the Program a copy of this License along with the Program.\n");
        jTextArea10.append("\n");
        jTextArea10.append("You may charge a fee for the physical act of transferring a copy, and you may at your option offer warranty protection in exchange for a fee.\n");
        jTextArea10.append("\n");
        jTextArea10.append("2. You may modify your copy or copies of the Program or any portion of it, thus forming a work based on the Program, and copy and distribute such modifications or work under the terms of Section 1 above, provided that you also meet all of these conditions:\n");
        jTextArea10.append("\n");
        jTextArea10.append("    a) You must cause the modified files to carry prominent notices stating that you changed the files and the date of any change. \n");
        jTextArea10.append("\n");
        jTextArea10.append("    b) You must cause any work that you distribute or publish, that in whole or in part contains or is derived from the Program or any part thereof, to be licensed as a whole at no charge to all third parties under the terms of this License. \n");
        jTextArea10.append("\n");
        jTextArea10.append("    c) If the modified program normally reads commands interactively when run, you must cause it, when started running for such interactive use in the most ordinary way, to print or display an announcement including an appropriate copyright notice and a notice that there is no warranty (or else, saying that you provide a warranty) and that users may redistribute the program under these conditions, and telling the user how to view a copy of this License. (Exception: if the Program itself is interactive but does not normally print such an announcement, your work based on the Program is not required to print an announcement.) \n");
        jTextArea10.append("\n");
        jTextArea10.append("These requirements apply to the modified work as a whole. If identifiable sections of that work are not derived from the Program, and can be reasonably considered independent and separate works in themselves, then this License, and its terms, do not apply to those sections when you distribute them as separate works. But when you distribute the same sections as part of a whole which is a work based on the Program, the distribution of the whole must be on the terms of this License, whose permissions for other licensees extend to the entire whole, and thus to each and every part regardless of who wrote it.\n");
        jTextArea10.append("\n");
        jTextArea10.append("Thus, it is not the intent of this section to claim rights or contest your rights to work written entirely by you; rather, the intent is to exercise the right to control the distribution of derivative or collective works based on the Program.\n");
        jTextArea10.append("\n");
        jTextArea10.append("In addition, mere aggregation of another work not based on the Program with the Program (or with a work based on the Program) on a volume of a storage or distribution medium does not bring the other work under the scope of this License.\n");
        jTextArea10.append("\n");
        jTextArea10.append("3. You may copy and distribute the Program (or a work based on it, under Section 2) in object code or executable form under the terms of Sections 1 and 2 above provided that you also do one of the following:\n");
        jTextArea10.append("\n");
        jTextArea10.append("    a) Accompany it with the complete corresponding machine-readable source code, which must be distributed under the terms of Sections 1 and 2 above on a medium customarily used for software interchange; or, \n");
        jTextArea10.append("\n");
        jTextArea10.append("    b) Accompany it with a written offer, valid for at least three years, to give any third party, for a charge no more than your cost of physically performing source distribution, a complete machine-readable copy of the corresponding source code, to be distributed under the terms of Sections 1 and 2 above on a medium customarily used for software interchange; or, \n");
        jTextArea10.append("\n");
        jTextArea10.append("    c) Accompany it with the information you received as to the offer to distribute corresponding source code. (This alternative is allowed only for noncommercial distribution and only if you received the program in object code or executable form with such an offer, in accord with Subsection b above.) \n");
        jTextArea10.append("\n");
        jTextArea10.append("The source code for a work means the preferred form of the work for making modifications to it. For an executable work, complete source code means all the source code for all modules it contains, plus any associated interface definition files, plus the scripts used to control compilation and installation of the executable. However, as a special exception, the source code distributed need not include anything that is normally distributed (in either source or binary form) with the major components (compiler, kernel, and so on) of the operating system on which the executable runs, unless that component itself accompanies the executable.\n");
        jTextArea10.append("\n");
        jTextArea10.append("If distribution of executable or object code is made by offering access to copy from a designated place, then offering equivalent access to copy the source code from the same place counts as distribution of the source code, even though third parties are not compelled to copy the source along with the object code.\n");
        jTextArea10.append("\n");
        jTextArea10.append("4. You may not copy, modify, sublicense, or distribute the Program except as expressly provided under this License. Any attempt otherwise to copy, modify, sublicense or distribute the Program is void, and will automatically terminate your rights under this License. However, parties who have received copies, or rights, from you under this License will not have their licenses terminated so long as such parties remain in full compliance.\n");
        jTextArea10.append("\n");
        jTextArea10.append("5. You are not required to accept this License, since you have not signed it. However, nothing else grants you permission to modify or distribute the Program or its derivative works. These actions are prohibited by law if you do not accept this License. Therefore, by modifying or distributing the Program (or any work based on the Program), you indicate your acceptance of this License to do so, and all its terms and conditions for copying, distributing or modifying the Program or works based on it.\n");
        jTextArea10.append("\n");
        jTextArea10.append("6. Each time you redistribute the Program (or any work based on the Program), the recipient automatically receives a license from the original licensor to copy, distribute or modify the Program subject to these terms and conditions. You may not impose any further restrictions on the recipients' exercise of the rights granted herein. You are not responsible for enforcing compliance by third parties to this License.\n");
        jTextArea10.append("\n");
        jTextArea10.append("7. If, as a consequence of a court judgment or allegation of patent infringement or for any other reason (not limited to patent issues), conditions are imposed on you (whether by court order, agreement or otherwise) that contradict the conditions of this License, they do not excuse you from the conditions of this License. If you cannot distribute so as to satisfy simultaneously your obligations under this License and any other pertinent obligations, then as a consequence you may not distribute the Program at all. For example, if a patent license would not permit royalty-free redistribution of the Program by all those who receive copies directly or indirectly through you, then the only way you could satisfy both it and this License would be to refrain entirely from distribution of the Program.\n");
        jTextArea10.append("\n");
        jTextArea10.append("If any portion of this section is held invalid or unenforceable under any particular circumstance, the balance of the section is intended to apply and the section as a whole is intended to apply in other circumstances.\n");
        jTextArea10.append("\n");
        jTextArea10.append("It is not the purpose of this section to induce you to infringe any patents or other property right claims or to contest validity of any such claims; this section has the sole purpose of protecting the integrity of the free software distribution system, which is implemented by public license practices. Many people have made generous contributions to the wide range of software distributed through that system in reliance on consistent application of that system; it is up to the author/donor to decide if he or she is willing to distribute software through any other system and a licensee cannot impose that choice.\n");
        jTextArea10.append("\n");
        jTextArea10.append("This section is intended to make thoroughly clear what is believed to be a consequence of the rest of this License.\n");
        jTextArea10.append("\n");
        jTextArea10.append("8. If the distribution and/or use of the Program is restricted in certain countries either by patents or by copyrighted interfaces, the original copyright holder who places the Program under this License may add an explicit geographical distribution limitation excluding those countries, so that distribution is permitted only in or among countries not thus excluded. In such case, this License incorporates the limitation as if written in the body of this License.\n");
        jTextArea10.append("\n");
        jTextArea10.append("9. The Free Software Foundation may publish revised and/or new versions of the General Public License from time to time. Such new versions will be similar in spirit to the present version, but may differ in detail to address new problems or concerns.\n");
        jTextArea10.append("\n");
        jTextArea10.append("Each version is given a distinguishing version number. If the Program specifies a version number of this License which applies to it and \"any later version\", you have the option of following the terms and conditions either of that version or of any later version published by the Free Software Foundation. If the Program does not specify a version number of this License, you may choose any version ever published by the Free Software Foundation.\n");
        jTextArea10.append("\n");
        jTextArea10.append("10. If you wish to incorporate parts of the Program into other free programs whose distribution conditions are different, write to the author to ask for permission. For software which is copyrighted by the Free Software Foundation, write to the Free Software Foundation; we sometimes make exceptions for this. Our decision will be guided by the two goals of preserving the free status of all derivatives of our free software and of promoting the sharing and reuse of software generally.\n");
        jTextArea10.append("\n");
        jTextArea10.append("NO WARRANTY\n");
        jTextArea10.append("\n");
        jTextArea10.append("11. BECAUSE THE PROGRAM IS LICENSED FREE OF CHARGE, THERE IS NO WARRANTY FOR THE PROGRAM, TO THE EXTENT PERMITTED BY APPLICABLE LAW. EXCEPT WHEN OTHERWISE STATED IN WRITING THE COPYRIGHT HOLDERS AND/OR OTHER PARTIES PROVIDE THE PROGRAM \"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE ENTIRE RISK AS TO THE QUALITY AND PERFORMANCE OF THE PROGRAM IS WITH YOU. SHOULD THE PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF ALL NECESSARY SERVICING, REPAIR OR CORRECTION.\n");
        jTextArea10.append("\n");
        jTextArea10.append("12. IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN WRITING WILL ANY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MAY MODIFY AND/OR REDISTRIBUTE THE PROGRAM AS PERMITTED ABOVE, BE LIABLE TO YOU FOR DAMAGES, INCLUDING ANY GENERAL, SPECIAL, INCIDENTAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR INABILITY TO USE THE PROGRAM (INCLUDING BUT NOT LIMITED TO LOSS OF DATA OR DATA BEING RENDERED INACCURATE OR LOSSES SUSTAINED BY YOU OR THIRD PARTIES OR A FAILURE OF THE PROGRAM TO OPERATE WITH ANY OTHER PROGRAMS), EVEN IF SUCH HOLDER OR OTHER PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.                 \n");
        jTextArea10.append("                \n");
        jTextArea10.append("\n");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jSplitPane7 = new javax.swing.JSplitPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jButton16 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jSplitPane5 = new javax.swing.JSplitPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jButton14 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jSplitPane6 = new javax.swing.JSplitPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jButton15 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jPanel41 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel43 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jPanel44 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jButton19 = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Copy");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Paste");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });

        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Find from Cursor's Position");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });

        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Find Again");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });

        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CryptoHelper \u00a9Gary Watson 2005 (Under the terms of the GPL)");
        jSplitPane1.setDividerLocation(50);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(jTextArea1);

        jSplitPane1.setTopComponent(jScrollPane1);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Perform Frequency Count");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton1, java.awt.BorderLayout.SOUTH);

        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Frequency Count", jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton2.setText("Run The Alphabet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton2, java.awt.BorderLayout.SOUTH);

        jTextArea3.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane3.setViewportView(jTextArea3);

        jPanel2.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Run The Alphabet", jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextArea4.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane4.setViewportView(jTextArea4);

        jPanel3.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jButton3.setText("Show BiGraphs");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.add(jButton3, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("BiGraphs", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jTextArea5.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane5.setViewportView(jTextArea5);

        jPanel4.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jButton4.setText("Show TriGraphs");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel4.add(jButton4, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("TriGraphs", jPanel4);

        jPanel20.setLayout(new java.awt.BorderLayout());

        jTextArea12.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane12.setViewportView(jTextArea12);

        jPanel20.add(jScrollPane12, java.awt.BorderLayout.CENTER);

        jButton10.setText("Show NGraphs");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jPanel20.add(jButton10, java.awt.BorderLayout.SOUTH);

        jLabel8.setText("Length of NGraph");
        jPanel21.add(jLabel8);

        jSpinner5.setPreferredSize(new java.awt.Dimension(50, 20));
        jSpinner5.setValue(new Integer(1));
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jPanel21.add(jSpinner5);

        jPanel20.add(jPanel21, java.awt.BorderLayout.NORTH);

        jTabbedPane1.addTab("NGraphs", jPanel20);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton5.setText("Execute");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel5.add(jButton5, java.awt.BorderLayout.SOUTH);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Enter Keyword");
        jPanel6.add(jLabel1, java.awt.BorderLayout.WEST);

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextField1.setText("the");
        jPanel6.add(jTextField1, java.awt.BorderLayout.CENTER);

        jCheckBox1.setText("Shift first");
        jPanel6.add(jCheckBox1, java.awt.BorderLayout.EAST);

        jPanel5.add(jPanel6, java.awt.BorderLayout.NORTH);

        jTextArea6.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane6.setViewportView(jTextArea6);

        jPanel5.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Affine Known Plaintext Attack", jPanel5);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(689, 75));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("1");
        jPanel9.add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("3");
        jPanel9.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("5");
        jPanel9.add(jRadioButton3);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("7");
        jPanel9.add(jRadioButton4);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("9");
        jPanel9.add(jRadioButton5);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("11");
        jPanel9.add(jRadioButton6);

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("15");
        jPanel9.add(jRadioButton7);

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("17");
        jPanel9.add(jRadioButton8);

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("19");
        jPanel9.add(jRadioButton9);

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("21");
        jPanel9.add(jRadioButton10);

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setText("23");
        jPanel9.add(jRadioButton11);

        buttonGroup1.add(jRadioButton12);
        jRadioButton12.setText("25");
        jPanel9.add(jRadioButton12);

        jPanel8.add(jPanel9, java.awt.BorderLayout.CENTER);

        jLabel3.setText("Additive Shift");
        jPanel10.add(jLabel3);

        jSpinner1.setPreferredSize(new java.awt.Dimension(50, 20));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jPanel10.add(jSpinner1);

        jPanel8.add(jPanel10, java.awt.BorderLayout.SOUTH);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Multiplicative shift");
        jPanel8.add(jLabel2, java.awt.BorderLayout.NORTH);

        jPanel7.add(jPanel8, java.awt.BorderLayout.NORTH);

        jButton6.setText("Encipher");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel7.add(jButton6, java.awt.BorderLayout.SOUTH);

        jTextArea7.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane7.setViewportView(jTextArea7);

        jPanel7.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Affine Encipher", jPanel7);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel12.setPreferredSize(new java.awt.Dimension(689, 75));
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup2.add(jRadioButton13);
        jRadioButton13.setSelected(true);
        jRadioButton13.setText("1");
        jPanel13.add(jRadioButton13);

        buttonGroup2.add(jRadioButton14);
        jRadioButton14.setText("3");
        jPanel13.add(jRadioButton14);

        buttonGroup2.add(jRadioButton15);
        jRadioButton15.setText("5");
        jPanel13.add(jRadioButton15);

        buttonGroup2.add(jRadioButton16);
        jRadioButton16.setText("7");
        jPanel13.add(jRadioButton16);

        buttonGroup2.add(jRadioButton17);
        jRadioButton17.setText("9");
        jPanel13.add(jRadioButton17);

        buttonGroup2.add(jRadioButton18);
        jRadioButton18.setText("11");
        jPanel13.add(jRadioButton18);

        buttonGroup2.add(jRadioButton19);
        jRadioButton19.setText("15");
        jPanel13.add(jRadioButton19);

        buttonGroup2.add(jRadioButton20);
        jRadioButton20.setText("17");
        jPanel13.add(jRadioButton20);

        buttonGroup2.add(jRadioButton21);
        jRadioButton21.setText("19");
        jPanel13.add(jRadioButton21);

        buttonGroup2.add(jRadioButton22);
        jRadioButton22.setText("21");
        jPanel13.add(jRadioButton22);

        buttonGroup2.add(jRadioButton23);
        jRadioButton23.setText("23");
        jPanel13.add(jRadioButton23);

        buttonGroup2.add(jRadioButton24);
        jRadioButton24.setText("25");
        jPanel13.add(jRadioButton24);

        jPanel12.add(jPanel13, java.awt.BorderLayout.CENTER);

        jLabel4.setText("Additive Shift");
        jPanel14.add(jLabel4);

        jSpinner2.setPreferredSize(new java.awt.Dimension(50, 20));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jPanel14.add(jSpinner2);

        jPanel12.add(jPanel14, java.awt.BorderLayout.SOUTH);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Multiplicative shift");
        jPanel12.add(jLabel5, java.awt.BorderLayout.NORTH);

        jPanel11.add(jPanel12, java.awt.BorderLayout.NORTH);

        jButton7.setText("Decipher");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel11.add(jButton7, java.awt.BorderLayout.SOUTH);

        jTextArea8.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane8.setViewportView(jTextArea8);

        jPanel11.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Affine Decipher", jPanel11);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel6.setText("Enter Wordlength");
        jPanel16.add(jLabel6);

        jSpinner3.setPreferredSize(new java.awt.Dimension(50, 20));
        jSpinner3.setValue(new Integer(1));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jPanel16.add(jSpinner3);

        jPanel15.add(jPanel16, java.awt.BorderLayout.NORTH);

        jTextArea9.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane9.setViewportView(jTextArea9);

        jPanel15.add(jScrollPane9, java.awt.BorderLayout.CENTER);

        jButton8.setText("Split off the alphabets");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel15.add(jButton8, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("Split Off Alphabets", jPanel15);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jLabel7.setText("Keyword Size");
        jPanel19.add(jLabel7);

        jSpinner4.setPreferredSize(new java.awt.Dimension(50, 20));
        jSpinner4.setValue(new Integer(1));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jPanel19.add(jSpinner4);

        jPanel18.add(jPanel19, java.awt.BorderLayout.NORTH);

        jTextArea11.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane11.setViewportView(jTextArea11);

        jPanel18.add(jScrollPane11, java.awt.BorderLayout.CENTER);

        jButton9.setText("Calculate");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel18.add(jButton9, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("Poly/Mono Calculator", jPanel18);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jSplitPane2.setDividerLocation(300);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                {"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A"},
                {"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B"},
                {"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C"},
                {"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D"},
                {"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E"},
                {"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F"},
                {"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G"},
                {"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H"},
                {"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I"},
                {"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"},
                {"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"},
                {"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"},
                {"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"},
                {"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"},
                {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"},
                {"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"},
                {"S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"},
                {"T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"},
                {"U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"},
                {"V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"},
                {"W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"},
                {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"},
                {"Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"},
                {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"}
            },
            new String [] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowSelectionAllowed(false);
        jScrollPane14.setViewportView(jTable1);

        jSplitPane2.setTopComponent(jScrollPane14);

        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel23.setOpaque(false);
        jPanel24.setLayout(new java.awt.BorderLayout());

        jLabel9.setText("Keyword");
        jPanel24.add(jLabel9, java.awt.BorderLayout.WEST);

        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 12));
        jPanel24.add(jTextField2, java.awt.BorderLayout.CENTER);

        jPanel23.add(jPanel24, java.awt.BorderLayout.NORTH);

        jTextArea13.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane13.setViewportView(jTextArea13);

        jPanel23.add(jScrollPane13, java.awt.BorderLayout.CENTER);

        jButton11.setText("Encipher");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel23.add(jButton11, java.awt.BorderLayout.SOUTH);

        jSplitPane2.setBottomComponent(jPanel23);

        jPanel22.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Viginere Encipher", jPanel22);

        jPanel25.setLayout(new java.awt.BorderLayout());

        jSplitPane3.setDividerLocation(300);
        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                {"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A"},
                {"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B"},
                {"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C"},
                {"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D"},
                {"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E"},
                {"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F"},
                {"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G"},
                {"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H"},
                {"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I"},
                {"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"},
                {"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"},
                {"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"},
                {"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"},
                {"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"},
                {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"},
                {"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"},
                {"S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"},
                {"T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"},
                {"U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"},
                {"V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"},
                {"W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"},
                {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"},
                {"Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"},
                {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"}
            },
            new String [] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowSelectionAllowed(false);
        jScrollPane15.setViewportView(jTable2);

        jSplitPane3.setTopComponent(jScrollPane15);

        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel26.setOpaque(false);
        jPanel27.setLayout(new java.awt.BorderLayout());

        jLabel10.setText("Keyword");
        jPanel27.add(jLabel10, java.awt.BorderLayout.WEST);

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 12));
        jPanel27.add(jTextField3, java.awt.BorderLayout.CENTER);

        jPanel26.add(jPanel27, java.awt.BorderLayout.NORTH);

        jTextArea14.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane16.setViewportView(jTextArea14);

        jPanel26.add(jScrollPane16, java.awt.BorderLayout.CENTER);

        jButton12.setText("Decipher");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jPanel26.add(jButton12, java.awt.BorderLayout.SOUTH);

        jSplitPane3.setBottomComponent(jPanel26);

        jPanel25.add(jSplitPane3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Viginere Decipher", jPanel25);

        jPanel37.setLayout(new java.awt.BorderLayout());

        jSplitPane7.setDividerLocation(300);
        jSplitPane7.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                {"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A"},
                {"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B"},
                {"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C"},
                {"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D"},
                {"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E"},
                {"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F"},
                {"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G"},
                {"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H"},
                {"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I"},
                {"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"},
                {"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"},
                {"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"},
                {"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"},
                {"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"},
                {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"},
                {"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"},
                {"S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"},
                {"T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"},
                {"U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"},
                {"V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"},
                {"W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"},
                {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"},
                {"Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"},
                {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"}
            },
            new String [] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setRowSelectionAllowed(false);
        jScrollPane23.setViewportView(jTable6);

        jSplitPane7.setTopComponent(jScrollPane23);

        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel38.setOpaque(false);
        jLabel15.setText("Keyword Length");
        jPanel39.add(jLabel15);

        jSpinner8.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel39.add(jSpinner8);

        jLabel16.setText("Friedman cutoff");
        jPanel39.add(jLabel16);

        jTextField7.setText(".060");
        jPanel39.add(jTextField7);

        jPanel38.add(jPanel39, java.awt.BorderLayout.NORTH);

        jTextArea18.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane24.setViewportView(jTextArea18);

        jPanel38.add(jScrollPane24, java.awt.BorderLayout.CENTER);

        jButton16.setText("Go");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jPanel38.add(jButton16, java.awt.BorderLayout.SOUTH);

        jSplitPane7.setBottomComponent(jPanel38);

        jPanel37.add(jSplitPane7, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Viginere Brute Force", jPanel37);

        jPanel28.setLayout(new java.awt.BorderLayout());

        jSplitPane4.setDividerLocation(300);
        jSplitPane4.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                {"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A"},
                {"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B"},
                {"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C"},
                {"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D"},
                {"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E"},
                {"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F"},
                {"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G"},
                {"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H"},
                {"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I"},
                {"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"},
                {"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"},
                {"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"},
                {"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"},
                {"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"},
                {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"},
                {"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"},
                {"S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"},
                {"T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"},
                {"U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"},
                {"V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"},
                {"W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"},
                {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"},
                {"Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"},
                {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"}
            },
            new String [] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setRowSelectionAllowed(false);
        jScrollPane17.setViewportView(jTable3);

        jSplitPane4.setTopComponent(jScrollPane17);

        jPanel29.setLayout(new java.awt.BorderLayout());

        jPanel29.setOpaque(false);
        jLabel11.setText("Keyword Length");
        jPanel30.add(jLabel11);

        jSpinner6.setPreferredSize(new java.awt.Dimension(50, 20));
        jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner6StateChanged(evt);
            }
        });

        jPanel30.add(jSpinner6);

        jPanel29.add(jPanel30, java.awt.BorderLayout.NORTH);

        jTextArea15.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane18.setViewportView(jTextArea15);

        jPanel29.add(jScrollPane18, java.awt.BorderLayout.CENTER);

        jButton13.setText("Perform Attack");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jPanel29.add(jButton13, java.awt.BorderLayout.SOUTH);

        jSplitPane4.setBottomComponent(jPanel29);

        jPanel28.add(jSplitPane4, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("AutoKey Cyphertext Attack", jPanel28);

        jPanel31.setLayout(new java.awt.BorderLayout());

        jSplitPane5.setDividerLocation(300);
        jSplitPane5.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                {"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A"},
                {"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B"},
                {"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C"},
                {"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D"},
                {"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E"},
                {"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F"},
                {"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G"},
                {"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H"},
                {"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I"},
                {"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"},
                {"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"},
                {"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"},
                {"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"},
                {"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"},
                {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"},
                {"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"},
                {"S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"},
                {"T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"},
                {"U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"},
                {"V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"},
                {"W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"},
                {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"},
                {"Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"},
                {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"}
            },
            new String [] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setRowSelectionAllowed(false);
        jScrollPane19.setViewportView(jTable4);

        jSplitPane5.setTopComponent(jScrollPane19);

        jPanel32.setLayout(new java.awt.BorderLayout());

        jPanel32.setOpaque(false);
        jLabel12.setText("Max Keyword Length");
        jPanel33.add(jLabel12);

        jSpinner7.setPreferredSize(new java.awt.Dimension(50, 20));
        jSpinner7.setValue(new Integer(1));
        jSpinner7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner7StateChanged(evt);
            }
        });

        jPanel33.add(jSpinner7);

        jLabel13.setText("Friedman Cuttoff");
        jPanel33.add(jLabel13);

        jTextField4.setText("0.055");
        jTextField4.setPreferredSize(new java.awt.Dimension(50, 19));
        jPanel33.add(jTextField4);

        jTextField5.setText("2.0");
        jTextField5.setPreferredSize(new java.awt.Dimension(50, 19));
        jPanel33.add(jTextField5);

        jPanel32.add(jPanel33, java.awt.BorderLayout.NORTH);

        jTextArea16.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane20.setViewportView(jTextArea16);

        jPanel32.add(jScrollPane20, java.awt.BorderLayout.CENTER);

        jButton14.setText("Perform Attack");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jPanel32.add(jButton14, java.awt.BorderLayout.SOUTH);

        jSplitPane5.setBottomComponent(jPanel32);

        jPanel31.add(jSplitPane5, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("AutoKey Plaintext Attack", jPanel31);

        jPanel34.setLayout(new java.awt.BorderLayout());

        jSplitPane6.setDividerLocation(300);
        jSplitPane6.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                {"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A"},
                {"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B"},
                {"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C"},
                {"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D"},
                {"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E"},
                {"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F"},
                {"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G"},
                {"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H"},
                {"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I"},
                {"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"},
                {"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"},
                {"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"},
                {"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"},
                {"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"},
                {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"},
                {"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"},
                {"S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"},
                {"T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"},
                {"U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"},
                {"V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"},
                {"W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"},
                {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"},
                {"Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"},
                {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"}
            },
            new String [] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setRowSelectionAllowed(false);
        jScrollPane21.setViewportView(jTable5);

        jSplitPane6.setTopComponent(jScrollPane21);

        jPanel35.setLayout(new java.awt.BorderLayout());

        jPanel35.setOpaque(false);
        jPanel36.setLayout(new java.awt.BorderLayout());

        jLabel14.setText("Keyword");
        jPanel36.add(jLabel14, java.awt.BorderLayout.WEST);

        jTextField6.setFont(new java.awt.Font("Monospaced", 0, 12));
        jPanel36.add(jTextField6, java.awt.BorderLayout.CENTER);

        jCheckBox2.setText("PlainText");
        jPanel36.add(jCheckBox2, java.awt.BorderLayout.EAST);

        jPanel35.add(jPanel36, java.awt.BorderLayout.NORTH);

        jTextArea17.setFont(new java.awt.Font("Monospaced", 0, 12));
        jScrollPane22.setViewportView(jTextArea17);

        jPanel35.add(jScrollPane22, java.awt.BorderLayout.CENTER);

        jButton15.setText("Decipher");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jPanel35.add(jButton15, java.awt.BorderLayout.SOUTH);

        jSplitPane6.setBottomComponent(jPanel35);

        jPanel34.add(jSplitPane6, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("AutoKey Decipher", jPanel34);

        jPanel40.setLayout(new java.awt.BorderLayout());

        jButton17.setText("Go");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jPanel40.add(jButton17, java.awt.BorderLayout.SOUTH);

        jTextArea19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane25.setViewportView(jTextArea19);

        jPanel40.add(jScrollPane25, java.awt.BorderLayout.CENTER);

        jLabel18.setText("Friedman cutoff");
        jPanel41.add(jLabel18);

        jTextField8.setText("0.060");
        jTextField8.setPreferredSize(new java.awt.Dimension(50, 19));
        jPanel41.add(jTextField8);

        jPanel40.add(jPanel41, java.awt.BorderLayout.NORTH);

        jTabbedPane1.addTab("Hill Brute Force", jPanel40);

        jPanel42.setLayout(new java.awt.BorderLayout());

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane26.setViewportView(jTable7);

        jPanel42.add(jScrollPane26, java.awt.BorderLayout.CENTER);

        jLabel17.setText("Number of Rows");
        jPanel43.add(jLabel17);

        jSpinner9.setPreferredSize(new java.awt.Dimension(50, 20));
        jSpinner9.setValue(new Integer(1));
        jSpinner9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jPanel43.add(jSpinner9);

        jPanel42.add(jPanel43, java.awt.BorderLayout.NORTH);

        jPanel44.setLayout(new java.awt.BorderLayout());

        jButton18.setText("Go");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jPanel44.add(jButton18, java.awt.BorderLayout.CENTER);

        jPanel42.add(jPanel44, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("Column Transposition Worksheet", jPanel42);

        jPanel45.setLayout(new java.awt.BorderLayout());

        jLabel19.setText("Inverse of");
        jPanel46.add(jLabel19);

        jTextField9.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel46.add(jTextField9);

        jLabel20.setText("Mod");
        jPanel46.add(jLabel20);

        jTextField10.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel46.add(jTextField10);

        jPanel45.add(jPanel46, java.awt.BorderLayout.NORTH);

        jTextArea20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane27.setViewportView(jTextArea20);

        jPanel45.add(jScrollPane27, java.awt.BorderLayout.CENTER);

        jButton19.setText("Go");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jPanel45.add(jButton19, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("GCD and Inverse", jPanel45);

        jPanel47.setLayout(new java.awt.BorderLayout());

        jPanel47.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel47ComponentShown(evt);
            }
        });

        jLabel21.setText("Dictionary File: ");
        jToolBar1.add(jLabel21);

        jToolBar1.add(jTextField11);

        jButton21.setText("Browse");
        jToolBar1.add(jButton21);

        jButton22.setText("Generate");
        jToolBar1.add(jButton22);

        jPanel47.add(jToolBar1, java.awt.BorderLayout.NORTH);

        jButton20.setText("Go");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jPanel47.add(jButton20, java.awt.BorderLayout.SOUTH);

        jTextArea21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jTextArea21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaMouseClicked(evt);
            }
        });

        jScrollPane28.setViewportView(jTextArea21);

        jPanel47.add(jScrollPane28, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Substitution Solver", jPanel47);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel17.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel17ComponentShown(evt);
            }
        });

        jTextArea10.setEditable(false);
        jTextArea10.setFont(new java.awt.Font("Monospaced", 0, 12));
        jTextArea10.setLineWrap(true);
        jTextArea10.setWrapStyleWord(true);
        jScrollPane10.setViewportView(jTextArea10);

        jPanel17.add(jScrollPane10, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Terms of the GPL", jPanel17);

        jSplitPane1.setBottomComponent(jTabbedPane1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }
    // </editor-fold>//GEN-END:initComponents

    private void jPanel47ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel47ComponentShown
        try
        {            
            JarFile jf = new JarFile("CryptoHelper.jar");
            
            ZipEntry ze = jf.getEntry("english.wow");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(jf.getInputStream(ze)));
            dictionary = new int[26][26][26][26];

            for(int x = 0; x < 26; x++)
            {
                for (int y = 0; y < 26; y++)
                {
                    for(int l = 0; l < 26; l++)
                    {
                        for(int r = 0; r < 26; r++)
                        {
                            dictionary[x][y][l][r] = 1;
                        }
                    }
                }
            }        
            String temp = new String();            
            while ((temp = br.readLine()) != null)
            {
                String parse[] = temp.split(", ");                
                dictionary[parse[0].charAt(0)-65][parse[0].charAt(1)-65][parse[0].charAt(2)-65][parse[0].charAt(3)-65] = Integer.parseInt(parse[1]);
            }
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,
            "Error:Cannot read from file.\n");
        }
    }//GEN-LAST:event_jPanel47ComponentShown
    
    class SubstitutionSolver implements Runnable
    {
        String ciphertext;
        long iteration = 0;
        char key[];
        boolean stopToggle = false;
        
        public void stop()
        {
            stopToggle = true;
        }
        
        public SubstitutionSolver(String ciphertext)                               // this is the classes constructor
        {
            this.ciphertext = ciphertext;
            key = new char[256];
        }

        public void run()                                                           // this is the "main" method of the thread
        {
            jTextArea21.setText("best overall = " + score(ciphertext) + " : best score = " + score(ciphertext) + "\n");
            
//            jTextArea21.append("" + ciphertext.replaceAll("/(.....)/", '\1 ');
            
            randomize(key);
            
            double bestScore = score(ciphertext);
            double bestOverall = bestScore - 1;
            int numSmallAdjusts = 0;

            int bestI = 0;
            int bestJ = 0;
            
            
            while(true)
            {
                if (stopToggle) return;
//                jTextArea21.append("");
                
                double bestAdj = bestScore;
                
                char testKey[] = new char[256];                    
                

                for (int i = 0; i < 26; i++)
                {
                    for (int j = i+1; j < 26; j++)
                    {
                        for (int x = 0; x < 256; x++) testKey[x] = key[x];
                        char temp = testKey[i+65];
                        testKey[i+65] = testKey[j+65];
                        testKey[j+65] = temp;

                        double sc = score(plaintext(ciphertext, testKey));
                        
//                        for (int l = 0; l < 26; l++) jTextArea21.append("" + testKey[l+65] + ", ");
//                        jTextArea21.append("\n" + score(plaintext(ciphertext, testKey)) + "\n");
//                        jTextArea21.append("\n");
//                        for (int l = 0; l < 26; l++) jTextArea21.append("" + key[l+65] + ", ");
//                        jTextArea21.append("" + score(plaintext(ciphertext, key)) + "\n");
//                        jTextArea21.append("\n\n");
                        
                        if (sc > bestAdj)
                        {
                            bestAdj = sc;
                            bestI = i;
                            bestJ = j;
                        }
                    }
                }
                
                if (bestAdj > bestScore)
                {
                    char temp = key[bestI+65];
                    key[bestI+65] = key[bestJ+65];
                    key[bestJ+65] = temp;
                    bestScore = bestAdj;
                    if (bestScore > bestOverall)
                    {
                        numSmallAdjusts = 0;
                        bestOverall = bestScore;
                        jTextArea21.setText("best overall = " + bestOverall + " : best score = " + bestScore + " : iteration = " + iteration + "\n");
                        jTextArea21.append("" + plaintext(ciphertext, key)/*.gsub(/(.....)/, '\1 '*/ + "\n");
                    }
                }
                else
                {
                    if (numSmallAdjusts < 5)
                    {
                        smallAdj(key);
                        numSmallAdjusts += 1;
                    }
                    else
                    {
                        randomize(key);
                        numSmallAdjusts = 0;
                    }
                    bestScore=score(plaintext(ciphertext, key));
                }
            }
        }                                                                       // thread is terminating.
        
        private double score(String string)
        {
            iteration += 1;
            double tally = 0;
            
            for (int x = 0; x < string.length() - 4; x++)
            {
                tally += Math.log((dictionary[string.charAt(x)-65][string.charAt(x+1)-65][string.charAt(x+2)-65][string.charAt(x+3)-65]));
            }
            return tally;
        }
        
        private void smallAdj(char key[])
        {
            int rNum = (int)(Math.random() * 5);
            
            for (int i = 0; i < rNum; i++)
            {
                int j = (int)(Math.random() * 26);
                int k = (int)(Math.random() * 26);
                
                if (j!=k)
                {
			char temp = key[j+65];
			key[j+65] = key[k+65];
			key[k+65] = temp;
                }
            }
        }
        
        private String plaintext(String ciphertext, char key[])
        {
            String returnString = new String();
            
            for (int x = 0; x < ciphertext.length(); x++)
            {
                returnString = returnString + key[ciphertext.charAt(x)];
            }
            return returnString;
        }
        
        private void randomize(char key[])
        {
            ArrayList array = new ArrayList();
            
            for (int x = 0; x < 26; x++)
            {
                array.add(x, new Character((char)(x + 65)));
            }
            
            for (int x = 0; x < 26; x++)
            {
                int y = (int)(Math.random() * array.size());
                key[x+65] = ((Character)array.get(y)).charValue();
                array.remove(y);
            }
        }
    }
    
    boolean jButton20Toggle = false;
    Thread substitutionThread;
    SubstitutionSolver substitutionSolver;

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if (jButton20Toggle == false)
        {
            String inputString = formatString(jTextArea1);
            substitutionSolver = new SubstitutionSolver(inputString);
            substitutionThread = new Thread(substitutionSolver);
            substitutionThread.start();
            jButton20Toggle = true;
            jButton20.setText("Stop");
        }
        else
        {
            substitutionSolver.stop();
            jButton20Toggle = false;
            jButton20.setText("Go");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        double y = Math.max(Double.parseDouble(jTextField10.getText()), Double.parseDouble(jTextField9.getText()));
        double z = Math.min(Double.parseDouble(jTextField10.getText()), Double.parseDouble(jTextField9.getText()));
        double w = 0;
        double ans = 0;
   
        jTextArea20.setText("The inverse algorithm used here is not euclid's algo, rather it is one I came up with that is not\n as efficient\n\n");

        boolean exit = false;
		
        while(!exit)
        {
            w = y%z;
            if (w != 0)
            {
                y = z;
                z = w;
            }
            else
            {
                exit = true;
                ans = z;
            }
        }

//        System.out.println("gcd is " + ans);
        jTextArea20.append("gcd is " + ans + "\n");

        if (ans==1)
        {
            y = Double.parseDouble(jTextField10.getText());
            z = Double.parseDouble(jTextField9.getText());

            for (int x = 1; x <= y; x++)
            {
                w = ((-(y*x-1)/z));
                w = (w + ((int)(-w/y) + 1)*y);
                if (w-((int)w)==0)
                {
//                    System.out.println("The inverse is " + w);
                    jTextArea20.append("The inverse is " + w + "\n");
                    break;
                }
            }
        }
        else 
        {
//            System.out.println("There is no inverse, sorry");
            jTextArea20.append("There is no inverse, sorry\n");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTextArea9.setText("");
        
        String inputString = formatString(jTextArea1);

        int numRows = ((Integer)jSpinner9.getValue()).intValue();
        String sArray[] = new String[numRows];
        
        for (int x = 0; x < numRows; x++)
        {
            sArray[x] = "";
        }
        
        for (int x = 0; x < inputString.length(); x++)
        {
            sArray[x%numRows] = sArray[x%numRows] + inputString.charAt(x);
        }
        
        jTable7.setModel(new javax.swing.table.DefaultTableModel(numRows, sArray[0].length()));
     
        jTable7.setRowSelectionAllowed(false);
        
        for (int x = 0; x < sArray.length; x++)
        {
            for (int y = 0; y < sArray[x].length(); y++)
            {
                jTable7.setValueAt(new Character(sArray[x].charAt(y)), x, y);
            }
        }        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String inputString = formatString(jTextArea1);
        String outputString = "";
        double friedman = 0.0;
        
        if (inputString.length()%2!=0)
        {
            JOptionPane.showMessageDialog(null, 
                    "Please input a message with an even number of characters", 
                    "Warning",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        char array[] = new char[inputString.length()];
        char array2[] = new char[inputString.length()];
        
        for (int x = 0; x < array.length; x++) array[x] = (char)(inputString.charAt(x)-'A' + 1);
        
        System.out.println("");
        
        for (int q = 1; q <= 26; q++)
        {
            for (int w = 1; w <= 26; w++)
            {
                for (int e = 1; e <= 26; e++)
                {
                    for (int r = 1; r <= 26; r++)
                    {
                        for (int x = 0; x < array.length; x = x + 2)
                        {
                            array2[x] = (char)((q * array[x] + 
                                w * array[x+1])%26);
                            array2[x+1] = (char)((e * array[x] + 
                                r * array[x+1])%26);            
                        }
                        for (int x = 0; x < array.length; x++)
                        {
                            if (array2[x] == 0) array2[x] = 26;
                            array2[x] = (char)(array2[x]+'A' - 1);        
                        }
        
                        outputString = new String(array2);
                        friedman = calculateFriedman(outputString);
                        if (friedman >= Double.parseDouble(jTextField8.getText()))
                            jTextArea19.append("" + friedman + " = " + 
                            q + ", " + w + ", " + e + ", " + r + " = " + 
                            outputString + "\n");                        
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String inputString = formatString(jTextArea1);
        String outputString = "";
        String s1 = "";
        String finish = "";
        double friedman = 0.0;
        char array[] = new char[((Integer)jSpinner8.getValue()).intValue()];

        jTextArea18.setText("");
        
        for (int x = 0; x < ((Integer)jSpinner8.getValue()).intValue(); x++)
        {
            s1 = s1 + "A";
            finish = finish + "Z";
            array[x] = 'A';
        }

        
        while(!s1.equals(finish))
        {
            for (int x = 0; x < inputString.length(); x++)
            {
                for (int y = 0; y < 26; y++) 
                {
                    if(((String)jTable6.getValueAt(s1.charAt(x%s1.length())-'A', y)).equals((new Character(inputString.charAt(x))).toString())) 
                        outputString = outputString + jTable6.getColumnName(y);
                }
            }
            outputString = outputString.toUpperCase();
            friedman = calculateFriedman(outputString);
            if (friedman >= Double.parseDouble(jTextField7.getText())) jTextArea18.append("Key = " + s1 + ", friedman = " + friedman + ", pt = " + outputString + "\n");
            
            array[0]++;
            
            for (int x = 0; x < array.length; x++)
            {
                if (array[x] >= 'Z'+1) {array[x] = 'A'; if ((x+1) < array.length) array[x+1]++;}
            }
            
            s1 = new String(array);
            outputString = "";
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private double calculateFriedman(String inputString)
    {
        String tempString;
        double array[] = new double[256];
        double friedman = 0;
        int spinnerValue = 1;
        
        for (int z = 0; z < spinnerValue; z++)
        {
            tempString = "";
            friedman = 0;
            
            for (int x = 0; x < inputString.length(); x++)
            {
                if ((x-z%spinnerValue)%spinnerValue==0) tempString = tempString + inputString.charAt(x);
            }
        
            for (int x = 0; x < 256; x++)
                array[x] = 0;
        
            for (int x = 0; x < tempString.length(); x++)
            {
                for (char y = 'A'; y <= 'Z'; y++)
                {
                    if (tempString.charAt(x) == y) array[y]++;
                }
            }
            for (char x = 'A'; x <= 'Z'; x++)
            {
                friedman += array[x]/tempString.length() * ((array[x]-1)/(tempString.length()-1));
            }
        
            return friedman;
        }        
        return friedman;
    }
    
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String inputString = formatString(jTextArea1);
        String outputString = "";
        String s1 = formatString(jTextField6);
        char charArray[];
        
        if (!jCheckBox2.isSelected())
        {
            s1 = s1 + inputString;
            
            for (int x = 0; x < inputString.length(); x++)
            {
                for (int y = 0; y < 26; y++) 
                {
                    if(((String)jTable5.getValueAt(s1.charAt(x%s1.length())-'A', y)).equals((new Character(inputString.charAt(x))).toString())) 
                        outputString = outputString + jTable5.getColumnName(y);
                }
            }
            
            charArray = new char[outputString.length() + ((outputString.length()-1)/5)];
            
            for (int x = 0, y = 0; x < outputString.length(); x++, y++)
            {
                charArray[y] = outputString.charAt(x);
                if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
            }
        }
        else
        {
            for (int x = 0; x < inputString.length(); x++)
            {
                for (int y = 0; y < 26; y++) 
                {
                    if(((String)jTable5.getValueAt(s1.charAt(x%s1.length())-'A', y)).equals((new Character(inputString.charAt(x))).toString())) 
                        outputString = outputString + jTable5.getColumnName(y);
                }
                s1 = s1 + outputString.charAt(x);
                s1 = s1.toUpperCase();
            }
            
            charArray = new char[outputString.length() + ((outputString.length()-1)/5)];
            
            for (int x = 0, y = 0; x < outputString.length(); x++, y++)
            {
                charArray[y] = outputString.charAt(x);
                if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
            }            
        }
            
        jTextArea17.setText(new String(charArray));
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jSpinner7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner7StateChanged
        JSpinner js = (JSpinner)evt.getSource();
        
        if (((Integer)js.getValue()).intValue() < 1) js.setValue(new Integer(1));
    }//GEN-LAST:event_jSpinner7StateChanged

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
/* possibilities for letter 1 of keyword
 * n key length = 5 fieldman rating 0.50
 * possibilities for letter 2 of keyword
 * 0 key length = 5 fieldman rating 0.55
 */

        String inputString = formatString(jTextArea1);
        String outputString = "";
        String s1 = "";
        String tempString = "";
        double array[] = new double[256];
        double friedman = 0;        
        
        int js = ((Integer)jSpinner7.getValue()).intValue();
        double friedman_cutoff_low = Double.parseDouble(jTextField4.getText());
        double friedman_cutoff_hi = Double.parseDouble(jTextField5.getText());

        int x, z, t, w;
        char y;
        
        jTextArea16.setText("");
        
        for (x = 0; x < js; x++)
        {
            for (y = 'A'; y<='Z'; y++)
            {
                for (z = 1; z <= js; z++)
                {
                    s1 = "";
                    tempString = "";
                    outputString = "";
                    friedman = 0;

                    for ( t = x; t < inputString.length(); t++)
                    {
                        if ((t-x)%z==0) tempString = tempString + inputString.charAt(t);
                    }                    
                    
                    
                    
                    s1 = "" + y;
                    for (t = 0; t < tempString.length(); t++)
                    {
                        for (w = 0; w < 26; w++) 
                        {
                            if(((String)jTable5.getValueAt(s1.charAt(t%s1.length())-'A', w)).equals((new Character(tempString.charAt(t))).toString())) 
                                outputString = outputString + jTable5.getColumnName(w);
                        }
                        s1 = s1 + outputString.charAt(t);
                        s1 = s1.toUpperCase();
                    }
                    
                    System.out.println(s1);
                    System.out.println(outputString);
                    System.out.println();
                    
                    
                    
                    outputString = outputString.toUpperCase();

                    for (t = 0; t < 256; t++)
                        array[t] = 0;   
        
                    for (t = 0; t < outputString.length(); t++)
                    {
                        for (char c = 'A'; c <= 'Z'; c++)
                        {
                            if (outputString.charAt(t) == c) array[c]++;
                        }
                    }
                    for (char c = 'A'; c <= 'Z'; c++)
                    {
                        friedman += array[c]/outputString.length() * ((array[c]-1)/(outputString.length()-1));
                    }        
                    
                    
                    if(friedman >= friedman_cutoff_low && friedman <= friedman_cutoff_hi)
                    {
                        //print this possibility;
                        //jTextArea16.append("\n\nFriedman value = " + friedman);;        
                        jTextArea16.append("Possibilities for letter  " + (x+1) + "  of keyword  ");
                        jTextArea16.append("" + y + "  keylength =  " + z + "  friedman =  " + friedman + "\n");
                    }
                }
            }
        }        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jSpinner6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6StateChanged
        JSpinner js = (JSpinner)evt.getSource();
        
        if (((Integer)js.getValue()).intValue() < 0) js.setValue(new Integer(0));
    }//GEN-LAST:event_jSpinner6StateChanged

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String inputString = formatString(jTextArea1);
        String outputString = "";
        String s1 = "";
        double array[] = new double[256];
        double friedman = 0;        
        
        for (int x = 0; x < ((Integer)jSpinner6.getValue()).intValue(); x++)
        {
            s1 = s1 + "A";
        }
        
        s1 = s1 + inputString;

        for (int x = 0; x < inputString.length(); x++)
        {
            for (int y = 0; y < 26; y++) 
            {
                if(((String)jTable3.getValueAt(s1.charAt(x%s1.length()     )-'A', y)).equals((new Character(inputString.charAt(x))).toString())) 
                    outputString = outputString + jTable3.getColumnName(y);
            }
        }
      
        char charArray[] = new char[outputString.length() + ((outputString.length()-1)/5)];
        
        for (int x = 0, y = 0; x < outputString.length(); x++, y++)
        {
            charArray[y] = outputString.charAt(x);
            if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
        }
        
        jTextArea15.setText(new String(charArray));
        
        outputString = outputString.toUpperCase();
        
        for (int x = 0; x < 256; x++)
            array[x] = 0;   
        
        for (int x = 0; x < outputString.length(); x++)
        {
            for (char y = 'A'; y <= 'Z'; y++)
            {
                if (outputString.charAt(x) == y) array[y]++;
            }
        }
        for (char x = 'A'; x <= 'Z'; x++)
        {
            friedman += array[x]/outputString.length() * ((array[x]-1)/(outputString.length()-1));
        }        
        jTextArea15.append("\n\nFriedman value = " + friedman);;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String inputString = formatString(jTextArea1);
        String outputString = "";
        String s1 = formatString(jTextField3);

        for (int x = 0; x < inputString.length(); x++)
        {
            for (int y = 0; y < 26; y++) 
            {
                if(((String)jTable2.getValueAt(s1.charAt(x%s1.length())-'A', y)).equals((new Character(inputString.charAt(x))).toString())) 
                    outputString = outputString + jTable2.getColumnName(y);
            }
        }
      
        char charArray[] = new char[outputString.length() + ((outputString.length()-1)/5)];
        
        for (int x = 0, y = 0; x < outputString.length(); x++, y++)
        {
            charArray[y] = outputString.charAt(x);
            if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
        }
        
        jTextArea14.setText(new String(charArray));
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String inputString = formatString(jTextArea1);
        String outputString = "";
        String s1 = formatString(jTextField2);
        
        for (int x = 0; x < inputString.length(); x++)
        {
            outputString = outputString + ((String)jTable1.getValueAt(s1.charAt(x%s1.length())-'A', inputString.charAt(x)-'A'));
        }

        char charArray[] = new char[outputString.length() + ((outputString.length()-1)/5)];
        
        for (int x = 0, y = 0; x < outputString.length(); x++, y++)
        {
            charArray[y] = outputString.charAt(x);
            if ((x+1)%5 == 0 && (x+1)!= outputString.length()) charArray[++y] = ' ';
        }
        
        jTextArea13.setText(new String(charArray));        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        String inputString = formatString(jTextArea1);
        int js = ((Integer)jSpinner5.getValue()).intValue();

        String tempString;
        Counter counter = new Counter();
        
        for (int x = 0; x < inputString.length() - (js - 1); x++)
        {
            tempString = inputString.substring(x, x+js);
            if (inputString.indexOf(tempString, x)>=0)
            {
                if (!counter.contains(tempString))
                {
                    counter.add(tempString, x);
                    for (int y = x; y >= 0;)
                    {
                        if ((y = inputString.indexOf(tempString, y+js)) >= 0) counter.inc(y);
                    }
                }
            }
        }
        
        jTextArea12.setText("");
        
        for (int x = 0; x < counter.length; x++)
        {
            jTextArea12.append(counter.sArray[x]);
            jTextArea12.append(" = ");
            jTextArea12.append(new Integer(counter.iArray[x]).toString());
            jTextArea12.append(" at positions ");
            for (int y = 0; y < counter.iArray[x]; y++)
            {
                jTextArea12.append("" + counter.pArray[x][y]);
                if (y!=counter.iArray[x] - 1)
                    jTextArea12.append(",");
            }
            jTextArea12.append("\n");
        }        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String inputString = formatString(jTextArea1);
        String tempString;
        double array[] = new double[256];
        double friedman = 0;
        int spinnerValue = ((Integer)jSpinner4.getValue()).intValue();
        
        jTextArea11.setText(".065 = Monoalphabetic, .038 means polyalphabetic.  I'll add some bar graphs in the future.\n\n");
        
        for (int z = 0; z < spinnerValue; z++)
        {
            tempString = "";
            friedman = 0;
            
            for (int x = 0; x < inputString.length(); x++)
            {
                if ((x-z%spinnerValue)%spinnerValue==0) tempString = tempString + inputString.charAt(x);
            }
        
            for (int x = 0; x < 256; x++)
                array[x] = 0;
        
            for (int x = 0; x < tempString.length(); x++)
            {
                for (char y = 'A'; y <= 'Z'; y++)
                {
                    if (tempString.charAt(x) == y) array[y]++;
                }
            }
            for (char x = 'A'; x <= 'Z'; x++)
            {
                friedman += array[x]/tempString.length() * ((array[x]-1)/(tempString.length()-1));
            }
        
            jTextArea11.append("" + friedman + "\n");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        JSpinner js = (JSpinner)evt.getSource();
        
        if (((Integer)js.getValue()).intValue() < 1) js.setValue(new Integer(1));
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextArea9.setText("");
        
        String inputString = formatString(jTextArea1);

        int wordLength = ((Integer)jSpinner3.getValue()).intValue();
        String sArray[] = new String[wordLength];
        
        for (int x = 0; x < wordLength; x++)
        {
            sArray[x] = "";
        }
        
        for (int x = 0; x < inputString.length(); x++)
        {
            sArray[x%wordLength] = sArray[x%wordLength] + inputString.charAt(x);
        }
        
        for (int x = 0; x < sArray.length; x++)
        {
            jTextArea9.append(sArray[x] + "\n");
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jPanel17ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel17ComponentShown
        jScrollPane10.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jPanel17ComponentShown

    private void jTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaKeyReleased
        if (evt.isControlDown())
        {
            if (evt.getKeyCode()==evt.VK_F)
            {
                performSearch((JTextArea)evt.getSource());
            }
            else if (evt.getKeyCode()==evt.VK_G)
            {
                performSearchAgain((JTextArea)evt.getSource());
            }
        }
    }//GEN-LAST:event_jTextAreaKeyReleased
    private void performSearch(JTextArea j)
    {
            Caret c = j.getCaret();
            String str = j.getText();
            str = str.toUpperCase();
            searchStr = JOptionPane.showInputDialog("Please input a string to search for.", searchStr);
            searchStr = searchStr.toUpperCase();
            int x = str.indexOf(searchStr, c.getDot());
            c.setDot(x);
            if(x>=0)
            {
                c.moveDot(c.getDot() + searchStr.length());
                c.setSelectionVisible(true);
            }            
    }
    private void performSearchAgain(JTextArea j)
    {
            Caret c = j.getCaret();
            String str = j.getText();
            str = str.toUpperCase();
            int x = str.indexOf(searchStr, c.getDot());
            c.setDot(x);
            if(x>=0)
            {
                c.moveDot(c.getDot() + searchStr.length());
                c.setSelectionVisible(true);
            }            
    }
    private void jTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaMouseClicked
        if (evt.getButton()==evt.BUTTON3)
        {
            jPopupMenu1.show((JTextArea)evt.getSource(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTextAreaMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        performSearchAgain((JTextArea)((JPopupMenu)((JMenuItem)evt.getSource()).getParent()).getInvoker());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        performSearch((JTextArea)((JPopupMenu)((JMenuItem)evt.getSource()).getParent()).getInvoker());
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ((JTextArea)((JPopupMenu)((JMenuItem)evt.getSource()).getParent()).getInvoker()).paste();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ((JTextArea)((JPopupMenu)((JMenuItem)evt.getSource()).getParent()).getInvoker()).copy();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        JSpinner js = (JSpinner)evt.getSource();
        
        if (((Integer)js.getValue()).intValue() < 0) js.setValue(new Integer(0));
        if (((Integer)js.getValue()).intValue() > 25) js.setValue(new Integer(25));        
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        JSpinner js = (JSpinner)evt.getSource();
        
        if (((Integer)js.getValue()).intValue() < 0) js.setValue(new Integer(0));
        if (((Integer)js.getValue()).intValue() > 25) js.setValue(new Integer(25));        
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int m = 0;
        String inputString = formatString(jTextArea1);
        
        jTextArea8.setText("");
        
        char[] charArray = inputString.toCharArray();

        if (jRadioButton13.isSelected()) m = 1;
        else if (jRadioButton14.isSelected()) m = 9;
        else if (jRadioButton15.isSelected()) m = 21;
        else if (jRadioButton16.isSelected()) m = 15;
        else if (jRadioButton17.isSelected()) m = 3;
        else if (jRadioButton18.isSelected()) m = 19;
        else if (jRadioButton19.isSelected()) m = 7;
        else if (jRadioButton20.isSelected()) m = 23;
        else if (jRadioButton21.isSelected()) m = 11;
        else if (jRadioButton22.isSelected()) m = 5;
        else if (jRadioButton23.isSelected()) m = 17;
        else if (jRadioButton24.isSelected()) m = 25;
        
        for (int x = 0; x < inputString.length(); x++)
        {
            charArray[x] = (char)(charArray[x] - 64);
            charArray[x] = (char)((charArray[x] + (26-((Integer)(jSpinner2.getValue())).intValue()))%26);
            charArray[x] = (char)((charArray[x] * m)%26);
            if (charArray[x] == 0) charArray[x] = (char)26;
            charArray[x] = (char)(charArray[x] + 64);
        }
        
        char charArray2[] = new char[charArray.length + ((charArray.length-1)/5)];
        
        for (int x = 0, y = 0; x < charArray.length; x++, y++)
        {
            charArray2[y] = charArray[x];
            if ((x+1)%5 == 0 && (x+1)!= charArray.length) charArray2[++y] = ' ';
        }
        
        jTextArea8.append(new String(charArray2));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
/*
 *Write an affine solver that will look for occurences of all 312 combinations of a known piece of plaintext all the occurences & display the keys that were used
 *{
 *take out spaces
 *outer if that will detect whether the checkbox was checked & take the appropriate action.
 *two for loops to iterate through the combinations
 *inner for loop will use same ago used for trigraph in regards finding occurences
 *}
 *
 *make some tally bars in places where it would be useful to get information at a glance.
 */
        String inputString = formatString(jTextArea1);
        String searchString = formatString(jTextField1);
        
        jTextArea6.setText("The following are all the possible combinations of \"" + searchString + "\"\n");
        jTextArea6.append("which are contained in the cyphertext message and the affine\n");
        jTextArea6.append("keys used to encrypt them.\n\n");
        
        if (!jCheckBox1.isSelected())
        {
            searchCeasar(1, inputString, searchString);
            searchCeasar(3, inputString, searchString);
            searchCeasar(5, inputString, searchString);
            searchCeasar(7, inputString, searchString);
            searchCeasar(9, inputString, searchString);
            searchCeasar(11, inputString, searchString);
            searchCeasar(15, inputString, searchString);
            searchCeasar(17, inputString, searchString);
            searchCeasar(19, inputString, searchString);
            searchCeasar(21, inputString, searchString);
            searchCeasar(23, inputString, searchString);
            searchCeasar(25, inputString, searchString);
        }
        else
        {
            searchCeasarReverse(1, inputString, searchString);
            searchCeasarReverse(3, inputString, searchString);
            searchCeasarReverse(5, inputString, searchString);
            searchCeasarReverse(7, inputString, searchString);
            searchCeasarReverse(9, inputString, searchString);
            searchCeasarReverse(11, inputString, searchString);
            searchCeasarReverse(15, inputString, searchString);
            searchCeasarReverse(17, inputString, searchString);
            searchCeasarReverse(19, inputString, searchString);
            searchCeasarReverse(21, inputString, searchString);
            searchCeasarReverse(23, inputString, searchString);
            searchCeasarReverse(25, inputString, searchString);            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchCeasar(int m, String inputString, String searchString)
    {
        int counter;
        String mSearchString;
        char[] charArray;
        
            for (int x = 0; x < 25; x++)
            {
                charArray = searchString.toCharArray(); 
                for (int y = 0; y < charArray.length; y++) 
                {
                    charArray[y] = (char)(charArray[y] - 64);
                    charArray[y] = (char)((charArray[y] * m)%26);
                    charArray[y] = (char)((charArray[y] + x)%26);
                    if (charArray[y] == 0) charArray[y] = (char)26;
                    charArray[y] = (char)(charArray[y] + 64);                    
                }
                mSearchString = new String(charArray);
                // insert code that now searches using the content of mSearchString
                
                counter = 0;
                if (inputString.indexOf(mSearchString, 0)==0) counter++;
                for (int y = 0; y >= 0;)
                {
                    if ((y = inputString.indexOf(mSearchString, y+1)) >= 0) counter++;
                }  
                if (counter > 0)
                {
                    jTextArea6.append(mSearchString + " appears " + counter + " times with a ");
                    jTextArea6.append("multiplicative key = " + m + " and an additive key = " + x);
                    jTextArea6.append("\n");
                }
            }
    }

    private void searchCeasarReverse(int m, String inputString, String searchString)
    {
        int counter;
        String mSearchString;
        char[] charArray;
            for (int x = 0; x < 25; x++)
            {
                charArray = searchString.toCharArray(); 
                for (int y = 0; y < charArray.length; y++) 
                {
                    charArray[y] = (char)(charArray[y] - 64);
                    charArray[y] = (char)((charArray[y] + x)%26);
                    charArray[y] = (char)((charArray[y] * m)%26);
                    if (charArray[y] == 0) charArray[y] = (char)26;
                    charArray[y] = (char)(charArray[y] + 64);                    
                }
                mSearchString = new String(charArray);
                // insert code that now searches using the content of mSearchString
                
                counter = 0;
                if (inputString.indexOf(mSearchString, 0)==0) counter++;
                for (int y = 0; y >= 0;)
                {
                    if ((y = inputString.indexOf(mSearchString, y+1)) >= 0) counter++;
                }                
                if (counter > 0)
                {
                    jTextArea6.append(mSearchString + " appears " + counter + " times with a ");
                    jTextArea6.append("multiplicative key = " + m + " and an additive key = " + x);
                    jTextArea6.append("\n");
                }
            }
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int m = 0;
        String inputString = formatString(jTextArea1);
        
        jTextArea7.setText("");
        
        char[] charArray = inputString.toCharArray();

        if (jRadioButton1.isSelected()) m = 1;
        else if (jRadioButton2.isSelected()) m = 3;
        else if (jRadioButton3.isSelected()) m = 5;
        else if (jRadioButton4.isSelected()) m = 7;
        else if (jRadioButton5.isSelected()) m = 9;
        else if (jRadioButton6.isSelected()) m = 11;
        else if (jRadioButton7.isSelected()) m = 15;
        else if (jRadioButton8.isSelected()) m = 17;
        else if (jRadioButton9.isSelected()) m = 19;
        else if (jRadioButton10.isSelected()) m = 21;
        else if (jRadioButton11.isSelected()) m = 23;
        else if (jRadioButton12.isSelected()) m = 25;
        
        for (int x = 0; x < inputString.length(); x++)
        {
            charArray[x] = (char)(charArray[x] - 64);
            charArray[x] = (char)((charArray[x] * m)%26);
            charArray[x] = (char)((charArray[x] + ((Integer)(jSpinner1.getValue())).intValue())%26);
            if (charArray[x] == 0) charArray[x] = (char)26;
            charArray[x] = (char)(charArray[x] + 64);
        }
        
        char charArray2[] = new char[charArray.length + ((charArray.length-1)/5)];
        
        for (int x = 0, y = 0; x < charArray.length; x++, y++)
        {
            charArray2[y] = charArray[x];
            if ((x+1)%5 == 0 && (x+1)!= charArray.length) charArray2[++y] = ' ';
        }
        
        jTextArea7.append(new String(charArray2));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String inputString = formatString(jTextArea1);
        String tempString;
        Counter counter = new Counter();
        
        for (int x = 0; x < inputString.length() - 1; x++)
        {
            tempString = inputString.substring(x, x+2);
            if (inputString.indexOf(tempString, x)>=0)
            {
                if (!counter.contains(tempString))
                {
                    counter.add(tempString, x);
                    for (int y = x; y >= 0;)
                    {
                        if ((y = inputString.indexOf(tempString, y+2)) >= 0) counter.inc(y);
                    }
                }
            }
        }
        
        jTextArea4.setText("");
        
        for (int x = 0; x < counter.length; x++)
        {
            jTextArea4.append(counter.sArray[x]);
            jTextArea4.append(" = ");
            jTextArea4.append(new Integer(counter.iArray[x]).toString());
            jTextArea4.append(" at positions ");
            for (int y = 0; y < counter.iArray[x]; y++)
            {
                jTextArea4.append("" + counter.pArray[x][y]);
                if (y!=counter.iArray[x] - 1)
                    jTextArea4.append(",");
            }
            jTextArea4.append("\n");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String inputString = formatString(jTextArea1);

        String tempString;
        Counter counter = new Counter();
        
        for (int x = 0; x < inputString.length() - 2; x++)
        {
            tempString = inputString.substring(x, x+3);
            if (inputString.indexOf(tempString, x)>=0)
            {
                if (!counter.contains(tempString))
                {
                    counter.add(tempString, x);
                    for (int y = x; y >= 0;)
                    {
                        if ((y = inputString.indexOf(tempString, y+3)) >= 0) counter.inc(y);
                    }
                }
            }
        }
        
        jTextArea5.setText("");
        
        for (int x = 0; x < counter.length; x++)
        {
            jTextArea5.append(counter.sArray[x]);
            jTextArea5.append(" = ");
            jTextArea5.append(new Integer(counter.iArray[x]).toString());
            jTextArea5.append(" at positions ");
            for (int y = 0; y < counter.iArray[x]; y++)
            {
                jTextArea5.append("" + counter.pArray[x][y]);
                if (y!=counter.iArray[x] - 1)
                    jTextArea5.append(",");
            }
            jTextArea5.append("\n");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String inputString = jTextArea1.getText();
        inputString = inputString.toLowerCase();
        
        jTextArea3.setText("");
        
        for (int x = 0; x < 25; x++)
        {
            for (int y = 0; y < inputString.length(); y++)
            {
                //jTextArea4.append(new Character((char)(inputString.charAt(y)+x)).toString());
                if (inputString.charAt(y) >='a' && inputString.charAt(y) <= 'z')
                {
                    jTextArea3.append(new Character((char)((inputString.charAt(y)+x)%('z'+1)+((int)((inputString.charAt(y)+x)/('z'+1))*'a'))).toString());
                }
                else jTextArea3.append(" ");
            }
            jTextArea3.append("\n");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String inputString = jTextArea1.getText();
        inputString = inputString.toUpperCase();
        int array[] = new int[26];
        String sArray[];
        
        jTextArea2.setText("");
        
        for (int x = 0; x < inputString.length(); x++)
        {
            switch (inputString.charAt(x))
            {
                case 'A': array[0]++; break;
                case 'B': array[1]++; break;
                case 'C': array[2]++; break;
                case 'D': array[3]++; break;
                case 'E': array[4]++; break;
                case 'F': array[5]++; break;
                case 'G': array[6]++; break;
                case 'H': array[7]++; break;
                case 'I': array[8]++; break;
                case 'J': array[9]++; break;
                case 'K': array[10]++; break;
                case 'L': array[11]++; break;
                case 'M': array[12]++; break;
                case 'N': array[13]++; break;
                case 'O': array[14]++; break;
                case 'P': array[15]++; break;
                case 'Q': array[16]++; break;
                case 'R': array[17]++; break;
                case 'S': array[18]++; break;
                case 'T': array[19]++; break;
                case 'U': array[20]++; break;
                case 'V': array[21]++; break;
                case 'W': array[22]++; break;
                case 'X': array[23]++; break;
                case 'Y': array[24]++; break;
                case 'Z': array[25]++; break;               
            }
        }
        
        for (int x = 0; x < 26; x++)
        {
            jTextArea2.append(new Character((char)('A'+x)).toString());
            jTextArea2.append(" = ");
            jTextArea2.append(new Integer(array[x]).toString());
            jTextArea2.append(" = ");
            for (int y = 0; y<array[x]; y++)
                jTextArea2.append("I");
            if (x!=25) jTextArea2.append("\n");
        }
        
        jTextArea2.append("\n");

        sArray = inputString.split(" ");
        
        jTextArea2.append("\nHere are all the 1 letter words\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length() == 1) {jTextArea2.append(sArray[x]); jTextArea2.append("\n");}
        }
        
        jTextArea2.append("\nHere are all the 2 letter words\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length() == 2) {jTextArea2.append(sArray[x]); jTextArea2.append("\n");}
        }
        
        jTextArea2.append("\nHere are all the 3 letter words\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length() == 3) {jTextArea2.append(sArray[x]); jTextArea2.append("\n");}
        }
  
        jTextArea2.append("\nHere are all the initial letters\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length()>0)
                jTextArea2.append(new Character(sArray[x].charAt(0)).toString());
        }
        jTextArea2.append("\n");
        
        jTextArea2.append("\nHere are all the final letters\n");
        for (int x = 0; x < sArray.length; x++)
        {
            if (sArray[x].length()>0)
                jTextArea2.append(new Character(sArray[x].charAt(sArray[x].length()-1)).toString());
        }
        jTextArea2.append("\n");
        
        jTextArea2.append("\nHere are all the doubled letters\n");
        char c = inputString.charAt(0);
        for (int x = 1; x < inputString.length(); x++)
        {
            if (inputString.charAt(x) == c) 
            {
                jTextArea2.append(new Character(c).toString());
                jTextArea2.append(new Character(c).toString());
                jTextArea2.append("\n");
            }
            c = inputString.charAt(x);
        }
        
        jTextArea2.append("\nFrequencies for English\n");
        
        jTextArea2.append("a = 07 = IIIIIII                 n = 08 = IIIIIIII   \n");
        jTextArea2.append("b = 01 = I                       o = 07 = IIIIIII    \n");
        jTextArea2.append("c = 03 = III                     p = 03 = III        \n");
        jTextArea2.append("d = 04 = IIII                    q =                 \n");
        jTextArea2.append("e = 13 = IIIIIIIIIIIII           r = 08 = IIIIIIII   \n");
        jTextArea2.append("f = 03 = III                     s = 06 = IIIIII     \n");
        jTextArea2.append("g = 02 = II                      t = 09 = IIIIIIIII  \n");
        jTextArea2.append("h = 04 = IIII                    u = 03 = III        \n");
        jTextArea2.append("i = 07 = IIIIIII                 v = 01 = I          \n");
        jTextArea2.append("j =                              w = 02 = II         \n");
        jTextArea2.append("k =                              x =                 \n");
        jTextArea2.append("l = 04 = IIII                    y = 02 = II         \n");
        jTextArea2.append("m = 03 = III                     z =                 \n");
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CryptoHelper().setVisible(true);
            }
        });
    }
 
    private class Counter
    {
        public int length = 0;
        
        public String sArray[] = new String[10000];
        public int iArray[] = new int[10000];
        public int pArray[][] = new int[10000][100];
    
        public void add(String s, int pos)
        {
            sArray[length] = s;
            iArray[length] = 1;
            pArray[length][0] = pos;
            length++;
        }
        public boolean contains(String s)
        {
            for (int x = 0; x < length; x++)
            {
                if (sArray[x].equals(s)) return true;
            }
            return false;
        }
        public void inc(int pos)
        {
            iArray[length - 1]++;
            pArray[length - 1][iArray[length - 1]-1] = pos;
        }
    }
    
    private String formatString(JTextArea jta)
    {
        String inputString = jta.getText();
        inputString = inputString.toUpperCase();
        inputString = inputString.replace(',', ' ');
        inputString = inputString.replace('.', ' ');
        inputString = inputString.replace('?', ' ');
        inputString = inputString.replace('\"', ' ');
        inputString = inputString.replace('!', ' ');
        inputString = inputString.replace('@', ' ');
        inputString = inputString.replace('#', ' ');
        inputString = inputString.replace('$', ' ');
        inputString = inputString.replace('%', ' ');
        inputString = inputString.replace('^', ' ');
        inputString = inputString.replace('&', ' ');
        inputString = inputString.replace('*', ' ');
        inputString = inputString.replace('(', ' ');
        inputString = inputString.replace(')', ' ');
        inputString = inputString.replace('-', ' ');
        inputString = inputString.replace('+', ' ');
        inputString = inputString.replace('/', ' ');
        inputString = inputString.replace('\\', ' ');
        inputString = inputString.replace('<', ' ');
        inputString = inputString.replace('>', ' ');
        inputString = inputString.replace('\'', ' ');
        inputString = inputString.replace('~', ' ');
        inputString = inputString.replace('`', ' ');
        inputString = inputString.replace('[', ' ');
        inputString = inputString.replace(']', ' ');
        inputString = inputString.replace('|', ' ');
        inputString = inputString.replace('{', ' ');
        inputString = inputString.replace('}', ' ');
        inputString = inputString.replace('=', ' ');
        inputString = inputString.replace(':', ' ');
        inputString = inputString.replace(';', ' ');
        inputString = inputString.replace('0', ' ');
        inputString = inputString.replace('1', ' ');
        inputString = inputString.replace('2', ' ');
        inputString = inputString.replace('3', ' ');
        inputString = inputString.replace('4', ' ');
        inputString = inputString.replace('5', ' ');
        inputString = inputString.replace('6', ' ');
        inputString = inputString.replace('7', ' ');
        inputString = inputString.replace('8', ' ');
        inputString = inputString.replace('9', ' ');
        inputString = inputString.replaceAll(" ", "");
        inputString = inputString.replaceAll("\n", "");
        return inputString;
    }

    private String formatString(JTextField jtf)
    {
        String inputString = jtf.getText();
        inputString = inputString.toUpperCase();
        inputString = inputString.replace(',', ' ');
        inputString = inputString.replace('.', ' ');
        inputString = inputString.replace('?', ' ');
        inputString = inputString.replace('\"', ' ');
        inputString = inputString.replace('!', ' ');
        inputString = inputString.replace('@', ' ');
        inputString = inputString.replace('#', ' ');
        inputString = inputString.replace('$', ' ');
        inputString = inputString.replace('%', ' ');
        inputString = inputString.replace('^', ' ');
        inputString = inputString.replace('&', ' ');
        inputString = inputString.replace('*', ' ');
        inputString = inputString.replace('(', ' ');
        inputString = inputString.replace(')', ' ');
        inputString = inputString.replace('-', ' ');
        inputString = inputString.replace('+', ' ');
        inputString = inputString.replace('/', ' ');
        inputString = inputString.replace('\\', ' ');
        inputString = inputString.replace('<', ' ');
        inputString = inputString.replace('>', ' ');
        inputString = inputString.replace('\'', ' ');
        inputString = inputString.replace('~', ' ');
        inputString = inputString.replace('`', ' ');
        inputString = inputString.replace('[', ' ');
        inputString = inputString.replace(']', ' ');
        inputString = inputString.replace('|', ' ');
        inputString = inputString.replace('{', ' ');
        inputString = inputString.replace('}', ' ');
        inputString = inputString.replace('=', ' ');
        inputString = inputString.replace(':', ' ');
        inputString = inputString.replace(';', ' ');
        inputString = inputString.replace('0', ' ');
        inputString = inputString.replace('1', ' ');
        inputString = inputString.replace('2', ' ');
        inputString = inputString.replace('3', ' ');
        inputString = inputString.replace('4', ' ');
        inputString = inputString.replace('5', ' ');
        inputString = inputString.replace('6', ' ');
        inputString = inputString.replace('7', ' ');
        inputString = inputString.replace('8', ' ');
        inputString = inputString.replace('9', ' ');
        inputString = inputString.replaceAll(" ", "");
        inputString = inputString.replaceAll("\n", "");
        return inputString;
    }    

    private String searchStr;
    private int dictionary[][][][];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JSplitPane jSplitPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    
}
