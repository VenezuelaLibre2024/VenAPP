package p278oi;

import ag.C0113a;
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
import androidx.camera.core.C0593f;
import androidx.camera.core.C0714s;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.lifecycle.C0724e;
import androidx.core.content.C0854a;
import androidx.core.util.InterfaceC0977a;
import androidx.lifecycle.InterfaceC1310k;
import androidx.lifecycle.InterfaceC1321s;
import androidx.lifecycle.LiveData;
import ck.C2037v;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import dk.C7033s;
import dk.C7042z;
import io.flutter.view.TextureRegistry;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p126h0.C7608c;
import p126h0.C7609d;
import p280ok.InterfaceC10004r;
import p280ok.InterfaceC9998l;
import p296pi.C10174c;
import p296pi.EnumC10173b;
import p316qi.C10494b;
import p318qk.C10519c;
import p402vf.C11886b;
import p402vf.C11887c;
import p402vf.InterfaceC11885a;
import p407w.C12015i1;
import p407w.C12030p;
import p407w.C12041u0;
import p407w.InterfaceC12013i;
import p407w.InterfaceC12016j;
import p407w.InterfaceC12021k1;
import p407w.InterfaceC12028o;
import p445xf.C12482a;

/* renamed from: oi.s */
/* loaded from: classes3.dex */
public final class C9971s {

    /* renamed from: a */
    private final Activity f24529a;

    /* renamed from: b */
    private final TextureRegistry f24530b;

    /* renamed from: c */
    private final InterfaceC10004r<List<? extends Map<String, ? extends Object>>, byte[], Integer, Integer, C2037v> f24531c;

    /* renamed from: d */
    private final InterfaceC9998l<String, C2037v> f24532d;

    /* renamed from: e */
    private C0724e f24533e;

    /* renamed from: f */
    private InterfaceC12013i f24534f;

    /* renamed from: g */
    private C0714s f24535g;

    /* renamed from: h */
    private TextureRegistry.SurfaceTextureEntry f24536h;

    /* renamed from: i */
    private InterfaceC11885a f24537i;

    /* renamed from: j */
    private List<String> f24538j;

    /* renamed from: k */
    private boolean f24539k;

    /* renamed from: l */
    private DisplayManager.DisplayListener f24540l;

    /* renamed from: m */
    private List<Float> f24541m;

    /* renamed from: n */
    private EnumC10173b f24542n;

    /* renamed from: o */
    private long f24543o;

    /* renamed from: p */
    private boolean f24544p;

    /* renamed from: q */
    private final C0593f.a f24545q;

