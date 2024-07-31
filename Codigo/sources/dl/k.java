package dl;

import el.d0;
import gk.f;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.p;
import zk.w1;

/* loaded from: classes3.dex */
public final class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends o implements p<Integer, f.b, Integer> {

        /* renamed from: a */
        final /* synthetic */ i<?> f14266a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<?> iVar) {
            super(2);
            this.f14266a = iVar;
        }

        public final Integer a(int i10, f.b bVar) {
            f.c<?> key = bVar.getKey();
            f.b b10 = this.f14266a.f14259b.b(key);
            if (key != w1.f32940q) {
                return Integer.valueOf(bVar != b10 ? Integer.MIN_VALUE : i10 + 1);
            }
            w1 w1Var = (w1) b10;
            n.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            w1 b11 = k.b((w1) bVar, w1Var);
            if (b11 == w1Var) {
                if (w1Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b11 + ", expected child of " + w1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, f.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(i<?> iVar, gk.f fVar) {
        if (((Number) fVar.z0(0, new a(iVar))).intValue() == iVar.f14260c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iVar.f14259b + ",\n\t\tbut emission happened in " + fVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final w1 b(w1 w1Var, w1 w1Var2) {
        while (w1Var != null) {
            if (w1Var == w1Var2 || !(w1Var instanceof d0)) {
                return w1Var;
            }
            w1Var = w1Var.getParent();
        }
        return null;
    }
}
