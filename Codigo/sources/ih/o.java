package ih;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private int f17799a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f17800b;

    /* renamed from: c, reason: collision with root package name */
    private OrientationEventListener f17801c;

    /* renamed from: d, reason: collision with root package name */
    private n f17802d;

    /* loaded from: classes3.dex */
    class a extends OrientationEventListener {
        a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation;
            WindowManager windowManager = o.this.f17800b;
            n nVar = o.this.f17802d;
            if (o.this.f17800b == null || nVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == o.this.f17799a) {
                return;
            }
            o.this.f17799a = rotation;
            nVar.a(rotation);
        }
    }

    public void e(Context context, n nVar) {
        f();
        Context applicationContext = context.getApplicationContext();
        this.f17802d = nVar;
        this.f17800b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f17801c = aVar;
        aVar.enable();
        this.f17799a = this.f17800b.getDefaultDisplay().getRotation();
    }

    public void f() {
        OrientationEventListener orientationEventListener = this.f17801c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f17801c = null;
        this.f17800b = null;
        this.f17802d = null;
    }
}
