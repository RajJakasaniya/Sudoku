package com.example.raj.sudoku;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;
import java.util.Random;
import android.os.Handler;
import android.widget.TextView;
import java.util.logging.LogRecord;
import java.util.Random;

/**
 * Created by raj on 4/5/2016.
 */
public class medium extends MainActivity {
    Button bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,submit;
    int array[][]=new int[9][9];
    int arraycol[]=new int[10];
    int square[][]=new int[10][10];
    int flag=0;
    int random;
    Button reset;
    String time;
    int seconds=0;
    boolean running=true;
    TextView t00,t01,t02,t03,t04,t05,t06,t07,t08,t10,t11,t12,t13,t14,t15,t16,t17,t18,t20,t21,t22,t23,t24,t25,t26,t27,t28;
    TextView t30,t31,t32,t33,t34,t35,t36,t37,t38,t40,t41,t42,t43,t44,t45,t46,t47,t48,t50,t51,t52,t53,t54,t55,t56,t57,t58;
    TextView t60,t61,t62,t63,t64,t65,t66,t67,t68,t70,t71,t72,t73,t74,t75,t76,t77,t78,t80,t81,t82,t83,t84,t85,t86,t87,t88;
    Button b;
    int i=0;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);
        runtimer();

        bu1=(Button)findViewById(R.id.b1);
        bu2=(Button)findViewById(R.id.b2);
        bu3=(Button)findViewById(R.id.b3);
        bu4=(Button)findViewById(R.id.b4);
        bu5=(Button)findViewById(R.id.b5);
        bu6=(Button)findViewById(R.id.b6);
        bu7=(Button)findViewById(R.id.b7);
        bu8=(Button)findViewById(R.id.b8);
        bu9=(Button)findViewById(R.id.b9);
        submit=(Button)findViewById(R.id.submit);


        t00=(TextView)findViewById(R.id.text00);
        t01=(TextView)findViewById(R.id.text01);
        t02=(TextView)findViewById(R.id.text02);
        t03=(TextView)findViewById(R.id.text03);
        t04=(TextView)findViewById(R.id.text04);
        t05=(TextView)findViewById(R.id.text05);
        t06=(TextView)findViewById(R.id.text06);
        t07=(TextView)findViewById(R.id.text07);
        t08=(TextView)findViewById(R.id.text08);

        t10=(TextView)findViewById(R.id.text10);
        t11=(TextView)findViewById(R.id.text11);
        t12=(TextView)findViewById(R.id.text12);
        t13=(TextView)findViewById(R.id.text13);
        t14=(TextView)findViewById(R.id.text14);
        t15=(TextView)findViewById(R.id.text15);
        t16=(TextView)findViewById(R.id.text16);
        t17=(TextView)findViewById(R.id.text17);
        t18=(TextView)findViewById(R.id.text18);


        t20=(TextView)findViewById(R.id.text20);
        t21=(TextView)findViewById(R.id.text21);
        t22=(TextView)findViewById(R.id.text22);
        t23=(TextView)findViewById(R.id.text23);
        t24=(TextView)findViewById(R.id.text24);
        t25=(TextView)findViewById(R.id.text25);
        t26=(TextView)findViewById(R.id.text26);
        t27=(TextView)findViewById(R.id.text27);
        t28=(TextView)findViewById(R.id.text28);


        t30=(TextView)findViewById(R.id.text30);
        t31=(TextView)findViewById(R.id.text31);
        t32=(TextView)findViewById(R.id.text32);
        t33=(TextView)findViewById(R.id.text33);
        t34=(TextView)findViewById(R.id.text34);
        t35=(TextView)findViewById(R.id.text35);
        t36=(TextView)findViewById(R.id.text36);
        t37=(TextView)findViewById(R.id.text37);
        t38=(TextView)findViewById(R.id.text38);


        t40=(TextView)findViewById(R.id.text40);
        t41=(TextView)findViewById(R.id.text41);
        t42=(TextView)findViewById(R.id.text42);
        t43=(TextView)findViewById(R.id.text43);
        t44=(TextView)findViewById(R.id.text44);
        t45=(TextView)findViewById(R.id.text45);
        t46=(TextView)findViewById(R.id.text46);
        t47=(TextView)findViewById(R.id.text47);
        t48=(TextView)findViewById(R.id.text48);


        t50=(TextView)findViewById(R.id.text50);
        t51=(TextView)findViewById(R.id.text51);
        t52=(TextView)findViewById(R.id.text52);
        t53=(TextView)findViewById(R.id.text53);
        t54=(TextView)findViewById(R.id.text54);
        t55=(TextView)findViewById(R.id.text55);
        t56=(TextView)findViewById(R.id.text56);
        t57=(TextView)findViewById(R.id.text57);
        t58=(TextView)findViewById(R.id.text58);


        t60=(TextView)findViewById(R.id.text60);
        t61=(TextView)findViewById(R.id.text61);
        t62=(TextView)findViewById(R.id.text62);
        t63=(TextView)findViewById(R.id.text63);
        t64=(TextView)findViewById(R.id.text64);
        t65=(TextView)findViewById(R.id.text65);
        t66=(TextView)findViewById(R.id.text66);
        t67=(TextView)findViewById(R.id.text67);
        t68=(TextView)findViewById(R.id.text68);

        t70=(TextView)findViewById(R.id.text70);
        t71=(TextView)findViewById(R.id.text71);
        t72=(TextView)findViewById(R.id.text72);
        t73=(TextView)findViewById(R.id.text73);
        t74=(TextView)findViewById(R.id.text74);
        t75=(TextView)findViewById(R.id.text75);
        t76=(TextView)findViewById(R.id.text76);
        t77=(TextView)findViewById(R.id.text77);
        t78=(TextView)findViewById(R.id.text78);


        t80=(TextView)findViewById(R.id.text80);
        t81=(TextView)findViewById(R.id.text81);
        t82=(TextView)findViewById(R.id.text82);
        t83=(TextView)findViewById(R.id.text83);
        t84=(TextView)findViewById(R.id.text84);
        t85=(TextView)findViewById(R.id.text85);
        t86=(TextView)findViewById(R.id.text86);
        t87=(TextView)findViewById(R.id.text87);
        t88=(TextView)findViewById(R.id.text88);


            Random r=new Random();
            random=r.nextInt(3)+1;
            creategrid(random);

        b=bu1;

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setBackgroundColor(897877689);
                b = bu1;
                b.setBackgroundColor(000000);
            }
        });

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setBackgroundColor(897877689);
                b=bu2;
                b.setBackgroundColor( 000000);

            }
        });
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setBackgroundColor(897877689);
                b=bu3;
                b.setBackgroundColor(000000);

            }
        });

        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setBackgroundColor(897877689);
                b=bu4;
                b.setBackgroundColor(000000);

            }
        });
        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setBackgroundColor(897877689);
                b=bu5;
                b.setBackgroundColor(000000);

            }
        });
        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setBackgroundColor(897877689);
                b=bu6;
                b.setBackgroundColor(000000);

            }
        });
        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setBackgroundColor(897877689);
                b=bu7;
                b.setBackgroundColor(000000);

            }
        });
        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setBackgroundColor(897877689);
                b=bu8;
                b.setBackgroundColor(000000);

            }
        });
        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setBackgroundColor(897877689);
                b=bu9;
                b.setBackgroundColor(000000);

            }
        });

        t00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t00.setText(b.getText());
            }
        });
        t01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t01.setText(b.getText());
            }
        });
        t02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t02.setText(b.getText());
            }
        });
        t03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t03.setText(b.getText());
            }
        });
        t04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t04.setText(b.getText());
            }
        });
        t05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t05.setText(b.getText());
            }
        });
        t06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t06.setText(b.getText());
            }
        });
        t07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t07.setText(b.getText());
            }
        });
        t08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t08.setText(b.getText());
            }
        });



        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t10.setText(b.getText());
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t11.setText(b.getText());
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t12.setText(b.getText());
            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t13.setText(b.getText());
            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t14.setText(b.getText());
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t15.setText(b.getText());
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t16.setText(b.getText());
            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t17.setText(b.getText());

            }
        });
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t18.setText(b.getText());
            }
        });




        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t20.setText(b.getText());

            }
        });
        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t21.setText(b.getText());
            }
        });
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t22.setText(b.getText());
            }
        });
        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t23.setText(b.getText());
            }
        });
        t24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t24.setText(b.getText());
            }
        });
        t25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t25.setText(b.getText());
            }
        });
        t26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t26.setText(b.getText());
            }
        });
        t27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t27.setText(b.getText());
            }
        });
        t28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t28.setText(b.getText());
            }
        });




        t30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t30.setText(b.getText());
            }
        });
        t31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t31.setText(b.getText());
            }
        });
        t32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t32.setText(b.getText());
            }
        });
        t33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t33.setText(b.getText());
            }
        });
        t34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t34.setText(b.getText());
            }
        });
        t35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t35.setText(b.getText());
            }
        });
        t36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t36.setText(b.getText());
            }
        });
        t37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t37.setText(b.getText());
            }
        });
        t38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t38.setText(b.getText());
            }
        });





        t40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t40.setText(b.getText());
            }
        });
        t41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t41.setText(b.getText());
            }
        });
        t42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t42.setText(b.getText());
            }
        });
        t43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t43.setText(b.getText());
            }
        });
        t44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t44.setText(b.getText());
            }
        });
        t45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t45.setText(b.getText());
            }
        });
        t46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t46.setText(b.getText());
            }
        });
        t47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t47.setText(b.getText());
            }
        });
        t48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t48.setText(b.getText());
            }
        });





        t50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t50.setText(b.getText());
            }
        });
        t51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t51.setText(b.getText());
            }
        });
        t52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t52.setText(b.getText());
            }
        });
        t53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t53.setText(b.getText());
            }
        });
        t54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t54.setText(b.getText());
            }
        });
        t55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t55.setText(b.getText());
            }
        });
        t56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t56.setText(b.getText());
            }
        });
        t57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t57.setText(b.getText());
            }
        });
        t58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t58.setText(b.getText());
            }
        });





        t60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t60.setText(b.getText());
            }
        });
        t61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t61.setText(b.getText());
            }
        });
        t62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t62.setText(b.getText());
            }
        });
        t63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t63.setText(b.getText());
            }
        });
        t64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t64.setText(b.getText());
            }
        });
        t65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t65.setText(b.getText());
            }
        });
        t66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t66.setText(b.getText());
            }
        });
        t67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t67.setText(b.getText());
            }
        });
        t68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t68.setText(b.getText());
            }
        });


        t70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t70.setText(b.getText());
            }
        });
        t71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t71.setText(b.getText());
            }
        });
        t72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t72.setText(b.getText());
            }
        });
        t73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t73.setText(b.getText());
            }
        });
        t74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t74.setText(b.getText());
            }
        });
        t75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t75.setText(b.getText());
            }
        });
        t76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t76.setText(b.getText());
            }
        });
        t77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t77.setText(b.getText());
            }
        });
        t78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t78.setText(b.getText());
            }
        });

        t80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t80.setText(b.getText());
            }
        });
        t81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t81.setText(b.getText());
            }
        });
        t82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t82.setText(b.getText());
            }
        });
        t83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t83.setText(b.getText());
            }
        });
        t84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t84.setText(b.getText());
            }
        });
        t85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t85.setText(b.getText());
            }
        });
        t86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t86.setText(b.getText());
            }
        });
        t87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t87.setText(b.getText());
            }
        });
        t88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t88.setText(b.getText());
            }
        });



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                running=false;
                if(i==1) {

                }else if(t00.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[0][0] = Integer.parseInt((String) t00.getText());
                }
                if(i==1) {

                }else if(t01.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[0][1] = Integer.parseInt((String) t01.getText());
                }
                if(i==1) {

                }else if(t02.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[0][2] = Integer.parseInt((String) t02.getText());
                }
                if(i==1) {

                }else if(t03.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[0][3] = Integer.parseInt((String) t03.getText());
                }
                if(i==1) {

                }else if(t04.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[0][4] = Integer.parseInt((String) t04.getText());
                }
                if(i==1) {

                }else if(t05.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[0][5] = Integer.parseInt((String) t05.getText());
                }
                if(i==1) {

                }else if(t06.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[0][6] = Integer.parseInt((String) t06.getText());
                }
                if(i==1) {

                }else if(t07.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[0][7] = Integer.parseInt((String) t07.getText());
                }
                if(i==1) {

                }else if(t08.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[0][8] = Integer.parseInt((String) t08.getText());
                }



                if(i==1) {

                }else if(t10.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[1][0] = Integer.parseInt((String) t10.getText());
                }
                if(i==1) {

                }else if(t11.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[1][1] = Integer.parseInt((String) t11.getText());
                }
                if(i==1) {

                }else if(t12.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[1][2] = Integer.parseInt((String) t12.getText());
                }
                if(i==1) {

                }else if(t13.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[1][3] = Integer.parseInt((String) t13.getText());
                }
                if(i==1) {

                }else if(t14.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[1][4] = Integer.parseInt((String) t14.getText());
                }
                if(i==1) {

                }else if(t15.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[1][5] = Integer.parseInt((String) t15.getText());
                }
                if(i==1) {

                }else if(t16.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[1][6] = Integer.parseInt((String) t16.getText());
                }
                if(i==1) {

                }else if(t17.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[1][7] = Integer.parseInt((String) t17.getText());
                }
                if(i==1) {

                }else if(t18.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[1][8] = Integer.parseInt((String) t18.getText());
                }




                if(i==1) {

                }else if(t20.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[2][0] = Integer.parseInt((String) t20.getText());
                }
                if(i==1) {

                }else if(t21.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[2][1] = Integer.parseInt((String) t21.getText());
                }
                if(i==1) {

                }else if(t22.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[2][2] = Integer.parseInt((String) t22.getText());
                }
                if(i==1) {

                }else if(t23.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[2][3] = Integer.parseInt((String) t23.getText());
                }
                if(i==1) {

                }else if(t24.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[2][4] = Integer.parseInt((String) t24.getText());
                }
                if(i==1) {

                }else if(t25.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[2][5] = Integer.parseInt((String) t25.getText());
                }
                if(i==1) {

                }else if(t26.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[2][6] = Integer.parseInt((String) t26.getText());
                }
                if(i==1) {

                }else if(t27.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[2][7] = Integer.parseInt((String) t27.getText());
                }
                if(i==1) {

                }else if(t28.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[2][8] = Integer.parseInt((String) t28.getText());
                }


                if(i==1) {

                }else if(t30.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[3][0] = Integer.parseInt((String) t30.getText());
                }
                if(i==1) {

                }else if(t31.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[3][1] = Integer.parseInt((String) t31.getText());
                }
                if(i==1) {

                }else if(t32.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[3][2] = Integer.parseInt((String) t32.getText());
                }
                if(i==1) {

                }else if(t33.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[3][3] = Integer.parseInt((String) t33.getText());
                }
                if(i==1) {

                }else if(t34.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[3][4] = Integer.parseInt((String) t34.getText());
                }
                if(i==1) {

                }else if(t35.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[3][5] = Integer.parseInt((String) t35.getText());
                }
                if(i==1) {

                }else if(t36.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[3][6] = Integer.parseInt((String) t36.getText());
                }
                if(i==1) {

                }else if(t37.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[3][7] = Integer.parseInt((String) t37.getText());
                }
                if(i==1) {

                }else if(t38.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[3][8] = Integer.parseInt((String) t38.getText());
                }


                if(i==1) {

                }else if(t40.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[4][0] = Integer.parseInt((String) t40.getText());
                }
                if(i==1) {

                }else if(t41.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[4][1] = Integer.parseInt((String) t41.getText());
                }
                if(i==1) {

                }else if(t42.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[4][2] = Integer.parseInt((String) t42.getText());
                }
                if(i==1) {

                }else if(t43.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[4][3] = Integer.parseInt((String) t43.getText());
                }
                if(i==1) {

                }else if(t44.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[4][4] = Integer.parseInt((String) t44.getText());
                }
                if(i==1) {

                }else if(t45.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[4][5] = Integer.parseInt((String) t45.getText());
                }
                if(i==1) {

                }else if(t46.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[4][6] = Integer.parseInt((String) t46.getText());
                }
                if(i==1) {

                }else if(t47.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[4][7] = Integer.parseInt((String) t47.getText());
                }
                if(i==1) {

                }else if(t48.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[4][8] = Integer.parseInt((String) t48.getText());
                }


                if(i==1) {

                }else if(t50.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[5][0] = Integer.parseInt((String) t50.getText());
                }
                if(i==1) {

                }else if(t51.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[5][1] = Integer.parseInt((String) t51.getText());
                }
                if(i==1) {

                }else if(t52.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[5][2] = Integer.parseInt((String) t52.getText());
                }
                if(i==1) {

                }else if(t53.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[5][3] = Integer.parseInt((String) t53.getText());
                }
                if(i==1) {

                }else if(t54.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[5][4] = Integer.parseInt((String) t54.getText());
                }
                if(i==1) {

                }else if(t55.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[5][5] = Integer.parseInt((String) t55.getText());
                }
                if(i==1) {

                }else if(t56.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[5][6] = Integer.parseInt((String) t56.getText());
                }
                if(i==1) {

                }else if(t57.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[5][7] = Integer.parseInt((String) t57.getText());
                }
                if(i==1) {

                }else if(t58.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[5][8] = Integer.parseInt((String) t58.getText());
                }


                if(i==1) {

                }else if(t60.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[6][0] = Integer.parseInt((String) t60.getText());
                }
                if(i==1) {

                }else if(t61.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[6][1] = Integer.parseInt((String) t61.getText());
                }
                if(i==1) {

                }else if(t62.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[6][2] = Integer.parseInt((String) t62.getText());
                }
                if(i==1) {

                }else if(t63.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[6][3] = Integer.parseInt((String) t63.getText());
                }
                if(i==1) {

                }else if(t64.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[6][4] = Integer.parseInt((String) t64.getText());
                }
                if(i==1) {

                }else if(t65.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[6][5] = Integer.parseInt((String) t65.getText());
                }
                if(i==1) {

                }else if(t66.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[6][6] = Integer.parseInt((String) t66.getText());
                }
                if(i==1) {

                }else if(t67.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[6][7] = Integer.parseInt((String) t67.getText());
                }
                if(i==1) {

                }else if(t68.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[6][8] = Integer.parseInt((String) t68.getText());
                }



                if(i==1) {

                }else if(t70.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[7][0] = Integer.parseInt((String) t70.getText());
                }
                if(i==1) {

                }else if(t71.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[7][1] = Integer.parseInt((String) t71.getText());
                }
                if(i==1) {

                }else if(t72.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[7][2] = Integer.parseInt((String) t72.getText());
                }
                if(i==1) {

                }else if(t73.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[7][3] = Integer.parseInt((String) t73.getText());
                }
                if(i==1) {

                }else if(t74.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[7][4] = Integer.parseInt((String) t74.getText());
                }
                if(i==1) {

                }else if(t75.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[7][5] = Integer.parseInt((String) t75.getText());
                }
                if(i==1) {

                }else if(t76.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[7][6] = Integer.parseInt((String) t76.getText());
                }
                if(i==1) {

                }else if(t77.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[7][7] = Integer.parseInt((String) t77.getText());
                }
                if(i==1) {

                }else if(t78.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[7][8] = Integer.parseInt((String) t78.getText());
                }


                if(i==1) {

                }else if(t80.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[8][0] = Integer.parseInt((String) t80.getText());
                }
                if(i==1) {

                }else if(t81.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[8][1] = Integer.parseInt((String) t81.getText());
                }
                if(i==1) {

                }else if(t82.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[8][2] = Integer.parseInt((String) t82.getText());
                }
                if(i==1) {

                }else if(t83.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[8][3] = Integer.parseInt((String) t83.getText());
                }
                if(i==1) {

                }else if(t84.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[8][4] = Integer.parseInt((String) t84.getText());
                }
                if(i==1) {

                }else if(t85.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[8][5] = Integer.parseInt((String) t85.getText());
                }
                if(i==1) {

                }else if(t86.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[8][6] = Integer.parseInt((String) t86.getText());
                }
                if(i==1) {

                }else if(t87.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();


                    //popup complete sudoku msg
                }
                else {
                    array[8][7] = Integer.parseInt((String) t87.getText());
                }
                if(i==1) {

                }else if(t88.getText().equals("-")){
                    i++;
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Dont Leave any places empty");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();
                }
                else {
                    array[8][8] = Integer.parseInt((String) t88.getText());
                }
                for(int x=0;x<=8;x++){
                    for(int y=0;y<=8;y++){
                        for(int z=0;z<=8;z++){
                            if(z+1==array[x][y]){
                                arraycol[z]=1;
                            }
                        }
                        if(array[x][y]==0){
                            counter++;
                        }
                    }
                    for(int z=0;z<=8;z++){
                        if(arraycol[z]==1){
                            continue;
                        }
                        else if(counter==0){
                            flag=1;
                            break;
                        }
                    }

                }
                if(flag==1){
                    AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                    alert.setTitle("Error Occurred");
                    alert.setMessage("Column contains 2 same element");
                    alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                                running=true;
                        }
                    });
                    alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                            startActivity(i);
                        }
                    });
                    alert.show();
                }else{
                    int count=0;
                    for(int x=0,y=1,z=2;x<=6;x=x+3,y=y+3,z=z+3){
                        for(int a=0,b=1,c=2;a<=6;a=a+3,b=b+3,c=c+3){
                            for(int i=0;i<=8;i++){
                                if(array[x][a]==i+1){
                                    square[count][i]=1;
                                }
                                if(array[x][a+1]==i+1){
                                    square[count][i]=1;
                                }
                                if(array[x][a+2]==i+1){
                                    square[count][i]=1;
                                }
                            }
                            for(int i=0;i<=8;i++){
                                if(array[y][b-1]==i+1){
                                    square[count][i]=1;
                                }
                                if(array[y][b]==i+1){
                                    square[count][i]=1;
                                }
                                if(array[y][b+1]==i+1){
                                    square[count][i]=1;
                                }
                            }
                            for(int i=0;i<=8;i++){
                                if(array[z][c-2]==i+1){
                                    square[count][i]=1;
                                }
                                if(array[z][c-1]==i+1){
                                    square[count][i]=1;
                                }
                                if(array[z][c]==i+1){
                                    square[count][i]=1;
                                }
                            }
                            for(int r=0;r<=8;r++){
                                if(square[count][r]==1){
                                    continue;
                                }
                                else{
                                    flag=1;
                                    break;
                                }
                            }
                            count++;
                        }
                    }
                    if(flag==1){
                        AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                        alert.setTitle("Error Occurred");
                        alert.setMessage("Square has two same element");
                        alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                    running=true;
                            }
                        });
                        alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i=new Intent("com.example.raj.sudoku.StartingPoint");
                                startActivity(i);
                            }
                        });
                        alert.show();
                    }else{
                        AlertDialog alert = new AlertDialog.Builder(medium.this).create();
                        alert.setTitle("You have Won");
                        alert.setMessage("Time Taken=" + time);
                        alert.setButton(DialogInterface.BUTTON_NEGATIVE, "New Game", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent("com.example.raj.sudoku.StartingPoint");
                                startActivity(i);
                            }
                        });
                        alert.setButton(DialogInterface.BUTTON_POSITIVE, "Exit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                                homeIntent.addCategory(Intent.CATEGORY_HOME);
                                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(homeIntent);
                            }
                        });
                        alert.show();
                    }
                }
            }
        });

    }
    public void runtimer(){
        final TextView tv = (TextView)findViewById(R.id.textView);
        final Handler h = new Handler();
        h.post(new Runnable(){
            @Override
            public void run() {

                int hour = seconds/3600;
                int minute = (seconds%3600)/60;
                int secs = seconds%60;

                time = String.format("%d:%02d:%02d",hour,minute,secs);
                tv.setText(time);
                if(running) {
                    seconds++;
                }
                h.postDelayed(this,1);
            }
        });

    }
    public void creategrid(int i){
        switch (i){
            case 1:
                t00.setText("4");
                t00.setTextColor(Color.BLACK);
                t00.setEnabled(false);
                t01.setText("7");
                t01.setTextColor(Color.BLACK);
                t01.setEnabled(false);
                t02.setText("2");
                t02.setTextColor(Color.BLACK);
                t02.setEnabled(false);
                t10.setText("1");
                t10.setTextColor(Color.BLACK);
                t10.setEnabled(false);
                t12.setText("5");
                t12.setTextColor(Color.BLACK);
                t12.setEnabled(false);
                t13.setText("7");
                t13.setTextColor(Color.BLACK);
                t13.setEnabled(false);
                t14.setText("6");
                t14.setTextColor(Color.BLACK);
                t14.setEnabled(false);
                t18.setText("4");
                t18.setTextColor(Color.BLACK);
                t18.setEnabled(false);
                t34.setText("8");
                t34.setTextColor(Color.BLACK);
                t34.setEnabled(false);
                t41.setText("4");
                t41.setTextColor(Color.BLACK);
                t41.setEnabled(false);
                t42.setText("7");
                t42.setTextColor(Color.BLACK);
                t42.setEnabled(false);
                t43.setText("2");
                t43.setTextColor(Color.BLACK);
                t43.setEnabled(false);
                t50.setText("8");
                t50.setTextColor(Color.BLACK);
                t50.setEnabled(false);
                t51.setText("3");
                t51.setTextColor(Color.BLACK);
                t51.setEnabled(false);
                t53.setText("4");
                t53.setTextColor(Color.BLACK);
                t53.setEnabled(false);
                t55.setText("1");
                t55.setTextColor(Color.BLACK);
                t55.setEnabled(false);
                t58.setText("2");
                t58.setTextColor(Color.BLACK);
                t58.setEnabled(false);
                t60.setText("5");
                t60.setTextColor(Color.BLACK);
                t60.setEnabled(false);
                t61.setText("8");
                t61.setTextColor(Color.BLACK);
                t61.setEnabled(false);
                t64.setText("2");
                t64.setTextColor(Color.BLACK);
                t64.setEnabled(false);
                t67.setText("7");
                t67.setTextColor(Color.BLACK);
                t67.setEnabled(false);
                t73.setText("3");
                t73.setTextColor(Color.BLACK);
                t73.setEnabled(false);
                t75.setText("8");
                t75.setTextColor(Color.BLACK);
                t75.setEnabled(false);
                t77.setText("2");
                t77.setTextColor(Color.BLACK);
                t77.setEnabled(false);
                t78.setText("9");
                t78.setTextColor(Color.BLACK);
                t78.setEnabled(false);
                t82.setText("4");
                t82.setTextColor(Color.BLACK);
                t82.setEnabled(false);
                t84.setText("7");
                t84.setTextColor(Color.BLACK);
                t84.setEnabled(false);
                t87.setText("1");
                t87.setTextColor(Color.BLACK);
                t87.setEnabled(false);
                break;
            case 2:
                t01.setText("6");
                t01.setTextColor(Color.BLACK);
                t01.setEnabled(false);
                t02.setText("7");
                t02.setTextColor(Color.BLACK);
                t02.setEnabled(false);
                t03.setText("4");
                t03.setTextColor(Color.BLACK);
                t03.setEnabled(false);
                t07.setText("1");
                t07.setTextColor(Color.BLACK);
                t07.setEnabled(false);
                t11.setText("3");
                t11.setTextColor(Color.BLACK);
                t11.setEnabled(false);
                t12.setText("5");
                t12.setTextColor(Color.BLACK);
                t12.setEnabled(false);
                t13.setText("6");
                t13.setTextColor(Color.BLACK);
                t13.setEnabled(false);
                t16.setText("4");
                t16.setTextColor(Color.BLACK);
                t16.setEnabled(false);
                t21.setText("9");
                t21.setTextColor(Color.BLACK);
                t21.setEnabled(false);
                t22.setText("2");
                t22.setTextColor(Color.BLACK);
                t22.setEnabled(false);
                t24.setText("3");
                t24.setTextColor(Color.BLACK);
                t24.setEnabled(false);
                t28.setText("6");
                t28.setTextColor(Color.BLACK);
                t28.setEnabled(false);
                t36.setText("2");
                t36.setTextColor(Color.BLACK);
                t36.setEnabled(false);
                t37.setText("8");
                t37.setTextColor(Color.BLACK);
                t37.setEnabled(false);
                t38.setText("9");
                t38.setTextColor(Color.BLACK);
                t38.setEnabled(false);
                t43.setText("9");
                t43.setTextColor(Color.BLACK);
                t43.setEnabled(false);
                t44.setText("4");
                t44.setTextColor(Color.BLACK);
                t44.setEnabled(false);
                t45.setText("2");
                t45.setTextColor(Color.BLACK);
                t45.setEnabled(false);
                t46.setText("5");
                t46.setTextColor(Color.BLACK);
                t46.setEnabled(false);
                t47.setText("3");
                t47.setTextColor(Color.BLACK);
                t47.setEnabled(false);
                t66.setText("8");
                t66.setTextColor(Color.BLACK);
                t66.setEnabled(false);
                t73.setText("3");
                t73.setTextColor(Color.BLACK);
                t73.setEnabled(false);
                t78.setText("5");
                t78.setTextColor(Color.BLACK);
                t78.setEnabled(false);
                t83.setText("8");
                t83.setTextColor(Color.BLACK);
                t83.setEnabled(false);
                t84.setText("9");
                t84.setTextColor(Color.BLACK);
                t84.setEnabled(false);
                t85.setText("1");
                t85.setTextColor(Color.BLACK);
                t85.setEnabled(false);
                t87.setText("4");
                t87.setTextColor(Color.BLACK);
                t87.setEnabled(false);
                t88.setText("2");
                t88.setTextColor(Color.BLACK);
                t88.setEnabled(false);
                break;
            case 3:
                t11.setText("9");
                t11.setTextColor(Color.BLACK);
                t11.setEnabled(false);
                t12.setText("1");
                t12.setTextColor(Color.BLACK);
                t12.setEnabled(false);
                t15.setText("2");
                t15.setTextColor(Color.BLACK);
                t15.setEnabled(false);
                t18.setText("7");
                t18.setTextColor(Color.BLACK);
                t18.setEnabled(false);
                t20.setText("3");
                t20.setTextColor(Color.BLACK);
                t20.setEnabled(false);
                t24.setText("4");
                t24.setTextColor(Color.BLACK);
                t24.setEnabled(false);
                t25.setText("6");
                t25.setTextColor(Color.BLACK);
                t25.setEnabled(false);
                t30.setText("7");
                t30.setTextColor(Color.BLACK);
                t30.setEnabled(false);
                t31.setText("6");
                t31.setTextColor(Color.BLACK);
                t31.setEnabled(false);
                t32.setText("3");
                t32.setTextColor(Color.BLACK);
                t32.setEnabled(false);
                t34.setText("5");
                t34.setTextColor(Color.BLACK);
                t34.setEnabled(false);
                t50.setText("2");
                t50.setTextColor(Color.BLACK);
                t50.setEnabled(false);
                t51.setText("1");
                t51.setTextColor(Color.BLACK);
                t51.setEnabled(false);
                t53.setText("3");
                t53.setTextColor(Color.BLACK);
                t53.setEnabled(false);
                t55.setText("4");
                t55.setTextColor(Color.BLACK);
                t55.setEnabled(false);
                t58.setText("9");
                t58.setTextColor(Color.BLACK);
                t58.setEnabled(false);
                t61.setText("4");
                t61.setTextColor(Color.BLACK);
                t61.setEnabled(false);
                t65.setText("7");
                t65.setTextColor(Color.BLACK);
                t65.setEnabled(false);
                t66.setText("2");
                t66.setTextColor(Color.BLACK);
                t66.setEnabled(false);
                t70.setText("9");
                t70.setTextColor(Color.BLACK);
                t70.setEnabled(false);
                t72.setText("2");
                t72.setTextColor(Color.BLACK);
                t72.setEnabled(false);
                t75.setText("3");
                t75.setTextColor(Color.BLACK);
                t75.setEnabled(false);
                t76.setText("5");
                t76.setTextColor(Color.BLACK);
                t76.setEnabled(false);
                t78.setText("6");
                t78.setTextColor(Color.BLACK);
                t78.setEnabled(false);
                t80.setText("5");
                t80.setTextColor(Color.BLACK);
                t80.setEnabled(false);
                t84.setText("6");
                t84.setTextColor(Color.BLACK);
                t84.setEnabled(false);
                t85.setText("9");
                t85.setTextColor(Color.BLACK);
                t85.setEnabled(false);
                t86.setText("7");
                t86.setTextColor(Color.BLACK);
                t86.setEnabled(false);
                break;

        }
    }

}
