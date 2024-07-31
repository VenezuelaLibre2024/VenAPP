package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
final class zzchn implements Runnable {
    final /* synthetic */ zzcho zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchn(zzcho zzchoVar) {
        this.zza = zzchoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.A().zzc(this.zza);
    }
}
