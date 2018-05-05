/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.tags.Tags;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SirOncel
 */
@XmlRootElement(name = Tags.CURRENCY)
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency {

    @XmlAttribute(name = Tags.CROSS_ORDER)
    private String crossOrder;

    @XmlAttribute(name = Tags.CODE)
    private String code;

    @XmlAttribute(name = Tags.CURRENCY_CODE)
    private String currenyCode;

    @XmlElement(name = Tags.UNIT)
    private String unit;

    @XmlElement(name = Tags.NAME)
    private String name;

    @XmlElement(name = Tags.CURRENCY_NAME)
    private String currencyName;

    @XmlElement(name = Tags.FOREX_BUYING)
    private double forexBuying;

    @XmlElement(name = Tags.FOREX_SELLING)
    private double forexSelling;

    @XmlElement(name = Tags.BANKNOTE_BUYING)
    private double banknoteBuying;

    @XmlElement(name = Tags.BANKNOTE_SELLING)
    private double banknoteSelling;

    @XmlElement(name = Tags.CROSS_RATE_USD)
    private double crossRateUsd;

    @XmlElement(name = Tags.CROSS_RATE_OTHER)
    private double crossRateOther;

    public Currency() {
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getForexBuying() {
        return forexBuying;
    }

    public void setForexBuying(double forexBuying) {
        this.forexBuying = forexBuying;
    }

    public double getForexSelling() {
        return forexSelling;
    }

    public void setForexSelling(double forexSelling) {
        this.forexSelling = forexSelling;
    }

    public double getBanknoteBuying() {
        return banknoteBuying;
    }

    public void setBanknoteBuying(double banknoteBuying) {
        this.banknoteBuying = banknoteBuying;
    }

    public double getBanknoteSelling() {
        return banknoteSelling;
    }

    public void setBanknoteSelling(double banknoteSelling) {
        this.banknoteSelling = banknoteSelling;
    }

    public double getCrossRateUsd() {
        return crossRateUsd;
    }

    public void setCrossRateUsd(double crossRateUsd) {
        this.crossRateUsd = crossRateUsd;
    }

    public double getCrossRateOther() {
        return crossRateOther;
    }

    public void setCrossRateOther(double crossRateOther) {
        this.crossRateOther = crossRateOther;
    }

    public String getCrossOrder() {
        return crossOrder;
    }

    public void setCrossOrder(String crossOrder) {
        this.crossOrder = crossOrder;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrenyCode() {
        return currenyCode;
    }

    public void setCurrenyCode(String currenyCode) {
        this.currenyCode = currenyCode;
    }

    @Override
    public String toString() {
        return "Currency{" + "crossOrder=" + crossOrder + ", code=" + code + ", currenyCode=" + currenyCode + ", unit=" + unit + ", name=" + name + ", currencyName=" + currencyName + ", forexBuying=" + forexBuying + ", forexSelling=" + forexSelling + ", banknoteBuying=" + banknoteBuying + ", banknoteSelling=" + banknoteSelling + ", crossRateUsd=" + crossRateUsd + ", crossRateOther=" + crossRateOther + '}';
    }

}
