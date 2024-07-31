package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f10675a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f10676b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u7(b7 b7Var, Bundle bundle) {
        this.f10676b = b7Var;
        this.f10675a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b7 b7Var = this.f10676b;
        Bundle bundle = this.f10675a;
        b7Var.i();
        b7Var.q();
        com.google.android.gms.common.internal.s.j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        com.google.android.gms.common.internal.s.f(string);
        com.google.android.gms.common.internal.s.f(string2);
        com.google.android.gms.common.internal.s.j(bundle.get("value"));
        if (!b7Var.f10701a.k()) {
            b7Var.zzj().F().a("Conditional property not set since app measurement is disabled");
            return;
        }
        hb hbVar = new hb(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            d0 B = b7Var.f().B(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            b7Var.o().C(new d(bundle.getString("app_id"), string2, hbVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), b7Var.f().B(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), B, bundle.getLong("time_to_live"), b7Var.f().B(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
