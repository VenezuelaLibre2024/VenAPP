package o3;

import android.content.Context;
import android.net.Uri;
import h3.h;
import java.io.InputStream;
import n3.o;
import n3.p;
import n3.s;
import q3.g0;

/* loaded from: classes.dex */
public class c implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22159a;

    /* loaded from: classes.dex */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f22160a;

        public a(Context context) {
            this.f22160a = context;
        }

        @Override // n3.p
        public o<Uri, InputStream> d(s sVar) {
            return new c(this.f22160a);
        }
    }

    public c(Context context) {
        this.f22159a = context.getApplicationContext();
    }

    private boolean e(h hVar) {
        Long l10 = (Long) hVar.c(g0.f23429d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(Uri uri, int i10, int i11, h hVar) {
        if (i3.b.d(i10, i11) && e(hVar)) {
            return new o.a<>(new b4.d(uri), i3.c.g(this.f22159a, uri));
        }
        return null;
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return i3.b.c(uri);
    }
}
