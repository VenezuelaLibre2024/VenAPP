package r8;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import t6.u1;
import t8.r0;
import t8.w;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f24768a;

    public b(Resources resources) {
        this.f24768a = (Resources) t8.a.e(resources);
    }

    private String b(u1 u1Var) {
        Resources resources;
        int i10;
        int i11 = u1Var.J;
        if (i11 == -1 || i11 < 1) {
            return "";
        }
        if (i11 == 1) {
            resources = this.f24768a;
            i10 = d.f24772c;
        } else if (i11 == 2) {
            resources = this.f24768a;
            i10 = d.f24780k;
        } else if (i11 == 6 || i11 == 7) {
            resources = this.f24768a;
            i10 = d.f24782m;
        } else if (i11 != 8) {
            resources = this.f24768a;
            i10 = d.f24781l;
        } else {
            resources = this.f24768a;
            i10 = d.f24783n;
        }
        return resources.getString(i10);
    }

    private String c(u1 u1Var) {
        int i10 = u1Var.f26513s;
        return i10 == -1 ? "" : this.f24768a.getString(d.f24771b, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(u1 u1Var) {
        return TextUtils.isEmpty(u1Var.f26507b) ? "" : u1Var.f26507b;
    }

    private String e(u1 u1Var) {
        String j10 = j(f(u1Var), h(u1Var));
        return TextUtils.isEmpty(j10) ? d(u1Var) : j10;
    }

    private String f(u1 u1Var) {
        String str = u1Var.f26508c;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale forLanguageTag = r0.f26744a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale R = r0.R();
        String displayName = forLanguageTag.getDisplayName(R);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            String valueOf = String.valueOf(displayName.substring(0, offsetByCodePoints).toUpperCase(R));
            String valueOf2 = String.valueOf(displayName.substring(offsetByCodePoints));
            displayName = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } catch (IndexOutOfBoundsException unused) {
        }
        return displayName;
    }

    private String g(u1 u1Var) {
        int i10 = u1Var.B;
        int i11 = u1Var.C;
        return (i10 == -1 || i11 == -1) ? "" : this.f24768a.getString(d.f24773d, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(u1 u1Var) {
        String string = (u1Var.f26510e & 2) != 0 ? this.f24768a.getString(d.f24774e) : "";
        if ((u1Var.f26510e & 4) != 0) {
            string = j(string, this.f24768a.getString(d.f24777h));
        }
        if ((u1Var.f26510e & 8) != 0) {
            string = j(string, this.f24768a.getString(d.f24776g));
        }
        return (u1Var.f26510e & 1088) != 0 ? j(string, this.f24768a.getString(d.f24775f)) : string;
    }

    private static int i(u1 u1Var) {
        int k10 = w.k(u1Var.f26517w);
        if (k10 != -1) {
            return k10;
        }
        if (w.n(u1Var.f26514t) != null) {
            return 2;
        }
        if (w.c(u1Var.f26514t) != null) {
            return 1;
        }
        if (u1Var.B == -1 && u1Var.C == -1) {
            return (u1Var.J == -1 && u1Var.K == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f24768a.getString(d.f24770a, str, str2);
            }
        }
        return str;
    }

    @Override // r8.f
    public String a(u1 u1Var) {
        int i10 = i(u1Var);
        String j10 = i10 == 2 ? j(h(u1Var), g(u1Var), c(u1Var)) : i10 == 1 ? j(e(u1Var), b(u1Var), c(u1Var)) : e(u1Var);
        return j10.length() == 0 ? this.f24768a.getString(d.f24784o) : j10;
    }
}
