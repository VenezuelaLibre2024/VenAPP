package p283p0;

import android.view.View;
import p209l0.AbstractC9342f;
import p209l0.C9339c;

/* renamed from: p0.d */
/* loaded from: classes.dex */
public abstract class AbstractC10033d extends AbstractC9342f {

    /* renamed from: p0.d$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC10033d {
        @Override // p283p0.AbstractC10033d
        /* renamed from: b */
        public boolean mo29944b(View view, float f10, long j10, C9339c c9339c) {
            return this.f22621h;
        }

        /* renamed from: c */
        public boolean m29945c(View view, C9339c c9339c, float f10, long j10, double d10, double d11) {
            view.setRotation(m29943a(f10, j10, view, c9339c) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f22621h;
        }
    }

    /* renamed from: a */
    public float m29943a(float f10, long j10, View view, C9339c c9339c) {
        this.f22614a.m27826c(f10, this.f22620g);
        float[] fArr = this.f22620g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f22621h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f22623j)) {
            throw null;
        }
        this.f22623j = (float) ((this.f22623j + (((j10 - this.f22622i) * 1.0E-9d) * f11)) % 1.0d);
        throw null;
    }

    /* renamed from: b */
    public abstract boolean mo29944b(View view, float f10, long j10, C9339c c9339c);
}
