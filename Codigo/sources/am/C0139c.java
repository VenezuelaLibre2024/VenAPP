package am;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.EnumC10551z;
import p495zl.C13148j;

/* renamed from: am.c */
/* loaded from: classes3.dex */
public final class C0139c implements InterfaceC0149m {

    /* renamed from: a */
    public static final a f559a = new a(null);

    /* renamed from: am.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC0149m m637a() {
            if (m638b()) {
                return new C0139c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m638b() {
            return C13148j.f35535a.m43386h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // am.InterfaceC0149m
    /* renamed from: a */
    public boolean mo633a() {
        return f559a.m638b();
    }

    @Override // am.InterfaceC0149m
    /* renamed from: b */
    public boolean mo634b(SSLSocket sslSocket) {
        boolean isSupportedSocket;
        C9322n.m27781e(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // am.InterfaceC0149m
    /* renamed from: c */
    public String mo635c(SSLSocket sslSocket) {
        String applicationProtocol;
        C9322n.m27781e(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
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
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            Object[] array = C13148j.f35535a.m43383b(protocols).toArray(new String[0]);
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
