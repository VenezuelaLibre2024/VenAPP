package y6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l7.a;
import t8.r0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f31787c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f31788a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f31789b = -1;

    private boolean b(String str) {
        Matcher matcher = f31787c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) r0.j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) r0.j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f31788a = parseInt;
            this.f31789b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f31788a == -1 || this.f31789b == -1) ? false : true;
    }

    public boolean c(l7.a aVar) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof q7.e) {
                q7.e eVar = (q7.e) d10;
                if ("iTunSMPB".equals(eVar.f23572c) && b(eVar.f23573d)) {
                    return true;
                }
            } else if (d10 instanceof q7.j) {
                q7.j jVar = (q7.j) d10;
                if ("com.apple.iTunes".equals(jVar.f23584b) && "iTunSMPB".equals(jVar.f23585c) && b(jVar.f23586d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f31788a = i11;
        this.f31789b = i12;
        return true;
    }
}
