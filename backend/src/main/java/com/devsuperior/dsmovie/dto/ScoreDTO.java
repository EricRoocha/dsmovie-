package com.devsuperior.dsmovie.dto;

public class ScoreDTO {

	private Long moveId;
	private String email;
	private Double Score; 
	
	public ScoreDTO() {
		
	}

	public Long getMoveId() {
		return moveId;
	}

	public void setMoveId(Long moveId) {
		this.moveId = moveId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return Score;
	}

	public void setScore(Double score) {
		Score = score;
	}
	
	
}
