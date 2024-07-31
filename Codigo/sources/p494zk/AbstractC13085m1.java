package p494zk;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import p124gk.AbstractC7583b;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC9998l;

/* renamed from: zk.m1 */
/* loaded from: classes3.dex */
public abstract class AbstractC13085m1 extends AbstractC13064h0 implements Closeable {

    /* renamed from: c */
    public static final a f35459c = new a(null);

    /* renamed from: zk.m1$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC7583b<AbstractC13064h0, AbstractC13085m1> {

        /* renamed from: zk.m1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C13294a extends AbstractC9323o implements InterfaceC9998l<InterfaceC7587f.b, AbstractC13085m1> {

            /* renamed from: a */
            public static final C13294a f35460a = new C13294a();

            C13294a() {
                super(1);
            }

            @Override // p280ok.InterfaceC9998l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC13085m1 invoke(InterfaceC7587f.b bVar) {
                if (bVar instanceof AbstractC13085m1) {
                    return (AbstractC13085m1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(AbstractC13064h0.f35444b, C13294a.f35460a);
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }
}
