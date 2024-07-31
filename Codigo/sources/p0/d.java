package p0;

import android.view.View;
import l0.f;

/* loaded from: classes.dex */
public abstract class d extends f {

    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // p0.d
        public boolean b(View view, float f10, long j10, l0.c cVar) {
            return this.f20799h;
        }

        public boolean c(View view, l0.c cVar, float f10, long j10, double d10, double d11) {
            view.setRotation(a(f10, j10, view, cVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f20799h;
        }
    }

    public float a(float f10, long j10, View view, l0.c cVar) {
        this.f20792a.c(f10, this.f20798g);
        float[] fArr = this.f20798g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f20799h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f20801j)) {
            throw null;
        }
        this.f20801j = (float) ((this.f20801j + (((j10 - this.f20800i) * 1.0E-9d) * f11)) % 1.0d);
        throw null;
    }

    public abstract boolean b(View view, float f10, long j10, l0.c cVar);
}
