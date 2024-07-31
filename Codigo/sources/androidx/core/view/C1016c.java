package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.C0984h;
import java.util.Objects;

/* renamed from: androidx.core.view.c */
/* loaded from: classes.dex */
public final class C1016c {

    /* renamed from: a */
    private final f f4611a;

    /* renamed from: androidx.core.view.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final c f4612a;

        public a(ClipData clipData, int i10) {
            this.f4612a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i10) : new d(clipData, i10);
        }

        /* renamed from: a */
        public C1016c m4953a() {
            return this.f4612a.build();
        }

        /* renamed from: b */
        public a m4954b(Bundle bundle) {
            this.f4612a.setExtras(bundle);
            return this;
        }

        /* renamed from: c */
        public a m4955c(int i10) {
            this.f4612a.mo4958b(i10);
            return this;
        }

        /* renamed from: d */
        public a m4956d(Uri uri) {
            this.f4612a.mo4957a(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.c$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final ContentInfo.Builder f4613a;

        b(ClipData clipData, int i10) {
            this.f4613a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // androidx.core.view.C1016c.c
        /* renamed from: a */
        public void mo4957a(Uri uri) {
            this.f4613a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C1016c.c
        /* renamed from: b */
        public void mo4958b(int i10) {
            this.f4613a.setFlags(i10);
        }

        @Override // androidx.core.view.C1016c.c
        public C1016c build() {
            ContentInfo build;
            build = this.f4613a.build();
            return new C1016c(new e(build));
        }

        @Override // androidx.core.view.C1016c.c
        public void setExtras(Bundle bundle) {
            this.f4613a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.c$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: a */
        void mo4957a(Uri uri);

        /* renamed from: b */
        void mo4958b(int i10);

        C1016c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.c$d */
    /* loaded from: classes.dex */
    private static final class d implements c {

        /* renamed from: a */
        ClipData f4614a;

        /* renamed from: b */
        int f4615b;

        /* renamed from: c */
        int f4616c;

        /* renamed from: d */
        Uri f4617d;

        /* renamed from: e */
        Bundle f4618e;

        d(ClipData clipData, int i10) {
            this.f4614a = clipData;
            this.f4615b = i10;
        }

        @Override // androidx.core.view.C1016c.c
        /* renamed from: a */
        public void mo4957a(Uri uri) {
            this.f4617d = uri;
        }

        @Override // androidx.core.view.C1016c.c
        /* renamed from: b */
        public void mo4958b(int i10) {
            this.f4616c = i10;
        }

        @Override // androidx.core.view.C1016c.c
        public C1016c build() {
            return new C1016c(new g(this));
        }

        @Override // androidx.core.view.C1016c.c
        public void setExtras(Bundle bundle) {
            this.f4618e = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.c$e */
    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a */
        private final ContentInfo f4619a;

        e(ContentInfo contentInfo) {
            this.f4619a = (ContentInfo) C0984h.m4833k(contentInfo);
        }

        @Override // androidx.core.view.C1016c.f
        /* renamed from: a */
        public int mo4959a() {
            int source;
            source = this.f4619a.getSource();
            return source;
        }

        @Override // androidx.core.view.C1016c.f
        /* renamed from: b */
        public ContentInfo mo4960b() {
            return this.f4619a;
        }

        @Override // androidx.core.view.C1016c.f
        /* renamed from: c */
        public ClipData mo4961c() {
            ClipData clip;
            clip = this.f4619a.getClip();
            return clip;
        }

        @Override // androidx.core.view.C1016c.f
        /* renamed from: d */
        public int mo4962d() {
            int flags;
            flags = this.f4619a.getFlags();
            return flags;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f4619a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.c$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        int mo4959a();

        /* renamed from: b */
        ContentInfo mo4960b();

        /* renamed from: c */
        ClipData mo4961c();

        /* renamed from: d */
        int mo4962d();
    }

    /* renamed from: androidx.core.view.c$g */
    /* loaded from: classes.dex */
    private static final class g implements f {

        /* renamed from: a */
        private final ClipData f4620a;

        /* renamed from: b */
        private final int f4621b;

        /* renamed from: c */
        private final int f4622c;

        /* renamed from: d */
        private final Uri f4623d;

        /* renamed from: e */
        private final Bundle f4624e;

        g(d dVar) {
            this.f4620a = (ClipData) C0984h.m4833k(dVar.f4614a);
            this.f4621b = C0984h.m4828f(dVar.f4615b, 0, 5, "source");
            this.f4622c = C0984h.m4832j(dVar.f4616c, 1);
            this.f4623d = dVar.f4617d;
            this.f4624e = dVar.f4618e;
        }

        @Override // androidx.core.view.C1016c.f
        /* renamed from: a */
        public int mo4959a() {
            return this.f4621b;
        }

        @Override // androidx.core.view.C1016c.f
        /* renamed from: b */
        public ContentInfo mo4960b() {
            return null;
        }

        @Override // androidx.core.view.C1016c.f
        /* renamed from: c */
        public ClipData mo4961c() {
            return this.f4620a;
        }

        @Override // androidx.core.view.C1016c.f
        /* renamed from: d */
        public int mo4962d() {
            return this.f4622c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f4620a.getDescription());
            sb2.append(", source=");
            sb2.append(C1016c.m4947e(this.f4621b));
            sb2.append(", flags=");
            sb2.append(C1016c.m4946a(this.f4622c));
            if (this.f4623d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f4623d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f4624e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    C1016c(f fVar) {
        this.f4611a = fVar;
    }

    /* renamed from: a */
    static String m4946a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    /* renamed from: e */
    static String m4947e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static C1016c m4948g(ContentInfo contentInfo) {
        return new C1016c(new e(contentInfo));
    }

    /* renamed from: b */
    public ClipData m4949b() {
        return this.f4611a.mo4961c();
    }

    /* renamed from: c */
    public int m4950c() {
        return this.f4611a.mo4962d();
    }

    /* renamed from: d */
    public int m4951d() {
        return this.f4611a.mo4959a();
    }

    /* renamed from: f */
    public ContentInfo m4952f() {
        ContentInfo mo4960b = this.f4611a.mo4960b();
        Objects.requireNonNull(mo4960b);
        return mo4960b;
    }

    public String toString() {
        return this.f4611a.toString();
    }
}
