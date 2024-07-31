package u3;

import android.util.Log;
import h3.k;
import j3.v;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class d implements k<c> {
    @Override // h3.k
    public h3.c a(h3.h hVar) {
        return h3.c.SOURCE;
    }

    @Override // h3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(v<c> vVar, File file, h3.h hVar) {
        try {
            c4.a.f(vVar.get().c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
