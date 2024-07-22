import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		/* Declaration Section */
    Scanner keyboard;
    NetflixOriginal[] shows;

    /*Initialization Section */
    keyboard = new Scanner(System.in);
    shows = new NetflixOriginal[2];

    //call method to fill each show in array then output
    for(int i = 0; i < shows.length; i++)
    {
      shows[i] = instantiateFromInput(keyboard); //fill from user input
      System.out.println(shows[i]); //output show
    }

	}

  /**DESCRIPTION: Creates a NetflixOriginal and sets the instance variables using user input. */
  public static NetflixOriginal instantiateFromInput(Scanner key)
  {
    //declare
    NetflixOriginal show;
    String strInput;
    double dblInput;
    boolean isValid;

    //instantiate/initialize
    show = new NetflixOriginal();
    strInput = "";
    dblInput = 0.0;

    //get user input for name
    System.out.print("Please enter the name of the show: ");
    strInput = key.nextLine();
    //set instance variable
    show.setName(strInput);

    //loop using do-while to get valid user input for starRating
    do
    {
      //get user input for starRating
      System.out.print("Please enter the star rating: ");
      // nextDouble() then clear the buffer
      // nextLine() then convert to a double : I'm using this one
      strInput = key.nextLine(); //get String from user
      dblInput = Double.parseDouble(strInput); //convert to double
      // try to set instance variable, repeat if not valid
    }while(!show.setStarRating(dblInput));

    //loop using do-while to get valid user input for genre
    do
    {
      //get user input for genre
      System.out.print("Please enter the genre: ");
      strInput = key.nextLine();
      // try to set instance variable, repeat if not valid
      isValid = show.setGenre(strInput);
    }while(!isValid);

    return show;
  }

}