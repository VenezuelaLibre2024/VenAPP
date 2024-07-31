package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class z implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final z f9675b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f9676a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f9677a;

        /* synthetic */ a(c0 c0Var) {
        }

        public z a() {
            return new z(this.f9677a, null);
        }

        public a b(String str) {
            this.f9677a = str;
            return this;
        }
    }

    /* synthetic */ z(String str, d0 d0Var) {
        this.f9676a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f9676a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return q.b(this.f9676a, ((z) obj).f9676a);
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.f9676a);
    }
}
