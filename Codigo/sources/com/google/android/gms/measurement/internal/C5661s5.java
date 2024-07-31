package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* loaded from: classes2.dex */
public final class C5661s5 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f11819a;

    /* renamed from: b */
    private final /* synthetic */ C5635q5 f11820b;

    public C5661s5(C5635q5 c5635q5, String str) {
        this.f11820b = c5635q5;
        C5276s.m13324j(str);
        this.f11819a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f11820b.zzj().m14182B().m14219b(this.f11819a, th2);
    }
}
