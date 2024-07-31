package g0;

import androidx.concurrent.futures.c;
import g0.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends u.b {

    /* renamed from: a */
    private final int f15531a;

    /* renamed from: b */
    private final int f15532b;

    /* renamed from: c */
    private final c.a<Void> f15533c;

    public a(int i10, int i11, c.a<Void> aVar) {
        this.f15531a = i10;
        this.f15532b = i11;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f15533c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.u.b
    public c.a<Void> a() {
        return this.f15533c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.u.b
    public int b() {
        return this.f15531a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.u.b
    public int c() {
        return this.f15532b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u.b)) {
            return false;
        }
        u.b bVar = (u.b) obj;
        return this.f15531a == bVar.b() && this.f15532b == bVar.c() && this.f15533c.equals(bVar.a());
    }

    public int hashCode() {
        return ((((this.f15531a ^ 1000003) * 1000003) ^ this.f15532b) * 1000003) ^ this.f15533c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f15531a + ", rotationDegrees=" + this.f15532b + ", completer=" + this.f15533c + "}";
    }
}
