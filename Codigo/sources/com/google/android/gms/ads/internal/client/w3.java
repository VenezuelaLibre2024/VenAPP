package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w3 extends m0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x3 f8786a;

    @Override // com.google.android.gms.ads.internal.client.n0
    public final String zze() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final void zzg(u4 u4Var) {
        zzh(u4Var, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final void zzh(u4 u4Var, int i10) {
        zzcec.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcdv.zza.post(new u3(this));
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final boolean zzi() {
        return false;
    }
}
