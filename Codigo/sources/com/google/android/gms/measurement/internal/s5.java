package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s5 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f10621a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ q5 f10622b;

    public s5(q5 q5Var, String str) {
        this.f10622b = q5Var;
        com.google.android.gms.common.internal.s.j(str);
        this.f10621a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f10622b.zzj().B().b(this.f10621a, th2);
    }
}
