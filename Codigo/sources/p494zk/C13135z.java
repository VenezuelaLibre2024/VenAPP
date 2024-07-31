package p494zk;

import ck.C2037v;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;

/* renamed from: zk.z */
/* loaded from: classes3.dex */
final class C13135z {

    /* renamed from: a */
    public final Object f35497a;

    /* renamed from: b */
    public final AbstractC13075k f35498b;

    /* renamed from: c */
    public final InterfaceC9998l<Throwable, C2037v> f35499c;

    /* renamed from: d */
    public final Object f35500d;

    /* renamed from: e */
    public final Throwable f35501e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13135z(Object obj, AbstractC13075k abstractC13075k, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l, Object obj2, Throwable th2) {
        this.f35497a = obj;
        this.f35498b = abstractC13075k;
        this.f35499c = interfaceC9998l;
        this.f35500d = obj2;
        this.f35501e = th2;
    }

    public /* synthetic */ C13135z(Object obj, AbstractC13075k abstractC13075k, InterfaceC9998l interfaceC9998l, Object obj2, Throwable th2, int i10, C9315g c9315g) {
        this(obj, (i10 & 2) != 0 ? null : abstractC13075k, (i10 & 4) != 0 ? null : interfaceC9998l, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }

    /* renamed from: b */
    public static /* synthetic */ C13135z m43330b(C13135z c13135z, Object obj, AbstractC13075k abstractC13075k, InterfaceC9998l interfaceC9998l, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c13135z.f35497a;
        }
        if ((i10 & 2) != 0) {
            abstractC13075k = c13135z.f35498b;
        }
        AbstractC13075k abstractC13075k2 = abstractC13075k;
        if ((i10 & 4) != 0) {
            interfaceC9998l = c13135z.f35499c;
        }
        InterfaceC9998l interfaceC9998l2 = interfaceC9998l;
        if ((i10 & 8) != 0) {
            obj2 = c13135z.f35500d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = c13135z.f35501e;
        }
        return c13135z.m43331a(obj, abstractC13075k2, interfaceC9998l2, obj4, th2);
    }

    /* renamed from: a */
    public final C13135z m43331a(Object obj, AbstractC13075k abstractC13075k, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l, Object obj2, Throwable th2) {
        return new C13135z(obj, abstractC13075k, interfaceC9998l, obj2, th2);
    }

    /* renamed from: c */
    public final boolean m43332c() {
        return this.f35501e != null;
    }

    /* renamed from: d */
    public final void m43333d(C13087n<?> c13087n, Throwable th2) {
        AbstractC13075k abstractC13075k = this.f35498b;
        if (abstractC13075k != null) {
            c13087n.m43264m(abstractC13075k, th2);
        }
        InterfaceC9998l<Throwable, C2037v> interfaceC9998l = this.f35499c;
        if (interfaceC9998l != null) {
            c13087n.m43265n(interfaceC9998l, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13135z)) {
            return false;
        }
        C13135z c13135z = (C13135z) obj;
        return C9322n.m27777a(this.f35497a, c13135z.f35497a) && C9322n.m27777a(this.f35498b, c13135z.f35498b) && C9322n.m27777a(this.f35499c, c13135z.f35499c) && C9322n.m27777a(this.f35500d, c13135z.f35500d) && C9322n.m27777a(this.f35501e, c13135z.f35501e);
    }

    public int hashCode() {
        Object obj = this.f35497a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC13075k abstractC13075k = this.f35498b;
        int hashCode2 = (hashCode + (abstractC13075k == null ? 0 : abstractC13075k.hashCode())) * 31;
        InterfaceC9998l<Throwable, C2037v> interfaceC9998l = this.f35499c;
        int hashCode3 = (hashCode2 + (interfaceC9998l == null ? 0 : interfaceC9998l.hashCode())) * 31;
        Object obj2 = this.f35500d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f35501e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f35497a + ", cancelHandler=" + this.f35498b + ", onCancellation=" + this.f35499c + ", idempotentResume=" + this.f35500d + ", cancelCause=" + this.f35501e + ')';
    }
}
