package f8;

import android.net.Uri;
import g7.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import t6.u1;
import t8.p0;
import t8.r0;
import u7.c;

/* loaded from: classes.dex */
public class a implements u7.a<a> {

    /* renamed from: a, reason: collision with root package name */
    public final int f14997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14999c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15000d;

    /* renamed from: e, reason: collision with root package name */
    public final C0240a f15001e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f15002f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15003g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15004h;

    /* renamed from: f8.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0240a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f15005a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f15006b;

        /* renamed from: c, reason: collision with root package name */
        public final p[] f15007c;

        public C0240a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f15005a = uuid;
            this.f15006b = bArr;
            this.f15007c = pVarArr;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f15008a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15009b;

        /* renamed from: c, reason: collision with root package name */
        public final long f15010c;

        /* renamed from: d, reason: collision with root package name */
        public final String f15011d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15012e;

        /* renamed from: f, reason: collision with root package name */
        public final int f15013f;

        /* renamed from: g, reason: collision with root package name */
        public final int f15014g;

        /* renamed from: h, reason: collision with root package name */
        public final int f15015h;

        /* renamed from: i, reason: collision with root package name */
        public final String f15016i;

        /* renamed from: j, reason: collision with root package name */
        public final u1[] f15017j;

        /* renamed from: k, reason: collision with root package name */
        public final int f15018k;

        /* renamed from: l, reason: collision with root package name */
        private final String f15019l;

        /* renamed from: m, reason: collision with root package name */
        private final String f15020m;

        /* renamed from: n, reason: collision with root package name */
        private final List<Long> f15021n;

        /* renamed from: o, reason: collision with root package name */
        private final long[] f15022o;

        /* renamed from: p, reason: collision with root package name */
        private final long f15023p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, u1[] u1VarArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, u1VarArr, list, r0.P0(list, 1000000L, j10), r0.O0(j11, 1000000L, j10));
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, u1[] u1VarArr, List<Long> list, long[] jArr, long j11) {
            this.f15019l = str;
            this.f15020m = str2;
            this.f15008a = i10;
            this.f15009b = str3;
            this.f15010c = j10;
            this.f15011d = str4;
            this.f15012e = i11;
            this.f15013f = i12;
            this.f15014g = i13;
            this.f15015h = i14;
            this.f15016i = str5;
            this.f15017j = u1VarArr;
            this.f15021n = list;
            this.f15022o = jArr;
            this.f15023p = j11;
            this.f15018k = list.size();
        }

        public Uri a(int i10, int i11) {
            t8.a.g(this.f15017j != null);
            t8.a.g(this.f15021n != null);
            t8.a.g(i11 < this.f15021n.size());
            String num = Integer.toString(this.f15017j[i10].f26513s);
            String l10 = this.f15021n.get(i11).toString();
            return p0.e(this.f15019l, this.f15020m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        public b b(u1[] u1VarArr) {
            return new b(this.f15019l, this.f15020m, this.f15008a, this.f15009b, this.f15010c, this.f15011d, this.f15012e, this.f15013f, this.f15014g, this.f15015h, this.f15016i, u1VarArr, this.f15021n, this.f15022o, this.f15023p);
        }

        public long c(int i10) {
            if (i10 == this.f15018k - 1) {
                return this.f15023p;
            }
            long[] jArr = this.f15022o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return r0.i(this.f15022o, j10, true, true);
        }

        public long e(int i10) {
            return this.f15022o[i10];
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0240a c0240a, b[] bVarArr) {
        this.f14997a = i10;
        this.f14998b = i11;
        this.f15003g = j10;
        this.f15004h = j11;
        this.f14999c = i12;
        this.f15000d = z10;
        this.f15001e = c0240a;
        this.f15002f = bVarArr;
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0240a c0240a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : r0.O0(j11, 1000000L, j10), j12 != 0 ? r0.O0(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0240a, bVarArr);
    }

    @Override // u7.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List<c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            b bVar2 = this.f15002f[cVar.f27331b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((u1[]) arrayList3.toArray(new u1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f15017j[cVar.f27332c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((u1[]) arrayList3.toArray(new u1[0])));
        }
        return new a(this.f14997a, this.f14998b, this.f15003g, this.f15004h, this.f14999c, this.f15000d, this.f15001e, (b[]) arrayList2.toArray(new b[0]));
    }
}
