package ma.enset.hospital.service;

import ma.enset.hospital.entities.Consultation;
import ma.enset.hospital.entities.Medcin;
import ma.enset.hospital.entities.Patient;
import ma.enset.hospital.entities.RendezVous;

import java.beans.MethodDescriptor;

public interface IHospitalService {
    public Patient savePatient (Patient patient);
    Medcin saveMedcin(Medcin medcin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
