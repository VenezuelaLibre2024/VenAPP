package qd;

import com.google.protobuf.z;

/* loaded from: classes.dex */
public enum n implements z.c {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);

    public static final int CLIENT_ERROR_VALUE = 2;
    public static final int NETWORK_ERROR_VALUE = 3;
    public static final int SERVER_ERROR_VALUE = 1;
    public static final int UNSPECIFIED_FETCH_ERROR_VALUE = 0;
    private static final z.d<n> internalValueMap = new z.d<n>() { // from class: qd.n.a
        @Override // com.google.protobuf.z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(int i10) {
            return n.b(i10);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    private static final class b implements z.e {

        /* renamed from: a, reason: collision with root package name */
        static final z.e f23948a = new b();

        private b() {
        }

        @Override // com.google.protobuf.z.e
        public boolean a(int i10) {
            return n.b(i10) != null;
        }
    }

    n(int i10) {
        this.value = i10;
    }

    public static n b(int i10) {
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

    public static z.e h() {
        return b.f23948a;
    }

    @Override // com.google.protobuf.z.c
    public final int a() {
        return this.value;
    }
}
