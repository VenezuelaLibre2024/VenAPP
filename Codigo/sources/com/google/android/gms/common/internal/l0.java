package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f9599a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private ca.g f9600b;

    public l0(ca.g gVar) {
        s.j(gVar);
        this.f9600b = gVar;
    }

    public final int a(Context context, int i10) {
        return this.f9599a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        s.j(context);
        s.j(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int a10 = a(context, minApkVersion);
        if (a10 == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f9599a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f9599a.keyAt(i11);
                if (keyAt > minApkVersion && this.f9599a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            a10 = i10 == -1 ? this.f9600b.h(context, minApkVersion) : i10;
            this.f9599a.put(minApkVersion, a10);
        }
        return a10;
    }

    public final void c() {
        this.f9599a.clear();
    }
}
