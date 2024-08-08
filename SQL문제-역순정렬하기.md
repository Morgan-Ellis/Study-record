# 문제 설명
`ANIMAL_INS` 테이블은 동물 보호소에 들어온 동물의 정보를 담고 있습니다.
- `ANIMAL_ID`: 동물의 아이디
- `ANIMAL_TYPE`: 동물의 종류
- `DATETIME`: 보호 시작일
- `INTAKE_CONDITION`: 보호 시작 시 상태
- `NAME`: 이름
- `SEX_UPON_INTAKE`: 성별 및 중성화 여부
`ANIMAL_OUTS` 테이블은 동물 보호소에서 입양된 동물의 정보를 담고 있습니다.
- `ANIMAL_ID`: 동물의 아이디
- `ANIMAL_TYPE`: 동물의 종류
- `DATETIME`: 보호 종료일
- `NAME`: 이름
- `SEX_UPON_OUTTAKE`: 성별 및 중성화 여부
------
동물 보호소에 들어온 모든 동물의 이름과 보호 시작일을 조회하는 
SQL문을 작성해주세요. 이때 결과는 ANIMAL_ID 역순으로 보여주세요. 

# 정답
```
SELECT NAME, DATETIME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID DESC;


