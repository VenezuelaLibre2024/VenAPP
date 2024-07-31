package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import je.C9045b;
import je.InterfaceC9044a;
import p140he.AbstractC7717d;

/* renamed from: com.google.firebase.installations.i */
/* loaded from: classes.dex */
public final class C6202i {

    /* renamed from: b */
    public static final long f13208b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f13209c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C6202i f13210d;

    /* renamed from: a */
    private final InterfaceC9044a f13211a;

    private C6202i(InterfaceC9044a interfaceC9044a) {
        this.f13211a = interfaceC9044a;
    }

    /* renamed from: c */
    public static C6202i m16862c() {
        return m16863d(C9045b.m26554b());
    }

    /* renamed from: d */
    public static C6202i m16863d(InterfaceC9044a interfaceC9044a) {
        if (f13210d == null) {
            f13210d = new C6202i(interfaceC9044a);
        }
        return f13210d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m16864g(String str) {
        return f13209c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m16865h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m16866a() {
        return this.f13211a.mo26553a();
    }

    /* renamed from: b */
    public long m16867b() {
        return TimeUnit.MILLISECONDS.toSeconds(m16866a());
    }

    /* renamed from: e */
    public long m16868e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m16869f(AbstractC7717d abstractC7717d) {
        return TextUtils.isEmpty(abstractC7717d.mo23497b()) || abstractC7717d.mo23503h() + abstractC7717d.mo23498c() < m16867b() + f13208b;
    }
}
