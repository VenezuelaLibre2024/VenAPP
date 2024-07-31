package p275of;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6593k0;
import com.google.protobuf.C6596l0;
import com.google.protobuf.C6621t1;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p311qd.C10440d0;
import p311qd.C10441e;
import p311qd.C10447h;

/* renamed from: of.c */
/* loaded from: classes2.dex */
public final class C9938c extends AbstractC6629x<C9938c, a> implements InterfaceC6617s0 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final C9938c DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile InterfaceC6634z0<C9938c> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private C10440d0 content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private C10441e priority_;
    private int payloadCase_ = 0;
    private C6596l0<String, String> dataBundle_ = C6596l0.m18927d();
    private C6633z.i<C10447h> triggeringConditions_ = AbstractC6629x.m19283G();

    /* renamed from: of.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6629x.a<C9938c, a> implements InterfaceC6617s0 {
        private a() {
            super(C9938c.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C9936a c9936a) {
            this();
        }
    }

    /* renamed from: of.c$b */
    /* loaded from: classes2.dex */
    private static final class b {

        /* renamed from: a */
        static final C6593k0<String, String> f24473a;

        static {
            C6621t1.b bVar = C6621t1.b.STRING;
            f24473a = C6593k0.m18906d(bVar, "", bVar, "");
        }
    }

    /* renamed from: of.c$c */
    /* loaded from: classes2.dex */
    public enum c {
        VANILLA_PAYLOAD(1),
        EXPERIMENTAL_PAYLOAD(2),
        PAYLOAD_NOT_SET(0);

        private final int value;

        c(int i10) {
            this.value = i10;
        }

        /* renamed from: b */
        public static c m29688b(int i10) {
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
        C9938c c9938c = new C9938c();
        DEFAULT_INSTANCE = c9938c;
        AbstractC6629x.m19291W(C9938c.class, c9938c);
    }

    private C9938c() {
    }

    /* renamed from: k0 */
    private C6596l0<String, String> m29679k0() {
        return this.dataBundle_;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C9936a c9936a = null;
        switch (C9936a.f24472a[fVar.ordinal()]) {
            case 1:
                return new C9938c();
            case 2:
                return new a(c9936a);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\t\u0004\t\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", C9939d.class, C9937b.class, "content_", "priority_", "triggeringConditions_", C10447h.class, "isTestCampaign_", "dataBundle_", b.f24473a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C9938c> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C9938c.class) {
                        interfaceC6634z0 = PARSER;
                        if (interfaceC6634z0 == null) {
                            interfaceC6634z0 = new AbstractC6629x.b<>(DEFAULT_INSTANCE);
                            PARSER = interfaceC6634z0;
                        }
                    }
                }
                return interfaceC6634z0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b0 */
    public C10440d0 m29680b0() {
        C10440d0 c10440d0 = this.content_;
        return c10440d0 == null ? C10440d0.m31311e0() : c10440d0;
    }

    /* renamed from: d0 */
    public Map<String, String> m29681d0() {
        return Collections.unmodifiableMap(m29679k0());
    }

    /* renamed from: e0 */
    public C9937b m29682e0() {
        return this.payloadCase_ == 2 ? (C9937b) this.payload_ : C9937b.m29672g0();
    }

    /* renamed from: f0 */
    public boolean m29683f0() {
        return this.isTestCampaign_;
    }

    /* renamed from: g0 */
    public c m29684g0() {
        return c.m29688b(this.payloadCase_);
    }

    /* renamed from: h0 */
    public C10441e m29685h0() {
        C10441e c10441e = this.priority_;
        return c10441e == null ? C10441e.m31319b0() : c10441e;
    }

    /* renamed from: i0 */
    public List<C10447h> m29686i0() {
        return this.triggeringConditions_;
    }

    /* renamed from: j0 */
    public C9939d m29687j0() {
        return this.payloadCase_ == 1 ? (C9939d) this.payload_ : C9939d.m29690g0();
    }
}
