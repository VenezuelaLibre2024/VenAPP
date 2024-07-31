package z7;

import t8.r0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f32399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32400b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32401c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32402d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32403e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f32399a = str;
        this.f32400b = str2;
        this.f32401c = str3;
        this.f32402d = str4;
        this.f32403e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return r0.c(this.f32399a, hVar.f32399a) && r0.c(this.f32400b, hVar.f32400b) && r0.c(this.f32401c, hVar.f32401c) && r0.c(this.f32402d, hVar.f32402d) && r0.c(this.f32403e, hVar.f32403e);
    }

    public int hashCode() {
        String str = this.f32399a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f32400b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32401c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f32402d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f32403e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
