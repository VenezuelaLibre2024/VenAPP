package p146hl;

import ck.C2037v;
import kotlin.jvm.internal.AbstractC9323o;
import p089el.C7223h0;
import p280ok.InterfaceC10003q;
import p280ok.InterfaceC9998l;
import p494zk.InterfaceC13083m;

/* renamed from: hl.c */
/* loaded from: classes3.dex */
public final class C7755c {

    /* renamed from: a */
    private static final InterfaceC10003q<Object, Object, Object, Object> f18486a = a.f18492a;

    /* renamed from: b */
    private static final C7223h0 f18487b = new C7223h0("STATE_REG");

    /* renamed from: c */
    private static final C7223h0 f18488c = new C7223h0("STATE_COMPLETED");

    /* renamed from: d */
    private static final C7223h0 f18489d = new C7223h0("STATE_CANCELLED");

    /* renamed from: e */
    private static final C7223h0 f18490e = new C7223h0("NO_RESULT");

    /* renamed from: f */
    private static final C7223h0 f18491f = new C7223h0("PARAM_CLAUSE_0");

    /* renamed from: hl.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC10003q {

        /* renamed from: a */
        public static final a f18492a = new a();

        a() {
            super(3);
        }

        @Override // p280ok.InterfaceC10003q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void mo9756m(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final EnumC7756d m23664a(int i10) {
        if (i10 == 0) {
            return EnumC7756d.SUCCESSFUL;
        }
        if (i10 == 1) {
            return EnumC7756d.REREGISTER;
        }
        if (i10 == 2) {
            return EnumC7756d.CANCELLED;
        }
        if (i10 == 3) {
            return EnumC7756d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m23671h(InterfaceC13083m<? super C2037v> interfaceC13083m, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        Object mo24602l = interfaceC13083m.mo24602l(C2037v.f8089a, null, interfaceC9998l);
        if (mo24602l == null) {
            return false;
        }
        interfaceC13083m.mo24603o(mo24602l);
        return true;
    }
}
