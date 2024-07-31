package w6;

import t6.u1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f29689a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f29690b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f29691c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29692d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29693e;

    public i(String str, u1 u1Var, u1 u1Var2, int i10, int i11) {
        t8.a.a(i10 == 0 || i11 == 0);
        this.f29689a = t8.a.d(str);
        this.f29690b = (u1) t8.a.e(u1Var);
        this.f29691c = (u1) t8.a.e(u1Var2);
        this.f29692d = i10;
        this.f29693e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f29692d == iVar.f29692d && this.f29693e == iVar.f29693e && this.f29689a.equals(iVar.f29689a) && this.f29690b.equals(iVar.f29690b) && this.f29691c.equals(iVar.f29691c);
    }

    public int hashCode() {
        return ((((((((527 + this.f29692d) * 31) + this.f29693e) * 31) + this.f29689a.hashCode()) * 31) + this.f29690b.hashCode()) * 31) + this.f29691c.hashCode();
    }
}
