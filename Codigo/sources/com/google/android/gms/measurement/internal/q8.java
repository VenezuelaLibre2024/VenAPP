package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f10554a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p8 f10555b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p8 f10556c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f10557d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ o8 f10558e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q8(o8 o8Var, Bundle bundle, p8 p8Var, p8 p8Var2, long j10) {
        this.f10558e = o8Var;
        this.f10554a = bundle;
        this.f10555b = p8Var;
        this.f10556c = p8Var2;
        this.f10557d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o8.E(this.f10558e, this.f10554a, this.f10555b, this.f10556c, this.f10557d);
    }
}
