package com.example.schedule3.service;

import com.example.schedule3.entity.Schedule;
import com.example.schedule3.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public Page<Schedule> getSchedules(int page, int size) {
        return scheduleRepository.findAllByOrderByUpdatedAtDesc(PageRequest.of(page, size));
    }

    // Other CRUD operations
}