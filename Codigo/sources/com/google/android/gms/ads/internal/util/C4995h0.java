package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.util.h0 */
/* loaded from: classes.dex */
public final class C4995h0 {

    /* renamed from: a */
    private final List f10075a = new ArrayList();

    /* renamed from: b */
    private final List f10076b = new ArrayList();

    /* renamed from: c */
    private final List f10077c = new ArrayList();

    /* renamed from: a */
    public final C4995h0 m12635a(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.f10075a.size()) {
            double doubleValue = ((Double) this.f10077c.get(i10)).doubleValue();
            double doubleValue2 = ((Double) this.f10076b.get(i10)).doubleValue();
            if (d10 < doubleValue || (doubleValue == d10 && d11 < doubleValue2)) {
                break;
            }
            i10++;
        }
        this.f10075a.add(i10, str);
        this.f10077c.add(i10, Double.valueOf(d10));
        this.f10076b.add(i10, Double.valueOf(d11));
        return this;
    }

    /* renamed from: b */
    public final C5003j0 m12636b() {
        return new C5003j0(this, null);
    }
}
