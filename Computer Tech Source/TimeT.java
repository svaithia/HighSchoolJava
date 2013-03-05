/*
Saravanan Vaithianathan
April 6th, 2010
http://patorjk.com/software/taag/ FOR ASCII ART
http://www.turnerfenton.com/Students/lessons/gorski/ExtraFeatures/Index.htm
http://www.java-examples.com/add-or-substract-hours-current-time-using-java-calendar

GUIDE/ANSWERS
Your Name:
Your Friend's Name:
Y
C (California)
Y
A (Plaice)
Y
C (RICH)
Y
Y
ARGONAUT
SUBTRACT HOUR BY 3
GOLD, CLAIM, MINER
C (16)
B (SAN FRANCISCO)
B (OVERLAND)
CRADLE
SUTTER
LODE
DEMAND
CLAIM

*/


import javax.swing.JOptionPane;
import java.util.Calendar;

public class TimeT
{
    public static void main (String args[])
    {
	new TimeT ();


    }


    /////////////////////////////////////////////////////////////// PRINT SLOW ///////////////////////
    public void printSlow (String s)
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    //sleep for a bit after printing a letter try
	    try
	    {
		//number '100' here refers to how long the executing thread should sleep, in milliseconds
		Thread.sleep (1); //CHANGE to 75
		//change the speed
		//small # = fast
		//large # = slow

	    }
	    catch (InterruptedException m)
	    {

		;

	    }

	}
    }


    ///////////////////////////////////////////////////PRINT SLOW///////////////////////////////////////////////
    public TimeT ()
    {

	{
	    char playagain = ' ';
	    do
	    {


		String asciititle = ("                                                          dddddddd\n        GGGGGGGGGGGGG                 lllllll             d::::::d\n     GGG::::::::::::G                 l:::::l             d::::::d\n   GG:::::::::::::::G                 l:::::l             d::::::d\n  G:::::GGGGGGGG::::G                 l:::::l             d:::::d\n G:::::G       GGGGGG   ooooooooooo    l::::l     ddddddddd:::::d\nG:::::G               oo:::::::::::oo  l::::l   dd::::::::::::::d\nG:::::G              o:::::::::::::::o l::::l  d::::::::::::::::d\nG:::::G    GGGGGGGGGGo:::::ooooo:::::o l::::l d:::::::ddddd:::::d\nG:::::G    G::::::::Go::::o     o::::o l::::l d::::::d    d:::::d\nG:::::G    GGGGG::::Go::::o     o::::o l::::l d:::::d     d:::::d\nG:::::G        G::::Go::::o     o::::o l::::l d:::::d     d:::::d\n G:::::G       G::::Go::::o     o::::o l::::l d:::::d     d:::::d\n  G:::::GGGGGGGG::::Go:::::ooooo:::::ol::::::ld::::::ddddd::::::dd\n   GG:::::::::::::::Go:::::::::::::::ol::::::l d:::::::::::::::::d\n     GGG::::::GGG:::G oo:::::::::::oo l::::::l  d:::::::::ddd::::d\n        GGGGGG   GGGG   ooooooooooo   llllllll   ddddddddd   ddddd\n");
		String asciititle2 = ("DDDDDDDDDDDDD          iiii                                                                                   !!!!!\nD::::::::::::DDD      i::::i                                                                                  !:::!\nD:::::::::::::::DD     iiii                                                                                   !:::!\nDDD:::::DDDDD:::::D                                                                       rrrrr   rrrrrrrrr   !:::!\n  D:::::D    D:::::D iiiiiii    ggggggggg   ggggg   ggggggggg   ggggg    eeeeeeeeeeee     r::::rrr:::::::::r  !:::!\n  D:::::D     D:::::Di:::::i   g:::::::::ggg::::g  g:::::::::ggg::::g  ee::::::::::::ee   r:::::::::::::::::r !:::!\n  D:::::D     D:::::D i::::i  g:::::::::::::::::g g:::::::::::::::::g e::::::eeeee:::::ee rr::::::rrrrr::::::r!:::!\n  D:::::D     D:::::D i::::i g::::::ggggg::::::ggg::::::ggggg::::::gge::::::e     e:::::e r:::::r     r:::::r!:::!\n  D:::::D     D:::::D i::::i g:::::g     g:::::g g:::::g     g:::::g e:::::::eeeee::::::e r:::::r     rrrrrrr!:::!\n  D:::::D     D:::::D i::::i g:::::g     g:::::g g:::::g     g:::::g e:::::::::::::::::e  r:::::r            !!:!!\n  D:::::D     D:::::D i::::i g:::::g     g:::::g g:::::g     g:::::g e::::::eeeeeeeeeee   r:::::r             !!!\n  D:::::D    D:::::D  i::::i g::::::g    g:::::g g::::::g    g:::::g e:::::::e            r:::::r\nDDD:::::DDDDD:::::D  i::::::ig:::::::ggggg:::::g g:::::::ggggg:::::g e::::::::e           r:::::r             !!!\nD:::::::::::::::DD   i::::::i g::::::::::::::::g  g::::::::::::::::g  e::::::::eeeeeeee   r:::::r            !!:!!\nD::::::::::::DDD     i::::::i  gg::::::::::::::g   gg::::::::::::::g   ee:::::::::::::e   r:::::r            !!:!!\nDDDDDDDDDDDDD        iiiiiiii    gggggggg::::::g     gggggggg::::::g     eeeeeeeeeeeeee   rrrrrrr             !!!\n                                         g:::::g             g:::::g\n                             gggggg      g:::::g gggggg      g:::::g\n                             g:::::gg   gg:::::g g:::::gg   gg:::::g\n                              g::::::ggg:::::::g  g::::::ggg:::::::g\n                               gg:::::::::::::g    gg:::::::::::::g\n                                 ggg::::::ggg        ggg::::::ggg\n                                    gggggg              gggggg\n");
		String ascii1 = ("                            d8b                                    \n   d8P                     ?88                                    \nd888888P                    88b                                   \n  ?88'   d888b8b   .d888b,  888  d88'     d8888b   88bd88b  d8888b\n  88P   d8P' ?88   ?8b,     888bd8P'     d8P' ?88  88P' ?8bd8b_,dP\n  88b   88b  ,88b    `?8b  d88888b       88b  d88 d88   88P88b    \n  `?8b  `?88P'`88b`?888P' d88' `?88b,    `?8888P'd88'   88b`?888P'\n");
		String ascii2 = ("                           d8b                                          \n   d8P                     ?88              d8P                         \nd888888P                    88b          d888888P                       \n  ?88'   d888b8b   .d888b,  888  d88'      ?88'   ?88   d8P  d8P d8888b \n  88P   d8P' ?88   ?8b,     888bd8P'       88P    d88  d8P' d8P'd8P' ?88\n  88b   88b  ,88b    `?8b  d88888b         88b    ?8b ,88b ,88' 88b  d88\n  `?8b  `?88P'`88b`?888P' d88' `?88b,      `?8b   `?888P'888P'  `?8888P'\n");
		String ascii3 = ("                           d8b                    d8b                             \n   d8P                     ?88              d8P   ?88                             \nd888888P                    88b          d888888P  88b                            \n  ?88'   d888b8b   .d888b,  888  d88'      ?88'    888888b   88bd88b d8888b d8888b\n  88P   d8P' ?88   ?8b,     888bd8P'       88P     88P `?8b  88P'  `d8b_,dPd8b_,dP\n  88b   88b  ,88b    `?8b  d88888b         88b    d88   88P d88     88b    88b    \n  `?8b  `?88P'`88b`?888P' d88' `?88b,      `?8b  d88'   88bd88'     `?888P'`?888P'\n");
		String ascii4 = ("                           d8b              ,d8888b                          \n   d8P                     ?88              88P'                             \nd888888P                    88b          d888888P                            \n  ?88'   d888b8b   .d888b,  888  d88'      ?88'     d8888b ?88   d8P  88bd88b\n  88P   d8P' ?88   ?8b,     888bd8P'       88P     d8P' ?88d88   88   88P'  `\n  88b   88b  ,88b    `?8b  d88888b        d88      88b  d88?8(  d88  d88     \n  `?8b  `?88P'`88b`?888P' d88' `?88b,    d88'      `?8888P'`?88P'?8bd88'     \n");
		String ascii5 = ("                           d8b              ,d8888b  d8,                \n   d8P                     ?88              88P'    `8P                 \nd888888P                    88b          d888888P                       \n  ?88'   d888b8b   .d888b,  888  d88'      ?88'      88b?88   d8P d8888b\n  88P   d8P' ?88   ?8b,     888bd8P'       88P       88Pd88  d8P'd8b_,dP\n  88b   88b  ,88b    `?8b  d88888b        d88       d88 ?8b ,88' 88b    \n  `?8b  `?88P'`88b`?888P' d88' `?88b,    d88'      d88' `?888P'  `?888P'\n");
		String ascii6 = ("                           d8b                     d8,         \n   d8P                     ?88                    `8P          \nd888888P                    88b                                \n  ?88'   d888b8b   .d888b,  888  d88'     .d888b,  88b?88,  88P\n  88P   d8P' ?88   ?8b,     888bd8P'      ?8b,     88P `?8bd8P'\n  88b   88b  ,88b    `?8b  d88888b          `?8b  d88  d8P?8b, \n  `?8b  `?88P'`88b`?888P' d88' `?88b,    `?888P' d88' d8P' `?8b\n");
		String ascii7 = (" d8b                                                                        d8b       \n ?88                                                d8P                     ?88       \n  88b                                            d888888P                    88b      \n  888888b  d8888b   88bd88b ?88   d8P .d888b,      ?88'   d888b8b   .d888b,  888  d88'\n  88P `?8bd8P' ?88  88P' ?8bd88   88  ?8b,         88P   d8P' ?88   ?8b,     888bd8P' \n d88,  d8888b  d88 d88   88P?8(  d88    `?8b       88b   88b  ,88b    `?8b  d88888b   \nd88'`?88P'`?8888P'd88'   88b`?88P'?8b`?888P'       `?8b  `?88P'`88b`?888P' d88' `?88b,\n");
		String starbreak = ("\n******************************************************************************");
		String fireworks = ("                                                     MM                                             \n                                                    M MMMMMM                                        \n                                                    M    MM                                         \n                                                 MM     M                                           \n                                                 MMM M   M                                          \n                                                   MM  MMMM                                         \n                      M                            M             MM MMM                             \n                     MMM  MM                MM                MMM        MM                         \n                     M MM M               M   M             MMM            MM                       \n                    M    M              M      M           MMM  MM           M                      \n                   M     M                     MM         MMM   M MMMMMM                            \n                 MMMM  M MM                     M        MMM    M    M        MM        M           \n                    M M          MMM            MM      MMM   MM     M         M       M MM MMMM    \n                    MM        MMMMMMMMM          M      MM  MM M  MMMMM                M   M  M     \n                          MM        MMMM         MM    MM      M M                     M     M      \n                        M              MMM    M   M    MM      MM    MMMMMMMM        MM      MM     \n                      MM                MMM    M  M    M       M  MMMMMMMMMMMMM    MM     MM  MM    \n                    MM                   MMM      MM  MM   M    MMMM         MMM       M  M  MMM    \n                   M                       MM   M  M  M       MMMM            MM       M M          \n                                      MM    MM  MM M  M  M  MMM                         MM          \n                                         M   MM  M M MM M  MM                           M           \n                          MMMMMMMMMMMM     M  MM MMM M M MMM  MM    MMMMMMMMMMMMMMM                 \n                                    MMMMM   MM M  M M M MM  M    MMMM            MMMMM              \n                     MM                 MMMM  M M M M   M MM  MMM              M    MMMM            \n                                            MM M MMMM   MM MMM                 MM     MMM           \n                  MM                          M  MMMMMM  MM MMMMMMMM           M       MMM          \n                                MMMMMMMMMMM    MMMMMMMMM MM                             MMM         \n                 M           MMMMMMM        M   M  MMMM MMMMMMMMMMMMMMMM       M         MMM        \n                M          MMMMM         MMMMM   M  M               MMMMMM     M          MM        \n                         MMMMM          MMM  MM MM   M  MM              MMMM               MM       \n                        MMMM          MMM   MM  MM    MM  MM             MMMM MM           MM       \n           M           MMMM          MM   MMM  MM     MM   MM              MMM              MM      \n           MM   MM     MM           M    MMM   MM      MM   MM              MMM             MM      \n          M MM  M     MM                 MM    MM       MM   M               MMM            MM      \n         M     M     MMM                MM     M        MMM                   MM             M      \n       MM     M      MM                MMM              MMM                    MM            MM     \n      MMMM     M    MM                 MM                MM       MM     M     MM            M      \n         M MMMMM    MM                MM     M  M        MMM      M MMMMM     M M            MM     \n          MM        MM                MM      M   M      MMM      M     M       MM                  \n         M          MM                MM    M  MM         MM     MM    M     MM MM            M     \n                    MM     M         MM       MMM MM      MM  MM        M        M           M M    \n                    MM    M MM MMM   MM     M   M         MM    MMM MMMMMM       MM           M     \n                          M   M M    M           M        MM        M             M                 \n                    MM  MM     M     M                     M       M                          MM    \n                    MM MMM     M     M                     M      MM             MMM         MM     \n                         M  MMM M    M                     MM                    MMM                \n                     M   M M   MM               M          MM                     MM          M     \n                     M   MM          MM            M       MM                      M          M     \n                                     M M         M MMM     MM                     MM                \n                     MM                          MMM       MM                                       \n                      M               MM        M MM  M    MM                      M                \n                                                    M      MM                      M                \n                                       M                   MM                      M                \n                                      M                     M                                       \n                                       M M  M               M                                       \n                                        MM M                M                                       \n                                       MMMMM                                                        \n                                       MM M                 M                                       \n                                     MM M  M                M                                       \n                                        M                                                           \n                                                            M                                       \n                                                                                                    \n                                                            M                                       \n                                                           MM                                       \n                                                           MM                                       \n                                                                                                    \n                                                           MM                                       \n");
		//GOLD PICTURE
		System.out.println ("                                                                                          \n `                                          .,`                                          `\n  `                                      ++:``,+###                                     ` \n                                 :'+',  :``#.```,+`##                                     \n                             :#'.````,##`+`````````'`#:#####:                         `   \n                            '`+.`````:;`#``````````,#.``.;,`.##:                          \n                           `'``````````';#````````#``+```````;`'#                   `     \n                          +#```````````#`.#'```````#```````````#'###'              `      \n                      ;####````````````,#``;##'``'```````````````,+#####,         `       \n         `         '########.`````````;###`````'###`````````````'``+.;#####      `        \n          `      ######,`##,'########:```'##````++`##.````````#:.`````,;####+   `         \n               +###'::`,``;+:#``'`````.#########;'.``'#######``,.``````#.#####            \n              ###:;:`'`````##+``:```++`,#';#;``'#;#'````````+``.````````:#'###            \n             ;#;::;,:````````'#####;`+`````````,`#`###:`````+#+``````````';:#;            \n            #:,#::;+```````````#``'`````````````+`'```.+###'.`###;````.+;##::#            \n           ;;::;#;:#'```````+#````#``````````````'`````````#.````.;+#;```;:,:#            \n           #::::;##########.````.;#,```````````:.```````````##;```:`.```':,:;#            \n           #+::::,##+.``#`````,#;:###;``````:#'`#;```````:#,``;####''##;;,:::             \n          ;###:::;,;##,.``''##::::#``;+###+.````#:######:`````##'::::::;,:::+             \n          '####+:::,::+##########+'#`+``#``````+#;:+``,`````#:::::::::;;::::              \n           ##;####;:,:::::::;:'########'+.,'#######,`:``,##:::::::::##;::::#              \n           ###:;+####::::::;:::::::;:::;;;;;;;::::;+##+;:;::;:::;###;,;:;:#               \n           `###:;::'##;###'::;::::::::::::::::::;:::::::;::;+####;;:,;::##                \n            +###;;::;::,#########++;::::::::::::::::;+#######;:::::,:::;##                \n             ####;::::::,::;:;'+######################+'::::::::;:,::::####.              \n              +#+;:::::::,;:::::;:;::::::::::::::::::::::::::::::,::::::####'             \n              .#::::::::::,:::::::::::::::::::::::::::::::::::::,:::::::;####+            \n              #::::::::::;:,:::::::::::::::::::::::::::::::::::,::::::::::;###'           \n             +::::::::::::::,:::::::::::::::::::::::::::::::::,::::::::::::;###`          \n           #::::::::::::::::,:::::::::::::::::::::::::::::::,;:::::::::::::;###          \n           '############::::::,:::::::::::::::::::::::::::::,::::::::::::::::'###         \n           ::::::::::::;:::::::,:::::::::::::::::::::::::::,:::::::::::::::::;###`        \n          ';:::::::::;;:::::::::,:::::::::::::::::::::::;:,::::::::::::::::::::###        \n         .############;::::::::::,;::::::::::::::::::::::,:::::::::::::::::::::;##,       \n         ;::::::;'++;::::::::::::;,::::::::::::;::::::::,:::::::::::::::::::::::###       \n        ::::::::.```:##::::::::::::,::::::,,,,,,:;:::::,:::::::::::+##+###'::::;:##       \n        ;::::::````````#':::::::::::,:::,,;:::::,,::::,:::::::::##````````##:::::###      \n       `:::::;:`````````#:;::::::::::,:,::,;::::,:,,:,;::::::::;```````````'+;;::;##      \n       #::::::```````````#:;::::::::'#;+;:,:::::,;:,:##:::::::+`````````````#+::::##`     \n       :::::::`````###.``##;::::;;#:````:##::;:,::;#```#:;::::+```````.#'```;#::::+##     \n      '+++++++````#####```#;;::;;``````````;+::;##:````##;::::#`````.####,```#;::::##     \n      #:;;;;:````###;:+```##;:::,```````````##:;```````##::::::#````######```##::::##     \n      +::::::```:##;::'```##;::;````,###:```+#:;``````+##;::::::#```##:::+```,#:::;##     \n     .':::::'```##:;::;,``##::::````'#####``.+:',````+##+::::::::#``+#::;:+```#':::'#`    \n     +#######```##:::;;##,##:::+```+'#+'##```;:,#```.'#+::::::::;;,``#;:::#```##:::;#;    \n     #::::::@``.#+:::;::####:::#```##:::;;;``##:,#```;;::::::::::;#``#+:::;.``##;:::#+    \n     #;:::::+``;#;::::;::###:::'```##,;::,#``##:;;```;+:::::::::::+``##::::#``:#::::##    \n     #::::::'``'#:;'+###':;::::;``;#',;:::;``;+:::```;#:::::::::::::`+#;::;#```#':::##    \n     #''''''+``:#::,````;##;;::,``##:;,:;,:``;#;:,```##::::::::::::#`.#::::+```#+:::##    \n     #::::::#```#;:'``````;#:::.``##:;,::::``;#:,:,``##;:::::;;;:::#``#+:::'```##:::##    \n    `#;:::::#```#+:#````````#:;,``##:::,,;,``:#;,;;``@#:::::::##;::;``##:::````##:::##    \n    `#::::::#```##::##``````##::``##;::::,:``:#,,,#``;#;:::::``+#:::.`+#::,```,#+:::#+    \n    `#;:::::;````#:;:#``````##:'``##::,:;::``;#,;:#``.#::::::``##:::```#'.````##::::#'    \n     ########'```##;;#``````##;#``##:,;:::;``;;:::#```#;:::'```##:;````'``````##::::#.    \n     #'::::::#````###```````##;#``##,:::::'``;;:::#```;#:::````##:;`````````;##+::::#     \n     ##:::::::#`````````+#``##;#``+;:::::;```;#;::+```.;##`````##:````````.####:::::#     \n     ##;::::::+#```````.##``+#:+```#:;::;;```##::;#```````````##;;.`````'#####::::::#     \n     #############';+#####``'#::,``##''+;```,##:;;````````````##;:##########;;::::::#     \n     ##;:::::::;##########``'#::;````.``````##::;.``````````####:::#######:::::::::;;     \n     ,##::::::::::####'::+,`##:,;#`````````###:::#+``````+#;###:::::;+'::;:::::::::#      \n      ##:::::::::;:;:;::::####,::;##+,```,###;::::##########;+;;::::::::::::::::::;#      \n      ############;;::::::;##;::::###########::::::########;:,::::::::::::::::::::;#      \n      ###:::::::::::::::::::,;::::;:'######;;:::::;;;::;::::;:,::::::::::::::::::::       \n       ##::::::::::::::::::,:::::::::::::::::::::::::::::::::::,::::::::::::::::::#       \n       ##+::::::::::::::;:,:::::::::;:;::;;;::;:::::::::::::::::,:::::::::::::::::;       \n       '##';;;;;;;;;:::::,:::::::::::+#;.``,'###'::::::::::::::::,;::::::::::::::;        \n        ##+;::::::::::::,::::::::::;.`:;````,#``+#:::::::::::::::;,::::::::::::::+        \n        ###::::::::::::,::::::::::;`+````````````;:::::::::::::::::,:::::::::::::         \n         ############:,:::::::::::#.``````````````::::::::::::::::::,::::::::::::         \n         '##;:;:::::;,;:::::::::::;#.```````````:`:::::::::::::::::::,::::::::;+          \n          ###:::::::::::::::::::::+####+.```:##:``:::::::::::::::::::::::::::::           \n          `+##::::::::::::::;:::::'#+;``:,,``````+:::::::::::::::::::::::::::;:           \n         ` '###,::::;:::::::::::::+##;``.```.``;++:;:;::::::::::::::::::::;::#            \n          ` ###':::::::;::::::::::##+@#'#####':,+`::::;:::::::::::::::::::::#             \n        `    ##'###'##'#+##:::::::#+;##++::+#''```,::::::::::::::;:::::::::# ` `          \n              #'##::::::::;;:::;::+'+:.`,`.``.```;:::::::::::::::::::::::;#     ` `       \n               '###::::::::::,:::;+#'+`..````..#.':;::::::::::::::::::::'#    `           \n         `  ,#'.###'#:;:;:;;;:;:::#'#:#+###+#'`+,`::;::::::::::::::;;+'#'     `           \n         ` '`'..`+#'#+'::,::;:::::+'++#+#@###',`.`,:;:::;:'+##+;::#:`````'##' `           \n          .```````.'#+#+#;#'##+:::+'+;``.````.````,::::##.`````;#;`,:`````:;.#;           \n        ` `````.```'`.#,``,',`.+:;+'##.`.`````:#`.::;#`.:``````+.;#```.`.````:,#  `       \n          +````.```.```.``````'`#:#'#:+##'##+:`+``,:+`;.``..`````+``.`.`.`````'.; `       \n         ``#;``.`+,.```````````#.##;+'#'####++````::#.`.``..````.`'```````````.:'         \n          ;`.#####``````````````+###+;``,```````.`+##``.````````:``##.``````````.         \n          #:``+``@#,```````````#`#####'`.````,+#``##+##`````````,#```###+,```;#.          \n           ##'+``#;+##;,..,'##``` +###,+####'`'#``:`#``+######''``#,`````,;+.```          \n    `        .####+:#``+,.``````: :++;+######.````  '#`:`.'```````;+#+```;``.```          \n   `              ###``;``````',   #+;``.```````;    '##.`+````,#'   ,########            \n  `                 #########.      ###;.````+#;        +#####'                           \n `                                     .;'':`                                            `\n");

		String name = JOptionPane.showInputDialog ("Please enter your name:");
		String friend = JOptionPane.showInputDialog ("Please enter your friend's name:");

		//ASCII ART TITLE
		System.out.println ("\n\n\n" + asciititle + "/n" + asciititle2);

		//Intro

		name = Character.toUpperCase (name.charAt (0)) + name.substring (1); //UPPERCASE
		friend = Character.toUpperCase (friend.charAt (0)) + friend.substring (1); //UPPERCASE
		System.out.println ();

		printSlow ("\n" + name + ", imagine living as an Irish immigrant, who works for at a small factory in New York.");
		printSlow ("\nYou get $2.25 a day, which is barely enough for you to survive with your wife and your three children. ");
		printSlow ("\nOne Saturday morning, your neighbor (" + friend + "), ");
		printSlow ("\nwho knows how to read and write tells you that a man named James W. Marshall has found gold!");
		printSlow ("\nYes, that is right - valuable, yellow, shiny GOLD! Your neighbor, ");
		printSlow ("\nwho earns a quarter more than you a day but has 5 children, tells you that he is going to go diggin' fo' some gold. \n\n" + friend + " asks you, " + name + ", do you want to come with me?\n");


		//<--- START YES OR NO--->
		while (true)
		{
		    char yesORno = IBIO.inputChar ("You say [Y/N]: ");

		    System.out.println ("");
		    if (yesORno == 'Y' || yesORno == 'y')
		    {
			System.out.println ("You decide to go with " + friend + ".");
			break;
		    }

		    else if (yesORno == 'N' || yesORno == 'n')
		    {
			char yesORno1 = IBIO.inputChar ("You said No, did you change your mind? [Y/N] ");

			if (yesORno1 == 'Y' || yesORno1 == 'y')
			    System.out.println ("");

			else if (yesORno1 == 'N' || yesORno1 == 'n')
			    System.out.println ("Sorry but I am going to keep asking you until you say 'Y' or 'y'\n");
		    }
		    else
		    {
			System.out.println ("Error, please Enter 'Y' for Yes and 'N' for No");
		    }
		}
		//<--- END YES OR NO--->

		System.out.println (starbreak
			+ "\nYou and your friend go to the Department of Transportation to ask for a permit."
			+ starbreak
			+ "\nMr. Adams, the permit officier, asks you for your name."
			+ "\nYour friend says that, his name is " + friend + " and you say that your name is " + name + ".");


		//<--- STAR WHERE --->
		System.out.println ("He asks you, where you want to go.\n\n");
		System.out.println ("You ask yourself, where is the Gold Rush?\na. Boston\nb. Washington D.C\nc. California\nd. Florida");

		while (true)
		{
		    char where = IBIO.inputChar ("\nAfter thinking for a few minutes, you say: ");
		    if (where == 'c' || where == 'C')
		    {
			System.out.println ("Nice! The Gold Rush is in California!");
			break;
		    }
		    else
		    {
			System.out.println ("Oh, no! That's not right! You don't want to tell Mr. Adams the wrong place and get lost, do you? Enter the correct answer, please.");
		    }
		}
		//<--- END WHERE --->
		System.out.println ("\n"
			+ "Mr. Adams tells you that California and the West Coast of the United States is getting crowded with more people going "
			+ "\nthere to get rich quick with the gold. He tells you the U.S. government has introduced a new law "
			+ "\nand that there is one small \"test\" that you have to pass before diggin' up fo' GOLD.");


		while (true)
		{
		    char yesOno = IBIO.inputChar ("Mr. Adams asks you if you are ready for the test [Y/N]: ");
		    if (yesOno == 'Y' || yesOno == 'y')
		    {
			System.out.println ("Way to go, you are up for the challenge. There are only eight questions in this small test.");
			break;
		    }
		    else if (yesOno == 'N' || yesOno == 'n')
		    {
			System.out.println ("Aww jee, I guess that is too bad because you are still going to do the test!");
			break;
		    }
		    else
		    {
			System.out.println ("ERROR! Please type 'y' for YES and 'n' for NO, this is my last warning!");
			System.out.println ("");

		    }
		}

		////////////////////////////////////////TASK ONE START/////////////////////////////////


		//Whimsy FONT (http://patorjk.com/software/taag/)
		System.out.println (starbreak + "\n" + ascii1 + "\n" + starbreak);
		System.out.println ("\nWhich of the following tools is NOT used in the gold mining process?");
		System.out.println ("a. Plaice\nb. Sluice box\nc. Pan\nd. Rocker");

		char task1 = ' ';
		while (true)
		{
		    String answer1 = " ";
		    task1 = IBIO.inputChar ("Your answer is: ");


		    switch (task1)
		    {
			case 'a':
			    answer1 = "Plaice";
			    break;
			case 'A':
			    answer1 = "Plaice";
			    break;
			case 'b':
			    answer1 = "Sluice box";
			    break;
			case 'B':
			    answer1 = "Sluice box";
			    break;
			case 'c':
			    answer1 = "Pan";
			    break;
			case 'C':
			    answer1 = "Pan";
			    break;
			case 'd':
			    answer1 = "Rocker";
			    break;
			case 'D':
			    answer1 = "Rocker";
			    break;
			default:
			    answer1 = "INVALID CHOICE";
		    }


		    char fanswer = IBIO.inputChar ("\nYou have entered " + answer1 + ". Is that your final answer [Y/N]? ");
		    if (fanswer == 'y' || fanswer == 'Y')
		    {
			break;
		    }
		    else
		    {
			System.out.println ("Sorry please type your answer again.\n");
		    }
		}

		int score1 = 0;
		if (task1 == 'a' || task1 == 'A')
		{
		    score1 = 75;

		}
		System.out.println ("\nWell, that was not that hard. Was it? Ready for your next task?\n\nHere it is:\n");

		////////////////////////////////////////TASK ONE END | TASK TWO START/////////////////////////////////
		System.out.println (starbreak + "\n" + ascii2 + "\n" + starbreak);
		System.out.println ("\nWhy is gold popular?");
		System.out.println ("a. It is easy to find.\nb. It has a beautiful shade of yellow.\nc. It makes people rich.\nd. All of the above.");

		char task2 = ' ';
		while (true)
		{
		    String answer2 = " ";
		    task2 = IBIO.inputChar ("Your answer is: ");

		    switch (task2)
		    {
			case 'a':
			    answer2 = "It is easy to find.";
			    break;
			case 'A':
			    answer2 = "It is easy to find.";
			    break;
			case 'b':
			    answer2 = "It has a beautiful shade of yellow.";
			    break;
			case 'B':
			    answer2 = "It has a beautiful shade of yellow.";
			    break;
			case 'c':
			    answer2 = "It makes people rich.";
			    break;
			case 'C':
			    answer2 = "It makes people rich.";
			    break;
			case 'd':
			    answer2 = "It is easy to find, it has a beautiful shade of yellow and it makes people rich.";
			    break;
			case 'D':
			    answer2 = "It is easy to find, it has a beautiful shade of yellow and it makes people rich.";
			    break;
			default:
			    answer2 = "INVALID CHOICE";
		    }

		    char fanswer = IBIO.inputChar ("\nYou have entered \"" + answer2 + "\"\nIs that your final answer [Y/N]? ");
		    if (fanswer == 'y' || fanswer == 'Y')
		    {
			break;
		    }
		    else
		    {
			System.out.println ("Sorry please type your answer again.\n");
		    }
		}

		int score2 = 0;
		if (task2 == 'c' || task2 == 'C')
		{
		    score2 = 75;
		    System.out.println ("Here is your next question:\n");
		}
		else
		{
		    System.out.println ("\nThat is not the right answer. Mr. Adams actually gave you the answer before\nwhen he told you that \"California and the West Coast of the United States is getting crowded\nwith more people going there to get rich quick with the gold.\" I guess you have to pay more attention next time.\nDon't worry it is only one question, you still have more to go!");
		}


		////////////////////////////////////////TASK TWO END | TASK THREE START/////////////////////////////////


		char yes0rno = IBIO.inputChar ("Are you good at word puzzles? ");
		switch (yes0rno)

		    {

			case 'y':
			    System.out.println ("Well, that's good. Let's hope it helps you on your next task: ");
			    break;
			case 'Y':
			    System.out.println ("Well, that's good. Let's hope it helps you on your next task: ");
			    break;
			case 'N':
			    System.out.println ("Well, that's too bad because your next task deals with words...");
			    break;
			case 'n':
			    System.out.println ("Well, that's too bad because your next task deals with words...");
			    break;
			default:
			    System.out.println ("Well, you did not answer my question properly but I am just going to assume, you are good at them. Here is your next task:");
			    break;
		    }


		////////////////////////////////////////TASK TWO END | TASK THREE START/////////////////////////////////
		System.out.println (starbreak + "\n" + ascii3 + "\n" + starbreak);
		System.out.println ("Your task is to unscramble the following word: AAOGNRU.\nUnscramble with the least number of tries to get the most points.\nEnter all characters uppercase.\n");
		System.out.println ("UNSCRAMBLE: AAOGNRU");
		char first = IBIO.inputChar ("Enter the first letter: ");
		int score3 = 0;

		//FIRST CHAR
		if (first == 'A' || first == 'a')
		{
		    System.out.println ("Correct.");
		    score3 = 100;
		}
		else
		    while (true)
		    {
			{
			    first = IBIO.inputChar ("Sorry, that is not right. Please enter the first letter again: ");
			    if (first == 'A' || first == 'a')
			    {
				System.out.println ("Correct.");
				break;
			    }
			    else
			    {
				System.out.println ("TRY AGAIN!");
			    }
			}
		    }
		System.out.println ("UNSCRAMBLE: AAOGNRU\n");
		//SECOND CHAR
		char second = IBIO.inputChar ("Enter the second letter: A");
		if (second == 'R' || second == 'r')
		{
		    System.out.println ("Correct.");
		    score3 = score3 + 50;
		}
		else
		    while (true)
		    {
			{
			    second = IBIO.inputChar ("Sorry, that is not right. Please enter the second letter again: A");
			    if (second == 'R' || second == 'r')
			    {
				System.out.println ("Correct.");
				break;
			    }
			    else
			    {
				System.out.println ("TRY AGAIN!");
			    }
			}
		    }
		System.out.println ("UNSCRAMBLE: AAOGNRU\n");
		//THIRD CHAR
		char third = IBIO.inputChar ("Enter the third letter: AR");
		if (third == 'G' || third == 'g')
		{
		    System.out.println ("Correct.");
		    score3 = score3 + 25;
		}
		else
		    while (true)
		    {
			{
			    third = IBIO.inputChar ("Sorry, that is not right. Please enter the third letter again: AR");
			    if (third == 'G' || third == 'g')
			    {
				System.out.println ("Correct.");
				break;
			    }
			    else
			    {
				System.out.println ("TRY AGAIN!");
			    }
			}
		    }
		System.out.println ("UNSCRAMBLE: AAOGNRU\n");
		//FOURTH CHAR
		char fourth = IBIO.inputChar ("Enter the fourth letter: ARG");
		if (fourth == 'O' || fourth == 'o')
		{
		    System.out.println ("Correct.");
		    score3 = score3 + 20;
		}
		else
		    while (true)
		    {
			{
			    fourth = IBIO.inputChar ("Sorry, that is not right. Please enter the fourth letter again: ARG");
			    if (fourth == 'O' || fourth == 'o')
			    {
				System.out.println ("Correct.");
				break;
			    }
			    else
			    {
				System.out.println ("TRY AGAIN!");
			    }
			}
		    }
		System.out.println ("UNSCRAMBLE: AAOGNRU\n");
		//FIFTH CHAR
		char fifth = IBIO.inputChar ("Enter the fifth letter: ARGO");
		if (fifth == 'N' || fifth == 'n')
		{
		    System.out.println ("Correct.");
		    score3 = score3 + 15;
		}
		else
		    while (true)
		    {
			{
			    fifth = IBIO.inputChar ("Sorry, that is not right. Please enter the fifth letter again: ARGO");
			    if (fifth == 'N' || fifth == 'n')
			    {
				System.out.println ("Correct.");
				break;
			    }
			    else
			    {
				System.out.println ("TRY AGAIN!");
			    }
			}
		    }
		System.out.println ("UNSCRAMBLE: AAOGNRU\n");
		//SIXTH CHAR
		char sixth = IBIO.inputChar ("Enter the sixth letter: ARGON");
		if (sixth == 'A' || sixth == 'a')
		{
		    System.out.println ("Correct.");
		    score3 = score3 + 10;
		}
		else
		    while (true)
		    {
			{
			    sixth = IBIO.inputChar ("Sorry, that is not right. Please enter the sixth letter again: ARGON");
			    if (sixth == 'A' | sixth == 'a')
			    {
				System.out.println ("Correct.");
				break;
			    }
			    else
			    {
				System.out.println ("TRY AGAIN!");
			    }
			}
		    }
		System.out.println ("UNSCRAMBLE: AAOGNRU\n");
		//SEVENTH CHAR
		char seventh = IBIO.inputChar ("Enter the seventh letter: ARGONA");
		if (seventh == 'U' || seventh == 'u')
		{
		    System.out.println ("Correct.");
		    score3 = score3 + 5;
		}
		else
		    while (true)
		    {
			{
			    seventh = IBIO.inputChar ("Sorry, that is not right. Please enter the seventh letter again: ARGONA");
			    if (seventh == 'U' || seventh == 'u')
			    {
				System.out.println ("Correct.");
				break;
			    }
			    else
			    {
				System.out.println ("TRY AGAIN!");
			    }
			}
		    }
		System.out.println ("UNSCRAMBLE: AAOGNRU\n");
		//EIGHTH CHAR
		char eighth = IBIO.inputChar ("Enter the eighth letter: ARGONAU");
		if (eighth == 'T' || eighth == 't')
		{
		    System.out.println ("Correct.");
		    score3 = score3 + 0;
		}
		else
		    while (true)
		    {
			{
			    eighth = IBIO.inputChar ("Sorry, that is not right. Please enter the eighth letter again: ARGONAU");
			    if (eighth == 'T' || eighth == 't')
			    {
				System.out.println ("Correct.");
				break;
			    }
			    else
			    {
				System.out.println ("TRY AGAIN!");
			    }
			}
		    }

		////////////////////////////////////////TASK THREE END | TASK FOUR START/////////////////////////////////


		System.out.println (starbreak + "\n" + ascii4 + "\n" + starbreak);
		Calendar now = Calendar.getInstance ();
		Calendar after = Calendar.getInstance ();
		System.out.println ("If it is: " + now.get (Calendar.HOUR_OF_DAY) + ":" + now.get (Calendar.MINUTE) + ":" + ", right now (in New York).\nWhat time is it in California?\n");
		//substract hours from current date using Calendar.add method
		after.add (Calendar.HOUR, -3);
		String cali = after.get (Calendar.HOUR_OF_DAY) + ":" + after.get (Calendar.MINUTE);

		String time = IBIO.inputString ("Please enter the time in the following 24-hour format (HH:MM):\t");
		int score4 = 0;

		if (cali.equals (time))
		{
		    System.out.println ("Well done! Right now, the time in California is: " + now.get (Calendar.HOUR_OF_DAY) + ":" + now.get (Calendar.MINUTE) + ":" + now.get (Calendar.SECOND));
		    score4 = 100;
		    System.out.println ("You got the points for it!");
		}
		else
		{
		    while (true)
		    {
			{
			    System.out.println ("Sorry that is not right. TRY AGAIN.\n"
				    + "\n-------------------------------------\n"
				    + "\nIf it is: " + now.get (Calendar.HOUR_OF_DAY) + ":" + now.get (Calendar.MINUTE) + ", right now (in New York).\nWhat time is it in California?");
			    String timea = IBIO.inputString ("Please enter the time in the following 24-hour format (HH:MM):\t");
			    if (cali.equals (timea))
			    {
				System.out.println ("\nAlthough that is correct, you don't get the point for it because it took you more than one try to get the correct answer.");
				System.out.println (" ");
				break;
			    }
			    else
			    {
				System.out.println (" ");
			    }
			}
		    }
		}

		////////////////////////////////////////TASK FOUR END | TASK FIVE START/////////////////////////////////
		System.out.println (starbreak + "\n" + ascii5 + "\n" + starbreak);
		System.out.println ("There are 14 words in this WORDSEARCH puzzle.\n\nFind at least THREE (3) of them and enter them (ALL CAPS AND SEPERATE IF THERE ARE TWO WORDS):\n");
		System.out.println ("D S G C D Q M N N W R R W");
		System.out.println ("A L R R H I A E Z E E I O");
		System.out.println ("H G F I A I C K N S N C N");
		System.out.println ("L A O L A K N I E A I H S");
		System.out.println ("O O C L L T N A C R M X R");
		System.out.println ("N L J A D Y S R T L U D E");
		System.out.println ("E Q C Z T K V N A O R E D");
		System.out.println ("G E E R L O D Q E L W Q N");
		System.out.println ("A T O Y U K O N H D K N U");
		System.out.println ("L F M O T G N O L T L P H");
		System.out.println ("V P R O S P E C T O R O T");
		System.out.println ("E U V G C V Q M K T M K G");
		System.out.println ("O V W O S D Z G O D T A H");
		int score5 = 0;
		String one = IBIO.inputString ("\nEnter the first word: ");
		if (one.equals ("GOLD") || one.equals ("MINER") || one.equals ("CLAIM") || one.equals ("FORTY NINER") || one.equals ("EUREKA") || one.equals ("CHINATOWN") || one.equals ("GOLDEN STAIRS") || one.equals ("DAHLONEGA") || one.equals ("YUKON") || one.equals ("NECKLACE") || one.equals ("THUNDERSNOW") || one.equals ("PROSPECTOR") || one.equals ("RICH"))
		{
		    System.out.println ("Yes! That is right! Good JOB! You got points!");
		    score5 = 50;
		}
		else
		{
		    System.out.println ("Sorry! That was not one of the 14 words.");
		}
		System.out.println (" ");

		String two = IBIO.inputString ("Enter the second word: ");
		if (two.equals (one))
		{
		    System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
		}
		else if (two.equals ("GOLD") || two.equals ("MINER") || two.equals ("CLAIM") || two.equals ("FORTY NINER") || two.equals ("EUREKA") || two.equals ("CHINATOWN") || two.equals ("GOLDEN STAIRS") || two.equals ("DAHLTWOGA") || two.equals ("YUKON") || two.equals ("NECKLACE") || two.equals ("THUNDERSNOW") || two.equals ("PROSPECTOR") || two.equals ("RICH"))
		{
		    System.out.println ("Yes! That is right! Good JOB! You got points!");
		    score5 = score5 + 75;
		}
		else
		{
		    System.out.println ("Sorry! That was not one of the 14 words.");
		}
		System.out.println (" ");
		String three = IBIO.inputString ("Enter the three word: ");

		if (three.equals (one) || three.equals (two))
		{
		    System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
		}
		else if (three.equals ("GOLD") || three.equals ("MINER") || three.equals ("CLAIM") || three.equals ("FORTY NINER") || three.equals ("EUREKA") || three.equals ("CHINATOWN") || three.equals ("GOLDEN STAIRS") || three.equals ("DAHLTHIRDGA") || three.equals ("YUKON") || three.equals ("NECKLACE") || three.equals ("THUNDERSNOW") || three.equals ("PROSPECTOR") || three.equals ("RICH"))
		{
		    System.out.println ("Yes! That is right! Good JOB! You got points!");
		    score5 = score5 + 100;
		}
		else
		{
		    System.out.println ("Sorry! That was not one of the 14 words.");
		}


		////////////////////////////////////////TASK FIVE END | TASK SIX START/////////////////////////////////
		System.out.println (starbreak + "\n" + ascii6 + "\n" + starbreak);
		System.out.println ("This task will be a multiple choice:");
		System.out.println ("The average price per ounce of Gold in San Francisco during the Gold Rush was: ");
		System.out.println ("A. $1,000\nB. $500\nC. $16\nD. $4");
		int score6 = 0;
		char BONuS = ' ';
		char BONuS2 = ' ';
		char tsix = IBIO.inputChar ("\nYour answer is: ");
		if (tsix == 'c' || tsix == 'C')
		{
		    score6 = 75;
		    BONuS = 'Y';
		}
		else
		{
		    BONuS = 'N';
		}

		System.out.println ("\nHere is your second question:");
		System.out.println ("What is the largest city in California?");
		System.out.println ("A. Los Angeles\nB. San Francisco\nC. Sacramento\nD. San Diego");
		char tsix2 = IBIO.inputChar ("\nYour answer is: ");
		if (tsix2 == 'b' || tsix2 == 'B')
		{
		    score6 = score6 + 100;
		    BONuS2 = 'Y';
		}
		else
		{
		    BONuS2 = 'N';
		}


		if (BONuS == 'Y' && BONuS2 == 'Y')
		{
		    System.out.println ("WOW! Nice, you answered both questions right! Here is your BONUS TASK SIX question! (This one is worth more points!)");

		    System.out.println ("\nThe longest route to the gold fields, taking about 6 months is: ");
		    System.out.println ("A. The overland route\nB. The Panama route\nC. Around Cape Horn\nD. Take the train ");
		    char tsix3 = IBIO.inputChar ("\nYour answer is: ");
		    if (tsix3 == 'A' || tsix3 == 'a')
		    {
			score6 = score6 + 125;
		    }

		}

		////////////////////////////////////////TASK SIX END | TASK SEVEN START/////////////////////////////////

		int score7 = 0;
		char SORNO = IBIO.inputChar ("Do you want to do another BONUS task [Y/N]?\nIt is a WORDSEARCH (YOU GET BONUS MARKS!): ");
		if (SORNO == 'Y' || SORNO == 'y')
		{
		    System.out.println (starbreak + "\n" + ascii7 + "\n" + starbreak);
		    System.out.println ("There are 18 words in this WORDSEARCH puzzle.\n\nFind at least FIVE (5) of them and enter them (ALL CAPS AND SEPERATE IF THERE ARE TWO WORDS):\n");
		    System.out.println (" N O N N A R B L G N I N N A P\n L O D E B T S U T T E R B Z V\n S Z A E L D A R C V K D R B W\n V M I S T N D N A M E D E F E\n M C O A F Z X Y J M J G P N N\n D B F R E I G H T E R N P Q T\n Q L S M M Q F I B O X I I R R\n P R L M K E F S T B M G L A E\n T L K A Q K U D Z O I G C D P\n Z O A I H M I J N O G I N N R\n V G O C H S V J J M R D N U E\n J V H T E H R B M T A O V G N\n O R S S N R Y A T O T O J G E\n E I C L A I M E M W E J Y E U\n C A U V A X O T F N Y V T T R\n");

		    String ws1 = IBIO.inputString ("\nEnter the first word: ");
		    if (ws1.equals ("ENTREPRENEUR") || ws1.equals ("PANNING") || ws1.equals ("PLACER") || ws1.equals ("BOOMTOWN") || ws1.equals ("CRADLE") || ws1.equals ("SUTTER") || ws1.equals ("MARSHALL") || ws1.equals ("BRANNON") || ws1.equals ("LODE") || ws1.equals ("SUPPLY") || ws1.equals ("DEMAND") || ws1.equals ("CLAIM") || ws1.equals ("DIGGING") || ws1.equals ("NUGGET") || ws1.equals ("MIGRATE") || ws1.equals ("CLIPPER") || ws1.equals ("FREIGHTER") || ws1.equals ("ISTHMUS"))
		    {
			System.out.println ("Yes! That is right! Good JOB! You got points!");
			score7 = 100;
		    }
		    else
		    {
			System.out.println ("Sorry! That was not one of the 18 words.");
		    }

		    String ws2 = IBIO.inputString ("\nEnter the second word: ");
		    if (ws2.equals (ws1))
		    {
			System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
		    }
		    else if (ws2.equals ("ENTREPRENEUR") || ws2.equals ("PANNING") || ws2.equals ("PLACER") || ws2.equals ("BOOMTOWN") || ws2.equals ("CRADLE") || ws2.equals ("SUTTER") || ws2.equals ("MARSHALL") || ws2.equals ("BRANNON") || ws2.equals ("LODE") || ws2.equals ("SUPPLY") || ws2.equals ("DEMAND") || ws2.equals ("CLAIM") || ws2.equals ("DIGGING") || ws2.equals ("NUGGET") || ws2.equals ("MIGRATE") || ws2.equals ("CLIPPER") || ws2.equals ("FREIGHTER") || ws2.equals ("ISTHMUS"))
		    {
			System.out.println ("Yes! That is right! Good JOB! You got points!");
			score7 = score7 + 75;
		    }
		    else
		    {
			System.out.println ("Sorry! That was not one of the 18 words.");
		    }

		    String ws3 = IBIO.inputString ("\nEnter the third word: ");
		    if (ws3.equals (ws1) || ws3.equals (ws2))
		    {
			System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
		    }
		    else if (ws3.equals ("ENTREPRENEUR") || ws3.equals ("PANNING") || ws3.equals ("PLACER") || ws3.equals ("BOOMTOWN") || ws3.equals ("CRADLE") || ws3.equals ("SUTTER") || ws3.equals ("MARSHALL") || ws3.equals ("BRANNON") || ws3.equals ("LODE") || ws3.equals ("SUPPLY") || ws3.equals ("DEMAND") || ws3.equals ("CLAIM") || ws3.equals ("DIGGING") || ws3.equals ("NUGGET") || ws3.equals ("MIGRATE") || ws3.equals ("CLIPPER") || ws3.equals ("FREIGHTER") || ws3.equals ("ISTHMUS"))
		    {
			System.out.println ("Yes! That is right! Good JOB! You got points!");
			score7 = score7 + 50;
		    }
		    else
		    {
			System.out.println ("Sorry! That was not one of the 18 words.");
		    }

		    String ws4 = IBIO.inputString ("\nEnter the fourth word: ");
		    if (ws4.equals (ws1) || ws4.equals (ws2) || ws4.equals (ws3))
		    {
			System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
		    }
		    else if (ws4.equals ("ENTREPRENEUR") || ws4.equals ("PANNING") || ws4.equals ("PLACER") || ws4.equals ("BOOMTOWN") || ws4.equals ("CRADLE") || ws4.equals ("SUTTER") || ws4.equals ("MARSHALL") || ws4.equals ("BRANNON") || ws4.equals ("LODE") || ws4.equals ("SUPPLY") || ws4.equals ("DEMAND") || ws4.equals ("CLAIM") || ws4.equals ("DIGGING") || ws4.equals ("NUGGET") || ws4.equals ("MIGRATE") || ws4.equals ("CLIPPER") || ws4.equals ("FREIGHTER") || ws4.equals ("ISTHMUS"))
		    {
			System.out.println ("Yes! That is right! Good JOB! You got points!");
			score7 = score7 + 25;
		    }
		    else
		    {
			System.out.println ("Sorry! That was not one of the 18 words.");
		    }
		    String ws5 = IBIO.inputString ("\nEnter the fifth word: ");
		    if (ws5.equals (ws1) || ws5.equals (ws2) || ws5.equals (ws3) || ws5.equals (ws4))
		    {
			System.out.println ("You already entered that word, you were trying to cheat, weren't you?\nYou lose your turn and NO POINTS FOR YOU!");
		    }
		    else if (ws5.equals ("ENTREPRENEUR") || ws5.equals ("PANNING") || ws5.equals ("PLACER") || ws5.equals ("BOOMTOWN") || ws5.equals ("CRADLE") || ws5.equals ("SUTTER") || ws5.equals ("MARSHALL") || ws5.equals ("BRANNON") || ws5.equals ("LODE") || ws5.equals ("SUPPLY") || ws5.equals ("DEMAND") || ws5.equals ("CLAIM") || ws5.equals ("DIGGING") || ws5.equals ("NUGGET") || ws5.equals ("MIGRATE") || ws5.equals ("CLIPPER") || ws5.equals ("FREIGHTER") || ws5.equals ("ISTHMUS"))
		    {
			System.out.println ("Yes! That is right! Good JOB! You got points!");
			score7 = score7 + 25;
		    }
		    else
		    {
			System.out.println ("Sorry! That was not one of the 18 words.");
		    }
		}

		/////////////////////////DONE GAME/////////////////////////////////////



		System.out.println ("That is all! You have answered everything! Wait a few seconds while Mr. Adams calculates your score.");
		IBIO.inputString ("\n\n\nPress ENTER to continue.\n\n\n");
		for (int x = 101 ; x > 0 ; x--)
		{
		    printSlow (x + "\t\t\t\tCALCULATING\n");
		}

		System.out.println ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nDONE CALCULATING\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		int SCORE = score1 + score2 + score3 + score4 + score5 + score6;


		int SBONUS = SCORE + score7;
		int TOTAL = 1000;

		int percent = SCORE / 10;

		IBIO.inputString ("Press ENTER to continue.\n\n\n\n");
		System.out.println (starbreak + "\n\nYour TOTAL score is: " + SCORE + " point and with the BONUS TASK, your score is: " + SBONUS + "." + starbreak);
		IBIO.inputString ("Press ENTER to check if you PASSED or FAILED.\n\n");

		System.out.println ("\nYou got " + SCORE + " POINTS OUT OF 1000 POINTS.");

		IBIO.inputString ("Press ENTER to continue.\n\n");

		//BARGRAPH
		int fill = percent;
		int empty = 100 - fill;

		System.out.println (" _________________");
		for (; fill < 100 ; fill += 10)

		    {

			System.out.println ("|                 | \n|_________________| \t ");
		    }
		for (; empty < 100 ; empty += 10)

		    {

			System.out.println ("|XXXXXXXXXXXXXXXXX| \n|_________________| ");
		    }
		System.out.println ("   Your Score:" + percent + "%\n\n\n\n");
		////////////

		if (SCORE >= 500)
		{
		    System.out.println ("YOU HAVE PASSED! HURRAY! YOU HAVE GOTTEN YOUR PERMIT TO GO TO CALIFORNIA TO GET DIGGIN' TO SAVE YOUR FAMILY! GOOD LUCK @ CALI!");
		    IBIO.inputString ("Press Enter to continue.\n\n\n\n\n\n\n\n\n\n\n");
		    System.out.println (fireworks);
		}
		else
		{
		    System.out.println ("YOU HAVE FAILED UNFORTUNATELY! YOU HAVE TO GO BACK TO YOUR HOME TO GET SLEEPIN' FOR TOMORROW'S WORK!\nPLEASE DON'T DREAM ABOUT THE GOLD RUSH EVER!");
		}
		playagain = IBIO.inputChar ("\n\n\nPlay again? ");
	    }


	    while (playagain == 'Y' || playagain == 'y');
	    System.exit (0);
	}
    }
}


