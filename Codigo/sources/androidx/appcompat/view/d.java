package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f942f;

    /* renamed from: a, reason: collision with root package name */
    private int f943a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f944b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f945c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f946d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f947e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d() {
        super(null);
    }

    public d(Context context, int i10) {
        super(context);
        this.f943a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f944b = theme;
    }

    private Resources b() {
        if (this.f947e == null) {
            Configuration configuration = this.f946d;
            this.f947e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) ? super.getResources() : a.a(this, this.f946d).getResources();
        }
        return this.f947e;
    }

    private void d() {
        boolean z10 = this.f944b == null;
        if (z10) {
            this.f944b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f944b.setTo(theme);
            }
        }
        f(this.f944b, this.f943a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f942f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f942f = configuration2;
        }
        return configuration.equals(f942f);
    }

    public void a(Configuration configuration) {
        if (this.f947e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f946d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f946d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f943a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f945c == null) {
            this.f945c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f945c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f944b;
        if (theme != null) {
            return theme;
        }
        if (this.f943a == 0) {
            this.f943a = g.i.f15400e;
        }
        d();
        return this.f944b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f943a != i10) {
            this.f943a = i10;
            d();
        }
    }
}
