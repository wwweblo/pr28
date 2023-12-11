package com.example.pr28

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sunImageView: ImageView = findViewById(R.id.sun)
        // Анимация для восхода солнца
        val sunRiseAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.sun_rise)
        // Подключаем анимацию к нужному View
        sunImageView.startAnimation(sunRiseAnimation)
        // Получим ссылку на часы
        val clockImageView: ImageView = findViewById(R.id.clock)
        // анимация для вращения часов
        val clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn)
        clockImageView.startAnimation(clockTurnAnimation)
        // получим ссылку на часовую стрелку
        val hourImageView: ImageView = findViewById(R.id.hour_hand)
        // анимация для стрелки
        val hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn)
        // присоединяем анимацию
        hourImageView.startAnimation(hourTurnAnimation)
    }
}