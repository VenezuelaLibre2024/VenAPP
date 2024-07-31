package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
final class s {
    private static androidx.core.os.h a(androidx.core.os.h hVar, androidx.core.os.h hVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < hVar.g() + hVar2.g()) {
            Locale c10 = i10 < hVar.g() ? hVar.c(i10) : hVar2.c(i10 - hVar.g());
            if (c10 != null) {
                linkedHashSet.add(c10);
            }
            i10++;
        }
        return androidx.core.os.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.core.os.h b(androidx.core.os.h hVar, androidx.core.os.h hVar2) {
        return (hVar == null || hVar.f()) ? androidx.core.os.h.e() : a(hVar, hVar2);
    }
}
