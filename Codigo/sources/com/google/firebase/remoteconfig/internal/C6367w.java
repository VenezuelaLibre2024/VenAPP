package com.google.firebase.remoteconfig.internal;

import p488ze.InterfaceC13017n;

/* renamed from: com.google.firebase.remoteconfig.internal.w */
/* loaded from: classes2.dex */
public class C6367w implements InterfaceC13017n {

    /* renamed from: a */
    private final String f13788a;

    /* renamed from: b */
    private final int f13789b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6367w(String str, int i10) {
        this.f13788a = str;
        this.f13789b = i10;
    }

    /* renamed from: f */
    private String m17757f() {
        return mo17760b().trim();
    }

    /* renamed from: g */
    private void m17758g() {
        if (this.f13788a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // p488ze.InterfaceC13017n
    /* renamed from: a */
    public int mo17759a() {
        return this.f13789b;
    }

    @Override // p488ze.InterfaceC13017n
    /* renamed from: b */
    public String mo17760b() {
        if (this.f13789b == 0) {
            return "";
        }
        m17758g();
        return this.f13788a;
    }

    @Override // p488ze.InterfaceC13017n
    /* renamed from: c */
    public long mo17761c() {
        if (this.f13789b == 0) {
            return 0L;
        }
        String m17757f = m17757f();
        try {
            return Long.valueOf(m17757f).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m17757f, "long"), e10);
        }
    }

    @Override // p488ze.InterfaceC13017n
    /* renamed from: d */
    public double mo17762d() {
        if (this.f13789b == 0) {
            return 0.0d;
        }
        String m17757f = m17757f();
        try {
            return Double.valueOf(m17757f).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m17757f, "double"), e10);
        }
    }

    @Override // p488ze.InterfaceC13017n
    /* renamed from: e */
    public boolean mo17763e() {
        if (this.f13789b == 0) {
            return false;
        }
        String m17757f = m17757f();
        if (C6359o.f13728f.matcher(m17757f).matches()) {
            return true;
        }
        if (C6359o.f13729g.matcher(m17757f).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m17757f, "boolean"));
    }
}
