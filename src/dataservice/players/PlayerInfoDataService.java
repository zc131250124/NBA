package dataservice.players;

import java.util.ArrayList;

import po.GeneralInfoOfPlayerPo;
import po.PlayerPerformanceOfOneMatchPo;
import po.TeamPerformanceOfOneMatchPo;

public interface PlayerInfoDataService {
	// 查找某一球员在某一赛季的比赛信息
	public ArrayList<PlayerPerformanceOfOneMatchPo> getOnePlayerPerformOfOneSeasonPo(String nameOfPlayer);

	// 查找出所有的球员姓名
	public ArrayList<String> getNamesOfAllPlayer();

	// 根据球员姓名查找某一球员具体基本自然信息
	public GeneralInfoOfPlayerPo getGeneralInfoOfOnePlayer(String nameOfPlayer);

	// 通过球员姓名得到球队基本信息
	public String getLeague(String playerName);

	// 查找某一球队在某一赛季的具体信息比赛信息的数组中第一个为自己的信息，第二个为对方的信息
	public ArrayList<TeamPerformanceOfOneMatchPo[]> getOneTeamPerformOfOneSeason(String playerName);
}
