package p092f0;

import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.C0666t;
import androidx.camera.core.impl.EnumC0648n;
import androidx.camera.core.impl.EnumC0654p;
import androidx.camera.core.impl.EnumC0657q;
import androidx.camera.core.impl.InterfaceC0663s;
import p407w.InterfaceC12011h0;

/* renamed from: f0.e */
/* loaded from: classes.dex */
public final class C7265e extends C7261a<InterfaceC0710o> {
    public C7265e(int i10, InterfaceC7263c<InterfaceC0710o> interfaceC7263c) {
        super(i10, interfaceC7263c);
    }

    /* renamed from: e */
    private boolean m21738e(InterfaceC12011h0 interfaceC12011h0) {
        InterfaceC0663s m3236a = C0666t.m3236a(interfaceC12011h0);
        return (m3236a.mo2383f() == EnumC0654p.LOCKED_FOCUSED || m3236a.mo2383f() == EnumC0654p.PASSIVE_FOCUSED) && m3236a.mo2385h() == EnumC0648n.CONVERGED && m3236a.mo2384g() == EnumC0657q.CONVERGED;
    }

    /* renamed from: d */
    public void m21739d(InterfaceC0710o interfaceC0710o) {
        if (m21738e(interfaceC0710o.mo2883e1())) {
            super.m21728b(interfaceC0710o);
        } else {
            this.f16269d.mo2864a(interfaceC0710o);
        }
    }
}
