package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class k1 extends w0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f9597g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f9598h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f9598h = cVar;
        this.f9597g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.w0
    protected final void f(ca.b bVar) {
        if (this.f9598h.zzx != null) {
            this.f9598h.zzx.onConnectionFailed(bVar);
        }
        this.f9598h.onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.w0
    protected final boolean g() {
        String str;
        String interfaceDescriptor;
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f9597g;
            s.j(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f9598h.getServiceDescriptor().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f9598h.getServiceDescriptor() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface createServiceInterface = this.f9598h.createServiceInterface(this.f9597g);
        if (createServiceInterface == null || !(c.zzn(this.f9598h, 2, 4, createServiceInterface) || c.zzn(this.f9598h, 3, 4, createServiceInterface))) {
            return false;
        }
        this.f9598h.zzB = null;
        Bundle connectionHint = this.f9598h.getConnectionHint();
        c cVar = this.f9598h;
        aVar = cVar.zzw;
        if (aVar == null) {
            return true;
        }
        aVar2 = cVar.zzw;
        aVar2.onConnected(connectionHint);
        return true;
    }
}
