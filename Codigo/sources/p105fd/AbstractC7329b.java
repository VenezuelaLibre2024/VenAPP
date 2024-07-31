package p105fd;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import p105fd.C7328a;
import p485zb.C12867g;

/* renamed from: fd.b */
/* loaded from: classes.dex */
public abstract class AbstractC7329b {
    /* renamed from: d */
    public static synchronized AbstractC7329b m22021d() {
        AbstractC7329b m22022e;
        synchronized (AbstractC7329b.class) {
            m22022e = m22022e(C12867g.m42617o());
        }
        return m22022e;
    }

    /* renamed from: e */
    public static synchronized AbstractC7329b m22022e(C12867g c12867g) {
        AbstractC7329b abstractC7329b;
        synchronized (AbstractC7329b.class) {
            abstractC7329b = (AbstractC7329b) c12867g.m42629k(AbstractC7329b.class);
        }
        return abstractC7329b;
    }

    /* renamed from: a */
    public abstract C7328a.c mo22023a();

    /* renamed from: b */
    public abstract Task<C7330c> mo22024b(Intent intent);

    /* renamed from: c */
    public abstract Task<C7330c> mo22025c(Uri uri);
}
