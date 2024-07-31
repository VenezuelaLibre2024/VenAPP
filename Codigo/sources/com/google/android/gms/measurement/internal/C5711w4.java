package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C5276s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* loaded from: classes2.dex */
public class C5711w4 extends BroadcastReceiver {

    /* renamed from: a */
    private final C5705va f11966a;

    /* renamed from: b */
    private boolean f11967b;

    /* renamed from: c */
    private boolean f11968c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5711w4(C5705va c5705va) {
        C5276s.m13324j(c5705va);
        this.f11966a = c5705va;
    }

    /* renamed from: b */
    public final void m14486b() {
        this.f11966a.m14465k0();
        this.f11966a.zzl().mo13687i();
        if (this.f11967b) {
            return;
        }
        this.f11966a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f11968c = this.f11966a.m14455b0().m14355v();
        this.f11966a.zzj().m14186F().m14219b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f11968c));
        this.f11967b = true;
    }

    /* renamed from: c */
    public final void m14487c() {
        this.f11966a.m14465k0();
        this.f11966a.zzl().mo13687i();
        this.f11966a.zzl().mo13687i();
        if (this.f11967b) {
            this.f11966a.zzj().m14186F().m14218a("Unregistering connectivity change receiver");
            this.f11967b = false;
            this.f11968c = false;
            try {
                this.f11966a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f11966a.zzj().m14182B().m14219b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f11966a.m14465k0();
        String action = intent.getAction();
        this.f11966a.zzj().m14186F().m14219b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f11966a.zzj().m14187G().m14219b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m14355v = this.f11966a.m14455b0().m14355v();
        if (this.f11968c != m14355v) {
            this.f11968c = m14355v;
            this.f11966a.zzl().m14248y(new RunnableC5747z4(this, m14355v));
        }
    }
}
