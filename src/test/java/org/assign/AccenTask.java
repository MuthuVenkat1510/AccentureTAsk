package org.assign;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Scanner;

public class AccenTask {
	public static void main(String[] args) {
		RestAssured.baseURI="https://samples.openweathermap.org";
		 given().log().all().queryParam("q", "London,us").
				queryParam("appid", "b6907d289e10d714a6e88b30761fae22").
				header("Content-Type","application/json; charset=utf-8").
		when().get("/data/2.5/forecast/hourly").
		then().log().all().assertThat().statusCode(200);
		
	//	for (int k = 2; k >1; k++) {
//		JsonPath jp = new JsonPath(RawData.data());
//		int size = jp.getInt("list.size()");
//		System.out.println(size);
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the code");
//		int code = sc.nextInt();
//
//		if (code == 1) {
//			System.out.println("Enter the Date &Time (yyyy-MM-dd TT:MM:SS)");
//			Scanner sc1 = new Scanner(System.in);
//			String date = sc1.nextLine();
//			for (int j = 0; j < size; j++) {
//				String rDate = jp.getString("list[" + j + "].dt_txt");
//				if (date.contains(rDate)) {
//					String tem = jp.getString("list[" + j + "].main.temp");
//					System.out.println("Date " + rDate + "Temperature " + tem);
//					break;
//				} else {
//					System.out.println("Invalid date ");
//					break;
//				}
//			}
//
//		} else if (code == 2) {
//
//			System.out.println("Enter the Date &Time (yyyy-MM-dd TT:MM:SS)");
//			Scanner sc1 = new Scanner(System.in);
//			String date = sc1.nextLine();
//			for (int j = 0; j < size; j++) {
//				String rDate = jp.getString("list[" + j + "].dt_txt");
//				if (date.contains(rDate)) {
//					String ws = jp.getString("list[" + j + "].wind.speed");
//					System.out.println("Date " + rDate + "WindSpeed " + ws);
//					break;
//				} else {
//					System.out.println("Invalid date ");
//					break;
//				}
//			}
//		} else if (code == 3) {
//			System.out.println("Enter the Date &Time (yyyy-MM-dd TT:MM:SS)");
//			Scanner sc1 = new Scanner(System.in);
//			String date = sc1.nextLine();
//			for (int j = 0; j < size; j++) {
//				String rDate = jp.getString("list[" + j + "].dt_txt");
//				if (date.contains(rDate)) {
//					String pre = jp.getString("list[" + j + "].main.pressure");
//					System.out.println("Date " + rDate + "Pressure " + pre);
//					break;
//				} else {
//					System.out.println("Invalid date "); 
//					break;
//				}
//			}
//		} else if (code == 0) {
//			System.exit(0);
//		} else {
//			System.out.println("InvalidCode");
//		}
	//}
	}

}
