package w5;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ String c(e eVar, int i10, ArrayList arrayList, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeWhere");
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return eVar.b(i10, arrayList, z10);
    }

    public abstract boolean a();

    public abstract String b(int i10, ArrayList<String> arrayList, boolean z10);

    public abstract String d();
}
