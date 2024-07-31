package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public final class x extends e {

    /* renamed from: c */
    public static final a f7882c = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Uri a(String action, Bundle bundle) {
            kotlin.jvm.internal.n.e(action, "action");
            if (kotlin.jvm.internal.n.a(action, Constants.SIGN_IN_METHOD_OAUTH)) {
                n0 n0Var = n0.f7780a;
                return n0.g(h0.k(), "oauth/authorize", bundle);
            }
            n0 n0Var2 = n0.f7780a;
            return n0.g(h0.k(), i4.e0.w() + "/dialog/" + action, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String action, Bundle bundle) {
        super(action, bundle);
        kotlin.jvm.internal.n.e(action, "action");
        b(f7882c.a(action, bundle == null ? new Bundle() : bundle));
    }
}
