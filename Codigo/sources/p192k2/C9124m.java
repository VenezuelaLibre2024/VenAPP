package p192k2;

import kotlin.jvm.internal.C9322n;

/* renamed from: k2.m */
/* loaded from: classes.dex */
public final class C9124m {

    /* renamed from: a */
    private final String f21986a;

    /* renamed from: b */
    private final int f21987b;

    public C9124m(String workSpecId, int i10) {
        C9322n.m27781e(workSpecId, "workSpecId");
        this.f21986a = workSpecId;
        this.f21987b = i10;
    }

    /* renamed from: a */
    public final int m26875a() {
        return this.f21987b;
    }

    /* renamed from: b */
    public final String m26876b() {
        return this.f21986a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9124m)) {
            return false;
        }
        C9124m c9124m = (C9124m) obj;
        return C9322n.m27777a(this.f21986a, c9124m.f21986a) && this.f21987b == c9124m.f21987b;
    }

    public int hashCode() {
        return (this.f21986a.hashCode() * 31) + Integer.hashCode(this.f21987b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f21986a + ", generation=" + this.f21987b + ')';
    }
}
