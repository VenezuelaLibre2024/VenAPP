package ua;

/* loaded from: classes2.dex */
public final class h extends e {

    /* renamed from: e, reason: collision with root package name */
    public final b f27517e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27518f;

    public h(b bVar) {
        this(bVar, 10.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(ua.b r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "bitmapDescriptor must not be null"
            java.lang.Object r0 = com.google.android.gms.common.internal.s.k(r3, r0)
            ua.b r0 = (ua.b) r0
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L15
            r2.<init>(r0, r4)
            r2.f27517e = r3
            r2.f27518f = r4
            return
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "refWidth must be positive"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.h.<init>(ua.b, float):void");
    }

    @Override // ua.e
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.f27517e) + " refWidth=" + this.f27518f + "]";
    }
}
