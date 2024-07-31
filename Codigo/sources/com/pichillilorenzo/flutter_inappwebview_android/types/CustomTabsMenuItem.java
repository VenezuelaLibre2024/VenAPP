package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Map;

/* loaded from: classes3.dex */
public class CustomTabsMenuItem {

    /* renamed from: id, reason: collision with root package name */
    private int f13550id;
    private String label;

    public CustomTabsMenuItem(int i10, String str) {
        this.f13550id = i10;
        this.label = str;
    }

    public static CustomTabsMenuItem fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsMenuItem(((Integer) map.get(FacebookMediationAdapter.KEY_ID)).intValue(), (String) map.get("label"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsMenuItem customTabsMenuItem = (CustomTabsMenuItem) obj;
        if (this.f13550id != customTabsMenuItem.f13550id) {
            return false;
        }
        return this.label.equals(customTabsMenuItem.label);
    }

    public int getId() {
        return this.f13550id;
    }

    public String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.f13550id * 31) + this.label.hashCode();
    }

    public void setId(int i10) {
        this.f13550id = i10;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String toString() {
        return "CustomTabsMenuItem{id=" + this.f13550id + ", label='" + this.label + "'}";
    }
}
