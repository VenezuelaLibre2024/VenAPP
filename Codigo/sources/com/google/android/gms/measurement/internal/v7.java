package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10702a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10703b = null;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10704c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f10705d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f10706e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ b7 f10707f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v7(b7 b7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f10707f = b7Var;
        this.f10702a = atomicReference;
        this.f10704c = str2;
        this.f10705d = str3;
        this.f10706e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10707f.f10701a.E().M(this.f10702a, null, this.f10704c, this.f10705d, this.f10706e);
    }
}
