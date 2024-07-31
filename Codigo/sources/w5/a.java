package w5;

import com.facebook.ads.AdError;
import dk.w;
import dk.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;
import x5.g;
import xk.q;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a */
    private final d f29625a;

    /* renamed from: b */
    private final d f29626b;

    /* renamed from: c */
    private final d f29627c;

    /* renamed from: d */
    private final c f29628d;

    /* renamed from: e */
    private final c f29629e;

    /* renamed from: f */
    private final boolean f29630f;

    /* renamed from: g */
    private final List<f> f29631g;

    /* renamed from: w5.a$a */
    /* loaded from: classes.dex */
    static final class C0477a extends o implements l<f, CharSequence> {

        /* renamed from: a */
        public static final C0477a f29632a = new C0477a();

        C0477a() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a */
        public final CharSequence invoke(f it) {
            n.e(it, "it");
            return it.a();
        }
    }

    public a(Map<?, ?> map) {
        n.e(map, "map");
        x5.c cVar = x5.c.f30409a;
        this.f29625a = cVar.h(map, s5.a.Video);
        this.f29626b = cVar.h(map, s5.a.Image);
        this.f29627c = cVar.h(map, s5.a.Audio);
        Object obj = map.get("createDate");
        n.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        this.f29628d = cVar.d((Map) obj);
        Object obj2 = map.get("updateDate");
        n.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        this.f29629e = cVar.d((Map) obj2);
        Object obj3 = map.get("containsPathModified");
        n.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        this.f29630f = ((Boolean) obj3).booleanValue();
        Object obj4 = map.get("orders");
        n.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<*>");
        this.f29631g = cVar.g((List) obj4);
    }

    private final String e(ArrayList<String> arrayList, c cVar, String str) {
        if (cVar.a()) {
            return "";
        }
        long c10 = cVar.c();
        long b10 = cVar.b();
        String str2 = "AND ( " + str + " >= ? AND " + str + " <= ? )";
        long j10 = AdError.NETWORK_ERROR_CODE;
        arrayList.add(String.valueOf(c10 / j10));
        arrayList.add(String.valueOf(b10 / j10));
        return str2;
    }

    private final String f(int i10, a aVar, ArrayList<String> arrayList) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        g gVar = g.f30426a;
        boolean c10 = gVar.c(i10);
        boolean d10 = gVar.d(i10);
        boolean b10 = gVar.b(i10);
        String str3 = "";
        if (c10) {
            d dVar = aVar.f29626b;
            str = "media_type = ? ";
            arrayList.add("1");
            if (!dVar.d().a()) {
                String i11 = dVar.i();
                str = str + " AND " + i11;
                w.v(arrayList, dVar.h());
            }
        } else {
            str = "";
        }
        if (d10) {
            d dVar2 = aVar.f29625a;
            String b11 = dVar2.b();
            String[] a10 = dVar2.a();
            str2 = "media_type = ? AND " + b11;
            arrayList.add("3");
            w.v(arrayList, a10);
        } else {
            str2 = "";
        }
        if (b10) {
            d dVar3 = aVar.f29627c;
            String b12 = dVar3.b();
            String[] a11 = dVar3.a();
            str3 = "media_type = ? AND " + b12;
            arrayList.add("2");
            w.v(arrayList, a11);
        }
        if (c10) {
            sb2.append("( " + str + " )");
        }
        if (d10) {
            if (sb2.length() > 0) {
                sb2.append("OR ");
            }
            sb2.append("( " + str2 + " )");
        }
        if (b10) {
            if (sb2.length() > 0) {
                sb2.append("OR ");
            }
            sb2.append("( " + str3 + " )");
        }
        return "( " + ((Object) sb2) + " )";
    }

    private final String g(ArrayList<String> arrayList, a aVar) {
        return e(arrayList, aVar.f29628d, "date_added") + ' ' + e(arrayList, aVar.f29629e, "date_modified");
    }

    private final g h() {
        return g.f30426a;
    }

    private final String i(Integer num, a aVar) {
        String str = "";
        if (aVar.f29626b.d().a() || num == null || !h().c(num.intValue())) {
            return "";
        }
        if (h().d(num.intValue())) {
            str = "OR ( media_type = 3 )";
        }
        if (h().b(num.intValue())) {
            str = str + " OR ( media_type = 2 )";
        }
        return "AND (" + ("( media_type = 1 AND width > 0 AND height > 0 )") + ' ' + str + ')';
    }

    @Override // w5.e
    public boolean a() {
        return this.f29630f;
    }

    @Override // w5.e
    public String b(int i10, ArrayList<String> args, boolean z10) {
        CharSequence K0;
        StringBuilder sb2;
        String str;
        n.e(args, "args");
        String str2 = f(i10, this, args) + ' ' + g(args, this) + ' ' + i(Integer.valueOf(i10), this);
        K0 = q.K0(str2);
        if (K0.toString().length() == 0) {
            return "";
        }
        if (z10) {
            sb2 = new StringBuilder();
            sb2.append(" AND ( ");
            sb2.append(str2);
            str = " )";
        } else {
            sb2 = new StringBuilder();
            sb2.append(" ( ");
            sb2.append(str2);
            str = " ) ";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // w5.e
    public String d() {
        String M;
        if (this.f29631g.isEmpty()) {
            return null;
        }
        M = z.M(this.f29631g, ",", null, null, 0, null, C0477a.f29632a, 30, null);
        return M;
    }
}
