package z0;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z0;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends y<g, a> implements s0 {
    private static final g DEFAULT_INSTANCE;
    private static volatile z0<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private a0.i<String> strings_ = y.v();

    /* loaded from: classes.dex */
    public static final class a extends y.a<g, a> implements s0 {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a x(Iterable<String> iterable) {
            s();
            ((g) this.f4319b).L(iterable);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        y.H(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(Iterable<String> iterable) {
        M();
        androidx.datastore.preferences.protobuf.a.i(iterable, this.strings_);
    }

    private void M() {
        if (this.strings_.g()) {
            return;
        }
        this.strings_ = y.C(this.strings_);
    }

    public static g N() {
        return DEFAULT_INSTANCE;
    }

    public static a P() {
        return DEFAULT_INSTANCE.r();
    }

    public List<String> O() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    protected final Object u(y.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f32248a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return y.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<g> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (g.class) {
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
