package com.kwazarart.app.controller;

import com.kwazarart.app.repository.DeveloperRepository;
import com.kwazarart.app.model.Developer;

public class DeveloperController implements Controller {
    DeveloperRepository developerRepository = new DeveloperRepository();


    @Override
    public void create() {
        developerRepository.add();
    }

    @Override
    public void read(int id) {
        Developer developer = developerRepository.get(id);
        if (developer == null) {
            developerRepository.notFound();
        } else {
            developerRepository.printByIndex(developer);
        }
    }

    @Override
    public void readAll() {
        developerRepository.printAll(developerRepository.getAll());
    }

    @Override
    public void update(int var) {
        if (var == 0) return;
        developerRepository.updater(var);
    }

    @Override
    public void delete() {
        developerRepository.delete();
    }
}
