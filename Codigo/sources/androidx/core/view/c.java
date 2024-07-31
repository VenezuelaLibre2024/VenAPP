package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final f f3919a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0054c f3920a;

        public a(ClipData clipData, int i10) {
            this.f3920a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i10) : new d(clipData, i10);
        }

        public c a() {
            return this.f3920a.build();
        }

        public a b(Bundle bundle) {
            this.f3920a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f3920a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f3920a.a(uri);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements InterfaceC0054c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f3921a;

        b(ClipData clipData, int i10) {
            this.f3921a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // androidx.core.view.c.InterfaceC0054c
        public void a(Uri uri) {
            this.f3921a.setLinkUri(uri);
        }

        @Override // androidx.core.view.c.InterfaceC0054c
        public void b(int i10) {
            this.f3921a.setFlags(i10);
        }

        @Override // androidx.core.view.c.InterfaceC0054c
        public c build() {
            ContentInfo build;
            build = this.f3921a.build();
            return new c(new e(build));
        }

        @Override // androidx.core.view.c.InterfaceC0054c
        public void setExtras(Bundle bundle) {
            this.f3921a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private interface InterfaceC0054c {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    /* loaded from: classes.dex */
    private static final class d implements InterfaceC0054c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f3922a;

        /* renamed from: b, reason: collision with root package name */
        int f3923b;

        /* renamed from: c, reason: collision with root package name */
        int f3924c;

        /* renamed from: d, reason: collision with root package name */
        Uri f3925d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f3926e;

        d(ClipData clipData, int i10) {
            this.f3922a = clipData;
            this.f3923b = i10;
        }

        @Override // androidx.core.view.c.InterfaceC0054c
        public void a(Uri uri) {
            this.f3925d = uri;
        }

        @Override // androidx.core.view.c.InterfaceC0054c
        public void b(int i10) {
            this.f3924c = i10;
        }

        @Override // androidx.core.view.c.InterfaceC0054c
        public c build() {
            return new c(new g(this));
        }

        @Override // androidx.core.view.c.InterfaceC0054c
        public void setExtras(Bundle bundle) {
            this.f3926e = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f3927a;

        e(ContentInfo contentInfo) {
            this.f3927a = (ContentInfo) androidx.core.util.h.k(contentInfo);
        }

        @Override // androidx.core.view.c.f
        public int a() {
            int source;
            source = this.f3927a.getSource();
            return source;
        }

        @Override // androidx.core.view.c.f
        public ContentInfo b() {
            return this.f3927a;
        }

        @Override // androidx.core.view.c.f
        public ClipData c() {
            ClipData clip;
            clip = this.f3927a.getClip();
            return clip;
        }

        @Override // androidx.core.view.c.f
        public int d() {
            int flags;
            flags = this.f3927a.getFlags();
            return flags;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3927a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f {
        int a();

        ContentInfo b();

        ClipData c();

        int d();
    }

    /* loaded from: classes.dex */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f3928a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3929b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3930c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f3931d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f3932e;

        g(d dVar) {
            this.f3928a = (ClipData) androidx.core.util.h.k(dVar.f3922a);
            this.f3929b = androidx.core.util.h.f(dVar.f3923b, 0, 5, "source");
            this.f3930c = androidx.core.util.h.j(dVar.f3924c, 1);
            this.f3931d = dVar.f3925d;
            this.f3932e = dVar.f3926e;
        }

        @Override // androidx.core.view.c.f
        public int a() {
            return this.f3929b;
        }

        @Override // androidx.core.view.c.f
        public ContentInfo b() {
            return null;
        }

        @Override // androidx.core.view.c.f
        public ClipData c() {
            return this.f3928a;
        }

        @Override // androidx.core.view.c.f
        public int d() {
            return this.f3930c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f3928a.getDescription());
            sb2.append(", source=");
            sb2.append(c.e(this.f3929b));
            sb2.append(", flags=");
            sb2.append(c.a(this.f3930c));
            if (this.f3931d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f3931d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f3932e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    c(f fVar) {
        this.f3919a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f3919a.c();
    }

    public int c() {
        return this.f3919a.d();
    }

    public int d() {
        return this.f3919a.a();
    }

    public ContentInfo f() {
        ContentInfo b10 = this.f3919a.b();
        Objects.requireNonNull(b10);
        return b10;
    }

    public String toString() {
        return this.f3919a.toString();
    }
}
