package com.google.firebase.perf.network;

import com.google.firebase.perf.util.C6338l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import p383ue.C11548a;
import p383ue.C11549b;
import p383ue.C11551d;
import re.C10696a;
import se.C10909h;

/* renamed from: com.google.firebase.perf.network.c */
/* loaded from: classes.dex */
class C6312c {

    /* renamed from: f */
    private static final C10696a f13550f = C10696a.m32565e();

    /* renamed from: a */
    private final HttpURLConnection f13551a;

    /* renamed from: b */
    private final C10909h f13552b;

    /* renamed from: c */
    private long f13553c = -1;

    /* renamed from: d */
    private long f13554d = -1;

    /* renamed from: e */
    private final C6338l f13555e;

    public C6312c(HttpURLConnection httpURLConnection, C6338l c6338l, C10909h c10909h) {
        this.f13551a = httpURLConnection;
        this.f13552b = c10909h;
        this.f13555e = c6338l;
        c10909h.m33311x(httpURLConnection.getURL().toString());
    }

    /* renamed from: a0 */
    private void m17419a0() {
        C10909h c10909h;
        String str;
        if (this.f13553c == -1) {
            this.f13555e.m17535g();
            long m17534e = this.f13555e.m17534e();
            this.f13553c = m17534e;
            this.f13552b.m33305r(m17534e);
        }
        String m17425F = m17425F();
        if (m17425F != null) {
            this.f13552b.m33300l(m17425F);
            return;
        }
        if (m17461o()) {
            c10909h = this.f13552b;
            str = "POST";
        } else {
            c10909h = this.f13552b;
            str = "GET";
        }
        c10909h.m33300l(str);
    }

    /* renamed from: A */
    public boolean m17420A() {
        return this.f13551a.getInstanceFollowRedirects();
    }

    /* renamed from: B */
    public long m17421B() {
        m17419a0();
        return this.f13551a.getLastModified();
    }

    /* renamed from: C */
    public OutputStream m17422C() {
        try {
            OutputStream outputStream = this.f13551a.getOutputStream();
            return outputStream != null ? new C11549b(outputStream, this.f13552b, this.f13555e) : outputStream;
        } catch (IOException e10) {
            this.f13552b.m33309v(this.f13555e.m17532c());
            C11551d.m36206d(this.f13552b);
            throw e10;
        }
    }

    /* renamed from: D */
    public Permission m17423D() {
        try {
            return this.f13551a.getPermission();
        } catch (IOException e10) {
            this.f13552b.m33309v(this.f13555e.m17532c());
            C11551d.m36206d(this.f13552b);
            throw e10;
        }
    }

    /* renamed from: E */
    public int m17424E() {
        return this.f13551a.getReadTimeout();
    }

    /* renamed from: F */
    public String m17425F() {
        return this.f13551a.getRequestMethod();
    }

    /* renamed from: G */
    public Map<String, List<String>> m17426G() {
        return this.f13551a.getRequestProperties();
    }

    /* renamed from: H */
    public String m17427H(String str) {
        return this.f13551a.getRequestProperty(str);
    }

