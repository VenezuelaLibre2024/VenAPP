package cm;

import dk.C7031r;
import dk.C7042z;
import dm.C7082z;
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
import kotlin.jvm.internal.C9322n;
import p341rl.C10724a;
import p341rl.C10727d;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: cm.d */
/* loaded from: classes3.dex */
public final class C2058d implements HostnameVerifier {

    /* renamed from: a */
    public static final C2058d f8151a = new C2058d();

    private C2058d() {
    }

    /* renamed from: b */
    private final String m10393b(String str) {
        if (!m10395d(str)) {
            return str;
        }
        Locale US = Locale.US;
        C9322n.m27780d(US, "US");
        String lowerCase = str.toLowerCase(US);
        C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: c */
    private final List<String> m10394c(X509Certificate x509Certificate, int i10) {
        List<String> m20582j;
        Object obj;
        List<String> m20582j2;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                m20582j2 = C7031r.m20582j();
                return m20582j2;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && C9322n.m27777a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
    }

    /* renamed from: d */
    private final boolean m10395d(String str) {
        return str.length() == ((int) C7082z.m20849b(str, 0, 0, 3, null));
    }

    /* renamed from: f */
    private final boolean m10396f(String str, String str2) {
        boolean m41031E;
        boolean m41036q;
        boolean m41031E2;
        boolean m41036q2;
        boolean m41036q3;
        boolean m41036q4;
        boolean m41059J;
        boolean m41031E3;
        int m41071T;
        boolean m41036q5;
        int m41076Y;
        if (!(str == null || str.length() == 0)) {
            m41031E = C12524p.m41031E(str, ".", false, 2, null);
            if (!m41031E) {
                m41036q = C12524p.m41036q(str, "..", false, 2, null);
                if (!m41036q) {
                    if (!(str2 == null || str2.length() == 0)) {
                        m41031E2 = C12524p.m41031E(str2, ".", false, 2, null);
                        if (!m41031E2) {
                            m41036q2 = C12524p.m41036q(str2, "..", false, 2, null);
                            if (!m41036q2) {
                                m41036q3 = C12524p.m41036q(str, ".", false, 2, null);
                                if (!m41036q3) {
                                    str = C9322n.m27787k(str, ".");
                                }
                                String str3 = str;
                                m41036q4 = C12524p.m41036q(str2, ".", false, 2, null);
                                if (!m41036q4) {
                                    str2 = C9322n.m27787k(str2, ".");
                                }
                                String m10393b = m10393b(str2);
                                m41059J = C12525q.m41059J(m10393b, "*", false, 2, null);
                                if (!m41059J) {
                                    return C9322n.m27777a(str3, m10393b);
                                }
                                m41031E3 = C12524p.m41031E(m10393b, "*.", false, 2, null);
                                if (m41031E3) {
                                    m41071T = C12525q.m41071T(m10393b, '*', 1, false, 4, null);
                                    if (m41071T != -1 || str3.length() < m10393b.length() || C9322n.m27777a("*.", m10393b)) {
                                        return false;
                                    }
                                    String substring = m10393b.substring(1);
                                    C9322n.m27780d(substring, "this as java.lang.String).substring(startIndex)");
                                    m41036q5 = C12524p.m41036q(str3, substring, false, 2, null);
                                    if (!m41036q5) {
                                        return false;
                                    }
                                    int length = str3.length() - substring.length();
                                    if (length > 0) {
                                        m41076Y = C12525q.m41076Y(str3, '.', length - 1, false, 4, null);
                                        if (m41076Y != -1) {
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

    /* renamed from: g */
    private final boolean m10397g(String str, X509Certificate x509Certificate) {
        String m10393b = m10393b(str);
        List<String> m10394c = m10394c(x509Certificate, 2);
        if ((m10394c instanceof Collection) && m10394c.isEmpty()) {
            return false;
        }
        Iterator<T> it = m10394c.iterator();
        while (it.hasNext()) {
            if (f8151a.m10396f(m10393b, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m10398h(String str, X509Certificate x509Certificate) {
        String m32614e = C10724a.m32614e(str);
        List<String> m10394c = m10394c(x509Certificate, 7);
        if ((m10394c instanceof Collection) && m10394c.isEmpty()) {
            return false;
        }
        Iterator<T> it = m10394c.iterator();
        while (it.hasNext()) {
            if (C9322n.m27777a(m32614e, C10724a.m32614e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<String> m10399a(X509Certificate certificate) {
        List<String> m20616R;
        C9322n.m27781e(certificate, "certificate");
        m20616R = C7042z.m20616R(m10394c(certificate, 7), m10394c(certificate, 2));
        return m20616R;
    }

    /* renamed from: e */
    public final boolean m10400e(String host, X509Certificate certificate) {
        C9322n.m27781e(host, "host");
        C9322n.m27781e(certificate, "certificate");
        return C10727d.m32649i(host) ? m10398h(host, certificate) : m10397g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Certificate certificate;
        C9322n.m27781e(host, "host");
        C9322n.m27781e(session, "session");
        if (m10395d(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return m10400e(host, (X509Certificate) certificate);
    }
}
