package com.questphil.docsystem.frontend.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PlaceholderTextField extends JTextField {

    private String placeholder;

    public PlaceholderTextField(String placeholder) {
        this.placeholder = placeholder;
        setForeground(Color.GRAY); // Set the default text color to gray
        setText(placeholder); // Set the initial text to the placeholder
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (getText().equals(placeholder)) {
                    setText(""); // Clear the text when the field gains focus
                    setForeground(Color.BLACK); // Set the text color to black
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getText().isEmpty()) {
                    setText(placeholder); // Restore the placeholder text when the field loses focus and is empty
                    setForeground(Color.GRAY); // Set the text color back to gray
                }
            }
        });
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }
}
