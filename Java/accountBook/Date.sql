-- 문제1) EMPLOYEES Table의 모든 자료를 출력하여라.
SELECT * FROM EMPLOYEES;

-- 문제2) EMPLOYEES Table의 컬럼들을 모두 출력하라.
DESC departments;

-- 문제3) EMPLOYEES Table에서 사원 번호, 이름, 급여, 담당업무를 출력하여라.
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES;

-- 문제4) 모든 종업원의 급여를 $300증가 시키기 위해서 덧셈 연산자를 사용하고 결과에 SALARY+300을 디스플레이 합니다.
SELECT employee_id, salary, salary+300 as "salary+300"
FROM employees;


-- 문제5) EMP 테이블에서 사원번호, 이름, 급여, 보너스, 보너스 금액을 출력하여라. 
-- (참고로 보너스는 월급 + (월급*커미션))
SELECT MANAGER_ID, LAST_NAME, SALARY, salary * commission_pct
FROM EMPLOYEES;

-- 문제6) EMPLOYEES 테이블에서 LAST_NAME을 이름으로 SALARY을 급여로 출력하여라.
select last_name as "이름", salary as "급여"
from EMPLOYEES;


-- 문제7) EMPLOYEES 테이블에서 LAST_NAME을 Name으로 SALARY * 12를 Annual Salary(연봉)로 출력하여라
select last_name, salary * 12 as "Annual Salary"
from EMPLOYEES;

-- 문제8) EMPLOYEES 테이블에서 이름과 업무를 연결하여 출력하여라. 
select first_name || ' ' || job_id
from EMPLOYEES;

-- 문제9) EMPLOYEES 테이블에서 이름과 업무를 “KING is a PRESIDENT” 형식으로 출력하여라. 
select first_name || ' is a ' || job_id
from EMPLOYEES;

-- 문제10) EMPLOYEES 테이블에서 이름과 연봉을 “KING: 1 Year salary = 60000” 형식으로 출력하여라. 
select frist_name || ': 1 Year salary = ' || salary * 12 as "이름과 연봉"
from EMPLOYEES;

-- 문제11) EMPLOYEES 테이블에서 JOB을 모두 출력하라(중복생략).
select DISTINCT job_id
from EMPLOYEES;

SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES;
WHERE FIRST_NAME = 'Julia';

