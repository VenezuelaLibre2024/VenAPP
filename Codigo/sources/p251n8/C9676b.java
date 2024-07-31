package p251n8;

import android.text.TextUtils;
import com.google.common.collect.AbstractC5855a0;
import java.util.regex.Pattern;
import p082eb.C7147c;

/* renamed from: n8.b */
/* loaded from: classes.dex */
final class C9676b {

    /* renamed from: d */
    private static final Pattern f23769d = Pattern.compile("\\s+");

    /* renamed from: e */
    private static final AbstractC5855a0<String> f23770e = AbstractC5855a0.m14716x("auto", "none");

    /* renamed from: f */
    private static final AbstractC5855a0<String> f23771f = AbstractC5855a0.m14717y("dot", "sesame", "circle");

    /* renamed from: g */
    private static final AbstractC5855a0<String> f23772g = AbstractC5855a0.m14716x("filled", "open");

    /* renamed from: h */
    private static final AbstractC5855a0<String> f23773h = AbstractC5855a0.m14717y("after", "before", "outside");

    /* renamed from: a */
    public final int f23774a;

    /* renamed from: b */
    public final int f23775b;

    /* renamed from: c */
    public final int f23776c;

    private C9676b(int i10, int i11, int i12) {
        this.f23774a = i10;
        this.f23775b = i11;
        this.f23776c = i12;
    }

    /* renamed from: a */
    public static C9676b m28986a(String str) {
        if (str == null) {
            return null;
        }
        String m21253e = C7147c.m21253e(str.trim());
        if (m21253e.isEmpty()) {
            return null;
        }
        return m28987b(AbstractC5855a0.m14713s(TextUtils.split(m21253e, f23769d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9.equals("auto") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fe, code lost:
    
        if (r9.equals("dot") == false) goto L80;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p251n8.C9676b m28987b(com.google.common.collect.AbstractC5855a0<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n8.C9676b.m28987b(com.google.common.collect.a0):n8.b");
    }
}
