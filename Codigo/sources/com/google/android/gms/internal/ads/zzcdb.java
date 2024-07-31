package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdb implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzceu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdb(zzcdc zzcdcVar, Context context, zzceu zzceuVar) {
        this.zza = context;
        this.zzb = zzceuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(c9.a.a(this.zza));
        } catch (ca.h | ca.i | IOException | IllegalStateException e10) {
            this.zzb.zzd(e10);
            zzcec.zzh("Exception while getting advertising Id info", e10);
        }
    }
}
