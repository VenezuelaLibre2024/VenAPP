package p154i6;

import android.content.Context;
import p327r6.InterfaceC10625a;

/* renamed from: i6.c */
/* loaded from: classes.dex */
final class C7851c extends AbstractC7856h {

    /* renamed from: a */
    private final Context f18825a;

    /* renamed from: b */
    private final InterfaceC10625a f18826b;

    /* renamed from: c */
    private final InterfaceC10625a f18827c;

    /* renamed from: d */
    private final String f18828d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7851c(Context context, InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f18825a = context;
        if (interfaceC10625a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f18826b = interfaceC10625a;
        if (interfaceC10625a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f18827c = interfaceC10625a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f18828d = str;
    }

    @Override // p154i6.AbstractC7856h
    /* renamed from: b */
    public Context mo24151b() {
        return this.f18825a;
    }

    @Override // p154i6.AbstractC7856h
    /* renamed from: c */
    public String mo24152c() {
        return this.f18828d;
    }

    @Override // p154i6.AbstractC7856h
    /* renamed from: d */
    public InterfaceC10625a mo24153d() {
        return this.f18827c;
    }

    @Override // p154i6.AbstractC7856h
    /* renamed from: e */
    public InterfaceC10625a mo24154e() {
        return this.f18826b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7856h)) {
            return false;
        }
        AbstractC7856h abstractC7856h = (AbstractC7856h) obj;
        return this.f18825a.equals(abstractC7856h.mo24151b()) && this.f18826b.equals(abstractC7856h.mo24154e()) && this.f18827c.equals(abstractC7856h.mo24153d()) && this.f18828d.equals(abstractC7856h.mo24152c());
    }

    public int hashCode() {
        return ((((((this.f18825a.hashCode() ^ 1000003) * 1000003) ^ this.f18826b.hashCode()) * 1000003) ^ this.f18827c.hashCode()) * 1000003) ^ this.f18828d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f18825a + ", wallClock=" + this.f18826b + ", monotonicClock=" + this.f18827c + ", backendName=" + this.f18828d + "}";
    }
}
