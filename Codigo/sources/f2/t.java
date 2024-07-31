package f2;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.e0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class t {
    public static t e(Context context) {
        return e0.m(context);
    }

    public static void g(Context context, androidx.work.a aVar) {
        e0.g(context, aVar);
    }

    public abstract m a(String str);

    public abstract m b(UUID uuid);

    public final m c(u uVar) {
        return d(Collections.singletonList(uVar));
    }

    public abstract m d(List<? extends u> list);

    public abstract LiveData<List<s>> f(String str);

    public abstract m h();
}
