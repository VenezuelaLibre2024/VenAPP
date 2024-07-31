package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.w3 */
/* loaded from: classes.dex */
public final class BinderC4928w3 extends AbstractBinderC4865m0 {

    /* renamed from: a */
    final /* synthetic */ BinderC4934x3 f9873a;

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4871n0
    public final String zze() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4871n0
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4871n0
    public final void zzg(C4917u4 c4917u4) {
        zzh(c4917u4, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4871n0
    public final void zzh(C4917u4 c4917u4, int i10) {
        zzcec.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcdv.zza.post(new RunnableC4916u3(this));
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4871n0
    public final boolean zzi() {
        return false;
    }
}