    /* renamed from: I */
    public int m17428I() {
        m17419a0();
        if (this.f13554d == -1) {
            long m17532c = this.f13555e.m17532c();
            this.f13554d = m17532c;
            this.f13552b.m33310w(m17532c);
        }
        try {
            int responseCode = this.f13551a.getResponseCode();
            this.f13552b.m33301m(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f13552b.m33309v(this.f13555e.m17532c());
            C11551d.m36206d(this.f13552b);
            throw e10;
        }
    }

    /* renamed from: J */
    public String m17429J() {
        m17419a0();
        if (this.f13554d == -1) {
            long m17532c = this.f13555e.m17532c();
            this.f13554d = m17532c;
            this.f13552b.m33310w(m17532c);
        }
        try {
            String responseMessage = this.f13551a.getResponseMessage();
            this.f13552b.m33301m(this.f13551a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f13552b.m33309v(this.f13555e.m17532c());
            C11551d.m36206d(this.f13552b);
            throw e10;
        }
    }

    /* renamed from: K */
    public URL m17430K() {
        return this.f13551a.getURL();
    }

    /* renamed from: L */
    public boolean m17431L() {
        return this.f13551a.getUseCaches();
    }

    /* renamed from: M */
    public void m17432M(boolean z10) {
        this.f13551a.setAllowUserInteraction(z10);
    }

    /* renamed from: N */
    public void m17433N(int i10) {
        this.f13551a.setChunkedStreamingMode(i10);
    }

    /* renamed from: O */
    public void m17434O(int i10) {
        this.f13551a.setConnectTimeout(i10);
    }

    /* renamed from: P */
    public void m17435P(boolean z10) {
        this.f13551a.setDefaultUseCaches(z10);
    }

    /* renamed from: Q */
    public void m17436Q(boolean z10) {
        this.f13551a.setDoInput(z10);
    }

    /* renamed from: R */
    public void m17437R(boolean z10) {
        this.f13551a.setDoOutput(z10);
    }

    /* renamed from: S */
    public void m17438S(int i10) {
        this.f13551a.setFixedLengthStreamingMode(i10);
    }

    /* renamed from: T */
    public void m17439T(long j10) {
        this.f13551a.setFixedLengthStreamingMode(j10);
    }

    /* renamed from: U */
    public void m17440U(long j10) {
        this.f13551a.setIfModifiedSince(j10);
    }

    /* renamed from: V */
    public void m17441V(boolean z10) {
        this.f13551a.setInstanceFollowRedirects(z10);
    }

    /* renamed from: W */
    public void m17442W(int i10) {
        this.f13551a.setReadTimeout(i10);
    }

    /* renamed from: X */
    public void m17443X(String str) {
        this.f13551a.setRequestMethod(str);
    }

    /* renamed from: Y */
    public void m17444Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f13552b.m33312y(str2);
        }
        this.f13551a.setRequestProperty(str, str2);
    }

    /* renamed from: Z */
    public void m17445Z(boolean z10) {
        this.f13551a.setUseCaches(z10);
    }

    /* renamed from: a */
    public void m17446a(String str, String str2) {
        this.f13551a.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    public void m17447b() {
        if (this.f13553c == -1) {
            this.f13555e.m17535g();
            long m17534e = this.f13555e.m17534e();
            this.f13553c = m17534e;
            this.f13552b.m33305r(m17534e);
        }
        try {
            this.f13551a.connect();
        } catch (IOException e10) {
            this.f13552b.m33309v(this.f13555e.m17532c());
            C11551d.m36206d(this.f13552b);
            throw e10;
        }
    }

    /* renamed from: b0 */
    public boolean m17448b0() {
        return this.f13551a.usingProxy();
    }

    /* renamed from: c */
    public void m17449c() {
        this.f13552b.m33309v(this.f13555e.m17532c());
        this.f13552b.m33294b();
        this.f13551a.disconnect();
    }

    /* renamed from: d */
    public boolean m17450d() {
        return this.f13551a.getAllowUserInteraction();
    }

    /* renamed from: e */
    public int m17451e() {
        return this.f13551a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f13551a.equals(obj);
    }

    /* renamed from: f */
    public Object m17452f() {
        m17419a0();
        this.f13552b.m33301m(this.f13551a.getResponseCode());
        try {
            Object content = this.f13551a.getContent();
            if (content instanceof InputStream) {
                this.f13552b.m33306s(this.f13551a.getContentType());
                return new C11548a((InputStream) content, this.f13552b, this.f13555e);
            }
            this.f13552b.m33306s(this.f13551a.getContentType());
            this.f13552b.m33307t(this.f13551a.getContentLength());
            this.f13552b.m33309v(this.f13555e.m17532c());
            this.f13552b.m33294b();
            return content;
        } catch (IOException e10) {
            this.f13552b.m33309v(this.f13555e.m17532c());
            C11551d.m36206d(this.f13552b);
            throw e10;
        }
    }

    /* renamed from: g */
    public Object m17453g(Class[] clsArr) {
        m17419a0();
        this.f13552b.m33301m(this.f13551a.getResponseCode());
        try {
            Object content = this.f13551a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f13552b.m33306s(this.f13551a.getContentType());
                return new C11548a((InputStream) content, this.f13552b, this.f13555e);
            }
            this.f13552b.m33306s(this.f13551a.getContentType());
            this.f13552b.m33307t(this.f13551a.getContentLength());
            this.f13552b.m33309v(this.f13555e.m17532c());
            this.f13552b.m33294b();
            return content;
        } catch (IOException e10) {
            this.f13552b.m33309v(this.f13555e.m17532c());
            C11551d.m36206d(this.f13552b);
            throw e10;
        }
    }

