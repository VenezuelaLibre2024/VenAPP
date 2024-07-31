package com.google.firebase.perf.network;

import com.google.firebase.perf.util.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import se.h;

/* loaded from: classes.dex */
public final class b extends HttpsURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final c f12316a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpsURLConnection f12317b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(HttpsURLConnection httpsURLConnection, l lVar, h hVar) {
        super(httpsURLConnection.getURL());
        this.f12317b = httpsURLConnection;
        this.f12316a = new c(httpsURLConnection, lVar, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f12316a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f12316a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f12316a.c();
    }

    public boolean equals(Object obj) {
        return this.f12316a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f12316a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f12317b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f12316a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f12316a.f();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f12316a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f12316a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f12316a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f12316a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f12316a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f12316a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f12316a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f12316a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f12316a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f12316a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f12316a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f12316a.r(i10);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f12316a.s(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f12316a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f12316a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f12316a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f12316a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f12316a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f12317b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f12316a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f12316a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f12316a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f12316a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f12317b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f12317b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f12316a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f12317b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f12316a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f12316a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f12316a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f12316a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f12316a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f12316a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f12316a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f12317b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f12317b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f12316a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f12316a.L();
    }

    public int hashCode() {
        return this.f12316a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f12316a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f12316a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f12316a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f12316a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f12316a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f12316a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f12316a.S(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f12316a.T(j10);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f12317b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f12316a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f12316a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f12316a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f12316a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f12316a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f12317b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f12316a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f12316a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f12316a.b0();
    }
}
