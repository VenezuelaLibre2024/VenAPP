package n3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import n3.o;

/* loaded from: classes.dex */
public class w<Data> implements o<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f21783a;

    /* loaded from: classes.dex */
    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // n3.p
        public o<String, AssetFileDescriptor> d(s sVar) {
            return new w(sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // n3.p
        public o<String, ParcelFileDescriptor> d(s sVar) {
            return new w(sVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements p<String, InputStream> {
        @Override // n3.p
        public o<String, InputStream> d(s sVar) {
            return new w(sVar.d(Uri.class, InputStream.class));
        }
    }

    public w(o<Uri, Data> oVar) {
        this.f21783a = oVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return f(str);
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(String str, int i10, int i11, h3.h hVar) {
        Uri e10 = e(str);
        if (e10 == null || !this.f21783a.a(e10)) {
            return null;
        }
        return this.f21783a.b(e10, i10, i11, hVar);
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String str) {
        return true;
    }
}
