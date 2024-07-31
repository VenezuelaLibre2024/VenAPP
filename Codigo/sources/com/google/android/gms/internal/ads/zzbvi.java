package com.google.android.gms.internal.ads;

import g9.w;
import i9.s;

/* loaded from: classes2.dex */
final class zzbvi implements w {
    final /* synthetic */ zzbvk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvi(zzbvk zzbvkVar) {
        this.zza = zzbvkVar;
    }

    @Override // g9.w
    public final void zzbA() {
        s sVar;
        zzcec.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbvk zzbvkVar = this.zza;
        sVar = zzbvkVar.zzb;
        sVar.onAdOpened(zzbvkVar);
    }

    @Override // g9.w
    public final void zzbC() {
    }

    @Override // g9.w
    public final void zzbD(int i10) {
        s sVar;
        zzcec.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbvk zzbvkVar = this.zza;
        sVar = zzbvkVar.zzb;
        sVar.onAdClosed(zzbvkVar);
    }

    @Override // g9.w
    public final void zzbP() {
        zzcec.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // g9.w
    public final void zzbt() {
        zzcec.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // g9.w
    public final void zzbz() {
        zzcec.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }
}
