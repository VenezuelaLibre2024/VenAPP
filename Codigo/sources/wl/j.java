package wl;

import com.google.android.gms.common.api.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.n;
import ql.a0;
import ql.b0;
import ql.c0;
import ql.e0;
import ql.u;
import ql.v;
import ql.y;

/* loaded from: classes3.dex */
public final class j implements v {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30219b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final y f30220a;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public j(y client) {
        n.e(client, "client");
        this.f30220a = client;
    }

    private final a0 b(c0 c0Var, String str) {
        String n10;
        u p10;
        b0 b0Var = null;
        if (!this.f30220a.q() || (n10 = c0.n(c0Var, "Location", null, 2, null)) == null || (p10 = c0Var.O().i().p(n10)) == null) {
            return null;
        }
        if (!n.a(p10.q(), c0Var.O().i().q()) && !this.f30220a.r()) {
            return null;
        }
        a0.a h10 = c0Var.O().h();
        if (f.a(str)) {
            int g10 = c0Var.g();
            f fVar = f.f30205a;
            boolean z10 = fVar.c(str) || g10 == 308 || g10 == 307;
            if (fVar.b(str) && g10 != 308 && g10 != 307) {
                str = "GET";
            } else if (z10) {
                b0Var = c0Var.O().a();
            }
            h10.f(str, b0Var);
            if (!z10) {
                h10.j("Transfer-Encoding");
                h10.j("Content-Length");
                h10.j("Content-Type");
            }
        }
        if (!rl.d.j(c0Var.O().i(), p10)) {
            h10.j("Authorization");
        }
        return h10.p(p10).b();
    }

