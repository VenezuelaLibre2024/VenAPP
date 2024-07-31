package com.facebook.internal;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p152i4.EnumC7823q0;
import p450xk.C12524p;

/* renamed from: com.facebook.internal.c0 */
/* loaded from: classes.dex */
public final class C4612c0 {

    /* renamed from: e */
    public static final a f8694e = new a(null);

    /* renamed from: f */
    private static final HashMap<String, String> f8695f = new HashMap<>();

    /* renamed from: a */
    private final EnumC7823q0 f8696a;

    /* renamed from: b */
    private final String f8697b;

    /* renamed from: c */
    private StringBuilder f8698c;

    /* renamed from: d */
    private int f8699d;

    /* renamed from: com.facebook.internal.c0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: f */
        private final synchronized String m11136f(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : C4612c0.f8695f.entrySet()) {
                str2 = C12524p.m41027A(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return str2;
        }

        /* renamed from: a */
        public final void m11137a(EnumC7823q0 behavior, int i10, String tag, String string) {
            boolean m41031E;
            C9322n.m27781e(behavior, "behavior");
            C9322n.m27781e(tag, "tag");
            C9322n.m27781e(string, "string");
            if (C7799e0.m23835H(behavior)) {
                String m11136f = m11136f(string);
                m41031E = C12524p.m41031E(tag, "FacebookSDK.", false, 2, null);
                if (!m41031E) {
                    tag = C9322n.m27787k("FacebookSDK.", tag);
                }
                Log.println(i10, tag, m11136f);
                if (behavior == EnumC7823q0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void m11138b(EnumC7823q0 behavior, String tag, String string) {
            C9322n.m27781e(behavior, "behavior");
            C9322n.m27781e(tag, "tag");
            C9322n.m27781e(string, "string");
            m11137a(behavior, 3, tag, string);
        }

        /* renamed from: c */
        public final void m11139c(EnumC7823q0 behavior, String tag, String format, Object... args) {
            C9322n.m27781e(behavior, "behavior");
            C9322n.m27781e(tag, "tag");
            C9322n.m27781e(format, "format");
            C9322n.m27781e(args, "args");
            if (C7799e0.m23835H(behavior)) {
                C9308a0 c9308a0 = C9308a0.f22565a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                C9322n.m27780d(format2, "java.lang.String.format(format, *args)");
                m11137a(behavior, 3, tag, format2);
            }
        }

        /* renamed from: d */
        public final synchronized void m11140d(String accessToken) {
            C9322n.m27781e(accessToken, "accessToken");
            C7799e0 c7799e0 = C7799e0.f18601a;
            if (!C7799e0.m23835H(EnumC7823q0.INCLUDE_ACCESS_TOKENS)) {
                m11141e(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        /* renamed from: e */
        public final synchronized void m11141e(String original, String replace) {
            C9322n.m27781e(original, "original");
            C9322n.m27781e(replace, "replace");
            C4612c0.f8695f.put(original, replace);
        }
    }

    public C4612c0(EnumC7823q0 behavior, String tag) {
        C9322n.m27781e(behavior, "behavior");
        C9322n.m27781e(tag, "tag");
        this.f8699d = 3;
        this.f8696a = behavior;
        this.f8697b = C9322n.m27787k("FacebookSDK.", C4636o0.m11360k(tag, "tag"));
        this.f8698c = new StringBuilder();
    }

    /* renamed from: g */
    private final boolean m11130g() {
        C7799e0 c7799e0 = C7799e0.f18601a;
        return C7799e0.m23835H(this.f8696a);
    }

    /* renamed from: b */
    public final void m11131b(String string) {
        C9322n.m27781e(string, "string");
        if (m11130g()) {
            this.f8698c.append(string);
        }
    }

    /* renamed from: c */
    public final void m11132c(String format, Object... args) {
        C9322n.m27781e(format, "format");
        C9322n.m27781e(args, "args");
        if (m11130g()) {
            StringBuilder sb2 = this.f8698c;
            C9308a0 c9308a0 = C9308a0.f22565a;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            C9322n.m27780d(format2, "java.lang.String.format(format, *args)");
            sb2.append(format2);
        }
    }

    /* renamed from: d */
    public final void m11133d(String key, Object value) {
        C9322n.m27781e(key, "key");
        C9322n.m27781e(value, "value");
        m11132c("  %s:\t%s\n", key, value);
    }

    /* renamed from: e */
    public final void m11134e() {
        String sb2 = this.f8698c.toString();
        C9322n.m27780d(sb2, "contents.toString()");
        m11135f(sb2);
        this.f8698c = new StringBuilder();
    }

    /* renamed from: f */
    public final void m11135f(String string) {
        C9322n.m27781e(string, "string");
        f8694e.m11137a(this.f8696a, this.f8699d, this.f8697b, string);
    }
}
