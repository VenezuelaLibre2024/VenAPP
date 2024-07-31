package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f8976a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f8977b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f8978c = new ArrayList();

    public final h0 a(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.f8976a.size()) {
            double doubleValue = ((Double) this.f8978c.get(i10)).doubleValue();
            double doubleValue2 = ((Double) this.f8977b.get(i10)).doubleValue();
            if (d10 < doubleValue || (doubleValue == d10 && d11 < doubleValue2)) {
                break;
            }
            i10++;
        }
        this.f8976a.add(i10, str);
        this.f8978c.add(i10, Double.valueOf(d10));
        this.f8977b.add(i10, Double.valueOf(d11));
        return this;
    }

    public final j0 b() {
        return new j0(this, null);
    }
}
