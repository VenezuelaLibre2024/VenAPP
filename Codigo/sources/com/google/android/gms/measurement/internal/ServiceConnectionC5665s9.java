package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import ca.C1894b;
import com.google.android.gms.common.internal.AbstractC5228c;
import com.google.android.gms.common.internal.C5276s;
import p200ka.C9214b;
import p418wa.InterfaceC12109i;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC5665s9 implements ServiceConnection, AbstractC5228c.a, AbstractC5228c.b {

    /* renamed from: a */
    private volatile boolean f11830a;

    /* renamed from: b */
    private volatile C5608o4 f11831b;

    /* renamed from: c */
    final /* synthetic */ C5703v8 f11832c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC5665s9(C5703v8 c5703v8) {
        this.f11832c = c5703v8;
    }

    /* renamed from: a */
    public final void m14339a() {
        this.f11832c.mo13687i();
        Context zza = this.f11832c.zza();
        synchronized (this) {
            if (this.f11830a) {
                this.f11832c.zzj().m14186F().m14218a("Connection attempt already in progress");
                return;
            }
            if (this.f11831b != null && (this.f11831b.isConnecting() || this.f11831b.isConnected())) {
                this.f11832c.zzj().m14186F().m14218a("Already awaiting connection attempt");
                return;
            }
            this.f11831b = new C5608o4(zza, Looper.getMainLooper(), this, this);
            this.f11832c.zzj().m14186F().m14218a("Connecting to remote service");
            this.f11830a = true;
            C5276s.m13324j(this.f11831b);
            this.f11831b.checkAvailabilityAndConnect();
        }
    }

    /* renamed from: b */
    public final void m14340b(Intent intent) {
        ServiceConnectionC5665s9 serviceConnectionC5665s9;
        this.f11832c.mo13687i();
        Context zza = this.f11832c.zza();
        C9214b m27395b = C9214b.m27395b();
        synchronized (this) {
            if (this.f11830a) {
                this.f11832c.zzj().m14186F().m14218a("Connection attempt already in progress");
                return;
            }
            this.f11832c.zzj().m14186F().m14218a("Using local app measurement service");
            this.f11830a = true;
            serviceConnectionC5665s9 = this.f11832c.f11906c;
            m27395b.m27400a(zza, intent, serviceConnectionC5665s9, 129);
        }
    }

    /* renamed from: d */
    public final void m14341d() {
        if (this.f11831b != null && (this.f11831b.isConnected() || this.f11831b.isConnecting())) {
            this.f11831b.disconnect();
        }
        this.f11831b = null;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c.a
    public final void onConnected(Bundle bundle) {
        C5276s.m13319e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C5276s.m13324j(this.f11831b);
                this.f11832c.zzl().m14248y(new RunnableC5678t9(this, this.f11831b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f11831b = null;
                this.f11830a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c.b
    public final void onConnectionFailed(C1894b c1894b) {
        C5276s.m13319e("MeasurementServiceConnection.onConnectionFailed");
        C5595n4 m14526z = this.f11832c.f11899a.m14526z();
        if (m14526z != null) {
            m14526z.m14187G().m14219b("Service connection failed", c1894b);
        }
        synchronized (this) {
            this.f11830a = false;
            this.f11831b = null;
        }
        this.f11832c.zzl().m14248y(new RunnableC5704v9(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c.a
    public final void onConnectionSuspended(int i10) {
        C5276s.m13319e("MeasurementServiceConnection.onConnectionSuspended");
        this.f11832c.zzj().m14181A().m14218a("Service connection suspended");
        this.f11832c.zzl().m14248y(new RunnableC5716w9(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC5665s9 serviceConnectionC5665s9;
        C5276s.m13319e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f11830a = false;
                this.f11832c.zzj().m14182B().m14218a("Service connected with null binder");
                return;
            }
            InterfaceC12109i interfaceC12109i = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    interfaceC12109i = queryLocalInterface instanceof InterfaceC12109i ? (InterfaceC12109i) queryLocalInterface : new C5543j4(iBinder);
                    this.f11832c.zzj().m14186F().m14218a("Bound to IMeasurementService interface");
                } else {
                    this.f11832c.zzj().m14182B().m14219b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f11832c.zzj().m14182B().m14218a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC12109i == null) {
                this.f11830a = false;
                try {
                    C9214b m27395b = C9214b.m27395b();
                    Context zza = this.f11832c.zza();
                    serviceConnectionC5665s9 = this.f11832c.f11906c;
                    m27395b.m27401c(zza, serviceConnectionC5665s9);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f11832c.zzl().m14248y(new RunnableC5652r9(this, interfaceC12109i));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C5276s.m13319e("MeasurementServiceConnection.onServiceDisconnected");
        this.f11832c.zzj().m14181A().m14218a("Service disconnected");
        this.f11832c.zzl().m14248y(new RunnableC5691u9(this, componentName));
    }
}
