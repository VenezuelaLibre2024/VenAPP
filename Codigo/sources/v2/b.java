package v2;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27876a;

    /* renamed from: b, reason: collision with root package name */
    private Locale f27877b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Geocoder.GeocodeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v2.a f27878a;

        a(v2.a aVar) {
            this.f27878a = aVar;
        }

        @Override // android.location.Geocoder.GeocodeListener
        public void onError(String str) {
            this.f27878a.onError(str);
        }

        @Override // android.location.Geocoder.GeocodeListener
        public void onGeocode(List<Address> list) {
            this.f27878a.onGeocode(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0455b implements Geocoder.GeocodeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v2.a f27880a;

        C0455b(v2.a aVar) {
            this.f27880a = aVar;
        }

        @Override // android.location.Geocoder.GeocodeListener
        public void onError(String str) {
            this.f27880a.onError(str);
        }

        @Override // android.location.Geocoder.GeocodeListener
        public void onGeocode(List<Address> list) {
            this.f27880a.onGeocode(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f27876a = context;
    }

    private static Geocoder a(Context context, Locale locale) {
        return locale != null ? new Geocoder(context, locale) : new Geocoder(context);
    }

    private List<Address> b(Geocoder geocoder, double d10, double d11) {
        return geocoder.getFromLocation(d10, d11, 5);
    }

    private List<Address> c(Geocoder geocoder, String str) {
        return geocoder.getFromLocationName(str, 5);
    }

    private void d(Geocoder geocoder, String str, int i10, v2.a aVar) {
        geocoder.getFromLocationName(str, i10, new a(aVar));
    }

    private void e(Geocoder geocoder, double d10, double d11, int i10, v2.a aVar) {
        geocoder.getFromLocation(d10, d11, i10, new C0455b(aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return Geocoder.isPresent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(String str, v2.a aVar) {
        Geocoder a10 = a(this.f27876a, this.f27877b);
        if (Build.VERSION.SDK_INT >= 33) {
            d(a10, str, 5, aVar);
            return;
        }
        try {
            aVar.onGeocode(c(a10, str));
        } catch (IOException e10) {
            aVar.onError(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(double d10, double d11, v2.a aVar) {
        Geocoder a10 = a(this.f27876a, this.f27877b);
        if (Build.VERSION.SDK_INT >= 33) {
            e(a10, d10, d11, 5, aVar);
            return;
        }
        try {
            aVar.onGeocode(b(a10, d10, d11));
        } catch (IOException e10) {
            aVar.onError(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Locale locale) {
        this.f27877b = locale;
    }
}
