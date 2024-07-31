package com.facebook.internal;

import dk.C7031r;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;

/* renamed from: com.facebook.internal.h0 */
/* loaded from: classes.dex */
public final class C4622h0 {

    /* renamed from: a */
    public static final C4622h0 f8733a = new C4622h0();

    /* renamed from: b */
    private static final String f8734b = C4622h0.class.getName();

    private C4622h0() {
    }

    /* renamed from: a */
    public static final String m11210a() {
        return "v16.0";
    }

    /* renamed from: b */
    public static final String m11211b() {
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{C7799e0.m23869u()}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: c */
    public static final String m11212c() {
        return "CONNECTION_FAILURE";
    }

    /* renamed from: d */
    public static final Collection<String> m11213d() {
        List m20584l;
        m20584l = C7031r.m20584l("service_disabled", "AndroidAuthKillSwitchException");
        return m20584l;
    }

    /* renamed from: e */
    public static final Collection<String> m11214e() {
        List m20584l;
        m20584l = C7031r.m20584l("access_denied", "OAuthAccessDeniedException");
        return m20584l;
    }

    /* renamed from: f */
    public static final String m11215f() {
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C7799e0.m23869u()}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: g */
    public static final String m11216g() {
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("%s", Arrays.copyOf(new Object[]{C7799e0.m23870v()}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: h */
    public static final String m11217h() {
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C7799e0.m23872x()}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: i */
    public static final String m11218i(String subdomain) {
        C9322n.m27781e(subdomain, "subdomain");
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: j */
    public static final String m11219j() {
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{C7799e0.m23872x()}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: k */
    public static final String m11220k() {
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{C7799e0.m23873y()}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
