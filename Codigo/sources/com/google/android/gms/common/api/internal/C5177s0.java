package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
/* loaded from: classes.dex */
public final class C5177s0 extends BroadcastReceiver {

    /* renamed from: a */
    Context f10577a;

    /* renamed from: b */
    private final AbstractC5174r0 f10578b;

    public C5177s0(AbstractC5174r0 abstractC5174r0) {
        this.f10578b = abstractC5174r0;
    }

    /* renamed from: a */
    public final void m13170a(Context context) {
        this.f10577a = context;
    }

    /* renamed from: b */
    public final synchronized void m13171b() {
        Context context = this.f10577a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f10577a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f10578b.mo13009a();
            m13171b();
        }
    }
}
