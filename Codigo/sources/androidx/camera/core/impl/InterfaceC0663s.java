package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.utils.C0681j;

/* renamed from: androidx.camera.core.impl.s */
/* loaded from: classes.dex */
public interface InterfaceC0663s {

    /* renamed from: androidx.camera.core.impl.s$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0663s {
        /* renamed from: i */
        public static InterfaceC0663s m3235i() {
            return new a();
        }

        @Override // androidx.camera.core.impl.InterfaceC0663s
        /* renamed from: b */
        public C0620f2 mo2379b() {
            return C0620f2.m3069b();
        }

        @Override // androidx.camera.core.impl.InterfaceC0663s
        /* renamed from: c */
        public long mo2380c() {
            return -1L;
        }

        @Override // androidx.camera.core.impl.InterfaceC0663s
        /* renamed from: d */
        public EnumC0660r mo2381d() {
            return EnumC0660r.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC0663s
        /* renamed from: f */
        public EnumC0654p mo2383f() {
            return EnumC0654p.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC0663s
        /* renamed from: g */
        public EnumC0657q mo2384g() {
            return EnumC0657q.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC0663s
        /* renamed from: h */
        public EnumC0648n mo2385h() {
            return EnumC0648n.UNKNOWN;
        }
    }

    /* renamed from: a */
    default void mo2378a(C0681j.b bVar) {
        bVar.m3316g(mo2381d());
    }

    /* renamed from: b */
    C0620f2 mo2379b();

    /* renamed from: c */
    long mo2380c();

    /* renamed from: d */
    EnumC0660r mo2381d();

    /* renamed from: e */
    default CaptureResult mo2382e() {
        return a.m3235i().mo2382e();
    }

    /* renamed from: f */
    EnumC0654p mo2383f();

    /* renamed from: g */
    EnumC0657q mo2384g();

    /* renamed from: h */
    EnumC0648n mo2385h();
}