    private final a0 c(c0 c0Var, vl.c cVar) {
        vl.f h10;
        e0 z10 = (cVar == null || (h10 = cVar.h()) == null) ? null : h10.z();
        int g10 = c0Var.g();
        String g11 = c0Var.O().g();
        if (g10 != 307 && g10 != 308) {
            if (g10 == 401) {
                return this.f30220a.c().a(z10, c0Var);
            }
            if (g10 == 421) {
                b0 a10 = c0Var.O().a();
                if ((a10 != null && a10.e()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().x();
                return c0Var.O();
            }
            if (g10 == 503) {
                c0 E = c0Var.E();
                if ((E == null || E.g() != 503) && g(c0Var, a.e.API_PRIORITY_OTHER) == 0) {
                    return c0Var.O();
                }
                return null;
            }
            if (g10 == 407) {
                n.b(z10);
                if (z10.b().type() == Proxy.Type.HTTP) {
                    return this.f30220a.B().a(z10, c0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (g10 == 408) {
                if (!this.f30220a.E()) {
                    return null;
                }
                b0 a11 = c0Var.O().a();
                if (a11 != null && a11.e()) {
                    return null;
                }
                c0 E2 = c0Var.E();
                if ((E2 == null || E2.g() != 408) && g(c0Var, 0) <= 0) {
                    return c0Var.O();
                }
                return null;
            }
            switch (g10) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(c0Var, g11);
    }

    private final boolean d(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException iOException, vl.e eVar, a0 a0Var, boolean z10) {
        if (this.f30220a.E()) {
            return !(z10 && f(iOException, a0Var)) && d(iOException, z10) && eVar.z();
        }
        return false;
    }

    private final boolean f(IOException iOException, a0 a0Var) {
        b0 a10 = a0Var.a();
        return (a10 != null && a10.e()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(c0 c0Var, int i10) {
        String n10 = c0.n(c0Var, "Retry-After", null, 2, null);
        if (n10 == null) {
            return i10;
        }
        if (!new xk.f("\\d+").a(n10)) {
            return a.e.API_PRIORITY_OTHER;
        }
        Integer valueOf = Integer.valueOf(n10);
        n.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r0 = r0.B().p(r7.B().b(null).c()).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r7 = r0;
        r0 = r1.q();
        r6 = c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r6 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        r0 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r0.e() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r1.j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r0 = r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r8 > 20) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        throw new java.net.ProtocolException(kotlin.jvm.internal.n.k("Too many follow-up requests: ", java.lang.Integer.valueOf(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        rl.d.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004b, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r0.m() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
    
        r1.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        r1.j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0059, code lost:
    
        return r7;
     */
    @Override // ql.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ql.c0 a(ql.v.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.n.e(r11, r0)
            wl.g r11 = (wl.g) r11
            ql.a0 r0 = r11.h()
            vl.e r1 = r11.d()
            java.util.List r2 = dk.p.j()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.i(r0, r6)
            boolean r6 = r1.R0()     // Catch: java.lang.Throwable -> Ld1
            if (r6 != 0) goto Lc9
            ql.c0 r0 = r11.a(r0)     // Catch: java.io.IOException -> L8f vl.i -> La5 java.lang.Throwable -> Ld1
            if (r7 == 0) goto L40
            ql.c0$a r0 = r0.B()     // Catch: java.lang.Throwable -> Ld1
            ql.c0$a r6 = r7.B()     // Catch: java.lang.Throwable -> Ld1
            ql.c0$a r6 = r6.b(r4)     // Catch: java.lang.Throwable -> Ld1
            ql.c0 r6 = r6.c()     // Catch: java.lang.Throwable -> Ld1
            ql.c0$a r0 = r0.p(r6)     // Catch: java.lang.Throwable -> Ld1
            ql.c0 r0 = r0.c()     // Catch: java.lang.Throwable -> Ld1
        L40:
            r7 = r0
            vl.c r0 = r1.q()     // Catch: java.lang.Throwable -> Ld1
            ql.a0 r6 = r10.c(r7, r0)     // Catch: java.lang.Throwable -> Ld1
            if (r6 != 0) goto L5a
            if (r0 == 0) goto L56
            boolean r11 = r0.m()     // Catch: java.lang.Throwable -> Ld1
            if (r11 == 0) goto L56
            r1.B()     // Catch: java.lang.Throwable -> Ld1
        L56:
            r1.j(r3)
            return r7
        L5a:
            ql.b0 r0 = r6.a()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L6a
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L6a
            r1.j(r3)
            return r7
        L6a:
            ql.d0 r0 = r7.a()     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto L71
            goto L74
        L71:
            rl.d.m(r0)     // Catch: java.lang.Throwable -> Ld1
        L74:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L7f
            r1.j(r5)
            r0 = r6
            goto L18
        L7f:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = "Too many follow-up requests: "
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = kotlin.jvm.internal.n.k(r0, r2)     // Catch: java.lang.Throwable -> Ld1
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r11     // Catch: java.lang.Throwable -> Ld1
        L8f:
            r6 = move-exception
            boolean r9 = r6 instanceof yl.a     // Catch: java.lang.Throwable -> Ld1
            if (r9 != 0) goto L96
            r9 = r5
            goto L97
        L96:
            r9 = r3
        L97:
            boolean r9 = r10.e(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto La0
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> Ld1
            goto Lb6
        La0:
            java.lang.Throwable r11 = rl.d.Y(r6, r2)     // Catch: java.lang.Throwable -> Ld1
            throw r11     // Catch: java.lang.Throwable -> Ld1
        La5:
            r6 = move-exception
            java.io.IOException r9 = r6.c()     // Catch: java.lang.Throwable -> Ld1
            boolean r9 = r10.e(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto Lc0
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> Ld1
            java.io.IOException r6 = r6.b()     // Catch: java.lang.Throwable -> Ld1
        Lb6:
            java.util.List r2 = dk.p.S(r2, r6)     // Catch: java.lang.Throwable -> Ld1
            r1.j(r5)
            r6 = r3
            goto L19
        Lc0:
            java.io.IOException r11 = r6.b()     // Catch: java.lang.Throwable -> Ld1
            java.lang.Throwable r11 = rl.d.Y(r11, r2)     // Catch: java.lang.Throwable -> Ld1
            throw r11     // Catch: java.lang.Throwable -> Ld1
        Lc9:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r11     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            r11 = move-exception
            r1.j(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.j.a(ql.v$a):ql.c0");
    }
}
