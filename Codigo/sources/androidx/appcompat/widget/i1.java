package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i1 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1504c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<i1>> f1505d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f1506a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1507b;

    private i1(Context context) {
        super(context);
        if (!w1.d()) {
            this.f1506a = new k1(this, context.getResources());
            this.f1507b = null;
            return;
        }
        w1 w1Var = new w1(this, context.getResources());
        this.f1506a = w1Var;
        Resources.Theme newTheme = w1Var.newTheme();
        this.f1507b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof i1) || (context.getResources() instanceof k1) || (context.getResources() instanceof w1) || !w1.d()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1504c) {
            ArrayList<WeakReference<i1>> arrayList = f1505d;
            if (arrayList == null) {
                f1505d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<i1> weakReference = f1505d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1505d.remove(size);
                    }
                }
                for (int size2 = f1505d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<i1> weakReference2 = f1505d.get(size2);
                    i1 i1Var = weakReference2 != null ? weakReference2.get() : null;
                    if (i1Var != null && i1Var.getBaseContext() == context) {
                        return i1Var;
                    }
                }
            }
            i1 i1Var2 = new i1(context);
            f1505d.add(new WeakReference<>(i1Var2));
            return i1Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1506a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1506a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1507b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1507b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