    /* renamed from: oi.s$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<List<C12482a>, C2037v> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9998l<List<? extends Map<String, ? extends Object>>, C2037v> f24546a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC9998l<? super List<? extends Map<String, ? extends Object>>, C2037v> interfaceC9998l) {
            super(1);
            this.f24546a = interfaceC9998l;
        }

        /* renamed from: a */
        public final void m29799a(List<C12482a> list) {
            int m20590r;
            InterfaceC9998l<List<? extends Map<String, ? extends Object>>, C2037v> interfaceC9998l;
            C9322n.m27778b(list);
            List<C12482a> list2 = list;
            m20590r = C7033s.m20590r(list2, 10);
            ArrayList arrayList = new ArrayList(m20590r);
            for (C12482a c12482a : list2) {
                C9322n.m27778b(c12482a);
                arrayList.add(C9950a0.m29748m(c12482a));
            }
            if (!arrayList.isEmpty()) {
                interfaceC9998l = this.f24546a;
            } else {
                interfaceC9998l = this.f24546a;
                arrayList = null;
            }
            interfaceC9998l.invoke(arrayList);
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(List<C12482a> list) {
            m29799a(list);
            return C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oi.s$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC9323o implements InterfaceC9998l<List<C12482a>, C2037v> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC0710o f24548b;

        /* renamed from: c */
        final /* synthetic */ Image f24549c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0710o interfaceC0710o, Image image) {
            super(1);
            this.f24548b = interfaceC0710o;
            this.f24549c = image;
        }

        /* renamed from: a */
        public final void m29800a(List<C12482a> list) {
            InterfaceC12028o mo2999b;
            List m20624Z;
            if (C9971s.this.f24542n == EnumC10173b.NO_DUPLICATES) {
                C9322n.m27778b(list);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String m40760l = ((C12482a) it.next()).m40760l();
                    if (m40760l != null) {
                        arrayList.add(m40760l);
                    }
                }
                m20624Z = C7042z.m20624Z(arrayList);
                if (C9322n.m27777a(m20624Z, C9971s.this.f24538j)) {
                    return;
                }
                if (!m20624Z.isEmpty()) {
                    C9971s.this.f24538j = m20624Z;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C12482a c12482a : list) {
                if (C9971s.this.m29791F() != null) {
                    C9971s c9971s = C9971s.this;
                    List<Float> m29791F = c9971s.m29791F();
                    C9322n.m27778b(m29791F);
                    C9322n.m27778b(c12482a);
                    InterfaceC0710o imageProxy = this.f24548b;
                    C9322n.m27780d(imageProxy, "$imageProxy");
                    if (!c9971s.m29758G(m29791F, c12482a, imageProxy)) {
                    }
                } else {
                    C9322n.m27778b(c12482a);
                }
                arrayList2.add(C9950a0.m29748m(c12482a));
            }
            if (!arrayList2.isEmpty()) {
                if (!C9971s.this.f24544p) {
                    C9971s.this.f24531c.mo29818e(arrayList2, null, null, null);
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(this.f24549c.getWidth(), this.f24549c.getHeight(), Bitmap.Config.ARGB_8888);
                Context applicationContext = C9971s.this.f24529a.getApplicationContext();
                C9322n.m27780d(applicationContext, "getApplicationContext(...)");
                C10494b c10494b = new C10494b(applicationContext);
                Image image = this.f24549c;
                C9322n.m27778b(createBitmap);
                c10494b.m31576b(image, createBitmap);
                C9971s c9971s2 = C9971s.this;
                InterfaceC12013i interfaceC12013i = c9971s2.f24534f;
                Bitmap m29760J = c9971s2.m29760J(createBitmap, (interfaceC12013i == null || (mo2999b = interfaceC12013i.mo2999b()) == null) ? 90.0f : mo2999b.mo2558a());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                m29760J.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int width = m29760J.getWidth();
                int height = m29760J.getHeight();
                m29760J.recycle();
                C9971s.this.f24531c.mo29818e(arrayList2, byteArray, Integer.valueOf(width), Integer.valueOf(height));
            }
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(List<C12482a> list) {
            m29800a(list);
            return C2037v.f8089a;
        }
    }

    /* renamed from: oi.s$c */
    /* loaded from: classes3.dex */
    public static final class c implements DisplayManager.DisplayListener {

        /* renamed from: a */
        final /* synthetic */ boolean f24550a;

        /* renamed from: b */
        final /* synthetic */ Size f24551b;

        /* renamed from: c */
        final /* synthetic */ C0593f.c f24552c;

        /* renamed from: d */
        final /* synthetic */ C9971s f24553d;

        c(boolean z10, Size size, C0593f.c cVar, C9971s c9971s) {
            this.f24550a = z10;
            this.f24551b = size;
            this.f24552c = cVar;
            this.f24553d = c9971s;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (!this.f24550a) {
                this.f24552c.m2945o(this.f24553d.m29757E(this.f24551b));
                return;
            }
            C7608c.a aVar = new C7608c.a();
            aVar.m23124e(new C7609d(this.f24551b, 1));
            this.f24552c.m2940j(aVar.m23121a()).m2934c();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oi.s$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC9323o implements InterfaceC9998l<Integer, C2037v> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9998l<Integer, C2037v> f24554a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(InterfaceC9998l<? super Integer, C2037v> interfaceC9998l) {
            super(1);
            this.f24554a = interfaceC9998l;
        }

        /* renamed from: a */
        public final void m29801a(Integer num) {
            InterfaceC9998l<Integer, C2037v> interfaceC9998l = this.f24554a;
            C9322n.m27778b(num);
            interfaceC9998l.invoke(num);
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Integer num) {
            m29801a(num);
            return C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oi.s$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC9323o implements InterfaceC9998l<InterfaceC12021k1, C2037v> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9998l<Double, C2037v> f24555a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC9998l<? super Double, C2037v> interfaceC9998l) {
            super(1);
            this.f24555a = interfaceC9998l;
        }

        /* renamed from: a */
        public final void m29802a(InterfaceC12021k1 interfaceC12021k1) {
            this.f24555a.invoke(Double.valueOf(interfaceC12021k1.mo2792b()));
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(InterfaceC12021k1 interfaceC12021k1) {
            m29802a(interfaceC12021k1);
            return C2037v.f8089a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9971s(Activity activity, TextureRegistry textureRegistry, InterfaceC10004r<? super List<? extends Map<String, ? extends Object>>, ? super byte[], ? super Integer, ? super Integer, C2037v> mobileScannerCallback, InterfaceC9998l<? super String, C2037v> mobileScannerErrorCallback) {
        C9322n.m27781e(activity, "activity");
        C9322n.m27781e(textureRegistry, "textureRegistry");
        C9322n.m27781e(mobileScannerCallback, "mobileScannerCallback");
        C9322n.m27781e(mobileScannerErrorCallback, "mobileScannerErrorCallback");
        this.f24529a = activity;
        this.f24530b = textureRegistry;
        this.f24531c = mobileScannerCallback;
        this.f24532d = mobileScannerErrorCallback;
        InterfaceC11885a m38018a = C11887c.m38018a();
        C9322n.m27780d(m38018a, "getClient(...)");
        this.f24537i = m38018a;
        this.f24542n = EnumC10173b.NO_DUPLICATES;
        this.f24543o = 250L;
        this.f24545q = new C0593f.a() { // from class: oi.m
            @Override // androidx.camera.core.C0593f.a
            /* renamed from: b */
            public final void mo2930b(InterfaceC0710o interfaceC0710o) {
                C9971s.m29790z(C9971s.this, interfaceC0710o);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m29753A(InterfaceC9998l tmp0, Object obj) {
        C9322n.m27781e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m29754B(C9971s this$0, Exception e10) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(e10, "e");
        InterfaceC9998l<String, C2037v> interfaceC9998l = this$0.f24532d;
        String localizedMessage = e10.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = e10.toString();
        }
        interfaceC9998l.invoke(localizedMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m29755C(InterfaceC0710o imageProxy, Task it) {
        C9322n.m27781e(imageProxy, "$imageProxy");
        C9322n.m27781e(it, "it");
        imageProxy.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m29756D(C9971s this$0) {
        C9322n.m27781e(this$0, "this$0");
        this$0.f24539k = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final Size m29757E(Size size) {
        Display defaultDisplay;
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = this.f24529a.getDisplay();
            C9322n.m27778b(defaultDisplay);
        } else {
            Object systemService = this.f24529a.getApplicationContext().getSystemService("window");
            C9322n.m27779c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        }
        int rotation = defaultDisplay.getRotation();
        int width = size.getWidth();
        int height = size.getHeight();
        return (rotation == 0 || rotation == 2) ? new Size(width, height) : new Size(height, width);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final boolean m29758G(List<Float> list, C12482a c12482a, InterfaceC0710o interfaceC0710o) {
        int m31587a;
        int m31587a2;
        int m31587a3;
        int m31587a4;
        Rect m40749a = c12482a.m40749a();
        if (m40749a == null) {
            return false;
        }
        int height = interfaceC0710o.getHeight();
        int width = interfaceC0710o.getWidth();
        float f10 = height;
        m31587a = C10519c.m31587a(list.get(0).floatValue() * f10);
        float f11 = width;
        m31587a2 = C10519c.m31587a(list.get(1).floatValue() * f11);
        m31587a3 = C10519c.m31587a(list.get(2).floatValue() * f10);
        m31587a4 = C10519c.m31587a(list.get(3).floatValue() * f11);
        return new Rect(m31587a, m31587a2, m31587a3, m31587a4).contains(m40749a);
    }

    /* renamed from: H */
    private final boolean m29759H() {
        return this.f24534f == null && this.f24535g == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final Bitmap m29760J(Bitmap bitmap, float f10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f10);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        C9322n.m27780d(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public static final void m29761N(final C9971s this$0, InterfaceFutureC5920f cameraProviderFuture, InterfaceC9998l mobileScannerErrorCallback, Size size, boolean z10, C12030p cameraPosition, InterfaceC9998l mobileScannerStartedCallback, final Executor executor, boolean z11, InterfaceC9998l torchStateCallback, InterfaceC9998l zoomScaleStateCallback) {
        int i10;
        InterfaceC12028o mo2999b;
        InterfaceC12028o mo2999b2;
        List<InterfaceC12028o> m3613f;
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(cameraProviderFuture, "$cameraProviderFuture");
        C9322n.m27781e(mobileScannerErrorCallback, "$mobileScannerErrorCallback");
        C9322n.m27781e(cameraPosition, "$cameraPosition");
        C9322n.m27781e(mobileScannerStartedCallback, "$mobileScannerStartedCallback");
        C9322n.m27781e(torchStateCallback, "$torchStateCallback");
        C9322n.m27781e(zoomScaleStateCallback, "$zoomScaleStateCallback");
        C0724e c0724e = (C0724e) cameraProviderFuture.get();
        this$0.f24533e = c0724e;
        InterfaceC12013i interfaceC12013i = null;
        Integer valueOf = (c0724e == null || (m3613f = c0724e.m3613f()) == null) ? null : Integer.valueOf(m3613f.size());
        C0724e c0724e2 = this$0.f24533e;
        if (c0724e2 == null) {
            mobileScannerErrorCallback.invoke(new C9957e());
            return;
        }
        if (c0724e2 != null) {
            c0724e2.m3614p();
        }
        this$0.f24536h = this$0.f24530b.createSurfaceTexture();
        C0714s.c cVar = new C0714s.c() { // from class: oi.n
            @Override // androidx.camera.core.C0714s.c
            /* renamed from: a */
            public final void mo3527a(C12015i1 c12015i1) {
                C9971s.m29764Q(C9971s.this, executor, c12015i1);
            }
        };
        C0714s m3518c = new C0714s.a().m3518c();
        m3518c.m3514j0(cVar);
        this$0.f24535g = m3518c;
        C0593f.c m2936f = new C0593f.c().m2936f(0);
        C9322n.m27780d(m2936f, "setBackpressureStrategy(...)");
        Object systemService = this$0.f24529a.getApplicationContext().getSystemService("display");
        C9322n.m27779c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        DisplayManager displayManager = (DisplayManager) systemService;
        if (size != null) {
            if (z10) {
                C7608c.a aVar = new C7608c.a();
                aVar.m23124e(new C7609d(size, 1));
                m2936f.m2940j(aVar.m23121a()).m2934c();
            } else {
                m2936f.m2945o(this$0.m29757E(size));
            }
            if (this$0.f24540l == null) {
                c cVar2 = new c(z10, size, m2936f, this$0);
                this$0.f24540l = cVar2;
                displayManager.registerDisplayListener(cVar2, null);
            }
        }
        C0593f m2934c = m2936f.m2934c();
        m2934c.m2927k0(executor, this$0.f24545q);
        C9322n.m27780d(m2934c, "apply(...)");
        try {
            C0724e c0724e3 = this$0.f24533e;
            if (c0724e3 != null) {
                ComponentCallbacks2 componentCallbacks2 = this$0.f24529a;
                C9322n.m27779c(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                i10 = 0;
                interfaceC12013i = c0724e3.m3612e((InterfaceC1310k) componentCallbacks2, cameraPosition, this$0.f24535g, m2934c);
            } else {
                i10 = 0;
            }
            this$0.f24534f = interfaceC12013i;
            if (interfaceC12013i != null) {
                LiveData<Integer> mo2564g = interfaceC12013i.mo2999b().mo2564g();
                ComponentCallbacks2 componentCallbacks22 = this$0.f24529a;
                C9322n.m27779c(componentCallbacks22, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                final d dVar = new d(torchStateCallback);
                mo2564g.observe((InterfaceC1310k) componentCallbacks22, new InterfaceC1321s() { // from class: oi.o
                    @Override // androidx.lifecycle.InterfaceC1321s
                    /* renamed from: a */
                    public final void mo2553a(Object obj) {
                        C9971s.m29763P(InterfaceC9998l.this, obj);
                    }
                });
                LiveData<InterfaceC12021k1> mo2566j = interfaceC12013i.mo2999b().mo2566j();
                InterfaceC1310k interfaceC1310k = (InterfaceC1310k) this$0.f24529a;
                final e eVar = new e(zoomScaleStateCallback);
                mo2566j.observe(interfaceC1310k, new InterfaceC1321s() { // from class: oi.p
                    @Override // androidx.lifecycle.InterfaceC1321s
                    /* renamed from: a */
                    public final void mo2553a(Object obj) {
                        C9971s.m29762O(InterfaceC9998l.this, obj);
                    }
                });
                if (interfaceC12013i.mo2999b().mo2561d()) {
                    interfaceC12013i.mo2998a().mo2732g(z11);
                }
            }
            C12041u0 m2924e0 = m2934c.m2924e0();
            C9322n.m27778b(m2924e0);
            Size m38664a = m2924e0.m38664a();
            C9322n.m27780d(m38664a, "getResolution(...)");
            double width = m38664a.getWidth();
            double height = m38664a.getHeight();
            InterfaceC12013i interfaceC12013i2 = this$0.f24534f;
            int i11 = ((interfaceC12013i2 == null || (mo2999b2 = interfaceC12013i2.mo2999b()) == null) ? i10 : mo2999b2.mo2558a()) % 180 != 0 ? i10 : 1;
            double d10 = i11 != 0 ? width : height;
            double d11 = i11 != 0 ? height : width;
            InterfaceC12013i interfaceC12013i3 = this$0.f24534f;
            boolean mo2561d = (interfaceC12013i3 == null || (mo2999b = interfaceC12013i3.mo2999b()) == null) ? i10 : mo2999b.mo2561d();
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this$0.f24536h;
            C9322n.m27778b(surfaceTextureEntry);
            mobileScannerStartedCallback.invoke(new C10174c(d10, d11, mo2561d, surfaceTextureEntry.mo24664id(), valueOf != null ? valueOf.intValue() : i10));
        } catch (Exception unused) {
            mobileScannerErrorCallback.invoke(new C9952b0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m29762O(InterfaceC9998l tmp0, Object obj) {
        C9322n.m27781e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m29763P(InterfaceC9998l tmp0, Object obj) {
        C9322n.m27781e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m29764Q(C9971s this$0, Executor executor, C12015i1 request) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(request, "request");
        if (this$0.m29759H()) {
            return;
        }
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this$0.f24536h;
        C9322n.m27778b(surfaceTextureEntry);
        SurfaceTexture surfaceTexture = surfaceTextureEntry.surfaceTexture();
        C9322n.m27780d(surfaceTexture, "surfaceTexture(...)");
        surfaceTexture.setDefaultBufferSize(request.m38612k().getWidth(), request.m38612k().getHeight());
        request.m38613v(new Surface(surfaceTexture), executor, new InterfaceC0977a() { // from class: oi.q
            @Override // androidx.core.util.InterfaceC0977a
            public final void accept(Object obj) {
                C9971s.m29765R((C12015i1.g) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m29765R(C12015i1.g gVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m29788x(InterfaceC9998l tmp0, Object obj) {
        C9322n.m27781e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m29789y(C9971s this$0, Exception e10) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(e10, "e");
        InterfaceC9998l<String, C2037v> interfaceC9998l = this$0.f24532d;
        String localizedMessage = e10.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = e10.toString();
        }
        interfaceC9998l.invoke(localizedMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m29790z(final C9971s this$0, final InterfaceC0710o imageProxy) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(imageProxy, "imageProxy");
        Image mo2884k1 = imageProxy.mo2884k1();
        if (mo2884k1 == null) {
            return;
        }
        C0113a m531b = C0113a.m531b(mo2884k1, imageProxy.mo2883e1().mo8854d());
        C9322n.m27780d(m531b, "fromMediaImage(...)");
        EnumC10173b enumC10173b = this$0.f24542n;
        EnumC10173b enumC10173b2 = EnumC10173b.NORMAL;
        if (enumC10173b == enumC10173b2 && this$0.f24539k) {
            imageProxy.close();
            return;
        }
        if (enumC10173b == enumC10173b2) {
            this$0.f24539k = true;
        }
        Task<List<C12482a>> mo18348W = this$0.f24537i.mo18348W(m531b);
        final b bVar = new b(imageProxy, mo2884k1);
        mo18348W.addOnSuccessListener(new OnSuccessListener() { // from class: oi.r
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C9971s.m29753A(InterfaceC9998l.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: oi.g
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C9971s.m29754B(C9971s.this, exc);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: oi.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C9971s.m29755C(InterfaceC0710o.this, task);
            }
        });
        if (this$0.f24542n == enumC10173b2) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: oi.i
                @Override // java.lang.Runnable
                public final void run() {
                    C9971s.m29756D(C9971s.this);
                }
            }, this$0.f24543o);
        }
    }

    /* renamed from: F */
    public final List<Float> m29791F() {
        return this.f24541m;
    }

    /* renamed from: I */
    public final void m29792I() {
        InterfaceC12016j mo2998a;
        InterfaceC12013i interfaceC12013i = this.f24534f;
        if (interfaceC12013i == null) {
            throw new C9956d0();
        }
        if (interfaceC12013i == null || (mo2998a = interfaceC12013i.mo2998a()) == null) {
            return;
        }
        mo2998a.mo2726d(1.0f);
    }

    /* renamed from: K */
    public final void m29793K(double d10) {
        InterfaceC12016j mo2998a;
        if (d10 > 1.0d || d10 < 0.0d) {
            throw new C9954c0();
        }
        InterfaceC12013i interfaceC12013i = this.f24534f;
        if (interfaceC12013i == null) {
            throw new C9956d0();
        }
        if (interfaceC12013i == null || (mo2998a = interfaceC12013i.mo2998a()) == null) {
            return;
        }
        mo2998a.mo2722b((float) d10);
    }

    /* renamed from: L */
    public final void m29794L(List<Float> list) {
        this.f24541m = list;
    }

    /* renamed from: M */
    public final void m29795M(C11886b c11886b, boolean z10, final C12030p cameraPosition, final boolean z11, EnumC10173b detectionSpeed, final InterfaceC9998l<? super Integer, C2037v> torchStateCallback, final InterfaceC9998l<? super Double, C2037v> zoomScaleStateCallback, final InterfaceC9998l<? super C10174c, C2037v> mobileScannerStartedCallback, final InterfaceC9998l<? super Exception, C2037v> mobileScannerErrorCallback, long j10, final Size size, final boolean z12) {
        C9322n.m27781e(cameraPosition, "cameraPosition");
        C9322n.m27781e(detectionSpeed, "detectionSpeed");
        C9322n.m27781e(torchStateCallback, "torchStateCallback");
        C9322n.m27781e(zoomScaleStateCallback, "zoomScaleStateCallback");
        C9322n.m27781e(mobileScannerStartedCallback, "mobileScannerStartedCallback");
        C9322n.m27781e(mobileScannerErrorCallback, "mobileScannerErrorCallback");
        this.f24542n = detectionSpeed;
        this.f24543o = j10;
        this.f24544p = z10;
        InterfaceC12013i interfaceC12013i = this.f24534f;
        if ((interfaceC12013i != null ? interfaceC12013i.mo2999b() : null) != null && this.f24535g != null && this.f24536h != null) {
            mobileScannerErrorCallback.invoke(new C9949a());
            return;
        }
        this.f24538j = null;
        InterfaceC11885a m38019b = c11886b != null ? C11887c.m38019b(c11886b) : C11887c.m38018a();
        C9322n.m27778b(m38019b);
        this.f24537i = m38019b;
        final InterfaceFutureC5920f<C0724e> m3603h = C0724e.m3603h(this.f24529a);
        C9322n.m27780d(m3603h, "getInstance(...)");
        final Executor mainExecutor = C0854a.getMainExecutor(this.f24529a);
        m3603h.addListener(new Runnable() { // from class: oi.j
            @Override // java.lang.Runnable
            public final void run() {
                C9971s.m29761N(C9971s.this, m3603h, mobileScannerErrorCallback, size, z12, cameraPosition, mobileScannerStartedCallback, mainExecutor, z11, torchStateCallback, zoomScaleStateCallback);
            }
        }, mainExecutor);
    }

    /* renamed from: S */
    public final void m29796S() {
        InterfaceC12028o mo2999b;
        LiveData<Integer> mo2564g;
        if (m29759H()) {
            throw new C9951b();
        }
        if (this.f24540l != null) {
            Object systemService = this.f24529a.getApplicationContext().getSystemService("display");
            C9322n.m27779c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            ((DisplayManager) systemService).unregisterDisplayListener(this.f24540l);
            this.f24540l = null;
        }
        ComponentCallbacks2 componentCallbacks2 = this.f24529a;
        C9322n.m27779c(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        InterfaceC1310k interfaceC1310k = (InterfaceC1310k) componentCallbacks2;
        InterfaceC12013i interfaceC12013i = this.f24534f;
        if (interfaceC12013i != null && (mo2999b = interfaceC12013i.mo2999b()) != null && (mo2564g = mo2999b.mo2564g()) != null) {
            mo2564g.removeObservers(interfaceC1310k);
        }
        C0724e c0724e = this.f24533e;
        if (c0724e != null) {
            c0724e.m3614p();
        }
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.f24536h;
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
        }
        this.f24534f = null;
        this.f24535g = null;
        this.f24536h = null;
        this.f24533e = null;
    }

    /* renamed from: T */
    public final void m29797T(boolean z10) {
        InterfaceC12013i interfaceC12013i;
        InterfaceC12016j mo2998a;
        InterfaceC12028o mo2999b;
        InterfaceC12013i interfaceC12013i2 = this.f24534f;
        if (interfaceC12013i2 == null) {
            return;
        }
        boolean z11 = false;
        if (interfaceC12013i2 != null && (mo2999b = interfaceC12013i2.mo2999b()) != null && mo2999b.mo2561d()) {
            z11 = true;
        }
        if (!z11 || (interfaceC12013i = this.f24534f) == null || (mo2998a = interfaceC12013i.mo2998a()) == null) {
            return;
        }
        mo2998a.mo2732g(z10);
    }

    /* renamed from: w */
    public final void m29798w(Uri image, InterfaceC9998l<? super List<? extends Map<String, ? extends Object>>, C2037v> analyzerCallback) {
        C9322n.m27781e(image, "image");
        C9322n.m27781e(analyzerCallback, "analyzerCallback");
        C0113a m530a = C0113a.m530a(this.f24529a, image);
        C9322n.m27780d(m530a, "fromFilePath(...)");
        Task<List<C12482a>> mo18348W = this.f24537i.mo18348W(m530a);
        final a aVar = new a(analyzerCallback);
        mo18348W.addOnSuccessListener(new OnSuccessListener() { // from class: oi.k
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C9971s.m29788x(InterfaceC9998l.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: oi.l
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C9971s.m29789y(C9971s.this, exc);
            }
        });
    }
}
