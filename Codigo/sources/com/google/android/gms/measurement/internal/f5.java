package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcb;

/* loaded from: classes2.dex */
public final class f5 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f10173a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g5 f10174b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f5(g5 g5Var, String str) {
        this.f10174b = g5Var;
        this.f10173a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f10174b.f10194a.zzj().G().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzby zza = zzcb.zza(iBinder);
            if (zza == null) {
                this.f10174b.f10194a.zzj().G().a("Install Referrer Service implementation was not found");
            } else {
                this.f10174b.f10194a.zzj().F().a("Install Referrer Service connected");
                this.f10174b.f10194a.zzl().y(new h5(this, zza, this));
            }
        } catch (RuntimeException e10) {
            this.f10174b.f10194a.zzj().G().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10174b.f10194a.zzj().F().a("Install Referrer Service disconnected");
    }
}
