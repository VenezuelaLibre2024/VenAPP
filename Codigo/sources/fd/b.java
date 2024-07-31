package fd;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import fd.a;
import zb.g;

/* loaded from: classes.dex */
public abstract class b {
    public static synchronized b d() {
        b e10;
        synchronized (b.class) {
            e10 = e(g.o());
        }
        return e10;
    }

    public static synchronized b e(g gVar) {
        b bVar;
        synchronized (b.class) {
            bVar = (b) gVar.k(b.class);
        }
        return bVar;
    }

    public abstract a.c a();

    public abstract Task<c> b(Intent intent);

    public abstract Task<c> c(Uri uri);
}
