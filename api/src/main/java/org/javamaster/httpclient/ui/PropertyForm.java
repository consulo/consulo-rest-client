package org.javamaster.httpclient.ui;

import consulo.project.Project;
import consulo.ui.ex.awt.DialogWrapper;
import consulo.ui.ex.awt.ValidationInfo;
import consulo.util.lang.Pair;
import consulo.util.lang.StringUtil;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PropertyForm extends DialogWrapper {
    private JPanel contentPane;

    private JTextField textFieldKey;
    private JTextField textFieldValue;

    public PropertyForm(Project project, String title, String key, String value, boolean js, boolean add) {
        super(project, false);

        textFieldKey.setText(key);
        textFieldValue.setText(value);

        setModal(true);
        setTitle(title);

        if (js && !add) {
            textFieldKey.setEnabled(false);
        }

        init();
    }

    public Pair<String, String> getFormData() {
        return new Pair<>(textFieldKey.getText(), textFieldValue.getText());
    }

    @Override
    protected @NotNull List<ValidationInfo> doValidateAll() {
        Pair<String, String> pair = getFormData();

        List<ValidationInfo> result = new ArrayList<>();
        if (StringUtil.isEmptyOrSpaces(pair.getFirst())) {
            result.add(new ValidationInfo("Can't be blank", textFieldKey));
        }
        if (StringUtil.isEmptyOrSpaces(pair.getSecond())) {
            result.add(new ValidationInfo("Can't be blank", textFieldValue));
        }

        return result;
    }

    @Override
    protected JComponent createCenterPanel() {
        return contentPane;
    }
}
