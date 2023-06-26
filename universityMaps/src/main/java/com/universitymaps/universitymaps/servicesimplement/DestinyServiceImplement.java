package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.repositories.DestinyRepository;
import com.universitymaps.universitymaps.services.DestinyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DestinyServiceImplement implements DestinyService {
    @Autowired
    private DestinyRepository dR;
    @Override
    public void insert(Destiny destiny) {
dR.save(destiny);
    }

    @Override
    public List<Destiny> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDestiny) {
dR.deleteById(idDestiny);
    }

    @Override
    public Destiny ListId(int IdDestiny) {
        return dR.findById(IdDestiny).orElse(new Destiny());
    }
}
