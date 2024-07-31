package b8;

import android.net.Uri;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import x6.m;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: d, reason: collision with root package name */
    public final int f6216d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6217e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6218f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6219g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6220h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6221i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6222j;

    /* renamed from: k, reason: collision with root package name */
    public final long f6223k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6224l;

    /* renamed from: m, reason: collision with root package name */
    public final long f6225m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6226n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6227o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6228p;

    /* renamed from: q, reason: collision with root package name */
    public final m f6229q;

    /* renamed from: r, reason: collision with root package name */
    public final List<d> f6230r;

    /* renamed from: s, reason: collision with root package name */
    public final List<b> f6231s;

    /* renamed from: t, reason: collision with root package name */
    public final Map<Uri, c> f6232t;

    /* renamed from: u, reason: collision with root package name */
    public final long f6233u;

    /* renamed from: v, reason: collision with root package name */
    public final f f6234v;

    /* loaded from: classes.dex */
    public static final class b extends e {

        /* renamed from: w, reason: collision with root package name */
        public final boolean f6235w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f6236x;

        public b(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, mVar, str2, str3, j12, j13, z10);
            this.f6235w = z11;
            this.f6236x = z12;
        }

        public b h(long j10, int i10) {
            return new b(this.f6242a, this.f6243b, this.f6244c, i10, j10, this.f6247f, this.f6248r, this.f6249s, this.f6250t, this.f6251u, this.f6252v, this.f6235w, this.f6236x);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f6237a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6238b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6239c;

        public c(Uri uri, long j10, int i10) {
            this.f6237a = uri;
            this.f6238b = j10;
            this.f6239c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e {

        /* renamed from: w, reason: collision with root package name */
        public final String f6240w;

        /* renamed from: x, reason: collision with root package name */
        public final List<b> f6241x;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, w.v());
        }

        public d(String str, d dVar, String str2, long j10, int i10, long j11, m mVar, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, mVar, str3, str4, j12, j13, z10);
            this.f6240w = str2;
            this.f6241x = w.r(list);
        }

        public d h(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f6241x.size(); i11++) {
                b bVar = this.f6241x.get(i11);
                arrayList.add(bVar.h(j11, i10));
                j11 += bVar.f6244c;
            }
            return new d(this.f6242a, this.f6243b, this.f6240w, this.f6244c, i10, j10, this.f6247f, this.f6248r, this.f6249s, this.f6250t, this.f6251u, this.f6252v, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Comparable<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final String f6242a;

        /* renamed from: b, reason: collision with root package name */
        public final d f6243b;

        /* renamed from: c, reason: collision with root package name */
        public final long f6244c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6245d;

        /* renamed from: e, reason: collision with root package name */
        public final long f6246e;

        /* renamed from: f, reason: collision with root package name */
        public final m f6247f;

        /* renamed from: r, reason: collision with root package name */
        public final String f6248r;

        /* renamed from: s, reason: collision with root package name */
        public final String f6249s;

        /* renamed from: t, reason: collision with root package name */
        public final long f6250t;

        /* renamed from: u, reason: collision with root package name */
        public final long f6251u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f6252v;

        private e(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f6242a = str;
            this.f6243b = dVar;
            this.f6244c = j10;
            this.f6245d = i10;
            this.f6246e = j11;
            this.f6247f = mVar;
            this.f6248r = str2;
            this.f6249s = str3;
            this.f6250t = j12;
            this.f6251u = j13;
            this.f6252v = z10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f6246e > l10.longValue()) {
                return 1;
            }
            return this.f6246e < l10.longValue() ? -1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f6253a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6254b;

        /* renamed from: c, reason: collision with root package name */
        public final long f6255c;

        /* renamed from: d, reason: collision with root package name */
        public final long f6256d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f6257e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f6253a = j10;
            this.f6254b = z10;
            this.f6255c = j11;
            this.f6256d = j12;
            this.f6257e = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(int r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, x6.m r31, java.util.List<b8.g.d> r32, java.util.List<b8.g.b> r33, b8.g.f r34, java.util.Map<android.net.Uri, b8.g.c> r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.f6216d = r3
            r3 = r17
            r0.f6220h = r3
            r3 = r16
            r0.f6219g = r3
            r3 = r19
            r0.f6221i = r3
            r3 = r20
            r0.f6222j = r3
            r3 = r21
            r0.f6223k = r3
            r3 = r23
            r0.f6224l = r3
            r3 = r24
            r0.f6225m = r3
            r3 = r26
            r0.f6226n = r3
            r3 = r29
            r0.f6227o = r3
            r3 = r30
            r0.f6228p = r3
            r3 = r31
            r0.f6229q = r3
            com.google.common.collect.w r3 = com.google.common.collect.w.r(r32)
            r0.f6230r = r3
            com.google.common.collect.w r3 = com.google.common.collect.w.r(r33)
            r0.f6231s = r3
            com.google.common.collect.y r3 = com.google.common.collect.y.c(r35)
            r0.f6232t = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = com.google.common.collect.e0.d(r33)
            b8.g$b r3 = (b8.g.b) r3
        L58:
            long r6 = r3.f6246e
            long r8 = r3.f6244c
            long r6 = r6 + r8
            r0.f6233u = r6
            goto L6f
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = com.google.common.collect.e0.d(r32)
            b8.g$d r3 = (b8.g.d) r3
            goto L58
        L6d:
            r0.f6233u = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.f6233u
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.f6217e = r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.f6218f = r1
            r1 = r34
            r0.f6234v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.g.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, x6.m, java.util.List, java.util.List, b8.g$f, java.util.Map):void");
    }

    @Override // u7.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g a(List<u7.c> list) {
        return this;
    }

    public g c(long j10, int i10) {
        return new g(this.f6216d, this.f6279a, this.f6280b, this.f6217e, this.f6219g, j10, true, i10, this.f6223k, this.f6224l, this.f6225m, this.f6226n, this.f6281c, this.f6227o, this.f6228p, this.f6229q, this.f6230r, this.f6231s, this.f6234v, this.f6232t);
    }

    public g d() {
        return this.f6227o ? this : new g(this.f6216d, this.f6279a, this.f6280b, this.f6217e, this.f6219g, this.f6220h, this.f6221i, this.f6222j, this.f6223k, this.f6224l, this.f6225m, this.f6226n, this.f6281c, true, this.f6228p, this.f6229q, this.f6230r, this.f6231s, this.f6234v, this.f6232t);
    }

    public long e() {
        return this.f6220h + this.f6233u;
    }

    public boolean f(g gVar) {
        if (gVar == null) {
            return true;
        }
        long j10 = this.f6223k;
        long j11 = gVar.f6223k;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f6230r.size() - gVar.f6230r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f6231s.size();
        int size3 = gVar.f6231s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f6227o && !gVar.f6227o;
        }
        return true;
    }
}
