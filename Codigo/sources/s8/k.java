package s8;

import java.io.IOException;

/* loaded from: classes.dex */
public class k extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f25265a;

    public k(int i10) {
        this.f25265a = i10;
    }

    public k(String str, int i10) {
        super(str);
        this.f25265a = i10;
    }

    public k(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f25265a = i10;
    }

    public k(Throwable th2, int i10) {
        super(th2);
        this.f25265a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof s8.k
            if (r0 == 0) goto L11
            r0 = r2
            s8.k r0 = (s8.k) r0
            int r0 = r0.f25265a
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
        throw new UnsupportedOperationException("Method not decompiled: s8.k.a(java.io.IOException):boolean");
    }
}
