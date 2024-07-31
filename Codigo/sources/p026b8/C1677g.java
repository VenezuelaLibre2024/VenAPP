package p026b8;

import android.net.Uri;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p377u7.C11446c;
import p436x6.C12318m;

/* renamed from: b8.g */
/* loaded from: classes.dex */
public final class C1677g extends AbstractC1679i {

    /* renamed from: d */
    public final int f7112d;

    /* renamed from: e */
    public final long f7113e;

    /* renamed from: f */
    public final boolean f7114f;

    /* renamed from: g */
    public final boolean f7115g;

    /* renamed from: h */
    public final long f7116h;

    /* renamed from: i */
    public final boolean f7117i;

    /* renamed from: j */
    public final int f7118j;

    /* renamed from: k */
    public final long f7119k;

    /* renamed from: l */
    public final int f7120l;

    /* renamed from: m */
    public final long f7121m;

    /* renamed from: n */
    public final long f7122n;

    /* renamed from: o */
    public final boolean f7123o;

    /* renamed from: p */
    public final boolean f7124p;

    /* renamed from: q */
    public final C12318m f7125q;

    /* renamed from: r */
    public final List<d> f7126r;

    /* renamed from: s */
    public final List<b> f7127s;

    /* renamed from: t */
    public final Map<Uri, c> f7128t;

    /* renamed from: u */
    public final long f7129u;

    /* renamed from: v */
    public final f f7130v;

    /* renamed from: b8.g$b */
    /* loaded from: classes.dex */
    public static final class b extends e {

        /* renamed from: w */
        public final boolean f7131w;

        /* renamed from: x */
        public final boolean f7132x;

        public b(String str, d dVar, long j10, int i10, long j11, C12318m c12318m, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, c12318m, str2, str3, j12, j13, z10);
            this.f7131w = z11;
            this.f7132x = z12;
        }