    /* renamed from: h */
    public String m17454h() {
        m17419a0();
        return this.f13551a.getContentEncoding();
    }

    public int hashCode() {
        return this.f13551a.hashCode();
    }

    /* renamed from: i */
    public int m17455i() {
        m17419a0();
        return this.f13551a.getContentLength();
    }

    /* renamed from: j */
    public long m17456j() {
        m17419a0();
        return this.f13551a.getContentLengthLong();
    }

    /* renamed from: k */
    public String m17457k() {
        m17419a0();
        return this.f13551a.getContentType();
    }

    /* renamed from: l */
    public long m17458l() {
        m17419a0();
        return this.f13551a.getDate();
    }

    /* renamed from: m */
    public boolean m17459m() {
        return this.f13551a.getDefaultUseCaches();
    }

    /* renamed from: n */
    public boolean m17460n() {
        return this.f13551a.getDoInput();
    }

    /* renamed from: o */
    public boolean m17461o() {
        return this.f13551a.getDoOutput();
    }

    /* renamed from: p */
    public InputStream m17462p() {
        m17419a0();
        try {
            this.f13552b.m33301m(this.f13551a.getResponseCode());
        } catch (IOException unused) {
            f13550f.m32566a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f13551a.getErrorStream();
        return errorStream != null ? new C11548a(errorStream, this.f13552b, this.f13555e) : errorStream;
    }

    /* renamed from: q */
    public long m17463q() {
        m17419a0();
        return this.f13551a.getExpiration();
    }

    /* renamed from: r */
    public String m17464r(int i10) {
        m17419a0();
        return this.f13551a.getHeaderField(i10);
    }

    /* renamed from: s */
    public String m17465s(String str) {
        m17419a0();
        return this.f13551a.getHeaderField(str);
    }

    /* renamed from: t */
    public long m17466t(String str, long j10) {
        m17419a0();
        return this.f13551a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f13551a.toString();
    }

    /* renamed from: u */
    public int m17467u(String str, int i10) {
        m17419a0();
        return this.f13551a.getHeaderFieldInt(str, i10);
    }

    /* renamed from: v */
    public String m17468v(int i10) {
        m17419a0();
        return this.f13551a.getHeaderFieldKey(i10);
    }

    /* renamed from: w */
    public long m17469w(String str, long j10) {
        m17419a0();
        return this.f13551a.getHeaderFieldLong(str, j10);
    }

    /* renamed from: x */
    public Map<String, List<String>> m17470x() {
        m17419a0();
        return this.f13551a.getHeaderFields();
    }

    /* renamed from: y */
    public long m17471y() {
        return this.f13551a.getIfModifiedSince();
    }

    /* renamed from: z */
    public InputStream m17472z() {
        m17419a0();
        this.f13552b.m33301m(this.f13551a.getResponseCode());
        this.f13552b.m33306s(this.f13551a.getContentType());
        try {
            InputStream inputStream = this.f13551a.getInputStream();
            return inputStream != null ? new C11548a(inputStream, this.f13552b, this.f13555e) : inputStream;
        } catch (IOException e10) {
            this.f13552b.m33309v(this.f13555e.m17532c());
            C11551d.m36206d(this.f13552b);
            throw e10;
        }
    }
}
