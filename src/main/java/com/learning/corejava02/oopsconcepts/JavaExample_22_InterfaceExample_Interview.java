package com.learning.corejava02.oopsconcepts;

interface MyPatient
{
	public abstract void showInformation();
	public abstract void treatPatient();
}

class MyInpatient implements MyPatient
{
	int patientId;
	String patientName;
	String patientType;
	int wardNo;

	MyInpatient(int pId, String pName, String pType, int wNo)
	{
		patientId = pId;
		patientName = pName;
		patientType = pType;
		wardNo = wNo;	
	}

	@Override
	public void treatPatient()
	{
		System.out.println("Treatment of Patient in Normal Ward.");	
	} 
	
	@Override
	public void showInformation()
	{
		System.out.println("Inpatient Details: "+patientId+", "+patientName+", "+patientType+", "+wardNo);
	}
}

class MyEmergencyPatient implements MyPatient
{
	int patientId;
	String patientName;
	String patientType;
	int emergencyWardNo;

	MyEmergencyPatient(int pId, String pName, String pType, int ewardNo)
	{
		patientId = pId;
		patientName = pName;
		patientType = pType;
		emergencyWardNo = ewardNo;	
	}
	
	@Override	
	public void treatPatient()
	{	
		System.out.println("Treatment of Patient in Emergency Ward.");
	}
	
	@Override
	public void showInformation()
	{
		System.out.println("EmergencyPatient Details: "+patientId+", "+patientName+", "+patientType+", "+emergencyWardNo);
	}
}

public class JavaExample_22_InterfaceExample_Interview
{
	public static void main(String[] args) 
	{
		MyPatient p1 = new MyInpatient(10, "Kavya", "Inpatient", 102);
		p1.showInformation();
		p1.treatPatient();
		System.out.println("----------------------------------------------------------");
				
		MyPatient p2 = new MyEmergencyPatient(20, "Karthik", "EmergencyPatient", 103);
		p2.showInformation();	
		p2.treatPatient();
		System.out.println("----------------------------------------------------------");
    }
}
