package vl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;
import ql.l;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<l> f29311a;

    /* renamed from: b, reason: collision with root package name */
    private int f29312b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29313c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29314d;

    public b(List<l> connectionSpecs) {
        n.e(connectionSpecs, "connectionSpecs");
        this.f29311a = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int i10 = this.f29312b;
        int size = this.f29311a.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (this.f29311a.get(i10).e(sSLSocket)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public final l a(SSLSocket sslSocket) {
        l lVar;
        n.e(sslSocket, "sslSocket");
        int i10 = this.f29312b;
        int size = this.f29311a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            int i11 = i10 + 1;
            lVar = this.f29311a.get(i10);
            if (lVar.e(sslSocket)) {
                this.f29312b = i11;
                break;
            }
            i10 = i11;
        }
        if (lVar != null) {
            this.f29313c = c(sslSocket);
            lVar.c(sslSocket, this.f29314d);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f29314d);
        sb2.append(", modes=");
        sb2.append(this.f29311a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        n.b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        n.d(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException e10) {
        n.e(e10, "e");
        this.f29314d = true;
        return (!this.f29313c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException) || ((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
