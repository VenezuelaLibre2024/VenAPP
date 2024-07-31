package p307q8;

import p361t6.C11048i4;
import p361t6.C11100s3;
import p363t8.C11172r0;

/* renamed from: q8.b0 */
/* loaded from: classes.dex */
public final class C10296b0 {

    /* renamed from: a */
    public final int f25594a;

    /* renamed from: b */
    public final C11100s3[] f25595b;

    /* renamed from: c */
    public final InterfaceC10312r[] f25596c;

    /* renamed from: d */
    public final C11048i4 f25597d;

    /* renamed from: e */
    public final Object f25598e;

    public C10296b0(C11100s3[] c11100s3Arr, InterfaceC10312r[] interfaceC10312rArr, C11048i4 c11048i4, Object obj) {
        this.f25595b = c11100s3Arr;
        this.f25596c = (InterfaceC10312r[]) interfaceC10312rArr.clone();
        this.f25597d = c11048i4;
        this.f25598e = obj;
        this.f25594a = c11100s3Arr.length;
    }

    /* renamed from: a */
    public boolean m30876a(C10296b0 c10296b0) {
        if (c10296b0 == null || c10296b0.f25596c.length != this.f25596c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f25596c.length; i10++) {
            if (!m30877b(c10296b0, i10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean m30877b(C10296b0 c10296b0, int i10) {
        return c10296b0 != null && C11172r0.m34914c(this.f25595b[i10], c10296b0.f25595b[i10]) && C11172r0.m34914c(this.f25596c[i10], c10296b0.f25596c[i10]);
    }

    /* renamed from: c */
    public boolean m30878c(int i10) {
        return this.f25595b[i10] != null;
    }
}
