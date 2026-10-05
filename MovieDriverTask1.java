/**
 *  Class: CMSC203 CRN 21352
 Program: Lab 1
 Instructor: Prof. Monshi
 Summary of Description: 
 MovieDriverTask1: Asks the user to input a movie, rating, and number of tickets sold. The user then gets to see their input.
 Due Date: 10/06/2026 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 */

package lab1;

import java.util.Scanner;

public class MovieDriverTask1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Movie movie = new Movie();
		System.out.println("Enter the name of a movie:");
		movie.setTitle(input.nextLine());
		System.out.println("Enter the rating of the movie:");
		movie.setRating(input.nextLine());
		System.out.println("Enter the number of tickets sold for this movie:");
		movie.setSoldTickets(input.nextInt());
		System.out.println(movie);
		System.out.println("Goodbye");
		input.close();
	}

}
