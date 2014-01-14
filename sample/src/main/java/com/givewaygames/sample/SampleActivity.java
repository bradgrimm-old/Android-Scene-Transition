package com.givewaygames.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.givewaygames.transition.Scene;
import com.givewaygames.transition.Transition;
import com.givewaygames.transition.TransitionInflater;
import com.givewaygames.transition.TransitionManager;

public class SampleActivity extends Activity {

    Scene scene;
    Scene scene2;
    Transition transition;
    Transition transition2;

    int idx = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sample);

        initScenes((ViewGroup) findViewById(R.id.root));
    }

    private void initScenes(ViewGroup root) {
        scene = Scene.getSceneForLayout(root, R.layout.sample, this);
        scene2 = Scene.getSceneForLayout(root, R.layout.sample2, this);

        transition = TransitionInflater.from(this).inflateTransition(R.transition.sample);
        transition2 = TransitionInflater.from(this).inflateTransition(R.transition.sample2);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if (idx++ % 2 == 0) {
            TransitionManager.go(scene2, transition);
        } else {
            TransitionManager.go(scene, transition2);
        }
    }
}
