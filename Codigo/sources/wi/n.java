package wi;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    static final List<io.grpc.okhttp.internal.i> f30153a = Collections.unmodifiableList(Arrays.asList(io.grpc.okhttp.internal.i.HTTP_2));

    static String a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i10, io.grpc.okhttp.internal.b bVar) {
        eb.o.p(sSLSocketFactory, "sslSocketFactory");
        eb.o.p(socket, "socket");
        eb.o.p(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        bVar.c(sSLSocket, false);
        String h10 = k.e().h(sSLSocket, str, bVar.f() ? f30153a : null);
        List<io.grpc.okhttp.internal.i> list = f30153a;
        eb.o.y(list.contains(io.grpc.okhttp.internal.i.b(h10)), "Only " + list + " are supported, but negotiated protocol is %s", h10);
        if (hostnameVerifier == null) {
            hostnameVerifier = io.grpc.okhttp.internal.f.f19439a;
        }
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
