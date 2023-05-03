package com.portfolio.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.demo.model.Skill;
import com.portfolio.demo.repository.SkillRepository;

@Service
public class SkillService implements ISkillService{

    @Autowired
    SkillRepository skillRepository;

    @Override
    public void saveSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public Skill getSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

}
