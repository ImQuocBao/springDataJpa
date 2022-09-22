package com.example.spingdatajpa.service;

import com.example.spingdatajpa.repository.ChuyenBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuyenBayService {
    @Autowired
    ChuyenBayRepository chuyenBayRepository;
}
