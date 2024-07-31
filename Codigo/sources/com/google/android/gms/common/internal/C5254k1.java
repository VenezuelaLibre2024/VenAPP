package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import ca.C1894b;
import com.google.android.gms.common.internal.AbstractC5228c;

/* renamed from: com.google.android.gms.common.internal.k1 */
/* loaded from: classes.dex */
public final class C5254k1 extends AbstractC5289w0 {

    /* renamed from: g */
    public final IBinder f10712g;

    /* renamed from: h */
    final /* synthetic */ AbstractC5228c f10713h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5254k1(AbstractC5228c abstractC5228c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC5228c, i10, bundle);
        this.f10713h = abstractC5228c;
        this.f10712g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5289w0
    /* renamed from: f */
    protected final void mo13293f(C1894b c1894b) {
        if (this.f10713h.zzx != null) {
            this.f10713h.zzx.onConnectionFailed(c1894b);
        }
        this.f10713h.onConnectionFailed(c1894b);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5289w0
    /* renamed from: g */
    protected final boolean mo13294g() {
        String str;
        String interfaceDescriptor;
        AbstractC5228c.a aVar;
        AbstractC5228c.a aVar2;
        try {
            IBinder iBinder = this.f10712g;
            C5276s.m13324j(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f10713h.getServiceDescriptor().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f10713h.getServiceDescriptor() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface createServiceInterface = this.f10713h.createServiceInterface(this.f10712g);
        if (createServiceInterface == null || !(AbstractC5228c.zzn(this.f10713h, 2, 4, createServiceInterface) || AbstractC5228c.zzn(this.f10713h, 3, 4, createServiceInterface))) {
            return false;
        }
        this.f10713h.zzB = null;
        Bundle connectionHint = this.f10713h.getConnectionHint();
        AbstractC5228c abstractC5228c = this.f10713h;
        aVar = abstractC5228c.zzw;
        if (aVar == null) {
            return true;
        }
        aVar2 = abstractC5228c.zzw;
        aVar2.onConnected(connectionHint);
        return true;
    }
}
