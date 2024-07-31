package zk;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f32843a;

    /* renamed from: b, reason: collision with root package name */
    public final ok.l<Throwable, ck.v> f32844b;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(Object obj, ok.l<? super Throwable, ck.v> lVar) {
        this.f32843a = obj;
        this.f32844b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.n.a(this.f32843a, b0Var.f32843a) && kotlin.jvm.internal.n.a(this.f32844b, b0Var.f32844b);
    }

    public int hashCode() {
        Object obj = this.f32843a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f32844b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f32843a + ", onCancellation=" + this.f32844b + ')';
    }
}
