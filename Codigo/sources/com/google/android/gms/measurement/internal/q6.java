package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class q6 implements Callable<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d0 f10550a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10551b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f10552c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q6(a6 a6Var, d0 d0Var, String str) {
        this.f10552c = a6Var;
        this.f10550a = d0Var;
        this.f10551b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10552c.f9953a;
        vaVar.j0();
        vaVar2 = this.f10552c.f9953a;
        return vaVar2.e0().t(this.f10550a, this.f10551b);
    }
}
