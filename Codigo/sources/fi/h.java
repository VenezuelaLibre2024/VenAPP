package fi;

import android.view.MotionEvent;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private float f15236a;

    /* renamed from: b, reason: collision with root package name */
    private float f15237b;

    /* renamed from: c, reason: collision with root package name */
    private float f15238c;

    /* renamed from: d, reason: collision with root package name */
    private float f15239d;

    /* renamed from: e, reason: collision with root package name */
    private int f15240e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f15241f = -1;

    /* renamed from: g, reason: collision with root package name */
    private float f15242g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15243h;

    /* renamed from: i, reason: collision with root package name */
    private a f15244i;

    /* loaded from: classes3.dex */
    public interface a {
        boolean a(h hVar);
    }

    /* loaded from: classes3.dex */
    public static class b implements a {
    }

    public h(a aVar) {
        this.f15244i = aVar;
    }

    private float a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return b((float) Math.toDegrees((float) Math.atan2(f11 - f13, f10 - f12)), (float) Math.toDegrees((float) Math.atan2(f15 - f17, f14 - f16)));
    }

    private float b(float f10, float f11) {
        float f12;
        float f13 = (f11 % 360.0f) - (f10 % 360.0f);
        this.f15242g = f13;
        if (f13 >= -180.0f) {
            if (f13 > 180.0f) {
                f12 = f13 - 360.0f;
            }
            return this.f15242g;
        }
        f12 = f13 + 360.0f;
        this.f15242g = f12;
        return this.f15242g;
    }

    public float c() {
        return this.f15242g;
    }

    public boolean d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f15240e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f15236a = motionEvent.getX();
                    this.f15237b = motionEvent.getY();
                    this.f15241f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                } else if (actionMasked == 6) {
                    this.f15241f = -1;
                }
            } else if (this.f15240e != -1 && this.f15241f != -1 && motionEvent.getPointerCount() > this.f15241f) {
                float x10 = motionEvent.getX(this.f15240e);
                float y10 = motionEvent.getY(this.f15240e);
                float x11 = motionEvent.getX(this.f15241f);
                float y11 = motionEvent.getY(this.f15241f);
                if (this.f15243h) {
                    this.f15242g = 0.0f;
                    this.f15243h = false;
                } else {
                    a(this.f15236a, this.f15237b, this.f15238c, this.f15239d, x11, y11, x10, y10);
                }
                a aVar = this.f15244i;
                if (aVar != null) {
                    aVar.a(this);
                }
                this.f15236a = x11;
                this.f15237b = y11;
                this.f15238c = x10;
                this.f15239d = y10;
            }
            return true;
        }
        this.f15238c = motionEvent.getX();
        this.f15239d = motionEvent.getY();
        this.f15240e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        this.f15242g = 0.0f;
        this.f15243h = true;
        return true;
    }
}
