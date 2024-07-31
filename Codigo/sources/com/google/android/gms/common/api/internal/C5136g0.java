package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* loaded from: classes.dex */
final class C5136g0 implements ComponentCallbacks2C5119c.a {

    /* renamed from: a */
    final /* synthetic */ C5135g f10482a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5136g0(C5135g c5135g) {
        this.f10482a = c5135g;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c.a
    /* renamed from: a */
    public final void mo13016a(boolean z10) {
        Handler handler;
        Handler handler2;
        C5135g c5135g = this.f10482a;
        handler = c5135g.f10465A;
        handler2 = c5135g.f10465A;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
