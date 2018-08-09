package com.shahzaib.scenestransition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    Scene scene_one, scene_two;
    ViewGroup scene_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // load scenes
        scene_container = findViewById(R.id.scene_container);
        scene_one = Scene.getSceneForLayout(scene_container, R.layout.scene_one, this);
        scene_two = Scene.getSceneForLayout(scene_container, R.layout.scene_two, this);
    }

    public void goToSceneOne(View view) {
        Transition transition = TransitionInflater.from(this)
                .inflateTransition(R.transition.scene_one_to_scene_two_transition);
        TransitionManager.go(scene_one, transition);
    }

    public void goToSceneTwo(View view) {
        Transition transition = TransitionInflater.from(this)
                .inflateTransition(R.transition.scene_one_to_scene_two_transition);
        TransitionManager.go(scene_two, transition);

    }

}
