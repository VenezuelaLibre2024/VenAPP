package p066dg;

import java.util.List;

/* renamed from: dg.e */
/* loaded from: classes2.dex */
public enum EnumC6944e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(InterfaceC6959t.class),
    ALLOWED_EAN_EXTENSIONS(int[].class),
    ALSO_INVERTED(Void.class);

    private final Class<?> valueType;

    EnumC6944e(Class cls) {
        this.valueType = cls;
    }

    /* renamed from: b */
    public Class<?> m20091b() {
        return this.valueType;
    }
}
