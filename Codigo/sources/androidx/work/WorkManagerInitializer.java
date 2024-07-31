package androidx.work;

import android.content.Context;
import androidx.work.a;
import f2.j;
import f2.t;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements y1.a<t> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5663a = j.i("WrkMgrInitializer");

    @Override // y1.a
    public List<Class<? extends y1.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // y1.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t create(Context context) {
        j.e().a(f5663a, "Initializing WorkManager with default configuration.");
        t.g(context, new a.b().a());
        return t.e(context);
    }
}
