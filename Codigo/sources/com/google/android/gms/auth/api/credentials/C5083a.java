package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

@Deprecated
/* renamed from: com.google.android.gms.auth.api.credentials.a */
/* loaded from: classes.dex */
public final class C5083a extends AbstractC7138a {
    public static final Parcelable.Creator<C5083a> CREATOR = new C5086d();

    /* renamed from: a */
    final int f10302a;

    /* renamed from: b */
    private final boolean f10303b;

    /* renamed from: c */
    private final String[] f10304c;

    /* renamed from: d */
    private final CredentialPickerConfig f10305d;

    /* renamed from: e */
    private final CredentialPickerConfig f10306e;

    /* renamed from: f */
    private final boolean f10307f;

    /* renamed from: r */
    private final String f10308r;

    /* renamed from: s */
    private final String f10309s;

    /* renamed from: t */
    private final boolean f10310t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5083a(int i10, boolean z10, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z11, String str, String str2, boolean z12) {
        this.f10302a = i10;
        this.f10303b = z10;
        this.f10304c = (String[]) C5276s.m13324j(strArr);
        this.f10305d = credentialPickerConfig == null ? new CredentialPickerConfig.C5082a().m12853a() : credentialPickerConfig;
        this.f10306e = credentialPickerConfig2 == null ? new CredentialPickerConfig.C5082a().m12853a() : credentialPickerConfig2;
        if (i10 < 3) {
            this.f10307f = true;
            this.f10308r = null;
            this.f10309s = null;
        } else {
            this.f10307f = z11;
            this.f10308r = str;
            this.f10309s = str2;
        }
        this.f10310t = z12;
    }

    /* renamed from: A1 */
    public boolean m12862A1() {
        return this.f10303b;
    }

    /* renamed from: u1 */
    public String[] m12863u1() {
        return this.f10304c;
    }

    /* renamed from: v1 */
    public CredentialPickerConfig m12864v1() {
        return this.f10306e;
    }

    /* renamed from: w1 */
    public CredentialPickerConfig m12865w1() {
        return this.f10305d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, m12862A1());
        C7140c.m21201H(parcel, 2, m12863u1(), false);
        C7140c.m21198E(parcel, 3, m12865w1(), i10, false);
        C7140c.m21198E(parcel, 4, m12864v1(), i10, false);
        C7140c.m21215g(parcel, 5, m12868z1());
        C7140c.m21200G(parcel, 6, m12867y1(), false);
        C7140c.m21200G(parcel, 7, m12866x1(), false);
        C7140c.m21215g(parcel, 8, this.f10310t);
        C7140c.m21229u(parcel, AdError.NETWORK_ERROR_CODE, this.f10302a);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public String m12866x1() {
        return this.f10309s;
    }

    /* renamed from: y1 */
    public String m12867y1() {
        return this.f10308r;
    }

    /* renamed from: z1 */
    public boolean m12868z1() {
        return this.f10307f;
    }
}
