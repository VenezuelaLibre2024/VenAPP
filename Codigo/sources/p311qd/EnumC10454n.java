package p311qd;

import com.google.protobuf.C6633z;

/* renamed from: qd.n */
/* loaded from: classes.dex */
public enum EnumC10454n implements C6633z.c {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);

    public static final int CLIENT_ERROR_VALUE = 2;
    public static final int NETWORK_ERROR_VALUE = 3;
    public static final int SERVER_ERROR_VALUE = 1;
    public static final int UNSPECIFIED_FETCH_ERROR_VALUE = 0;
    private static final C6633z.d<EnumC10454n> internalValueMap = new C6633z.d<EnumC10454n>() { // from class: qd.n.a
        @Override // com.google.protobuf.C6633z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC10454n mo19358a(int i10) {
            return EnumC10454n.m31365b(i10);
        }
    };
    private final int value;

    /* renamed from: qd.n$b */
    /* loaded from: classes.dex */
    private static final class b implements C6633z.e {

        /* renamed from: a */
        static final C6633z.e f25990a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C6633z.e
        /* renamed from: a */
        public boolean mo19359a(int i10) {
            return EnumC10454n.m31365b(i10) != null;
        }
    }

    EnumC10454n(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC10454n m31365b(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED_FETCH_ERROR;
        }
        if (i10 == 1) {
            return SERVER_ERROR;
        }
        if (i10 == 2) {
            return CLIENT_ERROR;
        }
        if (i10 != 3) {
            return null;
        }
        return NETWORK_ERROR;
    }

    /* renamed from: h */
    public static C6633z.e m31366h() {
        return b.f25990a;
    }

    @Override // com.google.protobuf.C6633z.c
    /* renamed from: a */
    public final int mo19357a() {
        return this.value;
    }
}
