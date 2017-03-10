package com.cn.fzd.pojo;

import java.io.Serializable;
import java.util.Date;

import com.cn.fzd.util.TimeUtil;

@SuppressWarnings("serial")
public class User implements Serializable{
	private Integer id;
	private String userName;
	private Integer sex;
	private Integer age;
	private String professional;
	private String school;
	private String hobby1;
	private String hobby2;
	private String hobby3;
	private String idcard;
	private String area;
	private Integer grade;
	private Date createTime;
	private Date editDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getSexStr(){
		if(sex==null){
			return null;
		}else if(sex==0){
			return "男";
		}else{
			return "女";
		}
		
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getHobby1() {
		return hobby1;
	}
	public void setHobby1(String hobby1) {
		this.hobby1 = hobby1;
	}
	public String getHobby2() {
		return hobby2;
	}
	public void setHobby2(String hobby2) {
		this.hobby2 = hobby2;
	}
	public String getHobby3() {
		return hobby3;
	}
	public void setHobby3(String hobby3) {
		this.hobby3 = hobby3;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getGradeStr(){
		if(grade==null){
			return null;
		}else if(grade==1){
			return "大一";
		}else if(grade==2){
			return "大二";
		}else if(grade==3){
			return "大三";
		}else if(grade==4){
			return "大四";
		}else if(grade==5){
			return "大五";
		}else{
			return null;
		}
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateTimeStr(){
		if(createTime==null){
			return null;
		}
		String createTimeStr=TimeUtil.formatDateTimeToStr(createTime,TimeUtil.DATE_PATTERN1);
		return createTimeStr;
	}
	public Date getEditDate() {
		return editDate;
	}
	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}
	public String getEditDateStr(){
		if(editDate==null){
			return null;
		}
		String editDateStr=TimeUtil.formatDateTimeToStr(createTime, TimeUtil.DATE_PATTERN1);
		return editDateStr;
	}
   
}