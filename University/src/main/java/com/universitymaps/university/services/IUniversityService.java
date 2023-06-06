package com.universitymaps.university.services;

import com.universitymaps.university.entities.University;

import java.util.List;

public interface IUniversityService {
    public void insert(University university);
    List<University> list();
    public void delete(int idUniversity);
    public University listId(int idUniversity);
}
