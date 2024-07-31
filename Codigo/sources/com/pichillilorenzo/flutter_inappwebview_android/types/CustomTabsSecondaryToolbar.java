package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class CustomTabsSecondaryToolbar {
    private List<AndroidResource> clickableIDs;
    private AndroidResource layout;

    public CustomTabsSecondaryToolbar(AndroidResource androidResource, List<AndroidResource> list) {
        new ArrayList();
        this.layout = androidResource;
        this.clickableIDs = list;
    }

    public static CustomTabsSecondaryToolbar fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        AndroidResource fromMap = AndroidResource.fromMap((Map) map.get("layout"));
        ArrayList arrayList = new ArrayList();
        List list = (List) map.get("clickableIDs");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AndroidResource fromMap2 = AndroidResource.fromMap((Map) ((Map) it.next()).get(FacebookMediationAdapter.KEY_ID));
                if (fromMap2 != null) {
                    arrayList.add(fromMap2);
                }
            }
        }
        return new CustomTabsSecondaryToolbar(fromMap, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsSecondaryToolbar customTabsSecondaryToolbar = (CustomTabsSecondaryToolbar) obj;
        if (this.layout.equals(customTabsSecondaryToolbar.layout)) {
            return this.clickableIDs.equals(customTabsSecondaryToolbar.clickableIDs);
        }
        return false;
    }

    public List<AndroidResource> getClickableIDs() {
        return this.clickableIDs;
    }

    public AndroidResource getLayout() {
        return this.layout;
    }

    public int hashCode() {
        return (this.layout.hashCode() * 31) + this.clickableIDs.hashCode();
    }

    public void setClickableIDs(List<AndroidResource> list) {
        this.clickableIDs = list;
    }

    public void setLayout(AndroidResource androidResource) {
        this.layout = androidResource;
    }

    public String toString() {
        return "CustomTabsSecondaryToolbar{layout=" + this.layout + ", clickableIDs=" + this.clickableIDs + '}';
    }
}
