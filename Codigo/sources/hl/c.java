package hl;

import ck.v;
import el.h0;
import kotlin.jvm.internal.o;
import ok.l;
import ok.q;
import zk.m;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f16836a = a.f16842a;

    /* renamed from: b, reason: collision with root package name */
    private static final h0 f16837b = new h0("STATE_REG");

    /* renamed from: c, reason: collision with root package name */
    private static final h0 f16838c = new h0("STATE_COMPLETED");

    /* renamed from: d, reason: collision with root package name */
    private static final h0 f16839d = new h0("STATE_CANCELLED");

    /* renamed from: e, reason: collision with root package name */
    private static final h0 f16840e = new h0("NO_RESULT");

    /* renamed from: f, reason: collision with root package name */
    private static final h0 f16841f = new h0("PARAM_CLAUSE_0");

    /* loaded from: classes3.dex */
    static final class a extends o implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16842a = new a();

        a() {
            super(3);
        }

        @Override // ok.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void m(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d a(int i10) {
        if (i10 == 0) {
            return d.SUCCESSFUL;
        }
        if (i10 == 1) {
            return d.REREGISTER;
        }
        if (i10 == 2) {
            return d.CANCELLED;
        }
        if (i10 == 3) {
            return d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(m<? super v> mVar, l<? super Throwable, v> lVar) {
        Object l10 = mVar.l(v.f7137a, null, lVar);
        if (l10 == null) {
            return false;
        }
        mVar.o(l10);
        return true;
    }
}
