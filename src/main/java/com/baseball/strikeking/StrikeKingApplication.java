package com.baseball.strikeking;
// 패키지

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 스프링 부트 애플리케이션을 실행하기 위해 필요한 필수적인 import 문

@SpringBootApplication
//메인 : 프로그램 실행 기능

public class StrikeKingApplication {
  public static void main(String[] args) {
      SpringApplication.run(StrikeKingApplication.class, args);
      BaseballGame game = new BaseballGame();
      game.play();
  } // 메인메서드 끝

} // 메인클래스 끝
