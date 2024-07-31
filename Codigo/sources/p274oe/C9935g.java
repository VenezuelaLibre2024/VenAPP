package p274oe;

import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.C6344c;
import ee.InterfaceC7183b;
import p029bk.InterfaceC1806a;
import p098f6.InterfaceC7303g;
import p106fe.InterfaceC7337f;
import p485zb.C12867g;

/* renamed from: oe.g */
/* loaded from: classes.dex */
public final class C9935g implements InterfaceC1806a {

    /* renamed from: a */
    private final InterfaceC1806a<C12867g> f24465a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC7183b<C6344c>> f24466b;

    /* renamed from: c */
    private final InterfaceC1806a<InterfaceC7337f> f24467c;

    /* renamed from: d */
    private final InterfaceC1806a<InterfaceC7183b<InterfaceC7303g>> f24468d;

    /* renamed from: e */
    private final InterfaceC1806a<RemoteConfigManager> f24469e;

    /* renamed from: f */
    private final InterfaceC1806a<C6277a> f24470f;

    /* renamed from: g */
    private final InterfaceC1806a<SessionManager> f24471g;

    public C9935g(InterfaceC1806a<C12867g> interfaceC1806a, InterfaceC1806a<InterfaceC7183b<C6344c>> interfaceC1806a2, InterfaceC1806a<InterfaceC7337f> interfaceC1806a3, InterfaceC1806a<InterfaceC7183b<InterfaceC7303g>> interfaceC1806a4, InterfaceC1806a<RemoteConfigManager> interfaceC1806a5, InterfaceC1806a<C6277a> interfaceC1806a6, InterfaceC1806a<SessionManager> interfaceC1806a7) {
        this.f24465a = interfaceC1806a;
        this.f24466b = interfaceC1806a2;
        this.f24467c = interfaceC1806a3;
        this.f24468d = interfaceC1806a4;
        this.f24469e = interfaceC1806a5;
        this.f24470f = interfaceC1806a6;
        this.f24471g = interfaceC1806a7;
    }

    /* renamed from: a */
    public static C9935g m29668a(InterfaceC1806a<C12867g> interfaceC1806a, InterfaceC1806a<InterfaceC7183b<C6344c>> interfaceC1806a2, InterfaceC1806a<InterfaceC7337f> interfaceC1806a3, InterfaceC1806a<InterfaceC7183b<InterfaceC7303g>> interfaceC1806a4, InterfaceC1806a<RemoteConfigManager> interfaceC1806a5, InterfaceC1806a<C6277a> interfaceC1806a6, InterfaceC1806a<SessionManager> interfaceC1806a7) {
        return new C9935g(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4, interfaceC1806a5, interfaceC1806a6, interfaceC1806a7);
    }

    /* renamed from: c */
    public static C9933e m29669c(C12867g c12867g, InterfaceC7183b<C6344c> interfaceC7183b, InterfaceC7337f interfaceC7337f, InterfaceC7183b<InterfaceC7303g> interfaceC7183b2, RemoteConfigManager remoteConfigManager, C6277a c6277a, SessionManager sessionManager) {
        return new C9933e(c12867g, interfaceC7183b, interfaceC7337f, interfaceC7183b2, remoteConfigManager, c6277a, sessionManager);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9933e get() {
        return m29669c(this.f24465a.get(), this.f24466b.get(), this.f24467c.get(), this.f24468d.get(), this.f24469e.get(), this.f24470f.get(), this.f24471g.get());
    }
}
