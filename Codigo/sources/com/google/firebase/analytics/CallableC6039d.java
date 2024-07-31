package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdf;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.d */
/* loaded from: classes.dex */
public final class CallableC6039d implements Callable<Long> {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAnalytics f12819a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC6039d(FirebaseAnalytics firebaseAnalytics) {
        this.f12819a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        zzdf zzdfVar;
        zzdfVar = this.f12819a.f12799a;
        return zzdfVar.zzc();
    }
}
