package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Boolean f10000a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f10001b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b8(b7 b7Var, Boolean bool) {
        this.f10001b = b7Var;
        this.f10000a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10001b.L(this.f10000a, true);
    }
}
