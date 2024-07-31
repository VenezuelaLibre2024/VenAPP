package p003a1;

import ck.C2030o;
import ck.C2037v;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;
import p430x0.InterfaceC12255f;

/* renamed from: a1.g */
/* loaded from: classes.dex */
public final class C0018g {

    @InterfaceC9300f(m27742c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m27743f = "Preferences.kt", m27744l = {329}, m27745m = "invokeSuspend")
    /* renamed from: a1.g$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9306l implements InterfaceC10002p<AbstractC0015d, Continuation<? super AbstractC0015d>, Object> {

        /* renamed from: a */
        int f48a;

        /* renamed from: b */
        /* synthetic */ Object f49b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC10002p<C0012a, Continuation<? super C2037v>, Object> f50c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC10002p<? super C0012a, ? super Continuation<? super C2037v>, ? extends Object> interfaceC10002p, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f50c = interfaceC10002p;
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC0015d abstractC0015d, Continuation<? super AbstractC0015d> continuation) {
            return ((a) create(abstractC0015d, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f50c, continuation);
            aVar.f49b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            m23655c = C7752d.m23655c();
            int i10 = this.f48a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0012a c0012a = (C0012a) this.f49b;
                C2030o.m10349b(obj);
                return c0012a;
            }
            C2030o.m10349b(obj);
            C0012a m51c = ((AbstractC0015d) this.f49b).m51c();
            InterfaceC10002p<C0012a, Continuation<? super C2037v>, Object> interfaceC10002p = this.f50c;
            this.f49b = m51c;
            this.f48a = 1;
            return interfaceC10002p.invoke(m51c, this) == m23655c ? m23655c : m51c;
        }
    }

    /* renamed from: a */
    public static final Object m65a(InterfaceC12255f<AbstractC0015d> interfaceC12255f, InterfaceC10002p<? super C0012a, ? super Continuation<? super C2037v>, ? extends Object> interfaceC10002p, Continuation<? super AbstractC0015d> continuation) {
        return interfaceC12255f.mo47a(new a(interfaceC10002p, null), continuation);
    }
}
