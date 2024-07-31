package p473yl;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import dk.C7019l;
import dk.C7042z;
import dm.C7056b;
import dm.C7061e;
import dm.C7068l;
import dm.InterfaceC7060d;
import dm.InterfaceC7080x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p341rl.C10727d;

/* renamed from: yl.d */
/* loaded from: classes3.dex */
public final class C12736d {

    /* renamed from: a */
    public static final C12736d f34564a;

    /* renamed from: b */
    private static final C12735c[] f34565b;

    /* renamed from: c */
    private static final Map<C7061e, Integer> f34566c;

    /* renamed from: yl.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final int f34567a;

        /* renamed from: b */
        private int f34568b;

        /* renamed from: c */
        private final List<C12735c> f34569c;

        /* renamed from: d */
        private final InterfaceC7060d f34570d;

        /* renamed from: e */
        public C12735c[] f34571e;

        /* renamed from: f */
        private int f34572f;

        /* renamed from: g */
        public int f34573g;

        /* renamed from: h */
        public int f34574h;

        public a(InterfaceC7080x source, int i10, int i11) {
            C9322n.m27781e(source, "source");
            this.f34567a = i10;
            this.f34568b = i11;
            this.f34569c = new ArrayList();
            this.f34570d = C7068l.m20803b(source);
            this.f34571e = new C12735c[8];
            this.f34572f = r2.length - 1;
        }

        public /* synthetic */ a(InterfaceC7080x interfaceC7080x, int i10, int i11, int i12, C9315g c9315g) {
            this(interfaceC7080x, i10, (i12 & 4) != 0 ? i10 : i11);
        }

