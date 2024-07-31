package p205kj;

import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;

/* renamed from: kj.e */
/* loaded from: classes3.dex */
public final class C9287e extends AtomicReference<InterfaceC7578b> implements InterfaceC7578b {
    private static final long serialVersionUID = -754898800686245608L;

    /* renamed from: a */
    public boolean m27708a(InterfaceC7578b interfaceC7578b) {
        return EnumC9284b.m27694l(this, interfaceC7578b);
    }

    /* renamed from: b */
    public boolean m27709b(InterfaceC7578b interfaceC7578b) {
        return EnumC9284b.m27696n(this, interfaceC7578b);
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
        EnumC9284b.m27692b(this);
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return EnumC9284b.m27693i(get());
    }
}
