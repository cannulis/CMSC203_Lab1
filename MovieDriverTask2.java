/**
 *  Class: CMSC203 CRN 21352
 Program: Lab 1
 Instructor: Prof. Monshi
 Summary of Description:
 MovieDriverTask2: Asks the user to input a movie, rating, and number of tickets sold. The user then gets to see their input. Then asks the user if they want to input another movie. If so, the user gets to input another movie. If not, the program ends.
 Due Date: 10/06/2026 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 */

package lab1;

import java.util.Scanner;

public class MovieDriverTask2 
{

	public static void main(String[] args) 
	{
		
		boolean bool;
		Scanner input = new Scanner(System.in);
		Movie movie = new Movie();
		
		do 
		{
			System.out.println("Enter the name of a movie:");
			movie.setTitle(input.nextLine());
			System.out.println("Enter the rating of the movie:");
			movie.setRating(input.nextLine());
			System.out.println("Enter the number of tickets sold for this movie:");
			movie.setSoldTickets(input.nextInt());
			System.out.println(movie);
			System.out.println("Do you want to enter another? (y or n):");
			char nextChar = input.next().charAt(0);
			
			do
			{
				if ((nextChar == 'y' || nextChar == 'n'))
					bool = false;
				else
				{
					System.out.println("You have entered the wrong input.");
					System.out.println("Do you want to enter another? (y or n):");
					nextChar = input.next().charAt(0);
					bool = true;
				}
			} while (bool);
			
			if (nextChar == 'y')
				bool = true;
			else
				bool = false;
			
			input.nextLine();
			} while (bool);
		
			System.out.println("Goodbye");
			input.close();
	}

}
