package p473yl;

import kotlin.jvm.internal.C9315g;

/* renamed from: yl.b */
/* loaded from: classes3.dex */
public enum EnumC12734b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final a Companion = new a(null);
    private final int httpCode;

    /* renamed from: yl.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final EnumC12734b m42049a(int i10) {
            for (EnumC12734b enumC12734b : EnumC12734b.values()) {
                if (enumC12734b.m42048h() == i10) {
                    return enumC12734b;
                }
            }
            return null;
        }
    }

    EnumC12734b(int i10) {
        this.httpCode = i10;
    }

    /* renamed from: h */
    public final int m42048h() {
        return this.httpCode;
    }
}
