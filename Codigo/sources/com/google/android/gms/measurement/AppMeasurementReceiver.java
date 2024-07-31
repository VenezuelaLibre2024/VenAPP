package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import wa.n;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends g1.a implements n.a {

    /* renamed from: c, reason: collision with root package name */
    private n f9920c;

    @Override // wa.n.a
    public final void a(Context context, Intent intent) {
        g1.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f9920c == null) {
            this.f9920c = new n(this);
        }
        this.f9920c.a(context, intent);
    }
}
