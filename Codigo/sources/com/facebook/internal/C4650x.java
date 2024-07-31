package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import io.flutter.plugins.firebase.auth.Constants;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;

/* renamed from: com.facebook.internal.x */
/* loaded from: classes.dex */
public final class C4650x extends C4615e {

    /* renamed from: c */
    public static final a f8862c = new a(null);

    /* renamed from: com.facebook.internal.x$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final Uri m11462a(String action, Bundle bundle) {
            C9322n.m27781e(action, "action");
            if (C9322n.m27777a(action, Constants.SIGN_IN_METHOD_OAUTH)) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                return C4634n0.m11305g(C4622h0.m11220k(), "oauth/authorize", bundle);
            }
            C4634n0 c4634n02 = C4634n0.f8760a;
            return C4634n0.m11305g(C4622h0.m11220k(), C7799e0.m23871w() + "/dialog/" + action, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4650x(String action, Bundle bundle) {
        super(action, bundle);
        C9322n.m27781e(action, "action");
        m11152b(f8862c.m11462a(action, bundle == null ? new Bundle() : bundle));
    }
}
