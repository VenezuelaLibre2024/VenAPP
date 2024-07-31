package com.google.android.gms.ads.internal.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b0 f8939a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b0 b0Var) {
        this.f8939a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8939a.zzb = Thread.currentThread();
        this.f8939a.zza();
    }
}
