package p246n3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C2130a;
import com.bumptech.glide.load.data.C2138i;
import com.bumptech.glide.load.data.C2143n;
import com.bumptech.glide.load.data.InterfaceC2133d;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p022b4.C1656d;
import p129h3.C7624h;
import p246n3.InterfaceC9649o;

/* renamed from: n3.y */
/* loaded from: classes.dex */
public class C9659y<Data> implements InterfaceC9649o<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f23720b = Collections.unmodifiableSet(new HashSet(Arrays.asList(Constants.FILE, "content", "android.resource")));

    /* renamed from: a */
    private final c<Data> f23721a;

    /* renamed from: n3.y$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC9650p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f23722a;

        public a(ContentResolver contentResolver) {
            this.f23722a = contentResolver;
        }

        @Override // p246n3.C9659y.c
        /* renamed from: a */
        public InterfaceC2133d<AssetFileDescriptor> mo28953a(Uri uri) {
            return new C2130a(this.f23722a, uri);
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, AssetFileDescriptor> mo28852d(C9653s c9653s) {
            return new C9659y(this);
        }
    }

    /* renamed from: n3.y$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC9650p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f23723a;

        public b(ContentResolver contentResolver) {
            this.f23723a = contentResolver;
        }

        @Override // p246n3.C9659y.c
        /* renamed from: a */
        public InterfaceC2133d<ParcelFileDescriptor> mo28953a(Uri uri) {
            return new C2138i(this.f23723a, uri);
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, ParcelFileDescriptor> mo28852d(C9653s c9653s) {
            return new C9659y(this);
        }
    }

    /* renamed from: n3.y$c */
    /* loaded from: classes.dex */
    public interface c<Data> {
        /* renamed from: a */
        InterfaceC2133d<Data> mo28953a(Uri uri);
    }

    /* renamed from: n3.y$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC9650p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f23724a;

        public d(ContentResolver contentResolver) {
            this.f23724a = contentResolver;
        }

        @Override // p246n3.C9659y.c
        /* renamed from: a */
        public InterfaceC2133d<InputStream> mo28953a(Uri uri) {
            return new C2143n(this.f23724a, uri);
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, InputStream> mo28852d(C9653s c9653s) {
            return new C9659y(this);
        }
    }

    public C9659y(c<Data> cVar) {
        this.f23721a = cVar;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<Data> mo28848b(Uri uri, int i10, int i11, C7624h c7624h) {
        return new InterfaceC9649o.a<>(new C1656d(uri), this.f23721a.mo28953a(uri));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Uri uri) {
        return f23720b.contains(uri.getScheme());
    }
}
