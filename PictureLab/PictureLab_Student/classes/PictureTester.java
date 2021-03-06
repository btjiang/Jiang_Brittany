/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorVertical();
    redMotorcycle.explore();
  }
  
   public static void testMirrorVerticalRightToLeft()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorVerticalRightToLeft();
    redMotorcycle.explore();
  }
  
 public static void testMirrorHorizontal()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
    redMotorcycle.explore();
  }
  
    public static void testMirrorHorizontalBotToTop()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontalBotToTop();
    redMotorcycle.explore();
  }
  
   public static void testDiagonal()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorDiagonal();
    redMotorcycle.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
	
 public static void testMirrorArms()
  {
	  Picture snow = new Picture("snowman.jpg");
	  snow.explore();
	  snow.mirrorArms();
	  snow.explore();
  }
  public static void testMirrorGull()
  {
	Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  public static void testkeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.Negate();
	  beach.explore();
  }
  
  public static void testgrayscale()
  {
	   Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
   
    public static void testfixUnderwater()
  {
		Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
    public static void testmyCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testkeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testgrayscale();
    //testfixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	testmyCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
