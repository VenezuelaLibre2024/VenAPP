package sa;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ta.c0;

/* loaded from: classes2.dex */
final class n extends com.google.android.gms.dynamic.a {

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f25439e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f25440f;

    /* renamed from: g, reason: collision with root package name */
    protected com.google.android.gms.dynamic.e f25441g;

    /* renamed from: h, reason: collision with root package name */
    private final GoogleMapOptions f25442h;

    /* renamed from: i, reason: collision with root package name */
    private final List f25443i = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f25439e = viewGroup;
        this.f25440f = context;
        this.f25442h = googleMapOptions;
    }

    @Override // com.google.android.gms.dynamic.a
    protected final void a(com.google.android.gms.dynamic.e eVar) {
        this.f25441g = eVar;
        q();
    }

    public final void p(f fVar) {
        if (b() != null) {
            ((m) b()).a(fVar);
        } else {
            this.f25443i.add(fVar);
        }
    }

    public final void q() {
        if (this.f25441g == null || b() != null) {
            return;
        }
        try {
            e.a(this.f25440f);
            ta.c B1 = c0.a(this.f25440f, null).B1(com.google.android.gms.dynamic.d.h2(this.f25440f), this.f25442h);
            if (B1 == null) {
                return;
            }
            this.f25441g.a(new m(this.f25439e, B1));
            Iterator it = this.f25443i.iterator();
            while (it.hasNext()) {
                ((m) b()).a((f) it.next());
            }
            this.f25443i.clear();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        } catch (ca.h unused) {
        }
    }
}
