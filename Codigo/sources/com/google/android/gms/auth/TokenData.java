package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import ea.c;
import java.util.List;

/* loaded from: classes.dex */
public class TokenData extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f9161a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9162b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f9163c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9164d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9165e;

    /* renamed from: f, reason: collision with root package name */
    private final List f9166f;

    /* renamed from: r, reason: collision with root package name */
    private final String f9167r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TokenData(int i10, String str, Long l10, boolean z10, boolean z11, List list, String str2) {
        this.f9161a = i10;
        this.f9162b = s.f(str);
        this.f9163c = l10;
        this.f9164d = z10;
        this.f9165e = z11;
        this.f9166f = list;
        this.f9167r = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f9162b, tokenData.f9162b) && q.b(this.f9163c, tokenData.f9163c) && this.f9164d == tokenData.f9164d && this.f9165e == tokenData.f9165e && q.b(this.f9166f, tokenData.f9166f) && q.b(this.f9167r, tokenData.f9167r);
    }

    public final int hashCode() {
        return q.c(this.f9162b, this.f9163c, Boolean.valueOf(this.f9164d), Boolean.valueOf(this.f9165e), this.f9166f, this.f9167r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f9161a);
        c.G(parcel, 2, this.f9162b, false);
        c.B(parcel, 3, this.f9163c, false);
        c.g(parcel, 4, this.f9164d);
        c.g(parcel, 5, this.f9165e);
        c.I(parcel, 6, this.f9166f, false);
        c.G(parcel, 7, this.f9167r, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.f9162b;
    }
}
