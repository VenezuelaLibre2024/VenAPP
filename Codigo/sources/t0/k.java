package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final c f25730a;

    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f25731a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f25731a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.f25731a = (InputContentInfo) obj;
        }

        @Override // t0.k.c
        public Object a() {
            return this.f25731a;
        }

        @Override // t0.k.c
        public Uri b() {
            Uri contentUri;
            contentUri = this.f25731a.getContentUri();
            return contentUri;
        }

        @Override // t0.k.c
        public void c() {
            this.f25731a.requestPermission();
        }

        @Override // t0.k.c
        public Uri d() {
            Uri linkUri;
            linkUri = this.f25731a.getLinkUri();
            return linkUri;
        }

        @Override // t0.k.c
        public ClipDescription getDescription() {
            ClipDescription description;
            description = this.f25731a.getDescription();
            return description;
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f25732a;

        /* renamed from: b, reason: collision with root package name */
        private final ClipDescription f25733b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f25734c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f25732a = uri;
            this.f25733b = clipDescription;
            this.f25734c = uri2;
        }

        @Override // t0.k.c
        public Object a() {
            return null;
        }

        @Override // t0.k.c
        public Uri b() {
            return this.f25732a;
        }

        @Override // t0.k.c
        public void c() {
        }

        @Override // t0.k.c
        public Uri d() {
            return this.f25734c;
        }

        @Override // t0.k.c
        public ClipDescription getDescription() {
            return this.f25733b;
        }
    }

    /* loaded from: classes.dex */
    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public k(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f25730a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private k(c cVar) {
        this.f25730a = cVar;
    }

    public static k f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new k(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f25730a.b();
    }

    public ClipDescription b() {
        return this.f25730a.getDescription();
    }

    public Uri c() {
        return this.f25730a.d();
    }

    public void d() {
        this.f25730a.c();
    }

    public Object e() {
        return this.f25730a.a();
    }
}
