package com.google.crypto.tink.internal;

import java.util.concurrent.atomic.AtomicReference;
import p366tb.C11236c;
import p366tb.InterfaceC11235b;

/* renamed from: com.google.crypto.tink.internal.g */
/* loaded from: classes2.dex */
public final class C5935g {

    /* renamed from: b */
    private static final C5935g f12506b = new C5935g();

    /* renamed from: c */
    private static final b f12507c = new b();

    /* renamed from: a */
    private final AtomicReference<InterfaceC11235b> f12508a = new AtomicReference<>();

    /* renamed from: com.google.crypto.tink.internal.g$b */
    /* loaded from: classes2.dex */
    private static class b implements InterfaceC11235b {
        private b() {
        }

        @Override // p366tb.InterfaceC11235b
        /* renamed from: a */
        public InterfaceC11235b.a mo15226a(C11236c c11236c, String str, String str2) {
            return C5934f.f12504a;
        }
    }

    /* renamed from: b */
    public static C5935g m15224b() {
        return f12506b;
    }

    /* renamed from: a */
    public InterfaceC11235b m15225a() {
        InterfaceC11235b interfaceC11235b = this.f12508a.get();
        return interfaceC11235b == null ? f12507c : interfaceC11235b;
    }
}
