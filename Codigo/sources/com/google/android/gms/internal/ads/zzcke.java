package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcke implements Runnable {
    final /* synthetic */ zzckf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcke(zzckf zzckfVar) {
        this.zza = zzckfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
