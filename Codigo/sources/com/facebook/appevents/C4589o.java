package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7787a;

/* renamed from: com.facebook.appevents.o */
/* loaded from: classes.dex */
public final class C4589o {

    /* renamed from: b */
    public static final a f8635b = new a(null);

    /* renamed from: c */
    private static final String f8636c = C4589o.class.getCanonicalName();

    /* renamed from: a */
    private final C4592r f8637a;

    /* renamed from: com.facebook.appevents.o$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m11050a(Application application, String str) {
            C9322n.m27781e(application, "application");
            C4592r.f8640c.m11086f(application, str);
        }

        /* renamed from: b */
        public final String m11051b(Context context) {
            C9322n.m27781e(context, "context");
            return C4592r.f8640c.m11089i(context);
        }

        /* renamed from: c */
        public final b m11052c() {
            return C4592r.f8640c.m11090j();
        }

        /* renamed from: d */
        public final String m11053d() {
            return C4567c.m10937b();
        }

        /* renamed from: e */
        public final void m11054e(Context context, String str) {
            C9322n.m27781e(context, "context");
            C4592r.f8640c.m11093m(context, str);
        }

        /* renamed from: f */
        public final C4589o m11055f(Context context) {
            C9322n.m27781e(context, "context");
            return new C4589o(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* renamed from: g */
        public final void m11056g() {
            C4592r.f8640c.m11094s();
        }
    }

    /* renamed from: com.facebook.appevents.o$b */
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

    private C4589o(Context context, String str, C7787a c7787a) {
        this.f8637a = new C4592r(context, str, c7787a);
    }

    public /* synthetic */ C4589o(Context context, String str, C7787a c7787a, C9315g c9315g) {
        this(context, str, c7787a);
    }

    /* renamed from: a */
    public final void m11048a() {
        this.f8637a.m11067j();
    }

    /* renamed from: b */
    public final void m11049b(String str, Bundle bundle) {
        this.f8637a.m11069l(str, bundle);
    }
}
