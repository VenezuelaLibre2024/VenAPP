package p069dl;

import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p089el.C7215d0;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p494zk.InterfaceC13125w1;

/* renamed from: dl.k */
/* loaded from: classes3.dex */
public final class C7053k {

    /* renamed from: dl.k$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC10002p<Integer, InterfaceC7587f.b, Integer> {

        /* renamed from: a */
        final /* synthetic */ C7051i<?> f15624a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7051i<?> c7051i) {
            super(2);
            this.f15624a = c7051i;
        }

        /* renamed from: a */
        public final Integer m20658a(int i10, InterfaceC7587f.b bVar) {
            InterfaceC7587f.c<?> key = bVar.getKey();
            InterfaceC7587f.b mo20647b = this.f15624a.f15617b.mo20647b(key);
            if (key != InterfaceC13125w1.f35491q) {
                return Integer.valueOf(bVar != mo20647b ? Integer.MIN_VALUE : i10 + 1);
            }
            InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) mo20647b;
            C9322n.m27779c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC13125w1 m20657b = C7053k.m20657b((InterfaceC13125w1) bVar, interfaceC13125w1);
            if (m20657b == interfaceC13125w1) {
                if (interfaceC13125w1 != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + m20657b + ", expected child of " + interfaceC13125w1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, InterfaceC7587f.b bVar) {
            return m20658a(num.intValue(), bVar);
        }
    }

    /* renamed from: a */
    public static final void m20656a(C7051i<?> c7051i, InterfaceC7587f interfaceC7587f) {
        if (((Number) interfaceC7587f.mo20648z0(0, new a(c7051i))).intValue() == c7051i.f15618c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c7051i.f15617b + ",\n\t\tbut emission happened in " + interfaceC7587f + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: b */
    public static final InterfaceC13125w1 m20657b(InterfaceC13125w1 interfaceC13125w1, InterfaceC13125w1 interfaceC13125w12) {
        while (interfaceC13125w1 != null) {
            if (interfaceC13125w1 == interfaceC13125w12 || !(interfaceC13125w1 instanceof C7215d0)) {
                return interfaceC13125w1;
            }
            interfaceC13125w1 = interfaceC13125w1.getParent();
        }
        return null;
    }
}
