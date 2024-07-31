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
import com.google.android.gms.common.internal.c;

/* loaded from: classes2.dex */
public final class s9 implements ServiceConnection, c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f10632a;

    /* renamed from: b, reason: collision with root package name */
    private volatile o4 f10633b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v8 f10634c;

    /* JADX INFO: Access modifiers changed from: protected */
    public s9(v8 v8Var) {
        this.f10634c = v8Var;
    }

    public final void a() {
        this.f10634c.i();
        Context zza = this.f10634c.zza();
        synchronized (this) {
            if (this.f10632a) {
                this.f10634c.zzj().F().a("Connection attempt already in progress");
                return;
            }
            if (this.f10633b != null && (this.f10633b.isConnecting() || this.f10633b.isConnected())) {
                this.f10634c.zzj().F().a("Already awaiting connection attempt");
                return;
            }
            this.f10633b = new o4(zza, Looper.getMainLooper(), this, this);
            this.f10634c.zzj().F().a("Connecting to remote service");
            this.f10632a = true;
            com.google.android.gms.common.internal.s.j(this.f10633b);
            this.f10633b.checkAvailabilityAndConnect();
        }
    }

    public final void b(Intent intent) {
        s9 s9Var;
        this.f10634c.i();
        Context zza = this.f10634c.zza();
        ka.b b10 = ka.b.b();
        synchronized (this) {
            if (this.f10632a) {
                this.f10634c.zzj().F().a("Connection attempt already in progress");
                return;
            }
            this.f10634c.zzj().F().a("Using local app measurement service");
            this.f10632a = true;
            s9Var = this.f10634c.f10708c;
            b10.a(zza, intent, s9Var, 129);
        }
    }

    public final void d() {
        if (this.f10633b != null && (this.f10633b.isConnected() || this.f10633b.isConnecting())) {
            this.f10633b.disconnect();
        }
        this.f10633b = null;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.s.j(this.f10633b);
                this.f10634c.zzl().y(new t9(this, this.f10633b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f10633b = null;
                this.f10632a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ca.b bVar) {
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onConnectionFailed");
        n4 z10 = this.f10634c.f10701a.z();
        if (z10 != null) {
            z10.G().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f10632a = false;
            this.f10633b = null;
        }
        this.f10634c.zzl().y(new v9(this));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i10) {
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f10634c.zzj().A().a("Service connection suspended");
        this.f10634c.zzl().y(new w9(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        s9 s9Var;
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f10632a = false;
                this.f10634c.zzj().B().a("Service connected with null binder");
                return;
            }
            wa.i iVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    iVar = queryLocalInterface instanceof wa.i ? (wa.i) queryLocalInterface : new j4(iBinder);
                    this.f10634c.zzj().F().a("Bound to IMeasurementService interface");
                } else {
                    this.f10634c.zzj().B().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f10634c.zzj().B().a("Service connect failed to get IMeasurementService");
            }
            if (iVar == null) {
                this.f10632a = false;
                try {
                    ka.b b10 = ka.b.b();
                    Context zza = this.f10634c.zza();
                    s9Var = this.f10634c.f10708c;
                    b10.c(zza, s9Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f10634c.zzl().y(new r9(this, iVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f10634c.zzj().A().a("Service disconnected");
        this.f10634c.zzl().y(new u9(this, componentName));
    }
}
