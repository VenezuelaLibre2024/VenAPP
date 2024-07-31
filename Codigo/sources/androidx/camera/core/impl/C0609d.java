package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC0649n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.d */
/* loaded from: classes.dex */
public final class C0609d<T> extends InterfaceC0649n0.a<T> {

    /* renamed from: a */
    private final String f2777a;

    /* renamed from: b */
    private final Class<T> f2778b;

    /* renamed from: c */
    private final Object f2779c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0609d(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f2777a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f2778b = cls;
        this.f2779c = obj;
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0.a
    /* renamed from: c */
    public String mo3015c() {
        return this.f2777a;
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0.a
    /* renamed from: d */
    public Object mo3016d() {
        return this.f2779c;
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0.a
    /* renamed from: e */
    public Class<T> mo3017e() {
        return this.f2778b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC0649n0.a)) {
            return false;
        }
        InterfaceC0649n0.a aVar = (InterfaceC0649n0.a) obj;
        if (this.f2777a.equals(aVar.mo3015c()) && this.f2778b.equals(aVar.mo3017e())) {
            Object obj2 = this.f2779c;
            Object mo3016d = aVar.mo3016d();
            if (obj2 == null) {
                if (mo3016d == null) {
                    return true;
                }
            } else if (obj2.equals(mo3016d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f2777a.hashCode() ^ 1000003) * 1000003) ^ this.f2778b.hashCode()) * 1000003;
        Object obj = this.f2779c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f2777a + ", valueClass=" + this.f2778b + ", token=" + this.f2779c + "}";
    }
}
