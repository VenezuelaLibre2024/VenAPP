package p163ih;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: ih.o */
/* loaded from: classes3.dex */
public class C7998o {

    /* renamed from: a */
    private int f19462a;

    /* renamed from: b */
    private WindowManager f19463b;

    /* renamed from: c */
    private OrientationEventListener f19464c;

    /* renamed from: d */
    private InterfaceC7997n f19465d;

    /* renamed from: ih.o$a */
    /* loaded from: classes3.dex */
    class a extends OrientationEventListener {
        a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation;
            WindowManager windowManager = C7998o.this.f19463b;
            InterfaceC7997n interfaceC7997n = C7998o.this.f19465d;
            if (C7998o.this.f19463b == null || interfaceC7997n == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == C7998o.this.f19462a) {
                return;
            }
            C7998o.this.f19462a = rotation;
            interfaceC7997n.mo19449a(rotation);
        }
    }

    /* renamed from: e */
    public void m24566e(Context context, InterfaceC7997n interfaceC7997n) {
        m24567f();
        Context applicationContext = context.getApplicationContext();
        this.f19465d = interfaceC7997n;
        this.f19463b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f19464c = aVar;
        aVar.enable();
        this.f19462a = this.f19463b.getDefaultDisplay().getRotation();
    }

    /* renamed from: f */
    public void m24567f() {
        OrientationEventListener orientationEventListener = this.f19464c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f19464c = null;
        this.f19463b = null;
        this.f19465d = null;
    }
}
