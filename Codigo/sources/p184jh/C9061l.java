package p184jh;

import android.graphics.Rect;
import android.util.Log;
import p163ih.C7999p;

/* renamed from: jh.l */
/* loaded from: classes3.dex */
public class C9061l extends AbstractC9066q {

    /* renamed from: b */
    private static final String f21741b = "l";

    @Override // p184jh.AbstractC9066q
    /* renamed from: c */
    protected float mo26659c(C7999p c7999p, C7999p c7999p2) {
        if (c7999p.f19467a <= 0 || c7999p.f19468b <= 0) {
            return 0.0f;
        }
        C7999p m24570i = c7999p.m24570i(c7999p2);
        float f10 = (m24570i.f19467a * 1.0f) / c7999p.f19467a;
        if (f10 > 1.0f) {
            f10 = (float) Math.pow(1.0f / f10, 1.1d);
        }
        float f11 = ((m24570i.f19467a * 1.0f) / c7999p2.f19467a) + ((m24570i.f19468b * 1.0f) / c7999p2.f19468b);
        return f10 * ((1.0f / f11) / f11);
    }

    @Override // p184jh.AbstractC9066q
    /* renamed from: d */
    public Rect mo26660d(C7999p c7999p, C7999p c7999p2) {
        C7999p m24570i = c7999p.m24570i(c7999p2);
        Log.i(f21741b, "Preview: " + c7999p + "; Scaled: " + m24570i + "; Want: " + c7999p2);
        int i10 = (m24570i.f19467a - c7999p2.f19467a) / 2;
        int i11 = (m24570i.f19468b - c7999p2.f19468b) / 2;
        return new Rect(-i10, -i11, m24570i.f19467a - i10, m24570i.f19468b - i11);
    }
}
