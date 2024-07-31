package com.google.firebase.perf.network;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import se.h;

/* loaded from: classes.dex */
class c {

    /* renamed from: f, reason: collision with root package name */
    private static final re.a f12318f = re.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f12319a;

    /* renamed from: b, reason: collision with root package name */
    private final h f12320b;

    /* renamed from: c, reason: collision with root package name */
    private long f12321c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f12322d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final l f12323e;

    public c(HttpURLConnection httpURLConnection, l lVar, h hVar) {
        this.f12319a = httpURLConnection;
        this.f12320b = hVar;
        this.f12323e = lVar;
        hVar.x(httpURLConnection.getURL().toString());
    }

    private void a0() {
        h hVar;
        String str;
        if (this.f12321c == -1) {
            this.f12323e.g();
            long e10 = this.f12323e.e();
            this.f12321c = e10;
            this.f12320b.r(e10);
        }
        String F = F();
        if (F != null) {
            this.f12320b.l(F);
            return;
        }
        if (o()) {
            hVar = this.f12320b;
            str = "POST";
        } else {
            hVar = this.f12320b;
            str = "GET";
        }
        hVar.l(str);
    }

    public boolean A() {
        return this.f12319a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f12319a.getLastModified();
    }

    public OutputStream C() {
        try {
            OutputStream outputStream = this.f12319a.getOutputStream();
            return outputStream != null ? new ue.b(outputStream, this.f12320b, this.f12323e) : outputStream;
        } catch (IOException e10) {
            this.f12320b.v(this.f12323e.c());
            ue.d.d(this.f12320b);
            throw e10;
        }
    }

    public Permission D() {
        try {
            return this.f12319a.getPermission();
        } catch (IOException e10) {
            this.f12320b.v(this.f12323e.c());
            ue.d.d(this.f12320b);
            throw e10;
        }
    }

    public int E() {
        return this.f12319a.getReadTimeout();
    }

    public String F() {
        return this.f12319a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f12319a.getRequestProperties();
    }

    public String H(String str) {
        return this.f12319a.getRequestProperty(str);
    }

    public int I() {
        a0();
        if (this.f12322d == -1) {
            long c10 = this.f12323e.c();
            this.f12322d = c10;
            this.f12320b.w(c10);
        }
        try {
            int responseCode = this.f12319a.getResponseCode();
            this.f12320b.m(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f12320b.v(this.f12323e.c());
            ue.d.d(this.f12320b);
            throw e10;
        }
    }

    public String J() {
        a0();
        if (this.f12322d == -1) {
            long c10 = this.f12323e.c();
            this.f12322d = c10;
            this.f12320b.w(c10);
        }
        try {
            String responseMessage = this.f12319a.getResponseMessage();
            this.f12320b.m(this.f12319a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f12320b.v(this.f12323e.c());
            ue.d.d(this.f12320b);
            throw e10;
        }
    }

    public URL K() {
        return this.f12319a.getURL();
    }

    public boolean L() {
        return this.f12319a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f12319a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f12319a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f12319a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f12319a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f12319a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f12319a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f12319a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f12319a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f12319a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f12319a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f12319a.setReadTimeout(i10);
    }

    public void X(String str) {
        this.f12319a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f12320b.y(str2);
        }
        this.f12319a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f12319a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f12319a.addRequestProperty(str, str2);
    }

    public void b() {
        if (this.f12321c == -1) {
            this.f12323e.g();
            long e10 = this.f12323e.e();
            this.f12321c = e10;
            this.f12320b.r(e10);
        }
        try {
            this.f12319a.connect();
        } catch (IOException e11) {
            this.f12320b.v(this.f12323e.c());
            ue.d.d(this.f12320b);
            throw e11;
        }
    }

    public boolean b0() {
        return this.f12319a.usingProxy();
    }

    public void c() {
        this.f12320b.v(this.f12323e.c());
        this.f12320b.b();
        this.f12319a.disconnect();
    }

    public boolean d() {
        return this.f12319a.getAllowUserInteraction();
    }

    public int e() {
        return this.f12319a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f12319a.equals(obj);
    }

    public Object f() {
        a0();
        this.f12320b.m(this.f12319a.getResponseCode());
        try {
            Object content = this.f12319a.getContent();
            if (content instanceof InputStream) {
                this.f12320b.s(this.f12319a.getContentType());
                return new ue.a((InputStream) content, this.f12320b, this.f12323e);
            }
            this.f12320b.s(this.f12319a.getContentType());
            this.f12320b.t(this.f12319a.getContentLength());
            this.f12320b.v(this.f12323e.c());
            this.f12320b.b();
            return content;
        } catch (IOException e10) {
            this.f12320b.v(this.f12323e.c());
            ue.d.d(this.f12320b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) {
        a0();
        this.f12320b.m(this.f12319a.getResponseCode());
        try {
            Object content = this.f12319a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f12320b.s(this.f12319a.getContentType());
                return new ue.a((InputStream) content, this.f12320b, this.f12323e);
            }
            this.f12320b.s(this.f12319a.getContentType());
            this.f12320b.t(this.f12319a.getContentLength());
            this.f12320b.v(this.f12323e.c());
            this.f12320b.b();
            return content;
        } catch (IOException e10) {
            this.f12320b.v(this.f12323e.c());
            ue.d.d(this.f12320b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f12319a.getContentEncoding();
    }

    public int hashCode() {
        return this.f12319a.hashCode();
    }

    public int i() {
        a0();
        return this.f12319a.getContentLength();
    }

    public long j() {
        a0();
        return this.f12319a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f12319a.getContentType();
    }

    public long l() {
        a0();
        return this.f12319a.getDate();
    }

    public boolean m() {
        return this.f12319a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f12319a.getDoInput();
    }

    public boolean o() {
        return this.f12319a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f12320b.m(this.f12319a.getResponseCode());
        } catch (IOException unused) {
            f12318f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f12319a.getErrorStream();
        return errorStream != null ? new ue.a(errorStream, this.f12320b, this.f12323e) : errorStream;
    }

    public long q() {
        a0();
        return this.f12319a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f12319a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f12319a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f12319a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f12319a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f12319a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f12319a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        return this.f12319a.getHeaderFieldLong(str, j10);
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f12319a.getHeaderFields();
    }

    public long y() {
        return this.f12319a.getIfModifiedSince();
    }

    public InputStream z() {
        a0();
        this.f12320b.m(this.f12319a.getResponseCode());
        this.f12320b.s(this.f12319a.getContentType());
        try {
            InputStream inputStream = this.f12319a.getInputStream();
            return inputStream != null ? new ue.a(inputStream, this.f12320b, this.f12323e) : inputStream;
        } catch (IOException e10) {
            this.f12320b.v(this.f12323e.c());
            ue.d.d(this.f12320b);
            throw e10;
        }
    }
}
