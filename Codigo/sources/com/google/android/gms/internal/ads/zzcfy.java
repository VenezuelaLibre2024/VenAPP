package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcfy implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcfz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfy(zzcfz zzcfzVar, boolean z10) {
        this.zza = z10;
        this.zzb = zzcfzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
