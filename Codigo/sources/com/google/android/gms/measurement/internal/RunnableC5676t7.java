package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* loaded from: classes2.dex */
public final class RunnableC5676t7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bundle f11849a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11850b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5676t7(C5442b7 c5442b7, Bundle bundle) {
        this.f11850b = c5442b7;
        this.f11849a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5442b7 c5442b7 = this.f11850b;
        Bundle bundle = this.f11849a;
        c5442b7.mo13687i();
        c5442b7.m14545q();
        C5276s.m13324j(bundle);
        String m13320f = C5276s.m13320f(bundle.getString("name"));
        if (!c5442b7.f11899a.m14512k()) {
            c5442b7.zzj().m14186F().m14218a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c5442b7.mo13698o().m14389C(new C5460d(bundle.getString("app_id"), "", new C5524hb(m13320f, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c5442b7.mo13681f().m14008B(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
