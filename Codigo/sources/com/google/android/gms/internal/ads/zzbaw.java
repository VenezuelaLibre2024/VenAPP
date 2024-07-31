package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbaw implements c.b {
    final /* synthetic */ zzbax zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbaw(zzbax zzbaxVar) {
        this.zza = zzbaxVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ca.b bVar) {
        Object obj;
        zzbba zzbbaVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzbax zzbaxVar = this.zza;
            zzbbaVar = zzbaxVar.zzd;
            if (zzbbaVar != null) {
                zzbaxVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
