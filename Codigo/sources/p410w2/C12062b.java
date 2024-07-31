package p410w2;

import android.location.Address;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: w2.b */
/* loaded from: classes.dex */
public class C12062b {
    /* renamed from: a */
    private static Map<String, Object> m38731a(Address address) {
        HashMap hashMap = new HashMap();
        String m38730a = C12061a.m38730a(address.getAddressLine(0));
        hashMap.put("name", address.getFeatureName());
        hashMap.put("street", m38730a);
        hashMap.put("isoCountryCode", address.getCountryCode());
        hashMap.put("country", address.getCountryName());
        hashMap.put("thoroughfare", address.getThoroughfare());
        hashMap.put("subThoroughfare", address.getSubThoroughfare());
        hashMap.put("postalCode", address.getPostalCode());
        hashMap.put("administrativeArea", address.getAdminArea());
        hashMap.put("subAdministrativeArea", address.getSubAdminArea());
        hashMap.put("locality", address.getLocality());
        hashMap.put("subLocality", address.getSubLocality());
        return hashMap;
    }

    /* renamed from: b */
    public static List<Map<String, Object>> m38732b(List<Address> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Address> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m38731a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<Map<String, Object>> m38733c(List<Address> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Address> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m38734d(it.next()));
        }
        return arrayList;
    }

    /* renamed from: d */
    private static Map<String, Object> m38734d(Address address) {
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.valueOf(address.getLatitude()));
        hashMap.put("longitude", Double.valueOf(address.getLongitude()));
        hashMap.put(Constants.TIMESTAMP, Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis()));
        return hashMap;
    }
}
