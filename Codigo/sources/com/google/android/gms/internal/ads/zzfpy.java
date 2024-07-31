package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfpy implements Runnable {
    final /* synthetic */ zzfqd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpy(zzfqd zzfqdVar) {
        this.zza = zzfqdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfpx zzfpxVar;
        zzfpxVar = this.zza.zzl;
        zzfpxVar.zzb();
    }
}
