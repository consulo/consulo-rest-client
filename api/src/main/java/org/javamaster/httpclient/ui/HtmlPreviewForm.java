package org.javamaster.httpclient.ui;

import consulo.ui.ex.awt.JBTabbedPane;

import javax.swing.*;

/**
 * @author yudong
 */
public class HtmlPreviewForm extends JComponent {
    private JPanel mainPanel;
    private JBTabbedPane tabbedPane;

    public void initTabs(JComponent jcefComponent, JComponent editorComponent, boolean pdf) {
        String desc = pdf ? "pdf" : "HTML";

        tabbedPane.addTab(desc + " Preview in HttpRequest", jcefComponent);
        tabbedPane.addTab("Text", editorComponent);

        tabbedPane.setSelectedIndex(0);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JBTabbedPane getTabbedPane() {
        return tabbedPane;
    }
}
