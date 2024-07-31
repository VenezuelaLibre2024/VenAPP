package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h7 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b7 f10227a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h7(b7 b7Var) {
        this.f10227a = b7Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10227a.zzl().y(runnable);
    }
}
