package p355t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: t0.k */
/* loaded from: classes.dex */
public final class C10971k {

    /* renamed from: a */
    private final c f27874a;

    /* renamed from: t0.k$a */
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a */
        final InputContentInfo f27875a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f27875a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.f27875a = (InputContentInfo) obj;
        }

        @Override // p355t0.C10971k.c
        /* renamed from: a */
        public Object mo33478a() {
            return this.f27875a;
        }

        @Override // p355t0.C10971k.c
        /* renamed from: b */
        public Uri mo33479b() {
            Uri contentUri;
            contentUri = this.f27875a.getContentUri();
            return contentUri;
        }

        @Override // p355t0.C10971k.c
        /* renamed from: c */
        public void mo33480c() {
            this.f27875a.requestPermission();
        }

        @Override // p355t0.C10971k.c
        /* renamed from: d */
        public Uri mo33481d() {
            Uri linkUri;
            linkUri = this.f27875a.getLinkUri();
            return linkUri;
        }

        @Override // p355t0.C10971k.c
        public ClipDescription getDescription() {
            ClipDescription description;
            description = this.f27875a.getDescription();
            return description;
        }
    }

    /* renamed from: t0.k$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final Uri f27876a;

        /* renamed from: b */
        private final ClipDescription f27877b;

        /* renamed from: c */
        private final Uri f27878c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f27876a = uri;
            this.f27877b = clipDescription;
            this.f27878c = uri2;
        }

        @Override // p355t0.C10971k.c
        /* renamed from: a */
        public Object mo33478a() {
            return null;
        }

        @Override // p355t0.C10971k.c
        /* renamed from: b */
        public Uri mo33479b() {
            return this.f27876a;
        }

        @Override // p355t0.C10971k.c
        /* renamed from: c */
        public void mo33480c() {
        }

        @Override // p355t0.C10971k.c
        /* renamed from: d */
        public Uri mo33481d() {
            return this.f27878c;
        }

        @Override // p355t0.C10971k.c
        public ClipDescription getDescription() {
            return this.f27877b;
        }
    }

    /* renamed from: t0.k$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: a */
        Object mo33478a();

        /* renamed from: b */
        Uri mo33479b();

        /* renamed from: c */
        void mo33480c();

        /* renamed from: d */
        Uri mo33481d();

        ClipDescription getDescription();
    }

    public C10971k(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f27874a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private C10971k(c cVar) {
        this.f27874a = cVar;
    }

    /* renamed from: f */
    public static C10971k m33472f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C10971k(new a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m33473a() {
        return this.f27874a.mo33479b();
    }

    /* renamed from: b */
    public ClipDescription m33474b() {
        return this.f27874a.getDescription();
    }

    /* renamed from: c */
    public Uri m33475c() {
        return this.f27874a.mo33481d();
    }

    /* renamed from: d */
    public void m33476d() {
        this.f27874a.mo33480c();
    }

    /* renamed from: e */
    public Object m33477e() {
        return this.f27874a.mo33478a();
    }
}
