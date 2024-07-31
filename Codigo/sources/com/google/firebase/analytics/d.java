package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdf;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements Callable<Long> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f11604a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(FirebaseAnalytics firebaseAnalytics) {
        this.f11604a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        zzdf zzdfVar;
        zzdfVar = this.f11604a.f11584a;
        return zzdfVar.zzc();
    }
}
