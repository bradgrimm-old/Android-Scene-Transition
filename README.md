Android-Scene-Transition
========================

This is attempt to backport Android's scene transition library into a support package.

It is mostly working, but cannot be fully ported due to two missing features:

1) Missing suppressLayout

ViewGroup has a hidden method called suppressLayout.  I attempted to extend a RelativeLayout and add this method.  But it requires overriding the layout method which is final for all ViewGroups.

2) Missing setTransitionAlpha

View's have a new method as well setTransitionAlpha.  This composites the view's alpha with the transition alpha.

I removed the code that calls those methods, and I was able to get a couple of simple layout changes working, but your mileage may vary as I'm not 100% clear on the side effects of the above missing features.