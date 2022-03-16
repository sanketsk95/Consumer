package com.product.Consumer;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="Students")
public class Student implements Serializable {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO )
private int roll_No;
private int maths;
private int physics;
private int chemistry;
private int english;
private int sanskrit;
private String result;
private Double average;
@XmlAttribute
public int getRoll_No() {
	return roll_No;
}
public void setRoll_No(int roll_No) {
	this.roll_No = roll_No;
}
@XmlElement
public int getMaths() {
	return maths;
}
public void setMaths(int maths) {
	this.maths = maths;
}
@XmlElement
public int getPhysics() {
	return physics;
}
public void setPhysics(int physics) {
	this.physics = physics;
}
@XmlElement
public int getChemistry() {
	return chemistry;
}
public void setChemistry(int chemistry) {
	this.chemistry = chemistry;
}
@XmlElement
public int getEnglish() {
	return english;
}
public void setEnglish(int english) {
	this.english = english;
}
@XmlElement
public int getSanskrit() {
	return sanskrit;
}
public void setSanskrit(int sanskrit) {
	this.sanskrit = sanskrit;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public Double getAverage() {
	return average;
}
public void setAverage(Double average) {
	this.average = average;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public String toString() {
	return "Student [roll_No=" + roll_No + ", maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry
			+ ", english=" + english + ", sanskrit=" + sanskrit + ", result=" + result + ", average=" + average + "]";
}



}
