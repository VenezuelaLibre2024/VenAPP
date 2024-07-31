package s8;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t6.r1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f25288a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25289b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25290c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f25291d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f25292e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f25293f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25294g;

    /* renamed from: h, reason: collision with root package name */
    public final long f25295h;

    /* renamed from: i, reason: collision with root package name */
    public final String f25296i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25297j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f25298k;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f25299a;

        /* renamed from: b, reason: collision with root package name */
        private long f25300b;

        /* renamed from: c, reason: collision with root package name */
        private int f25301c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f25302d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f25303e;

        /* renamed from: f, reason: collision with root package name */
        private long f25304f;

        /* renamed from: g, reason: collision with root package name */
        private long f25305g;

        /* renamed from: h, reason: collision with root package name */
        private String f25306h;

        /* renamed from: i, reason: collision with root package name */
        private int f25307i;

        /* renamed from: j, reason: collision with root package name */
        private Object f25308j;

        public b() {
            this.f25301c = 1;
            this.f25303e = Collections.emptyMap();
            this.f25305g = -1L;
        }

        private b(n nVar) {
            this.f25299a = nVar.f25288a;
            this.f25300b = nVar.f25289b;
            this.f25301c = nVar.f25290c;
            this.f25302d = nVar.f25291d;
            this.f25303e = nVar.f25292e;
            this.f25304f = nVar.f25294g;
            this.f25305g = nVar.f25295h;
            this.f25306h = nVar.f25296i;
            this.f25307i = nVar.f25297j;
            this.f25308j = nVar.f25298k;
        }

        public n a() {
            t8.a.j(this.f25299a, "The uri must be set.");
            return new n(this.f25299a, this.f25300b, this.f25301c, this.f25302d, this.f25303e, this.f25304f, this.f25305g, this.f25306h, this.f25307i, this.f25308j);
        }

        public b b(int i10) {
            this.f25307i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f25302d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f25301c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f25303e = map;
            return this;
        }

        public b f(String str) {
            this.f25306h = str;
            return this;
        }

        public b g(long j10) {
            this.f25305g = j10;
            return this;
        }

        public b h(long j10) {
            this.f25304f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f25299a = uri;
            return this;
        }

        public b j(String str) {
            this.f25299a = Uri.parse(str);
            return this;
        }
    }

    static {
        r1.a("goog.exo.datasource");
    }

    public n(Uri uri) {
        this(uri, 0L, -1L);
    }

    private n(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        t8.a.a(j13 >= 0);
        t8.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        t8.a.a(z10);
        this.f25288a = uri;
        this.f25289b = j10;
        this.f25290c = i10;
        this.f25291d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f25292e = Collections.unmodifiableMap(new HashMap(map));
        this.f25294g = j11;
        this.f25293f = j13;
        this.f25295h = j12;
        this.f25296i = str;
        this.f25297j = i11;
        this.f25298k = obj;
    }

    public n(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    public static String c(int i10) {
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

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f25290c);
    }

    public boolean d(int i10) {
        return (this.f25297j & i10) == i10;
    }

    public n e(long j10) {
        long j11 = this.f25295h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public n f(long j10, long j11) {
        return (j10 == 0 && this.f25295h == j11) ? this : new n(this.f25288a, this.f25289b, this.f25290c, this.f25291d, this.f25292e, this.f25294g + j10, j11, this.f25296i, this.f25297j, this.f25298k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f25288a + ", " + this.f25294g + ", " + this.f25295h + ", " + this.f25296i + ", " + this.f25297j + "]";
    }
}
