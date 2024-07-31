package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcfx implements Runnable {
    final /* synthetic */ zzcfz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfx(zzcfz zzcfzVar) {
        this.zza = zzcfzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
