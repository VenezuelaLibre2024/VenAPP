package yg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, Integer> f31846a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] a() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry<Integer, Integer> entry : this.f31846a.entrySet()) {
            if (entry.getValue().intValue() > i10) {
                i10 = entry.getValue().intValue();
                arrayList.clear();
            } else if (entry.getValue().intValue() == i10) {
            }
            arrayList.add(entry.getKey());
        }
        return xg.a.b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i10) {
        Integer num = this.f31846a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f31846a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
