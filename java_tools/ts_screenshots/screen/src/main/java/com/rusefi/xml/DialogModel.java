package com.rusefi.xml;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

public class DialogModel {
    private String dialogTitle;
    private String imageName;
    @XmlElementWrapper
    @XmlElement(name = "field")
    public List<FieldModel> fields = new ArrayList<>();

    public DialogModel() {
    }

    public DialogModel(String dialogTitle, String imageName) {
        this.dialogTitle = dialogTitle;
        this.imageName = imageName;
    }

    @XmlAttribute
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @XmlAttribute
    public String getDialogTitle() {
        return dialogTitle;
    }

    public void setDialogTitle(String dialogTitle) {
        this.dialogTitle = dialogTitle;
    }

    @Override
    public String toString() {
        return "DialogModel{" +
                "dialogTitle='" + dialogTitle + '\'' +
                ", imageName='" + imageName + '\'' +
                ", fields=" + fields +
                '}';
    }
}
