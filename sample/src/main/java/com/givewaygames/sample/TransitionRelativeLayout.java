package com.givewaygames.sample;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.givewaygames.transition.views.Transitionable;

public class TransitionRelativeLayout extends View implements Transitionable {

    private LayoutTransition mTransition;

    boolean mSuppressLayout = false;

    ViewGroup viewGroup;

    public TransitionRelativeLayout(Context context) {
        super(context);
    }

    public TransitionRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TransitionRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void suppressLayout(boolean suppress) {

    }

    @Override
    public void setTransitionAlpha(float alpha) {

    }

    @Override
    public float getTransitionAlpha() {
        return 1;
    }

//    public final void layout(int l, int t, int r, int b) {
//        if (!mSuppressLayout && (mTransition == null || !mTransition.isChangingLayout())) {
//            if (mTransition != null) {
//                mTransition.layoutChange(this);
//            }
//            super.layout(l, t, r, b);
//        } else {
//            // record the fact that we noop'd it; request layout when transition finishes
//            mLayoutCalledWhileSuppressed = true;
//        }
//    }
}
