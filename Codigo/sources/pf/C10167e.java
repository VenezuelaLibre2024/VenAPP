package pf;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import java.util.List;
import p275of.C9938c;

/* renamed from: pf.e */
/* loaded from: classes2.dex */
public final class C10167e extends AbstractC6629x<C10167e, b> implements InterfaceC6617s0 {
    private static final C10167e DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile InterfaceC6634z0<C10167e> PARSER;
    private long expirationEpochTimestampMillis_;
    private C6633z.i<C9938c> messages_ = AbstractC6629x.m19283G();

    /* renamed from: pf.e$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24979a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f24979a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24979a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24979a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24979a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24979a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24979a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24979a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: pf.e$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6629x.a<C10167e, b> implements InterfaceC6617s0 {
        private b() {
            super(C10167e.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m30430I(long j10) {
            m19314A();
            ((C10167e) this.f14658b).m30427i0(j10);
            return this;
        }
    }

    static {
        C10167e c10167e = new C10167e();
        DEFAULT_INSTANCE = c10167e;
        AbstractC6629x.m19291W(C10167e.class, c10167e);
    }

    private C10167e() {
    }

    /* renamed from: d0 */
    public static C10167e m30424d0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g0 */
    public static b m30425g0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* renamed from: h0 */
    public static InterfaceC6634z0<C10167e> m30426h0() {
        return DEFAULT_INSTANCE.mo19035g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m30427i0(long j10) {
        this.expirationEpochTimestampMillis_ = j10;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f24979a[fVar.ordinal()]) {
            case 1:
                return new C10167e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", C9938c.class, "expirationEpochTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10167e> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10167e.class) {
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

    /* renamed from: e0 */
    public long m30428e0() {
        return this.expirationEpochTimestampMillis_;
    }

    /* renamed from: f0 */
    public List<C9938c> m30429f0() {
        return this.messages_;
    }
}
