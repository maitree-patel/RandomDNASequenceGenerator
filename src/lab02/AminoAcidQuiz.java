package lab02;

import java.util.Random;
import java.util.Scanner;

public class AminoAcidQuiz 
{
	public static void main(String[] args) 
	{
		Scanner time= new Scanner(System.in);
		long start = System.currentTimeMillis();
		
		System.out.println("How long would you like the quiz to be: Enter time in seconds:");
		int total_duration = time.nextInt();
		long end = System.currentTimeMillis() + (total_duration*1000);
		
		Random random = new Random();
		
		char aa_code[] = {'A', 'R', 'N', 'D', 
				          'C', 'Q', 'E', 'G', 
				          'H', 'I', 'L', 'K', 
				          'M', 'F', 'P', 'S', 
				          'T', 'W', 'Y', 'V'};
		
		String aa_fullname[] = {"alanine", "arginine", "asparagine", "aspartic acid", 
				                "cysteine", "glutamine", "glutamic acid", "glycine", 
				                "histidine", "isoleucine", "leucine", "lysine", 
				                "methionine", "phenylalanine", "proline", "serine", 
				                "threonine", "tryptophan", "tyrosine", "valine"};

		int total_ques = 0;
		int correct = 0;
		
		while (System.currentTimeMillis() < end*1000) 
		{
			int index = random.nextInt(20);
			
			String aa_ques = aa_fullname[index];
			String aa_ans = ""+aa_code[index];
			
			System.out.println("What is the single character code for " + aa_ques + " ?");
			
			String aa_input = System.console().readLine().toUpperCase();
			total_ques += 1;
			
			if (aa_input.equals("QUIT")) 
			{
				break;
			} else if (aa_input.equals(aa_ans)) 
			{
				correct += 1;
				
				System.out.println("Right answer! Your score is now " + correct + "/" + total_ques);
			} else 
			{
				System.out.println("Wrong answer, the right answer is " + aa_ans + ". " + "Your score is now " + correct + "/" + total_ques);
			}
		}
		System.out.println("Your score report:");
		System.out.println("Total wrong = " + (total_ques-correct));
		System.out.println("Total correct = " + correct);
		System.out.println("Percentage score = " + (correct/total_ques)*100 + "%");
	}	
	
}

/*
 * Do extra credit
 * Add seconds?
 * Check all conditions
 * source: https://www.baeldung.com/java-stop-execution-after-certain-time
 */


