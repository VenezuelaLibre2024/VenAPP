package p494zk;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zk.f1 */
/* loaded from: classes3.dex */
public final class C13057f1 implements InterfaceC13105r1 {

    /* renamed from: a */
    private final boolean f35433a;

    public C13057f1(boolean z10) {
        this.f35433a = z10;
    }

    @Override // p494zk.InterfaceC13105r1
    /* renamed from: a */
    public boolean mo43064a() {
        return this.f35433a;
    }

    @Override // p494zk.InterfaceC13105r1
    /* renamed from: c */
    public C13070i2 mo43065c() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(mo43064a() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
