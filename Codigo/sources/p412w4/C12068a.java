package p412w4;

import kotlin.jvm.internal.C9322n;

/* renamed from: w4.a */
/* loaded from: classes.dex */
public final class C12068a {

    /* renamed from: a */
    private final String f32085a;

    /* renamed from: b */
    private final boolean f32086b;

    public C12068a(String name, boolean z10) {
        C9322n.m27781e(name, "name");
        this.f32085a = name;
        this.f32086b = z10;
    }

    /* renamed from: a */
    public final String m38745a() {
        return this.f32085a;
    }

    /* renamed from: b */
    public final boolean m38746b() {
        return this.f32086b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12068a)) {
            return false;
        }
        C12068a c12068a = (C12068a) obj;
        return C9322n.m27777a(this.f32085a, c12068a.f32085a) && this.f32086b == c12068a.f32086b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f32085a.hashCode() * 31;
        boolean z10 = this.f32086b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f32085a + ", value=" + this.f32086b + ')';
    }
}
