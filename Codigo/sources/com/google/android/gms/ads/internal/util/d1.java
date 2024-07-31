package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzceh;

/* loaded from: classes.dex */
public final class d1 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    private final zzceh f8956a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8957b;

    public d1(Context context, String str, String str2) {
        this.f8956a = new zzceh(com.google.android.gms.ads.internal.t.r().E(context, str));
        this.f8957b = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.b0
    public final void zza() {
        this.f8956a.zza(this.f8957b);
    }
}
