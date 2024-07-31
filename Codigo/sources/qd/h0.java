package qd;

import com.google.protobuf.z;

/* loaded from: classes.dex */
public enum h0 implements z.c {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);

    public static final int IMAGE_DISPLAY_ERROR_VALUE = 2;
    public static final int IMAGE_FETCH_ERROR_VALUE = 1;
    public static final int IMAGE_UNSUPPORTED_FORMAT_VALUE = 3;
    public static final int UNSPECIFIED_RENDER_ERROR_VALUE = 0;
    private static final z.d<h0> internalValueMap = new z.d<h0>() { // from class: qd.h0.a
        @Override // com.google.protobuf.z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0 a(int i10) {
            return h0.b(i10);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    private static final class b implements z.e {

        /* renamed from: a, reason: collision with root package name */
        static final z.e f23944a = new b();

        private b() {
        }

        @Override // com.google.protobuf.z.e
        public boolean a(int i10) {
            return h0.b(i10) != null;
        }
    }

    h0(int i10) {
        this.value = i10;
    }

    public static h0 b(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED_RENDER_ERROR;
        }
        if (i10 == 1) {
            return IMAGE_FETCH_ERROR;
        }
        if (i10 == 2) {
            return IMAGE_DISPLAY_ERROR;
        }
        if (i10 != 3) {
            return null;
        }
        return IMAGE_UNSUPPORTED_FORMAT;
    }

    public static z.e h() {
        return b.f23944a;
    }

    @Override // com.google.protobuf.z.c
    public final int a() {
        return this.value;
    }
}
