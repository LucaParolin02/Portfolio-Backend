package com.portfolio.demo.security.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.portfolio.demo.security.enums.RoleName;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Rol {
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long id;
		
		
		@Enumerated(EnumType.STRING)
		private RoleName roleName;
		
		public Rol() {
			super();
		}
		
		public Rol(Long id, RoleName roleName) {
			super();
			this.id = id;
			this.roleName = roleName;
		}	
}
