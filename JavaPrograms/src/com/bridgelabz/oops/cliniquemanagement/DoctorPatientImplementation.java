package com.bridgelabz.oops.cliniquemanagement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


import com.bridgelabz.utilpackage.Utility;



public class DoctorPatientImplementation {
	static ObjectMapper mapper = new ObjectMapper(); 
	List<Patients> personlist = new ArrayList<>();
	List<Doctor> doctorlist = new ArrayList<>();
	List<Appointment> appointmentlist = new ArrayList<>(); 
	{
		try {
			// read files and store data into linked list
			personlist = mapper.readValue(new File(
					"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/cliniquemanagement/Appointment.json"),
					new TypeReference<List<Patients>>() {
					});
			doctorlist = mapper.readValue(new File(
					"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/cliniquemanagement/Doctors.json"),
					new TypeReference<List<Doctor>>() {
					});
			appointmentlist = mapper.readValue(new File(
					"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/cliniquemanagement/Appointment.json"),
					new TypeReference<List<Appointment>>() {
					});

		} catch (Exception e) {

		}
	}
		
		int id;
		String name;
		String availability;
		String specialization;
		String phone;
		int age;
		boolean saveflag=false;
		boolean changeflag=false;
		
	
	public DoctorPatientImplementation() {
	}
	public void operarion() {
		int choice=0;
		do {
		System.out.println("======Operations======");
		System.out.println("1.Add Doctor\n2.Remove Doctor\n3.Add Patient\n4.Remove Patient\n5.Fixed Appointment\n6.Exit");
		choice=Utility.getInteger();
		switch(choice) {
		case 1:
			
			addDoctor();
			
			save();
			break;
		case 2:
			
			deleteDoctor();
			save();
			break;
		case 3:
			addPatient(); 
			save();
			break;
		case 4:
			deletePatient(); 
			save();
			break;
		case 5:
			fixAppointment(); 
			save();
			break;
		case 6:
			break;
		}
		}while(choice<6);
		
		
	}
	public void addDoctor() {
		System.out.println("Enter the Name");
		name=Utility.getString();
		System.out.println("Enter the specalization");
		specialization=Utility.getString();
		System.out.println("Enter the availiblity");
		availability=Utility.getString();
		id=0;
		if(doctorlist.size()>=1) {
			for (int i = 0; i < doctorlist.size(); i++) {
				if (id < doctorlist.get(i).getId()) {
					id = doctorlist.get(i).getId();
				}
			}
			doctorlist.add(new Doctor(id + 1, name, availability, specialization));
		}
		
	}
	public void deleteDoctor() {
		System.out.println("Enter Doctor id");
		id = Utility.getInteger();
		int i = 0;
		for (i = 0; i < doctorlist.size(); i++) {
			if (i == doctorlist.size()) {
				System.out.println("INVALID ID");
			} else if (doctorlist.get(i).getId() == id) {
				doctorlist.remove(i);
			}
		}
	}
	public void addPatient() {
		changeflag = true;
		saveflag = false;
		System.out.println("Enter Patient Name");
		name = Utility.getString();
		System.out.println("Enter Patient Phone Number");
		phone = Utility.getString();
		System.out.println("Enter Patient Age");
		age = Utility.getInteger();
		id = 0;
		if (personlist.size() >= 1) {
			for (int i = 0; i < personlist.size(); i++) {
				if (id < personlist.get(i).getId()) {
					id = personlist.get(i).getId();
				}
			}

		}
		personlist.add(new Patients(id + 1, name, phone, age));
	}

	// delete patient from list
	public void deletePatient() {
		changeflag = true;
		saveflag = false;
		System.out.println("Enter Patient id");
		id = Utility.getInteger();
		int i = 0;
		for (i = 0; i < personlist.size(); i++) {
			if (personlist.get(i).getId() == id) {
				personlist.remove(i);
			}
		}
		if (i == personlist.size()) {
			System.out.println("No Patient Found With This Id");
		}
	}

	// save data
	public void save() {
		try {

			mapper.writeValue(new File(
					"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/cliniquemanagement/Patients.json"),
					personlist);
			mapper.writeValue(new File(
					"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/cliniquemanagement/Appointment.json"),
					appointmentlist);
			mapper.writeValue(new File(
					"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/cliniquemanagement/Doctors.json"),
					doctorlist);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//fix appointment
	public void fixAppointment() {
		// TODO Auto-generated method stub
		System.out.println("Enter DoctorId");
		int doctorId = Utility.getInteger();
		System.out.println("Enter PatientId");
		int patientId = Utility.getInteger();
		System.out.println("Enter Availibility");
		String avail = Utility.getString();
		System.out.println("Enter Patient Phone Number");
		String patientphone = Utility.getString();
		Doctor objtemp = (Doctor) doctorlist.stream().filter(i -> i.getId() == doctorId).collect(Collectors.toList())
				.get(0);
		Patients objtemp2 = (Patients) personlist.stream().filter(i -> i.getId() == patientId)
				.collect(Collectors.toList()).get(0);
		if (objtemp == null || objtemp2 == null || !(objtemp2.getPhone().equals(patientphone))) {
			System.out.println("Invalid Details");
			return;
		}
		if (objtemp.getAvailability().equals(avail)) {
			if (objtemp.getAvailability().equalsIgnoreCase("AM")) {
				if (objtemp.getAmCount() > 5) {
					System.out.println("Doctor Already Have Appointments");
					return;
				} else {
					for (int i = 0; i < doctorlist.size(); i++) {
						if (doctorlist.get(i).getId() == doctorId) {
							int temp = doctorlist.get(i).getAmCount();
							doctorlist.get(i).setAmCount(temp + 1);
						}
					}
				}
			} else if (objtemp.getAvailability().equalsIgnoreCase("PM")) {
				if (objtemp.getPmCount() > 5) {
					System.out.println("Doctor Already Have Appointments");
					return;
				} else {
					for (int i = 0; i < doctorlist.size(); i++) {
						if (doctorlist.get(i).getId() == doctorId) {
							int temp = doctorlist.get(i).getPmCount();
							doctorlist.get(i).setPmCount(temp + 1);
						}
					}
				}
			}
		}

		appointmentlist
				.add(new Appointment(objtemp.getName(), doctorId, objtemp2.getName(), patientId, patientphone, avail));
		System.out.println("Appointment Fixed");
	}
}
