package xc;

import xc.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e0 extends g0.c {

    /* renamed from: a */
    private final String f30993a;

    /* renamed from: b */
    private final String f30994b;

    /* renamed from: c */
    private final boolean f30995c;

    public e0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f30993a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f30994b = str2;
        this.f30995c = z10;
    }

    @Override // xc.g0.c
    public boolean b() {
        return this.f30995c;
    }

    @Override // xc.g0.c
    public String c() {
        return this.f30994b;
    }

    @Override // xc.g0.c
    public String d() {
        return this.f30993a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.c)) {
            return false;
        }
        g0.c cVar = (g0.c) obj;
        return this.f30993a.equals(cVar.d()) && this.f30994b.equals(cVar.c()) && this.f30995c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f30993a.hashCode() ^ 1000003) * 1000003) ^ this.f30994b.hashCode()) * 1000003) ^ (this.f30995c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f30993a + ", osCodeName=" + this.f30994b + ", isRooted=" + this.f30995c + "}";
    }
}
