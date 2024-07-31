package p351s8;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.AbstractC5897r;
import com.google.common.collect.AbstractC5911y;
import com.google.common.collect.C5862c1;
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
import p082eb.InterfaceC7160p;
import p351s8.C10841s;
import p351s8.InterfaceC10827j;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: s8.s */
/* loaded from: classes.dex */
public class C10841s extends AbstractC10819f {

    /* renamed from: e */
    private final boolean f27486e;

    /* renamed from: f */
    private final int f27487f;

    /* renamed from: g */
    private final int f27488g;

    /* renamed from: h */
    private final String f27489h;

    /* renamed from: i */
    private final C10812b0 f27490i;

    /* renamed from: j */
    private final C10812b0 f27491j;

    /* renamed from: k */
    private final boolean f27492k;

    /* renamed from: l */
    private InterfaceC7160p<String> f27493l;

    /* renamed from: m */
    private C10835n f27494m;

    /* renamed from: n */
    private HttpURLConnection f27495n;

    /* renamed from: o */
    private InputStream f27496o;

    /* renamed from: p */
    private boolean f27497p;

    /* renamed from: q */
    private int f27498q;

    /* renamed from: r */
    private long f27499r;

    /* renamed from: s */
    private long f27500s;

    /* renamed from: s8.s$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC10827j.a {

        /* renamed from: b */
        private InterfaceC10834m0 f27502b;

        /* renamed from: c */
        private InterfaceC7160p<String> f27503c;

        /* renamed from: d */
        private String f27504d;

        /* renamed from: g */
        private boolean f27507g;

        /* renamed from: h */
        private boolean f27508h;

        /* renamed from: a */
        private final C10812b0 f27501a = new C10812b0();

        /* renamed from: e */
        private int f27505e = 8000;

        /* renamed from: f */
        private int f27506f = 8000;

