package oi;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.camera.core.f;
import androidx.camera.core.s;
import androidx.lifecycle.LiveData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import h0.c;
import io.flutter.view.TextureRegistry;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import w.i1;
import w.k1;
import w.u0;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a */
    private final Activity f22596a;

    /* renamed from: b */
    private final TextureRegistry f22597b;

    /* renamed from: c */
    private final ok.r<List<? extends Map<String, ? extends Object>>, byte[], Integer, Integer, ck.v> f22598c;

    /* renamed from: d */
    private final ok.l<String, ck.v> f22599d;

    /* renamed from: e */
    private androidx.camera.lifecycle.e f22600e;

    /* renamed from: f */
    private w.i f22601f;

    /* renamed from: g */
    private androidx.camera.core.s f22602g;

    /* renamed from: h */
    private TextureRegistry.SurfaceTextureEntry f22603h;

    /* renamed from: i */
    private vf.a f22604i;

    /* renamed from: j */
    private List<String> f22605j;

    /* renamed from: k */
    private boolean f22606k;

    /* renamed from: l */
    private DisplayManager.DisplayListener f22607l;

    /* renamed from: m */
    private List<Float> f22608m;

    /* renamed from: n */
    private pi.b f22609n;

    /* renamed from: o */
    private long f22610o;

    /* renamed from: p */
    private boolean f22611p;

    /* renamed from: q */
    private final f.a f22612q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements ok.l<List<xf.a>, ck.v> {

        /* renamed from: a */
        final /* synthetic */ ok.l<List<? extends Map<String, ? extends Object>>, ck.v> f22613a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ok.l<? super List<? extends Map<String, ? extends Object>>, ck.v> lVar) {
            super(1);
            this.f22613a = lVar;
        }

        public final void a(List<xf.a> list) {
            int r10;
            ok.l<List<? extends Map<String, ? extends Object>>, ck.v> lVar;
            kotlin.jvm.internal.n.b(list);
            List<xf.a> list2 = list;
            r10 = dk.s.r(list2, 10);
            ArrayList arrayList = new ArrayList(r10);
            for (xf.a aVar : list2) {
                kotlin.jvm.internal.n.b(aVar);
                arrayList.add(a0.m(aVar));
            }
            if (!arrayList.isEmpty()) {
                lVar = this.f22613a;
            } else {
                lVar = this.f22613a;
                arrayList = null;
            }
            lVar.invoke(arrayList);
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(List<xf.a> list) {
            a(list);
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.o implements ok.l<List<xf.a>, ck.v> {

        /* renamed from: b */
        final /* synthetic */ androidx.camera.core.o f22615b;

        /* renamed from: c */
        final /* synthetic */ Image f22616c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.camera.core.o oVar, Image image) {
            super(1);
            this.f22615b = oVar;
            this.f22616c = image;
        }

        public final void a(List<xf.a> list) {
            w.o b10;
            List Z;
            if (s.this.f22609n == pi.b.NO_DUPLICATES) {
                kotlin.jvm.internal.n.b(list);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String l10 = ((xf.a) it.next()).l();
                    if (l10 != null) {
                        arrayList.add(l10);
                    }
                }
                Z = dk.z.Z(arrayList);
                if (kotlin.jvm.internal.n.a(Z, s.this.f22605j)) {
                    return;
                }
                if (!Z.isEmpty()) {
                    s.this.f22605j = Z;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (xf.a aVar : list) {
                if (s.this.F() != null) {
                    s sVar = s.this;
                    List<Float> F = sVar.F();
                    kotlin.jvm.internal.n.b(F);
                    kotlin.jvm.internal.n.b(aVar);
                    androidx.camera.core.o imageProxy = this.f22615b;
                    kotlin.jvm.internal.n.d(imageProxy, "$imageProxy");
                    if (!sVar.G(F, aVar, imageProxy)) {
                    }
                } else {
                    kotlin.jvm.internal.n.b(aVar);
                }
                arrayList2.add(a0.m(aVar));
            }
            if (!arrayList2.isEmpty()) {
                if (!s.this.f22611p) {
                    s.this.f22598c.e(arrayList2, null, null, null);
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(this.f22616c.getWidth(), this.f22616c.getHeight(), Bitmap.Config.ARGB_8888);
                Context applicationContext = s.this.f22596a.getApplicationContext();
                kotlin.jvm.internal.n.d(applicationContext, "getApplicationContext(...)");
                qi.b bVar = new qi.b(applicationContext);
                Image image = this.f22616c;
                kotlin.jvm.internal.n.b(createBitmap);
                bVar.b(image, createBitmap);
                s sVar2 = s.this;
                w.i iVar = sVar2.f22601f;
                Bitmap J = sVar2.J(createBitmap, (iVar == null || (b10 = iVar.b()) == null) ? 90.0f : b10.a());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                J.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int width = J.getWidth();
                int height = J.getHeight();
                J.recycle();
                s.this.f22598c.e(arrayList2, byteArray, Integer.valueOf(width), Integer.valueOf(height));
            }
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(List<xf.a> list) {
            a(list);
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements DisplayManager.DisplayListener {

        /* renamed from: a */
        final /* synthetic */ boolean f22617a;

        /* renamed from: b */
        final /* synthetic */ Size f22618b;

        /* renamed from: c */
        final /* synthetic */ f.c f22619c;

        /* renamed from: d */
        final /* synthetic */ s f22620d;

        c(boolean z10, Size size, f.c cVar, s sVar) {
            this.f22617a = z10;
            this.f22618b = size;
            this.f22619c = cVar;
            this.f22620d = sVar;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (!this.f22617a) {
                this.f22619c.o(this.f22620d.E(this.f22618b));
                return;
            }
            c.a aVar = new c.a();
            aVar.e(new h0.d(this.f22618b, 1));
            this.f22619c.j(aVar.a()).c();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.o implements ok.l<Integer, ck.v> {

        /* renamed from: a */
        final /* synthetic */ ok.l<Integer, ck.v> f22621a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ok.l<? super Integer, ck.v> lVar) {
            super(1);
            this.f22621a = lVar;
        }

        public final void a(Integer num) {
            ok.l<Integer, ck.v> lVar = this.f22621a;
            kotlin.jvm.internal.n.b(num);
            lVar.invoke(num);
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(Integer num) {
            a(num);
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.o implements ok.l<k1, ck.v> {

        /* renamed from: a */
        final /* synthetic */ ok.l<Double, ck.v> f22622a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ok.l<? super Double, ck.v> lVar) {
            super(1);
            this.f22622a = lVar;
        }

        public final void a(k1 k1Var) {
            this.f22622a.invoke(Double.valueOf(k1Var.b()));
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(k1 k1Var) {
            a(k1Var);
            return ck.v.f7137a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(Activity activity, TextureRegistry textureRegistry, ok.r<? super List<? extends Map<String, ? extends Object>>, ? super byte[], ? super Integer, ? super Integer, ck.v> mobileScannerCallback, ok.l<? super String, ck.v> mobileScannerErrorCallback) {
        kotlin.jvm.internal.n.e(activity, "activity");
        kotlin.jvm.internal.n.e(textureRegistry, "textureRegistry");
        kotlin.jvm.internal.n.e(mobileScannerCallback, "mobileScannerCallback");
        kotlin.jvm.internal.n.e(mobileScannerErrorCallback, "mobileScannerErrorCallback");
        this.f22596a = activity;
        this.f22597b = textureRegistry;
        this.f22598c = mobileScannerCallback;
        this.f22599d = mobileScannerErrorCallback;
        vf.a a10 = vf.c.a();
        kotlin.jvm.internal.n.d(a10, "getClient(...)");
        this.f22604i = a10;
        this.f22609n = pi.b.NO_DUPLICATES;
        this.f22610o = 250L;
        this.f22612q = new f.a() { // from class: oi.m
            public /* synthetic */ m() {
            }

            @Override // androidx.camera.core.f.a
            public final void b(androidx.camera.core.o oVar) {
                s.z(s.this, oVar);
            }
        };
    }

    public static final void A(ok.l tmp0, Object obj) {
        kotlin.jvm.internal.n.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void B(s this$0, Exception e10) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(e10, "e");
        ok.l<String, ck.v> lVar = this$0.f22599d;
        String localizedMessage = e10.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = e10.toString();
        }
        lVar.invoke(localizedMessage);
    }

    public static final void C(androidx.camera.core.o imageProxy, Task it) {
        kotlin.jvm.internal.n.e(imageProxy, "$imageProxy");
        kotlin.jvm.internal.n.e(it, "it");
        imageProxy.close();
    }

    public static final void D(s this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.f22606k = false;
    }

    public final Size E(Size size) {
        Display defaultDisplay;
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = this.f22596a.getDisplay();
            kotlin.jvm.internal.n.b(defaultDisplay);
        } else {
            Object systemService = this.f22596a.getApplicationContext().getSystemService("window");
            kotlin.jvm.internal.n.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        }
        int rotation = defaultDisplay.getRotation();
        int width = size.getWidth();
        int height = size.getHeight();
        return (rotation == 0 || rotation == 2) ? new Size(width, height) : new Size(height, width);
    }

    public final boolean G(List<Float> list, xf.a aVar, androidx.camera.core.o oVar) {
        int a10;
        int a11;
        int a12;
        int a13;
        Rect a14 = aVar.a();
        if (a14 == null) {
            return false;
        }
        int height = oVar.getHeight();
        int width = oVar.getWidth();
        float f10 = height;
        a10 = qk.c.a(list.get(0).floatValue() * f10);
        float f11 = width;
        a11 = qk.c.a(list.get(1).floatValue() * f11);
        a12 = qk.c.a(list.get(2).floatValue() * f10);
        a13 = qk.c.a(list.get(3).floatValue() * f11);
        return new Rect(a10, a11, a12, a13).contains(a14);
    }

    private final boolean H() {
        return this.f22601f == null && this.f22602g == null;
    }

    public final Bitmap J(Bitmap bitmap, float f10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f10);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        kotlin.jvm.internal.n.d(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void N(s this$0, com.google.common.util.concurrent.f cameraProviderFuture, ok.l mobileScannerErrorCallback, Size size, boolean z10, w.p cameraPosition, ok.l mobileScannerStartedCallback, Executor executor, boolean z11, ok.l torchStateCallback, ok.l zoomScaleStateCallback) {
        int i10;
        w.o b10;
        w.o b11;
        List<w.o> f10;
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(cameraProviderFuture, "$cameraProviderFuture");
        kotlin.jvm.internal.n.e(mobileScannerErrorCallback, "$mobileScannerErrorCallback");
        kotlin.jvm.internal.n.e(cameraPosition, "$cameraPosition");
        kotlin.jvm.internal.n.e(mobileScannerStartedCallback, "$mobileScannerStartedCallback");
        kotlin.jvm.internal.n.e(torchStateCallback, "$torchStateCallback");
        kotlin.jvm.internal.n.e(zoomScaleStateCallback, "$zoomScaleStateCallback");
        androidx.camera.lifecycle.e eVar = (androidx.camera.lifecycle.e) cameraProviderFuture.get();
        this$0.f22600e = eVar;
        w.i iVar = null;
        Integer valueOf = (eVar == null || (f10 = eVar.f()) == null) ? null : Integer.valueOf(f10.size());
        androidx.camera.lifecycle.e eVar2 = this$0.f22600e;
        if (eVar2 == null) {
            mobileScannerErrorCallback.invoke(new oi.e());
            return;
        }
        if (eVar2 != null) {
            eVar2.p();
        }
        this$0.f22603h = this$0.f22597b.createSurfaceTexture();
        n nVar = new s.c() { // from class: oi.n

            /* renamed from: b */
            public final /* synthetic */ Executor f22592b;

            public /* synthetic */ n(Executor executor2) {
                r2 = executor2;
            }

            @Override // androidx.camera.core.s.c
            public final void a(i1 i1Var) {
                s.Q(s.this, r2, i1Var);
            }
        };
        androidx.camera.core.s c10 = new s.a().c();
        c10.j0(nVar);
        this$0.f22602g = c10;
        f.c f11 = new f.c().f(0);
        kotlin.jvm.internal.n.d(f11, "setBackpressureStrategy(...)");
        Object systemService = this$0.f22596a.getApplicationContext().getSystemService("display");
        kotlin.jvm.internal.n.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        DisplayManager displayManager = (DisplayManager) systemService;
        if (size != null) {
            if (z10) {
                c.a aVar = new c.a();
                aVar.e(new h0.d(size, 1));
                f11.j(aVar.a()).c();
            } else {
                f11.o(this$0.E(size));
            }
            if (this$0.f22607l == null) {
                c cVar = new c(z10, size, f11, this$0);
                this$0.f22607l = cVar;
                displayManager.registerDisplayListener(cVar, null);
            }
        }
        androidx.camera.core.f c11 = f11.c();
        c11.k0(executor2, this$0.f22612q);
        kotlin.jvm.internal.n.d(c11, "apply(...)");
        try {
            androidx.camera.lifecycle.e eVar3 = this$0.f22600e;
            if (eVar3 != null) {
                ComponentCallbacks2 componentCallbacks2 = this$0.f22596a;
                kotlin.jvm.internal.n.c(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                i10 = 0;
                iVar = eVar3.e((androidx.lifecycle.k) componentCallbacks2, cameraPosition, this$0.f22602g, c11);
            } else {
                i10 = 0;
            }
            this$0.f22601f = iVar;
            if (iVar != null) {
                LiveData<Integer> g10 = iVar.b().g();
                ComponentCallbacks2 componentCallbacks22 = this$0.f22596a;
                kotlin.jvm.internal.n.c(componentCallbacks22, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                g10.observe((androidx.lifecycle.k) componentCallbacks22, new androidx.lifecycle.s() { // from class: oi.o
                    public /* synthetic */ o() {
                    }

                    @Override // androidx.lifecycle.s
                    public final void a(Object obj) {
                        s.P(ok.l.this, obj);
                    }
                });
                iVar.b().j().observe((androidx.lifecycle.k) this$0.f22596a, new androidx.lifecycle.s() { // from class: oi.p
                    public /* synthetic */ p() {
                    }

                    @Override // androidx.lifecycle.s
                    public final void a(Object obj) {
                        s.O(ok.l.this, obj);
                    }
                });
                if (iVar.b().d()) {
                    iVar.a().g(z11);
                }
            }
            u0 e02 = c11.e0();
            kotlin.jvm.internal.n.b(e02);
            Size a10 = e02.a();
            kotlin.jvm.internal.n.d(a10, "getResolution(...)");
            double width = a10.getWidth();
            double height = a10.getHeight();
            w.i iVar2 = this$0.f22601f;
            int i11 = ((iVar2 == null || (b11 = iVar2.b()) == null) ? i10 : b11.a()) % 180 != 0 ? i10 : 1;
            double d10 = i11 != 0 ? width : height;
            double d11 = i11 != 0 ? height : width;
            w.i iVar3 = this$0.f22601f;
            boolean d12 = (iVar3 == null || (b10 = iVar3.b()) == null) ? i10 : b10.d();
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this$0.f22603h;
            kotlin.jvm.internal.n.b(surfaceTextureEntry);
            mobileScannerStartedCallback.invoke(new pi.c(d10, d11, d12, surfaceTextureEntry.id(), valueOf != null ? valueOf.intValue() : i10));
        } catch (Exception unused) {
            mobileScannerErrorCallback.invoke(new b0());
        }
    }

    public static final void O(ok.l tmp0, Object obj) {
        kotlin.jvm.internal.n.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void P(ok.l tmp0, Object obj) {
        kotlin.jvm.internal.n.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void Q(s this$0, Executor executor, i1 request) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(request, "request");
        if (this$0.H()) {
            return;
        }
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this$0.f22603h;
        kotlin.jvm.internal.n.b(surfaceTextureEntry);
        SurfaceTexture surfaceTexture = surfaceTextureEntry.surfaceTexture();
        kotlin.jvm.internal.n.d(surfaceTexture, "surfaceTexture(...)");
        surfaceTexture.setDefaultBufferSize(request.k().getWidth(), request.k().getHeight());
        request.v(new Surface(surfaceTexture), executor, new androidx.core.util.a() { // from class: oi.q
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                s.R((i1.g) obj);
            }
        });
    }

    public static final void R(i1.g gVar) {
    }

    public static final void x(ok.l tmp0, Object obj) {
        kotlin.jvm.internal.n.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void y(s this$0, Exception e10) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(e10, "e");
        ok.l<String, ck.v> lVar = this$0.f22599d;
        String localizedMessage = e10.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = e10.toString();
        }
        lVar.invoke(localizedMessage);
    }

    public static final void z(s this$0, androidx.camera.core.o imageProxy) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(imageProxy, "imageProxy");
        Image k12 = imageProxy.k1();
        if (k12 == null) {
            return;
        }
        ag.a b10 = ag.a.b(k12, imageProxy.e1().d());
        kotlin.jvm.internal.n.d(b10, "fromMediaImage(...)");
        pi.b bVar = this$0.f22609n;
        pi.b bVar2 = pi.b.NORMAL;
        if (bVar == bVar2 && this$0.f22606k) {
            imageProxy.close();
            return;
        }
        if (bVar == bVar2) {
            this$0.f22606k = true;
        }
        this$0.f22604i.W(b10).addOnSuccessListener(new OnSuccessListener() { // from class: oi.r
            public /* synthetic */ r() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                s.A(ok.l.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: oi.g
            public /* synthetic */ g() {
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                s.B(s.this, exc);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: oi.h
            public /* synthetic */ h() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                s.C(androidx.camera.core.o.this, task);
            }
        });
        if (this$0.f22609n == bVar2) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: oi.i
                public /* synthetic */ i() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s.D(s.this);
                }
            }, this$0.f22610o);
        }
    }

    public final List<Float> F() {
        return this.f22608m;
    }

    public final void I() {
        w.j a10;
        w.i iVar = this.f22601f;
        if (iVar == null) {
            throw new d0();
        }
        if (iVar == null || (a10 = iVar.a()) == null) {
            return;
        }
        a10.d(1.0f);
    }

    public final void K(double d10) {
        w.j a10;
        if (d10 > 1.0d || d10 < 0.0d) {
            throw new c0();
        }
        w.i iVar = this.f22601f;
        if (iVar == null) {
            throw new d0();
        }
        if (iVar == null || (a10 = iVar.a()) == null) {
            return;
        }
        a10.b((float) d10);
    }

    public final void L(List<Float> list) {
        this.f22608m = list;
    }

    public final void M(vf.b bVar, boolean z10, w.p cameraPosition, boolean z11, pi.b detectionSpeed, ok.l<? super Integer, ck.v> torchStateCallback, ok.l<? super Double, ck.v> zoomScaleStateCallback, ok.l<? super pi.c, ck.v> mobileScannerStartedCallback, ok.l<? super Exception, ck.v> mobileScannerErrorCallback, long j10, Size size, boolean z12) {
        kotlin.jvm.internal.n.e(cameraPosition, "cameraPosition");
        kotlin.jvm.internal.n.e(detectionSpeed, "detectionSpeed");
        kotlin.jvm.internal.n.e(torchStateCallback, "torchStateCallback");
        kotlin.jvm.internal.n.e(zoomScaleStateCallback, "zoomScaleStateCallback");
        kotlin.jvm.internal.n.e(mobileScannerStartedCallback, "mobileScannerStartedCallback");
        kotlin.jvm.internal.n.e(mobileScannerErrorCallback, "mobileScannerErrorCallback");
        this.f22609n = detectionSpeed;
        this.f22610o = j10;
        this.f22611p = z10;
        w.i iVar = this.f22601f;
        if ((iVar != null ? iVar.b() : null) != null && this.f22602g != null && this.f22603h != null) {
            mobileScannerErrorCallback.invoke(new oi.a());
            return;
        }
        this.f22605j = null;
        vf.a b10 = bVar != null ? vf.c.b(bVar) : vf.c.a();
        kotlin.jvm.internal.n.b(b10);
        this.f22604i = b10;
        com.google.common.util.concurrent.f<androidx.camera.lifecycle.e> h10 = androidx.camera.lifecycle.e.h(this.f22596a);
        kotlin.jvm.internal.n.d(h10, "getInstance(...)");
        Executor mainExecutor = androidx.core.content.a.getMainExecutor(this.f22596a);
        h10.addListener(new Runnable() { // from class: oi.j

            /* renamed from: b */
            public final /* synthetic */ com.google.common.util.concurrent.f f22578b;

            /* renamed from: c */
            public final /* synthetic */ ok.l f22579c;

            /* renamed from: d */
            public final /* synthetic */ Size f22580d;

            /* renamed from: e */
            public final /* synthetic */ boolean f22581e;

            /* renamed from: f */
            public final /* synthetic */ w.p f22582f;

            /* renamed from: r */
            public final /* synthetic */ ok.l f22583r;

            /* renamed from: s */
            public final /* synthetic */ Executor f22584s;

            /* renamed from: t */
            public final /* synthetic */ boolean f22585t;

            /* renamed from: u */
            public final /* synthetic */ ok.l f22586u;

            /* renamed from: v */
            public final /* synthetic */ ok.l f22587v;

            public /* synthetic */ j(com.google.common.util.concurrent.f h102, ok.l mobileScannerErrorCallback2, Size size2, boolean z122, w.p cameraPosition2, ok.l mobileScannerStartedCallback2, Executor mainExecutor2, boolean z112, ok.l torchStateCallback2, ok.l zoomScaleStateCallback2) {
                r2 = h102;
                r3 = mobileScannerErrorCallback2;
                r4 = size2;
                r5 = z122;
                r6 = cameraPosition2;
                r7 = mobileScannerStartedCallback2;
                r8 = mainExecutor2;
                r9 = z112;
                r10 = torchStateCallback2;
                r11 = zoomScaleStateCallback2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s.N(s.this, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
            }
        }, mainExecutor2);
    }

    public final void S() {
        w.o b10;
        LiveData<Integer> g10;
        if (H()) {
            throw new oi.b();
        }
        if (this.f22607l != null) {
            Object systemService = this.f22596a.getApplicationContext().getSystemService("display");
            kotlin.jvm.internal.n.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            ((DisplayManager) systemService).unregisterDisplayListener(this.f22607l);
            this.f22607l = null;
        }
        ComponentCallbacks2 componentCallbacks2 = this.f22596a;
        kotlin.jvm.internal.n.c(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        androidx.lifecycle.k kVar = (androidx.lifecycle.k) componentCallbacks2;
        w.i iVar = this.f22601f;
        if (iVar != null && (b10 = iVar.b()) != null && (g10 = b10.g()) != null) {
            g10.removeObservers(kVar);
        }
        androidx.camera.lifecycle.e eVar = this.f22600e;
        if (eVar != null) {
            eVar.p();
        }
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.f22603h;
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
        }
        this.f22601f = null;
        this.f22602g = null;
        this.f22603h = null;
        this.f22600e = null;
    }

    public final void T(boolean z10) {
        w.i iVar;
        w.j a10;
        w.o b10;
        w.i iVar2 = this.f22601f;
        if (iVar2 == null) {
            return;
        }
        boolean z11 = false;
        if (iVar2 != null && (b10 = iVar2.b()) != null && b10.d()) {
            z11 = true;
        }
        if (!z11 || (iVar = this.f22601f) == null || (a10 = iVar.a()) == null) {
            return;
        }
        a10.g(z10);
    }

    public final void w(Uri image, ok.l<? super List<? extends Map<String, ? extends Object>>, ck.v> analyzerCallback) {
        kotlin.jvm.internal.n.e(image, "image");
        kotlin.jvm.internal.n.e(analyzerCallback, "analyzerCallback");
        ag.a a10 = ag.a.a(this.f22596a, image);
        kotlin.jvm.internal.n.d(a10, "fromFilePath(...)");
        this.f22604i.W(a10).addOnSuccessListener(new OnSuccessListener() { // from class: oi.k
            public /* synthetic */ k() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                s.x(ok.l.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: oi.l
            public /* synthetic */ l() {
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                s.y(s.this, exc);
            }
        });
    }
}
