package vo;

public class OnePlayerPerformOfOneSeasonVo {
	private String nameOfPlayer;// 球员姓名
	private String nameOfTeam;// 球队名称
	private int numberOfMatch;// 比赛场数
	private int numberOfFirst;// 先发场数
	//
	private int totalReboundNumber;// 总篮板
	private int assistNumber;// 总助攻
	private int playingTime;// 总上场时间
	private int stealNumber;// 总抢断数
	private int blockNumber;// 总 盖帽数
	private int turnoverNumber;// 总失误数
	private int foulNumber;// 总犯规数
	private int scoreNumber;// 总得分数
	private int offensiveReboundNumber;// 进攻篮板数
	private int defensiveReboundNumber;// 防守篮板数
	//
	private int averageTotalReboundNumber;// 场均篮板
	private int averageAssistNumber;// 场均助攻
	private int averagePlayingTime;// 场均上场时间
	private int averageStealNumber;// 场均抢断数
	private int averageBlockNumber;// 场均盖帽数
	private int averageTurnoverNumber;// 场均失误数
	private int averageFoulNumber;// 场均犯规数
	private int averageScoreNumber;// 场均得分数
	private int averageOffensiveReboundNumber;// 场均进攻篮板数
	private int averageDefensiveReboundNumber;// 场均防守篮板数
	//
	private double totalHitRate;// 投篮命中率
	private double threePointHitRate;// 三分命中率
	private double freePointHitRate;// 罚球命中率
	private double commonEfficiency;// 效率
	private double GmScEfficiency;// GmSc效率
	private double realHitRate;// 真实命中率
	private double shootEfficiency;// 投篮效率
	private double reboundEfficiency;// 篮板效率
	private double offensiveReboundRate;// 进攻篮板率
	private double defensiveReboundRate;// 防守篮板率
	private double assistRate;// 助攻率
	private double stealRate;// 抢断率
	private double blockRate;// 盖帽率
	private double turnoverRate;// 失误率
	private double useRate;// 使用率

	public String getNameOfPlayer() {
		return nameOfPlayer;
	}

	public void setNameOfPlayer(String nameOfPlayer) {
		this.nameOfPlayer = nameOfPlayer;
	}

	public String getNameOfTeam() {
		return nameOfTeam;
	}

	public void setNameOfTeam(String nameOfTeam) {
		this.nameOfTeam = nameOfTeam;
	}

	public int getNumberOfMatch() {
		return numberOfMatch;
	}

	public void setNumberOfMatch(int numberOfMatch) {
		this.numberOfMatch = numberOfMatch;
	}

	public int getNumberOfFirst() {
		return numberOfFirst;
	}

