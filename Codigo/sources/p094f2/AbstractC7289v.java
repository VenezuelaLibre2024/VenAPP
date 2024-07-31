package p094f2;

import android.content.Context;
import androidx.work.AbstractC1523c;
import androidx.work.WorkerParameters;

/* renamed from: f2.v */
/* loaded from: classes.dex */
public abstract class AbstractC7289v {

    /* renamed from: a */
    private static final String f16334a = AbstractC7277j.m21769i("WorkerFactory");

    /* renamed from: f2.v$a */
    /* loaded from: classes.dex */
    class a extends AbstractC7289v {
        a() {
        }

        @Override // p094f2.AbstractC7289v
        /* renamed from: a */
        public AbstractC1523c mo21813a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static AbstractC7289v m21812c() {
        return new a();
    }

    /* renamed from: a */
    public abstract AbstractC1523c mo21813a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final AbstractC1523c m21814b(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        AbstractC1523c mo21813a = mo21813a(context, str, workerParameters);
        if (mo21813a == null) {
            try {
                cls = Class.forName(str).asSubclass(AbstractC1523c.class);
            } catch (Throwable th2) {
                AbstractC7277j.m21767e().mo21773d(f16334a, "Invalid class: " + str, th2);
                cls = null;
            }
            if (cls != null) {
                try {
                    mo21813a = (AbstractC1523c) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th3) {
                    AbstractC7277j.m21767e().mo21773d(f16334a, "Could not instantiate " + str, th3);
                }
            }
        }
        if (mo21813a == null || !mo21813a.isUsed()) {
            return mo21813a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
