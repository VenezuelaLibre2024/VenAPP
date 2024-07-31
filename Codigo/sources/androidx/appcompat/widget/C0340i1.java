package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.i1 */
/* loaded from: classes.dex */
public class C0340i1 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1779c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0340i1>> f1780d;

    /* renamed from: a */
    private final Resources f1781a;

    /* renamed from: b */
    private final Resources.Theme f1782b;

    private C0340i1(Context context) {
        super(context);
        if (!C0382w1.m2040d()) {
            this.f1781a = new C0346k1(this, context.getResources());
            this.f1782b = null;
            return;
        }
        C0382w1 c0382w1 = new C0382w1(this, context.getResources());
        this.f1781a = c0382w1;
        Resources.Theme newTheme = c0382w1.newTheme();
        this.f1782b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    private static boolean m1778a(Context context) {
        return ((context instanceof C0340i1) || (context.getResources() instanceof C0346k1) || (context.getResources() instanceof C0382w1) || !C0382w1.m2040d()) ? false : true;
    }

    /* renamed from: b */
    public static Context m1779b(Context context) {
        if (!m1778a(context)) {
            return context;
        }
        synchronized (f1779c) {
            ArrayList<WeakReference<C0340i1>> arrayList = f1780d;
            if (arrayList == null) {
                f1780d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C0340i1> weakReference = f1780d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1780d.remove(size);
                    }
                }
                for (int size2 = f1780d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0340i1> weakReference2 = f1780d.get(size2);
                    C0340i1 c0340i1 = weakReference2 != null ? weakReference2.get() : null;
                    if (c0340i1 != null && c0340i1.getBaseContext() == context) {
                        return c0340i1;
                    }
                }
            }
            C0340i1 c0340i12 = new C0340i1(context);
            f1780d.add(new WeakReference<>(c0340i12));
            return c0340i12;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1781a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1781a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1782b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1782b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
