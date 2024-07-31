package p459y6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p216l7.C9400a;
import p306q7.C10283e;
import p306q7.C10288j;
import p363t8.C11172r0;

/* renamed from: y6.v */
/* loaded from: classes.dex */
public final class C12632v {

    /* renamed from: c */
    private static final Pattern f34323c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f34324a = -1;

    /* renamed from: b */
    public int f34325b = -1;

    /* renamed from: b */
    private boolean m41602b(String str) {
        Matcher matcher = f34323c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) C11172r0.m34928j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) C11172r0.m34928j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f34324a = parseInt;
            this.f34325b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m41603a() {
        return (this.f34324a == -1 || this.f34325b == -1) ? false : true;
    }

    /* renamed from: c */
    public boolean m41604c(C9400a c9400a) {
        for (int i10 = 0; i10 < c9400a.m27999e(); i10++) {
            C9400a.b m27998d = c9400a.m27998d(i10);
            if (m27998d instanceof C10283e) {
                C10283e c10283e = (C10283e) m27998d;
                if ("iTunSMPB".equals(c10283e.f25540c) && m41602b(c10283e.f25541d)) {
                    return true;
                }
            } else if (m27998d instanceof C10288j) {
                C10288j c10288j = (C10288j) m27998d;
                if ("com.apple.iTunes".equals(c10288j.f25552b) && "iTunSMPB".equals(c10288j.f25553c) && m41602b(c10288j.f25554d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m41605d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f34324a = i11;
        this.f34325b = i12;
        return true;
    }
}
