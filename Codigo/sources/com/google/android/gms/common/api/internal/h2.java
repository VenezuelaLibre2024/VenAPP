package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class h2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f9372a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9373b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i2 f9374c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h2(i2 i2Var, LifecycleCallback lifecycleCallback, String str) {
        this.f9374c = i2Var;
        this.f9372a = lifecycleCallback;
        this.f9373b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        i2 i2Var = this.f9374c;
        i10 = i2Var.f9381b;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f9372a;
            bundle = i2Var.f9382c;
            if (bundle != null) {
                bundle3 = i2Var.f9382c;
                bundle2 = bundle3.getBundle(this.f9373b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f9374c.f9381b;
        if (i11 >= 2) {
            this.f9372a.onStart();
        }
        i12 = this.f9374c.f9381b;
        if (i12 >= 3) {
            this.f9372a.onResume();
        }
        i13 = this.f9374c.f9381b;
        if (i13 >= 4) {
            this.f9372a.onStop();
        }
        i14 = this.f9374c.f9381b;
        if (i14 >= 5) {
            this.f9372a.onDestroy();
        }
    }
}
