package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a */
    private final j f4771a;

    /* renamed from: b */
    private final ClassLoader f4772b;

    /* renamed from: d */
    int f4774d;

    /* renamed from: e */
    int f4775e;

    /* renamed from: f */
    int f4776f;

    /* renamed from: g */
    int f4777g;

    /* renamed from: h */
    int f4778h;

    /* renamed from: i */
    boolean f4779i;

    /* renamed from: k */
    String f4781k;

    /* renamed from: l */
    int f4782l;

    /* renamed from: m */
    CharSequence f4783m;

    /* renamed from: n */
    int f4784n;

    /* renamed from: o */
    CharSequence f4785o;

    /* renamed from: p */
    ArrayList<String> f4786p;

    /* renamed from: q */
    ArrayList<String> f4787q;

    /* renamed from: s */
    ArrayList<Runnable> f4789s;

    /* renamed from: c */
    ArrayList<a> f4773c = new ArrayList<>();

    /* renamed from: j */
    boolean f4780j = true;

    /* renamed from: r */
    boolean f4788r = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f4790a;

        /* renamed from: b */
        Fragment f4791b;

        /* renamed from: c */
        int f4792c;

        /* renamed from: d */
        int f4793d;

        /* renamed from: e */
        int f4794e;

        /* renamed from: f */
        int f4795f;

        /* renamed from: g */
        f.b f4796g;

        /* renamed from: h */
        f.b f4797h;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f4790a = i10;
            this.f4791b = fragment;
            f.b bVar = f.b.RESUMED;
            this.f4796g = bVar;
            this.f4797h = bVar;
        }
    }

    public v(j jVar, ClassLoader classLoader) {
        this.f4771a = jVar;
        this.f4772b = classLoader;
    }

    public v b(int i10, Fragment fragment, String str) {
        j(i10, fragment, str, 1);
        return this;
    }

    public v c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public v d(Fragment fragment, String str) {
        j(0, fragment, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f4773c.add(aVar);
        aVar.f4792c = this.f4774d;
        aVar.f4793d = this.f4775e;
        aVar.f4794e = this.f4776f;
        aVar.f4795f = this.f4777g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public v i() {
        if (this.f4779i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f4780j = false;
        return this;
    }

    public void j(int i10, Fragment fragment, String str, int i11) {
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
        e(new a(i11, fragment));
    }

    public v k(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public v l(boolean z10) {
        this.f4788r = z10;
        return this;
    }
}
