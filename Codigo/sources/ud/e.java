package ud;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import n3.k;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final com.bumptech.glide.k f27595a;

    /* renamed from: b */
    private final Map<String, Set<z3.a>> f27596b = new HashMap();

    /* loaded from: classes.dex */
    public static abstract class a extends z3.a<Drawable> {

        /* renamed from: d */
        private ImageView f27597d;

        private void l(Drawable drawable) {
            ImageView imageView = this.f27597d;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }

        public abstract void c(Exception exc);

        @Override // z3.d
        /* renamed from: d */
        public void b(Drawable drawable, a4.b<? super Drawable> bVar) {
            m.a("Downloading Image Success!!!");
            l(drawable);
            k();
        }

        @Override // z3.d
        public void g(Drawable drawable) {
            m.a("Downloading Image Cleared");
            l(drawable);
            k();
        }

        @Override // z3.a, z3.d
        public void j(Drawable drawable) {
            m.a("Downloading Image Failed");
            l(drawable);
            c(new Exception("Image loading failed!"));
        }

        public abstract void k();

        void m(ImageView imageView) {
            this.f27597d = imageView;
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        private final com.bumptech.glide.j<Drawable> f27598a;

        /* renamed from: b */
        private a f27599b;

        /* renamed from: c */
        private String f27600c;

        public b(com.bumptech.glide.j<Drawable> jVar) {
            this.f27598a = jVar;
        }

        private void a() {
            Set hashSet;
            if (this.f27599b == null || TextUtils.isEmpty(this.f27600c)) {
                return;
            }
            synchronized (e.this.f27596b) {
                if (e.this.f27596b.containsKey(this.f27600c)) {
                    hashSet = (Set) e.this.f27596b.get(this.f27600c);
                } else {
                    hashSet = new HashSet();
                    e.this.f27596b.put(this.f27600c, hashSet);
                }
                if (!hashSet.contains(this.f27599b)) {
                    hashSet.add(this.f27599b);
                }
            }
        }

        public void b(ImageView imageView, a aVar) {
            m.a("Downloading Image Callback : " + aVar);
            aVar.m(imageView);
            this.f27598a.o0(aVar);
            this.f27599b = aVar;
            a();
        }

        public b c(int i10) {
            this.f27598a.O(i10);
            m.a("Downloading Image Placeholder : " + i10);
            return this;
        }

        public b d(Class cls) {
            this.f27600c = cls.getSimpleName();
            a();
            return this;
        }
    }

    public e(com.bumptech.glide.k kVar) {
        this.f27595a = kVar;
    }

    public void b(Class cls) {
        String simpleName = cls.getSimpleName();
        synchronized (simpleName) {
            if (this.f27596b.containsKey(simpleName)) {
                for (z3.a aVar : this.f27596b.get(simpleName)) {
                    if (aVar != null) {
                        this.f27595a.m(aVar);
                    }
                }
            }
        }
    }

    public b c(String str) {
        m.a("Starting Downloading Image : " + str);
        return new b(this.f27595a.q(new n3.h(str, new k.a().a("Accept", "image/*").c())).g(h3.b.PREFER_ARGB_8888));
    }
}
