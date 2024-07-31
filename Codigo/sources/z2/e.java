package z2;

import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f32274a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32275b;

    /* renamed from: c, reason: collision with root package name */
    private final a f32276c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32277d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32278e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f32279f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f32280g;

    private e(String str, String str2, a aVar, boolean z10, boolean z11, boolean z12, Integer num) {
        this.f32274a = str;
        this.f32275b = str2;
        this.f32276c = aVar;
        this.f32277d = z10;
        this.f32278e = z11;
        this.f32279f = z12;
        this.f32280g = num;
    }

    public static e h(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        a c10 = a.c((Map) map.get("notificationIcon"));
        String str = (String) map.get("notificationTitle");
        String str2 = (String) map.get("notificationText");
        Boolean bool = (Boolean) map.get("enableWifiLock");
        Boolean bool2 = (Boolean) map.get("enableWakeLock");
        Boolean bool3 = (Boolean) map.get("setOngoing");
        Object obj = map.get("color");
        return new e(str, str2, c10, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), obj != null ? Integer.valueOf(((Number) obj).intValue()) : null);
    }

    public Integer a() {
        return this.f32280g;
    }

    public a b() {
        return this.f32276c;
    }

    public String c() {
        return this.f32275b;
    }

    public String d() {
        return this.f32274a;
    }

    public boolean e() {
        return this.f32278e;
    }

    public boolean f() {
        return this.f32277d;
    }

    public boolean g() {
        return this.f32279f;
    }
}
