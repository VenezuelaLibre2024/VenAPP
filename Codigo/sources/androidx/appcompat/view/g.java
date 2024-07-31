package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.p0;
import androidx.core.view.l0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class<?>[] f961e;

    /* renamed from: f, reason: collision with root package name */
    static final Class<?>[] f962f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f963a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f964b;

    /* renamed from: c, reason: collision with root package name */
    Context f965c;

    /* renamed from: d, reason: collision with root package name */
    private Object f966d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f967c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f968a;

        /* renamed from: b, reason: collision with root package name */
        private Method f969b;

        public a(Object obj, String str) {
            this.f968a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f969b = cls.getMethod(str, f967c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f969b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f969b.invoke(this.f968a, menuItem)).booleanValue();
                }
                this.f969b.invoke(this.f968a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f970a;

        /* renamed from: b, reason: collision with root package name */
        private int f971b;

        /* renamed from: c, reason: collision with root package name */
        private int f972c;

        /* renamed from: d, reason: collision with root package name */
        private int f973d;

        /* renamed from: e, reason: collision with root package name */
        private int f974e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f975f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f976g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f977h;

        /* renamed from: i, reason: collision with root package name */
        private int f978i;

        /* renamed from: j, reason: collision with root package name */
        private int f979j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f980k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f981l;

        /* renamed from: m, reason: collision with root package name */
        private int f982m;

        /* renamed from: n, reason: collision with root package name */
        private char f983n;

        /* renamed from: o, reason: collision with root package name */
        private int f984o;

        /* renamed from: p, reason: collision with root package name */
        private char f985p;

        /* renamed from: q, reason: collision with root package name */
        private int f986q;

        /* renamed from: r, reason: collision with root package name */
        private int f987r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f988s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f989t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f990u;

        /* renamed from: v, reason: collision with root package name */
        private int f991v;

        /* renamed from: w, reason: collision with root package name */
        private int f992w;

        /* renamed from: x, reason: collision with root package name */
        private String f993x;

        /* renamed from: y, reason: collision with root package name */
        private String f994y;

        /* renamed from: z, reason: collision with root package name */
        private String f995z;

        public b(Menu menu) {
            this.f970a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f965c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f988s).setVisible(this.f989t).setEnabled(this.f990u).setCheckable(this.f987r >= 1).setTitleCondensed(this.f981l).setIcon(this.f982m);
            int i10 = this.f991v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f995z != null) {
                if (g.this.f965c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f995z));
            }
            if (this.f987r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof androidx.appcompat.view.menu.j) {
                    ((androidx.appcompat.view.menu.j) menuItem).h(true);
                }
            }
            String str = this.f993x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f961e, g.this.f963a));
                z10 = true;
            }
            int i11 = this.f992w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                l0.a(menuItem, bVar);
            }
            l0.c(menuItem, this.B);
            l0.g(menuItem, this.C);
            l0.b(menuItem, this.f983n, this.f984o);
            l0.f(menuItem, this.f985p, this.f986q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                l0.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                l0.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f977h = true;
            i(this.f970a.add(this.f971b, this.f978i, this.f979j, this.f980k));
        }

        public SubMenu b() {
            this.f977h = true;
            SubMenu addSubMenu = this.f970a.addSubMenu(this.f971b, this.f978i, this.f979j, this.f980k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f977h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f965c.obtainStyledAttributes(attributeSet, g.j.f15473o1);
            this.f971b = obtainStyledAttributes.getResourceId(g.j.f15483q1, 0);
            this.f972c = obtainStyledAttributes.getInt(g.j.f15493s1, 0);
            this.f973d = obtainStyledAttributes.getInt(g.j.f15498t1, 0);
            this.f974e = obtainStyledAttributes.getInt(g.j.f15503u1, 0);
            this.f975f = obtainStyledAttributes.getBoolean(g.j.f15488r1, true);
            this.f976g = obtainStyledAttributes.getBoolean(g.j.f15478p1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            l1 t10 = l1.t(g.this.f965c, attributeSet, g.j.f15508v1);
            this.f978i = t10.m(g.j.f15523y1, 0);
            this.f979j = (t10.j(g.j.B1, this.f972c) & (-65536)) | (t10.j(g.j.C1, this.f973d) & 65535);
            this.f980k = t10.o(g.j.D1);
            this.f981l = t10.o(g.j.E1);
            this.f982m = t10.m(g.j.f15513w1, 0);
            this.f983n = c(t10.n(g.j.F1));
            this.f984o = t10.j(g.j.M1, RecognitionOptions.AZTEC);
            this.f985p = c(t10.n(g.j.G1));
            this.f986q = t10.j(g.j.Q1, RecognitionOptions.AZTEC);
            int i10 = g.j.H1;
            this.f987r = t10.r(i10) ? t10.a(i10, false) : this.f974e;
            this.f988s = t10.a(g.j.f15528z1, false);
            this.f989t = t10.a(g.j.A1, this.f975f);
            this.f990u = t10.a(g.j.f15518x1, this.f976g);
            this.f991v = t10.j(g.j.R1, -1);
            this.f995z = t10.n(g.j.I1);
            this.f992w = t10.m(g.j.J1, 0);
            this.f993x = t10.n(g.j.L1);
            String n10 = t10.n(g.j.K1);
            this.f994y = n10;
            boolean z10 = n10 != null;
            if (z10 && this.f992w == 0 && this.f993x == null) {
                this.A = (androidx.core.view.b) e(n10, g.f962f, g.this.f964b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = t10.o(g.j.N1);
            this.C = t10.o(g.j.S1);
            int i11 = g.j.P1;
            if (t10.r(i11)) {
                this.E = p0.d(t10.j(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = g.j.O1;
            if (t10.r(i12)) {
                this.D = t10.c(i12);
            } else {
                this.D = null;
            }
            t10.v();
            this.f977h = false;
        }

        public void h() {
            this.f971b = 0;
            this.f972c = 0;
            this.f973d = 0;
            this.f974e = 0;
            this.f975f = true;
            this.f976g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f961e = clsArr;
        f962f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f965c = context;
        Object[] objArr = {context};
        this.f963a = objArr;
        this.f964b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            androidx.appcompat.view.g$b r0 = new androidx.appcompat.view.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f966d == null) {
            this.f966d = a(this.f965c);
        }
        return this.f966d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof r0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f965c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
