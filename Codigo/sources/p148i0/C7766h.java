package p148i0;

import androidx.camera.core.impl.C0620f2;
import androidx.camera.core.impl.EnumC0648n;
import androidx.camera.core.impl.EnumC0654p;
import androidx.camera.core.impl.EnumC0657q;
import androidx.camera.core.impl.EnumC0660r;
import androidx.camera.core.impl.InterfaceC0663s;

/* renamed from: i0.h */
/* loaded from: classes.dex */
public class C7766h implements InterfaceC0663s {

    /* renamed from: a */
    private final InterfaceC0663s f18518a;

    /* renamed from: b */
    private final C0620f2 f18519b;

    /* renamed from: c */
    private final long f18520c;

    public C7766h(C0620f2 c0620f2, long j10) {
        this(null, c0620f2, j10);
    }

    public C7766h(C0620f2 c0620f2, InterfaceC0663s interfaceC0663s) {
        this(interfaceC0663s, c0620f2, -1L);
    }

    private C7766h(InterfaceC0663s interfaceC0663s, C0620f2 c0620f2, long j10) {
        this.f18518a = interfaceC0663s;
        this.f18519b = c0620f2;
        this.f18520c = j10;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: b */
    public C0620f2 mo2379b() {
        return this.f18519b;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: c */
    public long mo2380c() {
        InterfaceC0663s interfaceC0663s = this.f18518a;
        if (interfaceC0663s != null) {
            return interfaceC0663s.mo2380c();
        }
        long j10 = this.f18520c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: d */
    public EnumC0660r mo2381d() {
        InterfaceC0663s interfaceC0663s = this.f18518a;
        return interfaceC0663s != null ? interfaceC0663s.mo2381d() : EnumC0660r.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: f */
    public EnumC0654p mo2383f() {
        InterfaceC0663s interfaceC0663s = this.f18518a;
        return interfaceC0663s != null ? interfaceC0663s.mo2383f() : EnumC0654p.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: g */
    public EnumC0657q mo2384g() {
        InterfaceC0663s interfaceC0663s = this.f18518a;
        return interfaceC0663s != null ? interfaceC0663s.mo2384g() : EnumC0657q.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC0663s
    /* renamed from: h */
    public EnumC0648n mo2385h() {
        InterfaceC0663s interfaceC0663s = this.f18518a;
        return interfaceC0663s != null ? interfaceC0663s.mo2385h() : EnumC0648n.UNKNOWN;
    }
}
