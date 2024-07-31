package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class s0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f9463a;

    /* renamed from: b, reason: collision with root package name */
    private final r0 f9464b;

    public s0(r0 r0Var) {
        this.f9464b = r0Var;
    }

    public final void a(Context context) {
        this.f9463a = context;
    }

    public final synchronized void b() {
        Context context = this.f9463a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f9463a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f9464b.a();
            b();
        }
    }
}
