package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzhhw extends androidx.browser.customtabs.e {
    private final WeakReference zza;

    public zzhhw(zzbhd zzbhdVar) {
        this.zza = new WeakReference(zzbhdVar);
    }

    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        zzbhd zzbhdVar = (zzbhd) this.zza.get();
        if (zzbhdVar != null) {
            zzbhdVar.zzc(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbhd zzbhdVar = (zzbhd) this.zza.get();
        if (zzbhdVar != null) {
            zzbhdVar.zzd();
        }
    }
}
