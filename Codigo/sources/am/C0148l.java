package am;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C9322n;
import p319ql.EnumC10551z;

/* renamed from: am.l */
/* loaded from: classes3.dex */
public final class C0148l implements InterfaceC0149m {

    /* renamed from: a */
    private final a f583a;

    /* renamed from: b */
    private InterfaceC0149m f584b;

    /* renamed from: am.l$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: b */
        boolean mo652b(SSLSocket sSLSocket);

        /* renamed from: c */
        InterfaceC0149m mo653c(SSLSocket sSLSocket);
    }

    public C0148l(a socketAdapterFactory) {
        C9322n.m27781e(socketAdapterFactory, "socketAdapterFactory");
        this.f583a = socketAdapterFactory;
    }

    /* renamed from: e */
    private final synchronized InterfaceC0149m m661e(SSLSocket sSLSocket) {
        if (this.f584b == null && this.f583a.mo652b(sSLSocket)) {
            this.f584b = this.f583a.mo653c(sSLSocket);
        }
        return this.f584b;
    }

    @Override // am.InterfaceC0149m
    /* renamed from: a */
    public boolean mo633a() {
        return true;
    }

    @Override // am.InterfaceC0149m
    /* renamed from: b */
    public boolean mo634b(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        return this.f583a.mo652b(sslSocket);
    }

    @Override // am.InterfaceC0149m
    /* renamed from: c */
    public String mo635c(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        InterfaceC0149m m661e = m661e(sslSocket);
        if (m661e == null) {
            return null;
        }
        return m661e.mo635c(sslSocket);
    }

    @Override // am.InterfaceC0149m
    /* renamed from: d */
    public void mo636d(SSLSocket sslSocket, String str, List<? extends EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        InterfaceC0149m m661e = m661e(sslSocket);
        if (m661e == null) {
            return;
        }
        m661e.mo636d(sslSocket, str, protocols);
    }
}
