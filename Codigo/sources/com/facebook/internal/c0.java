package com.facebook.internal;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7719e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String> f7720f = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final i4.q0 f7721a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7722b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f7723c;

    /* renamed from: d, reason: collision with root package name */
    private int f7724d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final synchronized String f(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : c0.f7720f.entrySet()) {
                str2 = xk.p.A(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return str2;
        }

        public final void a(i4.q0 behavior, int i10, String tag, String string) {
            boolean E;
            kotlin.jvm.internal.n.e(behavior, "behavior");
            kotlin.jvm.internal.n.e(tag, "tag");
            kotlin.jvm.internal.n.e(string, "string");
            if (i4.e0.H(behavior)) {
                String f10 = f(string);
                E = xk.p.E(tag, "FacebookSDK.", false, 2, null);
                if (!E) {
                    tag = kotlin.jvm.internal.n.k("FacebookSDK.", tag);
                }
                Log.println(i10, tag, f10);
                if (behavior == i4.q0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(i4.q0 behavior, String tag, String string) {
            kotlin.jvm.internal.n.e(behavior, "behavior");
            kotlin.jvm.internal.n.e(tag, "tag");
            kotlin.jvm.internal.n.e(string, "string");
            a(behavior, 3, tag, string);
        }

        public final void c(i4.q0 behavior, String tag, String format, Object... args) {
            kotlin.jvm.internal.n.e(behavior, "behavior");
            kotlin.jvm.internal.n.e(tag, "tag");
            kotlin.jvm.internal.n.e(format, "format");
            kotlin.jvm.internal.n.e(args, "args");
            if (i4.e0.H(behavior)) {
                kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.n.d(format2, "java.lang.String.format(format, *args)");
                a(behavior, 3, tag, format2);
            }
        }

        public final synchronized void d(String accessToken) {
            kotlin.jvm.internal.n.e(accessToken, "accessToken");
            i4.e0 e0Var = i4.e0.f16948a;
            if (!i4.e0.H(i4.q0.INCLUDE_ACCESS_TOKENS)) {
                e(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String original, String replace) {
            kotlin.jvm.internal.n.e(original, "original");
            kotlin.jvm.internal.n.e(replace, "replace");
            c0.f7720f.put(original, replace);
        }
    }

    public c0(i4.q0 behavior, String tag) {
        kotlin.jvm.internal.n.e(behavior, "behavior");
        kotlin.jvm.internal.n.e(tag, "tag");
        this.f7724d = 3;
        this.f7721a = behavior;
        this.f7722b = kotlin.jvm.internal.n.k("FacebookSDK.", o0.k(tag, "tag"));
        this.f7723c = new StringBuilder();
    }

    private final boolean g() {
        i4.e0 e0Var = i4.e0.f16948a;
        return i4.e0.H(this.f7721a);
    }

    public final void b(String string) {
        kotlin.jvm.internal.n.e(string, "string");
        if (g()) {
            this.f7723c.append(string);
        }
    }

    public final void c(String format, Object... args) {
        kotlin.jvm.internal.n.e(format, "format");
        kotlin.jvm.internal.n.e(args, "args");
        if (g()) {
            StringBuilder sb2 = this.f7723c;
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            kotlin.jvm.internal.n.d(format2, "java.lang.String.format(format, *args)");
            sb2.append(format2);
        }
    }

    public final void d(String key, Object value) {
        kotlin.jvm.internal.n.e(key, "key");
        kotlin.jvm.internal.n.e(value, "value");
        c("  %s:\t%s\n", key, value);
    }

    public final void e() {
        String sb2 = this.f7723c.toString();
        kotlin.jvm.internal.n.d(sb2, "contents.toString()");
        f(sb2);
        this.f7723c = new StringBuilder();
    }

    public final void f(String string) {
        kotlin.jvm.internal.n.e(string, "string");
        f7719e.a(this.f7721a, this.f7724d, this.f7722b, string);
    }
}
