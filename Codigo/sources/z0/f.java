package z0;

import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends y<f, a> implements s0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile z0<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private l0<String, h> preferences_ = l0.d();

    /* loaded from: classes.dex */
    public static final class a extends y.a<f, a> implements s0 {
        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a x(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            s();
            ((f) this.f4319b).L().put(str, hVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final k0<String, h> f32249a = k0.d(t1.b.STRING, "", t1.b.MESSAGE, h.S());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        y.H(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, h> L() {
        return N();
    }

    private l0<String, h> N() {
        if (!this.preferences_.j()) {
            this.preferences_ = this.preferences_.m();
        }
        return this.preferences_;
    }

    private l0<String, h> O() {
        return this.preferences_;
    }

    public static a P() {
        return DEFAULT_INSTANCE.r();
    }

    public static f Q(InputStream inputStream) {
        return (f) y.F(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, h> M() {
        return Collections.unmodifiableMap(O());
    }

    @Override // androidx.datastore.preferences.protobuf.y
    protected final Object u(y.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f32248a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return y.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f32249a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<f> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (f.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new y.b<>(DEFAULT_INSTANCE);
                            PARSER = z0Var;
                        }
                    }
                }
                return z0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
