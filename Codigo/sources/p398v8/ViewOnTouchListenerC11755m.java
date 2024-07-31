package p398v8;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p398v8.C11746d;

/* renamed from: v8.m */
/* loaded from: classes.dex */
final class ViewOnTouchListenerC11755m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C11746d.a {

    /* renamed from: c */
    private final a f31085c;

    /* renamed from: d */
    private final float f31086d;

    /* renamed from: e */
    private final GestureDetector f31087e;

    /* renamed from: a */
    private final PointF f31083a = new PointF();

    /* renamed from: b */
    private final PointF f31084b = new PointF();

    /* renamed from: f */
    private volatile float f31088f = 3.1415927f;

    /* renamed from: v8.m$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: b */
        void mo37166b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public ViewOnTouchListenerC11755m(Context context, a aVar, float f10) {
        this.f31085c = aVar;
        this.f31086d = f10;
        this.f31087e = new GestureDetector(context, this);
    }

    @Override // p398v8.C11746d.a
    /* renamed from: a */
    public void mo37128a(float[] fArr, float f10) {
        this.f31088f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f31083a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f31083a.x) / this.f31086d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f31083a;
        float f12 = (y10 - pointF.y) / this.f31086d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f31088f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f31084b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f31085c.mo37166b(this.f31084b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f31085c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f31087e.onTouchEvent(motionEvent);
    }
}
