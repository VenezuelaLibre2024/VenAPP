package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p111g.C7385i;

/* renamed from: androidx.appcompat.view.d */
/* loaded from: classes.dex */
public class C0245d extends ContextWrapper {

    /* renamed from: f */
    private static Configuration f1073f;

    /* renamed from: a */
    private int f1074a;

    /* renamed from: b */
    private Resources.Theme f1075b;

    /* renamed from: c */
    private LayoutInflater f1076c;

    /* renamed from: d */
    private Configuration f1077d;

    /* renamed from: e */
    private Resources f1078e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static Context m1187a(C0245d c0245d, Configuration configuration) {
            return c0245d.createConfigurationContext(configuration);
        }
    }

    public C0245d() {
        super(null);
    }

    public C0245d(Context context, int i10) {
        super(context);
        this.f1074a = i10;
    }

    public C0245d(Context context, Resources.Theme theme) {
        super(context);
        this.f1075b = theme;
    }

    /* renamed from: b */
    private Resources m1181b() {
        if (this.f1078e == null) {
            Configuration configuration = this.f1077d;
            this.f1078e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && m1183e(configuration))) ? super.getResources() : a.m1187a(this, this.f1077d).getResources();
        }
        return this.f1078e;
    }

    /* renamed from: d */
    private void m1182d() {
        boolean z10 = this.f1075b == null;
        if (z10) {
            this.f1075b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1075b.setTo(theme);
            }
        }
        m1186f(this.f1075b, this.f1074a, z10);
    }

    /* renamed from: e */
    private static boolean m1183e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1073f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f1073f = configuration2;
        }
        return configuration.equals(f1073f);
    }

    /* renamed from: a */
    public void m1184a(Configuration configuration) {
        if (this.f1078e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1077d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1077d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m1185c() {
        return this.f1074a;
    }

    /* renamed from: f */
    protected void m1186f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m1181b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1076c == null) {
            this.f1076c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1076c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1075b;
        if (theme != null) {
            return theme;
        }
        if (this.f1074a == 0) {
            this.f1074a = C7385i.f16871e;
        }
        m1182d();
        return this.f1075b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f1074a != i10) {
            this.f1074a = i10;
            m1182d();
        }
    }
}
