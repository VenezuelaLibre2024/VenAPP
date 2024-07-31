package p003a1;

import ck.C2030o;
import ck.C2037v;
import cl.InterfaceC2039b;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;
import p430x0.InterfaceC12255f;

/* renamed from: a1.b */
/* loaded from: classes.dex */
public final class C0013b implements InterfaceC12255f<AbstractC0015d> {

    /* renamed from: a */
    private final InterfaceC12255f<AbstractC0015d> f39a;

    @InterfaceC9300f(m27742c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m27743f = "PreferenceDataStoreFactory.kt", m27744l = {85}, m27745m = "invokeSuspend")
    /* renamed from: a1.b$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9306l implements InterfaceC10002p<AbstractC0015d, Continuation<? super AbstractC0015d>, Object> {

        /* renamed from: a */
        int f40a;

        /* renamed from: b */
        /* synthetic */ Object f41b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC10002p<AbstractC0015d, Continuation<? super AbstractC0015d>, Object> f42c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC10002p<? super AbstractC0015d, ? super Continuation<? super AbstractC0015d>, ? extends Object> interfaceC10002p, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f42c = interfaceC10002p;
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC0015d abstractC0015d, Continuation<? super AbstractC0015d> continuation) {
            return ((a) create(abstractC0015d, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f42c, continuation);
            aVar.f41b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            m23655c = C7752d.m23655c();
            int i10 = this.f40a;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                AbstractC0015d abstractC0015d = (AbstractC0015d) this.f41b;
                InterfaceC10002p<AbstractC0015d, Continuation<? super AbstractC0015d>, Object> interfaceC10002p = this.f42c;
                this.f40a = 1;
                obj = interfaceC10002p.invoke(abstractC0015d, this);
                if (obj == m23655c) {
                    return m23655c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
            }
            AbstractC0015d abstractC0015d2 = (AbstractC0015d) obj;
            ((C0012a) abstractC0015d2).m41f();
            return abstractC0015d2;
        }
    }

    public C0013b(InterfaceC12255f<AbstractC0015d> delegate) {
        C9322n.m27781e(delegate, "delegate");
        this.f39a = delegate;
    }

    @Override // p430x0.InterfaceC12255f
    /* renamed from: a */
    public Object mo47a(InterfaceC10002p<? super AbstractC0015d, ? super Continuation<? super AbstractC0015d>, ? extends Object> interfaceC10002p, Continuation<? super AbstractC0015d> continuation) {
        return this.f39a.mo47a(new a(interfaceC10002p, null), continuation);
    }

    @Override // p430x0.InterfaceC12255f
    public InterfaceC2039b<AbstractC0015d> getData() {
        return this.f39a.getData();
    }
}
