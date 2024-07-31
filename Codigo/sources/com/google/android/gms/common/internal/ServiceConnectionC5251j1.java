package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.common.internal.j1 */
/* loaded from: classes.dex */
public final class ServiceConnectionC5251j1 implements ServiceConnection {

    /* renamed from: a */
    private final int f10709a;

    /* renamed from: b */
    final /* synthetic */ AbstractC5228c f10710b;

    public ServiceConnectionC5251j1(AbstractC5228c abstractC5228c, int i10) {
        this.f10710b = abstractC5228c;
        this.f10709a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC5228c abstractC5228c = this.f10710b;
        if (iBinder == null) {
            AbstractC5228c.zzk(abstractC5228c, 16);
            return;
        }
        obj = abstractC5228c.zzq;
        synchronized (obj) {
            AbstractC5228c abstractC5228c2 = this.f10710b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            abstractC5228c2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5261n)) ? new C5298z0(iBinder) : (InterfaceC5261n) queryLocalInterface;
        }
        this.f10710b.zzl(0, null, this.f10709a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f10710b.zzq;
        synchronized (obj) {
            this.f10710b.zzr = null;
        }
        Handler handler = this.f10710b.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f10709a, 1));
    }
}
