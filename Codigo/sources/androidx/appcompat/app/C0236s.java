package androidx.appcompat.app;

import androidx.core.os.C0949h;
import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: androidx.appcompat.app.s */
/* loaded from: classes.dex */
final class C0236s {
    /* renamed from: a */
    private static C0949h m1112a(C0949h c0949h, C0949h c0949h2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < c0949h.m4723g() + c0949h2.m4723g()) {
            Locale m4721c = i10 < c0949h.m4723g() ? c0949h.m4721c(i10) : c0949h2.m4721c(i10 - c0949h.m4723g());
            if (m4721c != null) {
                linkedHashSet.add(m4721c);
            }
            i10++;
        }
        return C0949h.m4716a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0949h m1113b(C0949h c0949h, C0949h c0949h2) {
        return (c0949h == null || c0949h.m4722f()) ? C0949h.m4719e() : m1112a(c0949h, c0949h2);
    }
}
