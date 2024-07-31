package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import qa.c;

/* loaded from: classes.dex */
public class u extends c0 {
    public static final Parcelable.Creator<u> CREATOR = new t0();

    /* renamed from: a */
    private final y f23870a;

    /* renamed from: b */
    private final a0 f23871b;

    /* renamed from: c */
    private final byte[] f23872c;

    /* renamed from: d */
    private final List f23873d;

    /* renamed from: e */
    private final Double f23874e;

    /* renamed from: f */
    private final List f23875f;

    /* renamed from: r */
    private final k f23876r;

    /* renamed from: s */
    private final Integer f23877s;

    /* renamed from: t */
    private final e0 f23878t;

    /* renamed from: u */
    private final c f23879u;

    /* renamed from: v */
    private final d f23880v;

    public u(y yVar, a0 a0Var, byte[] bArr, List list, Double d10, List list2, k kVar, Integer num, e0 e0Var, String str, d dVar) {
        this.f23870a = (y) com.google.android.gms.common.internal.s.j(yVar);
        this.f23871b = (a0) com.google.android.gms.common.internal.s.j(a0Var);
        this.f23872c = (byte[]) com.google.android.gms.common.internal.s.j(bArr);
        this.f23873d = (List) com.google.android.gms.common.internal.s.j(list);
        this.f23874e = d10;
        this.f23875f = list2;
        this.f23876r = kVar;
        this.f23877s = num;
        this.f23878t = e0Var;
        if (str != null) {
            try {
                this.f23879u = c.b(str);
            } catch (c.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f23879u = null;
        }
        this.f23880v = dVar;
    }

    public Integer A1() {
        return this.f23877s;
    }

    public y B1() {
        return this.f23870a;
    }

    public Double C1() {
        return this.f23874e;
    }

    public e0 D1() {
        return this.f23878t;
    }

    public a0 E1() {
        return this.f23871b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return com.google.android.gms.common.internal.q.b(this.f23870a, uVar.f23870a) && com.google.android.gms.common.internal.q.b(this.f23871b, uVar.f23871b) && Arrays.equals(this.f23872c, uVar.f23872c) && com.google.android.gms.common.internal.q.b(this.f23874e, uVar.f23874e) && this.f23873d.containsAll(uVar.f23873d) && uVar.f23873d.containsAll(this.f23873d) && (((list = this.f23875f) == null && uVar.f23875f == null) || (list != null && (list2 = uVar.f23875f) != null && list.containsAll(list2) && uVar.f23875f.containsAll(this.f23875f))) && com.google.android.gms.common.internal.q.b(this.f23876r, uVar.f23876r) && com.google.android.gms.common.internal.q.b(this.f23877s, uVar.f23877s) && com.google.android.gms.common.internal.q.b(this.f23878t, uVar.f23878t) && com.google.android.gms.common.internal.q.b(this.f23879u, uVar.f23879u) && com.google.android.gms.common.internal.q.b(this.f23880v, uVar.f23880v);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23870a, this.f23871b, Integer.valueOf(Arrays.hashCode(this.f23872c)), this.f23873d, this.f23874e, this.f23875f, this.f23876r, this.f23877s, this.f23878t, this.f23879u, this.f23880v);
    }

    public String u1() {
        c cVar = this.f23879u;
        if (cVar == null) {
            return null;
        }
        return cVar.toString();
    }

    public d v1() {
        return this.f23880v;
    }

    public k w1() {
        return this.f23876r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 2, B1(), i10, false);
        ea.c.E(parcel, 3, E1(), i10, false);
        ea.c.l(parcel, 4, x1(), false);
        ea.c.K(parcel, 5, z1(), false);
        ea.c.p(parcel, 6, C1(), false);
        ea.c.K(parcel, 7, y1(), false);
        ea.c.E(parcel, 8, w1(), i10, false);
        ea.c.x(parcel, 9, A1(), false);
        ea.c.E(parcel, 10, D1(), i10, false);
        ea.c.G(parcel, 11, u1(), false);
        ea.c.E(parcel, 12, v1(), i10, false);
        ea.c.b(parcel, a10);
    }

    public byte[] x1() {
        return this.f23872c;
    }

    public List<v> y1() {
        return this.f23875f;
    }

    public List<w> z1() {
        return this.f23873d;
    }
}
