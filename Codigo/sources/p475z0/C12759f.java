package p475z0;

import androidx.datastore.preferences.protobuf.AbstractC1215y;
import androidx.datastore.preferences.protobuf.C1177k0;
import androidx.datastore.preferences.protobuf.C1180l0;
import androidx.datastore.preferences.protobuf.C1205t1;
import androidx.datastore.preferences.protobuf.InterfaceC1201s0;
import androidx.datastore.preferences.protobuf.InterfaceC1218z0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* renamed from: z0.f */
/* loaded from: classes.dex */
public final class C12759f extends AbstractC1215y<C12759f, a> implements InterfaceC1201s0 {
    private static final C12759f DEFAULT_INSTANCE;
    private static volatile InterfaceC1218z0<C12759f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C1180l0<String, C12761h> preferences_ = C1180l0.m6194d();

    /* renamed from: z0.f$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1215y.a<C12759f, a> implements InterfaceC1201s0 {
        private a() {
            super(C12759f.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C12758e c12758e) {
            this();
        }

        /* renamed from: x */
        public a m42312x(String str, C12761h c12761h) {
            str.getClass();
            c12761h.getClass();
            m6565s();
            ((C12759f) this.f5030b).m42306L().put(str, c12761h);
            return this;
        }
    }

    /* renamed from: z0.f$b */
    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a */
        static final C1177k0<String, C12761h> f34800a = C1177k0.m6137d(C1205t1.b.STRING, "", C1205t1.b.MESSAGE, C12761h.m42329S());
    }

    static {
        C12759f c12759f = new C12759f();
        DEFAULT_INSTANCE = c12759f;
        AbstractC1215y.m6547H(C12759f.class, c12759f);
    }

    private C12759f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public Map<String, C12761h> m42306L() {
        return m42307N();
    }

    /* renamed from: N */
    private C1180l0<String, C12761h> m42307N() {
        if (!this.preferences_.m6198j()) {
            this.preferences_ = this.preferences_.m6201m();
        }
        return this.preferences_;
    }

    /* renamed from: O */
    private C1180l0<String, C12761h> m42308O() {
        return this.preferences_;
    }

    /* renamed from: P */
    public static a m42309P() {
        return DEFAULT_INSTANCE.m6556r();
    }

    /* renamed from: Q */
    public static C12759f m42310Q(InputStream inputStream) {
        return (C12759f) AbstractC1215y.m6545F(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: M */
    public Map<String, C12761h> m42311M() {
        return Collections.unmodifiableMap(m42308O());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1215y
    /* renamed from: u */
    protected final Object mo6559u(AbstractC1215y.f fVar, Object obj, Object obj2) {
        C12758e c12758e = null;
        switch (C12758e.f34799a[fVar.ordinal()]) {
            case 1:
                return new C12759f();
            case 2:
                return new a(c12758e);
            case 3:
                return AbstractC1215y.m6544E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f34800a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1218z0<C12759f> interfaceC1218z0 = PARSER;
                if (interfaceC1218z0 == null) {
                    synchronized (C12759f.class) {
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
