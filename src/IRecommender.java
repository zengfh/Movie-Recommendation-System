/**
 * Created by Fanhui
 */

import java.util.ArrayList;


/**
 * <p>
 * When users first visit the recommender website, our code will call the
 * method <code>getItemsToRate()</code> to get a list of movies to display
 * on the web page for users to rate.
 * <p>
 * When a user submits their ratings, our code will call the method <code>
 * printRecommendationsFor</code> to get the recommendations based on the
 * user's ratings.  The ID given to this method is for a new Rater that we
 * have already added to the RaterDatabase with ratings for the movies
 * returned by the first method.  Whatever is printed from that method will
 * be displayed on the web page: HTML, plain text, or debugging information.
 */
public interface IRecommender {
    /**
     * This method returns a list of movie IDs that will be used to look up
     * the movies in the MovieDatabase and present them to users to rate.
     * <p>
     * The movies returned in the list will be displayed on a web page.
     * <p>
     * The ratings for these movies will make the profile for a new Rater
     * that will be used to compare to for finding recommendations.
     */
    public ArrayList<String> getItemsToRate();

    /**
     * This method returns nothing, but prints out an HTML table of the
     * movies recommended for the given rater.
     *
     * @param webRaterID the ID of a new Rater that has been already added to
     *                   the RaterDatabase with ratings for the movies returned by the
     *                   method getItemsToRate
     */
    public void printRecommendationsFor(String webRaterID);
}
