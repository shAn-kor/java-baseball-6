1. 랜덤 숫자 생성
    - 서로 다른 숫자여야함
    - 숫자는 3개여야함
    - 숫자의 범위는 1~9 로 한정

2. 사용자 숫자 입력
    - "숫자를 입력해주세요 : (x)" 문구 출력
    - (예외사항) 입렧한 수가 3개인지 확인
    - (예외사항) 입력 값이 정수인지 확인
    - (예외사항) 입력 값이 1 이상 9 이하 인지 확인
    - (예외사항) 입력 값이 서로 다른지 확인
    - 예외사항 발생 시 IllegalArgumentException 발생 시키고 종료

3. 사용자 입력 값과 랜덤 숫자 비교
    - 같은 자리에 같은 수 : 스트라이크
    - 다른 자리에 같은 수 : 볼
    - 같은 수가 없는 경우 : 낫싱

4. 비교 결과 출력
    - 볼, 스트라이크 카우트 값 출력
    - "(x) 볼 (y) 스트라이크" 포맷 형태로 결과 출력
    - y 값 3일 경우 "3개의 숫자를 모두 맞히셨습니다! 게임 종료" 문구 출력 후 종료 여부 입력 항목으로 이동
    - y 값 3이 아닌 경우 다시 사용자 숫자 입력 항목으로 이동

5. 종료 여부 입력
    - "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요." 문구 출력
    - 사용자 입력 값 숫자 1, 2 아닐 경우 IllegalArgumentException 발생 시키고 종료

6. 게임 시작
    - "숫자 야구 게임을 시작합니다." 문구 출력