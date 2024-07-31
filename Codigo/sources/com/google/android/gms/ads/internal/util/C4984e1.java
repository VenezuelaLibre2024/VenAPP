package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.C4965t;

/* renamed from: com.google.android.gms.ads.internal.util.e1 */
/* loaded from: classes.dex */
public final class C4984e1 {

    /* renamed from: a */
    private long f10058a;

    /* renamed from: b */
    private long f10059b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f10060c = new Object();

    public C4984e1(long j10) {
        this.f10058a = j10;
    }

    /* renamed from: a */
    public final void m12628a(long j10) {
        synchronized (this.f10060c) {
            this.f10058a = j10;
        }
    }

    /* renamed from: b */
    public final boolean m12629b() {
        synchronized (this.f10060c) {
            long mo28131b = C4965t.m12565b().mo28131b();
            if (this.f10059b + this.f10058a > mo28131b) {
                return false;
            }
            this.f10059b = mo28131b;
            return true;
        }
    }
}
