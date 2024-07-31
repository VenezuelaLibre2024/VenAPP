package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* loaded from: classes.dex */
public final class b<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final int f9322a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f9323b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f9324c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9325d;

    private b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f9323b = aVar;
        this.f9324c = dVar;
        this.f9325d = str;
        this.f9322a = com.google.android.gms.common.internal.q.c(aVar, dVar, str);
    }

    public static <O extends a.d> b<O> a(com.google.android.gms.common.api.a<O> aVar, O o10, String str) {
        return new b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f9323b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return com.google.android.gms.common.internal.q.b(this.f9323b, bVar.f9323b) && com.google.android.gms.common.internal.q.b(this.f9324c, bVar.f9324c) && com.google.android.gms.common.internal.q.b(this.f9325d, bVar.f9325d);
    }

    public final int hashCode() {
        return this.f9322a;
    }
}