	public void setNumberOfFirst(int numberOfFirst) {
		this.numberOfFirst = numberOfFirst;
	}

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}

	public int getOffensiveReboundNumber() {
		return offensiveReboundNumber;
	}

	public void setOffensiveReboundNumber(int offensiveReboundNumber) {
		this.offensiveReboundNumber = offensiveReboundNumber;
	}

	public int getDefensiveReboundNumber() {
		return defensiveReboundNumber;
	}

	public void setDefensiveReboundNumber(int defensiveReboundNumber) {
		this.defensiveReboundNumber = defensiveReboundNumber;
	}

	public int getTotalReboundNumber() {
		return totalReboundNumber;
	}

	public void setTotalReboundNumber(int totalReboundNumber) {
		this.totalReboundNumber = totalReboundNumber;
	}

	public int getAssistNumber() {
		return assistNumber;
	}

	public void setAssistNumber(int assistNumber) {
		this.assistNumber = assistNumber;
	}

	public int getStealNumber() {
		return stealNumber;
	}

	public void setStealNumber(int stealNumber) {
		this.stealNumber = stealNumber;
	}

	public int getBlockNumber() {
		return blockNumber;
	}

	public void setBlockNumber(int blockNumber) {
		this.blockNumber = blockNumber;
	}

	public int getTurnoverNumber() {
		return turnoverNumber;
	}

	public void setTurnoverNumber(int turnoverNumber) {
		this.turnoverNumber = turnoverNumber;
	}

	public int getFoulNumber() {
		return foulNumber;
	}

	public void setFoulNumber(int foulNumber) {
		this.foulNumber = foulNumber;
	}

	public int getScoreNumber() {
		return scoreNumber;
	}

	public void setScoreNumber(int scoreNumber) {
		this.scoreNumber = scoreNumber;
	}

	public double getTotalHitRate() {
		return totalHitRate;
	}

	public void setTotalHitRate(double totalHitRate) {
		this.totalHitRate = totalHitRate;
	}

	public double getThreePointHitRate() {
		return threePointHitRate;
	}

	public void setThreePointHitRate(double threePointHitRate) {
		this.threePointHitRate = threePointHitRate;
	}

	public double getFreePointHitRate() {
		return freePointHitRate;
	}

	public void setFreePointHitRate(double freePointHitRate) {
		this.freePointHitRate = freePointHitRate;
	}

	public double getCommonEfficiency() {
		return commonEfficiency;
	}

	public void setCommonEfficiency(double commonEfficiency) {
		this.commonEfficiency = commonEfficiency;
	}

	public double getGmScEfficiency() {
		return GmScEfficiency;
	}

	public void setGmScEfficiency(double gmScEfficiency) {
		GmScEfficiency = gmScEfficiency;
	}

	public double getRealHitRate() {
		return realHitRate;
	}

	public void setRealHitRate(double realHitRate) {
		this.realHitRate = realHitRate;
	}

	public double getReboundEfficiency() {
		return reboundEfficiency;
	}

	public void setReboundEfficiency(double reboundEfficiency) {
		this.reboundEfficiency = reboundEfficiency;
	}

	public double getOffensiveReboundRate() {
		return offensiveReboundRate;
	}

	public void setOffensiveReboundRate(double offensiveReboundRate) {
		this.offensiveReboundRate = offensiveReboundRate;
	}

	public double getDefensiveReboundRate() {
		return defensiveReboundRate;
	}

	public void setDefensiveReboundRate(double defensiveReboundRate) {
		this.defensiveReboundRate = defensiveReboundRate;
	}

	public double getAssistRate() {
		return assistRate;
	}

	public void setAssistRate(double assistRate) {
		this.assistRate = assistRate;
	}

	public double getStealRate() {
		return stealRate;
	}

	public void setStealRate(double stealRate) {
		this.stealRate = stealRate;
	}

	public double getBlockRate() {
		return blockRate;
	}

	public void setBlockRate(double blockRate) {
		this.blockRate = blockRate;
	}

	public double getTurnoverRate() {
		return turnoverRate;
	}

	public void setTurnoverRate(double turnoverRate) {
		this.turnoverRate = turnoverRate;
	}

	public double getUseRate() {
		return useRate;
	}

	public void setUseRate(double useRate) {
		this.useRate = useRate;
	}

	public double getShootEfficiency() {
		return shootEfficiency;
	}

	public void setShootEfficiency(double shootEfficiency) {
		this.shootEfficiency = shootEfficiency;
	}

	public int getAverageTotalReboundNumber() {
		return averageTotalReboundNumber;
	}

	public void setAverageTotalReboundNumber(int averageTotalReboundNumber) {
		this.averageTotalReboundNumber = averageTotalReboundNumber;
	}

	public int getAverageAssistNumber() {
		return averageAssistNumber;
	}

	public void setAverageAssistNumber(int averageAssistNumber) {
		this.averageAssistNumber = averageAssistNumber;
	}

	public int getAveragePlayingTime() {
		return averagePlayingTime;
	}

	public void setAveragePlayingTime(int averagePlayingTime) {
		this.averagePlayingTime = averagePlayingTime;
	}

	public int getAverageStealNumber() {
		return averageStealNumber;
	}

	public void setAverageStealNumber(int averageStealNumber) {
		this.averageStealNumber = averageStealNumber;
	}

	public int getAverageBlockNumber() {
		return averageBlockNumber;
	}

	public void setAverageBlockNumber(int averageBlockNumber) {
		this.averageBlockNumber = averageBlockNumber;
	}

	public int getAverageTurnoverNumber() {
		return averageTurnoverNumber;
	}

	public void setAverageTurnoverNumber(int averageTurnoverNumber) {
		this.averageTurnoverNumber = averageTurnoverNumber;
	}

	public int getAverageFoulNumber() {
		return averageFoulNumber;
	}

	public void setAverageFoulNumber(int averageFoulNumber) {
		this.averageFoulNumber = averageFoulNumber;
	}

	public int getAverageScoreNumber() {
		return averageScoreNumber;
	}

	public void setAverageScoreNumber(int averageScoreNumber) {
		this.averageScoreNumber = averageScoreNumber;
	}

	public int getAverageOffensiveReboundNumber() {
		return averageOffensiveReboundNumber;
	}

	public void setAverageOffensiveReboundNumber(int averageOffensiveReboundNumber) {
		this.averageOffensiveReboundNumber = averageOffensiveReboundNumber;
	}

	public int getAverageDefensiveReboundNumber() {
		return averageDefensiveReboundNumber;
	}

	public void setAverageDefensiveReboundNumber(int averageDefensiveReboundNumber) {
		this.averageDefensiveReboundNumber = averageDefensiveReboundNumber;
	}
}