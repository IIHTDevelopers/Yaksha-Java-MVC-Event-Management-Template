package com.yaksha.training.events.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.events.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

	List<Event> findByEventNameAndPlace(@Param("keyword") String keyword);
}
