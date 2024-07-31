package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class l0 implements zzaqe {

    /* renamed from: a */
    final /* synthetic */ String f9008a;

    /* renamed from: b */
    final /* synthetic */ p0 f9009b;

    public l0(s0 s0Var, String str, p0 p0Var) {
        this.f9008a = str;
        this.f9009b = p0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzaqe
    public final void zza(zzaqj zzaqjVar) {
        zzcec.zzj("Failed to load URL: " + this.f9008a + "\n" + zzaqjVar.toString());
        this.f9009b.zza((Object) null);
    }
}
