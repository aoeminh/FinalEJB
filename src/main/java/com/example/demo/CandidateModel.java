package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CandidateModel extends PagingAndSortingRepository<Candidates,Long> {
}
