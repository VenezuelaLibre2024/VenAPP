package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class p<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    private final k f9438a;

    /* renamed from: b, reason: collision with root package name */
    private final ca.d[] f9439b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9440c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9441d;

    /* JADX INFO: Access modifiers changed from: protected */
    public p(k<L> kVar, ca.d[] dVarArr, boolean z10, int i10) {
        this.f9438a = kVar;
        this.f9439b = dVarArr;
        this.f9440c = z10;
        this.f9441d = i10;
    }

    public void a() {
        this.f9438a.a();
    }

    public k.a<L> b() {
        return this.f9438a.b();
    }

    public ca.d[] c() {
        return this.f9439b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d(A a10, TaskCompletionSource<Void> taskCompletionSource);

    public final int e() {
        return this.f9441d;
    }

    public final boolean f() {
        return this.f9440c;
    }
}
