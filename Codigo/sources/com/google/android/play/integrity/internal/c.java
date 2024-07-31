package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class c implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ d f10993a;

    public /* synthetic */ c(d dVar, b bVar) {
        this.f10993a = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c0 c0Var;
        c0Var = this.f10993a.f10997b;
        c0Var.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f10993a.c().post(new k0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c0 c0Var;
        c0Var = this.f10993a.f10997b;
        c0Var.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f10993a.c().post(new l0(this));
    }
}
