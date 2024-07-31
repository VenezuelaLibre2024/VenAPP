package v2;

import android.location.Address;
import java.util.List;

/* loaded from: classes.dex */
public interface a {
    void onError(String str);

    void onGeocode(List<Address> list);
}
