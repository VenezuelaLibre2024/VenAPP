package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10789a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10790b = null;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10791c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f10792d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b7 f10793e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w7(b7 b7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f10793e = b7Var;
        this.f10789a = atomicReference;
        this.f10791c = str2;
        this.f10792d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10793e.f10701a.E().L(this.f10789a, null, this.f10791c, this.f10792d);
    }
}
