package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.j2 */
/* loaded from: classes.dex */
final class RunnableC5150j2 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f10499a;

    /* renamed from: b */
    final /* synthetic */ String f10500b;

    /* renamed from: c */
    final /* synthetic */ C5154k2 f10501c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5150j2(C5154k2 c5154k2, LifecycleCallback lifecycleCallback, String str) {
        this.f10501c = c5154k2;
        this.f10499a = lifecycleCallback;
        this.f10500b = str;
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
        C5154k2 c5154k2 = this.f10501c;
        i10 = c5154k2.f10512b;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f10499a;
            bundle = c5154k2.f10513c;
            if (bundle != null) {
                bundle3 = c5154k2.f10513c;
                bundle2 = bundle3.getBundle(this.f10500b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f10501c.f10512b;
        if (i11 >= 2) {
            this.f10499a.onStart();
        }
        i12 = this.f10501c.f10512b;
        if (i12 >= 3) {
            this.f10499a.onResume();
        }
        i13 = this.f10501c.f10512b;
        if (i13 >= 4) {
            this.f10499a.onStop();
        }
        i14 = this.f10501c.f10512b;
        if (i14 >= 5) {
            this.f10499a.onDestroy();
        }
    }
}
