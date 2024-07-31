package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class v4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final t4 f10694a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10695b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f10696c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f10697d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10698e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, List<String>> f10699f;

    private v4(String str, t4 t4Var, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        com.google.android.gms.common.internal.s.j(t4Var);
        this.f10694a = t4Var;
        this.f10695b = i10;
        this.f10696c = th2;
        this.f10697d = bArr;
        this.f10698e = str;
        this.f10699f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10694a.a(this.f10698e, this.f10695b, this.f10696c, this.f10697d, this.f10699f);
    }
}
