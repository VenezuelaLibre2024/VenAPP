package am;

import am.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import ql.z;

/* loaded from: classes3.dex */
public final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final b f510a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final l.a f511b = new a();

    /* loaded from: classes3.dex */
    public static final class a implements l.a {
        a() {
        }

        @Override // am.l.a
        public boolean b(SSLSocket sslSocket) {
            kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
            return zl.c.f32963e.b() && (sslSocket instanceof BCSSLSocket);
        }

        @Override // am.l.a
        public m c(SSLSocket sslSocket) {
            kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
            return new i();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final l.a a() {
            return i.f511b;
        }
    }

    @Override // am.m
    public boolean a() {
        return zl.c.f32963e.b();
    }

    @Override // am.m
    public boolean b(SSLSocket sslSocket) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // am.m
    public String c(SSLSocket sslSocket) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : kotlin.jvm.internal.n.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // am.m
    public void d(SSLSocket sslSocket, String str, List<? extends z> protocols) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        kotlin.jvm.internal.n.e(protocols, "protocols");
        if (b(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = zl.j.f32984a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
