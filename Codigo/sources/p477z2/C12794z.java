package p477z2;

import java.util.Map;

/* renamed from: z2.z */
/* loaded from: classes.dex */
public class C12794z {

    /* renamed from: a */
    private final EnumC12781m f34861a;

    /* renamed from: b */
    private final long f34862b;

    /* renamed from: c */
    private final long f34863c;

    /* renamed from: d */
    private final boolean f34864d;

    private C12794z(EnumC12781m enumC12781m, long j10, long j11, boolean z10) {
        this.f34861a = enumC12781m;
        this.f34862b = j10;
        this.f34863c = j11;
        this.f34864d = z10;
    }

    /* renamed from: e */
    public static C12794z m42426e(Map<String, Object> map) {
        if (map == null) {
            return new C12794z(EnumC12781m.best, 0L, 5000L, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        EnumC12781m enumC12781m = EnumC12781m.best;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                enumC12781m = EnumC12781m.lowest;
            } else if (intValue == 1) {
                enumC12781m = EnumC12781m.low;
            } else if (intValue == 2) {
                enumC12781m = EnumC12781m.medium;
            } else if (intValue == 3) {
                enumC12781m = EnumC12781m.high;
            } else if (intValue == 5) {
                enumC12781m = EnumC12781m.bestForNavigation;
            }
        }
        return new C12794z(enumC12781m, num2 != null ? num2.intValue() : 0L, num3 != null ? num3.intValue() : 5000L, bool != null && bool.booleanValue());
    }

    /* renamed from: a */
    public EnumC12781m m42427a() {
        return this.f34861a;
    }

    /* renamed from: b */
    public long m42428b() {
        return this.f34862b;
    }

    /* renamed from: c */
    public long m42429c() {
        return this.f34863c;
    }

    /* renamed from: d */
    public boolean m42430d() {
        return this.f34864d;
    }
}
