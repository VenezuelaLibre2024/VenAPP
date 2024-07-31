package t;

import android.util.Size;
import java.util.ArrayList;
import java.util.Comparator;
import s.d0;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    private static final Size f25709b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator<Size> f25710c = new androidx.camera.core.impl.utils.d();

    /* renamed from: a, reason: collision with root package name */
    private final d0 f25711a = (d0) s.l.a(d0.class);

    public Size[] a(Size[] sizeArr) {
        if (this.f25711a == null || !d0.a()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f25710c.compare(size, f25709b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
