package s8;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.c1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import s8.j;
import s8.s;
import t8.r0;

/* loaded from: classes.dex */
public class s extends f {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25367e;

    /* renamed from: f, reason: collision with root package name */
    private final int f25368f;

    /* renamed from: g, reason: collision with root package name */
    private final int f25369g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25370h;

    /* renamed from: i, reason: collision with root package name */
    private final b0 f25371i;

    /* renamed from: j, reason: collision with root package name */
    private final b0 f25372j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f25373k;

    /* renamed from: l, reason: collision with root package name */
    private eb.p<String> f25374l;

    /* renamed from: m, reason: collision with root package name */
    private n f25375m;

    /* renamed from: n, reason: collision with root package name */
    private HttpURLConnection f25376n;

    /* renamed from: o, reason: collision with root package name */
    private InputStream f25377o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25378p;

    /* renamed from: q, reason: collision with root package name */
    private int f25379q;

    /* renamed from: r, reason: collision with root package name */
    private long f25380r;

    /* renamed from: s, reason: collision with root package name */
    private long f25381s;

    /* loaded from: classes.dex */
    public static final class b implements j.a {

        /* renamed from: b, reason: collision with root package name */
        private m0 f25383b;

        /* renamed from: c, reason: collision with root package name */
        private eb.p<String> f25384c;

        /* renamed from: d, reason: collision with root package name */
        private String f25385d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f25388g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f25389h;

        /* renamed from: a, reason: collision with root package name */
        private final b0 f25382a = new b0();

        /* renamed from: e, reason: collision with root package name */
        private int f25386e = 8000;

        /* renamed from: f, reason: collision with root package name */
        private int f25387f = 8000;

        @Override // s8.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a() {
            s sVar = new s(this.f25385d, this.f25386e, this.f25387f, this.f25388g, this.f25382a, this.f25384c, this.f25389h);
            m0 m0Var = this.f25383b;
            if (m0Var != null) {
                sVar.l(m0Var);
            }
            return sVar;
        }

        public b c(boolean z10) {
            this.f25388g = z10;
            return this;
        }

        public final b d(Map<String, String> map) {
            this.f25382a.a(map);
            return this;
        }

        public b e(String str) {
            this.f25385d = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends com.google.common.collect.r<String, List<String>> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, List<String>> f25390a;

        public c(Map<String, List<String>> map) {
            this.f25390a = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean j(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean k(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.s
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<String, List<String>> a() {
            return this.f25390a;
        }

        @Override // com.google.common.collect.r, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.r, java.util.Map
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override // com.google.common.collect.r, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return c1.b(super.entrySet(), new eb.p() { // from class: s8.u
                @Override // eb.p
                public final boolean apply(Object obj) {
                    boolean j10;
                    j10 = s.c.j((Map.Entry) obj);
                    return j10;
                }
            });
        }

        @Override // com.google.common.collect.r, java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        @Override // com.google.common.collect.r, java.util.Map
        public int hashCode() {
            return super.e();
        }

        @Override // com.google.common.collect.r, java.util.Map
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.r, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.r, java.util.Map
        public Set<String> keySet() {
            return c1.b(super.keySet(), new eb.p() { // from class: s8.t
                @Override // eb.p
                public final boolean apply(Object obj) {
                    boolean k10;
                    k10 = s.c.k((String) obj);
                    return k10;
                }
            });
        }

        @Override // com.google.common.collect.r, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private s(String str, int i10, int i11, boolean z10, b0 b0Var, eb.p<String> pVar, boolean z11) {
        super(true);
        this.f25370h = str;
        this.f25368f = i10;
        this.f25369g = i11;
        this.f25367e = z10;
        this.f25371i = b0Var;
        this.f25374l = pVar;
        this.f25372j = new b0();
        this.f25373k = z11;
    }

