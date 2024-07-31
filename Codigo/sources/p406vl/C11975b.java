package p406vl;

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
import kotlin.jvm.internal.C9322n;
import p319ql.C10537l;

/* renamed from: vl.b */
/* loaded from: classes3.dex */
public final class C11975b {

    /* renamed from: a */
    private final List<C10537l> f31746a;

    /* renamed from: b */
    private int f31747b;

    /* renamed from: c */
    private boolean f31748c;

    /* renamed from: d */
    private boolean f31749d;

    public C11975b(List<C10537l> connectionSpecs) {
        C9322n.m27781e(connectionSpecs, "connectionSpecs");
        this.f31746a = connectionSpecs;
    }

    /* renamed from: c */
    private final boolean m38395c(SSLSocket sSLSocket) {
        int i10 = this.f31747b;
        int size = this.f31746a.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (this.f31746a.get(i10).m31754e(sSLSocket)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    /* renamed from: a */
    public final C10537l m38396a(SSLSocket sslSocket) {
        C10537l c10537l;
        C9322n.m27781e(sslSocket, "sslSocket");
        int i10 = this.f31747b;
        int size = this.f31746a.size();
        while (true) {
            if (i10 >= size) {
                c10537l = null;
                break;
            }
            int i11 = i10 + 1;
            c10537l = this.f31746a.get(i10);
            if (c10537l.m31754e(sslSocket)) {
                this.f31747b = i11;
                break;
            }
            i10 = i11;
        }
        if (c10537l != null) {
            this.f31748c = m38395c(sslSocket);
            c10537l.m31752c(sslSocket, this.f31749d);
            return c10537l;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f31749d);
        sb2.append(", modes=");
        sb2.append(this.f31746a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        C9322n.m27778b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C9322n.m27780d(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    /* renamed from: b */
    public final boolean m38397b(IOException e10) {
        C9322n.m27781e(e10, "e");
        this.f31749d = true;
        return (!this.f31748c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException) || ((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
