package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* loaded from: classes2.dex */
public final class RunnableC5689u7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bundle f11873a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11874b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5689u7(C5442b7 c5442b7, Bundle bundle) {
        this.f11874b = c5442b7;
        this.f11873a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5442b7 c5442b7 = this.f11874b;
        Bundle bundle = this.f11873a;
        c5442b7.mo13687i();
        c5442b7.m14545q();
        C5276s.m13324j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C5276s.m13320f(string);
        C5276s.m13320f(string2);
        C5276s.m13324j(bundle.get("value"));
        if (!c5442b7.f11899a.m14512k()) {
            c5442b7.zzj().m14186F().m14218a("Conditional property not set since app measurement is disabled");
            return;
        }
        C5524hb c5524hb = new C5524hb(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C5461d0 m14008B = c5442b7.mo13681f().m14008B(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c5442b7.mo13698o().m14389C(new C5460d(bundle.getString("app_id"), string2, c5524hb, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c5442b7.mo13681f().m14008B(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), m14008B, bundle.getLong("time_to_live"), c5442b7.mo13681f().m14008B(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
