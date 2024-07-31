package com.yalantis.ucrop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b2.l;
import b2.n;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.b;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import fi.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class UCropActivity extends androidx.appcompat.app.d {
    public static final Bitmap.CompressFormat P = Bitmap.CompressFormat.JPEG;
    private ViewGroup A;
    private ViewGroup B;
    private ViewGroup C;
    private ViewGroup D;
    private ViewGroup E;
    private TextView G;
    private TextView H;
    private View I;
    private l J;

    /* renamed from: a */
    private String f13570a;

    /* renamed from: b */
    private int f13571b;

    /* renamed from: c */
    private int f13572c;

    /* renamed from: d */
    private int f13573d;

    /* renamed from: e */
    private int f13574e;

    /* renamed from: f */
    private int f13575f;

    /* renamed from: r */
    private int f13576r;

    /* renamed from: s */
    private int f13577s;

    /* renamed from: t */
    private int f13578t;

    /* renamed from: u */
    private boolean f13579u;

    /* renamed from: w */
    private UCropView f13581w;

    /* renamed from: x */
    private GestureCropImageView f13582x;

    /* renamed from: y */
    private OverlayView f13583y;

    /* renamed from: z */
    private ViewGroup f13584z;

    /* renamed from: v */
    private boolean f13580v = true;
    private List<ViewGroup> F = new ArrayList();
    private Bitmap.CompressFormat K = P;
    private int L = 90;
    private int[] M = {1, 2, 3};
    private b.InterfaceC0200b N = new a();
    private final View.OnClickListener O = new g();

    /* loaded from: classes3.dex */
    class a implements b.InterfaceC0200b {
        a() {
        }

        @Override // com.yalantis.ucrop.view.b.InterfaceC0200b
        public void a() {
            UCropActivity.this.f13581w.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.I.setClickable(false);
            UCropActivity.this.f13580v = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.yalantis.ucrop.view.b.InterfaceC0200b
        public void b(Exception exc) {
            UCropActivity.this.z(exc);
            UCropActivity.this.finish();
        }

        @Override // com.yalantis.ucrop.view.b.InterfaceC0200b
        public void c(float f10) {
            UCropActivity.this.B(f10);
        }

        @Override // com.yalantis.ucrop.view.b.InterfaceC0200b
        public void d(float f10) {
            UCropActivity.this.v(f10);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.f13582x.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).s(view.isSelected()));
            UCropActivity.this.f13582x.B();
            if (view.isSelected()) {
                return;
            }
            for (ViewGroup viewGroup : UCropActivity.this.F) {
                viewGroup.setSelected(viewGroup == view);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements HorizontalProgressWheelView.a {
        c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.f13582x.B();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.f13582x.v();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            UCropActivity.this.f13582x.z(f10 / 42.0f);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.s();
        }
    }

    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.t(90);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements HorizontalProgressWheelView.a {
        f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.f13582x.B();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.f13582x.v();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            if (f10 > 0.0f) {
                UCropActivity.this.f13582x.E(UCropActivity.this.f13582x.getCurrentScale() + (f10 * ((UCropActivity.this.f13582x.getMaxScale() - UCropActivity.this.f13582x.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f13582x.G(UCropActivity.this.f13582x.getCurrentScale() + (f10 * ((UCropActivity.this.f13582x.getMaxScale() - UCropActivity.this.f13582x.getMinScale()) / 15000.0f)));
            }
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropActivity.this.E(view.getId());
        }
    }

    /* loaded from: classes3.dex */
    public class h implements ci.a {
        h() {
        }

        @Override // ci.a
        public void a(Uri uri, int i10, int i11, int i12, int i13) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.A(uri, uCropActivity.f13582x.getTargetAspectRatio(), i10, i11, i12, i13);
            UCropActivity.this.finish();
        }

        @Override // ci.a
        public void b(Throwable th2) {
            UCropActivity.this.z(th2);
            UCropActivity.this.finish();
        }
    }

    static {
        androidx.appcompat.app.g.I(true);
    }

    public void B(float f10) {
        TextView textView = this.H;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f10 * 100.0f))));
        }
    }

    private void C(int i10) {
        TextView textView = this.H;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    private void D(int i10) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i10);
        }
    }

    public void E(int i10) {
        if (this.f13579u) {
            ViewGroup viewGroup = this.f13584z;
            int i11 = bi.e.f6562n;
            viewGroup.setSelected(i10 == i11);
            ViewGroup viewGroup2 = this.A;
            int i12 = bi.e.f6563o;
            viewGroup2.setSelected(i10 == i12);
            ViewGroup viewGroup3 = this.B;
            int i13 = bi.e.f6564p;
            viewGroup3.setSelected(i10 == i13);
            this.C.setVisibility(i10 == i11 ? 0 : 8);
            this.D.setVisibility(i10 == i12 ? 0 : 8);
            this.E.setVisibility(i10 == i13 ? 0 : 8);
            o(i10);
            if (i10 == i13) {
                u(0);
            } else if (i10 == i12) {
                u(1);
            } else {
                u(2);
            }
        }
    }

    private void F() {
        D(this.f13572c);
        Toolbar toolbar = (Toolbar) findViewById(bi.e.f6568t);
        toolbar.setBackgroundColor(this.f13571b);
        toolbar.setTitleTextColor(this.f13574e);
        TextView textView = (TextView) toolbar.findViewById(bi.e.f6569u);
        textView.setTextColor(this.f13574e);
        textView.setText(this.f13570a);
        Drawable mutate = androidx.core.content.a.getDrawable(this, this.f13576r).mutate();
        mutate.setColorFilter(this.f13574e, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        setSupportActionBar(toolbar);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u(false);
        }
    }

    private void G(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new di.a(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new di.a(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new di.a(getString(bi.h.f6582c).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new di.a(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new di.a(null, 16.0f, 9.0f));
            intExtra = 2;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(bi.e.f6555g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            di.a aVar = (di.a) it.next();
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(bi.f.f6576b, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f13573d);
            aspectRatioTextView.setAspectRatio(aVar);
            linearLayout.addView(frameLayout);
            this.F.add(frameLayout);
        }
        this.F.get(intExtra).setSelected(true);
        Iterator<ViewGroup> it2 = this.F.iterator();
        while (it2.hasNext()) {
            it2.next().setOnClickListener(new b());
        }
    }

    private void H() {
        this.G = (TextView) findViewById(bi.e.f6566r);
        int i10 = bi.e.f6560l;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.f13573d);
        findViewById(bi.e.f6574z).setOnClickListener(new d());
        findViewById(bi.e.A).setOnClickListener(new e());
        w(this.f13573d);
    }

    private void I() {
        this.H = (TextView) findViewById(bi.e.f6567s);
        int i10 = bi.e.f6561m;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.f13573d);
        C(this.f13573d);
    }

    private void J() {
        ImageView imageView = (ImageView) findViewById(bi.e.f6554f);
        ImageView imageView2 = (ImageView) findViewById(bi.e.f6553e);
        ImageView imageView3 = (ImageView) findViewById(bi.e.f6552d);
        imageView.setImageDrawable(new i(imageView.getDrawable(), this.f13573d));
        imageView2.setImageDrawable(new i(imageView2.getDrawable(), this.f13573d));
        imageView3.setImageDrawable(new i(imageView3.getDrawable(), this.f13573d));
    }

    private void K(Intent intent) {
        this.f13572c = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", androidx.core.content.a.getColor(this, bi.b.f6531h));
        this.f13571b = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", androidx.core.content.a.getColor(this, bi.b.f6532i));
        this.f13573d = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", androidx.core.content.a.getColor(this, bi.b.f6524a));
        this.f13574e = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", androidx.core.content.a.getColor(this, bi.b.f6533j));
        this.f13576r = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", bi.d.f6547a);
        this.f13577s = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", bi.d.f6548b);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f13570a = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(bi.h.f6581b);
        }
        this.f13570a = stringExtra;
        this.f13578t = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", androidx.core.content.a.getColor(this, bi.b.f6529f));
        this.f13579u = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f13575f = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", androidx.core.content.a.getColor(this, bi.b.f6525b));
        F();
        q();
        if (this.f13579u) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(bi.e.f6572x)).findViewById(bi.e.f6549a);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(bi.f.f6577c, viewGroup, true);
            b2.b bVar = new b2.b();
            this.J = bVar;
            bVar.Y(50L);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(bi.e.f6562n);
            this.f13584z = viewGroup2;
            viewGroup2.setOnClickListener(this.O);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(bi.e.f6563o);
            this.A = viewGroup3;
            viewGroup3.setOnClickListener(this.O);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(bi.e.f6564p);
            this.B = viewGroup4;
            viewGroup4.setOnClickListener(this.O);
            this.C = (ViewGroup) findViewById(bi.e.f6555g);
            this.D = (ViewGroup) findViewById(bi.e.f6556h);
            this.E = (ViewGroup) findViewById(bi.e.f6557i);
            G(intent);
            H();
            I();
            J();
        }
    }

    private void n() {
        if (this.I == null) {
            this.I = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, bi.e.f6568t);
            this.I.setLayoutParams(layoutParams);
            this.I.setClickable(true);
        }
        ((RelativeLayout) findViewById(bi.e.f6572x)).addView(this.I);
    }

    private void o(int i10) {
        n.a((ViewGroup) findViewById(bi.e.f6572x), this.J);
        this.B.findViewById(bi.e.f6567s).setVisibility(i10 == bi.e.f6564p ? 0 : 8);
        this.f13584z.findViewById(bi.e.f6565q).setVisibility(i10 == bi.e.f6562n ? 0 : 8);
        this.A.findViewById(bi.e.f6566r).setVisibility(i10 != bi.e.f6563o ? 8 : 0);
    }

    private void q() {
        UCropView uCropView = (UCropView) findViewById(bi.e.f6570v);
        this.f13581w = uCropView;
        this.f13582x = uCropView.getCropImageView();
        this.f13583y = this.f13581w.getOverlayView();
        this.f13582x.setTransformImageListener(this.N);
        ((ImageView) findViewById(bi.e.f6551c)).setColorFilter(this.f13578t, PorterDuff.Mode.SRC_ATOP);
        int i10 = bi.e.f6571w;
        findViewById(i10).setBackgroundColor(this.f13575f);
        if (this.f13579u) {
            return;
        }
        ((RelativeLayout.LayoutParams) findViewById(i10).getLayoutParams()).bottomMargin = 0;
        findViewById(i10).requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0137, code lost:
    
        if (java.lang.Float.isNaN(r0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0160, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0161, code lost:
    
        r1.setTargetAspectRatio(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015d, code lost:
    
        if (java.lang.Float.isNaN(r0) != false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r(android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.r(android.content.Intent):void");
    }

    public void s() {
        GestureCropImageView gestureCropImageView = this.f13582x;
        gestureCropImageView.z(-gestureCropImageView.getCurrentAngle());
        this.f13582x.B();
    }

    public void t(int i10) {
        this.f13582x.z(i10);
        this.f13582x.B();
    }

    private void u(int i10) {
        GestureCropImageView gestureCropImageView = this.f13582x;
        int i11 = this.M[i10];
        gestureCropImageView.setScaleEnabled(i11 == 3 || i11 == 1);
        GestureCropImageView gestureCropImageView2 = this.f13582x;
        int i12 = this.M[i10];
        gestureCropImageView2.setRotateEnabled(i12 == 3 || i12 == 2);
    }

    public void v(float f10) {
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
        }
    }

    private void w(int i10) {
        TextView textView = this.G;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    private void x(Intent intent) {
        Throwable e10;
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        r(intent);
        if (uri == null || uri2 == null) {
            e10 = new NullPointerException(getString(bi.h.f6580a));
        } else {
            try {
                this.f13582x.p(uri, uri2);
                return;
            } catch (Exception e11) {
                e10 = e11;
            }
        }
        z(e10);
        finish();
    }

    private void y() {
        if (this.f13579u) {
            E(this.f13584z.getVisibility() == 0 ? bi.e.f6562n : bi.e.f6564p);
        } else {
            u(0);
        }
    }

    protected void A(Uri uri, float f10, int i10, int i11, int i12, int i13) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f10).putExtra("com.yalantis.ucrop.ImageWidth", i12).putExtra("com.yalantis.ucrop.ImageHeight", i13).putExtra("com.yalantis.ucrop.OffsetX", i10).putExtra("com.yalantis.ucrop.OffsetY", i11));
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(bi.f.f6575a);
        Intent intent = getIntent();
        K(intent);
        x(intent);
        y();
        n();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(bi.g.f6579a, menu);
        MenuItem findItem = menu.findItem(bi.e.f6559k);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f13574e, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                Log.i("UCropActivity", String.format("%s - %s", e10.getMessage(), getString(bi.h.f6583d)));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(bi.e.f6558j);
        Drawable drawable = androidx.core.content.a.getDrawable(this, this.f13577s);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(this.f13574e, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(drawable);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == bi.e.f6558j) {
            p();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(bi.e.f6558j).setVisible(!this.f13580v);
        menu.findItem(bi.e.f6559k).setVisible(this.f13580v);
        return super.onPrepareOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.e, android.app.Activity
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f13582x;
        if (gestureCropImageView != null) {
            gestureCropImageView.v();
        }
    }

    protected void p() {
        this.I.setClickable(true);
        this.f13580v = true;
        supportInvalidateOptionsMenu();
        this.f13582x.w(this.K, this.L, new h());
    }

    protected void z(Throwable th2) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th2));
    }
}
