package t;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w.o0;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final String f25701a;

    /* renamed from: b, reason: collision with root package name */
    private final s.p f25702b = (s.p) s.l.a(s.p.class);

    /* renamed from: c, reason: collision with root package name */
    private final e f25703c;

    public n(String str) {
        this.f25701a = str;
        this.f25703c = new e(str);
    }

    private void a(List<Size> list, int i10) {
        s.p pVar = this.f25702b;
        if (pVar == null) {
            return;
        }
        Size[] a10 = pVar.a(i10);
        if (a10.length > 0) {
            list.addAll(Arrays.asList(a10));
        }
    }

    private void c(List<Size> list, int i10) {
        List<Size> a10 = this.f25703c.a(i10);
        if (a10.isEmpty()) {
            return;
        }
        list.removeAll(a10);
    }

    public Size[] b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i10);
        c(arrayList, i10);
        if (arrayList.isEmpty()) {
            o0.k("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
