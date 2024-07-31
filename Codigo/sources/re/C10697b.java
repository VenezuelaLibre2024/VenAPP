package re;

/* renamed from: re.b */
/* loaded from: classes.dex */
public final class C10697b {
    /* renamed from: a */
    public static String m32576a(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", m32579d(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    /* renamed from: b */
    public static String m32577b(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", m32579d(str, str2), "perf-android-sdk", "android-ide");
    }

    /* renamed from: c */
    public static String m32578c(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", m32579d(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    /* renamed from: d */
    private static String m32579d(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }
}
