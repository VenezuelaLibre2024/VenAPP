package v8;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import v8.d;

/* loaded from: classes.dex */
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f28651c;

    /* renamed from: d, reason: collision with root package name */
    private final float f28652d;

    /* renamed from: e, reason: collision with root package name */
    private final GestureDetector f28653e;

    /* renamed from: a, reason: collision with root package name */
    private final PointF f28649a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    private final PointF f28650b = new PointF();

    /* renamed from: f, reason: collision with root package name */
    private volatile float f28654f = 3.1415927f;

    /* loaded from: classes.dex */
    public interface a {
        void b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public m(Context context, a aVar, float f10) {
        this.f28651c = aVar;
        this.f28652d = f10;
        this.f28653e = new GestureDetector(context, this);
    }

    @Override // v8.d.a
    public void a(float[] fArr, float f10) {
        this.f28654f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f28649a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f28649a.x) / this.f28652d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f28649a;
        float f12 = (y10 - pointF.y) / this.f28652d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f28654f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f28650b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f28651c.b(this.f28650b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f28651c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f28653e.onTouchEvent(motionEvent);
    }
}
