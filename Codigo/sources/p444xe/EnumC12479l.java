package p444xe;

import com.google.protobuf.C6633z;

/* renamed from: xe.l */
/* loaded from: classes.dex */
public enum EnumC12479l implements C6633z.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final C6633z.d<EnumC12479l> internalValueMap = new C6633z.d<EnumC12479l>() { // from class: xe.l.a
        @Override // com.google.protobuf.C6633z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC12479l mo19358a(int i10) {
            return EnumC12479l.m40695b(i10);
        }
    };
    private final int value;

    /* renamed from: xe.l$b */
    /* loaded from: classes.dex */
    private static final class b implements C6633z.e {

        /* renamed from: a */
        static final C6633z.e f33751a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C6633z.e
        /* renamed from: a */
        public boolean mo19359a(int i10) {
            return EnumC12479l.m40695b(i10) != null;
        }
    }

    EnumC12479l(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC12479l m40695b(int i10) {
        if (i10 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    /* renamed from: h */
    public static C6633z.e m40696h() {
        return b.f33751a;
    }

    @Override // com.google.protobuf.C6633z.c
    /* renamed from: a */
    public final int mo19357a() {
        return this.value;
    }
}
