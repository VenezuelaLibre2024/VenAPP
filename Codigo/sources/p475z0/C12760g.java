package p475z0;

import androidx.datastore.preferences.protobuf.AbstractC1146a;
import androidx.datastore.preferences.protobuf.AbstractC1215y;
import androidx.datastore.preferences.protobuf.C1147a0;
import androidx.datastore.preferences.protobuf.InterfaceC1201s0;
import androidx.datastore.preferences.protobuf.InterfaceC1218z0;
import java.util.List;

/* renamed from: z0.g */
/* loaded from: classes.dex */
public final class C12760g extends AbstractC1215y<C12760g, a> implements InterfaceC1201s0 {
    private static final C12760g DEFAULT_INSTANCE;
    private static volatile InterfaceC1218z0<C12760g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C1147a0.i<String> strings_ = AbstractC1215y.m6549v();

    /* renamed from: z0.g$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1215y.a<C12760g, a> implements InterfaceC1201s0 {
        private a() {
            super(C12760g.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C12758e c12758e) {
            this();
        }

        /* renamed from: x */
        public a m42320x(Iterable<String> iterable) {
            m6565s();
            ((C12760g) this.f5030b).m42315L(iterable);
            return this;
        }
    }

    static {
        C12760g c12760g = new C12760g();
        DEFAULT_INSTANCE = c12760g;
        AbstractC1215y.m6547H(C12760g.class, c12760g);
    }

    private C12760g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m42315L(Iterable<String> iterable) {
        m42316M();
        AbstractC1146a.m5629i(iterable, this.strings_);
    }

    /* renamed from: M */
    private void m42316M() {
        if (this.strings_.mo5658g()) {
            return;
        }
        this.strings_ = AbstractC1215y.m6543C(this.strings_);
    }

    /* renamed from: N */
    public static C12760g m42317N() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: P */
    public static a m42318P() {
        return DEFAULT_INSTANCE.m6556r();
    }

    /* renamed from: O */
    public List<String> m42319O() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1215y
    /* renamed from: u */
    protected final Object mo6559u(AbstractC1215y.f fVar, Object obj, Object obj2) {
        C12758e c12758e = null;
        switch (C12758e.f34799a[fVar.ordinal()]) {
            case 1:
                return new C12760g();
            case 2:
                return new a(c12758e);
            case 3:
                return AbstractC1215y.m6544E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1218z0<C12760g> interfaceC1218z0 = PARSER;
                if (interfaceC1218z0 == null) {
                    synchronized (C12760g.class) {
                        interfaceC1218z0 = PARSER;
                        if (interfaceC1218z0 == null) {
                            interfaceC1218z0 = new AbstractC1215y.b<>(DEFAULT_INSTANCE);
                            PARSER = interfaceC1218z0;
                        }
                    }
                }
                return interfaceC1218z0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
