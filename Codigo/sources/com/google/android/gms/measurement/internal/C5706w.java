package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.w */
/* loaded from: classes2.dex */
public final class C5706w {

    /* renamed from: a */
    final String f11955a;

    /* renamed from: b */
    final String f11956b;

    /* renamed from: c */
    private final String f11957c;

    /* renamed from: d */
    final long f11958d;

    /* renamed from: e */
    final long f11959e;

    /* renamed from: f */
    final C5742z f11960f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5706w(C5712w5 c5712w5, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        C5742z c5742z;
        C5276s.m13320f(str2);
        C5276s.m13320f(str3);
        this.f11955a = str2;
        this.f11956b = str3;
        this.f11957c = TextUtils.isEmpty(str) ? null : str;
        this.f11958d = j10;
        this.f11959e = j11;
        if (j11 != 0 && j11 > j10) {
            c5712w5.zzj().m14187G().m14219b("Event created with reverse previous/current timestamps. appId", C5595n4.m14174q(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c5742z = new C5742z(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c5712w5.zzj().m14182B().m14218a("Param name can't be null");
                } else {
                    Object m14041n0 = c5712w5.m14500G().m14041n0(next, bundle2.get(next));
                    if (m14041n0 == null) {
                        c5712w5.zzj().m14187G().m14219b("Param value can't be null", c5712w5.m14525y().m14168f(next));
                    } else {
                        c5712w5.m14500G().m14015I(bundle2, next, m14041n0);
                    }
                }
                it.remove();
            }
            c5742z = new C5742z(bundle2);
        }
        this.f11960f = c5742z;
    }

    private C5706w(C5712w5 c5712w5, String str, String str2, String str3, long j10, long j11, C5742z c5742z) {
        C5276s.m13320f(str2);
        C5276s.m13320f(str3);
        C5276s.m13324j(c5742z);
        this.f11955a = str2;
        this.f11956b = str3;
        this.f11957c = TextUtils.isEmpty(str) ? null : str;
        this.f11958d = j10;
        this.f11959e = j11;
        if (j11 != 0 && j11 > j10) {
            c5712w5.zzj().m14187G().m14220c("Event created with reverse previous/current timestamps. appId, name", C5595n4.m14174q(str2), C5595n4.m14174q(str3));
        }
        this.f11960f = c5742z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5706w m14484a(C5712w5 c5712w5, long j10) {
        return new C5706w(c5712w5, this.f11957c, this.f11955a, this.f11956b, this.f11958d, j10, this.f11960f);
    }

    public final String toString() {
        return "Event{appId='" + this.f11955a + "', name='" + this.f11956b + "', params=" + String.valueOf(this.f11960f) + "}";
    }
}
