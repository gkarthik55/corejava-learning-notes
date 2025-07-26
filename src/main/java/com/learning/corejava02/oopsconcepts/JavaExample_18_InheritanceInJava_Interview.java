package com.learning.corejava02.oopsconcepts;

enum PatientType
{
    INPATIENT, OUTPATIENT, EMERGENCY;
}

enum OrderType
{
    RXORDER, HXORDER, PROPOSAL, NONMEDICATION;
}

// Base class
class Patient
{
    private final int patientId;
    private String patientName;
    private final PatientType patientType;

    public Patient(int patientId, String patientName, PatientType patientType)
    {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientType = patientType;
    }

    public String getPatientName()
    {
        return patientName;
    }

    public void setPatientName(String patientName)
    {
        this.patientName = patientName;
    }

    public int getPatientId()
    {
        return patientId;
    }

    public PatientType getPatientType()
    {
        return patientType;
    }

    @Override
    public String toString()
    {
        return "Patient ID: " + patientId +
               ", Name: " + patientName +
               ", Type: " + patientType;
    }
}

// Subclass representing inpatients
class Inpatient extends Patient
{
    private final int wardNumber;

    public Inpatient(int patientId, String patientName, int wardNumber)
    {
        super(patientId, patientName, PatientType.INPATIENT);
        this.wardNumber = wardNumber;
    }

    public int getWardNumber()
    {
        return wardNumber;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Ward No: " + wardNumber;
    }
}

// Subclass representing emergency patients
class EmergencyPatient extends Patient
{
    private final String emergencyDescription;

    public EmergencyPatient(int patientId, String patientName, String emergencyDescription)
    {
        super(patientId, patientName, PatientType.EMERGENCY);
        this.emergencyDescription = emergencyDescription;
    }

    public String getEmergencyDescription()
    {
        return emergencyDescription;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Emergency: " + emergencyDescription;
    }
}

public class JavaExample_18_InheritanceInJava_Interview
{
    public static void main(String[] args)
    {
        Patient generalPatient = new Patient(1001, "Karthik G", PatientType.OUTPATIENT);
        System.out.println(generalPatient);

        Patient admittedPatient = new Inpatient(1002, "Ranjan R", 402);
        System.out.println(admittedPatient);

        Patient emergencyPatient = new EmergencyPatient(1003, "Prajwal A", "Fainted after heavy workout");
        System.out.println(emergencyPatient);
    }
}