package com.example.RESTAPIS.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
        
		
		@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int no;
		@Column(name="User_name")
		private String name;
		@Column(name="User_id")
		private int id;
		
		public class user{
		
		
		}
		
		
		public User(String name, int id) {
			super();
			this.name = name;
			this.id = id;
			
			
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "User [no=" + no + ", name=" + name + ", id=" + id + "]";
		}
		
	}



