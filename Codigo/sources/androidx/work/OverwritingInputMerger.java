package androidx.work;

import androidx.work.b;
import f2.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends g {
    @Override // f2.g
    public b b(List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().j());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
