package com.google.android.gms.internal.appset;

import la.i;

/* loaded from: classes2.dex */
final class zzj implements Runnable {
    final /* synthetic */ zzl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzj(zzl zzlVar, zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long zza = this.zza.zza();
        if (zza == -1 || i.d().a() <= zza) {
            return;
        }
        zzl.zze(zzl.zzb(this.zza));
    }
}
