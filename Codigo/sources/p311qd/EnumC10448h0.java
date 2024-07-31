package p311qd;

import com.google.protobuf.C6633z;

/* renamed from: qd.h0 */
/* loaded from: classes.dex */
public enum EnumC10448h0 implements C6633z.c {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);

    public static final int IMAGE_DISPLAY_ERROR_VALUE = 2;
    public static final int IMAGE_FETCH_ERROR_VALUE = 1;
    public static final int IMAGE_UNSUPPORTED_FORMAT_VALUE = 3;
    public static final int UNSPECIFIED_RENDER_ERROR_VALUE = 0;
    private static final C6633z.d<EnumC10448h0> internalValueMap = new C6633z.d<EnumC10448h0>() { // from class: qd.h0.a
        @Override // com.google.protobuf.C6633z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC10448h0 mo19358a(int i10) {
            return EnumC10448h0.m31347b(i10);
        }
    };
    private final int value;

    /* renamed from: qd.h0$b */
    /* loaded from: classes.dex */
    private static final class b implements C6633z.e {

        /* renamed from: a */
        static final C6633z.e f25986a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C6633z.e
        /* renamed from: a */
        public boolean mo19359a(int i10) {
            return EnumC10448h0.m31347b(i10) != null;
        }
    }

    EnumC10448h0(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC10448h0 m31347b(int i10) {
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

    /* renamed from: h */
    public static C6633z.e m31348h() {
        return b.f25986a;
    }

    @Override // com.google.protobuf.C6633z.c
    /* renamed from: a */
    public final int mo19357a() {
        return this.value;
    }
}
