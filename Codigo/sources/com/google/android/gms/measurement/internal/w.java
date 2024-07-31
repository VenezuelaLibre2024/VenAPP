package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    final String f10749a;

    /* renamed from: b, reason: collision with root package name */
    final String f10750b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10751c;

    /* renamed from: d, reason: collision with root package name */
    final long f10752d;

    /* renamed from: e, reason: collision with root package name */
    final long f10753e;

    /* renamed from: f, reason: collision with root package name */
    final z f10754f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(w5 w5Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        z zVar;
        com.google.android.gms.common.internal.s.f(str2);
        com.google.android.gms.common.internal.s.f(str3);
        this.f10749a = str2;
        this.f10750b = str3;
        this.f10751c = TextUtils.isEmpty(str) ? null : str;
        this.f10752d = j10;
        this.f10753e = j11;
        if (j11 != 0 && j11 > j10) {
            w5Var.zzj().G().b("Event created with reverse previous/current timestamps. appId", n4.q(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zVar = new z(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    w5Var.zzj().B().a("Param name can't be null");
                } else {
                    Object n02 = w5Var.G().n0(next, bundle2.get(next));
                    if (n02 == null) {
                        w5Var.zzj().G().b("Param value can't be null", w5Var.y().f(next));
                    } else {
                        w5Var.G().I(bundle2, next, n02);
                    }
                }
                it.remove();
            }
            zVar = new z(bundle2);
        }
        this.f10754f = zVar;
    }

    private w(w5 w5Var, String str, String str2, String str3, long j10, long j11, z zVar) {
        com.google.android.gms.common.internal.s.f(str2);
        com.google.android.gms.common.internal.s.f(str3);
        com.google.android.gms.common.internal.s.j(zVar);
        this.f10749a = str2;
        this.f10750b = str3;
        this.f10751c = TextUtils.isEmpty(str) ? null : str;
        this.f10752d = j10;
        this.f10753e = j11;
        if (j11 != 0 && j11 > j10) {
            w5Var.zzj().G().c("Event created with reverse previous/current timestamps. appId, name", n4.q(str2), n4.q(str3));
        }
        this.f10754f = zVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w a(w5 w5Var, long j10) {
        return new w(w5Var, this.f10751c, this.f10749a, this.f10750b, this.f10752d, j10, this.f10754f);
    }

    public final String toString() {
        return "Event{appId='" + this.f10749a + "', name='" + this.f10750b + "', params=" + String.valueOf(this.f10754f) + "}";
    }
}
