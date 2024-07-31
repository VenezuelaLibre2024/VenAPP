package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5101a.d;
import com.google.android.gms.common.internal.C5270q;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes.dex */
public final class C5115b<O extends C5101a.d> {

    /* renamed from: a */
    private final int f10430a;

    /* renamed from: b */
    private final C5101a f10431b;

    /* renamed from: c */
    private final C5101a.d f10432c;

    /* renamed from: d */
    private final String f10433d;

    private C5115b(C5101a c5101a, C5101a.d dVar, String str) {
        this.f10431b = c5101a;
        this.f10432c = dVar;
        this.f10433d = str;
        this.f10430a = C5270q.m13305c(c5101a, dVar, str);
    }

    /* renamed from: a */
    public static <O extends C5101a.d> C5115b<O> m12999a(C5101a<O> c5101a, O o10, String str) {
        return new C5115b<>(c5101a, o10, str);
    }

    /* renamed from: b */
    public final String m13000b() {
        return this.f10431b.m12976c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5115b)) {
            return false;
        }
        C5115b c5115b = (C5115b) obj;
        return C5270q.m13304b(this.f10431b, c5115b.f10431b) && C5270q.m13304b(this.f10432c, c5115b.f10432c) && C5270q.m13304b(this.f10433d, c5115b.f10433d);
    }

    public final int hashCode() {
        return this.f10430a;
    }
}
