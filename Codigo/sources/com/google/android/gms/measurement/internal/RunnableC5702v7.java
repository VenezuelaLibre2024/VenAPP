package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* loaded from: classes2.dex */
public final class RunnableC5702v7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11900a;

    /* renamed from: b */
    private final /* synthetic */ String f11901b = null;

    /* renamed from: c */
    private final /* synthetic */ String f11902c;

    /* renamed from: d */
    private final /* synthetic */ String f11903d;

    /* renamed from: e */
    private final /* synthetic */ boolean f11904e;

    /* renamed from: f */
    private final /* synthetic */ C5442b7 f11905f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5702v7(C5442b7 c5442b7, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f11905f = c5442b7;
        this.f11900a = atomicReference;
        this.f11902c = str2;
        this.f11903d = str3;
        this.f11904e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11905f.f11899a.m14498E().m14396M(this.f11900a, null, this.f11902c, this.f11903d, this.f11904e);
    }
}
