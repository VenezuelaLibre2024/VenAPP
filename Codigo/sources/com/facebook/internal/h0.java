package com.facebook.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f7758a = new h0();

    /* renamed from: b, reason: collision with root package name */
    private static final String f7759b = h0.class.getName();

    private h0() {
    }

    public static final String a() {
        return "v16.0";
    }

    public static final String b() {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{i4.e0.u()}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    public static final Collection<String> d() {
        List l10;
        l10 = dk.r.l("service_disabled", "AndroidAuthKillSwitchException");
        return l10;
    }

    public static final Collection<String> e() {
        List l10;
        l10 = dk.r.l("access_denied", "OAuthAccessDeniedException");
        return l10;
    }

    public static final String f() {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{i4.e0.u()}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String g() {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("%s", Arrays.copyOf(new Object[]{i4.e0.v()}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String h() {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{i4.e0.x()}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String i(String subdomain) {
        kotlin.jvm.internal.n.e(subdomain, "subdomain");
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String j() {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{i4.e0.x()}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String k() {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{i4.e0.y()}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
