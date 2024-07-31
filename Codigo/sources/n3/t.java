package n3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import n3.o;

/* loaded from: classes.dex */
public class t<Data> implements o<Integer, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f21773a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f21774b;

    /* loaded from: classes.dex */
    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f21775a;

        public a(Resources resources) {
            this.f21775a = resources;
        }

        @Override // n3.p
        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new t(this.f21775a, sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements p<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f21776a;

        public b(Resources resources) {
            this.f21776a = resources;
        }

        @Override // n3.p
        public o<Integer, InputStream> d(s sVar) {
            return new t(this.f21776a, sVar.d(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements p<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f21777a;

        public c(Resources resources) {
            this.f21777a = resources;
        }

        @Override // n3.p
        public o<Integer, Uri> d(s sVar) {
            return new t(this.f21777a, x.c());
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f21774b = resources;
        this.f21773a = oVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f21774b.getResourcePackageName(num.intValue()) + '/' + this.f21774b.getResourceTypeName(num.intValue()) + '/' + this.f21774b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Integer num, int i10, int i11, h3.h hVar) {
        Uri d10 = d(num);
        if (d10 == null) {
            return null;
        }
        return this.f21773a.b(d10, i10, i11, hVar);
    }

    @Override // n3.o
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }
}
