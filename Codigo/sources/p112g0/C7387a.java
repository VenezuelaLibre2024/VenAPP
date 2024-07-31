package p112g0;

import androidx.concurrent.futures.C0742c;
import p112g0.C7427u;

/* renamed from: g0.a */
/* loaded from: classes.dex */
final class C7387a extends C7427u.b {

    /* renamed from: a */
    private final int f17109a;

    /* renamed from: b */
    private final int f17110b;

    /* renamed from: c */
    private final C0742c.a<Void> f17111c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7387a(int i10, int i11, C0742c.a<Void> aVar) {
        this.f17109a = i10;
        this.f17110b = i11;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f17111c = aVar;
    }

    @Override // p112g0.C7427u.b
    /* renamed from: a */
    C0742c.a<Void> mo22260a() {
        return this.f17111c;
    }

    @Override // p112g0.C7427u.b
    /* renamed from: b */
    int mo22261b() {
        return this.f17109a;
    }

    @Override // p112g0.C7427u.b
    /* renamed from: c */
    int mo22262c() {
        return this.f17110b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7427u.b)) {
            return false;
        }
        C7427u.b bVar = (C7427u.b) obj;
        return this.f17109a == bVar.mo22261b() && this.f17110b == bVar.mo22262c() && this.f17111c.equals(bVar.mo22260a());
    }

    public int hashCode() {
        return ((((this.f17109a ^ 1000003) * 1000003) ^ this.f17110b) * 1000003) ^ this.f17111c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f17109a + ", rotationDegrees=" + this.f17110b + ", completer=" + this.f17111c + "}";
    }
}
