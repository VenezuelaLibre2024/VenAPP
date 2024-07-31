package sa;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import ta.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m implements com.google.android.gms.dynamic.c {

    /* renamed from: a */
    private final ViewGroup f25436a;

    /* renamed from: b */
    private final ta.c f25437b;

    /* renamed from: c */
    private View f25438c;

    public m(ViewGroup viewGroup, ta.c cVar) {
        this.f25437b = (ta.c) com.google.android.gms.common.internal.s.j(cVar);
        this.f25436a = (ViewGroup) com.google.android.gms.common.internal.s.j(viewGroup);
    }

    public final void a(f fVar) {
        try {
            this.f25437b.T0(new l(this, fVar));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            b0.b(bundle, bundle2);
            this.f25437b.onCreate(bundle2);
            b0.b(bundle2, bundle);
            this.f25438c = (View) com.google.android.gms.dynamic.d.g2(this.f25437b.getView());
            this.f25436a.removeAllViews();
            this.f25436a.addView(this.f25438c);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onDestroy() {
        try {
            this.f25437b.onDestroy();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onResume() {
        try {
            this.f25437b.onResume();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            b0.b(bundle, bundle2);
            this.f25437b.onSaveInstanceState(bundle2);
            b0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStart() {
        try {
            this.f25437b.onStart();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStop() {
        try {
            this.f25437b.onStop();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }
}
