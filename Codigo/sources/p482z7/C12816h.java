package p482z7;

import p363t8.C11172r0;

/* renamed from: z7.h */
/* loaded from: classes.dex */
public final class C12816h {

    /* renamed from: a */
    public final String f34950a;

    /* renamed from: b */
    public final String f34951b;

    /* renamed from: c */
    public final String f34952c;

    /* renamed from: d */
    public final String f34953d;

    /* renamed from: e */
    public final String f34954e;

    public C12816h(String str, String str2, String str3, String str4, String str5) {
        this.f34950a = str;
        this.f34951b = str2;
        this.f34952c = str3;
        this.f34953d = str4;
        this.f34954e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12816h)) {
            return false;
        }
        C12816h c12816h = (C12816h) obj;
        return C11172r0.m34914c(this.f34950a, c12816h.f34950a) && C11172r0.m34914c(this.f34951b, c12816h.f34951b) && C11172r0.m34914c(this.f34952c, c12816h.f34952c) && C11172r0.m34914c(this.f34953d, c12816h.f34953d) && C11172r0.m34914c(this.f34954e, c12816h.f34954e);
    }

    public int hashCode() {
        String str = this.f34950a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34951b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f34952c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f34953d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f34954e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
