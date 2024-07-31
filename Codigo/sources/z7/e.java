package z7;

import t8.r0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f32386a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32387b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32388c;

    public e(String str, String str2, String str3) {
        this.f32386a = str;
        this.f32387b = str2;
        this.f32388c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return r0.c(this.f32386a, eVar.f32386a) && r0.c(this.f32387b, eVar.f32387b) && r0.c(this.f32388c, eVar.f32388c);
    }

    public int hashCode() {
        int hashCode = this.f32386a.hashCode() * 31;
        String str = this.f32387b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f32388c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
