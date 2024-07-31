package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class x extends c0 {
    public static final Parcelable.Creator<x> CREATOR = new x0();

    /* renamed from: a */
    private final byte[] f23887a;

    /* renamed from: b */
    private final Double f23888b;

    /* renamed from: c */
    private final String f23889c;

    /* renamed from: d */
    private final List f23890d;

    /* renamed from: e */
    private final Integer f23891e;

    /* renamed from: f */
    private final e0 f23892f;

    /* renamed from: r */
    private final h1 f23893r;

    /* renamed from: s */
    private final d f23894s;

    /* renamed from: t */
    private final Long f23895t;

    public x(byte[] bArr, Double d10, String str, List list, Integer num, e0 e0Var, String str2, d dVar, Long l10) {
        this.f23887a = (byte[]) com.google.android.gms.common.internal.s.j(bArr);
        this.f23888b = d10;
        this.f23889c = (String) com.google.android.gms.common.internal.s.j(str);
        this.f23890d = list;
        this.f23891e = num;
        this.f23892f = e0Var;
        this.f23895t = l10;
        if (str2 != null) {
            try {
                this.f23893r = h1.b(str2);
            } catch (g1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f23893r = null;
        }
        this.f23894s = dVar;
    }

    public e0 A1() {
        return this.f23892f;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Arrays.equals(this.f23887a, xVar.f23887a) && com.google.android.gms.common.internal.q.b(this.f23888b, xVar.f23888b) && com.google.android.gms.common.internal.q.b(this.f23889c, xVar.f23889c) && (((list = this.f23890d) == null && xVar.f23890d == null) || (list != null && (list2 = xVar.f23890d) != null && list.containsAll(list2) && xVar.f23890d.containsAll(this.f23890d))) && com.google.android.gms.common.internal.q.b(this.f23891e, xVar.f23891e) && com.google.android.gms.common.internal.q.b(this.f23892f, xVar.f23892f) && com.google.android.gms.common.internal.q.b(this.f23893r, xVar.f23893r) && com.google.android.gms.common.internal.q.b(this.f23894s, xVar.f23894s) && com.google.android.gms.common.internal.q.b(this.f23895t, xVar.f23895t);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(Arrays.hashCode(this.f23887a)), this.f23888b, this.f23889c, this.f23890d, this.f23891e, this.f23892f, this.f23893r, this.f23894s, this.f23895t);
    }

    public List<v> u1() {
        return this.f23890d;
    }

    public d v1() {
        return this.f23894s;
    }

    public byte[] w1() {
        return this.f23887a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.l(parcel, 2, w1(), false);
        ea.c.p(parcel, 3, z1(), false);
        ea.c.G(parcel, 4, y1(), false);
        ea.c.K(parcel, 5, u1(), false);
        ea.c.x(parcel, 6, x1(), false);
        ea.c.E(parcel, 7, A1(), i10, false);
        h1 h1Var = this.f23893r;
        ea.c.G(parcel, 8, h1Var == null ? null : h1Var.toString(), false);
        ea.c.E(parcel, 9, v1(), i10, false);
        ea.c.B(parcel, 10, this.f23895t, false);
        ea.c.b(parcel, a10);
    }

    public Integer x1() {
        return this.f23891e;
    }

    public String y1() {
        return this.f23889c;
    }

    public Double z1() {
        return this.f23888b;
    }
}
