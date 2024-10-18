package gamingproject.backend;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Scanner;
import org.hibernate.annotations.CreationTimestamp;


@Entity
public class  {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(unique = true)
	private Long phno;

	private Double investedmoney;
	@CreationTimestamp
	private LocalDateTime playedtime;
	private Double earnmoney;
	private String randomnumber;
	private String usernumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public Double getInvestedmoney() {
		return investedmoney;
	}

	public void setInvestedmoney(Double investedmoney) {
		this.investedmoney = investedmoney;
	}

	public LocalDateTime getPlayedtime() {
		return playedtime;
	}

	public void setPlayedtime(LocalDateTime playedtime) {
		this.playedtime = playedtime;
	}

	public Double getEarnmoney() {
		return earnmoney;
	}

	public void setEarnmoney(Double earnmoney) {
		this.earnmoney = earnmoney;
	}

	public String getRandomnumber() {
		return randomnumber;
	}

	public void setRandomnumber(String randomnumber) {
		this.randomnumber = randomnumber;
	}

	public String getUsernumber() {
		return usernumber;
	}

	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}

}
