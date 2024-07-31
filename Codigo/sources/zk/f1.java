package zk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f1 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32882a;

    public f1(boolean z10) {
        this.f32882a = z10;
    }

    @Override // zk.r1
    public boolean a() {
        return this.f32882a;
    }

    @Override // zk.r1
    public i2 c() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(a() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
