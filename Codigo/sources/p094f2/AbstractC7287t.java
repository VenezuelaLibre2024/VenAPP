package p094f2;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.C1521a;
import androidx.work.impl.C1553e0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: f2.t */
/* loaded from: classes.dex */
public abstract class AbstractC7287t {
    /* renamed from: e */
    public static AbstractC7287t m21795e(Context context) {
        return C1553e0.m8677m(context);
    }

    /* renamed from: g */
    public static void m21796g(Context context, C1521a c1521a) {
        C1553e0.m8675g(context, c1521a);
    }

    /* renamed from: a */
    public abstract InterfaceC7280m mo8680a(String str);

    /* renamed from: b */
    public abstract InterfaceC7280m mo8681b(UUID uuid);

    /* renamed from: c */
    public final InterfaceC7280m m21797c(AbstractC7288u abstractC7288u) {
        return mo8682d(Collections.singletonList(abstractC7288u));
    }

    /* renamed from: d */
    public abstract InterfaceC7280m mo8682d(List<? extends AbstractC7288u> list);

    /* renamed from: f */
    public abstract LiveData<List<C7286s>> mo8683f(String str);

    /* renamed from: h */
    public abstract InterfaceC7280m mo8684h();
}
