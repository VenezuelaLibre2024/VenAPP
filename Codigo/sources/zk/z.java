package zk;

/* loaded from: classes3.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f32946a;

    /* renamed from: b, reason: collision with root package name */
    public final k f32947b;

    /* renamed from: c, reason: collision with root package name */
    public final ok.l<Throwable, ck.v> f32948c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f32949d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f32950e;

    /* JADX WARN: Multi-variable type inference failed */
    public z(Object obj, k kVar, ok.l<? super Throwable, ck.v> lVar, Object obj2, Throwable th2) {
        this.f32946a = obj;
        this.f32947b = kVar;
        this.f32948c = lVar;
        this.f32949d = obj2;
        this.f32950e = th2;
    }

    public /* synthetic */ z(Object obj, k kVar, ok.l lVar, Object obj2, Throwable th2, int i10, kotlin.jvm.internal.g gVar) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }

    public static /* synthetic */ z b(z zVar, Object obj, k kVar, ok.l lVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = zVar.f32946a;
        }
        if ((i10 & 2) != 0) {
            kVar = zVar.f32947b;
        }
        k kVar2 = kVar;
        if ((i10 & 4) != 0) {
            lVar = zVar.f32948c;
        }
        ok.l lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = zVar.f32949d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = zVar.f32950e;
        }
        return zVar.a(obj, kVar2, lVar2, obj4, th2);
    }

    public final z a(Object obj, k kVar, ok.l<? super Throwable, ck.v> lVar, Object obj2, Throwable th2) {
        return new z(obj, kVar, lVar, obj2, th2);
    }

    public final boolean c() {
        return this.f32950e != null;
    }

    public final void d(n<?> nVar, Throwable th2) {
        k kVar = this.f32947b;
        if (kVar != null) {
            nVar.m(kVar, th2);
        }
        ok.l<Throwable, ck.v> lVar = this.f32948c;
        if (lVar != null) {
            nVar.n(lVar, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.n.a(this.f32946a, zVar.f32946a) && kotlin.jvm.internal.n.a(this.f32947b, zVar.f32947b) && kotlin.jvm.internal.n.a(this.f32948c, zVar.f32948c) && kotlin.jvm.internal.n.a(this.f32949d, zVar.f32949d) && kotlin.jvm.internal.n.a(this.f32950e, zVar.f32950e);
    }

    public int hashCode() {
        Object obj = this.f32946a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.f32947b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        ok.l<Throwable, ck.v> lVar = this.f32948c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f32949d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f32950e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f32946a + ", cancelHandler=" + this.f32947b + ", onCancellation=" + this.f32948c + ", idempotentResume=" + this.f32949d + ", cancelCause=" + this.f32950e + ')';
    }
}
