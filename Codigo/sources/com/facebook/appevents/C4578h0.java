package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.C4589o;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7787a;
import p152i4.C7799e0;

/* renamed from: com.facebook.appevents.h0 */
/* loaded from: classes.dex */
public final class C4578h0 {

    /* renamed from: b */
    public static final a f8597b = new a(null);

    /* renamed from: a */
    private final C4592r f8598a;

    /* renamed from: com.facebook.appevents.h0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C4578h0 m11003a(String activityName, String str, C7787a c7787a) {
            C9322n.m27781e(activityName, "activityName");
            return new C4578h0(activityName, str, c7787a);
        }

        /* renamed from: b */
        public final Executor m11004b() {
            return C4592r.f8640c.m11088h();
        }

        /* renamed from: c */
        public final C4589o.b m11005c() {
            return C4592r.f8640c.m11090j();
        }

        /* renamed from: d */
        public final String m11006d() {
            return C4592r.f8640c.m11092l();
        }

        /* renamed from: e */
        public final void m11007e(Map<String, String> ud2) {
            C9322n.m27781e(ud2, "ud");
            C4586l0.m11022g(ud2);
        }
    }

    public C4578h0(Context context) {
        this(new C4592r(context, (String) null, (C7787a) null));
    }

    public C4578h0(Context context, String str) {
        this(new C4592r(context, str, (C7787a) null));
    }

    public C4578h0(C4592r loggerImpl) {
        C9322n.m27781e(loggerImpl, "loggerImpl");
        this.f8598a = loggerImpl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4578h0(String activityName, String str, C7787a c7787a) {
        this(new C4592r(activityName, str, c7787a));
        C9322n.m27781e(activityName, "activityName");
    }

    /* renamed from: a */
    public final void m10993a() {
        this.f8598a.m11067j();
    }

    /* renamed from: b */
    public final void m10994b(Bundle parameters) {
        C9322n.m27781e(parameters, "parameters");
        if (((parameters.getInt("previous") & 2) != 0) || C7799e0.m23864p()) {
            this.f8598a.m11072o("fb_sdk_settings_changed", null, parameters);
        }
    }

    /* renamed from: c */
    public final void m10995c(String str, double d10, Bundle bundle) {
        if (C7799e0.m23864p()) {
            this.f8598a.m11068k(str, d10, bundle);
        }
    }

    /* renamed from: d */
    public final void m10996d(String str, Bundle bundle) {
        if (C7799e0.m23864p()) {
            this.f8598a.m11069l(str, bundle);
        }
    }

    /* renamed from: e */
    public final void m10997e(String str, String str2) {
        this.f8598a.m11071n(str, str2);
    }

    /* renamed from: f */
    public final void m10998f(String str) {
        if (C7799e0.m23864p()) {
            this.f8598a.m11072o(str, null, null);
        }
    }

    /* renamed from: g */
    public final void m10999g(String str, Bundle bundle) {
        if (C7799e0.m23864p()) {
            this.f8598a.m11072o(str, null, bundle);
        }
    }

    /* renamed from: h */
    public final void m11000h(String str, Double d10, Bundle bundle) {
        if (C7799e0.m23864p()) {
            this.f8598a.m11072o(str, d10, bundle);
        }
    }

    /* renamed from: i */
    public final void m11001i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C7799e0.m23864p()) {
            this.f8598a.m11073p(str, bigDecimal, currency, bundle);
        }
    }

    /* renamed from: j */
    public final void m11002j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C7799e0.m23864p()) {
            this.f8598a.m11075r(bigDecimal, currency, bundle);
        }
    }
}
