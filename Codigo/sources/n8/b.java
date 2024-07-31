package n8;

import android.text.TextUtils;
import com.google.common.collect.a0;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f21836d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    private static final a0<String> f21837e = a0.x("auto", "none");

    /* renamed from: f, reason: collision with root package name */
    private static final a0<String> f21838f = a0.y("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final a0<String> f21839g = a0.x("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    private static final a0<String> f21840h = a0.y("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f21841a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21842b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21843c;

    private b(int i10, int i11, int i12) {
        this.f21841a = i10;
        this.f21842b = i11;
        this.f21843c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String e10 = eb.c.e(str.trim());
        if (e10.isEmpty()) {
            return null;
        }
        return b(a0.s(TextUtils.split(e10, f21836d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9.equals("auto") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fe, code lost:
    
        if (r9.equals("dot") == false) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static n8.b b(com.google.common.collect.a0<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.b.b(com.google.common.collect.a0):n8.b");
    }
}
