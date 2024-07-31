package p468yg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p446xg.C12483a;

/* renamed from: yg.b */
/* loaded from: classes2.dex */
final class C12686b {

    /* renamed from: a */
    private final Map<Integer, Integer> f34382a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] m41748a() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry<Integer, Integer> entry : this.f34382a.entrySet()) {
            if (entry.getValue().intValue() > i10) {
                i10 = entry.getValue().intValue();
                arrayList.clear();
            } else if (entry.getValue().intValue() == i10) {
            }
            arrayList.add(entry.getKey());
        }
        return C12483a.m40819b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m41749b(int i10) {
        Integer num = this.f34382a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f34382a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
