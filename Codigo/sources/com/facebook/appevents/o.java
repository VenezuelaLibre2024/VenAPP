package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b */
    public static final a f7660b = new a(null);

    /* renamed from: c */
    private static final String f7661c = o.class.getCanonicalName();

    /* renamed from: a */
    private final r f7662a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(Application application, String str) {
            kotlin.jvm.internal.n.e(application, "application");
            r.f7665c.f(application, str);
        }

        public final String b(Context context) {
            kotlin.jvm.internal.n.e(context, "context");
            return r.f7665c.i(context);
        }

        public final b c() {
            return r.f7665c.j();
        }

        public final String d() {
            return c.b();
        }

        public final void e(Context context, String str) {
            kotlin.jvm.internal.n.e(context, "context");
            r.f7665c.m(context, str);
        }

        public final o f(Context context) {
            kotlin.jvm.internal.n.e(context, "context");
            return new o(context, null, null, null);
        }

        public final void g() {
            r.f7665c.s();
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    private o(Context context, String str, i4.a aVar) {
        this.f7662a = new r(context, str, aVar);
    }

    public /* synthetic */ o(Context context, String str, i4.a aVar, kotlin.jvm.internal.g gVar) {
        this(context, str, aVar);
    }

    public final void a() {
        this.f7662a.j();
    }

    public final void b(String str, Bundle bundle) {
        this.f7662a.l(str, bundle);
    }
}
