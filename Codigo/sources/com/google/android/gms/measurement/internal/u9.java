package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes2.dex */
final class u9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f10679a;

    /* renamed from: b */
    private final /* synthetic */ s9 f10680b;

    public u9(s9 s9Var, ComponentName componentName) {
        this.f10680b = s9Var;
        this.f10679a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v8.F(this.f10680b.f10634c, this.f10679a);
    }
}
