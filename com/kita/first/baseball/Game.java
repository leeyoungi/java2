package com.kita.first.baseball;

public class Game {

	public static void main(String[] args) {

		int gameCnt = 3;
		if (args.length != 0) {
			try {
				gameCnt = Integer.parseInt(args[0]);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Baseball ball = new Baseball(gameCnt);

		Myball myBall = new Myball(gameCnt);

		int count = 0;
		do {
			myBall.setNumbers();
			count++;
		} while (Checker.check(gameCnt, ball, myBall));

		System.out.println(count + "시도 성공");

		System.out.println("게임 종료!");

	}

	// 1:숫자1:3
	// 2:숫자2:6
	// 3:숫자3:8

}
