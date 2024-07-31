package p354t;

import android.util.Size;
import androidx.camera.core.impl.utils.C0675d;
import java.util.ArrayList;
import java.util.Comparator;
import p342s.C10735d0;
import p342s.C10750l;

/* renamed from: t.s */
/* loaded from: classes.dex */
public class C10954s {

    /* renamed from: b */
    private static final Size f27853b = new Size(320, 240);

    /* renamed from: c */
    private static final Comparator<Size> f27854c = new C0675d();

    /* renamed from: a */
    private final C10735d0 f27855a = (C10735d0) C10750l.m32699a(C10735d0.class);

    /* renamed from: a */
    public Size[] m33435a(Size[] sizeArr) {
        if (this.f27855a == null || !C10735d0.m32678a()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f27854c.compare(size, f27853b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
