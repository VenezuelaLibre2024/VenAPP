package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.h2 */
/* loaded from: classes.dex */
final class RunnableC5142h2 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f10486a;

    /* renamed from: b */
    final /* synthetic */ String f10487b;

    /* renamed from: c */
    final /* synthetic */ FragmentC5146i2 f10488c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5142h2(FragmentC5146i2 fragmentC5146i2, LifecycleCallback lifecycleCallback, String str) {
        this.f10488c = fragmentC5146i2;
        this.f10486a = lifecycleCallback;
        this.f10487b = str;
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
        FragmentC5146i2 fragmentC5146i2 = this.f10488c;
        i10 = fragmentC5146i2.f10495b;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f10486a;
            bundle = fragmentC5146i2.f10496c;
            if (bundle != null) {
                bundle3 = fragmentC5146i2.f10496c;
                bundle2 = bundle3.getBundle(this.f10487b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f10488c.f10495b;
        if (i11 >= 2) {
            this.f10486a.onStart();
        }
        i12 = this.f10488c.f10495b;
        if (i12 >= 3) {
            this.f10486a.onResume();
        }
        i13 = this.f10488c.f10495b;
        if (i13 >= 4) {
            this.f10486a.onStop();
        }
        i14 = this.f10488c.f10495b;
        if (i14 >= 5) {
            this.f10486a.onDestroy();
        }
    }
}
