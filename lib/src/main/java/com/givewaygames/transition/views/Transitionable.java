package com.givewaygames.transition.views;

public interface Transitionable {
    void suppressLayout(boolean suppress);

    void setTransitionAlpha(float alpha);

    float getTransitionAlpha();
}
