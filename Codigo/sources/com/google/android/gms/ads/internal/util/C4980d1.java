package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.internal.ads.zzceh;

/* renamed from: com.google.android.gms.ads.internal.util.d1 */
/* loaded from: classes.dex */
public final class C4980d1 extends AbstractC4971b0 {

    /* renamed from: a */
    private final zzceh f10055a;

    /* renamed from: b */
    private final String f10056b;

    public C4980d1(Context context, String str, String str2) {
        this.f10055a = new zzceh(C4965t.m12581r().m12689E(context, str));
        this.f10056b = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC4971b0
    public final void zza() {
        this.f10055a.zza(this.f10056b);
    }
}
