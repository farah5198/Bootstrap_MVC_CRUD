package com.isetN.romans;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.isetN.romans.entities.Roman;
import com.isetN.romans.repos.RomanRepository;

@SpringBootTest
class RomansApplicationTests {

	@Autowired
	private RomanRepository romanRepository;
	 
	@Test
	public void testCreateRoman() {
	Roman rom = new Roman("Imagination",2200.500,new Date());
	romanRepository.save(rom);
	}
	
	 @Test
	 public void testFindProduit()
	 {
	 Roman r = romanRepository.findById(2L).get();
	 System.out.println(r);
	 }
	 
	 @Test
	 public void testUpdateRoman()
	 {
	 Roman r = romanRepository.findById(2L).get();
	 r.setPrixRoman(2000.0);
	 romanRepository.save(r);
	 
	 System.out.println(r);
	 }
	 
	 @Test
	 public void testDeleteRoman()
	 {
	   romanRepository.deleteById(2L);
	 
	 }
	 
	 @Test
	 public void testListerTousRomans()
	 {
	 List<Roman> roms = romanRepository.findAll();
	 for (Roman r : roms)
	 {
	 System.out.println(r);
	 }
	 }





}
