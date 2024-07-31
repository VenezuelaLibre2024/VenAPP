package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.f2;

/* loaded from: classes2.dex */
final class zzfgb implements n9.a {
    final /* synthetic */ f2 zza;
    final /* synthetic */ zzfgd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgb(zzfgd zzfgdVar, f2 f2Var) {
        this.zza = f2Var;
        this.zzb = zzfgdVar;
    }

    @Override // n9.a
    public final void onAdMetadataChanged() {
        zzdso zzdsoVar;
        zzdsoVar = this.zzb.zzi;
        if (zzdsoVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
