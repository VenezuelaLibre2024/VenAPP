package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p036c4.C1862c;
import p036c4.C1866g;
import p129h3.C7621e;
import p129h3.EnumC7617a;
import p246n3.C9642h;

/* renamed from: com.bumptech.glide.load.data.j */
/* loaded from: classes.dex */
public class C2139j implements InterfaceC2133d<InputStream> {

    /* renamed from: r */
    static final b f8429r = new a();

    /* renamed from: a */
    private final C9642h f8430a;

    /* renamed from: b */
    private final int f8431b;

    /* renamed from: c */
    private final b f8432c;

    /* renamed from: d */
    private HttpURLConnection f8433d;

    /* renamed from: e */
    private InputStream f8434e;

    /* renamed from: f */
    private volatile boolean f8435f;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    /* loaded from: classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.C2139j.b
        /* renamed from: a */
        public HttpURLConnection mo10787a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.data.j$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        HttpURLConnection mo10787a(URL url);
    }

    public C2139j(C9642h c9642h, int i10) {
        this(c9642h, i10, f8429r);
    }

    C2139j(C9642h c9642h, int i10, b bVar) {
        this.f8430a = c9642h;
        this.f8431b = i10;
        this.f8432c = bVar;
    }

    /* renamed from: c */
    private HttpURLConnection m10781c(URL url, Map<String, String> map) {
        try {
            HttpURLConnection mo10787a = this.f8432c.mo10787a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                mo10787a.addRequestProperty(entry.getKey(), entry.getValue());
            }
            mo10787a.setConnectTimeout(this.f8431b);
            mo10787a.setReadTimeout(this.f8431b);
            mo10787a.setUseCaches(false);
            mo10787a.setDoInput(true);
            mo10787a.setInstanceFollowRedirects(false);
            return mo10787a;
        } catch (IOException e10) {
            throw new C7621e("URL.openConnection threw", 0, e10);
        }
    }

    /* renamed from: f */
    private static int m10782f(HttpURLConnection httpURLConnection) {
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

    /* renamed from: g */
    private InputStream m10783g(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                inputStream = C1862c.m9925b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                inputStream = httpURLConnection.getInputStream();
            }
            this.f8434e = inputStream;
            return this.f8434e;
        } catch (IOException e10) {
            throw new C7621e("Failed to obtain InputStream", m10782f(httpURLConnection), e10);
        }
    }

    /* renamed from: h */
    private static boolean m10784h(int i10) {
        return i10 / 100 == 2;
    }

    /* renamed from: i */
    private static boolean m10785i(int i10) {
        return i10 / 100 == 3;
    }

    /* renamed from: j */
    private InputStream m10786j(URL url, int i10, URL url2, Map<String, String> map) {
        if (i10 >= 5) {
            throw new C7621e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C7621e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection m10781c = m10781c(url, map);
        this.f8433d = m10781c;
        try {
            m10781c.connect();
            this.f8434e = this.f8433d.getInputStream();
            if (this.f8435f) {
                return null;
            }
            int m10782f = m10782f(this.f8433d);
            if (m10784h(m10782f)) {
                return m10783g(this.f8433d);
            }
            if (!m10785i(m10782f)) {
                if (m10782f == -1) {
                    throw new C7621e(m10782f);
                }
                try {
                    throw new C7621e(this.f8433d.getResponseMessage(), m10782f);
                } catch (IOException e10) {
                    throw new C7621e("Failed to get a response message", m10782f, e10);
                }
            }
            String headerField = this.f8433d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new C7621e("Received empty or null redirect url", m10782f);
            }
            try {
                URL url3 = new URL(url, headerField);
                mo10765b();
                return m10786j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new C7621e("Bad redirect url: " + headerField, m10782f, e11);
            }
        } catch (IOException e12) {
            throw new C7621e("Failed to connect or obtain data", m10782f(this.f8433d), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: a */
    public Class<InputStream> mo10760a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: b */
    public void mo10765b() {
        InputStream inputStream = this.f8434e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f8433d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f8433d = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    public void cancel() {
        this.f8435f = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: d */
    public EnumC7617a mo10767d() {
        return EnumC7617a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: e */
    public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        long m9934b = C1866g.m9934b();
        try {
            try {
                aVar.mo10774f(m10786j(this.f8430a.m28894h(), 0, null, this.f8430a.m28893e()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.mo10773c(e10);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb2 = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(C1866g.m9933a(m9934b));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C1866g.m9933a(m9934b));
            }
            throw th2;
        }
    }
}
