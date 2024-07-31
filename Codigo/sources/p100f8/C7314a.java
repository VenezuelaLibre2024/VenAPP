package p100f8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p119g7.C7480p;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11168p0;
import p363t8.C11172r0;
import p377u7.C11446c;
import p377u7.InterfaceC11444a;

/* renamed from: f8.a */
/* loaded from: classes.dex */
public class C7314a implements InterfaceC11444a<C7314a> {

    /* renamed from: a */
    public final int f16420a;

    /* renamed from: b */
    public final int f16421b;

    /* renamed from: c */
    public final int f16422c;

    /* renamed from: d */
    public final boolean f16423d;

    /* renamed from: e */
    public final a f16424e;

    /* renamed from: f */
    public final b[] f16425f;

    /* renamed from: g */
    public final long f16426g;

    /* renamed from: h */
    public final long f16427h;

    /* renamed from: f8.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final UUID f16428a;

        /* renamed from: b */
        public final byte[] f16429b;

        /* renamed from: c */
        public final C7480p[] f16430c;

        public a(UUID uuid, byte[] bArr, C7480p[] c7480pArr) {
            this.f16428a = uuid;
            this.f16429b = bArr;
            this.f16430c = c7480pArr;
        }
    }

    /* renamed from: f8.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int f16431a;

        /* renamed from: b */
        public final String f16432b;

        /* renamed from: c */
        public final long f16433c;

        /* renamed from: d */
        public final String f16434d;

        /* renamed from: e */
        public final int f16435e;

        /* renamed from: f */
        public final int f16436f;

        /* renamed from: g */
        public final int f16437g;

        /* renamed from: h */
        public final int f16438h;

        /* renamed from: i */
        public final String f16439i;

        /* renamed from: j */
        public final C11108u1[] f16440j;

        /* renamed from: k */
        public final int f16441k;

        /* renamed from: l */
        private final String f16442l;

        /* renamed from: m */
        private final String f16443m;

        /* renamed from: n */
        private final List<Long> f16444n;

        /* renamed from: o */
        private final long[] f16445o;

        /* renamed from: p */
        private final long f16446p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, C11108u1[] c11108u1Arr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, c11108u1Arr, list, C11172r0.m34887P0(list, 1000000L, j10), C11172r0.m34885O0(j11, 1000000L, j10));
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, C11108u1[] c11108u1Arr, List<Long> list, long[] jArr, long j11) {
            this.f16442l = str;
            this.f16443m = str2;
            this.f16431a = i10;
            this.f16432b = str3;
            this.f16433c = j10;
            this.f16434d = str4;
            this.f16435e = i11;
            this.f16436f = i12;
            this.f16437g = i13;
            this.f16438h = i14;
            this.f16439i = str5;
            this.f16440j = c11108u1Arr;
            this.f16444n = list;
            this.f16445o = jArr;
            this.f16446p = j11;
            this.f16441k = list.size();
        }

        /* renamed from: a */
        public Uri m21917a(int i10, int i11) {
            C11137a.m34605g(this.f16440j != null);
            C11137a.m34605g(this.f16444n != null);
            C11137a.m34605g(i11 < this.f16444n.size());
            String num = Integer.toString(this.f16440j[i10].f28793s);
            String l10 = this.f16444n.get(i11).toString();
            return C11168p0.m34839e(this.f16442l, this.f16443m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        /* renamed from: b */
        public b m21918b(C11108u1[] c11108u1Arr) {
            return new b(this.f16442l, this.f16443m, this.f16431a, this.f16432b, this.f16433c, this.f16434d, this.f16435e, this.f16436f, this.f16437g, this.f16438h, this.f16439i, c11108u1Arr, this.f16444n, this.f16445o, this.f16446p);
        }

        /* renamed from: c */
        public long m21919c(int i10) {
            if (i10 == this.f16441k - 1) {
                return this.f16446p;
            }
            long[] jArr = this.f16445o;
            return jArr[i10 + 1] - jArr[i10];
        }

        /* renamed from: d */
        public int m21920d(long j10) {
            return C11172r0.m34926i(this.f16445o, j10, true, true);
        }

        /* renamed from: e */
        public long m21921e(int i10) {
            return this.f16445o[i10];
        }
    }

    private C7314a(int i10, int i11, long j10, long j11, int i12, boolean z10, a aVar, b[] bVarArr) {
        this.f16420a = i10;
        this.f16421b = i11;
        this.f16426g = j10;
        this.f16427h = j11;
        this.f16422c = i12;
        this.f16423d = z10;
        this.f16424e = aVar;
        this.f16425f = bVarArr;
    }

    public C7314a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, a aVar, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : C11172r0.m34885O0(j11, 1000000L, j10), j12 != 0 ? C11172r0.m34885O0(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, aVar, bVarArr);
    }

    @Override // p377u7.InterfaceC11444a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C7314a mo9230a(List<C11446c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C11446c c11446c = (C11446c) arrayList.get(i10);
            b bVar2 = this.f16425f[c11446c.f29634b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.m21918b((C11108u1[]) arrayList3.toArray(new C11108u1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f16440j[c11446c.f29635c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.m21918b((C11108u1[]) arrayList3.toArray(new C11108u1[0])));
        }
        return new C7314a(this.f16420a, this.f16421b, this.f16426g, this.f16427h, this.f16422c, this.f16423d, this.f16424e, (b[]) arrayList2.toArray(new b[0]));
    }
}
