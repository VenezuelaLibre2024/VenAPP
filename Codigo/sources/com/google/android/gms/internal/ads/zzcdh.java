package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdh extends b0 {
    final /* synthetic */ zzcdl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdh(zzcdl zzcdlVar) {
        this.zza = zzcdlVar;
    }

    @Override // com.google.android.gms.ads.internal.util.b0
    public final void zza() {
        Context context;
        zzcei zzceiVar;
        Object obj;
        zzbgk zzbgkVar;
        zzcdl zzcdlVar = this.zza;
        context = zzcdlVar.zze;
        zzceiVar = zzcdlVar.zzf;
        zzbgi zzbgiVar = new zzbgi(context, zzceiVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                t.g();
                zzbgkVar = this.zza.zzh;
                zzbgl.zza(zzbgkVar, zzbgiVar);
            } catch (IllegalArgumentException e10) {
                zzcec.zzk("Cannot config CSI reporter.", e10);
            }
        }
    }
}
