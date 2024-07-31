package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class j1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f9594a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f9595b;

    public j1(c cVar, int i10) {
        this.f9595b = cVar;
        this.f9594a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        c cVar = this.f9595b;
        if (iBinder == null) {
            c.zzk(cVar, 16);
            return;
        }
        obj = cVar.zzq;
        synchronized (obj) {
            c cVar2 = this.f9595b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new z0(iBinder) : (n) queryLocalInterface;
        }
        this.f9595b.zzl(0, null, this.f9594a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f9595b.zzq;
        synchronized (obj) {
            this.f9595b.zzr = null;
        }
        Handler handler = this.f9595b.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f9594a, 1));
    }
}
