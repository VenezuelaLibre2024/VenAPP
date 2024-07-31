package com.google.android.gms.common.api.internal;

import p013ab.C0093l;

/* renamed from: com.google.android.gms.common.api.internal.k1 */
/* loaded from: classes.dex */
final class RunnableC5153k1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0093l f10508a;

    /* renamed from: b */
    final /* synthetic */ BinderC5160m1 f10509b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5153k1(BinderC5160m1 binderC5160m1, C0093l c0093l) {
        this.f10509b = binderC5160m1;
        this.f10508a = c0093l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC5160m1.m13139g2(this.f10509b, this.f10508a);
    }
}
