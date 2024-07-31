package am;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import ql.z;

/* loaded from: classes3.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f494a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final m a() {
            if (b()) {
                return new c();
            }
            return null;
        }

        public final boolean b() {
            return zl.j.f32984a.h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // am.m
    public boolean a() {
        return f494a.b();
    }

    @Override // am.m
    public boolean b(SSLSocket sslSocket) {
        boolean isSupportedSocket;
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // am.m
    public String c(SSLSocket sslSocket) {
        String applicationProtocol;
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : kotlin.jvm.internal.n.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // am.m
    public void d(SSLSocket sslSocket, String str, List<? extends z> protocols) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        kotlin.jvm.internal.n.e(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            Object[] array = zl.j.f32984a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
