package com.portfolio.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.demo.model.SocialMedia;
import com.portfolio.demo.repository.SocialMediaRepository;

@Service
public class SocialMediaService implements ISocialMediaService {
	
	@Autowired
	SocialMediaRepository socialMediaRepository;
	
	@Override
	public void saveSocialMedia(SocialMedia socialMedia) {
	socialMediaRepository.save(socialMedia);
	}
	
	@Override
	public void deleteSocialMedia(Long id) {
		socialMediaRepository.deleteById(id);
	}
	
	@Override
	public SocialMedia getSocialMedia(Long id) {
		return socialMediaRepository.findById(id).orElse(null);
	}
	

}
