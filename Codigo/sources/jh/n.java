package jh;

import android.graphics.Rect;
import android.util.Log;

/* loaded from: classes3.dex */
public class n extends q {

    /* renamed from: b, reason: collision with root package name */
    private static final String f19967b = "n";

    @Override // jh.q
    protected float c(ih.p pVar, ih.p pVar2) {
        if (pVar.f17804a <= 0 || pVar.f17805b <= 0) {
            return 0.0f;
        }
        ih.p l10 = pVar.l(pVar2);
        float f10 = (l10.f17804a * 1.0f) / pVar.f17804a;
        if (f10 > 1.0f) {
            f10 = (float) Math.pow(1.0f / f10, 1.1d);
        }
        float f11 = ((pVar2.f17804a * 1.0f) / l10.f17804a) * ((pVar2.f17805b * 1.0f) / l10.f17805b);
        return f10 * (((1.0f / f11) / f11) / f11);
    }

    @Override // jh.q
    public Rect d(ih.p pVar, ih.p pVar2) {
        ih.p l10 = pVar.l(pVar2);
        Log.i(f19967b, "Preview: " + pVar + "; Scaled: " + l10 + "; Want: " + pVar2);
        int i10 = (l10.f17804a - pVar2.f17804a) / 2;
        int i11 = (l10.f17805b - pVar2.f17805b) / 2;
        return new Rect(-i10, -i11, l10.f17804a - i10, l10.f17805b - i11);
    }
}
