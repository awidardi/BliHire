package com.empatkepala.entity.request;

import com.empatkepala.entity.CV;
import com.empatkepala.entity.CVEntity.*;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

/**
 * Created by Ryan Bagus Susilo on 4/21/2017.
 */
public class CVFormRequest {

    private String title;
    private String jobTitle;
    private String fullName;
    private String placeDateOfBirth;
    private String idCardNumber;
    private String drivingLicense;
    private String emailAddress;
    private String uploadCV;
    private String twitter;
    private String facebook;
    private String linkedIn;
    private String blog;
    private String handphone;
    private String religion;
    private String ethnicity;
    private String maritalStatus;
    private String currentAddress;
    private String homeAddress;
    private String homePhone;
    private String emergencyCall;
    //-- Latar Belakang Keluarga
    private String fatherName;
    private String fatherBirthday;
    private String fatherLatestEducation;
    private String fatherCurrentJob;
    private String motherName;
    private String motherBirthday;
    private String motherLatestEducation;
    private String motherCurretJob;
    private ArrayList<Brothers> Bro=new ArrayList<Brothers>();
    private String spouseName;
    private String spousebirthDay;
    private String spouseLatestEducation;
    private String spouseCurrentJob;
    private ArrayList<Children> Chil=new ArrayList<Children>();
    private String responsibilities;
    private String responsibilitiesType;
    //III
    private ArrayList<School> school=new ArrayList<School>();
    private String reasonMajor;
    private String titleThesis;
    private ArrayList<NonFormalCourse> nonFrmlCrs =new ArrayList<NonFormalCourse>();
    private String nameOfOrganization;
    private String fieldOfOrganization;
    private String attendancePeriod;
    private String notes;
    private String achievement;
    private int yearAchievement;
    private String notesAchievement;
    //----
    private ArrayList<WorkExperience> WorkExp=new ArrayList<WorkExperience>();
    private String reasonInterestedInGDN;
    private String reasonApplyOnThatPosition;
    private String factorEncourageYouOnThatJob;
    private String kindOfEnvirontment;
    private String lifeValue;
    private String spesificSkill;
    private String hobbies;
    private String describeAboutYou;
    //---
    private String placeGetInformationGDN;
    private String relativeWorkingOnGDN;
    private String haveAppliedOnGDN;
    private String havePartTimejob;
    private String timeStartWork;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPlaceDateOfBirth() {
        return placeDateOfBirth;
    }

