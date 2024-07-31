package ua;

/* renamed from: ua.h */
/* loaded from: classes2.dex */
public final class C11490h extends C11484e {

    /* renamed from: e */
    public final C11478b f29833e;

    /* renamed from: f */
    public final float f29834f;

    public C11490h(C11478b c11478b) {
        this(c11478b, 10.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C11490h(ua.C11478b r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "bitmapDescriptor must not be null"
            java.lang.Object r0 = com.google.android.gms.common.internal.C5276s.m13325k(r3, r0)
            ua.b r0 = (ua.C11478b) r0
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L15
            r2.<init>(r0, r4)
            r2.f29833e = r3
            r2.f29834f = r4
            return
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "refWidth must be positive"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C11490h.<init>(ua.b, float):void");
    }

    @Override // ua.C11484e
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.f29833e) + " refWidth=" + this.f29834f + "]";
    }
}
