/*name: Shaziah Gafur
purpose: Unit 5 game
date: June 13th

passwords:
Stage2: Asteroid
Stage3: Comets

Sources:
http://thumbs.dreamstime.com/z/cartoon-mercury-sign-illustration-planet-holding-47066145.jpg
http://starchild.gsfc.nasa.gov/docs/StarChild/solar_system_level1/mercury.html
http://www.solstation.com/stars/venus.htm
http://www.dreamstime.com/photos-images/cartoon-venus-planet-character.html
http://www.clipartpanda.com/categories/earth-clipart-black-and-white
http://www.dreamstime.com/stock-photo-smiling-planet-earth-cartoon-image2794720
http://www.dreamstime.com/stock-illustration-cartoon-mars-planet-character-happy-smiling-blue-outer-space-background-bright-stars-rocket-flying-eps-file-image53352598
https://pixabay.com/en/cartoon-cosmos-mars-planet-red-1298905/
http://spaceplace.nasa.gov/europa/en/
https://www.pinterest.com/maryc1138/eci201/
http://clubpenguin.wikia.com/wiki/File:Beta_Team_Solar_System_Saturn.png
https://www.pinterest.com/pin/171066485819625551/
http://www.toonvectors.com/clip-art/angry-cartoon-uranus/5425
http://space-facts.com/uranus/
http://www.freeimages.com/premium/sad-cartoon-neptune-179287
https://www.pinterest.com/pin/561683384752904173/



*/
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class theSpaceRace extends Applet implements ActionListener
{
    Panel panel;
    int player;
    int val = 0;
    int computer;
    int f[];
    int turn = 1;
    Panel card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, stage3, stage2, stage1, Minesweeper, weight, Mastermind, solar, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;
    JPasswordField p;
    JPasswordField c;
    JTextArea yourTurn;
    int guess = 36;
    JLabel yourWeight;
    int Weight;
    JComboBox planets;
    int x1, x2, y1, y2;
    Panel m;
    JButton check;
    JButton[] b;
    JButton[] ab;
    JButton[] guesses;
    int counter = 1;
    int d[];
    JLabel correct[];
    int array[] = new int [4];
    boolean win;
    CardLayout cdLayout = new CardLayout ();
    JTextArea rolled;
    JLabel a[] = new JLabel [100];
    JButton Continue, instructions;
    JButton dice;
    JTextArea location;
    JComboBox minLevels;
    String minLevels_s;
    String level = "Hard";
    ImageIcon image0 = new ImageIcon ("Min0icon.jpg");
    ImageIcon image1 = new ImageIcon ("Min1icon.jpg");
    ImageIcon image2 = new ImageIcon ("Min2icon.jpg");
    ImageIcon image3 = new ImageIcon ("Min3icon.jpg");
    ImageIcon image4 = new ImageIcon ("Min4icon.jpg");
    ImageIcon image5 = new ImageIcon ("Min5icon.jpg");
    ImageIcon image6 = new ImageIcon ("Min6icon.jpg");
    ImageIcon image7 = new ImageIcon ("Min7icon.jpg");
    ImageIcon image8 = new ImageIcon ("Min8icon.jpg");
    ImageIcon master0 = new ImageIcon ("Planet0.jpg");
    ImageIcon master1 = new ImageIcon ("Planet1.jpg");
    ImageIcon master2 = new ImageIcon ("Planet2.jpg");
    ImageIcon master3 = new ImageIcon ("Planet3.jpg");
    ImageIcon master4 = new ImageIcon ("Planet4.jpg");
    ImageIcon master5 = new ImageIcon ("Planet5.jpg");
    ImageIcon master6 = new ImageIcon ("Planet6.jpg");
    ImageIcon master7 = new ImageIcon ("Planet7.jpg");


    public void init ()
    {
	resize (700, 600);
	panel = new Panel ();
	panel.setLayout (cdLayout);
	home ();
	story1 ();
	story2 ();
	story3 ();
	story4 ();
	story5 ();
	story6 ();
	game ();
	More ();
	Stage3 ();
	Minesweeper ();
	Mastermind ();
	Stage2 ();
	SolarSystem ();
	Mercury ();
	Venus ();
	Earth ();
	Mars ();
	checkWeight ();
	Jupiter ();
	Saturn ();
	Uranus ();
	Neptune ();
	setLayout (new BorderLayout ());
	add ("Center", panel);

    }


    public void home ()//homescreen
    {
	card1 = new Panel ();
	card1.setBackground (Color.black);
	JLabel img = new JLabel (createImageIcon ("homescreen.jpg"));
	JButton play = new JButton (createImageIcon ("play.jpg"));
	JButton more = new JButton (createImageIcon ("More_games.jpg"));
	play.setPreferredSize (new Dimension (150, 123));
	play.addActionListener (this);
	play.setActionCommand ("play");
	more.addActionListener (this);
	more.setActionCommand ("more");
	more.setPreferredSize (new Dimension (150, 126));
	card1.add (img);
	card1.add (play);
	card1.add (more);
	panel.add ("home", card1);


    }


    public void story1 ()//first screen of background story
    {
	card2 = new Panel ();
	card2.setBackground (Color.black);
	JLabel img = new JLabel (createImageIcon ("story1.jpg"));
	card2.add (img);
	JTextArea text = new JTextArea ("                                        There once was an astronaut named                          \n                                        Bob. He was travelling through space.                                         \n\n");
	text.setBackground (Color.black);
	text.setForeground (Color.white);
	text.setFont (new Font ("Corbel", Font.PLAIN, 20));
	card2.add (text);
	JButton back = new JButton (createImageIcon ("Back.jpg"));
	back.setPreferredSize (new Dimension (60, 41));
	back.addActionListener (this);
	back.setActionCommand ("home");
	card2.add (back);
	JButton next = new JButton (createImageIcon ("Next.jpg"));
	next.setPreferredSize (new Dimension (60, 42));
	next.addActionListener (this);
	next.setActionCommand ("next1");
	JButton skip = new JButton (createImageIcon ("Skip.jpg"));
	skip.setPreferredSize (new Dimension (60, 41));
	skip.addActionListener (this);
	skip.setActionCommand ("game");
	card2.add (skip);
	card2.add (next);
	panel.add ("story1", card2);
    }


    public void story2 ()//second screen of background story
    {
	card3 = new Panel ();
	card3.setBackground (Color.black);
	JLabel img = new JLabel (createImageIcon ("story2.jpg"));
	card3.add (img);
	JTextArea text = new JTextArea ("                                          He accidentally entered a worm hole.                                            \n\n\n");
	text.setBackground (Color.black);
	text.setForeground (Color.white);
	text.setFont (new Font ("Corbel", Font.PLAIN, 20));
	card3.add (text);
	JButton next = new JButton (createImageIcon ("Next.jpg"));
	next.setPreferredSize (new Dimension (60, 42));
	next.addActionListener (this);
	next.setActionCommand ("next2");
	JButton back = new JButton (createImageIcon ("Back.jpg"));
	back.setPreferredSize (new Dimension (60, 41));
	back.addActionListener (this);
	back.setActionCommand ("back1");
	card3.add (back);
	card3.add (next);
	panel.add ("story2", card3);
    }


    public void story3 ()//third screen of background story
    {
	card4 = new Panel ();
	card4.setBackground (Color.black);
	JLabel img = new JLabel (createImageIcon ("story3.jpg"));
	card4.add (img);
	JTextArea text = new JTextArea ("                                        His spaceship crashed on Neptune                                                   \n\n\n");
	text.setBackground (Color.black);
	text.setForeground (Color.white);
	text.setFont (new Font ("Corbel", Font.PLAIN, 20));
	card4.add (text);
	JButton next = new JButton (createImageIcon ("Next.jpg"));
	next.setPreferredSize (new Dimension (60, 42));
	next.addActionListener (this);
	next.setActionCommand ("next3");
	JButton back = new JButton (createImageIcon ("Back.jpg"));
	back.setPreferredSize (new Dimension (60, 41));
	back.addActionListener (this);
	back.setActionCommand ("back2");
	card4.add (back);
	card4.add (next);
	panel.add ("story3", card4);
    }


    public void story4 () //fourth screen of background story
    {
	card5 = new Panel ();
	card5.setBackground (Color.black);
	JLabel img = new JLabel (createImageIcon ("story4.jpg"));
	card5.add (img);
	JTextArea text = new JTextArea ("                                          The aliens took him as prisoner.                                                      \n\n\n");
	text.setBackground (Color.black);
	text.setForeground (Color.white);
	text.setFont (new Font ("Corbel", Font.PLAIN, 20));
	card5.add (text);
	JButton next = new JButton (createImageIcon ("Next.jpg"));
	next.setPreferredSize (new Dimension (60, 42));
	next.addActionListener (this);
	next.setActionCommand ("next4");
	JButton back = new JButton (createImageIcon ("Back.jpg"));
	back.setPreferredSize (new Dimension (60, 41));
	back.addActionListener (this);
	back.setActionCommand ("back3");
	card5.add (back);
	card5.add (next);
	panel.add ("story4", card5);
    }


    public void story5 ()//fifth screen of background story
    {
	card6 = new Panel ();
	card6.setBackground (Color.black);
	JLabel img = new JLabel (createImageIcon ("story5.jpg"));
	card6.add (img);
	JTextArea text = new JTextArea ("                                           Bobby overhears their conversation\n                                           of taking over the world. He\n                                           realizes that he needs to warn his\n                                           fellow earthlings. He breaks out of\n                                           the prison cell.                                                                                            ");
	text.setBackground (Color.black);
	text.setForeground (Color.white);
	text.setFont (new Font ("Corbel", Font.PLAIN, 20));
	card6.add (text);
	JButton next = new JButton (createImageIcon ("Next.jpg"));
	next.setPreferredSize (new Dimension (60, 42));
	next.addActionListener (this);
	next.setActionCommand ("next5");
	JButton back = new JButton (createImageIcon ("Back.jpg"));
	back.setPreferredSize (new Dimension (60, 41));
	back.addActionListener (this);
	back.setActionCommand ("back4");
	card6.add (back);
	card6.add (next);
	panel.add ("story5", card6);
    }


    public void story6 ()//sixth screen of background story
    {
	card8 = new Panel ();
	card8.setBackground (Color.black);
	JLabel img = new JLabel (createImageIcon ("story6.jpg"));
	card8.add (img);
	JTextArea text = new JTextArea ("                                           Oh no! The aliens are taking off.\n                                           The earthlings are in great danger.                                           \n\n");
	text.setBackground (Color.black);
	text.setForeground (Color.white);
	text.setFont (new Font ("Corbel", Font.PLAIN, 20));
	card8.add (text);
	JButton play = new JButton (createImageIcon ("playgame.jpg"));
	play.setPreferredSize (new Dimension (60, 41));
	play.addActionListener (this);
	play.setActionCommand ("game");
	JButton back = new JButton (createImageIcon ("Back.jpg"));
	back.setPreferredSize (new Dimension (60, 41));
	back.addActionListener (this);
	back.setActionCommand ("back5");
	card8.add (back);
	card8.add (play);
	panel.add ("story6", card8);
    }


    public void Mercury ()//second screen of Stage 1. User learns about Mercury
    {
	mercury = new Panel ();
	JLabel title = new JLabel ("                                                  Mercury                                                      ");
	JTextArea content = new JTextArea ("Mercury is the closest planet to the Sun.\nIt is mostly made of iron and has a very\n thin silicate crust. Mercury is a very\nsmall planet and has too little gravity\nto hold an atmosphere. The surface of\nMercury is about 427 degrees Celsius.");
	JLabel pic = new JLabel (createImageIcon ("mercury.jpg"));
	JButton next = new JButton (createImageIcon ("next.jpg"));
	next.addActionListener (this);
	next.setActionCommand ("venus");
	mercury.setBackground (new Color (162, 170, 185));
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	title.setBackground (new Color (162, 170, 185));
	content.setBackground (new Color (162, 170, 185));
	mercury.add (title);
	next.setPreferredSize (new Dimension (60, 45));
	mercury.add (pic);
	mercury.add (content);
	mercury.add (next);
	panel.add ("mercury", mercury);
    }


    public void Venus ()//third screen of Stage 1. User learns about Venus
    {
	venus = new Panel ();
	JLabel title = new JLabel ("                                                  Venus                                                      ");
	JTextArea content = new JTextArea ("I'm the brightest planet in the Solar \nSystem. It is very hot over here. There\nare many volcanoes and mountains. Many\npeople say that I am Earth's sister \nbecause we both are similar in size,\ndensity and chemistry. However, I am a\ndeadly planet because the atmosphere is\nthick and mostly contains carbon dioxide.");
	JLabel pic = new JLabel (createImageIcon ("venus.jpg"));
	JButton next = new JButton (createImageIcon ("next.jpg"));
	next.addActionListener (this);
	next.setActionCommand ("earth");
	venus.setBackground (new Color (162, 170, 185));
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	title.setBackground (new Color (162, 170, 185));
	content.setBackground (new Color (162, 170, 185));
	venus.add (title);
	next.setPreferredSize (new Dimension (60, 45));
	venus.add (pic);
	venus.add (content);
	venus.add (next);
	panel.add ("venus", venus);
    }


    public void Earth ()//fourth screen of Stage 1. User learns about Earth
    {
	earth = new Panel ();
	JLabel title = new JLabel ("                                                  Earth                                                      ");
	JTextArea content = new JTextArea ("I am the Earth, the planet that you\nlive on. My temperature, weather and\natmosphere allow life to exist. Because\nof human activities, my climate is\nchanging and the planet is\ndeteriorating.");
	JLabel pic = new JLabel (createImageIcon ("earth.jpg"));
	JButton next = new JButton (createImageIcon ("next.jpg"));
	next.addActionListener (this);
	next.setActionCommand ("mars");
	earth.add (title);
	earth.setBackground (new Color (162, 170, 185));
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	title.setBackground (new Color (162, 170, 185));
	content.setBackground (new Color (162, 170, 185));
	next.setPreferredSize (new Dimension (60, 45));
	earth.add (pic);
	earth.add (content);
	earth.add (next);
	panel.add ("earth", earth);
    }


    public void Mars ()//fifth screen of Stage 1. User learns about Mars
    {
	mars = new Panel ();
	JLabel title = new JLabel ("                                                  Mars                                                      ");
	JTextArea content = new JTextArea ("Because of my colour, I am known\nas the Red Planet. My temperature\nis most similar to Earth's than any\nother planet in the Solar System.\nThe only water you can find is\neither frozen or underground.");
	JLabel pic = new JLabel (createImageIcon ("Mars.jpg"));
	JButton next = new JButton (createImageIcon ("next.jpg"));
	next.addActionListener (this);
	next.setActionCommand ("jupiter");
	mars.setBackground (new Color (162, 170, 185));
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	title.setBackground (new Color (162, 170, 185));
	content.setBackground (new Color (162, 170, 185));
	next.setPreferredSize (new Dimension (60, 45));
	mars.add (title);
	mars.add (pic);
	mars.add (content);
	mars.add (next);
	panel.add ("mars", mars);
    }


    public void Jupiter () //sixth screen of Stage 1. User learns Jupiter
       {
	jupiter = new Panel ();
	JLabel title = new JLabel ("                                                  Jupiter                                                      ");
	JTextArea content = new JTextArea ("I am the largest planet in the solar\nsystem. The Earth can fit inside me\n1000 times. There are many storms that\noccur throughout the atmosphere. I do\nnot have a solid surface. Under my\natmosphere is a large liquid ocean\nof hydrogen and water.");
	JLabel pic = new JLabel (createImageIcon ("Jupiter.jpg"));
	JButton next = new JButton (createImageIcon ("next.jpg"));
	next.addActionListener (this);
	next.setActionCommand ("saturn");
	jupiter.setBackground (new Color (162, 170, 185));
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	title.setBackground (new Color (162, 170, 185));
	content.setBackground (new Color (162, 170, 185));
	next.setPreferredSize (new Dimension (60, 45));
	jupiter.add (title);
	jupiter.add (pic);
	jupiter.add (content);
	jupiter.add (next);
	panel.add ("jupiter", jupiter);
    }


    public void Saturn ()//seventh screen of Stage 1. User learns about Saturn
    {
	saturn = new Panel ();
	JLabel title = new JLabel ("                                                  Saturn                                                      ");
	JTextArea content = new JTextArea ("I am the second largest planet of the\nSolar System. Under my clouds of methane,\nhydrogen and helium, the sky is a giant\nocean of liquid chemicals. I am mostly \nmade up of hydrogen and helium. I am\nwell-known for my rings.");
	JLabel pic = new JLabel (createImageIcon ("Saturn.jpg"));
	JButton next = new JButton (createImageIcon ("next.jpg"));
	next.addActionListener (this);
	next.setActionCommand ("uranus");
	saturn.setBackground (new Color (162, 170, 185));
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	title.setBackground (new Color (162, 170, 185));
	content.setBackground (new Color (162, 170, 185));
	next.setPreferredSize (new Dimension (60, 45));
	saturn.add (title);
	saturn.add (pic);
	saturn.add (content);
	saturn.add (next);
	panel.add ("saturn", saturn);
    }


    public void Uranus ()//eighth screen of Stage 1. User learns about Uranus
    {
	uranus = new Panel ();
	JLabel title = new JLabel ("                                                  Uranus                                                      ");
	JTextArea content = new JTextArea ("I am a funny planet because I spin\non my side. My thick atmosphere is\nmade up of methane, hydrogen, and\nhelium. I am extremely cold. I am\nalmost identical to the planet\nNeptune.");
	JLabel pic = new JLabel (createImageIcon ("Uranus.jpg"));
	JButton next = new JButton (createImageIcon ("next.jpg"));
	next.addActionListener (this);
	next.setActionCommand ("neptune");
	uranus.setBackground (new Color (162, 170, 185));
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	title.setBackground (new Color (162, 170, 185));
	content.setBackground (new Color (162, 170, 185));
	next.setPreferredSize (new Dimension (60, 45));
	uranus.add (title);
	uranus.add (pic);
	uranus.add (content);
	uranus.add (next);
	panel.add ("uranus", uranus);
    }


    public void Neptune ()//ninth screen of Stage 1. User learns about Neptune
    {
	neptune = new Panel ();
	neptune.setBackground (new Color (162, 170, 185));
	JLabel title = new JLabel ("                                          Neptune                                                      ");
	JTextArea content = new JTextArea ("My atmosphere contains hydrogen,\nhelium, and methane. There is a \nlarge white cloud that moves around\nthe atmosphere which is named \n\"Scooter\". No other planet in \nthe Solar System has winds that \nare as strong as mine.");
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	JLabel pic = new JLabel (createImageIcon ("Neptune.jpg"));
	JButton next = new JButton (createImageIcon ("next.jpg"));
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	neptune.setBackground (new Color (162, 170, 185));
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	title.setBackground (new Color (162, 170, 185));
	content.setBackground (new Color (162, 170, 185));
	next.addActionListener (this);
	next.setActionCommand ("weight");
	next.setPreferredSize (new Dimension (60, 45));
	neptune.add (title);
	neptune.add (pic);
	neptune.add (content);
	neptune.add (next);
	panel.add ("neptune", neptune);
    }


    public void checkWeight ()//User inputs their weight an finds out their weight on other planets.
    {
	weight = new Panel ();
	weight.setBackground (new Color (165, 186, 226));
	JLabel title = new JLabel ("     How much would you weigh on other planets?           ");
	JLabel text = new JLabel ("Choose your planet");
	text.setFont (new Font ("Corbel", Font.PLAIN, 15));
	String[] options = {"Mercury", "Venus", "Mars",
	    "Jupiter", "Saturn", "Uranus", "Neptune"};
	JComboBox box = new JComboBox (options);
	box.setSelectedIndex (0);
	title.setFont (new Font ("Britannic Bold", Font.PLAIN, 30));
	JButton more = new JButton ("More Games");
	more.setFont (new Font ("Times New Roman", Font.PLAIN, 20));
	more.setActionCommand ("More");
	more.addActionListener (this);
	more.setForeground (new Color (255, 128, 255));
	more.setBackground (new Color (108, 0, 108));
	box.setActionCommand ("box");
	box.addActionListener (this);
	weight.add (title);
	weight.add (text);
	weight.add (box);        
	yourWeight = new JLabel ("                                                                          ");
	yourWeight.setFont (new Font("MV Boli", Font.PLAIN, 15));
	yourWeight.setForeground (new Color (0, 0, 100));
	weight.add (yourWeight);
	weight.add (more);
	panel.add ("weight", weight);
    }


    public void SolarSystem ()//first screen of Stage 1. User learns about the Solar System.
    {
	solar = new Panel ();
	solar.setBackground (new Color (162, 170, 185));
	JTextArea title = new JTextArea ("                            Let's learn about the Solar System!                       \n\n\n");
	title.setFont (new Font ("Eras Demi ITC", Font.PLAIN, 30));
	title.setForeground (new Color (2, 5, 123));
	title.setBackground (new Color (162, 170, 185));
	JTextArea content = new JTextArea ("There are 8 planets in the solar system.\nThey orbit around the Sun. The\nSolar system is also made of moons,\ncomets, and asteroids. The Sun has a\nvery strong gravitational pull. It\npulls all the surrounding planets towards\nitself.");
	content.setFont (new Font ("Corbel", Font.PLAIN, 15));
	content.setBackground (new Color (162, 170, 185));
	JLabel pic = new JLabel (createImageIcon ("solar.jpg"));
	JButton next = new JButton (createImageIcon ("next.jpg"));
	next.addActionListener (this);
	next.setActionCommand ("mercury");
	next.setPreferredSize (new Dimension (60, 45));
	solar.add (title);
	solar.add (pic);
	solar.add (content);
	solar.add (next);
	panel.add ("solar", solar);
    }


    public void Stage3 ()//User enters the password in order to play Mastermind
    {
	stage3 = new Panel ();
	JLabel enter = new JLabel ("Enter the password:");
	JButton back = new JButton ("Back");
	back.setActionCommand ("more");
	back.addActionListener (this);
	enter.setFont (new Font ("Calibri", Font.PLAIN, 20));
	enter.setForeground (Color.cyan);
	stage3.setBackground (new Color (40, 70, 150));
	c = new JPasswordField (10);
	JButton done = new JButton ("Done");
	done.setActionCommand ("done2");
	done.addActionListener (this);
	done.setBackground (new Color (255, 38, 0));
	done.setForeground (new Color (245, 166, 139));
	back.setForeground (new Color (45, 99, 37));
	back.setBackground (new Color (108, 237, 90));
	done.setFont (new Font ("Baskerville Old Face", Font.PLAIN, 20));
	back.setFont (new Font ("Baskerville Old Face", Font.PLAIN, 20));
	stage3.add (enter);
	stage3.add (c);
	stage3.add (done);
	stage3.add (back);
	panel.add ("stage3", stage3);

    }


    public void Minesweeper ()//The game of Minesweeper
    {
	Minesweeper = new Panel ();
	Minesweeper.setBackground (Color.black);
	instructions = new JButton ("How to Play");
	instructions.addActionListener (this);
	instructions.setForeground (new Color (45, 99, 37));
	instructions.setBackground (new Color (108, 237, 90));
	instructions.setFont (new Font ("Baskerville Old Face", Font.PLAIN, 20));
	instructions.setActionCommand ("MinesweeperInstructions");
	Minesweeper.add (instructions);
	m = new Panel (new GridLayout (10, 10));
	b = new JButton [100];
	JButton moreGames = new JButton ("More Games");
	JButton home = new JButton ("Home");
	home.setFont (new Font ("Times New Roman", Font.PLAIN, 20));
	home.setForeground (new Color (146, 232, 250));
	home.setBackground (new Color (5, 113, 177));
	moreGames.setFont (new Font ("Times New Roman", Font.PLAIN, 20));
	moreGames.setForeground (new Color (255, 157, 255));
	moreGames.setBackground (new Color (108, 0, 108));
	moreGames.setActionCommand ("more");
	moreGames.addActionListener (this);
	home.setActionCommand ("home");
	home.addActionListener (this);
	for (int i = 0 ; i < b.length ; i++)//100 buttons in a grid
	{
	    b [i] = new JButton ("");
	    b [i].setPreferredSize (new Dimension (40, 40));
	    b [i].setActionCommand ("Min" + i);
	    b [i].addActionListener (this);
	    m.add (b [i]);
	}
	Minesweeper.add (m);
	Minesweeper.add (home);
	Minesweeper.add (moreGames);
	int c[] = selectNum ();
	d = new int [100];
	for (int i = 0 ; i < d.length ; i++)//assigns all values as 1.
	    d [i] = 1;
	for (int i = 0 ; i < c.length ; i++)//assigns certain values as 0. A value of 0 is a black hole square. A value of 1 is a safe square.
	    d [c [i] - 1] = 0;
	panel.add ("Minesweeper", Minesweeper);
    }


    public int[] selectNum ()
    {
	int ac[] = new int [10];
	for (int i = 0 ; i < ac.length ; i++)//selects random numbers between 1 and 91
	    ac [i] = (int) (Math.random () * 91 + 1);
	for (int i = ac.length - 1 ; i > 0 ; i--)//selection sort
	{
	    int max = 0;
	    for (int j = 0 ; j < ac.length ; j++)
		if (ac [max] < ac [i])
		    max = i;
	    int temp = ac [max];
	    ac [max] = ac [i];
	    ac [i] = temp;
	}
	for (int i = 0 ; i < ac.length ; i++)//increments each value by a different number
	    ac [i] += i;
	return ac;
    }



    public void Stage2 ()//User enters password to play Minesweeper
    {
	stage2 = new Panel ();
	JLabel enter = new JLabel ("Enter the password:");
	JButton back = new JButton ("Back");
	back.setActionCommand ("more");
	back.addActionListener (this);
	enter.setFont (new Font ("Calibri", Font.PLAIN, 20));
	enter.setForeground (Color.cyan);
	stage2.setBackground (new Color (50, 83, 200));
	p = new JPasswordField (10);
	JButton done = new JButton ("Done");
	done.setActionCommand ("done1");
	done.addActionListener (this);
	done.setFont (new Font ("Baskerville Old Face", Font.PLAIN, 20));
	back.setFont (new Font ("Baskerville Old Face", Font.PLAIN, 20));
	done.setBackground (new Color (255, 38, 0));
	done.setForeground (new Color (245, 166, 139));
	back.setForeground (new Color (45, 99, 37));
	back.setBackground (new Color (108, 237, 90));
	stage2.add (enter);
	stage2.add (p);
	stage2.add (done);
	stage2.add (back);
	panel.add ("stage2", stage2);
    }


    public void Mastermind ()//The game of Masterming
    {
	Mastermind = new Panel ();
	Mastermind.setBackground (Color.black);
	Panel p = new Panel (new GridLayout (4, 2));
	for (int i = 0 ; i < 4 ; i++)//randomly assigns secret values between 0 and 7. The user tries to guess these values througout the game. 
	    array [i] = (int) (Math.random () * 7);
	Panel n = new Panel (new GridLayout (10, 4));
	guesses = new JButton [40];
	for (int i = 0 ; i < guesses.length ; i++)//sets the default icon as a blackhole image
	{
	    guesses [i] = new JButton (createImageIcon ("blackhole.jpg"));
	    guesses [i].setPreferredSize (new Dimension (40, 40));
	    guesses [i].setBackground (Color.black);
	    n.add (guesses [i]);
	}
	Panel w = new Panel (new GridLayout (20, 2));
	correct = new JLabel [40];
	for (int i = 0 ; i < correct.length ; i++)//sets the defaut icon as an empty brown square
	{
	    correct [i] = new JLabel (createImageIcon ("brown.jpg"));
	    w.add (correct [i]);
	}
	Mastermind.add (n);
	Mastermind.add (w);
	ab = new JButton [8];
	JButton newMaster = new JButton ("New Game");
	newMaster.setActionCommand ("newMaster");
	newMaster.addActionListener (this);
	Mastermind.add (newMaster);
	for (int i = 0 ; i < ab.length ; i++)//sets up the buttons with planets that the user can choose from
	{
	    ab [i] = new JButton ("");
	    ab [i].addActionListener (this);
	    ab [i].setPreferredSize (new Dimension (40, 40));
	    ab [i].setActionCommand ("planetSelect" + i);
	    ab [i].setIcon (createImageIcon ("Planet" + i + ".jpg"));
	    p.add (ab [i]);
	}
	Mastermind.add (p);
	check = new JButton ("Check");
	check.setActionCommand ("check");
	check.addActionListener (this);
	check.setBackground (new Color (255, 38, 0));
	check.setForeground (new Color (245, 166, 139));
	newMaster.setForeground (new Color (45, 99, 37));
	newMaster.setBackground (new Color (108, 237, 90));
	check.setFont (new Font ("Baskerville Old Face", Font.PLAIN, 20));
	newMaster.setFont (new Font ("Baskerville Old Face", Font.PLAIN, 20));
	check.setEnabled (false);
	Mastermind.add (check);
	panel.add ("Mastermind", Mastermind);
    }


    public void More ()
    {
	card9 = new Panel ();
	JButton a[] = new JButton [3];
	card9.setBackground (new Color (135, 194, 226));
	for (int i = 0 ; i < a.length ; i++)//sets up 3 different buttons, each for a different stage
	{
	    a [i] = new JButton ("Stage " + (i + 1));
	    a [i].setActionCommand ("stage" + (i + 1));
	    a [i].addActionListener (this);
	    a [i].setFont (new Font ("Algerian", Font.PLAIN, 30));
	    card9.add (a [i]);
	}
	JButton back = new JButton ("Back");
	back.setActionCommand ("home");
	back.addActionListener (this);
	back.setForeground (new Color (173, 159, 198));
	back.setBackground (new Color (0, 0, 210));
	a [0].setForeground (new Color (160, 183, 224));
	a [0].setBackground (new Color (36, 63, 111));
	a [1].setForeground (new Color (170, 166, 159));
	a [1].setBackground (Color.black);
	a [2].setForeground (new Color (204, 200, 203));
	a [2].setBackground (Color.blue);
	card9.add (back);

	panel.add ("more", card9);
    }


    public void game ()
    {
	card10 = new Panel ();
	player = 1;
	computer = 1;
	card10.setBackground (Color.black);
	win = false;
	Panel p = new Panel (new GridLayout (10, 10));
	JLabel title = new JLabel ("                                 Rockets & UFOs                                           ");
	title.setFont (new Font ("Britannic Bold", Font.PLAIN, 30));
	title.setForeground (Color.white);
	card10.add (title);
	int n = 0;
	for (int i = 0 ; i < 10 ; i++)//sets icons to create a whole board game appearance. Each individual square has a separate icon. 
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		a [n] = new JLabel (createImageIcon ("boards2 [www.imagesplitter.net]-" + i + "-" + j + ".jpeg"));
		a [n].setPreferredSize (new Dimension (40, 40));
		p.add (a [n]);
		n++;
	    }
	}

	a [90].setIcon (createImageIcon ("bobbyicon.jpg"));
	JButton more = new JButton ("More Games");
	more.setActionCommand ("more");
	more.addActionListener (this);
	location = new JTextArea ("Your score: " + player + "   Aliens' score: " + computer + "                     ");
	location.setFont (new Font ("Times New Roman", Font.PLAIN, 20));
	location.setForeground (new Color (137, 172, 237));
	location.setBackground (Color.black);
	yourTurn = new JTextArea ("                                                                  ");
	yourTurn.setFont (new Font ("Corbel", Font.PLAIN, 15));
	yourTurn.setBackground (Color.black);
	yourTurn.setForeground (Color.white);
	dice = new JButton (createImageIcon ("dice.jpg"));
	dice.setPreferredSize (new Dimension (100, 100));
	dice.setActionCommand ("roll");
	dice.addActionListener (this);
	Continue = new JButton ("Continue");
	Continue.setEnabled (false);
	Continue.setActionCommand ("continue");
	Continue.addActionListener (this);
	card10.add (Continue);
	card10.add (p);
	card10.add (dice);
	card10.add (Continue);
	card10.add (location);
	card10.add (yourTurn);
	panel.add ("game", card10);





    }


    public void BtoPic (int n)//sets a square that the user or computer has left back to the original image
    {
	a [n].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-" + n / 10 + "-" + n % 10 + ".jpeg"));

    }


    /*    public int AtoB (int n)  //computer to user
	{
	    int x = 9 - (n / 10);
	    if (x % 2 == 0)
	    {
		x *= 10;
		x += (n % 10) + 1;
	    }
	    else
	    {
		x *= 10;
		x += (10 - (n % 10));
	    }
	    return x;
	}
    */  //not neccessary

    public int BtoA (int n) //converts the user's/computer's score to the index value of the array
    {
	int x = 9 - ((n - 1) / 10);
	if (x % 2 == 1)
	{
	    x *= 10;
	    x += (n - 1) % 10;
	}


	else
	{
	    x *= 10;
	    if (n % 10 != 0)
		x += (10 - (n % 10));

	}


	return x;
    }


    public void checkCPU (int n)//checks to see if computer needs to advance up a UFO or slide down a rocket. It updates the computer's score and location accordingly
    {
	if (n == 7)
	{
	    a [96].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-9-6.jpeg"));
	    a [75].setIcon (createImageIcon ("alien.jpg"));
	    computer = 26;
	    yourTurn.setText ("                                                   The aliens advanced up a UFO.                                                                         ");
	}


	else if (n == 18)
	{
	    a [82].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-8-2.jpeg"));
	    a [61].setIcon (createImageIcon ("alien.jpg"));
	    computer = 39;
	    yourTurn.setText ("                                                   The aliens advanced up a UFO.                                                   ");
	}


	else if (n == 25)
	{
	    a [74].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-7-4.jpeg"));
	    a [83].setIcon (createImageIcon ("alien.jpg"));
	    computer = 17;
	    yourTurn.setText ("                                                   The aliens slid down a rocket.                                                   ");
	}


	else if (n == 48)
	{
	    a [57].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-5-7.jpeg"));
	    a [86].setIcon (createImageIcon ("alien.jpg"));
	    computer = 14;
	    yourTurn.setText ("                                                   The aliens slid down a rocket.                                                   ");
	}


	else if (n == 36)
	{
	    a [64].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-6-4.jpeg"));
	    a [36].setIcon (createImageIcon ("alien.jpg"));
	    computer = 67;
	    yourTurn.setText ("                                                   The aliens advanced up a UFO.                                                   ");
	}


	else if (n == 32)
	{
	    a [68].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-6-8.jpeg"));
	    a [38].setIcon (createImageIcon ("alien.jpg"));
	    computer = 69;
	    yourTurn.setText ("                                                   The aliens advanced up a UFO.                                                   ");
	}


	else if (n == 76)
	{
	    a [24].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-2-4.jpeg"));
	    a [50].setIcon (createImageIcon ("alien.jpg"));
	    computer = 41;
	    yourTurn.setText ("                                                   The aliens slid down a rocket.                                                   ");
	}


	else if (n == 78)
	{
	    a [22].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-2-2.jpeg"));
	    a [3].setIcon (createImageIcon ("alien.jpg"));
	    computer = 97;
	    yourTurn.setText ("                                                   The aliens advanced up a UFO.                                                   ");
	}


	else if (n == 86)
	{
	    a [15].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-1-5.jpeg"));
	    a [27].setIcon (createImageIcon ("alien.jpg"));
	    computer = 73;
	    yourTurn.setText ("                                                   The aliens slid down a rocket.                                                   ");
	}


	else
	    yourTurn.setText ("                                                                           ");
    }


    public void checkUser (int n)//checks to see if user needs to advance up a UFO or slide down a rocket
    {
	if (n == 7 || n == 18 || n == 76 || n == 32 || n == 78)
	{
	    Continue.setEnabled (true);
	    dice.setEnabled (false);
	    yourTurn.setText ("                                                   You approached a UFO.                                                   ");
	}


	else if (n == 25 || n == 48 || n == 36 || n == 86)
	{
	    Continue.setEnabled (true);
	    dice.setEnabled (false);
	    yourTurn.setText ("                                                   You approached a rocket.                                                   ");
	}
    }


    public void Switch (int n)//moves a user up a UFO or down a rocket and updates the score accordingly
    {
	if (n == 7)
	{
	    a [96].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-9-6.jpeg"));
	    a [75].setIcon (createImageIcon ("bobbyicon.jpg"));
	    player = 26;
	    yourTurn.setText ("                                                   You advanced up a UFO.                                                   ");
	}


	else if (n == 18)
	{
	    a [82].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-8-2.jpeg"));
	    a [61].setIcon (createImageIcon ("bobbyicon.jpg"));
	    player = 39;
	    yourTurn.setText ("                                                   You advanced up a UFO.                                                   ");
	}


	else if (n == 25)
	{
	    a [74].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-7-4.jpeg"));
	    a [83].setIcon (createImageIcon ("bobbyicon.jpg"));
	    player = 17;
	    yourTurn.setText ("                                                   You slid down a rocket.                                                   ");
	}


	else if (n == 48)
	{
	    a [57].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-5-7.jpeg"));
	    a [86].setIcon (createImageIcon ("bobbyicon.jpg"));
	    player = 14;
	    yourTurn.setText ("                                                   You slid down a rocket.                                                   ");
	}


	else if (n == 36)
	{
	    a [64].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-6-4.jpeg"));
	    a [36].setIcon (createImageIcon ("bobbyicon.jpg"));
	    player = 67;
	    yourTurn.setText ("                                                   You advanced up a UFO.                                                   ");
	}


	else if (n == 32)
	{
	    a [68].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-6-8.jpeg"));
	    a [38].setIcon (createImageIcon ("bobbyicon.jpg"));
	    player = 69;
	    yourTurn.setText ("                                                   You advanced up a UFO.                                                   ");
	}


	else if (n == 76)
	{
	    a [24].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-2-4.jpeg"));
	    a [50].setIcon (createImageIcon ("bobbyicon.jpg"));
	    player = 41;
	    yourTurn.setText ("                                                   You slid down a rocket.                                                   ");
	}


	else if (n == 78)
	{
	    a [22].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-2-2.jpeg"));
	    a [3].setIcon (createImageIcon ("bobbyicon.jpg"));
	    player = 97;
	    yourTurn.setText ("                                                   You advanced up a UFO.                                                   ");
	}


	else
	{
	    a [15].setIcon (createImageIcon ("boards2 [www.imagesplitter.net]-1-5.jpeg"));
	    a [27].setIcon (createImageIcon ("bobbyicon.jpg"));
	    player = 73;
	    yourTurn.setText ("                                                   You slid down a rocket.                                                   ");
	}


	dice.setEnabled (true);
	Continue.setEnabled (false);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("play") || e.getActionCommand ().equals ("back1"))
	    cdLayout.show (panel, "story1");
	else if (e.getActionCommand ().equals ("back2") || e.getActionCommand ().equals ("next1"))
	    cdLayout.show (panel, "story2");
	else if (e.getActionCommand ().equals ("next2") || e.getActionCommand ().equals ("back3"))
	    cdLayout.show (panel, "story3");
	else if (e.getActionCommand ().equals ("next3") || e.getActionCommand ().equals ("back4"))
	    cdLayout.show (panel, "story4");
	else if (e.getActionCommand ().equals ("next4") || e.getActionCommand ().equals ("back5"))
	    cdLayout.show (panel, "story5");
	else if (e.getActionCommand ().equals ("next5"))
	    cdLayout.show (panel, "story6");
	else if (e.getActionCommand ().equals ("more"))
	    cdLayout.show (panel, "more");
	else if (e.getActionCommand ().equals ("More"))
	{
	    JOptionPane.showMessageDialog (null, "   Completion of Stage1   \n \n"
		    + "The password for Stage2 is: Asteroid\n\n", "Instructions", JOptionPane.QUESTION_MESSAGE);
	    cdLayout.show (panel, "more");
	}
	else if (e.getActionCommand ().equals ("home"))
	    cdLayout.show (panel, "home");
	else if (e.getActionCommand ().equals ("MinesweeperInstructions"))
	{
	    JOptionPane.showMessageDialog (null, "* * * M I N E S W E E P E R * * * \n \n"
		    + "You are presented with a board of squares.\n"
		    + "Some squares are black holes, others aren't.\n"
		    + "If you click on a black hole, you lose. The\n"
		    + "object of the game is to uncover all of the\n"
		    + "squares that are not black holes. Clicking a\n"
		    + "square which doesn't have a black hole reveals\n"
		    + "the number of neighbouring squares containing\n"
		    + "black holes. Use this information plus some\n"
		    + "guess work to avoid the black holes", "How to play", JOptionPane.QUESTION_MESSAGE);
	}


	else if (e.getActionCommand ().equals ("done2"))
	{
	    if (c.getText ().equals ("Comets"))//if Stage 3 password is correct
	    {
		JOptionPane.showMessageDialog (null, "Welcome", "Welcome", JOptionPane.INFORMATION_MESSAGE);
		cdLayout.show (panel, "Mastermind");
	    }
	    else
		JOptionPane.showMessageDialog (null, "Complete Stage 2 before starting this activity", "Incorrect Log in", JOptionPane.ERROR_MESSAGE);
	    c.setText ("");
	}


	else if (e.getActionCommand ().equals ("done1"))
	{
	    if (p.getText ().equals ("Asteroid"))//if Stage 2 password is correct
	    {
		JOptionPane.showMessageDialog (null, "Welcome", "Welcome", JOptionPane.INFORMATION_MESSAGE);
		cdLayout.show (panel, "Minesweeper");

	    }
	    else
		JOptionPane.showMessageDialog (null, "Complete Stage 1 before starting this activity", "Incorrect Log in", JOptionPane.ERROR_MESSAGE);
	    p.setText ("");
	}


	else if (e.getActionCommand ().equals ("game"))
	{
	    cdLayout.show (panel, "game");
	    JOptionPane.showMessageDialog (null, "* * * I N S T R U C T I O N S * * * \n \n"
		    + "Help Bobby get to planet Earth before\n"
		    + "the aliens do! The object of the game\n"
		    + "is to reach the 100th square before\n"
		    + "they do. Take turns with the aleins\n"
		    + "rolling the dice. The number that you\n"
		    + "roll is the number of spaces that you\n"
		    + "may advance. If you land on a UFO,\n"
		    + "you can proceed to where the rocket\n"
		    + "leads you. If you land on a rocket,\n"
		    + "you have to move back where the rocket\n"
		    + "takes you. Save the world before it's\n"
		    + "too late!", "Instructions", JOptionPane.QUESTION_MESSAGE);
	}
	else if (e.getActionCommand ().equals ("mercury"))
	    cdLayout.show (panel, "mercury");
	else if (e.getActionCommand ().equals ("venus"))
	    cdLayout.show (panel, "venus");
	else if (e.getActionCommand ().equals ("earth"))
	    cdLayout.show (panel, "earth");
	else if (e.getActionCommand ().equals ("mars"))
	    cdLayout.show (panel, "mars");
	else if (e.getActionCommand ().equals ("jupiter"))
	    cdLayout.show (panel, "jupiter");
	else if (e.getActionCommand ().equals ("saturn"))
	    cdLayout.show (panel, "saturn");
	else if (e.getActionCommand ().equals ("uranus"))
	    cdLayout.show (panel, "uranus");
	else if (e.getActionCommand ().equals ("neptune"))
	    cdLayout.show (panel, "neptune");
	else if (e.getActionCommand ().equals ("weight"))
	{
	    String var;
	    boolean isValid = false;
	    while (!isValid)//runs until the user has entered a valid number
	    {
		boolean not = true;
		var = JOptionPane.showInputDialog ("Enter your weight in pounds: ");
		try
		{
		    Weight = Integer.parseInt (var);
		}
		catch (java.lang.NumberFormatException m)
		{
		    JOptionPane.showMessageDialog (null, "You must enter an integer", "Invalid Input",
			    JOptionPane.ERROR_MESSAGE);
		    not = false;
		}
		if (not == true)
		    isValid = true;
	    }
	    cdLayout.show (panel, "weight");
	}
	else if (e.getActionCommand ().equals ("box"))//indicates the planet that the user has chosen and calculates their theoretical weight on that planet
	{
	    JComboBox cb = (JComboBox) e.getSource ();
	    String planets_s = (String) cb.getSelectedItem ();
	    int x = Weight;
	    if (planets_s.equals ("Mercury"))
		x *= 0.38;
	    else if (planets_s.equals ("Venus"))
		x*= 0.9;
	    else if (planets_s.equals ("Mars"))
		x*= 0.38;
	    else if (planets_s.equals ("Jupiter"))
		x*= 2.36;
	    else if (planets_s.equals ("Saturn"))
		x*= 1.08;
	    else if (planets_s.equals ("Uranus"))
		x*= 0.8;
	    else
		x*= 1.12;
	    yourWeight.setText ("             You would weigh " + x+ " pounds on " + planets_s+"           ");
	}

	else if (e.getActionCommand ().equals ("stage3"))
	    cdLayout.show (panel, "stage3");
	else if (e.getActionCommand ().equals ("stage2"))
	    cdLayout.show (panel, "stage2");
	else if (e.getActionCommand ().equals ("stage1"))
	    cdLayout.show (panel, "solar");
	else if (e.getActionCommand ().equals ("roll"))//rolls the dice and adds that to the score
	{
	    int num = (int) (Math.random () * 6 + 1);
	    dice.setIcon (createImageIcon ("dice" + num + ".jpg"));

	    if (turn == 1)
	    {
		if (player != computer)
		    BtoPic (BtoA (player));
		else
		    a [BtoA (player)].setIcon (createImageIcon ("alien.jpg"));
		player += num;
		if (player < 100)
		{
		    a [BtoA (player)].setIcon (createImageIcon ("bobbyicon.jpg"));
		    checkUser (player);
		    turn = 2;
		}
		else //if the user won
		{
		    win = true;
		    yourTurn.setText ("                             You Won                             ");
		    a [0].setIcon (createImageIcon ("bobbyicon.jpg"));
		    JOptionPane.showMessageDialog (null, "~ ~ ~ C O N G R A T U L A T I O N S ~ ~ ~\n \n"
			    + "You saved planet Earth and stopped the aliens!", "You Won", JOptionPane.QUESTION_MESSAGE);
		    yourTurn.setText ("You won!");
		    Continue.setText ("Play Again?");
		    Continue.setEnabled (true);
		    Continue.setActionCommand ("again");
		    showStatus ("We have a winner!");
		    dice.setEnabled (false);
		    dice.setPreferredSize (new Dimension (150, 126));
		}

	    }
	    else
	    {
		if (player != computer)
		    BtoPic (BtoA (computer));
		else
		    a [BtoA (player)].setIcon (createImageIcon ("bobbyicon.jpg"));
		computer += num;
		if (computer < 100)
		{
		    a [BtoA (computer)].setIcon (createImageIcon ("alien.jpg"));
		    checkCPU (computer);
		    turn = 1;

		}
		else //if the aliens won
		{
		    yourTurn.setText ("                             You Lost                             ");
		    a [0].setIcon (createImageIcon ("alien.jpg"));
		    JOptionPane.showMessageDialog (null, "~ ~ ~ G A M E   O V E R ~ ~ ~\n \n"
			    + "The aliens won!", "You Lost", JOptionPane.QUESTION_MESSAGE);

		    yourTurn.setText ("                         The Alien won!                           ");
		    Continue.setText ("Play Again?");
		    Continue.setEnabled (true);
		    Continue.setActionCommand ("again");
		    showStatus ("We have a winner!");
		    dice.setEnabled (false);
		}

	    }
	    location.setText ("Your score: " + player + "   Aliens' score: " + computer);
	    showStatus ("Dice roll: " + num);

	}


	else if (e.getActionCommand ().equals ("continue"))
	{
	    Switch (player);
	    turn = 2;
	}


	else if (e.getActionCommand ().equals ("again"))//if the user wants to play again
	{
	    BtoPic (BtoA (player));
	    BtoPic (BtoA (computer));
	    player = 1;
	    computer = 1;
	    yourTurn.setText ("                                                            ");
	    a [90].setIcon (createImageIcon ("bobbyicon.jpg"));
	    dice.setEnabled (true);
	    Continue.setText ("Continue");
	    Continue.setEnabled (false);
	    Continue.setActionCommand ("continue");
	    showStatus (" ");
	    location = new JTextArea ("Your score: " + player + "   Aliens' score: " + computer);

	}
	else if (e.getActionCommand ().equals ("MinAgain"))//if the user wants to play Minesweeper again
	{
	    int c[] = selectNum ();
	    for (int i = 0 ; i < d.length ; i++)
	    {
		b [i].setIcon (null);
		b [i].setEnabled (true);
		b [i].setBackground (Color.lightGray);
		d [i] = 1;
	    }
	    for (int i = 0 ; i < c.length ; i++)
		d [c [i] - 1] = 0;
	    counter = 0;
	}
	else if (e.getActionCommand ().equals ("check"))//checks if Mastermind guess is correct and outputs black and white squares
	{
	    int black = 0;
	    int white = 0;
	    int g[] = new int [4];
	    int h = 0;
	    for (int i = 0 ; i < f.length ; i++)//calculates number of black squares
	    {
		if (f [i] == array [i])
		{
		    black++;
		    g [h] = i;
		}

	    }
	    for (int i = 0 ; i < f.length ; i++) //calculate # of whites
	    {
		for (int j = 0 ; j < array.length ; j++)
		    if (array [i] == f [j] && f [j] != array [j])
			white++;
	    }
	    guess -= 3;
	    int choice = guess;
	    for (int i = 0 ; i < black ; i++)//outputs all the black squars first
	    {
		correct [choice].setIcon (createImageIcon ("black.jpg"));
		choice++;
	    }
	    for (int i = 0 ; i < white ; i++)
	    {
		correct [choice].setIcon (createImageIcon ("white.jpg"));//then outputs all the white squars first
		choice++;
	    }
	    check.setEnabled (false);
	    for (int i = 0 ; i < ab.length ; i++)
		ab [i].setEnabled (true);
	    guess -= 4;//user starts guessing on the next row
	    showStatus(black+" and   "+white);
	    if (guess < 0)//if the user took too many tries and lost
	    {
		JOptionPane.showMessageDialog (null, "You took too many tries", "Game Over",
			JOptionPane.ERROR_MESSAGE);
		for (int i = 0 ; i < ab.length ; i++)
		{
		    ab [i].setEnabled (false);
		    check.setEnabled (false);
		}
		for (int i = 0 ; i < array.length ; i++)//outputs the answer
		    guesses [i].setIcon (createImageIcon ("Planet" + array [i] + ".jpg"));

	    }
	    else if (black == 4)//if the user correctly guessed all the values
	    {
		JOptionPane.showMessageDialog (null, " You Won\n \n"
			+ "Congratulations!", "We have a winner!", JOptionPane.QUESTION_MESSAGE);
	    }

	}

	else if (e.getActionCommand ().equals ("newMaster"))//starts a new game of Mastermind
	{
	    for (int i = 0 ; i < guesses.length ; i++)
		guesses [i].setIcon (createImageIcon ("blackhole.jpg"));
	    guess = 36;
	    for (int i = 0 ; i < ab.length ; i++)
		ab [i].setEnabled (true);
	    for (int i = 0 ; i < correct.length ; i++)
		correct [i].setIcon (createImageIcon ("brown.jpg"));
	    for (int i = 0 ; i < 4 ; i++)
		array [i] = (int) (Math.random () * 7);
	}
	else//user clicks either a Minesweeper button or Mastermind button
	{
	    boolean minesweeper = false;
	    boolean mastermind = false;
	    int pos = -1;
	    for (int i = 0 ; i < 100 ; i++)
	    {
		if (e.getActionCommand ().equals ("Min" + i))
		{
		    minesweeper = true;
		    pos = i;
		    break;
		}
		else if (e.getActionCommand ().equals ("planetSelect" + i))
		{
		    mastermind = true;
		    pos = i;
		    f = new int [4];
		    //  f [guess % 4] = pos;
		    break;
		}

	    }
	    if (minesweeper == true)//user click on a Minesweeper button
	    {
		if (d [pos] != 0)//if the square is safe
		{
		    int count = 0;//counts the number of neighbouring black holes
		    counter++;
		    if (pos > 9)
		    {
			if (d [pos - 10] == 0) //top square
			    count++;
			if (pos % 10 != 0 && d [pos - 11] == 0) //top left
			    count++;
			if (pos % 10 != 9 && d [pos - 9] == 0) //top right
			    count++;
		    }
		    if (pos < 90)
		    {
			if (d [pos + 10] == 0) //bottom square
			    count++;
			if (pos % 10 != 0 && d [pos + 9] == 0)  //bottom left
			    count++;
			if (pos % 10 != 9 && d [pos + 11] == 0) //bottom right
			    count++;
		    }
		    if (pos % 10 != 0 && d [pos - 1] == 0) //right square
			count++;
		    if (pos % 10 != 9 && d [pos + 1] == 0) //left square
			count++;

		    b [pos].setIcon (createImageIcon ("Min" + count + "icon.jpg"));
		    if (count == 0)
			b [pos].setDisabledIcon (image0);
		    else if (count == 1)
			b [pos].setDisabledIcon (image1);
		    else if (count == 2)
			b [pos].setDisabledIcon (image2);
		    else if (count == 3)
			b [pos].setDisabledIcon (image3);
		    else if (count == 4)
			b [pos].setDisabledIcon (image4);
		    else if (count == 5)
			b [pos].setDisabledIcon (image5);
		    else if (count == 6)
			b [pos].setDisabledIcon (image6);
		    else if (count == 7)
			b [pos].setDisabledIcon (image7);
		    else
			b [pos].setDisabledIcon (image8);
		    b [pos].setEnabled (false);
		    if (counter == 91)//if the user won
		    {
			JOptionPane.showMessageDialog (null, " You Won\n \n"
				+ "The password for Stage 3 is:  Comets", "We have a winner!", JOptionPane.QUESTION_MESSAGE);
			instructions.setText ("Play Again?");
			instructions.setActionCommand ("MinAgain");
		    }

		}

		else //if they clicked on a black hole
		{
		    for (int i = 0 ; i < 100 ; i++)
		    {
			b [i].setBackground (Color.black);//all the black holes are visible
			if (d [i] == 0)
			    b [i].setIcon (createImageIcon ("blackhole.jpg"));
		    }
		    JOptionPane.showMessageDialog (null, "You got sucked up by a black hole", "Game Over",
			    JOptionPane.ERROR_MESSAGE);
		    instructions.setText ("Play Again?");
		    instructions.setActionCommand ("MinAgain");

		}
	    }
	    else //if the user clicked on a Mastermind button
	    {

		guesses [guess].setIcon (createImageIcon ("Planet" + pos + ".jpg"));
		f [guess % 4] = pos;
		if (guess % 4 == 3)
		{
		    check.setEnabled (true);
		    for (int i = 0 ; i < ab.length ; i++)
			ab [i].setEnabled (false);
		}
		else
		    guess++;
	    }
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = theSpaceRace.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}


	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}


