package com.company;

import java.util.Scanner;
import java.util.Random;
public class Battleship
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        Random rand = new Random();
        String p1 [] = new String[100];
        String p2 [] = new String[100];
        String pa1 [] = new String[100];
        String pa2 [] = new String[100];
        int user_choice;
        int user_choice2;
        int user_choice3 = 0;
        int user_choice4 = 0;
        int user = 0;
        for(; user == 0;)
        {
            System.out.println(" 1. Start game\n 2. Instruction\n 3. Credits\n 4. Exit game");
            int user_command = x.nextInt();

            for(;(user_command < 1) || (user_command > 4);)
            {
                System.out.println(" 1. Start game\n 2. Instruction\n 3. Credits\n 4. Exit game");
                user_command = x.nextInt();
            }

            if(user_command == 1)
            {
                System.out.println("1. Player VS Computer\n2. Player VS Player");
                user_choice = x.nextInt();

                for(;(user_choice != 1) && (user_choice != 2);)
                {
                    System.out.println("1. Player VS Computer\n2. Player VS Player");
                    user_choice = x.nextInt();
                }
                System.out.println(" 1. Default\n 2. Typical\n 3. Custom");
                user_choice2 = x.nextInt();

                for(;(user_choice2 < 1) || (user_choice2 > 3);)
                {
                    System.out.println("Option is invalid\n Please enter a valid option");
                    System.out.println(" 1. Default\n 2. Typical\n 3. Custom");
                    user_choice2 = x.nextInt();
                }

                if(user_choice2 == 3)
                {
                    System.out.println("You are in custom option\n Please select a custom mode to play");
                    System.out.println(" 1. Custom ship length\n 2. Random ship length");
                    user_choice3 = x.nextInt();

                    for(;(user_choice3 < 1) || (user_choice3 > 2);)
                    {
                        System.out.println("Option is invalid\n Please enter a valid option");
                        System.out.println(" 1. Custom ship length\n 2. Random ship length");
                        user_choice3 = x.nextInt();
                    }
                    if(user_choice3 == 1)
                    {
                        System.out.println("You are in custom ship length mode\n Please select a custom ship length mode to play");
                        System.out.println(" 1. Player ship placement\n 2. Random ship placement");
                        user_choice4 = x.nextInt();

                        for(;(user_choice4 < 1) || (user_choice4 > 2);)
                        {
                            System.out.println("Option is invalid\n Please enter a valid option");
                            System.out.println(" 1. Player ship placement\n 2. Random ship placement");
                            user_choice4 = x.nextInt();
                        }
                    }
                    else
                    {
                        System.out.println("You are in Random ship length mode\n Please select a Random ship length mode to play");
                        System.out.println(" 1. Player ship placement\n 2. Random ship placement");
                        user_choice4 = x.nextInt();

                        for(;(user_choice4 < 1) || (user_choice4 > 2);)
                        {
                            System.out.println("Option is invalid\n Please enter a valid option");
                            System.out.println(" 1. Player ship placement\n 2. Random ship placement");
                            user_choice4 = x.nextInt();
                        }
                    }
                }

                for(;user_command == 1;)
                {
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
                    //Player VS Computer Starts

                    if(user_choice == 1)
                    {

                        if(user_choice2 == 1)
                        {
                            int total_ship = 28;
                            System.out.println("You have choosed to play in default mode");

                            for(int index = 0; index < pa1.length; index++)
                            {
                                pa1[index] = "  _";
                            }

                            for(int index = 0; index < pa2.length; index++)
                            {
                                pa2[index] = "  _";
                            }
                            //--------------------------------------------------------------------------------------------------------------------------------
                            //ship placement starts


                            //--------------------------------------------------------------------------------||||
                            //player's Ship placement starts


                            int length = 1;

                            for(int index = 0; index < p1.length; index++)
                            {
                                p1[index] = "  _";
                            }

                            for(int index = 1; index <= 7; index++)
                            {
                                int i = rand.nextInt(93);

                                for(int j = i; j < i + length; j++)
                                {
                                    if(p1[j] == "  S")
                                    {
                                        i = rand.nextInt(93);
                                        j = i - 1;
                                    }
                                }
                                for(int j = i; j < i + length; j++)
                                {
                                    p1[j] = "  S";
                                }
                                length++;
                            }
                            System.out.println("\n");

                            //Player's ship placement ends
                            //--------------------------------------------------------------------------------||||

                            //--------------------------------------------------------------------------------||||
                            //computer Ship placement starts

                            length = 1;
                            for(int index = 0; index < p2.length; index++)
                            {
                                p2[index] = "  _";
                            }

                            for(int index = 1; index <= 7; index++)
                            {
                                int i = rand.nextInt(93);

                                for(int j = i; j < i + length; j++)
                                {
                                    if(p2[j] == "  S")
                                    {
                                        i = rand.nextInt(93);
                                        j = i - 1;
                                    }
                                }
                                for(int j = i; j < i + length; j++)
                                {
                                    p2[j] = "  S";
                                }
                                length++;
                            }
                            System.out.println("\n");

                            //Computer ship placement ends
                            //--------------------------------------------------------------------------------||||

                            //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                            //attack field setup starts

                            //---------------------------------------------------------------------------------||||
                            //Player's attack field start

                            System.out.println("Player's attack field:");

                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(pa1[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa1.length; index++)
                            {
                                System.out.print(pa1[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa1.length; index++)
                            {
                                if(index == pa1.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");

                            // player's attack field end
                            //---------------------------------------------------------------------------------||||


                            //---------------------------------------------------------------------------------||||
                            //Computer's attack field start

                            System.out.println("Computer's attack field:");

                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(pa2[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            System.out.println();

                            for(int index = 50; index < pa2.length; index++)
                            {
                                System.out.print(pa2[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa2.length; index++)
                            {
                                if(index == pa2.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");
                            // p2 attack field end
                            //---------------------------------------------------------------------------------||||

                            //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                            //attack starts

                            int player_turn = 0;
                            int computer_turn = 0;
                            int ship_des_player = 0;
                            int ship_des_computer = 0;


                            for(int atk_loop = 1; ; atk_loop++)
                            {
                                //----------------------------------------------------------------------------------------------//
                                //player 1 attack input starts

                                System.out.println("Player's turn:\n Please enter a tile number to attack");
                                int p1_atk_input = x.nextInt();
                                for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                {
                                    System.out.println("Input invalid\n Please enter another tile number");
                                    p1_atk_input = x.nextInt();
                                }

                                for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                {
                                    System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                    p1_atk_input = x.nextInt();
                                }

                                if(p2[p1_atk_input - 1] == "  S")
                                {
                                    System.out.println();

                                    player_turn++;
                                    ship_des_player++;
                                    System.out.println("***BULL'S EYE***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                    pa1[p1_atk_input - 1] = "  H";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else
                                {
                                    player_turn++;
                                    System.out.println("***Target missed***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                    pa1[(p1_atk_input - 1)] = "  M";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                System.out.println();

                                //player 1 attack input ends
                                //----------------------------------------------------------------------------------------------//


                                //----------------------------------------------------------------------------------------------//
                                //Computer's attack input starts

                                System.out.println("Computer's turn:");
                                int p2_atk_input = rand.nextInt(100);

                                for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                {
                                    p2_atk_input = rand.nextInt(100);
                                }

                                for(;(pa2[p2_atk_input] == "  H") || (pa2[p2_atk_input] == "  M");)
                                {
                                    p2_atk_input = rand.nextInt(100);
                                }

                                if(p1[(p2_atk_input)] == "  S")
                                {
                                    System.out.println();

                                    computer_turn++;
                                    ship_des_computer++;
                                    System.out.println("***BULL'S EYE***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                    pa2[(p2_atk_input)] = "  H";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else
                                {
                                    computer_turn++;
                                    System.out.println("***Target missed***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                    pa2[(p2_atk_input)] = "  M";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }

                                //Computer attack input ends
                                //----------------------------------------------------------------------------------------------//

                                //----------------------------------------------------------------------------------------------//
                                //battle result logic

                                if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                {
                                    break;
                                }
                                else if(ship_des_player == total_ship)
                                {
                                    break;
                                }
                                else if (ship_des_computer == total_ship)
                                {
                                    break;
                                }

                                System.out.println();

                                //battle logic ends
                                //----------------------------------------------------------------------------------------------//
                            }
                            //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                            System.out.println("\n");
                            if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                            {
                                if(player_turn == computer_turn)
                                {
                                    System.out.println("Game over\nDraw\n");
                                }
                                else if(player_turn > computer_turn)
                                {
                                    System.out.println("Game over\nPlayer is the winner\n");
                                }
                                else
                                {
                                    System.out.println("Game over\nComputer is the winner\n");
                                }
                            }
                            else if(ship_des_player == total_ship)
                            {
                                System.out.println("Game over\nPlayer is the winner\n");
                            }
                            else if (ship_des_computer == total_ship)
                            {
                                System.out.println("Game over\nComputer is the winner\n");
                            }

//---------------------------------------------------------------------------------------------------------------------------------
                            //ship placement history

                            // player 1
                            System.out.println("Player's ship placement:");
                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(p1[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa1.length; index++)
                            {
                                System.out.print(p1[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa1.length; index++)
                            {
                                if(index == p1.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");

                            //Computer
                            System.out.println("Computer's ship placement:");
                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(p2[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();



                            for(int index = 50; index < pa2.length; index++)
                            {
                                System.out.print(p2[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa2.length; index++)
                            {
                                if(index == p2.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println();
                        }
                        else if(user_choice2 == 2)    ////////////////////typical
                        {
                            int total_ship = 28;
                            System.out.println("You have choosed to play in typical mode");

                            for(int index = 0; index < pa1.length; index++)
                            {
                                pa1[index] = "  _";
                            }

                            for(int index = 0; index < pa2.length; index++)
                            {
                                pa2[index] = "  _";
                            }
                            //--------------------------------------------------------------------------------------------------------------------------------
                            //ship placement starts


                            //--------------------------------------------------------------------------------||||
                            //player's Ship placement starts


                            int length = 1;

                            System.out.println("Player 1 please place your ships:\n Please enter your tile number to place the ships:");

                            for(int index = 0; index < p1.length; index++)
                            {
                                p1[index] = "  _";
                            }

                            for(int index = 1; index <= 7; index++) //index = ship count
                            {
                                System.out.println("  Ship " + index + " : Length is " + length );
                                int ship_tile = x.nextInt();

                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                {
                                    System.out.println("Input invalid\n please enter another tile number");
                                    ship_tile = x.nextInt();
                                }
                                int ship_place = length + ship_tile - 1;

                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                {
                                    System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                    ship_tile = x.nextInt();
                                    for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                    {
                                        System.out.println("Input invalid\n please enter another tile number");
                                        ship_tile = x.nextInt();
                                    }
                                    ship_place = ship_tile + length - 1;
                                }

                                for(int i = ship_tile - 1; i < ship_place; i++)
                                {
                                    if(p1[i] == "  S")
                                    {
                                        System.out.println("Ship already exist from this tile.\n Kindly enter another tile number.");
                                        ship_tile = x.nextInt();

                                        for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                        {
                                            System.out.println("Input invalid\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                        }
                                        ship_place = length + ship_tile -1;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                            ship_place = x.nextInt();
                                        }
                                        i = ship_tile - 2;
                                    }
                                }
                                for(int i = ship_tile - 1; i <= ship_place - 1; i++)
                                {
                                    p1[(i)] = "  S";
                                }
                                length++;
                            }

                            //Player's ship placement ends
                            //--------------------------------------------------------------------------------||||

                            //--------------------------------------------------------------------------------||||
                            //computer Ship placement starts

                            length = 1;
                            for(int index = 0; index < p2.length; index++)
                            {
                                p2[index] = "  _";
                            }

                            for(int index = 1; index <= 7; index++)
                            {
                                int i = rand.nextInt(100);

                                for(int j = i; j < i + length; j++)
                                {
                                    if(p2[j] == "  S")
                                    {
                                        i = rand.nextInt(100);
                                        j = i - 1;
                                    }
                                }
                                for(int j = i; j < i + length; j++)
                                {
                                    p2[j] = "  S";
                                }
                                length++;
                            }
                            System.out.println("\n");

                            //Computer ship placement ends
                            //--------------------------------------------------------------------------------||||

                            //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                            //attack field setup starts

                            //---------------------------------------------------------------------------------||||
                            //Player's attack field start

                            System.out.println("Player's attack field:");

                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(pa1[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa1.length; index++)
                            {
                                System.out.print(pa1[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa1.length; index++)
                            {
                                if(index == pa1.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");

                            // player's attack field end
                            //---------------------------------------------------------------------------------||||


                            //---------------------------------------------------------------------------------||||
                            //Computer's attack field start

                            System.out.println("Computer's attack field:");

                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(pa2[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            System.out.println();

                            for(int index = 50; index < pa2.length; index++)
                            {
                                System.out.print(pa2[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa2.length; index++)
                            {
                                if(index == pa2.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");
                            // p2 attack field end
                            //---------------------------------------------------------------------------------||||

                            //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                            //attack starts

                            int player_turn = 0;
                            int computer_turn = 0;
                            int ship_des_player = 0;
                            int ship_des_computer = 0;


                            for(int atk_loop = 1; ; atk_loop++)
                            {
                                //----------------------------------------------------------------------------------------------//
                                //player 1 attack input starts

                                System.out.println("Player's turn:\n Please enter a tile number to attack");
                                int p1_atk_input = x.nextInt();
                                for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                {
                                    System.out.println("Input invalid\n Please enter another tile number");
                                    p1_atk_input = x.nextInt();
                                }

                                for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                {
                                    System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                    p1_atk_input = x.nextInt();
                                }

                                if(p2[p1_atk_input - 1] == "  S")
                                {
                                    System.out.println();

                                    player_turn++;
                                    ship_des_player++;
                                    System.out.println("***BULL'S EYE***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                    pa1[p1_atk_input - 1] = "  H";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else
                                {
                                    player_turn++;
                                    System.out.println("***Target missed***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                    pa1[(p1_atk_input - 1)] = "  M";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                System.out.println();

                                //player 1 attack input ends
                                //----------------------------------------------------------------------------------------------//


                                //----------------------------------------------------------------------------------------------//
                                //Computer's attack input starts

                                System.out.println("Computer's turn:");
                                int p2_atk_input = rand.nextInt(100);

                                for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                {
                                    p2_atk_input = rand.nextInt(100);
                                }

                                for(;(pa2[p2_atk_input] == "  H") || (pa2[p2_atk_input] == "  M");)
                                {
                                    p2_atk_input = rand.nextInt(100);
                                }

                                if(p1[(p2_atk_input)] == "  S")
                                {
                                    System.out.println();

                                    computer_turn++;
                                    ship_des_computer++;
                                    System.out.println("***BULL'S EYE***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                    pa2[(p2_atk_input)] = "  H";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else
                                {
                                    computer_turn++;
                                    System.out.println("***Target missed***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                    pa2[(p2_atk_input)] = "  M";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }

                                //Computer attack input ends
                                //----------------------------------------------------------------------------------------------//

                                //----------------------------------------------------------------------------------------------//
                                //battle result logic

                                if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                {
                                    break;
                                }
                                else if(ship_des_player == total_ship)
                                {
                                    break;
                                }
                                else if (ship_des_computer == total_ship)
                                {
                                    break;
                                }

                                System.out.println();

                                //battle logic ends
                                //----------------------------------------------------------------------------------------------//
                            }
                            //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                            System.out.println("\n");
                            if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                            {
                                if(player_turn == computer_turn)
                                {
                                    System.out.println("Game over\nDraw\n");
                                }
                                else if(player_turn > computer_turn)
                                {
                                    System.out.println("Game over\nPlayer is the winner\n");
                                }
                                else
                                {
                                    System.out.println("Game over\nComputer is the winner\n");
                                }
                            }
                            else if(ship_des_player == total_ship)
                            {
                                System.out.println("Game over\nPlayer is the winner\n");
                            }
                            else if (ship_des_computer == total_ship)
                            {
                                System.out.println("Game over\nComputer is the winner\n");
                            }

//---------------------------------------------------------------------------------------------------------------------------------
                            //ship placement history

                            // player 1
                            System.out.println("Player's ship placement:");
                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(p1[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa1.length; index++)
                            {
                                System.out.print(p1[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa1.length; index++)
                            {
                                if(index == p1.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");

                            //Computer
                            System.out.println("Computer's ship placement:");
                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(p2[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa2.length; index++)
                            {
                                System.out.print(p2[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa2.length; index++)
                            {
                                if(index == p2.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println();
                        }
                        else if(user_choice2 == 3)     ///////////////////////custom
                        {

                            if(user_choice3 == 1)                  //////////////////////////// custom ship length mode
                            {

                                if(user_choice4 == 1)                               ////////////////////////// custom: player ship length_user placement mode
                                {
                                    System.out.println();
                                    System.out.println("You have choosed to play Custom mode's Player ship length and Player ship placement mode");

                                    for(int index = 0; index < pa1.length; index++)
                                    {
                                        pa1[index] = "  _";
                                    }

                                    for(int index = 0; index < pa2.length; index++)
                                    {
                                        pa2[index] = "  _";
                                    }
                                    //--------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement starts


                                    //--------------------------------------------------------------------------------||||
                                    //player's Ship placement starts


                                    int length[] = new int[7];

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p1[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        System.out.println("Player 1 please enter your ship " + index + " length (From 1 to 7)");   //ship length input starts
                                        int n = x.nextInt();
                                        for(; (n < 1) || (n > 7);)
                                        {
                                            System.out.println("For better gaming experience please try to follow the instructions");
                                            System.out.println("Player 1 please enter your ship " + index + " length (From 1 to 7)");
                                            n = x.nextInt();
                                        }
                                        length[index - 1] = n; // ship length input ends

                                        System.out.println("  Ship " + index + " : Length is " + length[index - 1] );
                                        System.out.println("Please enter a tile number to place your ship");
                                        int ship_tile = x.nextInt();

                                        for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                        {
                                            System.out.println("Input invalid\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                        }
                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                            for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                            {
                                                System.out.println("Input invalid\n please enter another tile number");
                                                ship_tile = x.nextInt();
                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile - 1; i < ship_place; i++)
                                        {
                                            if(p1[i] == "  S")
                                            {
                                                System.out.println("Ship already exist from this tile.\n Kindly enter another tile number.");
                                                ship_tile = x.nextInt();

                                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                                {
                                                    System.out.println("Input invalid\n please enter another tile number");
                                                    ship_tile = x.nextInt();
                                                }
                                                ship_place = length[index - 1] + ship_tile -1;

                                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                                {
                                                    System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                                    ship_place = x.nextInt();
                                                }
                                                i = ship_tile - 2;
                                            }
                                        }
                                        for(int i = ship_tile - 1; i <= ship_place - 1; i++)
                                        {
                                            p1[(i)] = "  S";
                                        }
                                    }

                                    //Player's ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //--------------------------------------------------------------------------------||||
                                    //computer Ship placement starts

                                    for(int index = 0; index < p2.length; index++)
                                    {
                                        p2[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++)
                                    {
                                        int i = rand.nextInt(93);

                                        for(int j = i; j < i + length[index - 1]; j++)
                                        {
                                            if(p2[j] == "  S")
                                            {
                                                i = rand.nextInt(93);
                                                j = i - 1;
                                            }
                                        }
                                        for(int j = i; j < i + length[index - 1]; j++)
                                        {
                                            p2[j] = "  S";
                                        }
                                    }
                                    System.out.println("\n");

                                    //Computer ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //total ship count starts

                                    int total_ship = 0;
                                    for(int i = 0; i < length.length; i++)
                                    {
                                        total_ship += length[i];
                                    }
                                    System.out.println();
                                    System.out.println("Total ship parts = " + total_ship + "\n");

                                    //total ship count ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack field setup starts

                                    //---------------------------------------------------------------------------------||||
                                    //Player's attack field start

                                    System.out.println("Player's attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    // player's attack field end
                                    //---------------------------------------------------------------------------------||||


                                    //---------------------------------------------------------------------------------||||
                                    //Computer's attack field start

                                    System.out.println("Computer's attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");
                                    // p2 attack field end
                                    //---------------------------------------------------------------------------------||||

                                    //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack starts

                                    int player_turn = 0;
                                    int computer_turn = 0;
                                    int ship_des_player = 0;
                                    int ship_des_computer = 0;


                                    for(int atk_loop = 1; ; atk_loop++)
                                    {
                                        //----------------------------------------------------------------------------------------------//
                                        //player 1 attack input starts

                                        System.out.println("Player's turn:\n Please enter a tile number to attack");
                                        int p1_atk_input = x.nextInt();
                                        for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p1_atk_input = x.nextInt();
                                        }

                                        for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                            p1_atk_input = x.nextInt();
                                        }

                                        if(p2[p1_atk_input - 1] == "  S")
                                        {
                                            System.out.println();

                                            player_turn++;
                                            ship_des_player++;
                                            System.out.println("***BULL'S EYE***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                            pa1[p1_atk_input - 1] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            player_turn++;
                                            System.out.println("***Target missed***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                            pa1[(p1_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        System.out.println();

                                        //player 1 attack input ends
                                        //----------------------------------------------------------------------------------------------//


                                        //----------------------------------------------------------------------------------------------//
                                        //Computer's attack input starts

                                        System.out.println("Computer's turn:");
                                        int p2_atk_input = rand.nextInt(100);

                                        for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                        {
                                            p2_atk_input = rand.nextInt(100);
                                        }

                                        for(;(pa2[p2_atk_input] == "  H") || (pa2[p2_atk_input] == "  M");)
                                        {
                                            p2_atk_input = rand.nextInt(100);
                                        }

                                        if(p1[(p2_atk_input)] == "  S")
                                        {
                                            System.out.println();

                                            computer_turn++;
                                            ship_des_computer++;
                                            System.out.println("***BULL'S EYE***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                            pa2[(p2_atk_input)] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            computer_turn++;
                                            System.out.println("***Target missed***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                            pa2[(p2_atk_input)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }

                                        //Computer attack input ends
                                        //----------------------------------------------------------------------------------------------//

                                        //----------------------------------------------------------------------------------------------//
                                        //battle result logic

                                        if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                        {
                                            break;
                                        }
                                        else if(ship_des_player == total_ship)
                                        {
                                            break;
                                        }
                                        else if (ship_des_computer == total_ship)
                                        {
                                            break;
                                        }

                                        System.out.println();

                                        //battle logic ends
                                        //----------------------------------------------------------------------------------------------//
                                    }
                                    //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                                    System.out.println("\n");
                                    if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                    {
                                        if(player_turn == computer_turn)
                                        {
                                            System.out.println("Game over\nDraw\n");
                                        }
                                        else if(player_turn > computer_turn)
                                        {
                                            System.out.println("Game over\nPlayer is the winner\n");
                                        }
                                        else
                                        {
                                            System.out.println("Game over\nComputer is the winner\n");
                                        }
                                    }
                                    else if(ship_des_player == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer is the winner\n");
                                    }
                                    else if (ship_des_computer == total_ship)
                                    {
                                        System.out.println("Game over\nComputer is the winner\n");
                                    }

//---------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement history

                                    // player 1
                                    System.out.println("Player's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == p1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    //Computer
                                    System.out.println("Computer's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();



                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == p2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }

                                else if(user_choice4 == 2)            // ************************************** Custom: player ship length and random placement mode
                                {
                                    System.out.println();
                                    System.out.println("You have choosed to play Custom mode's Player ship length and Random ship placement mode");

                                    for(int index = 0; index < pa1.length; index++)
                                    {
                                        pa1[index] = "  _";
                                    }

                                    for(int index = 0; index < pa2.length; index++)
                                    {
                                        pa2[index] = "  _";
                                    }
                                    //--------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement starts


                                    //--------------------------------------------------------------------------------||||
                                    //player's Ship placement starts


                                    int length[] = new int[7];

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p1[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        System.out.println("Player 1 please enter your ship " + index + " length (From 1 to 7)");   //ship length input starts
                                        int n = x.nextInt();
                                        for(; (n < 1) || (n > 7);)
                                        {
                                            System.out.println("For better gaming experience please try to follow the instructions");
                                            System.out.println("Player 1 please enter your ship " + index + " length (From 1 to 7)");
                                            n = x.nextInt();
                                        }
                                        length[index - 1] = n; // ship length input ends

                                        int ship_tile = rand.nextInt(100);


                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            ship_tile = rand.nextInt(100);

                                            for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                            {
                                                ship_tile = rand.nextInt(100);


                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile; i < ship_place; i++)
                                        {
                                            if(p1[i] == "  S")
                                            {
                                                ship_tile = rand.nextInt(100);

                                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);
                                                }
                                                ship_place = length[index - 1] + ship_tile - 1;

                                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);
                                                    ship_place = length[index - 1] + ship_tile - 1;
                                                }
                                                i = ship_tile - 2;
                                            }
                                        }
                                        for(int i = ship_tile; i <= ship_place; i++)
                                        {
                                            p1[(i)] = "  S";
                                        }
                                    }

                                    //Player's ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //--------------------------------------------------------------------------------||||
                                    //computer Ship placement starts

                                    for(int index = 0; index < p2.length; index++)
                                    {
                                        p2[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++)
                                    {
                                        int ship_tile = rand.nextInt(100);


                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p2.length);)
                                        {
                                            ship_tile = rand.nextInt(100);

                                            for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                            {
                                                ship_tile = rand.nextInt(100);

                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile; i < ship_place; i++)
                                        {
                                            if(p2[i] == "  S")
                                            {
                                                ship_tile = rand.nextInt(100);


                                                for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);

                                                }
                                                ship_place = length[index - 1] + ship_tile - 1;

                                                for(;(ship_place < 1) || (ship_place > p2.length);)
                                                {
                                                    ship_tile= rand.nextInt(100);
                                                    ship_place = length[index - 1] + ship_tile - 1;
                                                }
                                                i = ship_tile - 2;
                                            }
                                        }
                                        for(int i = ship_tile; i <= ship_place; i++)
                                        {
                                            p2[(i)] = "  S";
                                        }
                                    }

                                    //Computer ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //total ship count starts

                                    int total_ship = 0;
                                    for(int i = 0; i < length.length; i++)
                                    {
                                        total_ship += length[i];
                                    }

                                    System.out.println();
                                    System.out.println("Total ship parts = " + total_ship + "\n");

                                    //total ship count ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack field setup starts

                                    //---------------------------------------------------------------------------------||||
                                    //Player's attack field start

                                    System.out.println("Player's attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    // player's attack field end
                                    //---------------------------------------------------------------------------------||||


                                    //---------------------------------------------------------------------------------||||
                                    //Computer's attack field start

                                    System.out.println("Computer's attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");
                                    // p2 attack field end
                                    //---------------------------------------------------------------------------------||||

                                    //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack starts

                                    int player_turn = 0;
                                    int computer_turn = 0;
                                    int ship_des_player = 0;
                                    int ship_des_computer = 0;


                                    for(int atk_loop = 1; ; atk_loop++)
                                    {
                                        //----------------------------------------------------------------------------------------------//
                                        //player 1 attack input starts

                                        System.out.println("Player's turn:\n Please enter a tile number to attack");
                                        int p1_atk_input = x.nextInt();
                                        for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p1_atk_input = x.nextInt();
                                        }

                                        for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                            p1_atk_input = x.nextInt();
                                        }

                                        if(p2[p1_atk_input - 1] == "  S")
                                        {
                                            System.out.println();

                                            player_turn++;
                                            ship_des_player++;
                                            System.out.println("***BULL'S EYE***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                            pa1[p1_atk_input - 1] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            player_turn++;
                                            System.out.println("***Target missed***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                            pa1[(p1_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        System.out.println();

                                        //player 1 attack input ends
                                        //----------------------------------------------------------------------------------------------//


                                        //----------------------------------------------------------------------------------------------//
                                        //Computer's attack input starts

                                        System.out.println("Computer's turn:");
                                        int p2_atk_input = rand.nextInt(100);

                                        for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                        {
                                            p2_atk_input = rand.nextInt(100);
                                        }

                                        for(;(pa2[p2_atk_input] == "  H") || (pa2[p2_atk_input] == "  M");)
                                        {
                                            p2_atk_input = rand.nextInt(100);
                                        }

                                        if(p1[(p2_atk_input)] == "  S")
                                        {
                                            System.out.println();

                                            computer_turn++;
                                            ship_des_computer++;
                                            System.out.println("***BULL'S EYE***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                            pa2[(p2_atk_input)] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            computer_turn++;
                                            System.out.println("***Target missed***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                            pa2[(p2_atk_input)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }

                                        //Computer attack input ends
                                        //----------------------------------------------------------------------------------------------//

                                        //----------------------------------------------------------------------------------------------//
                                        //battle result logic

                                        if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                        {
                                            break;
                                        }
                                        else if(ship_des_player == total_ship)
                                        {
                                            break;
                                        }
                                        else if (ship_des_computer == total_ship)
                                        {
                                            break;
                                        }

                                        System.out.println();

                                        //battle logic ends
                                        //----------------------------------------------------------------------------------------------//
                                    }
                                    //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                                    System.out.println("\n");
                                    if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                    {
                                        if(player_turn == computer_turn)
                                        {
                                            System.out.println("Game over\nDraw\n");
                                        }
                                        else if(player_turn > computer_turn)
                                        {
                                            System.out.println("Game over\nPlayer is the winner\n");
                                        }
                                        else
                                        {
                                            System.out.println("Game over\nComputer is the winner\n");
                                        }
                                    }
                                    else if(ship_des_player == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer is the winner\n");
                                    }
                                    else if (ship_des_computer == total_ship)
                                    {
                                        System.out.println("Game over\nComputer is the winner\n");
                                    }

//---------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement history

                                    // player 1
                                    System.out.println("Player's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == p1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    //Computer
                                    System.out.println("Computer's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();



                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == p2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                            }

                            else if(user_choice3 == 2) //******************************************** custom : random ship length mode
                            {

                                if(user_choice4 == 1)                               ////////////////////////// custom: random ship length_player placement mode
                                {
                                    System.out.println();
                                    System.out.println("You have choosed to play Custom mode's Random ship length and Player ship placement mode");
                                    for(int index = 0; index < pa1.length; index++)
                                    {
                                        pa1[index] = "  _";
                                    }

                                    for(int index = 0; index < pa2.length; index++)
                                    {
                                        pa2[index] = "  _";
                                    }
                                    //--------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement starts


                                    //--------------------------------------------------------------------------------||||
                                    //player's Ship placement starts


                                    int length[] = new int[7]; // ship length
                                    for(int index = 0; index < length.length; index++)
                                    {
                                        int n = rand.nextInt(10);
                                        if(n == 0)
                                        {
                                            length[index] = n + 1;
                                        }
                                        else
                                        {
                                            length[index] = n + 1;
                                        }
                                    }

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p1[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        System.out.println("  Ship " + index + " : Length is " + length[index - 1] );
                                        System.out.println("Player please enter a tile number to place your ship");
                                        int ship_tile = x.nextInt();

                                        for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                        {
                                            System.out.println("Input invalid\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                        }
                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                            for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                            {
                                                System.out.println("Input invalid\n please enter another tile number");
                                                ship_tile = x.nextInt();
                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile - 1; i < ship_place; i++)
                                        {
                                            if(p1[i] == "  S")
                                            {
                                                System.out.println("Ship already exist from this tile.\n Kindly enter another tile number.");
                                                ship_tile = x.nextInt();

                                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                                {
                                                    System.out.println("Input invalid\n please enter another tile number");
                                                    ship_tile = x.nextInt();
                                                }
                                                ship_place = length[index - 1] + ship_tile -1;

                                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                                {
                                                    System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                                    ship_place = x.nextInt();
                                                }
                                                i = ship_tile - 2;
                                            }
                                        }
                                        for(int i = ship_tile - 1; i <= ship_place - 1; i++)
                                        {
                                            p1[(i)] = "  S";
                                        }
                                    }

                                    //Player's ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //--------------------------------------------------------------------------------||||
                                    //computer Ship placement starts

                                    for(int index = 0; index < p2.length; index++)
                                    {
                                        p2[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++)
                                    {
                                        int i = rand.nextInt(93);

                                        for(int j = i; j < i + length[index - 1]; j++)
                                        {
                                            if(p2[j] == "  S")
                                            {
                                                i = rand.nextInt(93);
                                                j = i - 1;
                                            }
                                        }
                                        for(int j = i; j < i + length[index - 1]; j++)
                                        {
                                            p2[j] = "  S";
                                        }
                                    }
                                    System.out.println("\n");

                                    //Computer ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //total ship count starts
                                    int total_ship = 0;
                                    for(int i = 0; i < length.length; i++)
                                    {
                                        total_ship += length[i];
                                    }
                                    System.out.println("Total ship =" + total_ship);//testing
                                    //total ship count ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack field setup starts

                                    //---------------------------------------------------------------------------------||||
                                    //Player's attack field start

                                    System.out.println("Player's attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    // player's attack field end
                                    //---------------------------------------------------------------------------------||||


                                    //---------------------------------------------------------------------------------||||
                                    //Computer's attack field start

                                    System.out.println("Computer's attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");
                                    // p2 attack field end
                                    //---------------------------------------------------------------------------------||||

                                    //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack starts

                                    int player_turn = 0;
                                    int computer_turn = 0;
                                    int ship_des_player = 0;
                                    int ship_des_computer = 0;


                                    for(int atk_loop = 1; ; atk_loop++)
                                    {
                                        //----------------------------------------------------------------------------------------------//
                                        //player 1 attack input starts

                                        System.out.println("Player's turn:\n Please enter a tile number to attack");
                                        int p1_atk_input = x.nextInt();
                                        for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p1_atk_input = x.nextInt();
                                        }

                                        for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                            p1_atk_input = x.nextInt();
                                        }

                                        if(p2[p1_atk_input - 1] == "  S")
                                        {
                                            System.out.println();

                                            player_turn++;
                                            ship_des_player++;
                                            System.out.println("***BULL'S EYE***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                            pa1[p1_atk_input - 1] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            player_turn++;
                                            System.out.println("***Target missed***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                            pa1[(p1_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        System.out.println();

                                        //player 1 attack input ends
                                        //----------------------------------------------------------------------------------------------//


                                        //----------------------------------------------------------------------------------------------//
                                        //Computer's attack input starts

                                        System.out.println("Computer's turn:");
                                        int p2_atk_input = rand.nextInt(100);

                                        for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                        {
                                            p2_atk_input = rand.nextInt(100);
                                        }

                                        for(;(pa2[p2_atk_input] == "  H") || (pa2[p2_atk_input] == "  M");)
                                        {
                                            p2_atk_input = rand.nextInt(100);
                                        }

                                        if(p1[(p2_atk_input)] == "  S")
                                        {
                                            System.out.println();

                                            computer_turn++;
                                            ship_des_computer++;
                                            System.out.println("***BULL'S EYE***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                            pa2[(p2_atk_input)] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            computer_turn++;
                                            System.out.println("***Target missed***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                            pa2[(p2_atk_input)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }

                                        //Computer attack input ends
                                        //----------------------------------------------------------------------------------------------//

                                        //----------------------------------------------------------------------------------------------//
                                        //battle result logic

                                        if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                        {
                                            break;
                                        }
                                        else if(ship_des_player == total_ship)
                                        {
                                            break;
                                        }
                                        else if (ship_des_computer == total_ship)
                                        {
                                            break;
                                        }

                                        System.out.println();

                                        //battle logic ends
                                        //----------------------------------------------------------------------------------------------//
                                    }
                                    //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                                    System.out.println("\n");
                                    if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                    {
                                        if(player_turn == computer_turn)
                                        {
                                            System.out.println("Game over\nDraw\n");
                                        }
                                        else if(player_turn > computer_turn)
                                        {
                                            System.out.println("Game over\nPlayer is the winner\n");
                                        }
                                        else
                                        {
                                            System.out.println("Game over\nComputer is the winner\n");
                                        }
                                    }
                                    else if(ship_des_player == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer is the winner\n");
                                    }
                                    else if (ship_des_computer == total_ship)
                                    {
                                        System.out.println("Game over\nComputer is the winner\n");
                                    }

//---------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement history

                                    // player 1
                                    System.out.println("Player's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == p1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    //Computer
                                    System.out.println("Computer's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();



                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == p2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else if(user_choice4 == 2)                               ////////////////////////// custom: random ship length_random placement mode
                                {
                                    System.out.println();
                                    System.out.println("You have choosed to play Custom mode's Random ship length and random ship placement mode");

                                    for(int index = 0; index < pa1.length; index++)
                                    {
                                        pa1[index] = "  _";
                                    }

                                    for(int index = 0; index < pa2.length; index++)
                                    {
                                        pa2[index] = "  _";
                                    }
                                    //--------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement starts


                                    //--------------------------------------------------------------------------------||||
                                    //player's Ship placement starts

                                    int length[] = new int[7]; // ship length

                                    for(int index = 0; index < length.length; index++)
                                    {
                                        int n = rand.nextInt(10);
                                        if(n == 0)
                                        {
                                            length[index] = n + 1;
                                        }
                                        else
                                        {
                                            length[index] = n + 1;
                                        }
                                    }

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p1[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        int ship_tile = rand.nextInt(100);

                                        int ship_place = length[index - 1] + ship_tile;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            ship_tile = rand.nextInt(100);

                                            for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                            {
                                                ship_tile = rand.nextInt(100);

                                            }
                                            ship_place = ship_tile + length[index - 1];
                                        }

                                        for(int i = ship_tile; i < ship_place; i++)
                                        {
                                            if(p1[i] == "  S")
                                            {
                                                ship_tile = rand.nextInt(100);

                                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);

                                                }
                                                ship_place = length[index - 1] + ship_tile;

                                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);
                                                    ship_place = length[index - 1] + ship_tile;
                                                }
                                                i = ship_tile - 1;
                                            }
                                        }
                                        for(int i = ship_tile; i < ship_place; i++)
                                        {
                                            p1[(i)] = "  S";
                                        }
                                    }

                                    //Player's ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //--------------------------------------------------------------------------------||||
                                    //computer Ship placement starts

                                    for(int index = 0; index < p2.length; index++)
                                    {
                                        p2[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        int ship_tile = rand.nextInt(100);

                                        int ship_place = length[index - 1] + ship_tile;

                                        for(;(ship_place < 1) || (ship_place > p2.length);)
                                        {
                                            ship_tile = rand.nextInt(100);

                                            for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                            {
                                                ship_tile = rand.nextInt(100);

                                            }
                                            ship_place = ship_tile + length[index - 1];
                                        }

                                        for(int i = ship_tile; i < ship_place; i++)
                                        {
                                            if(p2[i] == "  S")
                                            {
                                                ship_tile = rand.nextInt(100);

                                                for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);

                                                }
                                                ship_place = length[index - 1] + ship_tile;

                                                for(;(ship_place < 1) || (ship_place > p2.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);
                                                    ship_place = length[index - 1] + ship_tile;
                                                }
                                                i = ship_tile - 1;
                                            }
                                        }
                                        for(int i = ship_tile; i < ship_place; i++)
                                        {
                                            p2[(i)] = "  S";
                                        }
                                    }

                                    //Computer ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //total ship count starts

                                    int total_ship = 0;
                                    for(int i = 0; i < length.length; i++)
                                    {
                                        total_ship += length[i];
                                    }
                                    System.out.println();
                                    System.out.println("Total ship parts = " + total_ship + "\n");

                                    //total ship count ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack field setup starts

                                    //---------------------------------------------------------------------------------||||
                                    //Player's attack field start

                                    System.out.println("Player's attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    // player's attack field end
                                    //---------------------------------------------------------------------------------||||


                                    //---------------------------------------------------------------------------------||||
                                    //Computer's attack field start

                                    System.out.println("Computer's attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");
                                    // p2 attack field end
                                    //---------------------------------------------------------------------------------||||

                                    //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack starts

                                    int player_turn = 0;
                                    int computer_turn = 0;
                                    int ship_des_player = 0;
                                    int ship_des_computer = 0;


                                    for(int atk_loop = 1; ; atk_loop++)
                                    {
                                        //----------------------------------------------------------------------------------------------//
                                        //player 1 attack input starts

                                        System.out.println("Player's turn:\n Please enter a tile number to attack");
                                        int p1_atk_input = x.nextInt();
                                        for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p1_atk_input = x.nextInt();
                                        }

                                        for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                            p1_atk_input = x.nextInt();
                                        }

                                        if(p2[p1_atk_input - 1] == "  S")
                                        {
                                            System.out.println();

                                            player_turn++;
                                            ship_des_player++;
                                            System.out.println("***BULL'S EYE***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                            pa1[p1_atk_input - 1] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            player_turn++;
                                            System.out.println("***Target missed***\nPlayer's attack field:  Destroyed ship = " + ship_des_player + " Player's turn = " + player_turn);
                                            pa1[(p1_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        System.out.println();

                                        //player 1 attack input ends
                                        //----------------------------------------------------------------------------------------------//


                                        //----------------------------------------------------------------------------------------------//
                                        //Computer's attack input starts

                                        System.out.println("Computer's turn:");
                                        int p2_atk_input = rand.nextInt(100);

                                        for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                        {
                                            p2_atk_input = rand.nextInt(100);
                                        }

                                        for(;(pa2[p2_atk_input] == "  H") || (pa2[p2_atk_input] == "  M");)
                                        {
                                            p2_atk_input = rand.nextInt(100);
                                        }

                                        if(p1[(p2_atk_input)] == "  S")
                                        {
                                            System.out.println();

                                            computer_turn++;
                                            ship_des_computer++;
                                            System.out.println("***BULL'S EYE***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                            pa2[(p2_atk_input)] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            computer_turn++;
                                            System.out.println("***Target missed***\nComputer's attack field:  Destroyed ship = " + ship_des_computer + " Computer's turn = " + computer_turn);
                                            pa2[(p2_atk_input)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }

                                        //Computer attack input ends
                                        //----------------------------------------------------------------------------------------------//

                                        //----------------------------------------------------------------------------------------------//
                                        //battle result logic

                                        if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                        {
                                            break;
                                        }
                                        else if(ship_des_player == total_ship)
                                        {
                                            break;
                                        }
                                        else if (ship_des_computer == total_ship)
                                        {
                                            break;
                                        }

                                        System.out.println();

                                        //battle logic ends
                                        //----------------------------------------------------------------------------------------------//
                                    }
                                    //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                                    System.out.println("\n");
                                    if((ship_des_player == total_ship) && (ship_des_computer == total_ship))
                                    {
                                        if(player_turn == computer_turn)
                                        {
                                            System.out.println("Game over\nDraw\n");
                                        }
                                        else if(player_turn > computer_turn)
                                        {
                                            System.out.println("Game over\nPlayer is the winner\n");
                                        }
                                        else
                                        {
                                            System.out.println("Game over\nComputer is the winner\n");
                                        }
                                    }
                                    else if(ship_des_player == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer is the winner\n");
                                    }
                                    else if (ship_des_computer == total_ship)
                                    {
                                        System.out.println("Game over\nComputer is the winner\n");
                                    }

//---------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement history

                                    // player 1
                                    System.out.println("Player's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == p1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    //Computer
                                    System.out.println("Computer's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == p2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                    //Player VS Computer Ends
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//########################################################################################################################################################

//########################################################################################################################################################
//--------------------------------------------------------------------------------------------------------------------------------------------------------
                    //Player VS Player Starts

                    else if(user_choice == 2)
                    {

                        if(user_choice2 == 1)  //***********************************************************************************Default
                        {
                            int total_ship = 28;
                            System.out.println("You have choosed to play in default mode");
                            for(int index = 0; index < pa1.length; index++)
                            {
                                pa1[index] = "  _";
                            }

                            for(int index = 0; index < pa2.length; index++)
                            {
                                pa2[index] = "  _";
                            }
                            //--------------------------------------------------------------------------------------------------------------------------------
                            //ship placement starts

                            //--------------------------------------------------------------------------------||||
                            // Ship placement starts p1

                            int length = 1;

                            for(int index = 0; index < p1.length; index++)
                            {
                                p1[index] = "  _";
                            }

                            for(int index = 1; index <= 7; index++)
                            {
                                int i = rand.nextInt(93);

                                for(int j = i; j < i + length; j++)
                                {
                                    if(p1[j] == "  S")
                                    {
                                        i = rand.nextInt(93);
                                        j = i - 1;
                                    }
                                }
                                for(int j = i; j < i + length; j++)
                                {
                                    p1[j] = "  S";
                                }
                                length++;
                            }
                            System.out.println("\n");


                            //ship placement ends p1
                            //--------------------------------------------------------------------------------||||

                            //--------------------------------------------------------------------------------||||
                            // Ship placement starts p2


                            length = 1;
                            for(int index = 0; index < p2.length; index++)
                            {
                                p2[index] = "  _";
                            }

                            for(int index = 1; index <= 7; index++)
                            {
                                int i = rand.nextInt(93);

                                for(int j = i; j < i + length; j++)
                                {
                                    if(p2[j] == "  S")
                                    {
                                        i = rand.nextInt(93);
                                        j = i - 1;
                                    }
                                }
                                for(int j = i; j < i + length; j++)
                                {
                                    p2[j] = "  S";
                                }
                                length++;
                            }
                            System.out.println("\n");

                            //player 2 ship placement ends
                            //--------------------------------------------------------------------------------||||

                            //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                            //attack field setup starts

                            //---------------------------------------------------------------------------------||||
                            //p1 attack field start

                            System.out.println("P1 attack field:");

                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(pa1[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa1.length; index++)
                            {
                                System.out.print(pa1[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa1.length; index++)
                            {
                                if(index == pa1.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");

                            // p1 attack field end
                            //---------------------------------------------------------------------------------||||


                            //---------------------------------------------------------------------------------||||
                            //p2 attack field start

                            System.out.println("P2 attack field:");

                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(pa2[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa2.length; index++)
                            {
                                System.out.print(pa2[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa2.length; index++)
                            {
                                if(index == pa2.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");
                            // p2 attack field end
                            //---------------------------------------------------------------------------------||||

                            //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                            //attack starts

                            int p1_turn = 0;
                            int p2_turn = 0;
                            int ship_des_p1 = 0;
                            int ship_des_p2 = 0;


                            for(int atk_loop = 1; ; atk_loop++)
                            {
                                //----------------------------------------------------------------------------------------------//
                                //player 1 attack input starts

                                System.out.println("Player 1's turn:\n Please enter a tile number to attack");
                                int p1_atk_input = x.nextInt();
                                for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                {
                                    System.out.println("Input invalid\n Please enter another tile number");
                                    p1_atk_input = x.nextInt();
                                }

                                for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                {
                                    System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                    p1_atk_input = x.nextInt();
                                }

                                if(p2[p1_atk_input - 1] == "  S")
                                {
                                    ship_des_p1++;
                                    p1_turn++;

                                    System.out.println("***BULL'S EYE***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                    pa1[p1_atk_input - 1] = "  H";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else
                                {
                                    p1_turn++;

                                    System.out.println("***Target missed***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                    pa1[(p1_atk_input - 1)] = "  M";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                System.out.println();

                                //player 1 attack input ends
                                //----------------------------------------------------------------------------------------------//


                                //----------------------------------------------------------------------------------------------//
                                //player 2 attack input starts

                                System.out.println("Player 2's turn:\n Please enter a tile number to attack");
                                int p2_atk_input = x.nextInt();

                                for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                {
                                    System.out.println("Input invalid\n Please enter another tile number");
                                    p2_atk_input = x.nextInt();
                                }

                                for(;(pa2[p2_atk_input - 1] == "  H") || (pa2[p2_atk_input - 1] == "  M");)
                                {
                                    System.out.println("Youhave already attacked this tile\n Please enter another tile number to attack");
                                    p2_atk_input = x.nextInt();
                                }

                                if(p1[(p2_atk_input - 1)] == "  S")
                                {
                                    ship_des_p2++;
                                    p2_turn++;

                                    System.out.println("***BULL'S EYE***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                    pa2[(p2_atk_input - 1)] = "  H";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();


                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else
                                {
                                    p2_turn++;

                                    System.out.println("***Target missed***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                    pa2[(p2_atk_input - 1)] = "  M";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }

                                //player 2 attack input ends
                                //----------------------------------------------------------------------------------------------//

                                //----------------------------------------------------------------------------------------------//
                                //battle result logic

                                if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                {
                                    break;
                                }
                                else if(ship_des_p1 == total_ship)
                                {
                                    break;
                                }
                                else if (ship_des_p2 == total_ship)
                                {
                                    break;
                                }

                                System.out.println();

                                //battle logic ends
                                //----------------------------------------------------------------------------------------------//
                            }
                            //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                            System.out.println("\n");
                            if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                            {
                                if(p1_turn == p2_turn)
                                {
                                    System.out.println("Game over\nDraw\n");
                                }
                                else if(p1_turn > p2_turn)
                                {
                                    System.out.println("Game over\nPlayer 1 is the winner\n");
                                }
                                else
                                {
                                    System.out.println("Game over\nPlayer 2 is the winner\n");
                                }
                            }
                            else if(ship_des_p1 == total_ship)
                            {
                                System.out.println("Game over\nPlayer 1 is the winner\n");
                            }
                            else if (ship_des_p2 == total_ship)
                            {
                                System.out.println("Game over\nPlayer 2 is the winner\n");
                            }

//---------------------------------------------------------------------------------------------------------------------------------
                            //ship placement history

                            // player 1
                            System.out.println("Player 1's ship placement:");
                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(p1[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa1.length; index++)
                            {
                                System.out.print(p1[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa1.length; index++)
                            {
                                if(index == p1.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");

                            //player 2
                            System.out.println("Player 2's ship placement:");
                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(p2[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa2.length; index++)
                            {
                                System.out.print(p2[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa2.length; index++)
                            {
                                if(index == p2.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println();
                        }
                        else if(user_choice2 == 2)       //********************************************************************** typical mode
                        {
                            int total_ship = 28;
                            System.out.println("You have choosed to play in typical mode");

                            for(int index = 0; index < pa1.length; index++)
                            {
                                pa1[index] = "  _";
                            }

                            for(int index = 0; index < pa2.length; index++)
                            {
                                pa2[index] = "  _";
                            }
                            //--------------------------------------------------------------------------------------------------------------------------------
                            //ship placement starts

                            //--------------------------------------------------------------------------------||||
                            // Ship placement starts p1

                            int length = 1;

                            System.out.println("Player 1 please place your ships:\n Please enter your tile number to place the ships:");

                            for(int index = 0; index < p1.length; index++)
                            {
                                p1[index] = "  _";
                            }

                            for(int index = 1; index <= 7; index++) //index = ship count
                            {
                                System.out.println("  Ship " + index + " : Length is " + length );
                                int ship_tile = x.nextInt();

                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                {
                                    System.out.println("Input invalid\n please enter another tile number");
                                    ship_tile = x.nextInt();
                                }
                                int ship_place = length + ship_tile - 1;

                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                {
                                    System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                    ship_tile = x.nextInt();
                                    for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                    {
                                        System.out.println("Input invalid\n please enter another tile number");
                                        ship_tile = x.nextInt();
                                    }
                                    ship_place = ship_tile + length - 1;
                                }

                                for(int i = ship_tile - 1; i < ship_place; i++)
                                {
                                    if(p1[i] == "  S")
                                    {
                                        System.out.println("Ship already exist from this tile.\n Kindly enter another tile number.");
                                        ship_tile = x.nextInt();

                                        for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                        {
                                            System.out.println("Input invalid\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                        }
                                        ship_place = length + ship_tile -1;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                            ship_place = x.nextInt();
                                        }
                                        i = ship_tile - 2;
                                    }
                                }
                                for(int i = ship_tile - 1; i <= ship_place - 1; i++)
                                {
                                    p1[(i)] = "  S";
                                }
                                length++;
                            }


                            //ship placement ends p1
                            //--------------------------------------------------------------------------------||||

                            //--------------------------------------------------------------------------------||||
                            // Ship placement starts p2

                            length = 1;

                            System.out.println("Player 2 please place your ships:\n Please enter your tile number to place the ships:");

                            for(int index = 0; index < p1.length; index++)
                            {
                                p2[index] = "  _";
                            }

                            for(int index = 1; index <= 7; index++) //index = ship count
                            {
                                System.out.println("  Ship " + index + " : Length is " + length );
                                int ship_tile = x.nextInt();

                                for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                {
                                    System.out.println("Input invalid\n please enter another tile number");
                                    ship_tile = x.nextInt();
                                }
                                int ship_place = length + ship_tile - 1;

                                for(;(ship_place < 1) || (ship_place > p2.length);)
                                {
                                    System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                    ship_tile = x.nextInt();
                                    for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                    {
                                        System.out.println("Input invalid\n please enter another tile number");
                                        ship_tile = x.nextInt();
                                    }
                                    ship_place = ship_tile + length - 1;
                                }

                                for(int i = ship_tile - 1; i <= ship_place; i++)
                                {
                                    if(p2[i] == "  S")
                                    {
                                        System.out.println("Ship already exist from this tile.\n Kindly enter another tile number.");
                                        ship_tile = x.nextInt();

                                        for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                        {
                                            System.out.println("Input invalid\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                        }
                                        ship_place = length + ship_tile -1;

                                        for(;(ship_place < 1) || (ship_place > p2.length);)
                                        {
                                            System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                            ship_place = x.nextInt();
                                        }
                                        i = ship_tile - 2;
                                    }
                                }
                                for(int i = ship_tile - 1; i <= ship_place - 1; i++)
                                {
                                    p2[(i)] = "  S";
                                }
                                length++;
                            }
                            //player 2 ship placement ends
                            //--------------------------------------------------------------------------------||||

                            //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                            //attack field setup starts

                            //---------------------------------------------------------------------------------||||
                            //p1 attack field start

                            System.out.println("P1 attack field:");

                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(pa1[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa1.length; index++)
                            {
                                System.out.print(pa1[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa1.length; index++)
                            {
                                if(index == pa1.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");

                            // p1 attack field end
                            //---------------------------------------------------------------------------------||||


                            //---------------------------------------------------------------------------------||||
                            //p2 attack field start

                            System.out.println("P2 attack field:");

                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(pa2[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa2.length; index++)
                            {
                                System.out.print(pa2[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa2.length; index++)
                            {
                                if(index == pa2.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");
                            // p2 attack field end
                            //---------------------------------------------------------------------------------||||

                            //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                            //attack starts

                            int p1_turn = 0;
                            int p2_turn = 0;
                            int ship_des_p1 = 0;
                            int ship_des_p2 = 0;


                            for(int atk_loop = 1; ; atk_loop++)
                            {
                                //----------------------------------------------------------------------------------------------//
                                //player 1 attack input starts

                                System.out.println("Player 1's turn:\n Please enter a tile number to attack");
                                int p1_atk_input = x.nextInt();
                                for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                {
                                    System.out.println("Input invalid\n Please enter another tile number");
                                    p1_atk_input = x.nextInt();
                                }

                                for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                {
                                    System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                    p1_atk_input = x.nextInt();
                                }

                                if(p2[p1_atk_input - 1] == "  S")
                                {
                                    ship_des_p1++;
                                    p1_turn++;

                                    System.out.println("***BULL'S EYE***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                    pa1[p1_atk_input - 1] = "  H";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else
                                {
                                    p1_turn++;

                                    System.out.println("***Target missed***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                    pa1[(p1_atk_input - 1)] = "  M";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                System.out.println();

                                //player 1 attack input ends
                                //----------------------------------------------------------------------------------------------//


                                //----------------------------------------------------------------------------------------------//
                                //player 2 attack input starts

                                System.out.println("Player 2's turn:\n Please enter a tile number to attack");
                                int p2_atk_input = x.nextInt();

                                for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                {
                                    System.out.println("Input invalid\n Please enter another tile number");
                                    p2_atk_input = x.nextInt();
                                }

                                for(;(pa2[p2_atk_input - 1] == "  H") || (pa2[p2_atk_input - 1] == "  M");)
                                {
                                    System.out.println("Youhave already attacked this tile\n Please enter another tile number to attack");
                                    p2_atk_input = x.nextInt();
                                }

                                if(p1[(p2_atk_input - 1)] == "  S")
                                {
                                    ship_des_p2++;
                                    p2_turn++;

                                    System.out.println("***BULL'S EYE***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                    pa2[(p2_atk_input - 1)] = "  H";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();


                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else
                                {
                                    p2_turn++;

                                    System.out.println("***Target missed***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                    pa2[(p2_atk_input - 1)] = "  M";

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }

                                //player 2 attack input ends
                                //----------------------------------------------------------------------------------------------//

                                //----------------------------------------------------------------------------------------------//
                                //battle result logic

                                if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                {
                                    break;
                                }
                                else if(ship_des_p1 == total_ship)
                                {
                                    break;
                                }
                                else if (ship_des_p2 == total_ship)
                                {
                                    break;
                                }

                                System.out.println();

                                //battle logic ends
                                //----------------------------------------------------------------------------------------------//
                            }
                            //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                            System.out.println("\n");
                            if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                            {
                                if(p1_turn == p2_turn)
                                {
                                    System.out.println("Game over\nDraw\n");
                                }
                                else if(p1_turn > p2_turn)
                                {
                                    System.out.println("Game over\nPlayer 1 is the winner\n");
                                }
                                else
                                {
                                    System.out.println("Game over\nPlayer 2 is the winner\n");
                                }
                            }
                            else if(ship_des_p1 == total_ship)
                            {
                                System.out.println("Game over\nPlayer 1 is the winner\n");
                            }
                            else if (ship_des_p2 == total_ship)
                            {
                                System.out.println("Game over\nPlayer 2 is the winner\n");
                            }

//---------------------------------------------------------------------------------------------------------------------------------
                            //ship placement history

                            // player 1
                            System.out.println("Player 1's ship placement:");
                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(p1[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa1.length; index++)
                            {
                                System.out.print(p1[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa1.length; index++)
                            {
                                if(index == p1.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println("\n");

                            //player 2
                            System.out.println("Player 2's ship placement:");
                            for(int index = 0; index < 50; index++)
                            {
                                System.out.print(p2[index]);
                            }
                            System.out.println();

                            for(int index = 1; index <= 50; index++)
                            {
                                System.out.printf("%3d" , index);
                            }
                            System.out.println();

                            for(int index = 50; index < pa2.length; index++)
                            {
                                System.out.print(p2[index]);
                            }
                            System.out.println();

                            for(int index = 51; index <= pa2.length; index++)
                            {
                                if(index == p2.length)
                                {
                                    System.out.printf("%4d" , index);
                                }
                                else
                                {
                                    System.out.printf("%3d" , index);
                                }
                            }
                            System.out.println();
                        }
                        else if(user_choice2 == 3)  //************************************** custom mode
                        {
                            if(user_choice3 == 1)   //******************************************* custom ship length
                            {

                                if(user_choice4 == 1) //******************************* custom mode: player ship length and player ship placement mode
                                {
                                    System.out.println();
                                    System.out.println("You have choosed to play Custom mode's Player ship length and Player ship placement mode");
                                    for(int index = 0; index < pa1.length; index++)
                                    {
                                        pa1[index] = "  _";
                                    }

                                    for(int index = 0; index < pa2.length; index++)
                                    {
                                        pa2[index] = "  _";
                                    }
                                    //--------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement starts

                                    //--------------------------------------------------------------------------------||||
                                    // Ship placement starts p1

                                    int length[] = new int[7];

                                    System.out.println("Player 1 please place your ships:\n Please enter your tile number to place the ships:");

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p1[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        System.out.println("Player 1 please enter your ship " + index + " length (From 1 to 7)");   //ship length input starts
                                        int n = x.nextInt();
                                        for(; (n < 1) || (n > 7);)
                                        {
                                            System.out.println("For better gaming experience please try to follow the instructions");
                                            System.out.println("Player 1 please enter your ship " + index + " length (From 1 to 7)");
                                            n = x.nextInt();
                                        }

                                        length[index - 1] = n; // ship length input ends

                                        System.out.println("  Ship " + index + " : Length is " + length[index - 1] );
                                        System.out.println("Please enter a tile number to place your ship");
                                        int ship_tile = x.nextInt();

                                        for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                        {
                                            System.out.println("Input invalid\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                        }
                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                            for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                            {
                                                System.out.println("Input invalid\n please enter another tile number");
                                                ship_tile = x.nextInt();
                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile - 1; i < ship_place; i++)
                                        {
                                            if(p1[i] == "  S")
                                            {
                                                System.out.println("Ship already exist from this tile.\n Kindly enter another tile number.");
                                                ship_tile = x.nextInt();

                                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                                {
                                                    System.out.println("Input invalid\n please enter another tile number");
                                                    ship_tile = x.nextInt();
                                                }
                                                ship_place = length[index - 1] + ship_tile - 1;

                                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                                {
                                                    System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                                    ship_place = x.nextInt();
                                                }
                                                i = ship_tile - 2;
                                            }
                                        }
                                        for(int i = ship_tile - 1; i <= ship_place - 1; i++)
                                        {
                                            p1[(i)] = "  S";
                                        }
                                    }


                                    //ship placement ends p1
                                    //--------------------------------------------------------------------------------||||

                                    //--------------------------------------------------------------------------------||||
                                    // Ship placement starts p2

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p2[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        System.out.println("  Ship " + index + " : Length is " + length[index - 1] );
                                        System.out.println("Please enter a tile number to place your ship");
                                        int ship_tile = x.nextInt();

                                        for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                        {
                                            System.out.println("Input invalid\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                        }
                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p2.length);)
                                        {
                                            System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                            for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                            {
                                                System.out.println("Input invalid\n please enter another tile number");
                                                ship_tile = x.nextInt();
                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile - 1; i <= ship_place; i++)
                                        {
                                            if(p2[i] == "  S")
                                            {
                                                System.out.println("Ship already exist from this tile.\n Kindly enter another tile number.");
                                                ship_tile = x.nextInt();

                                                for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                                {
                                                    System.out.println("Input invalid\n please enter another tile number");
                                                    ship_tile = x.nextInt();
                                                }
                                                ship_place = length[index - 1] + ship_tile -1;

                                                for(;(ship_place < 1) || (ship_place > p2.length);)
                                                {
                                                    System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                                    ship_place = x.nextInt();
                                                }
                                                i = ship_tile - 2;
                                            }
                                        }
                                        for(int i = ship_tile - 1; i <= ship_place - 1; i++)
                                        {
                                            p2[(i)] = "  S";
                                        }
                                    }
                                    //player 2 ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
                                    //total ship count starts

                                    int total_ship = 0;
                                    for(int i = 0; i < length.length; i++)
                                    {
                                        total_ship += length[i];
                                    }
                                    System.out.println();
                                    System.out.println("Total ship parts = " + total_ship + "\n");

                                    //total ship count ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack field setup starts

                                    //---------------------------------------------------------------------------------||||
                                    //p1 attack field start

                                    System.out.println("P1 attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    // p1 attack field end
                                    //---------------------------------------------------------------------------------||||


                                    //---------------------------------------------------------------------------------||||
                                    //p2 attack field start

                                    System.out.println("P2 attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");
                                    // p2 attack field end
                                    //---------------------------------------------------------------------------------||||

                                    //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack starts

                                    int p1_turn = 0;
                                    int p2_turn = 0;
                                    int ship_des_p1 = 0;
                                    int ship_des_p2 = 0;


                                    for(int atk_loop = 1; ; atk_loop++)
                                    {
                                        //----------------------------------------------------------------------------------------------//
                                        //player 1 attack input starts

                                        System.out.println("Player 1's turn:\n Please enter a tile number to attack");
                                        int p1_atk_input = x.nextInt();
                                        for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p1_atk_input = x.nextInt();
                                        }

                                        for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                            p1_atk_input = x.nextInt();
                                        }

                                        if(p2[p1_atk_input - 1] == "  S")
                                        {
                                            ship_des_p1++;
                                            p1_turn++;

                                            System.out.println("***BULL'S EYE***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                            pa1[p1_atk_input - 1] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            p1_turn++;

                                            System.out.println("***Target missed***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                            pa1[(p1_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        System.out.println();

                                        //player 1 attack input ends
                                        //----------------------------------------------------------------------------------------------//


                                        //----------------------------------------------------------------------------------------------//
                                        //player 2 attack input starts

                                        System.out.println("Player 2's turn:\n Please enter a tile number to attack");
                                        int p2_atk_input = x.nextInt();

                                        for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p2_atk_input = x.nextInt();
                                        }

                                        for(;(pa2[p2_atk_input - 1] == "  H") || (pa2[p2_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("Youhave already attacked this tile\n Please enter another tile number to attack");
                                            p2_atk_input = x.nextInt();
                                        }

                                        if(p1[(p2_atk_input - 1)] == "  S")
                                        {
                                            ship_des_p2++;
                                            p2_turn++;

                                            System.out.println("***BULL'S EYE***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                            pa2[(p2_atk_input - 1)] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();


                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            p2_turn++;

                                            System.out.println("***Target missed***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                            pa2[(p2_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }

                                        //player 2 attack input ends
                                        //----------------------------------------------------------------------------------------------//

                                        //----------------------------------------------------------------------------------------------//
                                        //battle result logic

                                        if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                        {
                                            break;
                                        }
                                        else if(ship_des_p1 == total_ship)
                                        {
                                            break;
                                        }
                                        else if (ship_des_p2 == total_ship)
                                        {
                                            break;
                                        }

                                        System.out.println();

                                        //battle logic ends
                                        //----------------------------------------------------------------------------------------------//
                                    }
                                    //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                                    System.out.println("\n");
                                    if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                    {
                                        if(p1_turn == p2_turn)
                                        {
                                            System.out.println("Game over\nDraw\n");
                                        }
                                        else if(p1_turn > p2_turn)
                                        {
                                            System.out.println("Game over\nPlayer 1 is the winner\n");
                                        }
                                        else
                                        {
                                            System.out.println("Game over\nPlayer 2 is the winner\n");
                                        }
                                    }
                                    else if(ship_des_p1 == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer 1 is the winner\n");
                                    }
                                    else if (ship_des_p2 == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer 2 is the winner\n");
                                    }

//---------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement history

                                    // player 1
                                    System.out.println("Player 1's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == p1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    //player 2
                                    System.out.println("Player 2's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == p2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else if(user_choice4 == 2)            // ************************************** Custom: player ship length and random placement mode
                                {
                                    System.out.println();
                                    System.out.println("You have choosed to play Custom mode's Player ship length and Random ship placement mode");
                                    for(int index = 0; index < pa1.length; index++)
                                    {
                                        pa1[index] = "  _";
                                    }

                                    for(int index = 0; index < pa2.length; index++)
                                    {
                                        pa2[index] = "  _";
                                    }
                                    //--------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement starts

                                    //--------------------------------------------------------------------------------||||
                                    // Ship placement starts p1

                                    int length[] = new int[7];

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p1[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        System.out.println("Player 1 please enter your ship " + index + " length (From 1 to 7)");   //ship length input starts
                                        int n = x.nextInt();
                                        for(; (n < 1) || (n > 7);)
                                        {
                                            System.out.println("For better gaming experience please try to follow the instructions");
                                            System.out.println("Player 1 please enter your ship " + index + " length (From 1 to 7)");
                                            n = x.nextInt();
                                        }
                                        length[index - 1] = n; // ship length input ends

                                        int ship_tile = rand.nextInt(100);

                                        int ship_place = length[index - 1] + ship_tile;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            ship_tile = rand.nextInt(100);

                                            for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                            {
                                                ship_tile = rand.nextInt(100);

                                            }
                                            ship_place = ship_tile + length[index - 1];
                                        }

                                        for(int i = ship_tile; i < ship_place; i++)
                                        {
                                            if(p1[i] == "  S")
                                            {
                                                ship_tile = rand.nextInt(100);

                                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);

                                                }
                                                ship_place = length[index - 1] + ship_tile;

                                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);
                                                    ship_place = length[index - 1] + ship_tile;
                                                }
                                                i = ship_tile - 1;
                                            }
                                        }
                                        for(int i = ship_tile; i <= ship_place; i++)
                                        {
                                            p1[(i)] = "  S";
                                        }
                                    }


                                    //ship placement ends p1
                                    //--------------------------------------------------------------------------------||||

                                    //--------------------------------------------------------------------------------||||
                                    // Ship placement starts p2

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p2[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        System.out.println("Player 2 please enter a tile number to place your ship " + index);

                                        int ship_tile = rand.nextInt(100);

                                        int ship_place = length[index - 1] + ship_tile;

                                        for(;(ship_place < 1) || (ship_place > p2.length);)
                                        {
                                            ship_tile = rand.nextInt(100);

                                            for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                            {
                                                ship_tile = rand.nextInt(100);

                                            }
                                            ship_place = ship_tile + length[index - 1];
                                        }

                                        for(int i = ship_tile; i < ship_place; i++)
                                        {
                                            if(p2[i] == "  S")
                                            {
                                                ship_tile = rand.nextInt(100);

                                                for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);

                                                }
                                                ship_place = length[index - 1] + ship_tile;

                                                for(;(ship_place < 1) || (ship_place > p2.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);
                                                    ship_place = length[index - 1] + ship_tile;
                                                }
                                                i = ship_tile - 1;
                                            }
                                        }
                                        for(int i = ship_tile; i <= ship_place; i++)
                                        {
                                            p2[(i)] = "  S";
                                        }
                                    }
                                    //player 2 ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
                                    //total ship count starts

                                    int total_ship = 0;
                                    for(int i = 0; i < length.length; i++)
                                    {
                                        total_ship += length[i];
                                    }
                                    System.out.println();
                                    System.out.println("Total ship parts = " + total_ship + "\n");

                                    //total ship count ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack field setup starts

                                    //---------------------------------------------------------------------------------||||
                                    //p1 attack field start

                                    System.out.println("P1 attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    // p1 attack field end
                                    //---------------------------------------------------------------------------------||||


                                    //---------------------------------------------------------------------------------||||
                                    //p2 attack field start

                                    System.out.println("P2 attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");
                                    // p2 attack field end
                                    //---------------------------------------------------------------------------------||||

                                    //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack starts

                                    int p1_turn = 0;
                                    int p2_turn = 0;
                                    int ship_des_p1 = 0;
                                    int ship_des_p2 = 0;


                                    for(int atk_loop = 1; ; atk_loop++)
                                    {
                                        //----------------------------------------------------------------------------------------------//
                                        //player 1 attack input starts

                                        System.out.println("Player 1's turn:\n Please enter a tile number to attack");
                                        int p1_atk_input = x.nextInt();
                                        for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p1_atk_input = x.nextInt();
                                        }

                                        for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                            p1_atk_input = x.nextInt();
                                        }

                                        if(p2[p1_atk_input - 1] == "  S")
                                        {
                                            ship_des_p1++;
                                            p1_turn++;

                                            System.out.println("***BULL'S EYE***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                            pa1[p1_atk_input - 1] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            p1_turn++;

                                            System.out.println("***Target missed***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                            pa1[(p1_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        System.out.println();

                                        //player 1 attack input ends
                                        //----------------------------------------------------------------------------------------------//


                                        //----------------------------------------------------------------------------------------------//
                                        //player 2 attack input starts

                                        System.out.println("Player 2's turn:\n Please enter a tile number to attack");
                                        int p2_atk_input = x.nextInt();

                                        for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p2_atk_input = x.nextInt();
                                        }

                                        for(;(pa2[p2_atk_input - 1] == "  H") || (pa2[p2_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("Youhave already attacked this tile\n Please enter another tile number to attack");
                                            p2_atk_input = x.nextInt();
                                        }

                                        if(p1[(p2_atk_input - 1)] == "  S")
                                        {
                                            ship_des_p2++;
                                            p2_turn++;

                                            System.out.println("***BULL'S EYE***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                            pa2[(p2_atk_input - 1)] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();


                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            p2_turn++;

                                            System.out.println("***Target missed***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                            pa2[(p2_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }

                                        //player 2 attack input ends
                                        //----------------------------------------------------------------------------------------------//

                                        //----------------------------------------------------------------------------------------------//
                                        //battle result logic

                                        if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                        {
                                            break;
                                        }
                                        else if(ship_des_p1 == total_ship)
                                        {
                                            break;
                                        }
                                        else if (ship_des_p2 == total_ship)
                                        {
                                            break;
                                        }

                                        System.out.println();

                                        //battle logic ends
                                        //----------------------------------------------------------------------------------------------//
                                    }
                                    //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                                    System.out.println("\n");
                                    if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                    {
                                        if(p1_turn == p2_turn)
                                        {
                                            System.out.println("Game over\nDraw\n");
                                        }
                                        else if(p1_turn > p2_turn)
                                        {
                                            System.out.println("Game over\nPlayer 1 is the winner\n");
                                        }
                                        else
                                        {
                                            System.out.println("Game over\nPlayer 2 is the winner\n");
                                        }
                                    }
                                    else if(ship_des_p1 == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer 1 is the winner\n");
                                    }
                                    else if (ship_des_p2 == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer 2 is the winner\n");
                                    }

//---------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement history

                                    // player 1
                                    System.out.println("Player 1's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == p1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    //player 2
                                    System.out.println("Player 2's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == p2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                            }
                            else if(user_choice3 == 2) //******************************************** custom : random ship length mode
                            {

                                if(user_choice4 == 1)                               ////////////////////////// custom: random ship length_player placement mode
                                {
                                    System.out.println();
                                    System.out.println("You have choosed to play Custom mode's Random ship length and Player ship placement mode");

                                    for(int index = 0; index < pa1.length; index++)
                                    {
                                        pa1[index] = "  _";
                                    }

                                    for(int index = 0; index < pa2.length; index++)
                                    {
                                        pa2[index] = "  _";
                                    }
                                    //--------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement starts

                                    //--------------------------------------------------------------------------------||||
                                    // Ship placement starts p1


                                    int length[] = new int[7]; // ship length
                                    for(int index = 0; index < length.length; index++)
                                    {
                                        int n = rand.nextInt(10);
                                        if(n == 0)
                                        {
                                            length[index] = n + 1;
                                        }
                                        else
                                        {
                                            length[index] = n + 1;
                                        }
                                    }

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p1[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        System.out.println("  Ship " + index + " : Length is " + length[index - 1] );
                                        System.out.println("Player 1 please enter a tile number to place your ship");
                                        int ship_tile = x.nextInt();

                                        for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                        {
                                            System.out.println("Input invalid\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                        }
                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                            for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                            {
                                                System.out.println("Input invalid\n please enter another tile number");
                                                ship_tile = x.nextInt();
                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile - 1; i < ship_place; i++)
                                        {
                                            if(p1[i] == "  S")
                                            {
                                                System.out.println("Ship already exist from this tile.\n Kindly enter another tile number.");
                                                ship_tile = x.nextInt();

                                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                                {
                                                    System.out.println("Input invalid\n please enter another tile number");
                                                    ship_tile = x.nextInt();
                                                }
                                                ship_place = length[index - 1] + ship_tile -1;

                                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                                {
                                                    System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                                    ship_place = x.nextInt();
                                                }
                                                i = ship_tile - 2;
                                            }
                                        }
                                        for(int i = ship_tile - 1; i <= ship_place - 1; i++)
                                        {
                                            p1[(i)] = "  S";
                                        }
                                    }


                                    //ship placement ends p1
                                    //--------------------------------------------------------------------------------||||

                                    //--------------------------------------------------------------------------------||||
                                    // Ship placement starts p2
                                    System.out.println("\n");
                                    for(int index = 0; index < p2.length; index++)
                                    {
                                        p2[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        System.out.println("  Ship " + index + " : Length is " + length[index - 1] );
                                        System.out.println("Player 2 please enter a tile number to place your ship");
                                        int ship_tile = x.nextInt();

                                        for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                        {
                                            System.out.println("Input invalid\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                        }
                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p2.length);)
                                        {
                                            System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                            ship_tile = x.nextInt();
                                            for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                            {
                                                System.out.println("Input invalid\n please enter another tile number");
                                                ship_tile = x.nextInt();
                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile - 1; i < ship_place; i++)
                                        {
                                            if(p2[i] == "  S")
                                            {
                                                System.out.println("Ship already exist from this tile.\n Kindly enter another tile number.");
                                                ship_tile = x.nextInt();

                                                for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                                {
                                                    System.out.println("Input invalid\n please enter another tile number");
                                                    ship_tile = x.nextInt();
                                                }
                                                ship_place = length[index - 1] + ship_tile -1;

                                                for(;(ship_place < 1) || (ship_place > p2.length);)
                                                {
                                                    System.out.println("Ship is out of the battelfied. So can not place ship here.\n please enter another tile number");
                                                    ship_place = x.nextInt();
                                                }
                                                i = ship_tile - 2;
                                            }
                                        }
                                        for(int i = ship_tile - 1; i <= ship_place - 1; i++)
                                        {
                                            p2[(i)] = "  S";
                                        }
                                    }
                                    //player 2 ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
                                    //total ship count starts

                                    int total_ship = 0;
                                    for(int i = 0; i < length.length; i++)
                                    {
                                        total_ship += length[i];
                                    }
                                    System.out.println();
                                    System.out.println("Total ship parts = " + total_ship + "\n");

                                    //total ship count ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack field setup starts

                                    //---------------------------------------------------------------------------------||||
                                    //p1 attack field start

                                    System.out.println("P1 attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    // p1 attack field end
                                    //---------------------------------------------------------------------------------||||


                                    //---------------------------------------------------------------------------------||||
                                    //p2 attack field start

                                    System.out.println("P2 attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");
                                    // p2 attack field end
                                    //---------------------------------------------------------------------------------||||

                                    //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack starts

                                    int p1_turn = 0;
                                    int p2_turn = 0;
                                    int ship_des_p1 = 0;
                                    int ship_des_p2 = 0;


                                    for(int atk_loop = 1; ; atk_loop++)
                                    {
                                        //----------------------------------------------------------------------------------------------//
                                        //player 1 attack input starts

                                        System.out.println("Player 1's turn:\n Please enter a tile number to attack");
                                        int p1_atk_input = x.nextInt();
                                        for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p1_atk_input = x.nextInt();
                                        }

                                        for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                            p1_atk_input = x.nextInt();
                                        }

                                        if(p2[p1_atk_input - 1] == "  S")
                                        {
                                            ship_des_p1++;
                                            p1_turn++;

                                            System.out.println("***BULL'S EYE***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                            pa1[p1_atk_input - 1] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            p1_turn++;

                                            System.out.println("***Target missed***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                            pa1[(p1_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        System.out.println();

                                        //player 1 attack input ends
                                        //----------------------------------------------------------------------------------------------//


                                        //----------------------------------------------------------------------------------------------//
                                        //player 2 attack input starts

                                        System.out.println("Player 2's turn:\n Please enter a tile number to attack");
                                        int p2_atk_input = x.nextInt();

                                        for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p2_atk_input = x.nextInt();
                                        }

                                        for(;(pa2[p2_atk_input - 1] == "  H") || (pa2[p2_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("Youhave already attacked this tile\n Please enter another tile number to attack");
                                            p2_atk_input = x.nextInt();
                                        }

                                        if(p1[(p2_atk_input - 1)] == "  S")
                                        {
                                            ship_des_p2++;
                                            p2_turn++;

                                            System.out.println("***BULL'S EYE***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                            pa2[(p2_atk_input - 1)] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();


                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            p2_turn++;

                                            System.out.println("***Target missed***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                            pa2[(p2_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }

                                        //player 2 attack input ends
                                        //----------------------------------------------------------------------------------------------//

                                        //----------------------------------------------------------------------------------------------//
                                        //battle result logic

                                        if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                        {
                                            break;
                                        }
                                        else if(ship_des_p1 == total_ship)
                                        {
                                            break;
                                        }
                                        else if (ship_des_p2 == total_ship)
                                        {
                                            break;
                                        }

                                        System.out.println();

                                        //battle logic ends
                                        //----------------------------------------------------------------------------------------------//
                                    }
                                    //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                                    System.out.println("\n");
                                    if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                    {
                                        if(p1_turn == p2_turn)
                                        {
                                            System.out.println("Game over\nDraw\n");
                                        }
                                        else if(p1_turn > p2_turn)
                                        {
                                            System.out.println("Game over\nPlayer 1 is the winner\n");
                                        }
                                        else
                                        {
                                            System.out.println("Game over\nPlayer 2 is the winner\n");
                                        }
                                    }
                                    else if(ship_des_p1 == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer 1 is the winner\n");
                                    }
                                    else if (ship_des_p2 == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer 2 is the winner\n");
                                    }

//---------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement history

                                    // player 1
                                    System.out.println("Player 1's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == p1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    //player 2
                                    System.out.println("Player 2's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == p2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                                else if(user_choice4 == 2)                               ////////////////////////// custom: random ship length_random placement mode
                                {
                                    System.out.println();
                                    System.out.println("You have choosed to play Custom mode's Random ship length and random ship placement mode");

                                    for(int index = 0; index < pa1.length; index++)
                                    {
                                        pa1[index] = "  _";
                                    }

                                    for(int index = 0; index < pa2.length; index++)
                                    {
                                        pa2[index] = "  _";
                                    }
                                    //--------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement starts

                                    //--------------------------------------------------------------------------------||||
                                    // Ship placement starts p1

                                    int length[] = new int[7]; // ship length
                                    for(int index = 0; index < length.length; index++)
                                    {
                                        int n = rand.nextInt(10);
                                        if(n == 0)
                                        {
                                            length[index] = n + 1;
                                        }
                                        else
                                        {
                                            length[index] = n + 1;
                                        }
                                    }

                                    for(int index = 0; index < p1.length; index++)
                                    {
                                        p1[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        int ship_tile = rand.nextInt(100);

                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p1.length);)
                                        {
                                            ship_tile = rand.nextInt(100);

                                            for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                            {
                                                ship_tile = rand.nextInt(100);

                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile; i <= ship_place; i++)
                                        {
                                            if(p1[i] == "  S")
                                            {
                                                ship_tile = rand.nextInt(100);

                                                for(;(ship_tile < 1) || (ship_tile > p1.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);

                                                }
                                                ship_place = length[index - 1] + ship_tile - 1;

                                                for(;(ship_place < 1) || (ship_place > p1.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);
                                                    ship_place = length[index - 1] + ship_tile - 1;
                                                }
                                                i = ship_tile - 1;
                                            }
                                        }
                                        for(int i = ship_tile; i <= ship_place; i++)
                                        {
                                            p1[(i)] = "  S";
                                        }
                                    }


                                    //ship placement ends p1
                                    //--------------------------------------------------------------------------------||||

                                    //--------------------------------------------------------------------------------||||
                                    // Ship placement starts p2

                                    for(int index = 0; index < p2.length; index++)
                                    {
                                        p2[index] = "  _";
                                    }

                                    for(int index = 1; index <= 7; index++) //index = ship count
                                    {
                                        int ship_tile = rand.nextInt(100);

                                        int ship_place = length[index - 1] + ship_tile - 1;

                                        for(;(ship_place < 1) || (ship_place > p2.length);)
                                        {
                                            ship_tile = rand.nextInt(100);

                                            for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                            {
                                                ship_tile = rand.nextInt(100);

                                            }
                                            ship_place = ship_tile + length[index - 1] - 1;
                                        }

                                        for(int i = ship_tile; i <= ship_place; i++)
                                        {
                                            if(p2[i] == "  S")
                                            {
                                                ship_tile = rand.nextInt(100);

                                                for(;(ship_tile < 1) || (ship_tile > p2.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);

                                                }
                                                ship_place = length[index - 1] + ship_tile - 1;

                                                for(;(ship_place < 1) || (ship_place > p2.length);)
                                                {
                                                    ship_tile = rand.nextInt(100);
                                                    ship_place = length[index - 1] + ship_tile - 1;
                                                }
                                                i = ship_tile - 1;
                                            }
                                        }
                                        for(int i = ship_tile; i <= ship_place; i++)
                                        {
                                            p2[(i)] = "  S";
                                        }
                                    }
                                    //player 2 ship placement ends
                                    //--------------------------------------------------------------------------------||||

                                    //ship placement ends
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
                                    //total ship count starts

                                    int total_ship = 0;
                                    for(int i = 0; i < length.length; i++)
                                    {
                                        total_ship += length[i];
                                    }

                                    System.out.println();
                                    System.out.println("Total ship parts = " + total_ship + "\n");

                                    //total ship count ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack field setup starts

                                    //---------------------------------------------------------------------------------||||
                                    //p1 attack field start

                                    System.out.println("P1 attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(pa1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == pa1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    // p1 attack field end
                                    //---------------------------------------------------------------------------------||||


                                    //---------------------------------------------------------------------------------||||
                                    //p2 attack field start

                                    System.out.println("P2 attack field:");

                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(pa2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == pa2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");
                                    // p2 attack field end
                                    //---------------------------------------------------------------------------------||||

                                    //attack field setup ends
//---------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------
                                    //attack starts

                                    int p1_turn = 0;
                                    int p2_turn = 0;
                                    int ship_des_p1 = 0;
                                    int ship_des_p2 = 0;


                                    for(int atk_loop = 1; ; atk_loop++)
                                    {
                                        //----------------------------------------------------------------------------------------------//
                                        //player 1 attack input starts

                                        System.out.println("Player 1's turn:\n Please enter a tile number to attack");
                                        int p1_atk_input = x.nextInt();
                                        for(;(p1_atk_input < 1) || (p1_atk_input > p2.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p1_atk_input = x.nextInt();
                                        }

                                        for(;(pa1[p1_atk_input - 1] == "  H") || (pa1[p1_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("You have already attacked this tile\n Please enter another tile number to attack");
                                            p1_atk_input = x.nextInt();
                                        }

                                        if(p2[p1_atk_input - 1] == "  S")
                                        {
                                            ship_des_p1++;
                                            p1_turn++;

                                            System.out.println("***BULL'S EYE***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                            pa1[p1_atk_input - 1] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            p1_turn++;

                                            System.out.println("***Target missed***\nPlayer 1 attack field: Destroyed ship = " + ship_des_p1 + " Player's turn = " + p1_turn);
                                            pa1[(p1_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa1.length; index++)
                                            {
                                                System.out.print(pa1[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa1.length; index++)
                                            {
                                                if(index == pa1.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        System.out.println();

                                        //player 1 attack input ends
                                        //----------------------------------------------------------------------------------------------//


                                        //----------------------------------------------------------------------------------------------//
                                        //player 2 attack input starts

                                        System.out.println("Player 2's turn:\n Please enter a tile number to attack");
                                        int p2_atk_input = x.nextInt();

                                        for(;(p2_atk_input < 1) || (p2_atk_input > p1.length);)
                                        {
                                            System.out.println("Input invalid\n Please enter another tile number");
                                            p2_atk_input = x.nextInt();
                                        }

                                        for(;(pa2[p2_atk_input - 1] == "  H") || (pa2[p2_atk_input - 1] == "  M");)
                                        {
                                            System.out.println("Youhave already attacked this tile\n Please enter another tile number to attack");
                                            p2_atk_input = x.nextInt();
                                        }

                                        if(p1[(p2_atk_input - 1)] == "  S")
                                        {
                                            ship_des_p2++;
                                            p2_turn++;

                                            System.out.println("***BULL'S EYE***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                            pa2[(p2_atk_input - 1)] = "  H";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();


                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        else
                                        {
                                            p2_turn++;

                                            System.out.println("***Target missed***\nPlayer 2 attack field: Destroyed ship = " + ship_des_p2 + " Player's turn = " + p2_turn);
                                            pa2[(p2_atk_input - 1)] = "  M";

                                            for(int index = 0; index < 50; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 1; index <= 50; index++)
                                            {
                                                System.out.printf("%3d" , index);
                                            }
                                            System.out.println();

                                            for(int index = 50; index < pa2.length; index++)
                                            {
                                                System.out.print(pa2[index]);
                                            }
                                            System.out.println();

                                            for(int index = 51; index <= pa2.length; index++)
                                            {
                                                if(index == pa2.length)
                                                {
                                                    System.out.printf("%4d" , index);
                                                }
                                                else
                                                {
                                                    System.out.printf("%3d" , index);
                                                }
                                            }
                                            System.out.println();
                                        }

                                        //player 2 attack input ends
                                        //----------------------------------------------------------------------------------------------//

                                        //----------------------------------------------------------------------------------------------//
                                        //battle result logic

                                        if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                        {
                                            break;
                                        }
                                        else if(ship_des_p1 == total_ship)
                                        {
                                            break;
                                        }
                                        else if (ship_des_p2 == total_ship)
                                        {
                                            break;
                                        }

                                        System.out.println();

                                        //battle logic ends
                                        //----------------------------------------------------------------------------------------------//
                                    }
                                    //battle loop ends
//---------------------------------------------------------------------------------------------------------------------------------

                                    System.out.println("\n");
                                    if((ship_des_p1 == total_ship) && (ship_des_p2 == total_ship))
                                    {
                                        if(p1_turn == p2_turn)
                                        {
                                            System.out.println("Game over\nDraw\n");
                                        }
                                        else if(p1_turn > p2_turn)
                                        {
                                            System.out.println("Game over\nPlayer 1 is the winner\n");
                                        }
                                        else
                                        {
                                            System.out.println("Game over\nPlayer 2 is the winner\n");
                                        }
                                    }
                                    else if(ship_des_p1 == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer 1 is the winner\n");
                                    }
                                    else if (ship_des_p2 == total_ship)
                                    {
                                        System.out.println("Game over\nPlayer 2 is the winner\n");
                                    }

//---------------------------------------------------------------------------------------------------------------------------------
                                    //ship placement history

                                    // player 1
                                    System.out.println("Player 1's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa1.length; index++)
                                    {
                                        System.out.print(p1[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa1.length; index++)
                                    {
                                        if(index == p1.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println("\n");

                                    //player 2
                                    System.out.println("Player 2's ship placement:");
                                    for(int index = 0; index < 50; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 1; index <= 50; index++)
                                    {
                                        System.out.printf("%3d" , index);
                                    }
                                    System.out.println();

                                    for(int index = 50; index < pa2.length; index++)
                                    {
                                        System.out.print(p2[index]);
                                    }
                                    System.out.println();

                                    for(int index = 51; index <= pa2.length; index++)
                                    {
                                        if(index == p2.length)
                                        {
                                            System.out.printf("%4d" , index);
                                        }
                                        else
                                        {
                                            System.out.printf("%3d" , index);
                                        }
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }

                    //Player VS Player Ends
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//########################################################################################################################################################
                    System.out.println(" 1. Restart\n 2. Main Menu\n 0. Exit game");
                    int user_command2 = x.nextInt();

                    for(;(user_command2 < 0) || (user_command2 > 2);)
                    {
                        System.out.println(" 1. Restart\n 2. Main Menu\n 0. Exit game");
                        user_command2 = x.nextInt();
                    }
                    if(user_command2 == 1)
                    {
                        user_command = 1;
                    }
                    else if(user_command2 == 2)
                    {
                        user_command = -1;
                        user_choice = -1;
                    }
                    else if(user_command2 == 0)
                    {
                        user = 1;
                        break;
                    }
                }
            }
            else if(user_command == 2)  //--------------------------------------------instruction
            {
                System.out.println();
                System.out.println(" Default mode:\n   Ship length:\n     In this mode ships lengths are fixed from 1 to 7 respective to the ship's number. Such as, ship-1's length is 1, \n     ship-6's length is 6. \n   Ship placement:\n     The ships will be placed randomly.\n   Attack:\n     In order to attack players need to select from tile 1 to 100.\n");
                System.out.println(" Typical mode:\n   Ship length:\n     In this mode ships lengths are fixed from 1 to 7 respective to the ship's number. Such as, ship-1's length is 1, \n     ship-6's length is 6. \n   Ship placement:\n     Players have to place their own ships by selecting tiles from 1 to 100.\n   Attack:\n     In order to attack players need to select from tile 1 to 100.\n");
                System.out.println(" Custom:");
                System.out.println("   1. Custom ship length:");
                System.out.println("      i. User ship length user placement:\n           Ship length:\n             In this mode ships lengths are fixed by players from 1 to 7.\n           Ship placement:\n             Players have to place their own ships by selecting tiles from 1 to 100.\n           Attack:\n             In order to attack players need to select from tile 1 to 100.");
                System.out.println("     ii. User ship length random placement:\n           Ship length:\n             In this mode ships lengths are fixed by players from 1 to 7.\n           Ship placement:\n             The ships will be placed randomly.\n           Attack:\n             In order to attack players need to select from tile 1 to 100.\n");
                System.out.println("   2. Random ship length:\n");
                System.out.println("      i. Random Ship length user placement\n           Ship length:\n             Ships length will be generated randomly.\n           Ship placement:\n             Players have to place their own ships by selecting tiles from 1 to 100.\n           Attack:\n             In order to attack players need to select from tile 1 to 100.");
                System.out.println("     ii. Random Ship length random placement:\n           Ship length:\n             Ships length will be generated randomly.\n           Ship placement:\n             The ships will be placed randomly.\n           Attack:\n             In order to attack players need to select from tile 1 to 100.");

                System.out.println("1. Main menu\n2. Exit game");
                int command = x.nextInt();
                for(; (command < 1) || (command > 2);)
                {
                    System.out.println("Wrong input");
                    System.out.println("1. Main menu\n2. Exit game");
                    command = x.nextInt();
                }
                if(command == 2)
                {
                    break;
                }

            }
            else if(user_command == 3)  //----------------------------Credits
            {
                System.out.println("This game was developed by\n 1. Avinandan Banerjee\n ID: \n 2. Rifah Tasmiah\n ID: \n 3. Sofia \n ID: \n 4. K.M. Abdullah Al Maruf\n ID: 19101487 \n (Group - 8 of CSE-110, section - 14, Spring-2019)\n");
                System.out.println("Under the supervision and instruction of MD. Abdullah (ABD), Lecturer of CSE department, BRAC University.\n");
                System.out.println("1. Main menu\n2. Exit game");
                int command = x.nextInt();

                for(; (command < 1) || (command > 2);)
                {
                    System.out.println("Wrong input");
                    System.out.println("1. Main menu\n2. Exit game");
                    command = x.nextInt();
                }
                if(command == 2)
                {
                    break;
                }
            }
            else if(user_command == 4)
            {
                break;
            }
        }
    }
}



