package p477z2;

import java.util.Map;

/* renamed from: z2.e */
/* loaded from: classes.dex */
public class C12771e {

    /* renamed from: a */
    private final String f34825a;

    /* renamed from: b */
    private final String f34826b;

    /* renamed from: c */
    private final C12763a f34827c;

    /* renamed from: d */
    private final boolean f34828d;

    /* renamed from: e */
    private final boolean f34829e;

    /* renamed from: f */
    private final boolean f34830f;

    /* renamed from: g */
    private final Integer f34831g;

    private C12771e(String str, String str2, C12763a c12763a, boolean z10, boolean z11, boolean z12, Integer num) {
        this.f34825a = str;
        this.f34826b = str2;
        this.f34827c = c12763a;
        this.f34828d = z10;
        this.f34829e = z11;
        this.f34830f = z12;
        this.f34831g = num;
    }

    /* renamed from: h */
    public static C12771e m42371h(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        C12763a m42354c = C12763a.m42354c((Map) map.get("notificationIcon"));
        String str = (String) map.get("notificationTitle");
        String str2 = (String) map.get("notificationText");
        Boolean bool = (Boolean) map.get("enableWifiLock");
        Boolean bool2 = (Boolean) map.get("enableWakeLock");
        Boolean bool3 = (Boolean) map.get("setOngoing");
        Object obj = map.get("color");
        return new C12771e(str, str2, m42354c, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), obj != null ? Integer.valueOf(((Number) obj).intValue()) : null);
    }

    /* renamed from: a */
    public Integer m42372a() {
        return this.f34831g;
    }

    /* renamed from: b */
    public C12763a m42373b() {
        return this.f34827c;
    }

    /* renamed from: c */
    public String m42374c() {
        return this.f34826b;
    }

    /* renamed from: d */
    public String m42375d() {
        return this.f34825a;
    }

    /* renamed from: e */
    public boolean m42376e() {
        return this.f34829e;
    }

    /* renamed from: f */
    public boolean m42377f() {
        return this.f34828d;
    }

    /* renamed from: g */
    public boolean m42378g() {
        return this.f34830f;
    }
}
