package p442xc;

import p442xc.AbstractC12428g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xc.e0 */
/* loaded from: classes.dex */
public final class C12424e0 extends AbstractC12428g0.c {

    /* renamed from: a */
    private final String f33513a;

    /* renamed from: b */
    private final String f33514b;

    /* renamed from: c */
    private final boolean f33515c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12424e0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f33513a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f33514b = str2;
        this.f33515c = z10;
    }

    @Override // p442xc.AbstractC12428g0.c
    /* renamed from: b */
    public boolean mo40174b() {
        return this.f33515c;
    }

    @Override // p442xc.AbstractC12428g0.c
    /* renamed from: c */
    public String mo40175c() {
        return this.f33514b;
    }

    @Override // p442xc.AbstractC12428g0.c
    /* renamed from: d */
    public String mo40176d() {
        return this.f33513a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12428g0.c)) {
            return false;
        }
        AbstractC12428g0.c cVar = (AbstractC12428g0.c) obj;
        return this.f33513a.equals(cVar.mo40176d()) && this.f33514b.equals(cVar.mo40175c()) && this.f33515c == cVar.mo40174b();
    }

    public int hashCode() {
        return ((((this.f33513a.hashCode() ^ 1000003) * 1000003) ^ this.f33514b.hashCode()) * 1000003) ^ (this.f33515c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f33513a + ", osCodeName=" + this.f33514b + ", isRooted=" + this.f33515c + "}";
    }
}
