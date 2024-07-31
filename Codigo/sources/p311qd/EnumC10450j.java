package p311qd;

import com.google.protobuf.C6633z;

/* renamed from: qd.j */
/* loaded from: classes.dex */
public enum EnumC10450j implements C6633z.c {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);

    public static final int CLICK_EVENT_TYPE_VALUE = 2;
    public static final int IMPRESSION_EVENT_TYPE_VALUE = 1;
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    private static final C6633z.d<EnumC10450j> internalValueMap = new C6633z.d<EnumC10450j>() { // from class: qd.j.a
        @Override // com.google.protobuf.C6633z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC10450j mo19358a(int i10) {
            return EnumC10450j.m31353b(i10);
        }
    };
    private final int value;

    /* renamed from: qd.j$b */
    /* loaded from: classes.dex */
    private static final class b implements C6633z.e {

        /* renamed from: a */
        static final C6633z.e f25988a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C6633z.e
        /* renamed from: a */
        public boolean mo19359a(int i10) {
            return EnumC10450j.m31353b(i10) != null;
        }
    }

    EnumC10450j(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC10450j m31353b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_EVENT_TYPE;
        }
        if (i10 == 1) {
            return IMPRESSION_EVENT_TYPE;
        }
        if (i10 != 2) {
            return null;
        }
        return CLICK_EVENT_TYPE;
    }

    /* renamed from: h */
    public static C6633z.e m31354h() {
        return b.f25988a;
    }

    @Override // com.google.protobuf.C6633z.c
    /* renamed from: a */
    public final int mo19357a() {
        return this.value;
    }
}
