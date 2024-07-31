package o3;

import android.content.Context;
import android.net.Uri;
import h3.h;
import java.io.InputStream;
import n3.o;
import n3.p;
import n3.s;

/* loaded from: classes.dex */
public class b implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22157a;

    /* loaded from: classes.dex */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f22158a;

        public a(Context context) {
            this.f22158a = context;
        }

        @Override // n3.p
        public o<Uri, InputStream> d(s sVar) {
            return new b(this.f22158a);
        }
    }

    public b(Context context) {
        this.f22157a = context.getApplicationContext();
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(Uri uri, int i10, int i11, h hVar) {
        if (i3.b.d(i10, i11)) {
            return new o.a<>(new b4.d(uri), i3.c.f(this.f22157a, uri));
        }
        return null;
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return i3.b.a(uri);
    }
}
