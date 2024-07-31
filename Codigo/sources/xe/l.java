package xe;

import com.google.protobuf.z;

/* loaded from: classes.dex */
public enum l implements z.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final z.d<l> internalValueMap = new z.d<l>() { // from class: xe.l.a
        @Override // com.google.protobuf.z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(int i10) {
            return l.b(i10);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    private static final class b implements z.e {

        /* renamed from: a, reason: collision with root package name */
        static final z.e f31231a = new b();

        private b() {
        }

        @Override // com.google.protobuf.z.e
        public boolean a(int i10) {
            return l.b(i10) != null;
        }
    }

    l(int i10) {
        this.value = i10;
    }

    public static l b(int i10) {
        if (i10 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static z.e h() {
        return b.f31231a;
    }

    @Override // com.google.protobuf.z.c
    public final int a() {
        return this.value;
    }
}
