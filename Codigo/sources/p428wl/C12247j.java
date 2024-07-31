package p428wl;

import com.google.android.gms.common.api.C5101a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10523b0;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10529e0;
import p319ql.C10546u;
import p319ql.C10550y;
import p319ql.InterfaceC10547v;
import p341rl.C10727d;
import p406vl.C11976c;
import p406vl.C11978e;
import p406vl.C11979f;
import p450xk.C12514f;

/* renamed from: wl.j */
/* loaded from: classes3.dex */
public final class C12247j implements InterfaceC10547v {

    /* renamed from: b */
    public static final a f32731b = new a(null);

    /* renamed from: a */
    private final C10550y f32732a;

    /* renamed from: wl.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C12247j(C10550y client) {
        C9322n.m27781e(client, "client");
        this.f32732a = client;
    }

    /* renamed from: b */
    private final C10521a0 m39427b(C10525c0 c10525c0, String str) {
        String m31634n;
        C10546u m31881p;
        AbstractC10523b0 abstractC10523b0 = null;
        if (!this.f32732a.m31985q() || (m31634n = C10525c0.m31634n(c10525c0, "Location", null, 2, null)) == null || (m31881p = c10525c0.m31639O().m31608i().m31881p(m31634n)) == null) {
            return null;
        }
        if (!C9322n.m27777a(m31881p.m31882q(), c10525c0.m31639O().m31608i().m31882q()) && !this.f32732a.m31986r()) {
            return null;
        }
        C10521a0.a m31607h = c10525c0.m31639O().m31607h();
        if (C12243f.m39411a(str)) {
            int m31645g = c10525c0.m31645g();
            C12243f c12243f = C12243f.f32717a;
            boolean z10 = c12243f.m39414c(str) || m31645g == 308 || m31645g == 307;
            if (c12243f.m39413b(str) && m31645g != 308 && m31645g != 307) {
                str = "GET";
            } else if (z10) {
                abstractC10523b0 = c10525c0.m31639O().m31600a();
            }
            m31607h.m31614f(str, abstractC10523b0);
            if (!z10) {
                m31607h.m31618j("Transfer-Encoding");
                m31607h.m31618j("Content-Length");
                m31607h.m31618j("Content-Type");
            }
        }
        if (!C10727d.m32650j(c10525c0.m31639O().m31608i(), m31881p)) {
            m31607h.m31618j("Authorization");
        }
        return m31607h.m31624p(m31881p).m31610b();
    }

