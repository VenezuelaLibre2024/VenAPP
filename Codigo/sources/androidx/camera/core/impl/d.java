package androidx.camera.core.impl;

import androidx.camera.core.impl.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d<T> extends n0.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f2449a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f2450b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f2451c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f2449a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f2450b = cls;
        this.f2451c = obj;
    }

    @Override // androidx.camera.core.impl.n0.a
    public String c() {
        return this.f2449a;
    }

    @Override // androidx.camera.core.impl.n0.a
    public Object d() {
        return this.f2451c;
    }

    @Override // androidx.camera.core.impl.n0.a
    public Class<T> e() {
        return this.f2450b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0.a)) {
            return false;
        }
        n0.a aVar = (n0.a) obj;
        if (this.f2449a.equals(aVar.c()) && this.f2450b.equals(aVar.e())) {
            Object obj2 = this.f2451c;
            Object d10 = aVar.d();
            if (obj2 == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (obj2.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f2449a.hashCode() ^ 1000003) * 1000003) ^ this.f2450b.hashCode()) * 1000003;
        Object obj = this.f2451c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f2449a + ", valueClass=" + this.f2450b + ", token=" + this.f2451c + "}";
    }
}