        @Override // p351s8.InterfaceC10827j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10841s mo33002a() {
            C10841s c10841s = new C10841s(this.f27504d, this.f27505e, this.f27506f, this.f27507g, this.f27501a, this.f27503c, this.f27508h);
            InterfaceC10834m0 interfaceC10834m0 = this.f27502b;
            if (interfaceC10834m0 != null) {
                c10841s.mo161l(interfaceC10834m0);
            }
            return c10841s;
        }

        /* renamed from: c */
        public b m33075c(boolean z10) {
            this.f27507g = z10;
            return this;
        }

        /* renamed from: d */
        public final b m33076d(Map<String, String> map) {
            this.f27501a.m32947a(map);
            return this;
        }

        /* renamed from: e */
        public b m33077e(String str) {
            this.f27504d = str;
            return this;
        }
    }

    /* renamed from: s8.s$c */
    /* loaded from: classes.dex */
    private static class c extends AbstractC5897r<String, List<String>> {

        /* renamed from: a */
        private final Map<String, List<String>> f27509a;

        public c(Map<String, List<String>> map) {
            this.f27509a = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static /* synthetic */ boolean m33080j(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static /* synthetic */ boolean m33081k(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC5899s
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<String, List<String>> mo9604a() {
            return this.f27509a;
        }

        @Override // com.google.common.collect.AbstractC5897r, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC5897r, java.util.Map
        public boolean containsValue(Object obj) {
            return super.m15036c(obj);
        }

        @Override // com.google.common.collect.AbstractC5897r, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return C5862c1.m14772b(super.entrySet(), new InterfaceC7160p() { // from class: s8.u
                @Override // p082eb.InterfaceC7160p
                public final boolean apply(Object obj) {
                    boolean m33080j;
                    m33080j = C10841s.c.m33080j((Map.Entry) obj);
                    return m33080j;
                }
            });
        }

        @Override // com.google.common.collect.AbstractC5897r, java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.m15037d(obj);
        }

        @Override // com.google.common.collect.AbstractC5897r, java.util.Map
        public int hashCode() {
            return super.m15038e();
        }

        @Override // com.google.common.collect.AbstractC5897r, java.util.Map
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.AbstractC5897r, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.AbstractC5897r, java.util.Map
        public Set<String> keySet() {
            return C5862c1.m14772b(super.keySet(), new InterfaceC7160p() { // from class: s8.t
                @Override // p082eb.InterfaceC7160p
                public final boolean apply(Object obj) {
                    boolean m33081k;
                    m33081k = C10841s.c.m33081k((String) obj);
                    return m33081k;
                }
            });
        }

        @Override // com.google.common.collect.AbstractC5897r, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private C10841s(String str, int i10, int i11, boolean z10, C10812b0 c10812b0, InterfaceC7160p<String> interfaceC7160p, boolean z11) {
        super(true);
        this.f27489h = str;
        this.f27487f = i10;
        this.f27488g = i11;
        this.f27486e = z10;
        this.f27490i = c10812b0;
        this.f27493l = interfaceC7160p;
        this.f27491j = new C10812b0();
        this.f27492k = z11;
    }

    /* renamed from: A */
    private static void m33065A(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = C11172r0.f29040a) >= 19 && i10 <= 20) {
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
                Method declaredMethod = ((Class) C11137a.m34603e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: C */
    private int m33066C(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f27499r;
        if (j10 != -1) {
            long j11 = j10 - this.f27500s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) C11172r0.m34928j(this.f27496o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f27500s += read;
        m32994r(read);
        return read;
    }

    /* renamed from: D */
    private void m33067D(long j10, C10835n c10835n) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        while (j10 > 0) {
            int read = ((InputStream) C11172r0.m34928j(this.f27496o)).read(bArr, 0, (int) Math.min(j10, RecognitionOptions.AZTEC));
            if (Thread.currentThread().isInterrupted()) {
                throw new C10847y(new InterruptedIOException(), c10835n, AdError.SERVER_ERROR_CODE, 1);
            }
            if (read == -1) {
                throw new C10847y(c10835n, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
            j10 -= read;
            m32994r(read);
        }
    }

    /* renamed from: v */
    private void m33068v() {
        HttpURLConnection httpURLConnection = this.f27495n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                C11173s.m34965d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f27495n = null;
        }
    }

    /* renamed from: w */
    private URL m33069w(URL url, String str, C10835n c10835n) {
        if (str == null) {
            throw new C10847y("Null location redirect", c10835n, AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C10847y("Unsupported protocol redirect: " + protocol, c10835n, AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f27486e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C10847y("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c10835n, AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e10) {
            throw new C10847y(e10, c10835n, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    /* renamed from: x */
    private static boolean m33070x(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: y */
    private HttpURLConnection m33071y(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        HttpURLConnection m33073B = m33073B(url);
        m33073B.setConnectTimeout(this.f27487f);
        m33073B.setReadTimeout(this.f27488g);
        HashMap hashMap = new HashMap();
        C10812b0 c10812b0 = this.f27490i;
        if (c10812b0 != null) {
            hashMap.putAll(c10812b0.m32948b());
        }
        hashMap.putAll(this.f27491j.m32948b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            m33073B.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String m32949a = C10814c0.m32949a(j10, j11);
        if (m32949a != null) {
            m33073B.setRequestProperty("Range", m32949a);
        }
        String str = this.f27489h;
        if (str != null) {
            m33073B.setRequestProperty("User-Agent", str);
        }
        m33073B.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        m33073B.setInstanceFollowRedirects(z11);
        m33073B.setDoOutput(bArr != null);
        m33073B.setRequestMethod(C10835n.m33024c(i10));
        if (bArr != null) {
            m33073B.setFixedLengthStreamingMode(bArr.length);
            m33073B.connect();
            OutputStream outputStream = m33073B.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            m33073B.connect();
        }
        return m33073B;
    }

    /* renamed from: z */
    private HttpURLConnection m33072z(C10835n c10835n) {
        HttpURLConnection m33071y;
        URL url = new URL(c10835n.f27407a.toString());
        int i10 = c10835n.f27409c;
        byte[] bArr = c10835n.f27410d;
        long j10 = c10835n.f27413g;
        long j11 = c10835n.f27414h;
        boolean m33027d = c10835n.m33027d(1);
        if (!this.f27486e && !this.f27492k) {
            return m33071y(url, i10, bArr, j10, j11, m33027d, true, c10835n.f27411e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new C10847y(new NoRouteToHostException("Too many redirects: " + i13), c10835n, AdError.INTERNAL_ERROR_CODE, 1);
            }
            long j12 = j10;
            long j13 = j10;
            int i14 = i11;
            URL url3 = url2;
            long j14 = j11;
            m33071y = m33071y(url2, i11, bArr2, j12, j11, m33027d, false, c10835n.f27411e);
            int responseCode = m33071y.getResponseCode();
            String headerField = m33071y.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                m33071y.disconnect();
                url2 = m33069w(url3, headerField, c10835n);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                m33071y.disconnect();
                if (this.f27492k && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                url2 = m33069w(url3, headerField, c10835n);
            }
            i12 = i13;
            j10 = j13;
            j11 = j14;
        }
        return m33071y;
    }

    /* renamed from: B */
    HttpURLConnection m33073B(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        try {
            InputStream inputStream = this.f27496o;
            if (inputStream != null) {
                long j10 = this.f27499r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f27500s;
                }
                m33065A(this.f27495n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new C10847y(e10, (C10835n) C11172r0.m34928j(this.f27494m), AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.f27496o = null;
            m33068v();
            if (this.f27497p) {
                this.f27497p = false;
                m32995s();
            }
        }
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: e */
    public Map<String, List<String>> mo159e() {
        HttpURLConnection httpURLConnection = this.f27495n;
        return httpURLConnection == null ? AbstractC5911y.m15111k() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f27495n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        byte[] bArr;
        this.f27494m = c10835n;
        long j10 = 0;
        this.f27500s = 0L;
        this.f27499r = 0L;
        m32996t(c10835n);
        try {
            HttpURLConnection m33072z = m33072z(c10835n);
            this.f27495n = m33072z;
            this.f27498q = m33072z.getResponseCode();
            String responseMessage = m33072z.getResponseMessage();
            int i10 = this.f27498q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = m33072z.getHeaderFields();
                if (this.f27498q == 416) {
                    if (c10835n.f27413g == C10814c0.m32951c(m33072z.getHeaderField("Content-Range"))) {
                        this.f27497p = true;
                        m32997u(c10835n);
                        long j11 = c10835n.f27414h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = m33072z.getErrorStream();
                try {
                    bArr = errorStream != null ? C11172r0.m34899V0(errorStream) : C11172r0.f29045f;
                } catch (IOException unused) {
                    bArr = C11172r0.f29045f;
                }
                byte[] bArr2 = bArr;
                m33068v();
                throw new C10810a0(this.f27498q, responseMessage, this.f27498q == 416 ? new C10829k(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, c10835n, bArr2);
            }
            String contentType = m33072z.getContentType();
            InterfaceC7160p<String> interfaceC7160p = this.f27493l;
            if (interfaceC7160p != null && !interfaceC7160p.apply(contentType)) {
                m33068v();
                throw new C10848z(contentType, c10835n);
            }
            if (this.f27498q == 200) {
                long j12 = c10835n.f27413g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean m33070x = m33070x(m33072z);
            if (m33070x) {
                this.f27499r = c10835n.f27414h;
            } else {
                long j13 = c10835n.f27414h;
                if (j13 != -1) {
                    this.f27499r = j13;
                } else {
                    long m32950b = C10814c0.m32950b(m33072z.getHeaderField("Content-Length"), m33072z.getHeaderField("Content-Range"));
                    this.f27499r = m32950b != -1 ? m32950b - j10 : -1L;
                }
            }
            try {
                this.f27496o = m33072z.getInputStream();
                if (m33070x) {
                    this.f27496o = new GZIPInputStream(this.f27496o);
                }
                this.f27497p = true;
                m32997u(c10835n);
                try {
                    m33067D(j10, c10835n);
                    return this.f27499r;
                } catch (IOException e10) {
                    m33068v();
                    if (e10 instanceof C10847y) {
                        throw ((C10847y) e10);
                    }
                    throw new C10847y(e10, c10835n, AdError.SERVER_ERROR_CODE, 1);
                }
            } catch (IOException e11) {
                m33068v();
                throw new C10847y(e11, c10835n, AdError.SERVER_ERROR_CODE, 1);
            }
        } catch (IOException e12) {
            m33068v();
            throw C10847y.m33088c(e12, c10835n, 1);
        }
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return m33066C(bArr, i10, i11);
        } catch (IOException e10) {
            throw C10847y.m33088c(e10, (C10835n) C11172r0.m34928j(this.f27494m), 2);
        }
    }
}
