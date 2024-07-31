package y1;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public interface a<T> {
    List<Class<? extends a<?>>> a();

    T create(Context context);
}
