package p442xc;

import p442xc.AbstractC12428g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xc.d0 */
/* loaded from: classes.dex */
public final class C12422d0 extends AbstractC12428g0.b {

    /* renamed from: a */
    private final int f33500a;

    /* renamed from: b */
    private final String f33501b;

    /* renamed from: c */
    private final int f33502c;

    /* renamed from: d */
    private final long f33503d;

    /* renamed from: e */
    private final long f33504e;

    /* renamed from: f */
    private final boolean f33505f;

    /* renamed from: g */
    private final int f33506g;

    /* renamed from: h */
    private final String f33507h;

    /* renamed from: i */
    private final String f33508i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12422d0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f33500a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f33501b = str;
        this.f33502c = i11;
        this.f33503d = j10;
        this.f33504e = j11;
        this.f33505f = z10;
        this.f33506g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f33507h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f33508i = str3;
    }

    @Override // p442xc.AbstractC12428g0.b
    /* renamed from: a */
    public int mo40160a() {
        return this.f33500a;
    }

    @Override // p442xc.AbstractC12428g0.b
    /* renamed from: b */
    public int mo40161b() {
        return this.f33502c;
    }

    @Override // p442xc.AbstractC12428g0.b
    /* renamed from: d */
    public long mo40162d() {
        return this.f33504e;
    }

    @Override // p442xc.AbstractC12428g0.b
    /* renamed from: e */
    public boolean mo40163e() {
        return this.f33505f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12428g0.b)) {
            return false;
        }
        AbstractC12428g0.b bVar = (AbstractC12428g0.b) obj;
        return this.f33500a == bVar.mo40160a() && this.f33501b.equals(bVar.mo40165g()) && this.f33502c == bVar.mo40161b() && this.f33503d == bVar.mo40168j() && this.f33504e == bVar.mo40162d() && this.f33505f == bVar.mo40163e() && this.f33506g == bVar.mo40167i() && this.f33507h.equals(bVar.mo40164f()) && this.f33508i.equals(bVar.mo40166h());
    }

    @Override // p442xc.AbstractC12428g0.b
    /* renamed from: f */
    public String mo40164f() {
        return this.f33507h;
    }

    @Override // p442xc.AbstractC12428g0.b
    /* renamed from: g */
    public String mo40165g() {
        return this.f33501b;
    }

    @Override // p442xc.AbstractC12428g0.b
    /* renamed from: h */
    public String mo40166h() {
        return this.f33508i;
    }

    public int hashCode() {
        int hashCode = (((((this.f33500a ^ 1000003) * 1000003) ^ this.f33501b.hashCode()) * 1000003) ^ this.f33502c) * 1000003;
        long j10 = this.f33503d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f33504e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f33505f ? 1231 : 1237)) * 1000003) ^ this.f33506g) * 1000003) ^ this.f33507h.hashCode()) * 1000003) ^ this.f33508i.hashCode();
    }

    @Override // p442xc.AbstractC12428g0.b
    /* renamed from: i */
    public int mo40167i() {
        return this.f33506g;
    }

    @Override // p442xc.AbstractC12428g0.b
    /* renamed from: j */
    public long mo40168j() {
        return this.f33503d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f33500a + ", model=" + this.f33501b + ", availableProcessors=" + this.f33502c + ", totalRam=" + this.f33503d + ", diskSpace=" + this.f33504e + ", isEmulator=" + this.f33505f + ", state=" + this.f33506g + ", manufacturer=" + this.f33507h + ", modelClass=" + this.f33508i + "}";
    }
}
