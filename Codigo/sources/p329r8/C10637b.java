package p329r8;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11178w;

/* renamed from: r8.b */
/* loaded from: classes.dex */
public class C10637b implements InterfaceC10641f {

    /* renamed from: a */
    private final Resources f26882a;

    public C10637b(Resources resources) {
        this.f26882a = (Resources) C11137a.m34603e(resources);
    }

    /* renamed from: b */
    private String m32412b(C11108u1 c11108u1) {
        Resources resources;
        int i10;
        int i11 = c11108u1.f28776J;
        if (i11 == -1 || i11 < 1) {
            return "";
        }
        if (i11 == 1) {
            resources = this.f26882a;
            i10 = C10639d.f26886c;
        } else if (i11 == 2) {
            resources = this.f26882a;
            i10 = C10639d.f26894k;
        } else if (i11 == 6 || i11 == 7) {
            resources = this.f26882a;
            i10 = C10639d.f26896m;
        } else if (i11 != 8) {
            resources = this.f26882a;
            i10 = C10639d.f26895l;
        } else {
            resources = this.f26882a;
            i10 = C10639d.f26897n;
        }
        return resources.getString(i10);
    }

    /* renamed from: c */
    private String m32413c(C11108u1 c11108u1) {
        int i10 = c11108u1.f28793s;
        return i10 == -1 ? "" : this.f26882a.getString(C10639d.f26885b, Float.valueOf(i10 / 1000000.0f));
    }

    /* renamed from: d */
    private String m32414d(C11108u1 c11108u1) {
        return TextUtils.isEmpty(c11108u1.f28787b) ? "" : c11108u1.f28787b;
    }

    /* renamed from: e */
    private String m32415e(C11108u1 c11108u1) {
        String m32420j = m32420j(m32416f(c11108u1), m32418h(c11108u1));
        return TextUtils.isEmpty(m32420j) ? m32414d(c11108u1) : m32420j;
    }

    /* renamed from: f */
    private String m32416f(C11108u1 c11108u1) {
        String str = c11108u1.f28788c;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale forLanguageTag = C11172r0.f29040a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale m34890R = C11172r0.m34890R();
        String displayName = forLanguageTag.getDisplayName(m34890R);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            String valueOf = String.valueOf(displayName.substring(0, offsetByCodePoints).toUpperCase(m34890R));
            String valueOf2 = String.valueOf(displayName.substring(offsetByCodePoints));
            displayName = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } catch (IndexOutOfBoundsException unused) {
        }
        return displayName;
    }

    /* renamed from: g */
    private String m32417g(C11108u1 c11108u1) {
        int i10 = c11108u1.f28768B;
        int i11 = c11108u1.f28769C;
        return (i10 == -1 || i11 == -1) ? "" : this.f26882a.getString(C10639d.f26887d, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    /* renamed from: h */
    private String m32418h(C11108u1 c11108u1) {
        String string = (c11108u1.f28790e & 2) != 0 ? this.f26882a.getString(C10639d.f26888e) : "";
        if ((c11108u1.f28790e & 4) != 0) {
            string = m32420j(string, this.f26882a.getString(C10639d.f26891h));
        }
        if ((c11108u1.f28790e & 8) != 0) {
            string = m32420j(string, this.f26882a.getString(C10639d.f26890g));
        }
        return (c11108u1.f28790e & 1088) != 0 ? m32420j(string, this.f26882a.getString(C10639d.f26889f)) : string;
    }

    /* renamed from: i */
    private static int m32419i(C11108u1 c11108u1) {
        int m35003k = C11178w.m35003k(c11108u1.f28797w);
        if (m35003k != -1) {
            return m35003k;
        }
        if (C11178w.m35006n(c11108u1.f28794t) != null) {
            return 2;
        }
        if (C11178w.m34995c(c11108u1.f28794t) != null) {
            return 1;
        }
        if (c11108u1.f28768B == -1 && c11108u1.f28769C == -1) {
            return (c11108u1.f28776J == -1 && c11108u1.f28777K == -1) ? -1 : 1;
        }
        return 2;
    }

    /* renamed from: j */
    private String m32420j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f26882a.getString(C10639d.f26884a, str, str2);
            }
        }
        return str;
    }

    @Override // p329r8.InterfaceC10641f
    /* renamed from: a */
    public String mo32421a(C11108u1 c11108u1) {
        int m32419i = m32419i(c11108u1);
        String m32420j = m32419i == 2 ? m32420j(m32418h(c11108u1), m32417g(c11108u1), m32413c(c11108u1)) : m32419i == 1 ? m32420j(m32415e(c11108u1), m32412b(c11108u1), m32413c(c11108u1)) : m32415e(c11108u1);
        return m32420j.length() == 0 ? this.f26882a.getString(C10639d.f26898o) : m32420j;
    }
}