    public void setPlaceDateOfBirth(String placeDateOfBirth) {
        this.placeDateOfBirth = placeDateOfBirth;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUploadCV() {
        return uploadCV;
    }

    public void setUploadCV(String uploadCV) {
        this.uploadCV = uploadCV;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getHandphone() {
        return handphone;
    }

    public void setHandphone(String handphone) {
        this.handphone = handphone;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmergencyCall() {
        return emergencyCall;
    }

    public void setEmergencyCall(String emergencyCall) {
        this.emergencyCall = emergencyCall;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherBirthday() {
        return fatherBirthday;
    }

    public void setFatherBirthday(String fatherBirthday) {
        this.fatherBirthday = fatherBirthday;
    }

    public String getFatherLatestEducation() {
        return fatherLatestEducation;
    }

    public void setFatherLatestEducation(String fatherLatestEducation) {
        this.fatherLatestEducation = fatherLatestEducation;
    }

    public String getFatherCurrentJob() {
        return fatherCurrentJob;
    }

    public void setFatherCurrentJob(String fatherCurrentJob) {
        this.fatherCurrentJob = fatherCurrentJob;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherBirthday() {
        return motherBirthday;
    }

    public void setMotherBirthday(String motherBirthday) {
        this.motherBirthday = motherBirthday;
    }

    public String getMotherLatestEducation() {
        return motherLatestEducation;
    }

    public void setMotherLatestEducation(String motherLatestEducation) {
        this.motherLatestEducation = motherLatestEducation;
    }

    public String getMotherCurretJob() {
        return motherCurretJob;
    }

    public void setMotherCurretJob(String motherCurretJob) {
        this.motherCurretJob = motherCurretJob;
    }

    public ArrayList<Brothers> getBro() {
        return Bro;
    }

    public void setBro(ArrayList<Brothers> bro) {
        Bro = bro;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpousebirthDay() {
        return spousebirthDay;
    }

    public void setSpousebirthDay(String spousebirthDay) {
        this.spousebirthDay = spousebirthDay;
    }

    public String getSpouseLatestEducation() {
        return spouseLatestEducation;
    }

    public void setSpouseLatestEducation(String spouseLatestEducation) {
        this.spouseLatestEducation = spouseLatestEducation;
    }

    public String getSpouseCurrentJob() {
        return spouseCurrentJob;
    }

    public void setSpouseCurrentJob(String spouseCurrentJob) {
        this.spouseCurrentJob = spouseCurrentJob;
    }

    public ArrayList<Children> getChil() {
        return Chil;
    }

    public void setChil(ArrayList<Children> chil) {
        Chil = chil;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getResponsibilitiesType() {
        return responsibilitiesType;
    }

    public void setResponsibilitiesType(String responsibilitiesType) {
        this.responsibilitiesType = responsibilitiesType;
    }

    public ArrayList<School> getSchool() {
        return school;
    }

    public void setSchool(ArrayList<School> school) {
        this.school = school;
    }

    public String getReasonMajor() {
        return reasonMajor;
    }

    public void setReasonMajor(String reasonMajor) {
        this.reasonMajor = reasonMajor;
    }

    public String getTitleThesis() {
        return titleThesis;
    }

    public void setTitleThesis(String titleThesis) {
        this.titleThesis = titleThesis;
    }

    public ArrayList<NonFormalCourse> getNonFrmlCrs() {
        return nonFrmlCrs;
    }

    public void setNonFrmlCrs(ArrayList<NonFormalCourse> nonFrmlCrs) {
        this.nonFrmlCrs = nonFrmlCrs;
    }

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public String getFieldOfOrganization() {
        return fieldOfOrganization;
    }

    public void setFieldOfOrganization(String fieldOfOrganization) {
        this.fieldOfOrganization = fieldOfOrganization;
    }

    public String getAttendancePeriod() {
        return attendancePeriod;
    }

    public void setAttendancePeriod(String attendancePeriod) {
        this.attendancePeriod = attendancePeriod;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public int getYearAchievement() {
        return yearAchievement;
    }

    public void setYearAchievement(int yearAchievement) {
        this.yearAchievement = yearAchievement;
    }

    public String getNotesAchievement() {
        return notesAchievement;
    }

    public void setNotesAchievement(String notesAchievement) {
        this.notesAchievement = notesAchievement;
    }

    public ArrayList<WorkExperience> getWorkExp() {
        return WorkExp;
    }

    public void setWorkExp(ArrayList<WorkExperience> workExp) {
        WorkExp = workExp;
    }

    public String getReasonInterestedInGDN() {
        return reasonInterestedInGDN;
    }

    public void setReasonInterestedInGDN(String reasonInterestedInGDN) {
        this.reasonInterestedInGDN = reasonInterestedInGDN;
    }

    public String getReasonApplyOnThatPosition() {
        return reasonApplyOnThatPosition;
    }

    public void setReasonApplyOnThatPosition(String reasonApplyOnThatPosition) {
        this.reasonApplyOnThatPosition = reasonApplyOnThatPosition;
    }

    public String getFactorEncourageYouOnThatJob() {
        return factorEncourageYouOnThatJob;
    }

    public void setFactorEncourageYouOnThatJob(String factorEncourageYouOnThatJob) {
        this.factorEncourageYouOnThatJob = factorEncourageYouOnThatJob;
    }

    public String getKindOfEnvirontment() {
        return kindOfEnvirontment;
    }

    public void setKindOfEnvirontment(String kindOfEnvirontment) {
        this.kindOfEnvirontment = kindOfEnvirontment;
    }

    public String getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(String lifeValue) {
        this.lifeValue = lifeValue;
    }

    public String getSpesificSkill() {
        return spesificSkill;
    }

    public void setSpesificSkill(String spesificSkill) {
        this.spesificSkill = spesificSkill;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getDescribeAboutYou() {
        return describeAboutYou;
    }

    public void setDescribeAboutYou(String describeAboutYou) {
        this.describeAboutYou = describeAboutYou;
    }

    public String getPlaceGetInformationGDN() {
        return placeGetInformationGDN;
    }

    public void setPlaceGetInformationGDN(String placeGetInformationGDN) {
        this.placeGetInformationGDN = placeGetInformationGDN;
    }

    public String getRelativeWorkingOnGDN() {
        return relativeWorkingOnGDN;
    }

    public void setRelativeWorkingOnGDN(String relativeWorkingOnGDN) {
        this.relativeWorkingOnGDN = relativeWorkingOnGDN;
    }

    public String getHaveAppliedOnGDN() {
        return haveAppliedOnGDN;
    }

    public void setHaveAppliedOnGDN(String haveAppliedOnGDN) {
        this.haveAppliedOnGDN = haveAppliedOnGDN;
    }

    public String getHavePartTimejob() {
        return havePartTimejob;
    }

    public void setHavePartTimejob(String havePartTimejob) {
        this.havePartTimejob = havePartTimejob;
    }

    public String getTimeStartWork() {
        return timeStartWork;
    }

    public void setTimeStartWork(String timeStartWork) {
        this.timeStartWork = timeStartWork;
    }


}
