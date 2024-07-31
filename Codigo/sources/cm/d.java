package cm;

import dk.r;
import dm.z;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.n;
import xk.p;
import xk.q;

/* loaded from: classes3.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7199a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        n.d(US, "US");
        String lowerCase = str.toLowerCase(US);
        n.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> c(X509Certificate x509Certificate, int i10) {
        List<String> j10;
        Object obj;
        List<String> j11;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                j11 = r.j();
                return j11;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && n.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            j10 = r.j();
            return j10;
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) z.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        boolean E;
        boolean q10;
        boolean E2;
        boolean q11;
        boolean q12;
        boolean q13;
        boolean J;
        boolean E3;
        int T;
        boolean q14;
        int Y;
        if (!(str == null || str.length() == 0)) {
            E = p.E(str, ".", false, 2, null);
            if (!E) {
                q10 = p.q(str, "..", false, 2, null);
                if (!q10) {
                    if (!(str2 == null || str2.length() == 0)) {
                        E2 = p.E(str2, ".", false, 2, null);
                        if (!E2) {
                            q11 = p.q(str2, "..", false, 2, null);
                            if (!q11) {
                                q12 = p.q(str, ".", false, 2, null);
                                if (!q12) {
                                    str = n.k(str, ".");
                                }
                                String str3 = str;
                                q13 = p.q(str2, ".", false, 2, null);
                                if (!q13) {
                                    str2 = n.k(str2, ".");
                                }
                                String b10 = b(str2);
                                J = q.J(b10, "*", false, 2, null);
                                if (!J) {
                                    return n.a(str3, b10);
                                }
                                E3 = p.E(b10, "*.", false, 2, null);
                                if (E3) {
                                    T = q.T(b10, '*', 1, false, 4, null);
                                    if (T != -1 || str3.length() < b10.length() || n.a("*.", b10)) {
                                        return false;
                                    }
                                    String substring = b10.substring(1);
                                    n.d(substring, "this as java.lang.String).substring(startIndex)");
                                    q14 = p.q(str3, substring, false, 2, null);
                                    if (!q14) {
                                        return false;
                                    }
                                    int length = str3.length() - substring.length();
                                    if (length > 0) {
                                        Y = q.Y(str3, '.', length - 1, false, 4, null);
                                        if (Y != -1) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b10 = b(str);
        List<String> c10 = c(x509Certificate, 2);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        Iterator<T> it = c10.iterator();
        while (it.hasNext()) {
            if (f7199a.f(b10, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String e10 = rl.a.e(str);
        List<String> c10 = c(x509Certificate, 7);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        Iterator<T> it = c10.iterator();
        while (it.hasNext()) {
            if (n.a(e10, rl.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(X509Certificate certificate) {
        List<String> R;
        n.e(certificate, "certificate");
        R = dk.z.R(c(certificate, 7), c(certificate, 2));
        return R;
    }

    public final boolean e(String host, X509Certificate certificate) {
        n.e(host, "host");
        n.e(certificate, "certificate");
        return rl.d.i(host) ? h(host, certificate) : g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Certificate certificate;
        n.e(host, "host");
        n.e(session, "session");
        if (d(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return e(host, (X509Certificate) certificate);
    }
}
