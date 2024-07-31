package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdf;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.a */
/* loaded from: classes.dex */
public final class CallableC6029a implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAnalytics f12801a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC6029a(FirebaseAnalytics firebaseAnalytics) {
        this.f12801a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        zzdf zzdfVar;
        zzdfVar = this.f12801a.f12799a;
        return zzdfVar.zze();
    }
}
