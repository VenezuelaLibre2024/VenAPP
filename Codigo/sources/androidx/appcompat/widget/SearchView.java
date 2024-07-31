package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends t0 implements androidx.appcompat.view.c {

    /* renamed from: y0, reason: collision with root package name */
    static final o f1271y0;
    final SearchAutoComplete A;
    private final View B;
    private final View C;
    private final View D;
    final ImageView E;
    final ImageView F;
    final ImageView G;
    final ImageView H;
    private final View I;
    private q J;
    private Rect K;
    private Rect L;
    private int[] M;
    private int[] N;
    private final ImageView O;
    private final Drawable P;
    private final int Q;
    private final int R;
    private final Intent S;
    private final Intent T;
    private final CharSequence U;
    View.OnFocusChangeListener V;
    private View.OnClickListener W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f1272a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f1273b0;

    /* renamed from: c0, reason: collision with root package name */
    u0.a f1274c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f1275d0;

    /* renamed from: e0, reason: collision with root package name */
    private CharSequence f1276e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f1277f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f1278g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f1279h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f1280i0;

    /* renamed from: j0, reason: collision with root package name */
    private CharSequence f1281j0;

    /* renamed from: k0, reason: collision with root package name */
    private CharSequence f1282k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f1283l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f1284m0;

    /* renamed from: n0, reason: collision with root package name */
    SearchableInfo f1285n0;

    /* renamed from: o0, reason: collision with root package name */
    private Bundle f1286o0;

    /* renamed from: p0, reason: collision with root package name */
    private final Runnable f1287p0;

    /* renamed from: q0, reason: collision with root package name */
    private Runnable f1288q0;

    /* renamed from: r0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1289r0;

    /* renamed from: s0, reason: collision with root package name */
    private final View.OnClickListener f1290s0;

    /* renamed from: t0, reason: collision with root package name */
    View.OnKeyListener f1291t0;

    /* renamed from: u0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f1292u0;

    /* renamed from: v0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1293v0;

    /* renamed from: w0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1294w0;

    /* renamed from: x0, reason: collision with root package name */
    private TextWatcher f1295x0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: e, reason: collision with root package name */
        private int f1296e;

        /* renamed from: f, reason: collision with root package name */
        private SearchView f1297f;

        /* renamed from: r, reason: collision with root package name */
        private boolean f1298r;

        /* renamed from: s, reason: collision with root package name */
        final Runnable f1299s;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, g.a.f15276p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1299s = new a();
            this.f1296e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return RecognitionOptions.QR_CODE;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f1271y0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f1298r) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1298r = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1296e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1298r) {
                removeCallbacks(this.f1299s);
                post(this.f1299s);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1297f.V();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1297f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1297f.hasFocus() && getVisibility() == 0) {
                this.f1298r = true;
                if (SearchView.I(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1298r = false;
                removeCallbacks(this.f1299s);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1298r = true;
                    return;
                }
                this.f1298r = false;
                removeCallbacks(this.f1299s);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1297f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1296e = i10;
        }
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.U(charSequence);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.b0();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.a aVar = SearchView.this.f1274c0;
            if (aVar instanceof f1) {
                aVar.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.V;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.x();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.E) {
                searchView.R();
                return;
            }
            if (view == searchView.G) {
                searchView.N();
                return;
            }
            if (view == searchView.F) {
                searchView.S();
            } else if (view == searchView.H) {
                searchView.W();
            } else if (view == searchView.A) {
                searchView.D();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1285n0 == null) {
                return false;
            }
            if (searchView.A.isPopupShowing() && SearchView.this.A.getListSelection() != -1) {
                return SearchView.this.T(view, i10, keyEvent);
            }
            if (SearchView.this.A.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.L(0, null, searchView2.A.getText().toString());
            return true;
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.S();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.O(i10, 0, null);
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.P(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f1311a;

        /* renamed from: b, reason: collision with root package name */
        private Method f1312b;

        /* renamed from: c, reason: collision with root package name */
        private Method f1313c;

        o() {
            this.f1311a = null;
            this.f1312b = null;
            this.f1313c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1311a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1312b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1313c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1312b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1311a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1313c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p extends v0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f1314c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<p> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1314c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1314c + "}";
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1314c));
        }
    }

    /* loaded from: classes.dex */
    private static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f1315a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f1316b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f1317c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f1318d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1319e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1320f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1319e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1316b = new Rect();
            this.f1318d = new Rect();
            this.f1317c = new Rect();
            a(rect, rect2);
            this.f1315a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1316b.set(rect);
            this.f1318d.set(rect);
            Rect rect3 = this.f1318d;
            int i10 = this.f1319e;
            rect3.inset(-i10, -i10);
            this.f1317c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float f10;
            int i10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1320f;
                    if (z11 && !this.f1318d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1320f;
                        this.f1320f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1316b.contains(x10, y10)) {
                    this.f1320f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1317c.contains(x10, y10)) {
                Rect rect = this.f1317c;
                f10 = x10 - rect.left;
                i10 = y10 - rect.top;
            } else {
                f10 = this.f1315a.getWidth() / 2;
                i10 = this.f1315a.getHeight() / 2;
            }
            motionEvent.setLocation(f10, i10);
            return this.f1315a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f1271y0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.K = new Rect();
        this.L = new Rect();
        this.M = new int[2];
        this.N = new int[2];
        this.f1287p0 = new b();
        this.f1288q0 = new c();
        this.f1289r0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1290s0 = fVar;
        this.f1291t0 = new g();
        h hVar = new h();
        this.f1292u0 = hVar;
        i iVar = new i();
        this.f1293v0 = iVar;
        j jVar = new j();
        this.f1294w0 = jVar;
        this.f1295x0 = new a();
        int[] iArr = g.j.f15429f2;
        l1 u10 = l1.u(context, attributeSet, iArr, i10, 0);
        androidx.core.view.x0.U(this, context, iArr, attributeSet, u10.q(), i10, 0);
        LayoutInflater.from(context).inflate(u10.m(g.j.f15479p2, g.g.f15381r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(g.f.D);
        this.A = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.B = findViewById(g.f.f15363z);
        View findViewById = findViewById(g.f.C);
        this.C = findViewById;
        View findViewById2 = findViewById(g.f.J);
        this.D = findViewById2;
        ImageView imageView = (ImageView) findViewById(g.f.f15361x);
        this.E = imageView;
        ImageView imageView2 = (ImageView) findViewById(g.f.A);
        this.F = imageView2;
        ImageView imageView3 = (ImageView) findViewById(g.f.f15362y);
        this.G = imageView3;
        ImageView imageView4 = (ImageView) findViewById(g.f.E);
        this.H = imageView4;
        ImageView imageView5 = (ImageView) findViewById(g.f.B);
        this.O = imageView5;
        androidx.core.view.x0.Z(findViewById, u10.f(g.j.f15484q2));
        androidx.core.view.x0.Z(findViewById2, u10.f(g.j.f15504u2));
        int i11 = g.j.f15499t2;
        imageView.setImageDrawable(u10.f(i11));
        imageView2.setImageDrawable(u10.f(g.j.f15469n2));
        imageView3.setImageDrawable(u10.f(g.j.f15454k2));
        imageView4.setImageDrawable(u10.f(g.j.f15514w2));
        imageView5.setImageDrawable(u10.f(i11));
        this.P = u10.f(g.j.f15494s2);
        r1.a(imageView, getResources().getString(g.h.f15395l));
        this.Q = u10.m(g.j.f15509v2, g.g.f15380q);
        this.R = u10.m(g.j.f15459l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1295x0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1291t0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u10.a(g.j.f15474o2, true));
        int e10 = u10.e(g.j.f15439h2, -1);
        if (e10 != -1) {
            setMaxWidth(e10);
        }
        this.U = u10.o(g.j.f15464m2);
        this.f1276e0 = u10.o(g.j.f15489r2);
        int j10 = u10.j(g.j.f15449j2, -1);
        if (j10 != -1) {
            setImeOptions(j10);
        }
        int j11 = u10.j(g.j.f15444i2, -1);
        if (j11 != -1) {
            setInputType(j11);
        }
        setFocusable(u10.a(g.j.f15434g2, true));
        u10.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.S = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.T = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.I = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        g0(this.f1272a0);
        c0();
    }

    private Intent A(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1286o0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent B(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void C() {
        this.A.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.M);
        getLocationInWindow(this.N);
        int[] iArr = this.M;
        int i10 = iArr[1];
        int[] iArr2 = this.N;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.f1272a0 || this.P == null) {
            return charSequence;
        }
        int textSize = (int) (this.A.getTextSize() * 1.25d);
        this.P.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.P), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        SearchableInfo searchableInfo = this.f1285n0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f1285n0.getVoiceSearchLaunchWebSearch() ? this.S : this.f1285n0.getVoiceSearchLaunchRecognizer() ? this.T : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.f1275d0 || this.f1280i0) && !H();
    }

    private void K(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean M(int i10, int i11, String str) {
        Cursor c10 = this.f1274c0.c();
        if (c10 == null || !c10.moveToPosition(i10)) {
            return false;
        }
        K(z(c10, i11, str));
        return true;
    }

    private void X() {
        post(this.f1287p0);
    }

    private void Y(int i10) {
        CharSequence convertToString;
        Editable text = this.A.getText();
        Cursor c10 = this.f1274c0.c();
        if (c10 == null) {
            return;
        }
        if (!c10.moveToPosition(i10) || (convertToString = this.f1274c0.convertToString(c10)) == null) {
            setQuery(text);
        } else {
            setQuery(convertToString);
        }
    }

    private void a0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.A.getText());
        if (!z11 && (!this.f1272a0 || this.f1283l0)) {
            z10 = false;
        }
        this.G.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.G.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void c0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.A;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void d0() {
        this.A.setThreshold(this.f1285n0.getSuggestThreshold());
        this.A.setImeOptions(this.f1285n0.getImeOptions());
        int inputType = this.f1285n0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1285n0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.A.setInputType(inputType);
        u0.a aVar = this.f1274c0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1285n0.getSuggestAuthority() != null) {
            f1 f1Var = new f1(getContext(), this, this.f1285n0, this.f1289r0);
            this.f1274c0 = f1Var;
            this.A.setAdapter(f1Var);
            ((f1) this.f1274c0).w(this.f1277f0 ? 2 : 1);
        }
    }

    private void e0() {
        this.D.setVisibility((J() && (this.F.getVisibility() == 0 || this.H.getVisibility() == 0)) ? 0 : 8);
    }

    private void f0(boolean z10) {
        this.F.setVisibility((this.f1275d0 && J() && hasFocus() && (z10 || !this.f1280i0)) ? 0 : 8);
    }

    private void g0(boolean z10) {
        this.f1273b0 = z10;
        int i10 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.A.getText());
        this.E.setVisibility(i10);
        f0(z11);
        this.B.setVisibility(z10 ? 8 : 0);
        this.O.setVisibility((this.O.getDrawable() == null || this.f1272a0) ? 8 : 0);
        a0();
        h0(!z11);
        e0();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(g.d.f15303g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(g.d.f15304h);
    }

    private void h0(boolean z10) {
        int i10 = 8;
        if (this.f1280i0 && !H() && z10) {
            this.F.setVisibility(8);
            i10 = 0;
        }
        this.H.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.A.setText(charSequence);
        this.A.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent y(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1282k0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1286o0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1285n0.getSearchActivity());
        return intent;
    }

    private Intent z(Cursor cursor, int i10, String str) {
        int i11;
        String n10;
        try {
            String n11 = f1.n(cursor, "suggest_intent_action");
            if (n11 == null) {
                n11 = this.f1285n0.getSuggestIntentAction();
            }
            if (n11 == null) {
                n11 = "android.intent.action.SEARCH";
            }
            String str2 = n11;
            String n12 = f1.n(cursor, "suggest_intent_data");
            if (n12 == null) {
                n12 = this.f1285n0.getSuggestIntentData();
            }
            if (n12 != null && (n10 = f1.n(cursor, "suggest_intent_data_id")) != null) {
                n12 = n12 + "/" + Uri.encode(n10);
            }
            return y(str2, n12 == null ? null : Uri.parse(n12), f1.n(cursor, "suggest_intent_extra_data"), f1.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.A);
            return;
        }
        o oVar = f1271y0;
        oVar.b(this.A);
        oVar.a(this.A);
    }

    public boolean H() {
        return this.f1273b0;
    }

    void L(int i10, String str, String str2) {
        getContext().startActivity(y("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void N() {
        if (!TextUtils.isEmpty(this.A.getText())) {
            this.A.setText("");
            this.A.requestFocus();
            this.A.setImeVisibility(true);
        } else if (this.f1272a0) {
            clearFocus();
            g0(true);
        }
    }

    boolean O(int i10, int i11, String str) {
        M(i10, 0, null);
        this.A.setImeVisibility(false);
        C();
        return true;
    }

    boolean P(int i10) {
        Y(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void R() {
        g0(false);
        this.A.requestFocus();
        this.A.setImeVisibility(true);
        View.OnClickListener onClickListener = this.W;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void S() {
        Editable text = this.A.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1285n0 != null) {
            L(0, null, text.toString());
        }
        this.A.setImeVisibility(false);
        C();
    }

    boolean T(View view, int i10, KeyEvent keyEvent) {
        if (this.f1285n0 != null && this.f1274c0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return O(this.A.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.A.setSelection(i10 == 21 ? 0 : this.A.length());
                this.A.setListSelection(0);
                this.A.clearListSelection();
                this.A.b();
                return true;
            }
            if (i10 == 19) {
                this.A.getListSelection();
                return false;
            }
        }
        return false;
    }

    void U(CharSequence charSequence) {
        Editable text = this.A.getText();
        this.f1282k0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        f0(z10);
        h0(!z10);
        a0();
        e0();
        this.f1281j0 = charSequence.toString();
    }

    void V() {
        g0(H());
        X();
        if (this.A.hasFocus()) {
            D();
        }
    }

    void W() {
        Intent A;
        SearchableInfo searchableInfo = this.f1285n0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                A = B(this.S, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                A = A(this.T, searchableInfo);
            }
            getContext().startActivity(A);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void Z(CharSequence charSequence, boolean z10) {
        this.A.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.A;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1282k0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        S();
    }

    void b0() {
        int[] iArr = this.A.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.C.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.D.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1278g0 = true;
        super.clearFocus();
        this.A.clearFocus();
        this.A.setImeVisibility(false);
        this.f1278g0 = false;
    }

    public int getImeOptions() {
        return this.A.getImeOptions();
    }

    public int getInputType() {
        return this.A.getInputType();
    }

    public int getMaxWidth() {
        return this.f1279h0;
    }

    public CharSequence getQuery() {
        return this.A.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1276e0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1285n0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.U : getContext().getText(this.f1285n0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.R;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.Q;
    }

    public u0.a getSuggestionsAdapter() {
        return this.f1274c0;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        Z("", false);
        clearFocus();
        g0(true);
        this.A.setImeOptions(this.f1284m0);
        this.f1283l0 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f1283l0) {
            return;
        }
        this.f1283l0 = true;
        int imeOptions = this.A.getImeOptions();
        this.f1284m0 = imeOptions;
        this.A.setImeOptions(imeOptions | 33554432);
        this.A.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1287p0);
        post(this.f1288q0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.t0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            E(this.A, this.K);
            Rect rect = this.L;
            Rect rect2 = this.K;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.J;
            if (qVar != null) {
                qVar.a(this.L, this.K);
                return;
            }
            q qVar2 = new q(this.L, this.K, this.A);
            this.J = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // androidx.appcompat.widget.t0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.H()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f1279h0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f1279h0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f1279h0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        g0(pVar.f1314c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1314c = H();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f1278g0 || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.A.requestFocus(i10, rect);
        if (requestFocus) {
            g0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1286o0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            N();
        } else {
            R();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1272a0 == z10) {
            return;
        }
        this.f1272a0 = z10;
        g0(z10);
        c0();
    }

    public void setImeOptions(int i10) {
        this.A.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.A.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1279h0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.V = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.W = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1276e0 = charSequence;
        c0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f1277f0 = z10;
        u0.a aVar = this.f1274c0;
        if (aVar instanceof f1) {
            ((f1) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1285n0 = searchableInfo;
        if (searchableInfo != null) {
            d0();
            c0();
        }
        boolean G = G();
        this.f1280i0 = G;
        if (G) {
            this.A.setPrivateImeOptions("nm");
        }
        g0(H());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1275d0 = z10;
        g0(H());
    }

    public void setSuggestionsAdapter(u0.a aVar) {
        this.f1274c0 = aVar;
        this.A.setAdapter(aVar);
    }

    void x() {
        if (this.I.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.C.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = x1.b(this);
            int dimensionPixelSize = this.f1272a0 ? resources.getDimensionPixelSize(g.d.f15301e) + resources.getDimensionPixelSize(g.d.f15302f) : 0;
            this.A.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.A.setDropDownHorizontalOffset(b10 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.A.setDropDownWidth((((this.I.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
