package com.isetN.romans.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.isetN.romans.entities.Roman;
public interface RomanService {
  Roman saveRoman(Roman r);
  Roman updateRoman(Roman r);
  void deleteRoman(Roman r);
  void deleteRomanById(Long id);
  Roman getRoman(Long id);
  List<Roman> getAllRomans();
  Page<Roman> getAllRomansParPage(int page, int size);
  
}
