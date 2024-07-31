package p482z7;

import p363t8.C11172r0;

/* renamed from: z7.e */
/* loaded from: classes.dex */
public final class C12813e {

    /* renamed from: a */
    public final String f34937a;

    /* renamed from: b */
    public final String f34938b;

    /* renamed from: c */
    public final String f34939c;

    public C12813e(String str, String str2, String str3) {
        this.f34937a = str;
        this.f34938b = str2;
        this.f34939c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12813e.class != obj.getClass()) {
            return false;
        }
        C12813e c12813e = (C12813e) obj;
        return C11172r0.m34914c(this.f34937a, c12813e.f34937a) && C11172r0.m34914c(this.f34938b, c12813e.f34938b) && C11172r0.m34914c(this.f34939c, c12813e.f34939c);
    }

    public int hashCode() {
        int hashCode = this.f34937a.hashCode() * 31;
        String str = this.f34938b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34939c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
