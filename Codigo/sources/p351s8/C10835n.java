package p351s8;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p361t6.C11093r1;
import p363t8.C11137a;

/* renamed from: s8.n */
/* loaded from: classes.dex */
public final class C10835n {

    /* renamed from: a */
    public final Uri f27407a;

    /* renamed from: b */
    public final long f27408b;

    /* renamed from: c */
    public final int f27409c;

    /* renamed from: d */
    public final byte[] f27410d;

    /* renamed from: e */
    public final Map<String, String> f27411e;

    /* renamed from: f */
    @Deprecated
    public final long f27412f;

    /* renamed from: g */
    public final long f27413g;

    /* renamed from: h */
    public final long f27414h;

    /* renamed from: i */
    public final String f27415i;

    /* renamed from: j */
    public final int f27416j;

    /* renamed from: k */
    public final Object f27417k;

    /* renamed from: s8.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private Uri f27418a;

        /* renamed from: b */
        private long f27419b;

        /* renamed from: c */
        private int f27420c;

        /* renamed from: d */
        private byte[] f27421d;

        /* renamed from: e */
        private Map<String, String> f27422e;

        /* renamed from: f */
        private long f27423f;

        /* renamed from: g */
        private long f27424g;

        /* renamed from: h */
        private String f27425h;

        /* renamed from: i */
        private int f27426i;

        /* renamed from: j */
        private Object f27427j;

        public b() {
            this.f27420c = 1;
            this.f27422e = Collections.emptyMap();
            this.f27424g = -1L;
        }

        private b(C10835n c10835n) {
            this.f27418a = c10835n.f27407a;
            this.f27419b = c10835n.f27408b;
            this.f27420c = c10835n.f27409c;
            this.f27421d = c10835n.f27410d;
            this.f27422e = c10835n.f27411e;
            this.f27423f = c10835n.f27413g;
            this.f27424g = c10835n.f27414h;
            this.f27425h = c10835n.f27415i;
            this.f27426i = c10835n.f27416j;
            this.f27427j = c10835n.f27417k;
        }

        /* renamed from: a */
        public C10835n m33030a() {
            C11137a.m34608j(this.f27418a, "The uri must be set.");
            return new C10835n(this.f27418a, this.f27419b, this.f27420c, this.f27421d, this.f27422e, this.f27423f, this.f27424g, this.f27425h, this.f27426i, this.f27427j);
        }

        /* renamed from: b */
        public b m33031b(int i10) {
            this.f27426i = i10;
            return this;
        }

        /* renamed from: c */
        public b m33032c(byte[] bArr) {
            this.f27421d = bArr;
            return this;
        }

        /* renamed from: d */
        public b m33033d(int i10) {
            this.f27420c = i10;
            return this;
        }

        /* renamed from: e */
        public b m33034e(Map<String, String> map) {
            this.f27422e = map;
            return this;
        }

        /* renamed from: f */
        public b m33035f(String str) {
            this.f27425h = str;
            return this;
        }

        /* renamed from: g */
        public b m33036g(long j10) {
            this.f27424g = j10;
            return this;
        }

        /* renamed from: h */
        public b m33037h(long j10) {
            this.f27423f = j10;
            return this;
        }

        /* renamed from: i */
        public b m33038i(Uri uri) {
            this.f27418a = uri;
            return this;
        }

        /* renamed from: j */
        public b m33039j(String str) {
            this.f27418a = Uri.parse(str);
            return this;
        }
    }

    static {
        C11093r1.m34452a("goog.exo.datasource");
    }

    public C10835n(Uri uri) {
        this(uri, 0L, -1L);
    }

    private C10835n(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        C11137a.m34599a(j13 >= 0);
        C11137a.m34599a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        C11137a.m34599a(z10);
        this.f27407a = uri;
        this.f27408b = j10;
        this.f27409c = i10;
        this.f27410d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f27411e = Collections.unmodifiableMap(new HashMap(map));
        this.f27413g = j11;
        this.f27412f = j13;
        this.f27414h = j12;
        this.f27415i = str;
        this.f27416j = i11;
        this.f27417k = obj;
    }

    public C10835n(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    /* renamed from: c */
    public static String m33024c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public b m33025a() {
        return new b();
    }

    /* renamed from: b */
    public final String m33026b() {
        return m33024c(this.f27409c);
    }

    /* renamed from: d */
    public boolean m33027d(int i10) {
        return (this.f27416j & i10) == i10;
    }

    /* renamed from: e */
    public C10835n m33028e(long j10) {
        long j11 = this.f27414h;
        return m33029f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    /* renamed from: f */
    public C10835n m33029f(long j10, long j11) {
        return (j10 == 0 && this.f27414h == j11) ? this : new C10835n(this.f27407a, this.f27408b, this.f27409c, this.f27410d, this.f27411e, this.f27413g + j10, j11, this.f27415i, this.f27416j, this.f27417k);
    }

    public String toString() {
        return "DataSpec[" + m33026b() + " " + this.f27407a + ", " + this.f27413g + ", " + this.f27414h + ", " + this.f27415i + ", " + this.f27416j + "]";
    }
}
