/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.gt.umg.practica1;

/**
 *
 * @author Lucia
 */
public class JsonComboDTO {
    private String value;
    private String text;

    public JsonComboDTO() {
    }

    public JsonComboDTO(String value, String text) {
        this.value=value;
        this.text=text;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
    
    
}
