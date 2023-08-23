
import java.util.*;


/**
 * Class Voting_server
 */
public class Voting_server {

  //
  // Fields
  //

  private void voter_id;
  private void candidate_id;
  private void timestamp;
  
  //
  // Constructors
  //
  public Voting_server () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of voter_id
   * @param newVar the new value of voter_id
   */
  private void setVoter_id (void newVar) {
    voter_id = newVar;
  }

  /**
   * Get the value of voter_id
   * @return the value of voter_id
   */
  private void getVoter_id () {
    return voter_id;
  }

  /**
   * Set the value of candidate_id
   * @param newVar the new value of candidate_id
   */
  private void setCandidate_id (void newVar) {
    candidate_id = newVar;
  }

  /**
   * Get the value of candidate_id
   * @return the value of candidate_id
   */
  private void getCandidate_id () {
    return candidate_id;
  }

  /**
   * Set the value of timestamp
   * @param newVar the new value of timestamp
   */
  private void setTimestamp (void newVar) {
    timestamp = newVar;
  }

  /**
   * Get the value of timestamp
   * @return the value of timestamp
   */
  private void getTimestamp () {
    return timestamp;
  }

  //
  // Other methods
  //

  /**
   */
  public void send_report()
  {
  }


  /**
   */
  public void count_votes()
  {
  }


}
