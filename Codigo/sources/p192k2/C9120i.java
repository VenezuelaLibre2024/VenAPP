package p192k2;

import kotlin.jvm.internal.C9322n;

/* renamed from: k2.i */
/* loaded from: classes.dex */
public final class C9120i {

    /* renamed from: a */
    public final String f21976a;

    /* renamed from: b */
    private final int f21977b;

    /* renamed from: c */
    public final int f21978c;

    public C9120i(String workSpecId, int i10, int i11) {
        C9322n.m27781e(workSpecId, "workSpecId");
        this.f21976a = workSpecId;
        this.f21977b = i10;
        this.f21978c = i11;
    }

    /* renamed from: a */
    public final int m26862a() {
        return this.f21977b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9120i)) {
            return false;
        }
        C9120i c9120i = (C9120i) obj;
        return C9322n.m27777a(this.f21976a, c9120i.f21976a) && this.f21977b == c9120i.f21977b && this.f21978c == c9120i.f21978c;
    }

    public int hashCode() {
        return (((this.f21976a.hashCode() * 31) + Integer.hashCode(this.f21977b)) * 31) + Integer.hashCode(this.f21978c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f21976a + ", generation=" + this.f21977b + ", systemId=" + this.f21978c + ')';
    }
}
