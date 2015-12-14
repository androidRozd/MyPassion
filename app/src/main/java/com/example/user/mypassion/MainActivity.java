package com.example.user.mypassion;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] songs = {"Агнец в небесах", "Бесконечный свет", "Благословлю Тебя", "Блуждали все как овцы", "Бог небес и земли",
                "Вгору мої", "Верю я", "Він знає моє ім`я", "Вот он я", "Всем сердцем", "Все о чем мечтаю", "В Твоем святом присутствии",
                "В Христе одном", "Господи Великий", "Господь есть мой свет", "Дом", "Жив", "За те, хто Ти є", "За Тобой пойду", "Ім`я Твоє",
                "Иисус - мой Спаситель", "Как лань желает", "Когда умолкнет звук", "Краще з тобою", "Меня нашел Ты", "Мы собрались",
                "Надія є", "На початку було Слово", "Наш Бог великий", "Небес коснусь", "Небо і земля", "Невимовний", "Нет невозможного",
                "Нет никого как Ты", "О, дивний день", "Океаны", "Осанна", "Петь, петь, петь", "Поклонюсь Тебе", "Полони мене", "Превознесен Царь",
                "Превыше власти", "Прекрасний Ти", "Радій, радій", "Разбитые сосуды", "Силен спасти", "Скрой меня", "Свят наш Господь",
                "Так, Господь", "Тобі хвала", "Только в Тебе", "Трудно обьяснить", "Ты обьемлешь меня", "Хвала, Адонай", "Хліб життя",
                "Эта любовь", "Я буду славить Господа", "Я сдаюсь, Бог"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.layout.my_list_item, songs);
        getListView().setAdapter(adapter);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent Sng1=new Intent(MainActivity.this,Sng1.class);
                        startActivity(Sng1);
                        break;
                    case 1:
                        Intent Sng2=new Intent(MainActivity.this,Sng2.class);
                        startActivity(Sng2);
                        break;
                    case 2:
                        Intent Sng3=new Intent(MainActivity.this,Sng3.class);
                        startActivity(Sng3);
                        break;
                    case 3:
                        Intent Sng4=new Intent(MainActivity.this,Sng4.class);
                        startActivity(Sng4);
                        break;
                    case 4:
                        Intent Sng5=new Intent(MainActivity.this,Sng5.class);
                        startActivity(Sng5);
                        break;
                    case 5:
                        Intent Sng6=new Intent(MainActivity.this,Sng6.class);
                        startActivity(Sng6);
                        break;
                    case 6:
                        Intent Sng7=new Intent(MainActivity.this,Sng7.class);
                        startActivity(Sng7);
                        break;
                    case 7:
                        Intent Sng8=new Intent(MainActivity.this,Sng8.class);
                        startActivity(Sng8);
                        break;
                    case 8:
                        Intent Sng9=new Intent(MainActivity.this,Sng9.class);
                        startActivity(Sng9);
                        break;
                    case 9:
                        Intent Sng10=new Intent(MainActivity.this,Sng10.class);
                        startActivity(Sng10);
                        break;
                    case 10:
                        Intent Sng11=new Intent(MainActivity.this,Sng11.class);
                        startActivity(Sng11);
                        break;
                    case 11:
                        Intent Sng12=new Intent(MainActivity.this,Sng12.class);
                        startActivity(Sng12);
                        break;
                    case 12:
                        Intent Sng13=new Intent(MainActivity.this,Sng13.class);
                        startActivity(Sng13);
                        break;
                    case 13:
                        Intent Sng14=new Intent(MainActivity.this,Sng14.class);
                        startActivity(Sng14);
                        break;
                    case 14:
                        Intent Sng15=new Intent(MainActivity.this,Sng15.class);
                        startActivity(Sng15);
                        break;
                    case 15:
                        Intent Sng16=new Intent(MainActivity.this,Sng16.class);
                        startActivity(Sng16);
                        break;
                    case 16:
                        Intent Sng17=new Intent(MainActivity.this,Sng17.class);
                        startActivity(Sng17);
                        break;
                    case 17:
                        Intent Sng18=new Intent(MainActivity.this,Sng18.class);
                        startActivity(Sng18);
                        break;
                    case 18:
                        Intent Sng19=new Intent(MainActivity.this,Sng19.class);
                        startActivity(Sng19);
                        break;
                    case 19:
                        Intent Sng20=new Intent(MainActivity.this,Sng20.class);
                        startActivity(Sng20);
                        break;
                    case 20:
                        Intent Sng21=new Intent(MainActivity.this,Sng21.class);
                        startActivity(Sng21);
                        break;
                    case 21:
                        Intent Sng22=new Intent(MainActivity.this,Sng22.class);
                        startActivity(Sng22);
                        break;
                    case 22:
                        Intent Sng23=new Intent(MainActivity.this,Sng23.class);
                        startActivity(Sng23);
                        break;
                    case 23:
                        Intent Sng24=new Intent(MainActivity.this,Sng24.class);
                        startActivity(Sng24);
                        break;
                    case 24:
                        Intent Sng25=new Intent(MainActivity.this,Sng25.class);
                        startActivity(Sng25);
                        break;
                    case 25:
                        Intent Sng26=new Intent(MainActivity.this,Sng26.class);
                        startActivity(Sng26);
                        break;
                    case 26:
                        Intent Sng27=new Intent(MainActivity.this,Sng27.class);
                        startActivity(Sng27);
                        break;
                    case 27:
                        Intent Sng28=new Intent(MainActivity.this,Sng28.class);
                        startActivity(Sng28);
                        break;
                    case 28:
                        Intent Sng29=new Intent(MainActivity.this,Sng29.class);
                        startActivity(Sng29);
                        break;
                    case 29:
                        Intent Sng30=new Intent(MainActivity.this,Sng30.class);
                        startActivity(Sng30);
                        break;
                    case 30:
                        Intent Sng31=new Intent(MainActivity.this,Sng31.class);
                        startActivity(Sng31);
                        break;
                    case 31:
                        Intent Sng32=new Intent(MainActivity.this,Sng32.class);
                        startActivity(Sng32);
                        break;
                    case 32:
                        Intent Sng33=new Intent(MainActivity.this,Sng33.class);
                        startActivity(Sng33);
                        break;
                    case 33:
                        Intent Sng34=new Intent(MainActivity.this,Sng34.class);
                        startActivity(Sng34);
                        break;
                    case 34:
                        Intent Sng35=new Intent(MainActivity.this,Sng35.class);
                        startActivity(Sng35);
                        break;
                    case 35:
                        Intent Sng36=new Intent(MainActivity.this,Sng36.class);
                        startActivity(Sng36);
                        break;
                    case 36:
                        Intent Sng37=new Intent(MainActivity.this,Sng37.class);
                        startActivity(Sng37);
                        break;
                    case 37:
                        Intent Sng38=new Intent(MainActivity.this,Sng38.class);
                        startActivity(Sng38);
                        break;
                    case 38:
                        Intent Sng39=new Intent(MainActivity.this,Sng39.class);
                        startActivity(Sng39);
                        break;
                    case 39:
                        Intent Sng40=new Intent(MainActivity.this,Sng40.class);
                        startActivity(Sng40);
                        break;
                    case 40:
                        Intent Sng41=new Intent(MainActivity.this,Sng41.class);
                        startActivity(Sng41);
                        break;
                    case 41:
                        Intent Sng42=new Intent(MainActivity.this,Sng42.class);
                        startActivity(Sng42);
                        break;
                    case 42:
                        Intent Sng43=new Intent(MainActivity.this,Sng43.class);
                        startActivity(Sng43);
                        break;
                    case 43:
                        Intent Sng44=new Intent(MainActivity.this,Sng44.class);
                        startActivity(Sng44);
                        break;
                    case 44:
                        Intent Sng45=new Intent(MainActivity.this,Sng45.class);
                        startActivity(Sng45);
                        break;
                    case 45:
                        Intent Sng46=new Intent(MainActivity.this,Sng46.class);
                        startActivity(Sng46);
                        break;
                    case 46:
                        Intent Sng47=new Intent(MainActivity.this,Sng47.class);
                        startActivity(Sng47);
                        break;
                    case 47:
                        Intent Sng48=new Intent(MainActivity.this,Sng48.class);
                        startActivity(Sng48);
                        break;
                    case 48:
                        Intent Sng49=new Intent(MainActivity.this,Sng49.class);
                        startActivity(Sng49);
                        break;
                    case 49:
                        Intent Sng50=new Intent(MainActivity.this,Sng50.class);
                        startActivity(Sng50);
                        break;
                    case 50:
                        Intent Sng51=new Intent(MainActivity.this,Sng51.class);
                        startActivity(Sng51);
                        break;
                    case 51:
                        Intent Sng52=new Intent(MainActivity.this,Sng52.class);
                        startActivity(Sng52);
                        break;
                    case 52:
                        Intent Sng53=new Intent(MainActivity.this,Sng53.class);
                        startActivity(Sng53);
                        break;
                    case 53:
                        Intent Sng54=new Intent(MainActivity.this,Sng54.class);
                        startActivity(Sng54);
                        break;
                    case 54:
                        Intent Sng55=new Intent(MainActivity.this,Sng55.class);
                        startActivity(Sng55);
                        break;
                    case 55:
                        Intent Sng56=new Intent(MainActivity.this,Sng56.class);
                        startActivity(Sng56);
                        break;
                    case 56:
                        Intent Sng57=new Intent(MainActivity.this,Sng57.class);
                        startActivity(Sng57);
                        break;
                    case 57:
                        Intent Sng58=new Intent(MainActivity.this,Sng58.class);
                        startActivity(Sng58);
                        break;


                }
            }
        });
    }


}
