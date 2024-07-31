package com.google.android.gms.common.api.internal;

import ca.C1898d;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5101a.b;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.p */
/* loaded from: classes.dex */
public abstract class AbstractC5167p<A extends C5101a.b, L> {

    /* renamed from: a */
    private final C5151k f10552a;

    /* renamed from: b */
    private final C1898d[] f10553b;

    /* renamed from: c */
    private final boolean f10554c;

    /* renamed from: d */
    private final int f10555d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5167p(C5151k<L> c5151k, C1898d[] c1898dArr, boolean z10, int i10) {
        this.f10552a = c5151k;
        this.f10553b = c1898dArr;
        this.f10554c = z10;
        this.f10555d = i10;
    }

    /* renamed from: a */
    public void m13145a() {
        this.f10552a.m13081a();
    }

    /* renamed from: b */
    public C5151k.a<L> m13146b() {
        return this.f10552a.m13082b();
    }

    /* renamed from: c */
    public C1898d[] m13147c() {
        return this.f10553b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo13024d(A a10, TaskCompletionSource<Void> taskCompletionSource);

    /* renamed from: e */
    public final int m13148e() {
        return this.f10555d;
    }

    /* renamed from: f */
    public final boolean m13149f() {
        return this.f10554c;
    }
}
