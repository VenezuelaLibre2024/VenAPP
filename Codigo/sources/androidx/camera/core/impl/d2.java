package androidx.camera.core.impl;

import android.util.Size;

/* loaded from: classes.dex */
public abstract class d2 {

    /* loaded from: classes.dex */
    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        a(int i10) {
            this.mId = i10;
        }

        int h() {
            return this.mId;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public static d2 a(b bVar, a aVar) {
        return new i(bVar, aVar, 0L);
    }

    public static d2 b(b bVar, a aVar, long j10) {
        return new i(bVar, aVar, j10);
    }

    public static b e(int i10) {
        return i10 == 35 ? b.YUV : i10 == 256 ? b.JPEG : i10 == 32 ? b.RAW : b.PRIV;
    }

    public static d2 h(int i10, int i11, Size size, e2 e2Var) {
        b e10 = e(i11);
        a aVar = a.NOT_SUPPORT;
        int a10 = f0.d.a(size);
        if (i10 == 1) {
            if (a10 <= f0.d.a(e2Var.i(i11))) {
                aVar = a.s720p;
            } else if (a10 <= f0.d.a(e2Var.g(i11))) {
                aVar = a.s1440p;
            }
        } else if (a10 <= f0.d.a(e2Var.b())) {
            aVar = a.VGA;
        } else if (a10 <= f0.d.a(e2Var.e())) {
            aVar = a.PREVIEW;
        } else if (a10 <= f0.d.a(e2Var.f())) {
            aVar = a.RECORD;
        } else if (a10 <= f0.d.a(e2Var.c(i11))) {
            aVar = a.MAXIMUM;
        } else {
            Size k10 = e2Var.k(i11);
            if (k10 != null && a10 <= f0.d.a(k10)) {
                aVar = a.ULTRA_MAXIMUM;
            }
        }
        return a(e10, aVar);
    }

    public abstract a c();

    public abstract b d();

    public abstract long f();

    public final boolean g(d2 d2Var) {
        return d2Var.c().h() <= c().h() && d2Var.d() == d();
    }
}