    /* renamed from: c */
    private final C10521a0 m39428c(C10525c0 c10525c0, C11976c c11976c) {
        C11979f m38406h;
        C10529e0 m38493z = (c11976c == null || (m38406h = c11976c.m38406h()) == null) ? null : m38406h.m38493z();
        int m31645g = c10525c0.m31645g();
        String m31606g = c10525c0.m31639O().m31606g();
        if (m31645g != 307 && m31645g != 308) {
            if (m31645g == 401) {
                return this.f32732a.m31974c().mo31625a(m38493z, c10525c0);
            }
            if (m31645g == 421) {
                AbstractC10523b0 m31600a = c10525c0.m31639O().m31600a();
                if ((m31600a != null && m31600a.m31628e()) || c11976c == null || !c11976c.m38410l()) {
                    return null;
                }
                c11976c.m38406h().m38491x();
                return c10525c0.m31639O();
            }
            if (m31645g == 503) {
                C10525c0 m31636E = c10525c0.m31636E();
                if ((m31636E == null || m31636E.m31645g() != 503) && m39432g(c10525c0, C5101a.e.API_PRIORITY_OTHER) == 0) {
                    return c10525c0.m31639O();
                }
                return null;
            }
            if (m31645g == 407) {
                C9322n.m27778b(m38493z);
                if (m38493z.m31717b().type() == Proxy.Type.HTTP) {
                    return this.f32732a.m31967B().mo31625a(m38493z, c10525c0);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (m31645g == 408) {
                if (!this.f32732a.m31970E()) {
                    return null;
                }
                AbstractC10523b0 m31600a2 = c10525c0.m31639O().m31600a();
                if (m31600a2 != null && m31600a2.m31628e()) {
                    return null;
                }
                C10525c0 m31636E2 = c10525c0.m31636E();
                if ((m31636E2 == null || m31636E2.m31645g() != 408) && m39432g(c10525c0, 0) <= 0) {
                    return c10525c0.m31639O();
                }
                return null;
            }
            switch (m31645g) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m39427b(c10525c0, m31606g);
    }

    /* renamed from: d */
    private final boolean m39429d(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: e */
    private final boolean m39430e(IOException iOException, C11978e c11978e, C10521a0 c10521a0, boolean z10) {
        if (this.f32732a.m31970E()) {
            return !(z10 && m39431f(iOException, c10521a0)) && m39429d(iOException, z10) && c11978e.m38454z();
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m39431f(IOException iOException, C10521a0 c10521a0) {
        AbstractC10523b0 m31600a = c10521a0.m31600a();
        return (m31600a != null && m31600a.m31628e()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: g */
    private final int m39432g(C10525c0 c10525c0, int i10) {
        String m31634n = C10525c0.m31634n(c10525c0, "Retry-After", null, 2, null);
        if (m31634n == null) {
            return i10;
        }
        if (!new C12514f("\\d+").m40969a(m31634n)) {
            return C5101a.e.API_PRIORITY_OTHER;
        }
        Integer valueOf = Integer.valueOf(m31634n);
        C9322n.m27780d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r0 = r0.m31635B().m31674p(r7.m31635B().m31662b(null).m31663c()).m31663c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r7 = r0;
        r0 = r1.m38446q();
        r6 = m39428c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r6 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        r0 = r6.m31600a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r0.m31628e() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r1.m38441j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r0 = r7.m31641a();
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
    
        throw new java.net.ProtocolException(kotlin.jvm.internal.C9322n.m27787k("Too many follow-up requests: ", java.lang.Integer.valueOf(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        p341rl.C10727d.m32653m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004b, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r0.m38411m() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
    
        r1.m38437B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        r1.m38441j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0059, code lost:
    
        return r7;
     */
    @Override // p319ql.InterfaceC10547v
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p319ql.C10525c0 mo31938a(p319ql.InterfaceC10547v.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C9322n.m27781e(r11, r0)
            wl.g r11 = (p428wl.C12244g) r11
            ql.a0 r0 = r11.m39421h()
            vl.e r1 = r11.m39417d()
            java.util.List r2 = dk.C7027p.m20546j()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.m38440i(r0, r6)
            boolean r6 = r1.mo31713R0()     // Catch: java.lang.Throwable -> Ld1
            if (r6 != 0) goto Lc9
            ql.c0 r0 = r11.mo31939a(r0)     // Catch: java.io.IOException -> L8f p406vl.C11982i -> La5 java.lang.Throwable -> Ld1
            if (r7 == 0) goto L40
            ql.c0$a r0 = r0.m31635B()     // Catch: java.lang.Throwable -> Ld1
            ql.c0$a r6 = r7.m31635B()     // Catch: java.lang.Throwable -> Ld1
            ql.c0$a r6 = r6.m31662b(r4)     // Catch: java.lang.Throwable -> Ld1
            ql.c0 r6 = r6.m31663c()     // Catch: java.lang.Throwable -> Ld1
            ql.c0$a r0 = r0.m31674p(r6)     // Catch: java.lang.Throwable -> Ld1
            ql.c0 r0 = r0.m31663c()     // Catch: java.lang.Throwable -> Ld1
        L40:
            r7 = r0
            vl.c r0 = r1.m38446q()     // Catch: java.lang.Throwable -> Ld1
            ql.a0 r6 = r10.m39428c(r7, r0)     // Catch: java.lang.Throwable -> Ld1
            if (r6 != 0) goto L5a
            if (r0 == 0) goto L56
            boolean r11 = r0.m38411m()     // Catch: java.lang.Throwable -> Ld1
            if (r11 == 0) goto L56
            r1.m38437B()     // Catch: java.lang.Throwable -> Ld1
        L56:
            r1.m38441j(r3)
            return r7
        L5a:
            ql.b0 r0 = r6.m31600a()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L6a
            boolean r0 = r0.m31628e()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L6a
            r1.m38441j(r3)
            return r7
        L6a:
            ql.d0 r0 = r7.m31641a()     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto L71
            goto L74
        L71:
            p341rl.C10727d.m32653m(r0)     // Catch: java.lang.Throwable -> Ld1
        L74:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L7f
            r1.m38441j(r5)
            r0 = r6
            goto L18
        L7f:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = "Too many follow-up requests: "
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = kotlin.jvm.internal.C9322n.m27787k(r0, r2)     // Catch: java.lang.Throwable -> Ld1
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r11     // Catch: java.lang.Throwable -> Ld1
        L8f:
            r6 = move-exception
            boolean r9 = r6 instanceof p473yl.C12733a     // Catch: java.lang.Throwable -> Ld1
            if (r9 != 0) goto L96
            r9 = r5
            goto L97
        L96:
            r9 = r3
        L97:
            boolean r9 = r10.m39430e(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto La0
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> Ld1
            goto Lb6
        La0:
            java.lang.Throwable r11 = p341rl.C10727d.m32639Y(r6, r2)     // Catch: java.lang.Throwable -> Ld1
            throw r11     // Catch: java.lang.Throwable -> Ld1
        La5:
            r6 = move-exception
            java.io.IOException r9 = r6.m38506c()     // Catch: java.lang.Throwable -> Ld1
            boolean r9 = r10.m39430e(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto Lc0
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> Ld1
            java.io.IOException r6 = r6.m38505b()     // Catch: java.lang.Throwable -> Ld1
        Lb6:
            java.util.List r2 = dk.C7027p.m20526S(r2, r6)     // Catch: java.lang.Throwable -> Ld1
            r1.m38441j(r5)
            r6 = r3
            goto L19
        Lc0:
            java.io.IOException r11 = r6.m38505b()     // Catch: java.lang.Throwable -> Ld1
            java.lang.Throwable r11 = p341rl.C10727d.m32639Y(r11, r2)     // Catch: java.lang.Throwable -> Ld1
            throw r11     // Catch: java.lang.Throwable -> Ld1
        Lc9:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r11     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            r11 = move-exception
            r1.m38441j(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p428wl.C12247j.mo31938a(ql.v$a):ql.c0");
    }
}
