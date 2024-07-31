package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpb implements c.b {
    final /* synthetic */ zzceu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpb(zzbpc zzbpcVar, zzceu zzceuVar) {
        this.zza = zzceuVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ca.b bVar) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
