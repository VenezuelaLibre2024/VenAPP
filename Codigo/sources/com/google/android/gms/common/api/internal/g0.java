package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.c;

/* loaded from: classes.dex */
final class g0 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f9368a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(g gVar) {
        this.f9368a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z10) {
        Handler handler;
        Handler handler2;
        g gVar = this.f9368a;
        handler = gVar.A;
        handler2 = gVar.A;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
