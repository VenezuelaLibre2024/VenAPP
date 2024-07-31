package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import ca.C1904g;
import com.google.android.gms.common.api.C5101a;

/* renamed from: com.google.android.gms.common.internal.l0 */
/* loaded from: classes.dex */
public final class C5256l0 {

    /* renamed from: a */
    private final SparseIntArray f10714a = new SparseIntArray();

    /* renamed from: b */
    private C1904g f10715b;

    public C5256l0(C1904g c1904g) {
        C5276s.m13324j(c1904g);
        this.f10715b = c1904g;
    }

    /* renamed from: a */
    public final int m13296a(Context context, int i10) {
        return this.f10714a.get(i10, -1);
    }

    /* renamed from: b */
    public final int m13297b(Context context, C5101a.f fVar) {
        C5276s.m13324j(context);
        C5276s.m13324j(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int m13296a = m13296a(context, minApkVersion);
        if (m13296a == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f10714a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f10714a.keyAt(i11);
                if (keyAt > minApkVersion && this.f10714a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            m13296a = i10 == -1 ? this.f10715b.mo10072h(context, minApkVersion) : i10;
            this.f10714a.put(minApkVersion, m13296a);
        }
        return m13296a;
    }

    /* renamed from: c */
    public final void m13298c() {
        this.f10714a.clear();
    }
}
