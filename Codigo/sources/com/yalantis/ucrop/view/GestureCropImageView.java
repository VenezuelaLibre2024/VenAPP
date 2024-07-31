package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import fi.h;

/* loaded from: classes3.dex */
public class GestureCropImageView extends com.yalantis.ucrop.view.a {
    private ScaleGestureDetector R;
    private h S;
    private GestureDetector T;
    private float U;
    private float V;
    private boolean W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f13596a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f13597b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f13598c0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.D(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            GestureCropImageView.this.o(-f10, -f11);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c extends h.b {
        private c() {
        }

        @Override // fi.h.a
        public boolean a(h hVar) {
            GestureCropImageView.this.m(hVar.c(), GestureCropImageView.this.U, GestureCropImageView.this.V);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.n(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.U, GestureCropImageView.this.V);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.W = true;
        this.f13596a0 = true;
        this.f13597b0 = true;
        this.f13598c0 = 5;
    }

    private void K() {
        this.T = new GestureDetector(getContext(), new b(), null, true);
        this.R = new ScaleGestureDetector(getContext(), new d());
        this.S = new h(new c());
    }

    public int getDoubleTapScaleSteps() {
        return this.f13598c0;
    }

    protected float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.f13598c0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yalantis.ucrop.view.b
    public void k() {
        super.k();
        K();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            v();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.U = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.V = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        if (this.f13597b0) {
            this.T.onTouchEvent(motionEvent);
        }
        if (this.f13596a0) {
            this.R.onTouchEvent(motionEvent);
        }
        if (this.W) {
            this.S.d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            B();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i10) {
        this.f13598c0 = i10;
    }

    public void setGestureEnabled(boolean z10) {
        this.f13597b0 = z10;
    }

    public void setRotateEnabled(boolean z10) {
        this.W = z10;
    }

    public void setScaleEnabled(boolean z10) {
        this.f13596a0 = z10;
    }
}
