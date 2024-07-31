package p407w;

import p407w.InterfaceC12047x0;

/* renamed from: w.f */
/* loaded from: classes.dex */
final class C12004f extends InterfaceC12047x0.a {

    /* renamed from: a */
    private final int f31920a;

    /* renamed from: b */
    private final InterfaceC12047x0 f31921b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12004f(int i10, InterfaceC12047x0 interfaceC12047x0) {
        this.f31920a = i10;
        if (interfaceC12047x0 == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f31921b = interfaceC12047x0;
    }

    @Override // p407w.InterfaceC12047x0.a
    /* renamed from: a */
    public int mo38582a() {
        return this.f31920a;
    }

    @Override // p407w.InterfaceC12047x0.a
    /* renamed from: b */
    public InterfaceC12047x0 mo38583b() {
        return this.f31921b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC12047x0.a)) {
            return false;
        }
        InterfaceC12047x0.a aVar = (InterfaceC12047x0.a) obj;
        return this.f31920a == aVar.mo38582a() && this.f31921b.equals(aVar.mo38583b());
    }

    public int hashCode() {
        return ((this.f31920a ^ 1000003) * 1000003) ^ this.f31921b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f31920a + ", surfaceOutput=" + this.f31921b + "}";
    }
}
