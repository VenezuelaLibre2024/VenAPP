package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* loaded from: classes2.dex */
final class RunnableC5699v4 implements Runnable {

    /* renamed from: a */
    private final InterfaceC5673t4 f11892a;

    /* renamed from: b */
    private final int f11893b;

    /* renamed from: c */
    private final Throwable f11894c;

    /* renamed from: d */
    private final byte[] f11895d;

    /* renamed from: e */
    private final String f11896e;

    /* renamed from: f */
    private final Map<String, List<String>> f11897f;

    private RunnableC5699v4(String str, InterfaceC5673t4 interfaceC5673t4, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        C5276s.m13324j(interfaceC5673t4);
        this.f11892a = interfaceC5673t4;
        this.f11893b = i10;
        this.f11894c = th2;
        this.f11895d = bArr;
        this.f11896e = str;
        this.f11897f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11892a.mo13634a(this.f11896e, this.f11893b, this.f11894c, this.f11895d, this.f11897f);
    }
}
