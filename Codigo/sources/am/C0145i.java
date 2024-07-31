package am;

import am.C0148l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p319ql.EnumC10551z;
import p495zl.C13141c;
import p495zl.C13148j;

/* renamed from: am.i */
/* loaded from: classes3.dex */
public final class C0145i implements InterfaceC0149m {

    /* renamed from: a */
    public static final b f575a = new b(null);

    /* renamed from: b */
    private static final C0148l.a f576b = new a();

    /* renamed from: am.i$a */
    /* loaded from: classes3.dex */
    public static final class a implements C0148l.a {
        a() {
        }

        @Override // am.C0148l.a
        /* renamed from: b */
        public boolean mo652b(SSLSocket sslSocket) {
            C9322n.m27781e(sslSocket, "sslSocket");
            return C13141c.f35514e.m43355b() && (sslSocket instanceof BCSSLSocket);
        }

        @Override // am.C0148l.a
        /* renamed from: c */
        public InterfaceC0149m mo653c(SSLSocket sslSocket) {
            C9322n.m27781e(sslSocket, "sslSocket");
            return new C0145i();
        }
    }

    /* renamed from: am.i$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C0148l.a m655a() {
            return C0145i.f576b;
        }
    }

    @Override // am.InterfaceC0149m
    /* renamed from: a */
    public boolean mo633a() {
        return C13141c.f35514e.m43355b();
    }

    @Override // am.InterfaceC0149m
    /* renamed from: b */
    public boolean mo634b(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // am.InterfaceC0149m
    /* renamed from: c */
    public String mo635c(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : C9322n.m27777a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // am.InterfaceC0149m
    /* renamed from: d */
    public void mo636d(SSLSocket sslSocket, String str, List<? extends EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        if (mo634b(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = C13148j.f35535a.m43383b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
