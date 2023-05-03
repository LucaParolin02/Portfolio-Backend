package com.portfolio.demo.service;

import com.portfolio.demo.model.Skill;

public interface ISkillService {

    public void saveSkill(Skill skill);
    public Skill getSkill(Long id);
    public void deleteSkill(Long id);
}
