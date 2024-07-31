package p184jh;

import android.graphics.Rect;
import p163ih.C7999p;

/* renamed from: jh.o */
/* loaded from: classes3.dex */
public class C9064o extends AbstractC9066q {
    /* renamed from: e */
    private static float m26666e(float f10) {
        return f10 < 1.0f ? 1.0f / f10 : f10;
    }

    @Override // p184jh.AbstractC9066q
    /* renamed from: c */
    protected float mo26659c(C7999p c7999p, C7999p c7999p2) {
        int i10 = c7999p.f19467a;
        if (i10 <= 0 || c7999p.f19468b <= 0) {
            return 0.0f;
        }
        float m26666e = (1.0f / m26666e((i10 * 1.0f) / c7999p2.f19467a)) / m26666e((c7999p.f19468b * 1.0f) / c7999p2.f19468b);
        float m26666e2 = m26666e(((c7999p.f19467a * 1.0f) / c7999p.f19468b) / ((c7999p2.f19467a * 1.0f) / c7999p2.f19468b));
        return m26666e * (((1.0f / m26666e2) / m26666e2) / m26666e2);
    }

    @Override // p184jh.AbstractC9066q
    /* renamed from: d */
    public Rect mo26660d(C7999p c7999p, C7999p c7999p2) {
        return new Rect(0, 0, c7999p2.f19467a, c7999p2.f19468b);
    }
}