        /* renamed from: a */
        private final void m42056a() {
            int i10 = this.f34568b;
            int i11 = this.f34574h;
            if (i10 < i11) {
                if (i10 == 0) {
                    m42057b();
                } else {
                    m42059d(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        private final void m42057b() {
            C7019l.m20444l(this.f34571e, null, 0, 0, 6, null);
            this.f34572f = this.f34571e.length - 1;
            this.f34573g = 0;
            this.f34574h = 0;
        }

        /* renamed from: c */
        private final int m42058c(int i10) {
            return this.f34572f + 1 + i10;
        }

        /* renamed from: d */
        private final int m42059d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f34571e.length;
                while (true) {
                    length--;
                    i11 = this.f34572f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C12735c c12735c = this.f34571e[length];
                    C9322n.m27778b(c12735c);
                    int i13 = c12735c.f34563c;
                    i10 -= i13;
                    this.f34574h -= i13;
                    this.f34573g--;
                    i12++;
                }
                C12735c[] c12735cArr = this.f34571e;
                System.arraycopy(c12735cArr, i11 + 1, c12735cArr, i11 + 1 + i12, this.f34573g);
                this.f34572f += i12;
            }
            return i12;
        }

        /* renamed from: f */
        private final C7061e m42060f(int i10) {
            C12735c c12735c;
            if (!m42062h(i10)) {
                int m42058c = m42058c(i10 - C12736d.f34564a.m42055c().length);
                if (m42058c >= 0) {
                    C12735c[] c12735cArr = this.f34571e;
                    if (m42058c < c12735cArr.length) {
                        c12735c = c12735cArr[m42058c];
                        C9322n.m27778b(c12735c);
                    }
                }
                throw new IOException(C9322n.m27787k("Header index too large ", Integer.valueOf(i10 + 1)));
            }
            c12735c = C12736d.f34564a.m42055c()[i10];
            return c12735c.f34561a;
        }

        /* renamed from: g */
        private final void m42061g(int i10, C12735c c12735c) {
            this.f34569c.add(c12735c);
            int i11 = c12735c.f34563c;
            if (i10 != -1) {
                C12735c c12735c2 = this.f34571e[m42058c(i10)];
                C9322n.m27778b(c12735c2);
                i11 -= c12735c2.f34563c;
            }
            int i12 = this.f34568b;
            if (i11 > i12) {
                m42057b();
                return;
            }
            int m42059d = m42059d((this.f34574h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f34573g + 1;
                C12735c[] c12735cArr = this.f34571e;
                if (i13 > c12735cArr.length) {
                    C12735c[] c12735cArr2 = new C12735c[c12735cArr.length * 2];
                    System.arraycopy(c12735cArr, 0, c12735cArr2, c12735cArr.length, c12735cArr.length);
                    this.f34572f = this.f34571e.length - 1;
                    this.f34571e = c12735cArr2;
                }
                int i14 = this.f34572f;
                this.f34572f = i14 - 1;
                this.f34571e[i14] = c12735c;
                this.f34573g++;
            } else {
                this.f34571e[i10 + m42058c(i10) + m42059d] = c12735c;
            }
            this.f34574h += i11;
        }

        /* renamed from: h */
        private final boolean m42062h(int i10) {
            return i10 >= 0 && i10 <= C12736d.f34564a.m42055c().length - 1;
        }

        /* renamed from: i */
        private final int m42063i() {
            return C10727d.m32644d(this.f34570d.readByte(), 255);
        }

        /* renamed from: l */
        private final void m42064l(int i10) {
            if (m42062h(i10)) {
                this.f34569c.add(C12736d.f34564a.m42055c()[i10]);
                return;
            }
            int m42058c = m42058c(i10 - C12736d.f34564a.m42055c().length);
            if (m42058c >= 0) {
                C12735c[] c12735cArr = this.f34571e;
                if (m42058c < c12735cArr.length) {
                    List<C12735c> list = this.f34569c;
                    C12735c c12735c = c12735cArr[m42058c];
                    C9322n.m27778b(c12735c);
                    list.add(c12735c);
                    return;
                }
            }
            throw new IOException(C9322n.m27787k("Header index too large ", Integer.valueOf(i10 + 1)));
        }

        /* renamed from: n */
        private final void m42065n(int i10) {
            m42061g(-1, new C12735c(m42060f(i10), m42070j()));
        }

        /* renamed from: o */
        private final void m42066o() {
            m42061g(-1, new C12735c(C12736d.f34564a.m42053a(m42070j()), m42070j()));
        }

        /* renamed from: p */
        private final void m42067p(int i10) {
            this.f34569c.add(new C12735c(m42060f(i10), m42070j()));
        }

        /* renamed from: q */
        private final void m42068q() {
            this.f34569c.add(new C12735c(C12736d.f34564a.m42053a(m42070j()), m42070j()));
        }

        /* renamed from: e */
        public final List<C12735c> m42069e() {
            List<C12735c> m20630f0;
            m20630f0 = C7042z.m20630f0(this.f34569c);
            this.f34569c.clear();
            return m20630f0;
        }

        /* renamed from: j */
        public final C7061e m42070j() {
            int m42063i = m42063i();
            boolean z10 = (m42063i & RecognitionOptions.ITF) == 128;
            long m42072m = m42072m(m42063i, 127);
            if (!z10) {
                return this.f34570d.mo20739w0(m42072m);
            }
            C7056b c7056b = new C7056b();
            C12743k.f34747a.m42261b(this.f34570d, m42072m, c7056b);
            return c7056b.m20697I();
        }

        /* renamed from: k */
        public final void m42071k() {
            while (!this.f34570d.mo20695G0()) {
                int m32644d = C10727d.m32644d(this.f34570d.readByte(), 255);
                if (m32644d == 128) {
                    throw new IOException("index == 0");
                }
                if ((m32644d & RecognitionOptions.ITF) == 128) {
                    m42064l(m42072m(m32644d, 127) - 1);
                } else if (m32644d == 64) {
                    m42066o();
                } else if ((m32644d & 64) == 64) {
                    m42065n(m42072m(m32644d, 63) - 1);
                } else if ((m32644d & 32) == 32) {
                    int m42072m = m42072m(m32644d, 31);
                    this.f34568b = m42072m;
                    if (m42072m < 0 || m42072m > this.f34567a) {
                        throw new IOException(C9322n.m27787k("Invalid dynamic table size update ", Integer.valueOf(this.f34568b)));
                    }
                    m42056a();
                } else if (m32644d == 16 || m32644d == 0) {
                    m42068q();
                } else {
                    m42067p(m42072m(m32644d, 15) - 1);
                }
            }
        }

        /* renamed from: m */
        public final int m42072m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int m42063i = m42063i();
                if ((m42063i & RecognitionOptions.ITF) == 0) {
                    return i11 + (m42063i << i13);
                }
                i11 += (m42063i & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* renamed from: yl.d$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public int f34575a;

        /* renamed from: b */
        private final boolean f34576b;

        /* renamed from: c */
        private final C7056b f34577c;

        /* renamed from: d */
        private int f34578d;

        /* renamed from: e */
        private boolean f34579e;

        /* renamed from: f */
        public int f34580f;

        /* renamed from: g */
        public C12735c[] f34581g;

        /* renamed from: h */
        private int f34582h;

        /* renamed from: i */
        public int f34583i;

        /* renamed from: j */
        public int f34584j;

        public b(int i10, boolean z10, C7056b out) {
            C9322n.m27781e(out, "out");
            this.f34575a = i10;
            this.f34576b = z10;
            this.f34577c = out;
            this.f34578d = C5101a.e.API_PRIORITY_OTHER;
            this.f34580f = i10;
            this.f34581g = new C12735c[8];
            this.f34582h = r2.length - 1;
        }

        public /* synthetic */ b(int i10, boolean z10, C7056b c7056b, int i11, C9315g c9315g) {
            this((i11 & 1) != 0 ? RecognitionOptions.AZTEC : i10, (i11 & 2) != 0 ? true : z10, c7056b);
        }

        /* renamed from: a */
        private final void m42073a() {
            int i10 = this.f34580f;
            int i11 = this.f34584j;
            if (i10 < i11) {
                if (i10 == 0) {
                    m42074b();
                } else {
                    m42075c(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        private final void m42074b() {
            C7019l.m20444l(this.f34581g, null, 0, 0, 6, null);
            this.f34582h = this.f34581g.length - 1;
            this.f34583i = 0;
            this.f34584j = 0;
        }

        /* renamed from: c */
        private final int m42075c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f34581g.length;
                while (true) {
                    length--;
                    i11 = this.f34582h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C12735c c12735c = this.f34581g[length];
                    C9322n.m27778b(c12735c);
                    i10 -= c12735c.f34563c;
                    int i13 = this.f34584j;
                    C12735c c12735c2 = this.f34581g[length];
                    C9322n.m27778b(c12735c2);
                    this.f34584j = i13 - c12735c2.f34563c;
                    this.f34583i--;
                    i12++;
                }
                C12735c[] c12735cArr = this.f34581g;
                System.arraycopy(c12735cArr, i11 + 1, c12735cArr, i11 + 1 + i12, this.f34583i);
                C12735c[] c12735cArr2 = this.f34581g;
                int i14 = this.f34582h;
                Arrays.fill(c12735cArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f34582h += i12;
            }
            return i12;
        }

        /* renamed from: d */
        private final void m42076d(C12735c c12735c) {
            int i10 = c12735c.f34563c;
            int i11 = this.f34580f;
            if (i10 > i11) {
                m42074b();
                return;
            }
            m42075c((this.f34584j + i10) - i11);
            int i12 = this.f34583i + 1;
            C12735c[] c12735cArr = this.f34581g;
            if (i12 > c12735cArr.length) {
                C12735c[] c12735cArr2 = new C12735c[c12735cArr.length * 2];
                System.arraycopy(c12735cArr, 0, c12735cArr2, c12735cArr.length, c12735cArr.length);
                this.f34582h = this.f34581g.length - 1;
                this.f34581g = c12735cArr2;
            }
            int i13 = this.f34582h;
            this.f34582h = i13 - 1;
            this.f34581g[i13] = c12735c;
            this.f34583i++;
            this.f34584j += i10;
        }

        /* renamed from: e */
        public final void m42077e(int i10) {
            this.f34575a = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f34580f;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f34578d = Math.min(this.f34578d, min);
            }
            this.f34579e = true;
            this.f34580f = min;
            m42073a();
        }

        /* renamed from: f */
        public final void m42078f(C7061e data) {
            int m20756B;
            int i10;
            C9322n.m27781e(data, "data");
            if (this.f34576b) {
                C12743k c12743k = C12743k.f34747a;
                if (c12743k.m42263d(data) < data.m20756B()) {
                    C7056b c7056b = new C7056b();
                    c12743k.m42262c(data, c7056b);
                    data = c7056b.m20697I();
                    m20756B = data.m20756B();
                    i10 = RecognitionOptions.ITF;
                    m42080h(m20756B, 127, i10);
                    this.f34577c.mo20715b0(data);
                }
            }
            m20756B = data.m20756B();
            i10 = 0;
            m42080h(m20756B, 127, i10);
            this.f34577c.mo20715b0(data);
        }

        /* renamed from: g */
        public final void m42079g(List<C12735c> headerBlock) {
            int i10;
            int i11;
            C9322n.m27781e(headerBlock, "headerBlock");
            if (this.f34579e) {
                int i12 = this.f34578d;
                if (i12 < this.f34580f) {
                    m42080h(i12, 31, 32);
                }
                this.f34579e = false;
                this.f34578d = C5101a.e.API_PRIORITY_OTHER;
                m42080h(this.f34580f, 31, 32);
            }
            int size = headerBlock.size();
            int i13 = 0;
            while (i13 < size) {
                int i14 = i13 + 1;
                C12735c c12735c = headerBlock.get(i13);
                C7061e mo20758D = c12735c.f34561a.mo20758D();
                C7061e c7061e = c12735c.f34562b;
                C12736d c12736d = C12736d.f34564a;
                Integer num = c12736d.m42054b().get(mo20758D);
                if (num != null) {
                    i11 = num.intValue() + 1;
                    if (2 <= i11 && i11 < 8) {
                        if (C9322n.m27777a(c12736d.m42055c()[i11 - 1].f34562b, c7061e)) {
                            i10 = i11;
                        } else if (C9322n.m27777a(c12736d.m42055c()[i11].f34562b, c7061e)) {
                            i11++;
                            i10 = i11;
                        }
                    }
                    i10 = i11;
                    i11 = -1;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                if (i11 == -1) {
                    int i15 = this.f34582h + 1;
                    int length = this.f34581g.length;
                    while (true) {
                        if (i15 >= length) {
                            break;
                        }
                        int i16 = i15 + 1;
                        C12735c c12735c2 = this.f34581g[i15];
                        C9322n.m27778b(c12735c2);
                        if (C9322n.m27777a(c12735c2.f34561a, mo20758D)) {
                            C12735c c12735c3 = this.f34581g[i15];
                            C9322n.m27778b(c12735c3);
                            if (C9322n.m27777a(c12735c3.f34562b, c7061e)) {
                                i11 = C12736d.f34564a.m42055c().length + (i15 - this.f34582h);
                                break;
                            } else if (i10 == -1) {
                                i10 = C12736d.f34564a.m42055c().length + (i15 - this.f34582h);
                            }
                        }
                        i15 = i16;
                    }
                }
                if (i11 != -1) {
                    m42080h(i11, 127, RecognitionOptions.ITF);
                } else {
                    if (i10 == -1) {
                        this.f34577c.writeByte(64);
                        m42078f(mo20758D);
                    } else if (!mo20758D.m20757C(C12735c.f34555e) || C9322n.m27777a(C12735c.f34560j, mo20758D)) {
                        m42080h(i10, 63, 64);
                    } else {
                        m42080h(i10, 15, 0);
                        m42078f(c7061e);
                    }
                    m42078f(c7061e);
                    m42076d(c12735c);
                }
                i13 = i14;
            }
        }

        /* renamed from: h */
        public final void m42080h(int i10, int i11, int i12) {
            int i13;
            C7056b c7056b;
            if (i10 < i11) {
                c7056b = this.f34577c;
                i13 = i10 | i12;
            } else {
                this.f34577c.writeByte(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f34577c.writeByte(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                c7056b = this.f34577c;
            }
            c7056b.writeByte(i13);
        }
    }

    static {
        C12736d c12736d = new C12736d();
        f34564a = c12736d;
        C7061e c7061e = C12735c.f34557g;
        C7061e c7061e2 = C12735c.f34558h;
        C7061e c7061e3 = C12735c.f34559i;
        C7061e c7061e4 = C12735c.f34556f;
        f34565b = new C12735c[]{new C12735c(C12735c.f34560j, ""), new C12735c(c7061e, "GET"), new C12735c(c7061e, "POST"), new C12735c(c7061e2, "/"), new C12735c(c7061e2, "/index.html"), new C12735c(c7061e3, "http"), new C12735c(c7061e3, "https"), new C12735c(c7061e4, "200"), new C12735c(c7061e4, "204"), new C12735c(c7061e4, "206"), new C12735c(c7061e4, "304"), new C12735c(c7061e4, "400"), new C12735c(c7061e4, "404"), new C12735c(c7061e4, "500"), new C12735c("accept-charset", ""), new C12735c("accept-encoding", "gzip, deflate"), new C12735c("accept-language", ""), new C12735c("accept-ranges", ""), new C12735c("accept", ""), new C12735c("access-control-allow-origin", ""), new C12735c("age", ""), new C12735c("allow", ""), new C12735c("authorization", ""), new C12735c("cache-control", ""), new C12735c("content-disposition", ""), new C12735c("content-encoding", ""), new C12735c("content-language", ""), new C12735c("content-length", ""), new C12735c("content-location", ""), new C12735c("content-range", ""), new C12735c("content-type", ""), new C12735c("cookie", ""), new C12735c("date", ""), new C12735c("etag", ""), new C12735c("expect", ""), new C12735c("expires", ""), new C12735c("from", ""), new C12735c(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new C12735c("if-match", ""), new C12735c("if-modified-since", ""), new C12735c("if-none-match", ""), new C12735c("if-range", ""), new C12735c("if-unmodified-since", ""), new C12735c("last-modified", ""), new C12735c("link", ""), new C12735c("location", ""), new C12735c("max-forwards", ""), new C12735c("proxy-authenticate", ""), new C12735c("proxy-authorization", ""), new C12735c("range", ""), new C12735c("referer", ""), new C12735c("refresh", ""), new C12735c("retry-after", ""), new C12735c("server", ""), new C12735c("set-cookie", ""), new C12735c("strict-transport-security", ""), new C12735c("transfer-encoding", ""), new C12735c("user-agent", ""), new C12735c("vary", ""), new C12735c("via", ""), new C12735c("www-authenticate", "")};
        f34566c = c12736d.m42052d();
    }

    private C12736d() {
    }

    /* renamed from: d */
    private final Map<C7061e, Integer> m42052d() {
        C12735c[] c12735cArr = f34565b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c12735cArr.length);
        int length = c12735cArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            C12735c[] c12735cArr2 = f34565b;
            if (!linkedHashMap.containsKey(c12735cArr2[i10].f34561a)) {
                linkedHashMap.put(c12735cArr2[i10].f34561a, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map<C7061e, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C9322n.m27780d(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public final C7061e m42053a(C7061e name) {
        C9322n.m27781e(name, "name");
        int m20756B = name.m20756B();
        int i10 = 0;
        while (i10 < m20756B) {
            int i11 = i10 + 1;
            byte m20765m = name.m20765m(i10);
            if (65 <= m20765m && m20765m <= 90) {
                throw new IOException(C9322n.m27787k("PROTOCOL_ERROR response malformed: mixed case name: ", name.m20760F()));
            }
            i10 = i11;
        }
        return name;
    }

    /* renamed from: b */
    public final Map<C7061e, Integer> m42054b() {
        return f34566c;
    }

    /* renamed from: c */
    public final C12735c[] m42055c() {
        return f34565b;
    }
}
