package jh;

import android.graphics.Rect;

/* loaded from: classes3.dex */
public class o extends q {
    private static float e(float f10) {
        return f10 < 1.0f ? 1.0f / f10 : f10;
    }

    @Override // jh.q
    protected float c(ih.p pVar, ih.p pVar2) {
        int i10 = pVar.f17804a;
        if (i10 <= 0 || pVar.f17805b <= 0) {
            return 0.0f;
        }
        float e10 = (1.0f / e((i10 * 1.0f) / pVar2.f17804a)) / e((pVar.f17805b * 1.0f) / pVar2.f17805b);
        float e11 = e(((pVar.f17804a * 1.0f) / pVar.f17805b) / ((pVar2.f17804a * 1.0f) / pVar2.f17805b));
        return e10 * (((1.0f / e11) / e11) / e11);
    }

    @Override // jh.q
    public Rect d(ih.p pVar, ih.p pVar2) {
        return new Rect(0, 0, pVar2.f17804a, pVar2.f17805b);
    }
}
