package com.Day6.StreamsAPI.program;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {
	public static void main(String[] args) throws Exception{
		Stream<String> lines = Files.lines(Paths.get("src/temp/StreamsAPI/program/Flights.txt"));
		
		List<Flight> flights = lines.map(line -> {
			String[] record = line.split(",");
			return new Flight(Integer.parseInt(record[0]),record[1],record[2],record[3]);
		}).collect(Collectors.toList());
		
//		flights.forEach(System.out::println);
		
		//Printing Details of flight no.123
//		flights.stream().filter(c -> c.getCode() == 123).forEach(System.out::println);
		
//		Printing all flights by Jet Carrier
//		flights.stream().filter(c -> c.getCarrier().contains("Jet")).forEach(System.out::println);
		
//		Print flight going pune to delhi
//		flights.stream().filter(c -> c.getSource().contains("Pune") && c.getDestination().contains("Delhi")).forEach(System.out::println);
		
//		Remove a Flight no. 342
//		for(int i=0;i<flights.size();i++) {
//			if(flights.get(i).getCode() == 342) {
//				flights.remove(i);
//				break;
//			}
//		}
//		
//		flights.stream().forEach(System.out::println);
	}
}
