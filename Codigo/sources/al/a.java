package al;

import android.os.Looper;
import el.v;
import java.util.List;
import zk.h2;

/* loaded from: classes3.dex */
public final class a implements v {
    @Override // el.v
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // el.v
    public h2 b(List<? extends v> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new d(f.a(mainLooper, true), null, 2, 0 == true ? 1 : 0);
    }

    @Override // el.v
    public int c() {
        return 1073741823;
    }
}
