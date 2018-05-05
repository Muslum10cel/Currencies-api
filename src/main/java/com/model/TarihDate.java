/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.tags.Tags;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SirOncel
 */
@XmlRootElement(name = Tags.TARIH_DATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class TarihDate {

    @XmlAttribute(name = Tags.TARIH)
    private String tarih;

    @XmlAttribute(name = Tags.DATE)
    private String date;

    @XmlAttribute(name = Tags.BULTEN_NO)
    private String bultenNo;

    @XmlElement(name = Tags.CURRENCY)
    private List<Currency> currencies;

    public TarihDate() {
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBultenNo() {
        return bultenNo;
    }

    public void setBultenNo(String bultenNo) {
        this.bultenNo = bultenNo;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    @Override
    public String toString() {
        return "TarihDate{" + "tarih=" + tarih + ", date=" + date + ", bultenNo=" + bultenNo + ", currencies=" + currencies + '}';
    }

}
