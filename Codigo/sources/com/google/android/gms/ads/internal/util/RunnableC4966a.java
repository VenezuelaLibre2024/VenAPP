package com.google.android.gms.ads.internal.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.util.a */
/* loaded from: classes.dex */
public final class RunnableC4966a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC4971b0 f10038a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4966a(AbstractC4971b0 abstractC4971b0) {
        this.f10038a = abstractC4971b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10038a.zzb = Thread.currentThread();
        this.f10038a.zza();
    }
}