    private static void A(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = r0.f26744a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) t8.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    private int C(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f25380r;
        if (j10 != -1) {
            long j11 = j10 - this.f25381s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) r0.j(this.f25377o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f25381s += read;
        r(read);
        return read;
    }

    private void D(long j10, n nVar) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        while (j10 > 0) {
            int read = ((InputStream) r0.j(this.f25377o)).read(bArr, 0, (int) Math.min(j10, RecognitionOptions.AZTEC));
            if (Thread.currentThread().isInterrupted()) {
                throw new y(new InterruptedIOException(), nVar, AdError.SERVER_ERROR_CODE, 1);
            }
            if (read == -1) {
                throw new y(nVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
            j10 -= read;
            r(read);
        }
    }

    private void v() {
        HttpURLConnection httpURLConnection = this.f25376n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                t8.s.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f25376n = null;
        }
    }

    private URL w(URL url, String str, n nVar) {
        if (str == null) {
            throw new y("Null location redirect", nVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new y("Unsupported protocol redirect: " + protocol, nVar, AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f25367e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new y("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", nVar, AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e10) {
            throw new y(e10, nVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    private static boolean x(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection y(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        HttpURLConnection B = B(url);
        B.setConnectTimeout(this.f25368f);
        B.setReadTimeout(this.f25369g);
        HashMap hashMap = new HashMap();
        b0 b0Var = this.f25371i;
        if (b0Var != null) {
            hashMap.putAll(b0Var.b());
        }
        hashMap.putAll(this.f25372j.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            B.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = c0.a(j10, j11);
        if (a10 != null) {
            B.setRequestProperty("Range", a10);
        }
        String str = this.f25370h;
        if (str != null) {
            B.setRequestProperty("User-Agent", str);
        }
        B.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        B.setInstanceFollowRedirects(z11);
        B.setDoOutput(bArr != null);
        B.setRequestMethod(n.c(i10));
        if (bArr != null) {
            B.setFixedLengthStreamingMode(bArr.length);
            B.connect();
            OutputStream outputStream = B.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            B.connect();
        }
        return B;
    }

    private HttpURLConnection z(n nVar) {
        HttpURLConnection y10;
        URL url = new URL(nVar.f25288a.toString());
        int i10 = nVar.f25290c;
        byte[] bArr = nVar.f25291d;
        long j10 = nVar.f25294g;
        long j11 = nVar.f25295h;
        boolean d10 = nVar.d(1);
        if (!this.f25367e && !this.f25373k) {
            return y(url, i10, bArr, j10, j11, d10, true, nVar.f25292e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new y(new NoRouteToHostException("Too many redirects: " + i13), nVar, AdError.INTERNAL_ERROR_CODE, 1);
            }
            long j12 = j10;
            long j13 = j10;
            int i14 = i11;
            URL url3 = url2;
            long j14 = j11;
            y10 = y(url2, i11, bArr2, j12, j11, d10, false, nVar.f25292e);
            int responseCode = y10.getResponseCode();
            String headerField = y10.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                y10.disconnect();
                url2 = w(url3, headerField, nVar);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                y10.disconnect();
                if (this.f25373k && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                url2 = w(url3, headerField, nVar);
            }
            i12 = i13;
            j10 = j13;
            j11 = j14;
        }
        return y10;
    }

    HttpURLConnection B(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // s8.j
    public void close() {
        try {
            InputStream inputStream = this.f25377o;
            if (inputStream != null) {
                long j10 = this.f25380r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f25381s;
                }
                A(this.f25376n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new y(e10, (n) r0.j(this.f25375m), AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.f25377o = null;
            v();
            if (this.f25378p) {
                this.f25378p = false;
                s();
            }
        }
    }

    @Override // s8.j
    public Map<String, List<String>> e() {
        HttpURLConnection httpURLConnection = this.f25376n;
        return httpURLConnection == null ? com.google.common.collect.y.k() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // s8.j
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f25376n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // s8.j
    public long o(n nVar) {
        byte[] bArr;
        this.f25375m = nVar;
        long j10 = 0;
        this.f25381s = 0L;
        this.f25380r = 0L;
        t(nVar);
        try {
            HttpURLConnection z10 = z(nVar);
            this.f25376n = z10;
            this.f25379q = z10.getResponseCode();
            String responseMessage = z10.getResponseMessage();
            int i10 = this.f25379q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = z10.getHeaderFields();
                if (this.f25379q == 416) {
                    if (nVar.f25294g == c0.c(z10.getHeaderField("Content-Range"))) {
                        this.f25378p = true;
                        u(nVar);
                        long j11 = nVar.f25295h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = z10.getErrorStream();
                try {
                    bArr = errorStream != null ? r0.V0(errorStream) : r0.f26749f;
                } catch (IOException unused) {
                    bArr = r0.f26749f;
                }
                byte[] bArr2 = bArr;
                v();
                throw new a0(this.f25379q, responseMessage, this.f25379q == 416 ? new k(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, nVar, bArr2);
            }
            String contentType = z10.getContentType();
            eb.p<String> pVar = this.f25374l;
            if (pVar != null && !pVar.apply(contentType)) {
                v();
                throw new z(contentType, nVar);
            }
            if (this.f25379q == 200) {
                long j12 = nVar.f25294g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean x10 = x(z10);
            if (x10) {
                this.f25380r = nVar.f25295h;
            } else {
                long j13 = nVar.f25295h;
                if (j13 != -1) {
                    this.f25380r = j13;
                } else {
                    long b10 = c0.b(z10.getHeaderField("Content-Length"), z10.getHeaderField("Content-Range"));
                    this.f25380r = b10 != -1 ? b10 - j10 : -1L;
                }
            }
            try {
                this.f25377o = z10.getInputStream();
                if (x10) {
                    this.f25377o = new GZIPInputStream(this.f25377o);
                }
                this.f25378p = true;
                u(nVar);
                try {
                    D(j10, nVar);
                    return this.f25380r;
                } catch (IOException e10) {
                    v();
                    if (e10 instanceof y) {
                        throw ((y) e10);
                    }
                    throw new y(e10, nVar, AdError.SERVER_ERROR_CODE, 1);
                }
            } catch (IOException e11) {
                v();
                throw new y(e11, nVar, AdError.SERVER_ERROR_CODE, 1);
            }
        } catch (IOException e12) {
            v();
            throw y.c(e12, nVar, 1);
        }
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return C(bArr, i10, i11);
        } catch (IOException e10) {
            throw y.c(e10, (n) r0.j(this.f25375m), 2);
        }
    }
}
