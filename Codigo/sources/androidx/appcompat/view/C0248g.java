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
import androidx.appcompat.view.menu.C0262i;
import androidx.appcompat.view.menu.MenuItemC0263j;
import androidx.appcompat.widget.C0349l1;
import androidx.appcompat.widget.C0360p0;
import androidx.core.view.AbstractC1011b;
import androidx.core.view.C1062l0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p111g.C7386j;
import p321r0.InterfaceMenuC10575a;

/* renamed from: androidx.appcompat.view.g */
/* loaded from: classes.dex */
public class C0248g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f1092e;

    /* renamed from: f */
    static final Class<?>[] f1093f;

    /* renamed from: a */
    final Object[] f1094a;

    /* renamed from: b */
    final Object[] f1095b;

    /* renamed from: c */
    Context f1096c;

    /* renamed from: d */
    private Object f1097d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.g$a */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f1098c = {MenuItem.class};

        /* renamed from: a */
        private Object f1099a;

        /* renamed from: b */
        private Method f1100b;

        public a(Object obj, String str) {
            this.f1099a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1100b = cls.getMethod(str, f1098c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1100b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1100b.invoke(this.f1099a, menuItem)).booleanValue();
                }
                this.f1100b.invoke(this.f1099a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.g$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: A */
        AbstractC1011b f1101A;

        /* renamed from: B */
        private CharSequence f1102B;

        /* renamed from: C */
        private CharSequence f1103C;

        /* renamed from: D */
        private ColorStateList f1104D = null;

        /* renamed from: E */
        private PorterDuff.Mode f1105E = null;

        /* renamed from: a */
        private Menu f1107a;

        /* renamed from: b */
        private int f1108b;

        /* renamed from: c */
        private int f1109c;

        /* renamed from: d */
        private int f1110d;

        /* renamed from: e */
        private int f1111e;

        /* renamed from: f */
        private boolean f1112f;

        /* renamed from: g */
        private boolean f1113g;

        /* renamed from: h */
        private boolean f1114h;

        /* renamed from: i */
        private int f1115i;

        /* renamed from: j */
        private int f1116j;

        /* renamed from: k */
        private CharSequence f1117k;

        /* renamed from: l */
        private CharSequence f1118l;

        /* renamed from: m */
        private int f1119m;

        /* renamed from: n */
        private char f1120n;

        /* renamed from: o */
        private int f1121o;

        /* renamed from: p */
        private char f1122p;

        /* renamed from: q */
        private int f1123q;

        /* renamed from: r */
        private int f1124r;

        /* renamed from: s */
        private boolean f1125s;

        /* renamed from: t */
        private boolean f1126t;

        /* renamed from: u */
        private boolean f1127u;

        /* renamed from: v */
        private int f1128v;

        /* renamed from: w */
        private int f1129w;

        /* renamed from: x */
        private String f1130x;

        /* renamed from: y */
        private String f1131y;

        /* renamed from: z */
        private String f1132z;

        public b(Menu menu) {
            this.f1107a = menu;
            m1201h();
        }

        /* renamed from: c */
        private char m1193c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m1194e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0248g.this.f1096c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        /* renamed from: i */
        private void m1195i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f1125s).setVisible(this.f1126t).setEnabled(this.f1127u).setCheckable(this.f1124r >= 1).setTitleCondensed(this.f1118l).setIcon(this.f1119m);
            int i10 = this.f1128v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f1132z != null) {
                if (C0248g.this.f1096c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C0248g.this.m1192b(), this.f1132z));
            }
            if (this.f1124r >= 2) {
                if (menuItem instanceof C0262i) {
                    ((C0262i) menuItem).m1370t(true);
                } else if (menuItem instanceof MenuItemC0263j) {
                    ((MenuItemC0263j) menuItem).m1377h(true);
                }
            }
            String str = this.f1130x;
            if (str != null) {
                menuItem.setActionView((View) m1194e(str, C0248g.f1092e, C0248g.this.f1094a));
                z10 = true;
            }
            int i11 = this.f1129w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC1011b abstractC1011b = this.f1101A;
            if (abstractC1011b != null) {
                C1062l0.m5019a(menuItem, abstractC1011b);
            }
            C1062l0.m5021c(menuItem, this.f1102B);
            C1062l0.m5025g(menuItem, this.f1103C);
            C1062l0.m5020b(menuItem, this.f1120n, this.f1121o);
            C1062l0.m5024f(menuItem, this.f1122p, this.f1123q);
            PorterDuff.Mode mode = this.f1105E;
            if (mode != null) {
                C1062l0.m5023e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f1104D;
            if (colorStateList != null) {
                C1062l0.m5022d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m1196a() {
            this.f1114h = true;
            m1195i(this.f1107a.add(this.f1108b, this.f1115i, this.f1116j, this.f1117k));
        }

        /* renamed from: b */
        public SubMenu m1197b() {
            this.f1114h = true;
            SubMenu addSubMenu = this.f1107a.addSubMenu(this.f1108b, this.f1115i, this.f1116j, this.f1117k);
            m1195i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m1198d() {
            return this.f1114h;
        }

        /* renamed from: f */
        public void m1199f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0248g.this.f1096c.obtainStyledAttributes(attributeSet, C7386j.f17051o1);
            this.f1108b = obtainStyledAttributes.getResourceId(C7386j.f17061q1, 0);
            this.f1109c = obtainStyledAttributes.getInt(C7386j.f17071s1, 0);
            this.f1110d = obtainStyledAttributes.getInt(C7386j.f17076t1, 0);
            this.f1111e = obtainStyledAttributes.getInt(C7386j.f17081u1, 0);
            this.f1112f = obtainStyledAttributes.getBoolean(C7386j.f17066r1, true);
            this.f1113g = obtainStyledAttributes.getBoolean(C7386j.f17056p1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m1200g(AttributeSet attributeSet) {
            C0349l1 m1844t = C0349l1.m1844t(C0248g.this.f1096c, attributeSet, C7386j.f17086v1);
            this.f1115i = m1844t.m1858m(C7386j.f17101y1, 0);
            this.f1116j = (m1844t.m1855j(C7386j.f16879B1, this.f1109c) & (-65536)) | (m1844t.m1855j(C7386j.f16884C1, this.f1110d) & 65535);
            this.f1117k = m1844t.m1860o(C7386j.f16889D1);
            this.f1118l = m1844t.m1860o(C7386j.f16893E1);
            this.f1119m = m1844t.m1858m(C7386j.f17091w1, 0);
            this.f1120n = m1193c(m1844t.m1859n(C7386j.f16897F1));
            this.f1121o = m1844t.m1855j(C7386j.f16925M1, RecognitionOptions.AZTEC);
            this.f1122p = m1193c(m1844t.m1859n(C7386j.f16901G1));
            this.f1123q = m1844t.m1855j(C7386j.f16941Q1, RecognitionOptions.AZTEC);
            int i10 = C7386j.f16905H1;
            this.f1124r = m1844t.m1863r(i10) ? m1844t.m1846a(i10, false) : this.f1111e;
            this.f1125s = m1844t.m1846a(C7386j.f17106z1, false);
            this.f1126t = m1844t.m1846a(C7386j.f16874A1, this.f1112f);
            this.f1127u = m1844t.m1846a(C7386j.f17096x1, this.f1113g);
            this.f1128v = m1844t.m1855j(C7386j.f16945R1, -1);
            this.f1132z = m1844t.m1859n(C7386j.f16909I1);
            this.f1129w = m1844t.m1858m(C7386j.f16913J1, 0);
            this.f1130x = m1844t.m1859n(C7386j.f16921L1);
            String m1859n = m1844t.m1859n(C7386j.f16917K1);
            this.f1131y = m1859n;
            boolean z10 = m1859n != null;
            if (z10 && this.f1129w == 0 && this.f1130x == null) {
                this.f1101A = (AbstractC1011b) m1194e(m1859n, C0248g.f1093f, C0248g.this.f1095b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1101A = null;
            }
            this.f1102B = m1844t.m1860o(C7386j.f16929N1);
            this.f1103C = m1844t.m1860o(C7386j.f16949S1);
            int i11 = C7386j.f16937P1;
            if (m1844t.m1863r(i11)) {
                this.f1105E = C0360p0.m1909d(m1844t.m1855j(i11, -1), this.f1105E);
            } else {
                this.f1105E = null;
            }
            int i12 = C7386j.f16933O1;
            if (m1844t.m1863r(i12)) {
                this.f1104D = m1844t.m1848c(i12);
            } else {
                this.f1104D = null;
            }
            m1844t.m1864v();
            this.f1114h = false;
        }

        /* renamed from: h */
        public void m1201h() {
            this.f1108b = 0;
            this.f1109c = 0;
            this.f1110d = 0;
            this.f1111e = 0;
            this.f1112f = true;
            this.f1113g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f1092e = clsArr;
        f1093f = clsArr;
    }

    public C0248g(Context context) {
        super(context);
        this.f1096c = context;
        Object[] objArr = {context};
        this.f1094a = objArr;
        this.f1095b = objArr;
    }

    /* renamed from: a */
    private Object m1190a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m1190a(((ContextWrapper) obj).getBaseContext()) : obj;
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
    
        r0.m1201h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.m1198d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f1101A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.mo1378a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.m1197b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.m1196a();
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
    
        r0.m1199f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.m1200g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        m1191c(r13, r14, r0.m1197b());
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1191c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
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
            r0.m1201h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m1198d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.f1101A
            if (r15 == 0) goto L82
            boolean r15 = r15.mo1378a()
            if (r15 == 0) goto L82
            r0.m1197b()
            goto Lb9
        L82:
            r0.m1196a()
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
            r0.m1199f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m1200g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m1197b()
            r12.m1191c(r13, r14, r15)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.C0248g.m1191c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: b */
    Object m1192b() {
        if (this.f1097d == null) {
            this.f1097d = m1190a(this.f1096c);
        }
        return this.f1097d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC10575a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1096c.getResources().getLayout(i10);
                    m1191c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
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
