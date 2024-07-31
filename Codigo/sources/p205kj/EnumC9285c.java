package p205kj;

import dj.InterfaceC6978c;
import dj.InterfaceC6987l;
import dj.InterfaceC6992q;
import dj.InterfaceC6995t;
import p241mj.InterfaceC9595e;

/* renamed from: kj.c */
/* loaded from: classes3.dex */
public enum EnumC9285c implements InterfaceC9595e<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: b */
    public static void m27699b(InterfaceC6978c interfaceC6978c) {
        interfaceC6978c.mo20211b(INSTANCE);
        interfaceC6978c.mo20210a();
    }

    /* renamed from: i */
    public static void m27700i(InterfaceC6987l<?> interfaceC6987l) {
        interfaceC6987l.mo20279b(INSTANCE);
        interfaceC6987l.mo20278a();
    }

    /* renamed from: m */
    public static void m27701m(InterfaceC6992q<?> interfaceC6992q) {
        interfaceC6992q.mo606b(INSTANCE);
        interfaceC6992q.mo605a();
    }

    /* renamed from: n */
    public static void m27702n(Throwable th2, InterfaceC6978c interfaceC6978c) {
        interfaceC6978c.mo20211b(INSTANCE);
        interfaceC6978c.onError(th2);
    }

    /* renamed from: o */
    public static void m27703o(Throwable th2, InterfaceC6987l<?> interfaceC6987l) {
        interfaceC6987l.mo20279b(INSTANCE);
        interfaceC6987l.onError(th2);
    }

    /* renamed from: p */
    public static void m27704p(Throwable th2, InterfaceC6992q<?> interfaceC6992q) {
        interfaceC6992q.mo606b(INSTANCE);
        interfaceC6992q.onError(th2);
    }

    /* renamed from: q */
    public static void m27705q(Throwable th2, InterfaceC6995t<?> interfaceC6995t) {
        interfaceC6995t.mo20313b(INSTANCE);
        interfaceC6995t.onError(th2);
    }

    @Override // p241mj.InterfaceC9600j
    public void clear() {
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return this == INSTANCE;
    }

    @Override // p241mj.InterfaceC9600j
    public boolean isEmpty() {
        return true;
    }

    @Override // p241mj.InterfaceC9596f
    /* renamed from: l */
    public int mo27706l(int i10) {
        return i10 & 2;
    }

    @Override // p241mj.InterfaceC9600j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p241mj.InterfaceC9600j
    public Object poll() {
        return null;
    }
}
