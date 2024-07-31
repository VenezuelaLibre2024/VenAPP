package com.google.firebase.perf.network;

import com.google.firebase.perf.util.C6338l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import se.C10909h;

/* renamed from: com.google.firebase.perf.network.a */
/* loaded from: classes.dex */
public final class C6310a extends HttpURLConnection {

    /* renamed from: a */
    private final C6312c f13547a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6310a(HttpURLConnection httpURLConnection, C6338l c6338l, C10909h c10909h) {
        super(httpURLConnection.getURL());
        this.f13547a = new C6312c(httpURLConnection, c6338l, c10909h);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f13547a.m17446a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f13547a.m17447b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f13547a.m17449c();
    }

    public boolean equals(Object obj) {
        return this.f13547a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f13547a.m17450d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f13547a.m17451e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f13547a.m17452f();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f13547a.m17453g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f13547a.m17454h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f13547a.m17455i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f13547a.m17456j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f13547a.m17457k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f13547a.m17458l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f13547a.m17459m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f13547a.m17460n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f13547a.m17461o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f13547a.m17462p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f13547a.m17463q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f13547a.m17464r(i10);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f13547a.m17465s(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f13547a.m17466t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f13547a.m17467u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f13547a.m17468v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f13547a.m17469w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f13547a.m17470x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f13547a.m17471y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f13547a.m17472z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f13547a.m17420A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f13547a.m17421B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f13547a.m17422C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f13547a.m17423D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f13547a.m17424E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f13547a.m17425F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f13547a.m17426G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f13547a.m17427H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f13547a.m17428I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f13547a.m17429J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f13547a.m17430K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f13547a.m17431L();
    }

    public int hashCode() {
        return this.f13547a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f13547a.m17432M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f13547a.m17433N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f13547a.m17434O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f13547a.m17435P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f13547a.m17436Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f13547a.m17437R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f13547a.m17438S(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f13547a.m17439T(j10);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f13547a.m17440U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f13547a.m17441V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f13547a.m17442W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f13547a.m17443X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f13547a.m17444Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f13547a.m17445Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f13547a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f13547a.m17448b0();
    }
}
