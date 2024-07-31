package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.o;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7622b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final r f7623a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final h0 a(String activityName, String str, i4.a aVar) {
            kotlin.jvm.internal.n.e(activityName, "activityName");
            return new h0(activityName, str, aVar);
        }

        public final Executor b() {
            return r.f7665c.h();
        }

        public final o.b c() {
            return r.f7665c.j();
        }

        public final String d() {
            return r.f7665c.l();
        }

        public final void e(Map<String, String> ud2) {
            kotlin.jvm.internal.n.e(ud2, "ud");
            l0.g(ud2);
        }
    }

    public h0(Context context) {
        this(new r(context, (String) null, (i4.a) null));
    }

    public h0(Context context, String str) {
        this(new r(context, str, (i4.a) null));
    }

    public h0(r loggerImpl) {
        kotlin.jvm.internal.n.e(loggerImpl, "loggerImpl");
        this.f7623a = loggerImpl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(String activityName, String str, i4.a aVar) {
        this(new r(activityName, str, aVar));
        kotlin.jvm.internal.n.e(activityName, "activityName");
    }

    public final void a() {
        this.f7623a.j();
    }

    public final void b(Bundle parameters) {
        kotlin.jvm.internal.n.e(parameters, "parameters");
        if (((parameters.getInt("previous") & 2) != 0) || i4.e0.p()) {
            this.f7623a.o("fb_sdk_settings_changed", null, parameters);
        }
    }

    public final void c(String str, double d10, Bundle bundle) {
        if (i4.e0.p()) {
            this.f7623a.k(str, d10, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (i4.e0.p()) {
            this.f7623a.l(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.f7623a.n(str, str2);
    }

    public final void f(String str) {
        if (i4.e0.p()) {
            this.f7623a.o(str, null, null);
        }
    }

    public final void g(String str, Bundle bundle) {
        if (i4.e0.p()) {
            this.f7623a.o(str, null, bundle);
        }
    }

    public final void h(String str, Double d10, Bundle bundle) {
        if (i4.e0.p()) {
            this.f7623a.o(str, d10, bundle);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (i4.e0.p()) {
            this.f7623a.p(str, bigDecimal, currency, bundle);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (i4.e0.p()) {
            this.f7623a.r(bigDecimal, currency, bundle);
        }
    }
}
