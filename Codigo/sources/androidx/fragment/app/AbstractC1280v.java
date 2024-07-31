package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1300f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public abstract class AbstractC1280v {

    /* renamed from: a */
    private final C1268j f5525a;

    /* renamed from: b */
    private final ClassLoader f5526b;

    /* renamed from: d */
    int f5528d;

    /* renamed from: e */
    int f5529e;

    /* renamed from: f */
    int f5530f;

    /* renamed from: g */
    int f5531g;

    /* renamed from: h */
    int f5532h;

    /* renamed from: i */
    boolean f5533i;

    /* renamed from: k */
    String f5535k;

    /* renamed from: l */
    int f5536l;

    /* renamed from: m */
    CharSequence f5537m;

    /* renamed from: n */
    int f5538n;

    /* renamed from: o */
    CharSequence f5539o;

    /* renamed from: p */
    ArrayList<String> f5540p;

    /* renamed from: q */
    ArrayList<String> f5541q;

    /* renamed from: s */
    ArrayList<Runnable> f5543s;

    /* renamed from: c */
    ArrayList<a> f5527c = new ArrayList<>();

    /* renamed from: j */
    boolean f5534j = true;

    /* renamed from: r */
    boolean f5542r = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.v$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f5544a;

        /* renamed from: b */
        Fragment f5545b;

        /* renamed from: c */
        int f5546c;

        /* renamed from: d */
        int f5547d;

        /* renamed from: e */
        int f5548e;

        /* renamed from: f */
        int f5549f;

        /* renamed from: g */
        AbstractC1300f.b f5550g;

        /* renamed from: h */
        AbstractC1300f.b f5551h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, Fragment fragment) {
            this.f5544a = i10;
            this.f5545b = fragment;
            AbstractC1300f.b bVar = AbstractC1300f.b.RESUMED;
            this.f5550g = bVar;
            this.f5551h = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1280v(C1268j c1268j, ClassLoader classLoader) {
        this.f5525a = c1268j;
        this.f5526b = classLoader;
    }

    /* renamed from: b */
    public AbstractC1280v m7204b(int i10, Fragment fragment, String str) {
        mo6844j(i10, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC1280v m7205c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return m7204b(viewGroup.getId(), fragment, str);
    }

    /* renamed from: d */
    public AbstractC1280v m7206d(Fragment fragment, String str) {
        mo6844j(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m7207e(a aVar) {
        this.f5527c.add(aVar);
        aVar.f5546c = this.f5528d;
        aVar.f5547d = this.f5529e;
        aVar.f5548e = this.f5530f;
        aVar.f5549f = this.f5531g;
    }

    /* renamed from: f */
    public abstract int mo6841f();

    /* renamed from: g */
    public abstract int mo6842g();

    /* renamed from: h */
    public abstract void mo6843h();

    /* renamed from: i */
    public AbstractC1280v m7208i() {
        if (this.f5533i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f5534j = false;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6844j(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        m7207e(new a(i11, fragment));
    }

    /* renamed from: k */
    public AbstractC1280v mo6845k(Fragment fragment) {
        m7207e(new a(3, fragment));
        return this;
    }

    /* renamed from: l */
    public AbstractC1280v m7209l(boolean z10) {
        this.f5542r = z10;
        return this;
    }
}
