package com.google.crypto.tink.internal;

import java.util.concurrent.atomic.AtomicReference;
import tb.b;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f11291b = new g();

    /* renamed from: c, reason: collision with root package name */
    private static final b f11292c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<tb.b> f11293a = new AtomicReference<>();

    /* loaded from: classes2.dex */
    private static class b implements tb.b {
        private b() {
        }

        @Override // tb.b
        public b.a a(tb.c cVar, String str, String str2) {
            return f.f11289a;
        }
    }

    public static g b() {
        return f11291b;
    }

    public tb.b a() {
        tb.b bVar = this.f11293a.get();
        return bVar == null ? f11292c : bVar;
    }
}
