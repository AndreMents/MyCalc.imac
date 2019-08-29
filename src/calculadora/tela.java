/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author @Andre_Ments - /19
 */
public class tela extends javax.swing.JFrame {

    /**
     * Creates new form tela
     */
    public tela() {
        //TELA INICIAL

        //Não Visivel
        initComponents();
        altura.setVisible(false);
        taltura.setVisible(false);
        largura.setVisible(false);
        tlargura.setVisible(false);
        comprimento.setVisible(false);
        diametroint.setVisible(false);
        tdiametroint.setVisible(false);
        bedame.setVisible(false);
        mm2.setVisible(false);
        medidabedame.setVisible(false);

        // Visivel
        dimensao.setVisible(true);
        tdimensao.setVisible(true);
        comprimento.setVisible(true);
        tcomprimento.setVisible(true);
        qbarras.setVisible(true);
        tqbarras.setVisible(true);
        resultado.setVisible(true);
        tresultado.setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculo = new javax.swing.ButtonGroup();
        selectbedame = new javax.swing.ButtonGroup();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        dimensao = new javax.swing.JTextField();
        comprimento = new javax.swing.JTextField();
        qbarras = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tdimensao = new javax.swing.JLabel();
        tcomprimento = new javax.swing.JLabel();
        tqbarras = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tresultado = new javax.swing.JLabel();
        rbredonda = new javax.swing.JRadioButton();
        rbsext = new javax.swing.JRadioButton();
        rbquad = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        taltura = new javax.swing.JLabel();
        altura = new javax.swing.JTextField();
        tlargura = new javax.swing.JLabel();
        largura = new javax.swing.JTextField();
        btlimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rbtubo = new javax.swing.JRadioButton();
        tdiametroint = new javax.swing.JLabel();
        diametroint = new javax.swing.JTextField();
        pbedame = new javax.swing.JRadioButton();
        rbbedame = new javax.swing.JRadioButton();
        bedame = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kg1 = new javax.swing.JLabel();
        mm1 = new javax.swing.JLabel();
        mm2 = new javax.swing.JLabel();
        mm3 = new javax.swing.JLabel();
        un1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        medidabedame = new javax.swing.JLabel();
        infbedamequad = new javax.swing.JLabel();
        infbedame = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pesott = new javax.swing.JTextField();
        resultbarras = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        checkbarras = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        metrostotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lote = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCalculo = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        infseq = new javax.swing.JTextField();
        btexcluir = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        btlimpalista = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 195, 201));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Calc.Imac");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 23));

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 30));

        dimensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimensaoActionPerformed(evt);
            }
        });
        dimensao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dimensaoKeyReleased(evt);
            }
        });
        jPanel1.add(dimensao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 70, 30));

        comprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprimentoActionPerformed(evt);
            }
        });
        comprimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comprimentoKeyReleased(evt);
            }
        });
        jPanel1.add(comprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 30));

        qbarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qbarrasActionPerformed(evt);
            }
        });
        qbarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qbarrasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qbarrasKeyReleased(evt);
            }
        });
        jPanel1.add(qbarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel1.setText("Código do item");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        tdimensao.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        tdimensao.setText("Ø Externo");
        jPanel1.add(tdimensao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        tcomprimento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        tcomprimento.setText("Comprimento");
        jPanel1.add(tcomprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        tqbarras.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        tqbarras.setText("Nº Barras");
        jPanel1.add(tqbarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 20));

        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        jPanel1.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 90, 60));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, 50));

        tresultado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tresultado.setText("Resultado");
        jPanel1.add(tresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 100, -1));

        calculo.add(rbredonda);
        rbredonda.setSelected(true);
        rbredonda.setText("Redondas");
        rbredonda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbredondaMouseClicked(evt);
            }
        });
        rbredonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbredondaActionPerformed(evt);
            }
        });
        jPanel1.add(rbredonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        calculo.add(rbsext);
        rbsext.setText("Sextavadas");
        rbsext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbsextMouseClicked(evt);
            }
        });
        rbsext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsextActionPerformed(evt);
            }
        });
        jPanel1.add(rbsext, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        calculo.add(rbquad);
        rbquad.setText("Quad. Ret.");
        rbquad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbquadMouseClicked(evt);
            }
        });
        rbquad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbquadActionPerformed(evt);
            }
        });
        jPanel1.add(rbquad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 80, 40));

        taltura.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        taltura.setText("Altura");
        jPanel1.add(taltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                alturaKeyReleased(evt);
            }
        });
        jPanel1.add(altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 70, 30));

        tlargura.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        tlargura.setText("Largura");
        jPanel1.add(tlargura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 20));

        largura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                larguraKeyReleased(evt);
            }
        });
        jPanel1.add(largura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 30));

        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });
        btlimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btlimparKeyPressed(evt);
            }
        });
        jPanel1.add(btlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 70, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("By AO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        calculo.add(rbtubo);
        rbtubo.setText("Tubo");
        rbtubo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtuboMouseClicked(evt);
            }
        });
        rbtubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtuboActionPerformed(evt);
            }
        });
        jPanel1.add(rbtubo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        tdiametroint.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        tdiametroint.setText("Ø Interno");
        jPanel1.add(tdiametroint, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 90, 20));

        diametroint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diametrointKeyReleased(evt);
            }
        });
        jPanel1.add(diametroint, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 30));

        selectbedame.add(pbedame);
        pbedame.setSelected(true);
        pbedame.setText(" Padrão");
        pbedame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbedameActionPerformed(evt);
            }
        });
        jPanel1.add(pbedame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        selectbedame.add(rbbedame);
        rbbedame.setText("Informar");
        rbbedame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbedameActionPerformed(evt);
            }
        });
        jPanel1.add(rbbedame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        bedame.setText("3");
        jPanel1.add(bedame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 60, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel5.setText("Bedame");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        kg1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kg1.setText("Kg");
        jPanel1.add(kg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        mm1.setText("mm");
        jPanel1.add(mm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        mm2.setText("mm");
        jPanel1.add(mm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        mm3.setText("mm");
        jPanel1.add(mm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        un1.setText("Un");
        jPanel1.add(un1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Versão 1.19.1408 ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        medidabedame.setText("mm");
        jPanel1.add(medidabedame, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        infbedamequad.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(infbedamequad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 20, -1));

        infbedame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        infbedame.setText("= 3");
        jPanel1.add(infbedame, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 193, 20, 30));

        jPanel2.setBackground(new java.awt.Color(202, 217, 219));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel7.setText("Peso Total");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 40, 70, 21);

        pesott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesottActionPerformed(evt);
            }
        });
        pesott.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesottKeyPressed(evt);
            }
        });
        jPanel2.add(pesott);
        pesott.setBounds(10, 70, 60, 30);
        jPanel2.add(resultbarras);
        resultbarras.setBounds(120, 70, 60, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel8.setText("Nº Total Barras");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(100, 40, 104, 21);

        jLabel10.setText("Kg");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(70, 90, 40, 20);

        jLabel9.setText("Un");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(180, 90, 30, 14);

        checkbarras.setText("Calcular Número Total de Barras");
        checkbarras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkbarrasMouseClicked(evt);
            }
        });
        jPanel2.add(checkbarras);
        checkbarras.setBounds(10, 10, 210, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("=");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(90, 70, 20, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel11.setText("Medida Total");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(220, 40, 100, 20);

        metrostotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metrostotalActionPerformed(evt);
            }
        });
        jPanel2.add(metrostotal);
        metrostotal.setBounds(220, 70, 80, 30);

        jLabel12.setText("mm");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(300, 90, 30, 14);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 340, 110));

        jPanel3.setBackground(new java.awt.Color(202, 217, 219));
        jPanel3.setLayout(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(-10, -40, 350, 40);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel4.setText("Número do Lote");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(170, 50, 112, 21);

        lote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loteKeyReleased(evt);
            }
        });
        jPanel3.add(lote);
        lote.setBounds(170, 80, 150, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 340, 120));

        jPanel5.setBackground(new java.awt.Color(202, 217, 219));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel14.setText("Resultados");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        listaCalculo.setColumns(20);
        listaCalculo.setRows(5);
        jScrollPane1.setViewportView(listaCalculo);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 320));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel15.setText("Informe a Sequência Para Excluir");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        infseq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infseqActionPerformed(evt);
            }
        });
        infseq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                infseqKeyReleased(evt);
            }
        });
        jPanel5.add(infseq, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 70, 30));

        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });
        jPanel5.add(btexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 70, 30));

        bteditar.setText("Editar");
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });
        jPanel5.add(bteditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 70, 30));

        btlimpalista.setText("Limpar");
        btlimpalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpalistaActionPerformed(evt);
            }
        });
        jPanel5.add(btlimpalista, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 270, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dimensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimensaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dimensaoActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void rbsextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbsextActionPerformed

    private void rbredondaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbredondaMouseClicked
        //Calculo REDONDAS

        // NÃO VISIVEL
        altura.setVisible(false);
        taltura.setVisible(false);
        largura.setVisible(false);
        tlargura.setVisible(false);
        comprimento.setVisible(false);
        diametroint.setVisible(false);
        tdiametroint.setVisible(false);
        mm2.setVisible(false);

        // VISIVEL
        dimensao.setVisible(true);
        tdimensao.setVisible(true);
        comprimento.setVisible(true);
        tcomprimento.setVisible(true);
        qbarras.setVisible(true);
        tqbarras.setVisible(true);
    }//GEN-LAST:event_rbredondaMouseClicked

    private void rbsextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbsextMouseClicked
        altura.setVisible(false);
        taltura.setVisible(false);
        largura.setVisible(false);
        tlargura.setVisible(false);
        comprimento.setVisible(false);
        diametroint.setVisible(false);
        tdiametroint.setVisible(false);
        mm2.setVisible(false);

        dimensao.setVisible(true);
        tdimensao.setVisible(true);
        comprimento.setVisible(true);
        tcomprimento.setVisible(true);
        qbarras.setVisible(true);
        tqbarras.setVisible(true);


    }//GEN-LAST:event_rbsextMouseClicked

    private void rbquadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbquadMouseClicked
        dimensao.setVisible(false);
        tdimensao.setVisible(false);
        comprimento.setVisible(false);
        diametroint.setVisible(false);
        tdiametroint.setVisible(false);

        altura.setVisible(true);
        taltura.setVisible(true);
        largura.setVisible(true);
        tlargura.setVisible(true);
        comprimento.setVisible(true);
        tcomprimento.setVisible(true);
        qbarras.setVisible(true);
        tqbarras.setVisible(true);
        mm2.setVisible(true);


    }//GEN-LAST:event_rbquadMouseClicked
    Lista obj = new Lista();

    public void executar() {
        String r = null;
        double vdimensao, vcodigo, vcomprimento, vtotal, vqbarras, vlargura, valtura, vresultado = 0, vresultbarras, vresultadokg, vpesott = 0, vcalc1, vcalc2, vbedame = 3, vdiametroint = 0;
        DecimalFormat f = new DecimalFormat("0.000");

        //BEDAME
        //O sistema primeiro verifica se o botão do bedame está selecionado
        if (rbbedame.isSelected()) {

            if (bedame.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor PREENCHA o campo do BEDAME!!!");
            }

            //Insere o valor do campo Bedame nos calculos a baixo, quando o botão bedame está selecionado
            vbedame = Double.parseDouble(bedame.getText());

            //INÍCIO DO SELECT-CALCULO
            /* 1º Select Redondas*/
        }
        if (rbredonda.isSelected()) {

            if (dimensao.getText().equals("") || qbarras.getText().equals("") || comprimento.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor PREENCHA todos os campos!!!");

            } else {

                vdimensao = Double.parseDouble(dimensao.getText());
                vcomprimento = Double.parseDouble(comprimento.getText());
                vqbarras = Double.parseDouble(qbarras.getText());

                //cálculo
                vresultado = ((((vdimensao * vdimensao) * 0.00617) * (vcomprimento + vbedame) / 1000) * vqbarras);

                resultado.setVisible(true);

                r = codigo.getText() + " = " + String.valueOf(f.format(vresultado));
                resultado.setText(" " + String.valueOf(f.format(vresultado)));

            }

            /* 2º Select Sextavadas*/
        } else if (rbsext.isSelected()) {

            if (dimensao.getText().equals("") || qbarras.getText().equals("") || comprimento.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor PREENCHA todos os campos!!!");

            } else {
                vdimensao = Double.parseDouble(dimensao.getText());
                vcomprimento = Double.parseDouble(comprimento.getText());
                vqbarras = Double.parseDouble(qbarras.getText());

                //cálculo
                vresultado = ((((vdimensao * vdimensao) * 0.0068) * (vcomprimento + vbedame) / 1000) * vqbarras);

                resultado.setVisible(true);
                r = codigo.getText() + "" + String.valueOf(f.format(vresultado));
                resultado.setText(String.valueOf(f.format(vresultado)));
            }

            /* 3º Select Quadradas e Retangulares*/
        } else if (rbquad.isSelected()) {

            if (largura.getText().equals("") || qbarras.getText().equals("") || altura.getText().equals("") || comprimento.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor PREENCHA todos os campos!!!");

            } else {
                vlargura = Double.parseDouble(largura.getText());
                valtura = Double.parseDouble(altura.getText());
                vcomprimento = Double.parseDouble(comprimento.getText());
                vqbarras = Double.parseDouble(qbarras.getText());

                //cálculo
                vresultado = ((((valtura * vlargura) * 0.00785) * (vcomprimento + vbedame) / 1000) * vqbarras);

                resultado.setVisible(true);
                r = codigo.getText() + "" + String.valueOf(f.format(vresultado));
                resultado.setText(String.valueOf(f.format(vresultado)));
            }

            /* 4º Select Tubo*/
        } else if (rbtubo.isSelected()) {

            if (dimensao.getText().equals("") || diametroint.getText().equals("") || qbarras.getText().equals("") || comprimento.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor PREENCHA todos os campos!!!");

            } else {
                vdimensao = Double.parseDouble(dimensao.getText());
                vcomprimento = Double.parseDouble(comprimento.getText());
                vdiametroint = Double.parseDouble(diametroint.getText());
                vqbarras = Double.parseDouble(qbarras.getText());

                //cálculo
                vcalc1 = ((((vdiametroint * vdiametroint) * 0.00617) * (vcomprimento + vbedame) / 1000));
                vcalc2 = ((((vdimensao * vdimensao) * 0.00617) * (vcomprimento + vbedame) / 1000));
                vresultado = ((vcalc2 - vcalc1) * vqbarras);

                resultado.setVisible(true);
                r = codigo.getText() + String.valueOf(f.format(vresultado));
                resultado.setText(String.valueOf(f.format(vresultado)));

            }
        }

        //Calculo de número total de barras
        if (checkbarras.isSelected()) {

            if (pesott.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor PREENCHA o campo de PESO TOTAL!!!");

            } else {
                /*Calculo da quantidade total de barras */
                vcomprimento = Double.parseDouble(comprimento.getText());
                vpesott = Double.parseDouble(pesott.getText());
                vresultbarras = (vpesott / vresultado);
                vtotal = vcomprimento * vresultbarras;
                resultbarras.setVisible(true);
                resultbarras.setText(String.valueOf(f.format(vresultbarras)));
                metrostotal.setVisible(true);
                metrostotal.setText(String.valueOf(f.format(vtotal)));

            }
        }

        obj.salvar(r);
        resultado.requestFocus();
        listaCalculo.setText(obj.Lista());

    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {

        if (listaCalculo.getText().equals("")) {
            obj.excluir(Integer.parseInt(infseq.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Insira um código");
        }

    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        executar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed


    }//GEN-LAST:event_resultadoActionPerformed
    public void limpar() {
        dimensao.setText(null);
        comprimento.setText(null);
        altura.setText(null);
        resultado.setText(null);
        qbarras.setText(null);
        codigo.setText(null);
        comprimento.setText(null);
        diametroint.setText(null);
        bedame.setText(null);
        lote.setText(null);
        largura.setText(null);
        pesott.setText(null);
        resultbarras.setText(null);
        metrostotal.setText(null);
        infseq.setText(null);
    }
    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        limpar();


    }//GEN-LAST:event_btlimparActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            executar();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void qbarrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qbarrasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            executar();
        }
    }//GEN-LAST:event_qbarrasKeyPressed

    private void btlimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btlimparKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limpar();
        }
    }//GEN-LAST:event_btlimparKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dispose();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void rbtuboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtuboMouseClicked
        altura.setVisible(false);
        taltura.setVisible(false);
        largura.setVisible(false);
        tlargura.setVisible(false);

        comprimento.setVisible(true);
        tdiametroint.setVisible(true);
        diametroint.setVisible(true);
        dimensao.setVisible(true);
        tdimensao.setVisible(true);
        comprimento.setVisible(true);
        tcomprimento.setVisible(true);
        qbarras.setVisible(true);
        tqbarras.setVisible(true);
        mm2.setVisible(true);

    }//GEN-LAST:event_rbtuboMouseClicked

    private void rbquadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbquadActionPerformed

    }//GEN-LAST:event_rbquadActionPerformed

    private void pbedameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbedameActionPerformed
        bedame.setVisible(false);
        medidabedame.setVisible(false);

    }//GEN-LAST:event_pbedameActionPerformed

    private void rbbedameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbedameActionPerformed
        bedame.setVisible(true);
        medidabedame.setVisible(true);


    }//GEN-LAST:event_rbbedameActionPerformed

    private void rbredondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbredondaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbredondaActionPerformed

    private void checkbarrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbarrasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbarrasMouseClicked

    private void rbtuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtuboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtuboActionPerformed

    private void pesottKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesottKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesottKeyPressed

    private void qbarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qbarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qbarrasActionPerformed

    private void pesottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesottActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesottActionPerformed

    private void metrostotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metrostotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metrostotalActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        if(!infseq.getText().equals("")){
        obj.excluir(Integer.parseInt(infseq.getText()));
    }else{
            JOptionPane.showMessageDialog(null,"Insira uma Sequência para excluír");
            }
        listaCalculo.setText(obj.Lista());
    }//GEN-LAST:event_btexcluirActionPerformed

    private void infseqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infseqActionPerformed
     
    }//GEN-LAST:event_infseqActionPerformed

    private void infseqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_infseqKeyReleased
    infseq.setText(infseq.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_infseqKeyReleased

    private void comprimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comprimentoKeyReleased
    comprimento.setText(comprimento.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_comprimentoKeyReleased

    private void qbarrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qbarrasKeyReleased
    qbarras.setText(qbarras.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_qbarrasKeyReleased

    private void dimensaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dimensaoKeyReleased
    dimensao.setText(dimensao.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_dimensaoKeyReleased

    private void alturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alturaKeyReleased
    altura.setText(altura.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_alturaKeyReleased

    private void larguraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_larguraKeyReleased
    largura.setText(largura.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_larguraKeyReleased

    private void diametrointKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diametrointKeyReleased
    diametroint.setText(diametroint.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_diametrointKeyReleased

    private void loteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loteKeyReleased
    lote.setText(lote.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_loteKeyReleased

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        if (!listaCalculo.getText().equals("")) {
            obj.editar(Integer.parseInt(infseq.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Insira um código");
        }
        listaCalculo.setText(obj.Lista());

    
                                        
    }//GEN-LAST:event_bteditarActionPerformed

    private void btlimpalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpalistaActionPerformed
    obj.limpar();
    listaCalculo.setText(obj.Lista());
    }//GEN-LAST:event_btlimpalistaActionPerformed

    private void comprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprimentoActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JTextField bedame;
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpalista;
    private javax.swing.JButton btlimpar;
    private javax.swing.ButtonGroup calculo;
    private javax.swing.JCheckBox checkbarras;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField comprimento;
    private javax.swing.JTextField diametroint;
    private javax.swing.JTextField dimensao;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel infbedame;
    private javax.swing.JLabel infbedamequad;
    private javax.swing.JTextField infseq;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kg1;
    private javax.swing.JTextField largura;
    private javax.swing.JTextArea listaCalculo;
    private javax.swing.JTextField lote;
    private javax.swing.JLabel medidabedame;
    private javax.swing.JTextField metrostotal;
    private javax.swing.JLabel mm1;
    private javax.swing.JLabel mm2;
    private javax.swing.JLabel mm3;
    private javax.swing.JRadioButton pbedame;
    private javax.swing.JTextField pesott;
    private javax.swing.JTextField qbarras;
    private javax.swing.JRadioButton rbbedame;
    private javax.swing.JRadioButton rbquad;
    private javax.swing.JRadioButton rbredonda;
    private javax.swing.JRadioButton rbsext;
    private javax.swing.JRadioButton rbtubo;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField resultbarras;
    private javax.swing.ButtonGroup selectbedame;
    private javax.swing.JLabel taltura;
    private javax.swing.JLabel tcomprimento;
    private javax.swing.JLabel tdiametroint;
    private javax.swing.JLabel tdimensao;
    private javax.swing.JLabel tlargura;
    private javax.swing.JLabel tqbarras;
    private javax.swing.JLabel tresultado;
    private javax.swing.JLabel un1;
    // End of variables declaration//GEN-END:variables
}
