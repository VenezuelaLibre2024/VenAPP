package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.w;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements y1.a<k> {
    @Override // y1.a
    public List<Class<? extends y1.a<?>>> a() {
        List<Class<? extends y1.a<?>>> j10;
        j10 = dk.r.j();
        return j10;
    }

    @Override // y1.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k create(Context context) {
        kotlin.jvm.internal.n.e(context, "context");
        androidx.startup.a e10 = androidx.startup.a.e(context);
        kotlin.jvm.internal.n.d(e10, "getInstance(context)");
        if (!e10.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        h.a(context);
        w.b bVar = w.f4971t;
        bVar.b(context);
        return bVar.a();
    }
}
