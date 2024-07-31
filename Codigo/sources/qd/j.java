package qd;

import com.google.protobuf.z;

/* loaded from: classes.dex */
public enum j implements z.c {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);

    public static final int CLICK_EVENT_TYPE_VALUE = 2;
    public static final int IMPRESSION_EVENT_TYPE_VALUE = 1;
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    private static final z.d<j> internalValueMap = new z.d<j>() { // from class: qd.j.a
        @Override // com.google.protobuf.z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(int i10) {
            return j.b(i10);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    private static final class b implements z.e {

        /* renamed from: a, reason: collision with root package name */
        static final z.e f23946a = new b();

        private b() {
        }

        @Override // com.google.protobuf.z.e
        public boolean a(int i10) {
            return j.b(i10) != null;
        }
    }

    j(int i10) {
        this.value = i10;
    }

    public static j b(int i10) {
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

    public static z.e h() {
        return b.f23946a;
    }

    @Override // com.google.protobuf.z.c
    public final int a() {
        return this.value;
    }
}
