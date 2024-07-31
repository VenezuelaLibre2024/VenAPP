package p089el;

import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7587f;
import p494zk.InterfaceC13106r2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: el.p0 */
/* loaded from: classes3.dex */
public final class C7239p0 {

    /* renamed from: a */
    public final InterfaceC7587f f16223a;

    /* renamed from: b */
    private final Object[] f16224b;

    /* renamed from: c */
    private final InterfaceC13106r2<Object>[] f16225c;

    /* renamed from: d */
    private int f16226d;

    public C7239p0(InterfaceC7587f interfaceC7587f, int i10) {
        this.f16223a = interfaceC7587f;
        this.f16224b = new Object[i10];
        this.f16225c = new InterfaceC13106r2[i10];
    }

    /* renamed from: a */
    public final void m21641a(InterfaceC13106r2<?> interfaceC13106r2, Object obj) {
        Object[] objArr = this.f16224b;
        int i10 = this.f16226d;
        objArr[i10] = obj;
        InterfaceC13106r2<Object>[] interfaceC13106r2Arr = this.f16225c;
        this.f16226d = i10 + 1;
        C9322n.m27779c(interfaceC13106r2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC13106r2Arr[i10] = interfaceC13106r2;
    }

    /* renamed from: b */
    public final void m21642b(InterfaceC7587f interfaceC7587f) {
        int length = this.f16225c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            InterfaceC13106r2<Object> interfaceC13106r2 = this.f16225c[length];
            C9322n.m27778b(interfaceC13106r2);
            interfaceC13106r2.m43294S(interfaceC7587f, this.f16224b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
