package domain;

import java.util.List;

public class WinnerList {
    private List<String> winnerList;

    public WinnerList(List<String> winnerList){
        this.winnerList = winnerList;
    }

    public List<String> getWinnerList() {
        return winnerList;
    }
}
