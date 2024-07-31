package p246n3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.File;
import java.io.FileNotFoundException;
import p022b4.C1656d;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p151i3.C7783b;
import p246n3.InterfaceC9649o;

/* renamed from: n3.l */
/* loaded from: classes.dex */
public final class C9646l implements InterfaceC9649o<Uri, File> {

    /* renamed from: a */
    private final Context f23670a;

    /* renamed from: n3.l$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC9650p<Uri, File> {

        /* renamed from: a */
        private final Context f23671a;

        public a(Context context) {
            this.f23671a = context;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, File> mo28852d(C9653s c9653s) {
            return new C9646l(this.f23671a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.l$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC2133d<File> {

        /* renamed from: c */
        private static final String[] f23672c = {"_data"};

        /* renamed from: a */
        private final Context f23673a;

        /* renamed from: b */
        private final Uri f23674b;

        b(Context context, Uri uri) {
            this.f23673a = context;
            this.f23674b = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: a */
        public Class<File> mo10760a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: b */
        public void mo10765b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: d */
        public EnumC7617a mo10767d() {
            return EnumC7617a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: e */
        public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super File> aVar) {
            Cursor query = this.f23673a.getContentResolver().query(this.f23674b, f23672c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.mo10774f(new File(r0));
                return;
            }
            aVar.mo10773c(new FileNotFoundException("Failed to find file path for: " + this.f23674b));
        }
    }

    public C9646l(Context context) {
        this.f23670a = context;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<File> mo28848b(Uri uri, int i10, int i11, C7624h c7624h) {
        return new InterfaceC9649o.a<>(new C1656d(uri), new b(this.f23670a, uri));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Uri uri) {
        return C7783b.m23744b(uri);
    }
}
