package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class w4 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final va f10760a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10761b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10762c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w4(va vaVar) {
        com.google.android.gms.common.internal.s.j(vaVar);
        this.f10760a = vaVar;
    }

    public final void b() {
        this.f10760a.k0();
        this.f10760a.zzl().i();
        if (this.f10761b) {
            return;
        }
        this.f10760a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f10762c = this.f10760a.b0().v();
        this.f10760a.zzj().F().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10762c));
        this.f10761b = true;
    }

    public final void c() {
        this.f10760a.k0();
        this.f10760a.zzl().i();
        this.f10760a.zzl().i();
        if (this.f10761b) {
            this.f10760a.zzj().F().a("Unregistering connectivity change receiver");
            this.f10761b = false;
            this.f10762c = false;
            try {
                this.f10760a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f10760a.zzj().B().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f10760a.k0();
        String action = intent.getAction();
        this.f10760a.zzj().F().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f10760a.zzj().G().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean v10 = this.f10760a.b0().v();
        if (this.f10762c != v10) {
            this.f10762c = v10;
            this.f10760a.zzl().y(new z4(this, v10));
        }
    }
}
