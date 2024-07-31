package p494zk;

import ck.C2037v;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;

/* renamed from: zk.b0 */
/* loaded from: classes3.dex */
public final class C13038b0 {

    /* renamed from: a */
    public final Object f35394a;

    /* renamed from: b */
    public final InterfaceC9998l<Throwable, C2037v> f35395b;

    /* JADX WARN: Multi-variable type inference failed */
    public C13038b0(Object obj, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        this.f35394a = obj;
        this.f35395b = interfaceC9998l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13038b0)) {
            return false;
        }
        C13038b0 c13038b0 = (C13038b0) obj;
        return C9322n.m27777a(this.f35394a, c13038b0.f35394a) && C9322n.m27777a(this.f35395b, c13038b0.f35395b);
    }

    public int hashCode() {
        Object obj = this.f35394a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f35395b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f35394a + ", onCancellation=" + this.f35395b + ')';
    }
}
