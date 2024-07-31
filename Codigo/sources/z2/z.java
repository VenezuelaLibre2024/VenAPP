package z2;

import java.util.Map;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final m f32310a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32311b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32312c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32313d;

    private z(m mVar, long j10, long j11, boolean z10) {
        this.f32310a = mVar;
        this.f32311b = j10;
        this.f32312c = j11;
        this.f32313d = z10;
    }

    public static z e(Map<String, Object> map) {
        if (map == null) {
            return new z(m.best, 0L, 5000L, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        m mVar = m.best;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                mVar = m.lowest;
            } else if (intValue == 1) {
                mVar = m.low;
            } else if (intValue == 2) {
                mVar = m.medium;
            } else if (intValue == 3) {
                mVar = m.high;
            } else if (intValue == 5) {
                mVar = m.bestForNavigation;
            }
        }
        return new z(mVar, num2 != null ? num2.intValue() : 0L, num3 != null ? num3.intValue() : 5000L, bool != null && bool.booleanValue());
    }

    public m a() {
        return this.f32310a;
    }

    public long b() {
        return this.f32311b;
    }

    public long c() {
        return this.f32312c;
    }

    public boolean d() {
        return this.f32313d;
    }
}
