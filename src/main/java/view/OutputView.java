package view;

import domain.ballnumber.BallResult;

public class OutputView {

    public void showBallResult(BallResult ballResult) {
        StringBuilder sb = new StringBuilder();
        if(ballResult.getStrike()>0)
            sb.append(ballResult.getStrike()).append(" 스트라이크 ");
        if(ballResult.getBall()>0)
            sb.append(ballResult.getBall()).append(" 볼");
        if(sb.length()==0)
            sb.append("낫싱");
        System.out.println(sb);
    }
}
