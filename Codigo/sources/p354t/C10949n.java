package p354t;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p342s.C10750l;
import p342s.C10754p;
import p407w.C12029o0;

/* renamed from: t.n */
/* loaded from: classes.dex */
public class C10949n {

    /* renamed from: a */
    private final String f27845a;

    /* renamed from: b */
    private final C10754p f27846b = (C10754p) C10750l.m32699a(C10754p.class);

    /* renamed from: c */
    private final C10940e f27847c;

    public C10949n(String str) {
        this.f27845a = str;
        this.f27847c = new C10940e(str);
    }

    /* renamed from: a */
    private void m33425a(List<Size> list, int i10) {
        C10754p c10754p = this.f27846b;
        if (c10754p == null) {
            return;
        }
        Size[] m32720a = c10754p.m32720a(i10);
        if (m32720a.length > 0) {
            list.addAll(Arrays.asList(m32720a));
        }
    }

    /* renamed from: c */
    private void m33426c(List<Size> list, int i10) {
        List<Size> m33412a = this.f27847c.m33412a(i10);
        if (m33412a.isEmpty()) {
            return;
        }
        list.removeAll(m33412a);
    }

    /* renamed from: b */
    public Size[] m33427b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        m33425a(arrayList, i10);
        m33426c(arrayList, i10);
        if (arrayList.isEmpty()) {
            C12029o0.m38648k("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
