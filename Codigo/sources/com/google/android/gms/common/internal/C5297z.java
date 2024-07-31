package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C5101a;

/* renamed from: com.google.android.gms.common.internal.z */
/* loaded from: classes.dex */
public class C5297z implements C5101a.d {

    /* renamed from: b */
    public static final C5297z f10790b = m13366a().m13368a();

    /* renamed from: a */
    private final String f10791a;

    /* renamed from: com.google.android.gms.common.internal.z$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f10792a;

        /* synthetic */ a(C5229c0 c5229c0) {
        }

        /* renamed from: a */
        public C5297z m13368a() {
            return new C5297z(this.f10792a, null);
        }

        /* renamed from: b */
        public a m13369b(String str) {
            this.f10792a = str;
            return this;
        }
    }

    /* synthetic */ C5297z(String str, C5232d0 c5232d0) {
        this.f10791a = str;
    }

    /* renamed from: a */
    public static a m13366a() {
        return new a(null);
    }

    /* renamed from: b */
    public final Bundle m13367b() {
        Bundle bundle = new Bundle();
        String str = this.f10791a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5297z) {
            return C5270q.m13304b(this.f10791a, ((C5297z) obj).f10791a);
        }
        return false;
    }

    public final int hashCode() {
        return C5270q.m13305c(this.f10791a);
    }
}
