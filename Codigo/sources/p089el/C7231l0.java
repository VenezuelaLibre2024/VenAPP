package p089el;

import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p494zk.InterfaceC13106r2;

/* renamed from: el.l0 */
/* loaded from: classes3.dex */
public final class C7231l0 {

    /* renamed from: a */
    public static final C7223h0 f16205a = new C7223h0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final InterfaceC10002p<Object, InterfaceC7587f.b, Object> f16206b = a.f16209a;

    /* renamed from: c */
    private static final InterfaceC10002p<InterfaceC13106r2<?>, InterfaceC7587f.b, InterfaceC13106r2<?>> f16207c = b.f16210a;

    /* renamed from: d */
    private static final InterfaceC10002p<C7239p0, InterfaceC7587f.b, C7239p0> f16208d = c.f16211a;

    /* renamed from: el.l0$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC10002p<Object, InterfaceC7587f.b, Object> {

        /* renamed from: a */
        public static final a f16209a = new a();

        a() {
            super(2);
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC7587f.b bVar) {
            if (!(bVar instanceof InterfaceC13106r2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: el.l0$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC9323o implements InterfaceC10002p<InterfaceC13106r2<?>, InterfaceC7587f.b, InterfaceC13106r2<?>> {

        /* renamed from: a */
        public static final b f16210a = new b();

        b() {
            super(2);
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13106r2<?> invoke(InterfaceC13106r2<?> interfaceC13106r2, InterfaceC7587f.b bVar) {
            if (interfaceC13106r2 != null) {
                return interfaceC13106r2;
            }
            if (bVar instanceof InterfaceC13106r2) {
                return (InterfaceC13106r2) bVar;
            }
            return null;
        }
    }

    /* renamed from: el.l0$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC9323o implements InterfaceC10002p<C7239p0, InterfaceC7587f.b, C7239p0> {

        /* renamed from: a */
        public static final c f16211a = new c();

        c() {
            super(2);
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7239p0 invoke(C7239p0 c7239p0, InterfaceC7587f.b bVar) {
            if (bVar instanceof InterfaceC13106r2) {
                InterfaceC13106r2<?> interfaceC13106r2 = (InterfaceC13106r2) bVar;
                c7239p0.m21641a(interfaceC13106r2, interfaceC13106r2.m43295v0(c7239p0.f16223a));
            }
            return c7239p0;
        }
    }

    /* renamed from: a */
    public static final void m21610a(InterfaceC7587f interfaceC7587f, Object obj) {
        if (obj == f16205a) {
            return;
        }
        if (obj instanceof C7239p0) {
            ((C7239p0) obj).m21642b(interfaceC7587f);
            return;
        }
        Object mo20648z0 = interfaceC7587f.mo20648z0(null, f16207c);
        C9322n.m27779c(mo20648z0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC13106r2) mo20648z0).m43294S(interfaceC7587f, obj);
    }

    /* renamed from: b */
    public static final Object m21611b(InterfaceC7587f interfaceC7587f) {
        Object mo20648z0 = interfaceC7587f.mo20648z0(0, f16206b);
        C9322n.m27778b(mo20648z0);
        return mo20648z0;
    }

    /* renamed from: c */
    public static final Object m21612c(InterfaceC7587f interfaceC7587f, Object obj) {
        if (obj == null) {
            obj = m21611b(interfaceC7587f);
        }
        if (obj == 0) {
            return f16205a;
        }
        if (obj instanceof Integer) {
            return interfaceC7587f.mo20648z0(new C7239p0(interfaceC7587f, ((Number) obj).intValue()), f16208d);
        }
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC13106r2) obj).m43295v0(interfaceC7587f);
    }
}
