package sa;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5313c;
import p365ta.C11196b0;
import p365ta.InterfaceC11197c;
import ua.C11518v;

/* renamed from: sa.m */
/* loaded from: classes2.dex */
final class C10868m implements InterfaceC5313c {

    /* renamed from: a */
    private final ViewGroup f27555a;

    /* renamed from: b */
    private final InterfaceC11197c f27556b;

    /* renamed from: c */
    private View f27557c;

    public C10868m(ViewGroup viewGroup, InterfaceC11197c interfaceC11197c) {
        this.f27556b = (InterfaceC11197c) C5276s.m13324j(interfaceC11197c);
        this.f27555a = (ViewGroup) C5276s.m13324j(viewGroup);
    }

    /* renamed from: a */
    public final void m33178a(InterfaceC10861f interfaceC10861f) {
        try {
            this.f27556b.mo35097T0(new BinderC10867l(this, interfaceC10861f));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC5313c
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C11196b0.m35094b(bundle, bundle2);
            this.f27556b.onCreate(bundle2);
            C11196b0.m35094b(bundle2, bundle);
            this.f27557c = (View) BinderC5314d.m13411g2(this.f27556b.getView());
            this.f27555a.removeAllViews();
            this.f27555a.addView(this.f27557c);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC5313c
    public final void onDestroy() {
        try {
            this.f27556b.onDestroy();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC5313c
    public final void onResume() {
        try {
            this.f27556b.onResume();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC5313c
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C11196b0.m35094b(bundle, bundle2);
            this.f27556b.onSaveInstanceState(bundle2);
            C11196b0.m35094b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC5313c
    public final void onStart() {
        try {
            this.f27556b.onStart();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC5313c
    public final void onStop() {
        try {
            this.f27556b.onStop();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }
}
