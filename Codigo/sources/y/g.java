package y;

import y.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends e0.b {

    /* renamed from: a */
    private final f0 f31499a;

    /* renamed from: b */
    private final androidx.camera.core.o f31500b;

    public g(f0 f0Var, androidx.camera.core.o oVar) {
        if (f0Var == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f31499a = f0Var;
        if (oVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f31500b = oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.e0.b
    public androidx.camera.core.o a() {
        return this.f31500b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.e0.b
    public f0 b() {
        return this.f31499a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0.b)) {
            return false;
        }
        e0.b bVar = (e0.b) obj;
        return this.f31499a.equals(bVar.b()) && this.f31500b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f31499a.hashCode() ^ 1000003) * 1000003) ^ this.f31500b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f31499a + ", imageProxy=" + this.f31500b + "}";
    }
}
