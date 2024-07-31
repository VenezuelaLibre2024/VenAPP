package com.google.android.gms.common.api.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f9432a;

    /* renamed from: b, reason: collision with root package name */
    private final ca.d f9433b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n0(b bVar, ca.d dVar, m0 m0Var) {
        this.f9432a = bVar;
        this.f9433b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n0)) {
            n0 n0Var = (n0) obj;
            if (com.google.android.gms.common.internal.q.b(this.f9432a, n0Var.f9432a) && com.google.android.gms.common.internal.q.b(this.f9433b, n0Var.f9433b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f9432a, this.f9433b);
    }

    public final String toString() {
        return com.google.android.gms.common.internal.q.d(this).a(Constants.KEY, this.f9432a).a("feature", this.f9433b).toString();
    }
}
