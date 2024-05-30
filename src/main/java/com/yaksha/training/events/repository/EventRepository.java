package com.yaksha.training.events.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.events.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

	// feel free to update this
	Page<Event> findByEventNameAndPlace(@Param("keyword") String keyword, @Param("todayDate") LocalDate todayDate,
			Pageable pageable);

	// feel free to update this
	Page<Event> findAllUpcomingEvents(@Param("todayDate") LocalDate todayDate, Pageable pageable);

	// feel free to update this
	Page<Event> findByPastEventNameAndPlace(@Param("keyword") String keyword, @Param("todayDate") LocalDate todayDate,
			Pageable pageable);

	// feel free to update this
	Page<Event> findAllPastEvents(@Param("todayDate") LocalDate todayDate, Pageable pageable);
}
