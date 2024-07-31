package io.grpc.okhttp.internal;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: io.grpc.okhttp.internal.f */
/* loaded from: classes3.dex */
public final class C8924f implements HostnameVerifier {

    /* renamed from: a */
    public static final C8924f f21190a = new C8924f();

    /* renamed from: b */
    private static final Pattern f21191b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C8924f() {
    }

    /* renamed from: a */
    private static List<String> m26071a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: c */
    static boolean m26072c(String str) {
        return f21191b.matcher(str).matches();
    }

    /* renamed from: d */
    private boolean m26073d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m26074e(String str, X509Certificate x509Certificate) {
        String m26061b;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> m26071a = m26071a(x509Certificate, 2);
        int size = m26071a.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            if (m26073d(lowerCase, m26071a.get(i10))) {
                return true;
            }
            i10++;
            z10 = true;
        }
        if (z10 || (m26061b = new C8922d(x509Certificate.getSubjectX500Principal()).m26061b("cn")) == null) {
            return false;
        }
        return m26073d(lowerCase, m26061b);
    }

    /* renamed from: f */
    private boolean m26075f(String str, X509Certificate x509Certificate) {
        List<String> m26071a = m26071a(x509Certificate, 7);
        int size = m26071a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(m26071a.get(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m26076b(String str, X509Certificate x509Certificate) {
        return m26072c(str) ? m26075f(str, x509Certificate) : m26074e(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m26076b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
