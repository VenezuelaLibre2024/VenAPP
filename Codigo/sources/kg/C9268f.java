package kg;

import p066dg.C6952m;

/* renamed from: kg.f */
/* loaded from: classes2.dex */
public final class C9268f extends AbstractC9274l {
    @Override // kg.AbstractC9274l
    /* renamed from: c */
    public C9264b mo27639c(C9264b c9264b, int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return mo27640d(c9264b, i10, i11, C9277o.m27678b(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25));
    }

    @Override // kg.AbstractC9274l
    /* renamed from: d */
    public C9264b mo27640d(C9264b c9264b, int i10, int i11, C9277o c9277o) {
        if (i10 <= 0 || i11 <= 0) {
            throw C6952m.m20106a();
        }
        C9264b c9264b2 = new C9264b(i10, i11);
        int i12 = i10 * 2;
        float[] fArr = new float[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            float f10 = i13 + 0.5f;
            for (int i14 = 0; i14 < i12; i14 += 2) {
                fArr[i14] = (i14 / 2) + 0.5f;
                fArr[i14 + 1] = f10;
            }
            c9277o.m27683f(fArr);
            AbstractC9274l.m27661a(c9264b, fArr);
            for (int i15 = 0; i15 < i12; i15 += 2) {
                try {
                    if (c9264b.m27603g((int) fArr[i15], (int) fArr[i15 + 1])) {
                        c9264b2.m27612r(i15 / 2, i13);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C6952m.m20106a();
                }
            }
        }
        return c9264b2;
    }
}
