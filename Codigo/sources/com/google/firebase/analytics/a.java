package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdf;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f11586a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FirebaseAnalytics firebaseAnalytics) {
        this.f11586a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        zzdf zzdfVar;
        zzdfVar = this.f11586a.f11584a;
        return zzdfVar.zze();
    }
}
