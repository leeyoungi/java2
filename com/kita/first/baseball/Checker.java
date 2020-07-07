package com.kita.first.baseball;

import java.io.ObjectInputStream.GetField;

public class Checker {
//성공하면 false, 성공못하면 true
	public static boolean check(int gameCnt, Baseball baseball, Myball mb) {

		boolean gameEnd = true;
		int count = 0;
		int strike = 0;

		int ball = 0;

		int out = 0;

		for (int i = 0; i < gameCnt; i++) {

			for (int j = 0; j < gameCnt; j++) {

				if (baseball.get(i) == mb.get(j)) {

					if (i == j) {

						strike += 1;

					} else

						ball += 1;

				}

			}

		}
		System.out.printf("S:%d / B:%d / O:%d\n", strike, ball, (gameCnt - strike - ball));
		if (strike == gameCnt) {
			gameEnd = false;

		}
		return gameEnd;

	}

}
