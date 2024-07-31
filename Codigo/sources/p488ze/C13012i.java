package p488ze;

import p485zb.C12873m;

/* renamed from: ze.i */
/* loaded from: classes2.dex */
public class C13012i extends C12873m {

    /* renamed from: a */
    private final a f35346a;

    /* renamed from: ze.i$a */
    /* loaded from: classes2.dex */
    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        a(int i10) {
            this.value = i10;
        }
    }

    public C13012i(String str) {
        super(str);
        this.f35346a = a.UNKNOWN;
    }

    public C13012i(String str, Throwable th2) {
        super(str, th2);
        this.f35346a = a.UNKNOWN;
    }

    public C13012i(String str, Throwable th2, a aVar) {
        super(str, th2);
        this.f35346a = aVar;
    }

    public C13012i(String str, a aVar) {
        super(str);
        this.f35346a = aVar;
    }
}
