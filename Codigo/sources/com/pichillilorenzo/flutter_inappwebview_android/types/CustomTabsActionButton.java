package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public class CustomTabsActionButton {
    private String description;
    private byte[] icon;

    /* renamed from: id, reason: collision with root package name */
    private int f13549id;
    private boolean shouldTint;

    public CustomTabsActionButton(int i10, byte[] bArr, String str, boolean z10) {
        this.f13549id = i10;
        this.icon = bArr;
        this.description = str;
        this.shouldTint = z10;
    }

    public static CustomTabsActionButton fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsActionButton(((Integer) map.get(FacebookMediationAdapter.KEY_ID)).intValue(), (byte[]) map.get("icon"), (String) map.get("description"), ((Boolean) map.get("shouldTint")).booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsActionButton customTabsActionButton = (CustomTabsActionButton) obj;
        if (this.f13549id == customTabsActionButton.f13549id && this.shouldTint == customTabsActionButton.shouldTint && Arrays.equals(this.icon, customTabsActionButton.icon)) {
            return this.description.equals(customTabsActionButton.description);
        }
        return false;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getIcon() {
        return this.icon;
    }

    public int getId() {
        return this.f13549id;
    }

    public int hashCode() {
        return (((((this.f13549id * 31) + Arrays.hashCode(this.icon)) * 31) + this.description.hashCode()) * 31) + (this.shouldTint ? 1 : 0);
    }

    public boolean isShouldTint() {
        return this.shouldTint;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcon(byte[] bArr) {
        this.icon = bArr;
    }

    public void setId(int i10) {
        this.f13549id = i10;
    }

    public void setShouldTint(boolean z10) {
        this.shouldTint = z10;
    }

    public String toString() {
        return "CustomTabsActionButton{id=" + this.f13549id + ", icon=" + Arrays.toString(this.icon) + ", description='" + this.description + "', shouldTint=" + this.shouldTint + '}';
    }
}
