package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcb;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC5492f5 implements ServiceConnection {

    /* renamed from: a */
    private final String f11345a;

    /* renamed from: b */
    final /* synthetic */ C5505g5 f11346b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC5492f5(C5505g5 c5505g5, String str) {
        this.f11346b = c5505g5;
        this.f11345a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f11346b.f11366a.zzj().m14187G().m14218a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzby zza = zzcb.zza(iBinder);
            if (zza == null) {
                this.f11346b.f11366a.zzj().m14187G().m14218a("Install Referrer Service implementation was not found");
            } else {
                this.f11346b.f11366a.zzj().m14186F().m14218a("Install Referrer Service connected");
                this.f11346b.f11366a.zzl().m14248y(new RunnableC5518h5(this, zza, this));
            }
        } catch (RuntimeException e10) {
            this.f11346b.f11366a.zzj().m14187G().m14219b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11346b.f11366a.zzj().m14186F().m14218a("Install Referrer Service disconnected");
    }
}
