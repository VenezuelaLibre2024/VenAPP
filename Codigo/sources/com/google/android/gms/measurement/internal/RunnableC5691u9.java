package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
/* loaded from: classes2.dex */
final class RunnableC5691u9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f11877a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnectionC5665s9 f11878b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5691u9(ServiceConnectionC5665s9 serviceConnectionC5665s9, ComponentName componentName) {
        this.f11878b = serviceConnectionC5665s9;
        this.f11877a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5703v8.m14375F(this.f11878b.f11832c, this.f11877a);
    }
}
