package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f10651a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f10652b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t7(b7 b7Var, Bundle bundle) {
        this.f10652b = b7Var;
        this.f10651a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b7 b7Var = this.f10652b;
        Bundle bundle = this.f10651a;
        b7Var.i();
        b7Var.q();
        com.google.android.gms.common.internal.s.j(bundle);
        String f10 = com.google.android.gms.common.internal.s.f(bundle.getString("name"));
        if (!b7Var.f10701a.k()) {
            b7Var.zzj().F().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            b7Var.o().C(new d(bundle.getString("app_id"), "", new hb(f10, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), b7Var.f().B(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
