package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import g9.v;

/* loaded from: classes2.dex */
final class zzbvj implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbvk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvj(zzbvk zzbvkVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        t.k();
        activity = this.zzb.zza;
        v.a(activity, this.zza, true);
    }
}
