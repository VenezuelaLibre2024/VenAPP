package p392v2;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* renamed from: v2.b */
/* loaded from: classes.dex */
class C11616b {

    /* renamed from: a */
    private final Context f30200a;

    /* renamed from: b */
    private Locale f30201b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.b$a */
    /* loaded from: classes.dex */
    public class a implements Geocoder.GeocodeListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11615a f30202a;

        a(InterfaceC11615a interfaceC11615a) {
            this.f30202a = interfaceC11615a;
        }

        @Override // android.location.Geocoder.GeocodeListener
        public void onError(String str) {
            this.f30202a.onError(str);
        }

        @Override // android.location.Geocoder.GeocodeListener
        public void onGeocode(List<Address> list) {
            this.f30202a.onGeocode(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.b$b */
    /* loaded from: classes.dex */
    public class b implements Geocoder.GeocodeListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11615a f30204a;

        b(InterfaceC11615a interfaceC11615a) {
            this.f30204a = interfaceC11615a;
        }

        @Override // android.location.Geocoder.GeocodeListener
        public void onError(String str) {
            this.f30204a.onError(str);
        }

        @Override // android.location.Geocoder.GeocodeListener
        public void onGeocode(List<Address> list) {
            this.f30204a.onGeocode(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11616b(Context context) {
        this.f30200a = context;
    }

    /* renamed from: a */
    private static Geocoder m36398a(Context context, Locale locale) {
        return locale != null ? new Geocoder(context, locale) : new Geocoder(context);
    }

    /* renamed from: b */
    private List<Address> m36399b(Geocoder geocoder, double d10, double d11) {
        return geocoder.getFromLocation(d10, d11, 5);
    }

    /* renamed from: c */
    private List<Address> m36400c(Geocoder geocoder, String str) {
        return geocoder.getFromLocationName(str, 5);
    }

    /* renamed from: d */
    private void m36401d(Geocoder geocoder, String str, int i10, InterfaceC11615a interfaceC11615a) {
        geocoder.getFromLocationName(str, i10, new a(interfaceC11615a));
    }

    /* renamed from: e */
    private void m36402e(Geocoder geocoder, double d10, double d11, int i10, InterfaceC11615a interfaceC11615a) {
        geocoder.getFromLocation(d10, d11, i10, new b(interfaceC11615a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m36403f() {
        return Geocoder.isPresent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m36404g(String str, InterfaceC11615a interfaceC11615a) {
        Geocoder m36398a = m36398a(this.f30200a, this.f30201b);
        if (Build.VERSION.SDK_INT >= 33) {
            m36401d(m36398a, str, 5, interfaceC11615a);
            return;
        }
        try {
            interfaceC11615a.onGeocode(m36400c(m36398a, str));
        } catch (IOException e10) {
            interfaceC11615a.onError(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m36405h(double d10, double d11, InterfaceC11615a interfaceC11615a) {
        Geocoder m36398a = m36398a(this.f30200a, this.f30201b);
        if (Build.VERSION.SDK_INT >= 33) {
            m36402e(m36398a, d10, d11, 5, interfaceC11615a);
            return;
        }
        try {
            interfaceC11615a.onGeocode(m36399b(m36398a, d10, d11));
        } catch (IOException e10) {
            interfaceC11615a.onError(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m36406i(Locale locale) {
        this.f30201b = locale;
    }
}