        /* renamed from: h */
        public b m9236h(long j10, int i10) {
            return new b(this.f7138a, this.f7139b, this.f7140c, i10, j10, this.f7143f, this.f7144r, this.f7145s, this.f7146t, this.f7147u, this.f7148v, this.f7131w, this.f7132x);
        }
    }

    /* renamed from: b8.g$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final Uri f7133a;

        /* renamed from: b */
        public final long f7134b;

        /* renamed from: c */
        public final int f7135c;

        public c(Uri uri, long j10, int i10) {
            this.f7133a = uri;
            this.f7134b = j10;
            this.f7135c = i10;
        }
    }

    /* renamed from: b8.g$d */
    /* loaded from: classes.dex */
    public static final class d extends e {

        /* renamed from: w */
        public final String f7136w;

        /* renamed from: x */
        public final List<b> f7137x;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, AbstractC5907w.m15081v());
        }

        public d(String str, d dVar, String str2, long j10, int i10, long j11, C12318m c12318m, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, c12318m, str3, str4, j12, j13, z10);
            this.f7136w = str2;
            this.f7137x = AbstractC5907w.m15079r(list);
        }

        /* renamed from: h */
        public d m9237h(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f7137x.size(); i11++) {
                b bVar = this.f7137x.get(i11);
                arrayList.add(bVar.m9236h(j11, i10));
                j11 += bVar.f7140c;
            }
            return new d(this.f7138a, this.f7139b, this.f7136w, this.f7140c, i10, j10, this.f7143f, this.f7144r, this.f7145s, this.f7146t, this.f7147u, this.f7148v, arrayList);
        }
    }

    /* renamed from: b8.g$e */
    /* loaded from: classes.dex */
    public static class e implements Comparable<Long> {

        /* renamed from: a */
        public final String f7138a;

        /* renamed from: b */
        public final d f7139b;

        /* renamed from: c */
        public final long f7140c;

        /* renamed from: d */
        public final int f7141d;

        /* renamed from: e */
        public final long f7142e;

        /* renamed from: f */
        public final C12318m f7143f;

        /* renamed from: r */
        public final String f7144r;

        /* renamed from: s */
        public final String f7145s;

        /* renamed from: t */
        public final long f7146t;

        /* renamed from: u */
        public final long f7147u;

        /* renamed from: v */
        public final boolean f7148v;

        private e(String str, d dVar, long j10, int i10, long j11, C12318m c12318m, String str2, String str3, long j12, long j13, boolean z10) {
            this.f7138a = str;
            this.f7139b = dVar;
            this.f7140c = j10;
            this.f7141d = i10;
            this.f7142e = j11;
            this.f7143f = c12318m;
            this.f7144r = str2;
            this.f7145s = str3;
            this.f7146t = j12;
            this.f7147u = j13;
            this.f7148v = z10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f7142e > l10.longValue()) {
                return 1;
            }
            return this.f7142e < l10.longValue() ? -1 : 0;
        }
    }

    /* renamed from: b8.g$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final long f7149a;

        /* renamed from: b */
        public final boolean f7150b;

        /* renamed from: c */
        public final long f7151c;

        /* renamed from: d */
        public final long f7152d;

        /* renamed from: e */
        public final boolean f7153e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f7149a = j10;
            this.f7150b = z10;
            this.f7151c = j11;
            this.f7152d = j12;
            this.f7153e = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1677g(int r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, p436x6.C12318m r31, java.util.List<p026b8.C1677g.d> r32, java.util.List<p026b8.C1677g.b> r33, p026b8.C1677g.f r34, java.util.Map<android.net.Uri, p026b8.C1677g.c> r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.f7112d = r3
            r3 = r17
            r0.f7116h = r3
            r3 = r16
            r0.f7115g = r3
            r3 = r19
            r0.f7117i = r3
            r3 = r20
            r0.f7118j = r3
            r3 = r21
            r0.f7119k = r3
            r3 = r23
            r0.f7120l = r3
            r3 = r24
            r0.f7121m = r3
            r3 = r26
            r0.f7122n = r3
            r3 = r29
            r0.f7123o = r3
            r3 = r30
            r0.f7124p = r3
            r3 = r31
            r0.f7125q = r3
            com.google.common.collect.w r3 = com.google.common.collect.AbstractC5907w.m15079r(r32)
            r0.f7126r = r3
            com.google.common.collect.w r3 = com.google.common.collect.AbstractC5907w.m15079r(r33)
            r0.f7127s = r3
            com.google.common.collect.y r3 = com.google.common.collect.AbstractC5911y.m15110c(r35)
            r0.f7128t = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = com.google.common.collect.C5867e0.m14838d(r33)
            b8.g$b r3 = (p026b8.C1677g.b) r3
        L58:
            long r6 = r3.f7142e
            long r8 = r3.f7140c
            long r6 = r6 + r8
            r0.f7129u = r6
            goto L6f
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = com.google.common.collect.C5867e0.m14838d(r32)
            b8.g$d r3 = (p026b8.C1677g.d) r3
            goto L58
        L6d:
            r0.f7129u = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.f7129u
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.f7113e = r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.f7114f = r1
            r1 = r34
            r0.f7130v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p026b8.C1677g.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, x6.m, java.util.List, java.util.List, b8.g$f, java.util.Map):void");
    }

    @Override // p377u7.InterfaceC11444a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1677g mo9230a(List<C11446c> list) {
        return this;
    }

    /* renamed from: c */
    public C1677g m9232c(long j10, int i10) {
        return new C1677g(this.f7112d, this.f7175a, this.f7176b, this.f7113e, this.f7115g, j10, true, i10, this.f7119k, this.f7120l, this.f7121m, this.f7122n, this.f7177c, this.f7123o, this.f7124p, this.f7125q, this.f7126r, this.f7127s, this.f7130v, this.f7128t);
    }

    /* renamed from: d */
    public C1677g m9233d() {
        return this.f7123o ? this : new C1677g(this.f7112d, this.f7175a, this.f7176b, this.f7113e, this.f7115g, this.f7116h, this.f7117i, this.f7118j, this.f7119k, this.f7120l, this.f7121m, this.f7122n, this.f7177c, true, this.f7124p, this.f7125q, this.f7126r, this.f7127s, this.f7130v, this.f7128t);
    }

    /* renamed from: e */
    public long m9234e() {
        return this.f7116h + this.f7129u;
    }

    /* renamed from: f */
    public boolean m9235f(C1677g c1677g) {
        if (c1677g == null) {
            return true;
        }
        long j10 = this.f7119k;
        long j11 = c1677g.f7119k;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f7126r.size() - c1677g.f7126r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f7127s.size();
        int size3 = c1677g.f7127s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f7123o && !c1677g.f7123o;
        }
        return true;
    }
}
