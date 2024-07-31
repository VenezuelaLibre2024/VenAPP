package p382ud;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.C2124j;
import com.bumptech.glide.ComponentCallbacks2C2125k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p006a4.InterfaceC0031b;
import p129h3.EnumC7618b;
import p246n3.C9642h;
import p246n3.C9645k;
import p478z3.AbstractC12795a;

/* renamed from: ud.e */
/* loaded from: classes.dex */
public class C11536e {

    /* renamed from: a */
    private final ComponentCallbacks2C2125k f29915a;

    /* renamed from: b */
    private final Map<String, Set<AbstractC12795a>> f29916b = new HashMap();

    /* renamed from: ud.e$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractC12795a<Drawable> {

        /* renamed from: d */
        private ImageView f29917d;

        /* renamed from: l */
        private void m36107l(Drawable drawable) {
            ImageView imageView = this.f29917d;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }

        /* renamed from: c */
        public abstract void mo33271c(Exception exc);

        @Override // p478z3.InterfaceC12798d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo35350b(Drawable drawable, InterfaceC0031b<? super Drawable> interfaceC0031b) {
            C11544m.m36182a("Downloading Image Success!!!");
            m36107l(drawable);
            mo33272k();
        }

        @Override // p478z3.InterfaceC12798d
        /* renamed from: g */
        public void mo35353g(Drawable drawable) {
            C11544m.m36182a("Downloading Image Cleared");
            m36107l(drawable);
            mo33272k();
        }

        @Override // p478z3.AbstractC12795a, p478z3.InterfaceC12798d
        /* renamed from: j */
        public void mo36109j(Drawable drawable) {
            C11544m.m36182a("Downloading Image Failed");
            m36107l(drawable);
            mo33271c(new Exception("Image loading failed!"));
        }

        /* renamed from: k */
        public abstract void mo33272k();

        /* renamed from: m */
        void m36110m(ImageView imageView) {
            this.f29917d = imageView;
        }
    }

    /* renamed from: ud.e$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        private final C2124j<Drawable> f29918a;

        /* renamed from: b */
        private a f29919b;

        /* renamed from: c */
        private String f29920c;

        public b(C2124j<Drawable> c2124j) {
            this.f29918a = c2124j;
        }

        /* renamed from: a */
        private void m36111a() {
            Set hashSet;
            if (this.f29919b == null || TextUtils.isEmpty(this.f29920c)) {
                return;
            }
            synchronized (C11536e.this.f29916b) {
                if (C11536e.this.f29916b.containsKey(this.f29920c)) {
                    hashSet = (Set) C11536e.this.f29916b.get(this.f29920c);
                } else {
                    hashSet = new HashSet();
                    C11536e.this.f29916b.put(this.f29920c, hashSet);
                }
                if (!hashSet.contains(this.f29919b)) {
                    hashSet.add(this.f29919b);
                }
            }
        }

        /* renamed from: b */
        public void m36112b(ImageView imageView, a aVar) {
            C11544m.m36182a("Downloading Image Callback : " + aVar);
            aVar.m36110m(imageView);
            this.f29918a.m10713o0(aVar);
            this.f29919b = aVar;
            m36111a();
        }

        /* renamed from: c */
        public b m36113c(int i10) {
            this.f29918a.m41344O(i10);
            C11544m.m36182a("Downloading Image Placeholder : " + i10);
            return this;
        }

        /* renamed from: d */
        public b m36114d(Class cls) {
            this.f29920c = cls.getSimpleName();
            m36111a();
            return this;
        }
    }

    public C11536e(ComponentCallbacks2C2125k componentCallbacks2C2125k) {
        this.f29915a = componentCallbacks2C2125k;
    }

    /* renamed from: b */
    public void m36105b(Class cls) {
        String simpleName = cls.getSimpleName();
        synchronized (simpleName) {
            if (this.f29916b.containsKey(simpleName)) {
                for (AbstractC12795a abstractC12795a : this.f29916b.get(simpleName)) {
                    if (abstractC12795a != null) {
                        this.f29915a.m10724m(abstractC12795a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public b m36106c(String str) {
        C11544m.m36182a("Starting Downloading Image : " + str);
        return new b(this.f29915a.m10728q(new C9642h(str, new C9645k.a().m28903a("Accept", "image/*").m28905c())).m41360g(EnumC7618b.PREFER_ARGB_8888));
    }
}
