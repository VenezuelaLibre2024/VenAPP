package of;

import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.s0;
import com.google.protobuf.t1;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import qd.d0;
import qd.e;
import qd.h;

/* loaded from: classes2.dex */
public final class c extends x<c, a> implements s0 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final c DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile z0<c> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private d0 content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private e priority_;
    private int payloadCase_ = 0;
    private l0<String, String> dataBundle_ = l0.d();
    private z.i<h> triggeringConditions_ = x.G();

    /* loaded from: classes2.dex */
    public static final class a extends x.a<c, a> implements s0 {
        private a() {
            super(c.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(of.a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    private static final class b {

        /* renamed from: a */
        static final k0<String, String> f22540a;

        static {
            t1.b bVar = t1.b.STRING;
            f22540a = k0.d(bVar, "", bVar, "");
        }
    }

    /* renamed from: of.c$c */
    /* loaded from: classes2.dex */
    public enum EnumC0372c {
        VANILLA_PAYLOAD(1),
        EXPERIMENTAL_PAYLOAD(2),
        PAYLOAD_NOT_SET(0);

        private final int value;

        EnumC0372c(int i10) {
            this.value = i10;
        }

        public static EnumC0372c b(int i10) {
            if (i10 == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i10 == 1) {
                return VANILLA_PAYLOAD;
            }
            if (i10 != 2) {
                return null;
            }
            return EXPERIMENTAL_PAYLOAD;
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        x.W(c.class, cVar);
    }

    private c() {
    }

    private l0<String, String> k0() {
        return this.dataBundle_;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (of.a.f22539a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new a(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\t\u0004\t\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", d.class, of.b.class, "content_", "priority_", "triggeringConditions_", h.class, "isTestCampaign_", "dataBundle_", b.f22540a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<c> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (c.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new x.b<>(DEFAULT_INSTANCE);
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

    public d0 b0() {
        d0 d0Var = this.content_;
        return d0Var == null ? d0.e0() : d0Var;
    }

    public Map<String, String> d0() {
        return Collections.unmodifiableMap(k0());
    }

    public of.b e0() {
        return this.payloadCase_ == 2 ? (of.b) this.payload_ : of.b.g0();
    }

    public boolean f0() {
        return this.isTestCampaign_;
    }

    public EnumC0372c g0() {
        return EnumC0372c.b(this.payloadCase_);
    }

    public e h0() {
        e eVar = this.priority_;
        return eVar == null ? e.b0() : eVar;
    }

    public List<h> i0() {
        return this.triggeringConditions_;
    }

    public d j0() {
        return this.payloadCase_ == 1 ? (d) this.payload_ : d.g0();
    }
}
