package p425wi;

import io.grpc.okhttp.internal.C8920b;
import io.grpc.okhttp.internal.C8924f;
import io.grpc.okhttp.internal.EnumC8927i;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p082eb.C7159o;

/* renamed from: wi.n */
/* loaded from: classes3.dex */
final class C12213n {

    /* renamed from: a */
    static final List<EnumC8927i> f32665a = Collections.unmodifiableList(Arrays.asList(EnumC8927i.HTTP_2));

    /* renamed from: a */
    static String m39316a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    /* renamed from: b */
    public static SSLSocket m39317b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i10, C8920b c8920b) {
        C7159o.m21313p(sSLSocketFactory, "sslSocketFactory");
        C7159o.m21313p(socket, "socket");
        C7159o.m21313p(c8920b, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        c8920b.m26039c(sSLSocket, false);
        String mo39311h = C12210k.m39306e().mo39311h(sSLSocket, str, c8920b.m26041f() ? f32665a : null);
        List<EnumC8927i> list = f32665a;
        C7159o.m21322y(list.contains(EnumC8927i.m26100b(mo39311h)), "Only " + list + " are supported, but negotiated protocol is %s", mo39311h);
        if (hostnameVerifier == null) {
            hostnameVerifier = C8924f.f21190a;
        }
        if (hostnameVerifier.verify(m39316a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
