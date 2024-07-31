package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.y0;

/* loaded from: classes2.dex */
final class zzfgi implements n9.a {
    final /* synthetic */ y0 zza;
    final /* synthetic */ zzfgj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgi(zzfgj zzfgjVar, y0 y0Var) {
        this.zza = y0Var;
        this.zzb = zzfgjVar;
    }

    @Override // n9.a
    public final void onAdMetadataChanged() {
        zzdso zzdsoVar;
        zzdsoVar = this.zzb.zzd;
        if (zzdsoVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
