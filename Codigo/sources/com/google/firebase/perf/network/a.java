package com.google.firebase.perf.network;

import com.google.firebase.perf.util.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import se.h;

/* loaded from: classes.dex */
public final class a extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final c f12315a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(HttpURLConnection httpURLConnection, l lVar, h hVar) {
        super(httpURLConnection.getURL());
        this.f12315a = new c(httpURLConnection, lVar, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f12315a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f12315a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f12315a.c();
    }

    public boolean equals(Object obj) {
        return this.f12315a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f12315a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f12315a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f12315a.f();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f12315a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f12315a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f12315a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f12315a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f12315a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f12315a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f12315a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f12315a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f12315a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f12315a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f12315a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f12315a.r(i10);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f12315a.s(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f12315a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f12315a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f12315a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f12315a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f12315a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f12315a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f12315a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f12315a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f12315a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f12315a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f12315a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f12315a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f12315a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f12315a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f12315a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f12315a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f12315a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f12315a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f12315a.L();
    }

    public int hashCode() {
        return this.f12315a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f12315a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f12315a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f12315a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f12315a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f12315a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f12315a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f12315a.S(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f12315a.T(j10);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f12315a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f12315a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f12315a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f12315a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f12315a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f12315a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f12315a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f12315a.b0();
    }
}
