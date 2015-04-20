package common.mydatastructure;

import businesslogic.teams.CalculationOfTeamPerform;
import test.data.TeamNormalInfo;

public class TeamNormalInfo_Expand extends TeamNormalInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double totalHit;// 总命中数
	private double totalShot;// 总出手数
	private double threeHit;// 三分命中数
	private double threeShot;// 三分出手数
	private double freeHit;// 罚球命中数
	private double freeShot;// 罚球出手数

	public TeamNormalInfo_Expand getTeamNormal_avg() {
		TeamNormalInfo_Expand teamNormal_avg = new TeamNormalInfo_Expand();

		int numOfGame = getNumOfGame();
		System.out.println(numOfGame);
		teamNormal_avg.setNumOfGame(numOfGame);
		teamNormal_avg.setPenalty(getPenalty());
		teamNormal_avg.setShot(getShot());
		teamNormal_avg.setTeamName(getTeamName());
		teamNormal_avg.setThree(getThree());
		teamNormal_avg.setAssist(CalculationOfTeamPerform.cutToFour(getAssist() / numOfGame));
		teamNormal_avg.setBlockShot(CalculationOfTeamPerform.cutToFour(getBlockShot() / numOfGame));
		teamNormal_avg.setDefendRebound(CalculationOfTeamPerform.cutToFour(getDefendRebound() / numOfGame));
		teamNormal_avg.setFault(CalculationOfTeamPerform.cutToFour(getFault() / numOfGame));
		teamNormal_avg.setFoul(CalculationOfTeamPerform.cutToFour(getFoul() / numOfGame));
		teamNormal_avg.setFreeHit(CalculationOfTeamPerform.cutToFour(getFreeHit() / numOfGame));
		teamNormal_avg.setFreeShot(CalculationOfTeamPerform.cutToFour(getFreeShot() / numOfGame));
		teamNormal_avg.setOffendRebound(CalculationOfTeamPerform.cutToFour(getOffendRebound() / numOfGame));
		teamNormal_avg.setPoint(CalculationOfTeamPerform.cutToFour(getPoint() / numOfGame));
		teamNormal_avg.setRebound(CalculationOfTeamPerform.cutToFour(getRebound() / numOfGame));
		teamNormal_avg.setSteal(CalculationOfTeamPerform.cutToFour(getSteal() / numOfGame));
		teamNormal_avg.setThreeHit(CalculationOfTeamPerform.cutToFour(getThreeHit() / numOfGame));
		teamNormal_avg.setThreeShot(CalculationOfTeamPerform.cutToFour(getThreeShot() / numOfGame));
		teamNormal_avg.setTotalHit(CalculationOfTeamPerform.cutToFour(getTotalHit() / numOfGame));
		teamNormal_avg.setTotalShot(CalculationOfTeamPerform.cutToFour(getTotalShot() / numOfGame));
		return teamNormal_avg;

	}

	public double getTotalHit() {
		return totalHit;
	}

	public void setTotalHit(double totalHit) {
		this.totalHit = totalHit;
	}

	public double getTotalShot() {
		return totalShot;
	}

	public void setTotalShot(double totalShot) {
		this.totalShot = totalShot;
	}

	public double getThreeHit() {
		return threeHit;
	}

	public void setThreeHit(double threeHit) {
		this.threeHit = threeHit;
	}

	public double getThreeShot() {
		return threeShot;
	}

	public void setThreeShot(double threeShot) {
		this.threeShot = threeShot;
	}

	public double getFreeHit() {
		return freeHit;
	}

	public void setFreeHit(double freeHit) {
		this.freeHit = freeHit;
	}

	public double getFreeShot() {
		return freeShot;
	}

	public void setFreeShot(double freehot) {
		this.freeShot = freehot;
	}
}
