package com.universitymaps.university.servicesimplement;

import com.universitymaps.university.entities.University;
import com.universitymaps.university.repositories.IUniversityRepository;
import com.universitymaps.university.services.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImplement implements IUniversityService {

    @Autowired
    private IUniversityRepository uR;
    @Override
    public void insert(University university) {
        uR.save(university);
    }

    @Override
    public List<University> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUniversity) {
        uR.deleteById(idUniversity);
    }

    @Override
    public University listId(int idUniversity) {
        return uR.findById(idUniversity).orElse(new University());
    }
}
