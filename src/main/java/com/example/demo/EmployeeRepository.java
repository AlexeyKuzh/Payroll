package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
/*
 * Spring упрощает доступ к данным. Просто объявив следующий
 * EmployeeRepository интерфейс, мы автоматически сможем
 * 
 * Создать новых сотрудников
 * 
 * Обновить существующие
 * 
 * Удалить сотрудников
 * 
 * Найти сотрудников (одного, всех или поиск по простым или сложным свойствам)
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
	
	
}
/*
 * для того что бы получить весь тот функционал что был написан выше 
 * нам нужно просто создать интерфейс который будет спомощю extends раширять Spring Data JPA JpaRepository
 * 
 *где указав тип домена как Employeeи тип идентификатора как Long.
 */
