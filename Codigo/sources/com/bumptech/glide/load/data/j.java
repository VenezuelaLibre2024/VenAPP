package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements d<InputStream> {

    /* renamed from: r, reason: collision with root package name */
    static final b f7462r = new a();

    /* renamed from: a, reason: collision with root package name */
    private final n3.h f7463a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7464b;

    /* renamed from: c, reason: collision with root package name */
    private final b f7465c;

    /* renamed from: d, reason: collision with root package name */
    private HttpURLConnection f7466d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f7467e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f7468f;

    /* loaded from: classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url);
    }

    public j(n3.h hVar, int i10) {
        this(hVar, i10, f7462r);
    }

    j(n3.h hVar, int i10, b bVar) {
        this.f7463a = hVar;
        this.f7464b = i10;
        this.f7465c = bVar;
    }

    private HttpURLConnection c(URL url, Map<String, String> map) {
        try {
            HttpURLConnection a10 = this.f7465c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a10.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a10.setConnectTimeout(this.f7464b);
            a10.setReadTimeout(this.f7464b);
            a10.setUseCaches(false);
            a10.setDoInput(true);
            a10.setInstanceFollowRedirects(false);
            return a10;
        } catch (IOException e10) {
            throw new h3.e("URL.openConnection threw", 0, e10);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                inputStream = c4.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                inputStream = httpURLConnection.getInputStream();
            }
            this.f7467e = inputStream;
            return this.f7467e;
        } catch (IOException e10) {
            throw new h3.e("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map<String, String> map) {
        if (i10 >= 5) {
            throw new h3.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new h3.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection c10 = c(url, map);
        this.f7466d = c10;
        try {
            c10.connect();
            this.f7467e = this.f7466d.getInputStream();
            if (this.f7468f) {
                return null;
            }
            int f10 = f(this.f7466d);
            if (h(f10)) {
                return g(this.f7466d);
            }
            if (!i(f10)) {
                if (f10 == -1) {
                    throw new h3.e(f10);
                }
                try {
                    throw new h3.e(this.f7466d.getResponseMessage(), f10);
                } catch (IOException e10) {
                    throw new h3.e("Failed to get a response message", f10, e10);
                }
            }
            String headerField = this.f7466d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new h3.e("Received empty or null redirect url", f10);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new h3.e("Bad redirect url: " + headerField, f10, e11);
            }
        } catch (IOException e12) {
            throw new h3.e("Failed to connect or obtain data", f(this.f7466d), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f7467e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f7466d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f7466d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f7468f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public h3.a d() {
        return h3.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        long b10 = c4.g.b();
        try {
            try {
                aVar.f(j(this.f7463a.h(), 0, null, this.f7463a.e()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb2 = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(c4.g.a(b10));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + c4.g.a(b10));
            }
            throw th2;
        }
    }
}
