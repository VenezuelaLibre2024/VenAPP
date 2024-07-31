package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.integrity.internal.c */
/* loaded from: classes2.dex */
public final class ServiceConnectionC5819c implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C5821d f12208a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC5819c(C5821d c5821d, C5817b c5817b) {
        this.f12208a = c5821d;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C5821d.m14663f(this.f12208a).m14658c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f12208a.m14679c().post(new C5836k0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C5821d.m14663f(this.f12208a).m14658c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f12208a.m14679c().post(new C5838l0(this));
    }
}
