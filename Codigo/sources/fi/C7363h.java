package fi;

import android.view.MotionEvent;

/* renamed from: fi.h */
/* loaded from: classes3.dex */
public class C7363h {

    /* renamed from: a */
    private float f16659a;

    /* renamed from: b */
    private float f16660b;

    /* renamed from: c */
    private float f16661c;

    /* renamed from: d */
    private float f16662d;

    /* renamed from: e */
    private int f16663e = -1;

    /* renamed from: f */
    private int f16664f = -1;

    /* renamed from: g */
    private float f16665g;

    /* renamed from: h */
    private boolean f16666h;

    /* renamed from: i */
    private a f16667i;

    /* renamed from: fi.h$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        boolean mo19624a(C7363h c7363h);
    }

    /* renamed from: fi.h$b */
    /* loaded from: classes3.dex */
    public static class b implements a {
    }

    public C7363h(a aVar) {
        this.f16667i = aVar;
    }

    /* renamed from: a */
    private float m22228a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return m22229b((float) Math.toDegrees((float) Math.atan2(f11 - f13, f10 - f12)), (float) Math.toDegrees((float) Math.atan2(f15 - f17, f14 - f16)));
    }

    /* renamed from: b */
    private float m22229b(float f10, float f11) {
        float f12;
        float f13 = (f11 % 360.0f) - (f10 % 360.0f);
        this.f16665g = f13;
        if (f13 >= -180.0f) {
            if (f13 > 180.0f) {
                f12 = f13 - 360.0f;
            }
            return this.f16665g;
        }
        f12 = f13 + 360.0f;
        this.f16665g = f12;
        return this.f16665g;
    }

    /* renamed from: c */
    public float m22230c() {
        return this.f16665g;
    }

    /* renamed from: d */
    public boolean m22231d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f16663e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f16659a = motionEvent.getX();
                    this.f16660b = motionEvent.getY();
                    this.f16664f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                } else if (actionMasked == 6) {
                    this.f16664f = -1;
                }
            } else if (this.f16663e != -1 && this.f16664f != -1 && motionEvent.getPointerCount() > this.f16664f) {
                float x10 = motionEvent.getX(this.f16663e);
                float y10 = motionEvent.getY(this.f16663e);
                float x11 = motionEvent.getX(this.f16664f);
                float y11 = motionEvent.getY(this.f16664f);
                if (this.f16666h) {
                    this.f16665g = 0.0f;
                    this.f16666h = false;
                } else {
                    m22228a(this.f16659a, this.f16660b, this.f16661c, this.f16662d, x11, y11, x10, y10);
                }
                a aVar = this.f16667i;
                if (aVar != null) {
                    aVar.mo19624a(this);
                }
                this.f16659a = x11;
                this.f16660b = y11;
                this.f16661c = x10;
                this.f16662d = y10;
            }
            return true;
        }
        this.f16661c = motionEvent.getX();
        this.f16662d = motionEvent.getY();
        this.f16663e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        this.f16665g = 0.0f;
        this.f16666h = true;
        return true;
    }
}
