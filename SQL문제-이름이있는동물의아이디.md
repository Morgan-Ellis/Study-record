# 문제 설명

`ANIMAL_INS` 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다.
- `ANIMAL_ID` : 동물의 아이디
- `ANIMAL_TYPE` : 생물 종
- `DATETIME` : 보호 시작일
- `INTAKE_CONDITION` : 보호 시작 시 상태
- `NAME` : 이름
- `SEX_UPON_INTAKE` : 성별 및 중성화 여부

**동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성해주세요. 
(단, ID는 오름차순 정렬되어야 합니다.)**

# 정답

```sql
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
ORDER BY ANIMAL_ID ASC;
