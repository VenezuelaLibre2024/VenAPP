package sa;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import ca.C1906h;
import com.google.android.gms.dynamic.AbstractC5311a;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5315e;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p365ta.C11198c0;
import p365ta.InterfaceC11197c;
import ua.C11518v;

/* renamed from: sa.n */
/* loaded from: classes2.dex */
final class C10869n extends AbstractC5311a {

    /* renamed from: e */
    private final ViewGroup f27558e;

    /* renamed from: f */
    private final Context f27559f;

    /* renamed from: g */
    protected InterfaceC5315e f27560g;

    /* renamed from: h */
    private final GoogleMapOptions f27561h;

    /* renamed from: i */
    private final List f27562i = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10869n(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f27558e = viewGroup;
        this.f27559f = context;
        this.f27561h = googleMapOptions;
    }

    @Override // com.google.android.gms.dynamic.AbstractC5311a
    /* renamed from: a */
    protected final void mo13402a(InterfaceC5315e interfaceC5315e) {
        this.f27560g = interfaceC5315e;
        m33180q();
    }

    /* renamed from: p */
    public final void m33179p(InterfaceC10861f interfaceC10861f) {
        if (m13403b() != null) {
            ((C10868m) m13403b()).m33178a(interfaceC10861f);
        } else {
            this.f27562i.add(interfaceC10861f);
        }
    }

    /* renamed from: q */
    public final void m33180q() {
        if (this.f27560g == null || m13403b() != null) {
            return;
        }
        try {
            C10860e.m33154a(this.f27559f);
            InterfaceC11197c mo35106B1 = C11198c0.m35098a(this.f27559f, null).mo35106B1(BinderC5314d.m13412h2(this.f27559f), this.f27561h);
            if (mo35106B1 == null) {
                return;
            }
            this.f27560g.mo13413a(new C10868m(this.f27558e, mo35106B1));
            Iterator it = this.f27562i.iterator();
            while (it.hasNext()) {
                ((C10868m) m13403b()).m33178a((InterfaceC10861f) it.next());
            }
            this.f27562i.clear();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        } catch (C1906h unused) {
        }
    }
}
