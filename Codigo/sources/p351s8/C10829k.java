package p351s8;

import java.io.IOException;

/* renamed from: s8.k */
/* loaded from: classes.dex */
public class C10829k extends IOException {

    /* renamed from: a */
    public final int f27384a;

    public C10829k(int i10) {
        this.f27384a = i10;
    }

    public C10829k(String str, int i10) {
        super(str);
        this.f27384a = i10;
    }

    public C10829k(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f27384a = i10;
    }

    public C10829k(Throwable th2, int i10) {
        super(th2);
        this.f27384a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r2 = r2;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m33003a(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof p351s8.C10829k
            if (r0 == 0) goto L11
            r0 = r2
            s8.k r0 = (p351s8.C10829k) r0
            int r0 = r0.f27384a
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L11
            r2 = 1
            return r2
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p351s8.C10829k.m33003a(java.io.IOException):boolean");
    }
}
