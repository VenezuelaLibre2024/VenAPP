package xc;

import xc.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d0 extends g0.b {

    /* renamed from: a */
    private final int f30980a;

    /* renamed from: b */
    private final String f30981b;

    /* renamed from: c */
    private final int f30982c;

    /* renamed from: d */
    private final long f30983d;

    /* renamed from: e */
    private final long f30984e;

    /* renamed from: f */
    private final boolean f30985f;

    /* renamed from: g */
    private final int f30986g;

    /* renamed from: h */
    private final String f30987h;

    /* renamed from: i */
    private final String f30988i;

    public d0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f30980a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f30981b = str;
        this.f30982c = i11;
        this.f30983d = j10;
        this.f30984e = j11;
        this.f30985f = z10;
        this.f30986g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f30987h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f30988i = str3;
    }

    @Override // xc.g0.b
    public int a() {
        return this.f30980a;
    }

    @Override // xc.g0.b
    public int b() {
        return this.f30982c;
    }

    @Override // xc.g0.b
    public long d() {
        return this.f30984e;
    }

    @Override // xc.g0.b
    public boolean e() {
        return this.f30985f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.b)) {
            return false;
        }
        g0.b bVar = (g0.b) obj;
        return this.f30980a == bVar.a() && this.f30981b.equals(bVar.g()) && this.f30982c == bVar.b() && this.f30983d == bVar.j() && this.f30984e == bVar.d() && this.f30985f == bVar.e() && this.f30986g == bVar.i() && this.f30987h.equals(bVar.f()) && this.f30988i.equals(bVar.h());
    }

    @Override // xc.g0.b
    public String f() {
        return this.f30987h;
    }

    @Override // xc.g0.b
    public String g() {
        return this.f30981b;
    }

    @Override // xc.g0.b
    public String h() {
        return this.f30988i;
    }

    public int hashCode() {
        int hashCode = (((((this.f30980a ^ 1000003) * 1000003) ^ this.f30981b.hashCode()) * 1000003) ^ this.f30982c) * 1000003;
        long j10 = this.f30983d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f30984e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f30985f ? 1231 : 1237)) * 1000003) ^ this.f30986g) * 1000003) ^ this.f30987h.hashCode()) * 1000003) ^ this.f30988i.hashCode();
    }

    @Override // xc.g0.b
    public int i() {
        return this.f30986g;
    }

    @Override // xc.g0.b
    public long j() {
        return this.f30983d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f30980a + ", model=" + this.f30981b + ", availableProcessors=" + this.f30982c + ", totalRam=" + this.f30983d + ", diskSpace=" + this.f30984e + ", isEmulator=" + this.f30985f + ", state=" + this.f30986g + ", manufacturer=" + this.f30987h + ", modelClass=" + this.f30988i + "}";
    }
}
