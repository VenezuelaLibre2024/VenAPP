package p444xe;

import com.google.protobuf.C6633z;

/* renamed from: xe.d */
/* loaded from: classes.dex */
public enum EnumC12471d implements C6633z.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final C6633z.d<EnumC12471d> internalValueMap = new C6633z.d<EnumC12471d>() { // from class: xe.d.a
        @Override // com.google.protobuf.C6633z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC12471d mo19358a(int i10) {
            return EnumC12471d.m40535b(i10);
        }
    };
    private final int value;

    /* renamed from: xe.d$b */
    /* loaded from: classes.dex */
    private static final class b implements C6633z.e {

        /* renamed from: a */
        static final C6633z.e f33741a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C6633z.e
        /* renamed from: a */
        public boolean mo19359a(int i10) {
            return EnumC12471d.m40535b(i10) != null;
        }
    }

    EnumC12471d(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC12471d m40535b(int i10) {
        if (i10 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i10 == 1) {
            return FOREGROUND;
        }
        if (i10 == 2) {
            return BACKGROUND;
        }
        if (i10 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    /* renamed from: h */
    public static C6633z.e m40536h() {
        return b.f33741a;
    }

    @Override // com.google.protobuf.C6633z.c
    /* renamed from: a */
    public final int mo19357a() {
        return this.value;
    }
}
