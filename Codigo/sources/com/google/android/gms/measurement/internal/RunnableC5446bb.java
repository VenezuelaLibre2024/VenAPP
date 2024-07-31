package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.measurement.internal.bb */
/* loaded from: classes2.dex */
final class RunnableC5446bb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11128a;

    /* renamed from: b */
    private final /* synthetic */ String f11129b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f11130c;

    /* renamed from: d */
    private final /* synthetic */ C5459cb f11131d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5446bb(C5459cb c5459cb, String str, String str2, Bundle bundle) {
        this.f11131d = c5459cb;
        this.f11128a = str;
        this.f11129b = str2;
        this.f11130c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11131d.f11162a.m14473p((C5461d0) C5276s.m13324j(this.f11131d.f11162a.m14463i0().m14008B(this.f11128a, this.f11129b, this.f11130c, "auto", this.f11131d.f11162a.zzb().mo28130a(), false, true)), this.f11128a);
    }
}
