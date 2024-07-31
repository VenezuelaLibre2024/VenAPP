package p112g0;

import java.util.List;
import p112g0.C7430v0;

/* renamed from: g0.d */
/* loaded from: classes.dex */
final class C7393d extends C7430v0.b {

    /* renamed from: a */
    private final C7414n0 f17145a;

    /* renamed from: b */
    private final List<C7430v0.d> f17146b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7393d(C7414n0 c7414n0, List<C7430v0.d> list) {
        if (c7414n0 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f17145a = c7414n0;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f17146b = list;
    }

    @Override // p112g0.C7430v0.b
    /* renamed from: a */
    public List<C7430v0.d> mo22317a() {
        return this.f17146b;
    }

    @Override // p112g0.C7430v0.b
    /* renamed from: b */
    public C7414n0 mo22318b() {
        return this.f17145a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7430v0.b)) {
            return false;
        }
        C7430v0.b bVar = (C7430v0.b) obj;
        return this.f17145a.equals(bVar.mo22318b()) && this.f17146b.equals(bVar.mo22317a());
    }

    public int hashCode() {
        return ((this.f17145a.hashCode() ^ 1000003) * 1000003) ^ this.f17146b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f17145a + ", outConfigs=" + this.f17146b + "}";
    }
}
