package com.baseball.strikeking;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BaseballGame {
  private final String answer;
  private final BaseballGameDisplay display;
  private int attempts = 0;  // 시도 횟수 변수
  private final int maxAttempts = 10;  // 최대 시도 횟수

  public BaseballGame() {
    this.answer = generateAnswer();
    this.display = new BaseballGameDisplay();
  }

  public void play() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      if (attempts >= maxAttempts) {
        System.out.println("최대 시도 횟수를 초과했습니다. 게임을 종료합니다.");
        break;
      }

      System.out.println("숫자를 입력하세요:");
      String input = scanner.nextLine();

      if (input.trim().isEmpty()) {
        System.out.println("입력값이 없습니다. 세 자리 숫자를 입력하세요.");
        continue;
      }
      if (!validateInput(input)) {
        System.out.println("중복되지 않는 1~9 사이의 3자리 숫자를 입력해주세요.");
        continue;
      }

      attempts++;  // 시도 횟수 증가

      int strike = countStrike(input);
      int ball = countBall(input);

      display.displayHint(strike, ball);

      if (strike == 3) {
        System.out.println("정답입니다!");
        break;
      }
    }
  }

  private boolean validateInput(String input) {
    if (input.length() != 3) return false;

    Set<Character> digitSet = new HashSet<>();
    for (char c : input.toCharArray()) {
      if (!Character.isDigit(c) || c == '0' || !digitSet.add(c)) {
        return false;
      }
    }
    return true;
  }

  private String generateAnswer() {
    Set<Integer> digits = new HashSet<>();
    Random random = new Random();
    while (digits.size() < 3) {
      digits.add(random.nextInt(9) + 1);  // 1-9 숫자 중 선택
    }
    StringBuilder answerBuilder = new StringBuilder();
    for (int digit : digits) {
      answerBuilder.append(digit);
    }
    return answerBuilder.toString();
  }

  private int countStrike(String input) {
    int strike = 0;
    for (int i = 0; i < 3; i++) {
      if (input.charAt(i) == answer.charAt(i)) {
        strike++;
      }
    }
    return strike;
  }

  private int countBall(String input) {
    int ball = 0;
    for (int i = 0; i < 3; i++) {
      if (answer.contains(String.valueOf(input.charAt(i))) && input.charAt(i) != answer.charAt(i)) {
        ball++;
      }
    }
    return ball;
  }
}
