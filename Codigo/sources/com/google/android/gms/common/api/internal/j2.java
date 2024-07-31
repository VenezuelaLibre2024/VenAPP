package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class j2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f9385a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9386b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k2 f9387c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j2(k2 k2Var, LifecycleCallback lifecycleCallback, String str) {
        this.f9387c = k2Var;
        this.f9385a = lifecycleCallback;
        this.f9386b = str;
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
        k2 k2Var = this.f9387c;
        i10 = k2Var.f9398b;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f9385a;
            bundle = k2Var.f9399c;
            if (bundle != null) {
                bundle3 = k2Var.f9399c;
                bundle2 = bundle3.getBundle(this.f9386b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f9387c.f9398b;
        if (i11 >= 2) {
            this.f9385a.onStart();
        }
        i12 = this.f9387c.f9398b;
        if (i12 >= 3) {
            this.f9385a.onResume();
        }
        i13 = this.f9387c.f9398b;
        if (i13 >= 4) {
            this.f9385a.onStop();
        }
        i14 = this.f9387c.f9398b;
        if (i14 >= 5) {
            this.f9385a.onDestroy();
        }
    }
}
