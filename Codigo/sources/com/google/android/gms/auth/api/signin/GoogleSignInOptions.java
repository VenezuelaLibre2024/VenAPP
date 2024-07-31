package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends ea.a implements a.d, ReflectedParcelable {
    public static final Scope B;
    public static final Scope C;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    private static Comparator D;

    /* renamed from: w */
    public static final GoogleSignInOptions f9249w;

    /* renamed from: x */
    public static final GoogleSignInOptions f9250x;

    /* renamed from: a */
    final int f9253a;

    /* renamed from: b */
    private final ArrayList f9254b;

    /* renamed from: c */
    private Account f9255c;

    /* renamed from: d */
    private boolean f9256d;

    /* renamed from: e */
    private final boolean f9257e;

    /* renamed from: f */
    private final boolean f9258f;

    /* renamed from: r */
    private String f9259r;

    /* renamed from: s */
    private String f9260s;

    /* renamed from: t */
    private ArrayList f9261t;

    /* renamed from: u */
    private String f9262u;

    /* renamed from: v */
    private Map f9263v;

    /* renamed from: y */
    public static final Scope f9251y = new Scope("profile");

    /* renamed from: z */
    public static final Scope f9252z = new Scope(Constants.EMAIL);
    public static final Scope A = new Scope("openid");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Set f9264a;

        /* renamed from: b */
        private boolean f9265b;

        /* renamed from: c */
        private boolean f9266c;

        /* renamed from: d */
        private boolean f9267d;

        /* renamed from: e */
        private String f9268e;

        /* renamed from: f */
        private Account f9269f;

        /* renamed from: g */
        private String f9270g;

        /* renamed from: h */
        private Map f9271h;

        /* renamed from: i */
        private String f9272i;

        public a() {
            this.f9264a = new HashSet();
            this.f9271h = new HashMap();
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f9264a = new HashSet();
            this.f9271h = new HashMap();
            s.j(googleSignInOptions);
            this.f9264a = new HashSet(googleSignInOptions.f9254b);
            this.f9265b = googleSignInOptions.f9257e;
            this.f9266c = googleSignInOptions.f9258f;
            this.f9267d = googleSignInOptions.f9256d;
            this.f9268e = googleSignInOptions.f9259r;
            this.f9269f = googleSignInOptions.f9255c;
            this.f9270g = googleSignInOptions.f9260s;
            this.f9271h = GoogleSignInOptions.N1(googleSignInOptions.f9261t);
            this.f9272i = googleSignInOptions.f9262u;
        }

        private final String k(String str) {
            s.f(str);
            String str2 = this.f9268e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            s.b(z10, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f9264a.contains(GoogleSignInOptions.C)) {
                Set set = this.f9264a;
                Scope scope = GoogleSignInOptions.B;
                if (set.contains(scope)) {
                    this.f9264a.remove(scope);
                }
            }
            if (this.f9267d && (this.f9269f == null || !this.f9264a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f9264a), this.f9269f, this.f9267d, this.f9265b, this.f9266c, this.f9268e, this.f9270g, this.f9271h, this.f9272i);
        }

        public a b() {
            this.f9264a.add(GoogleSignInOptions.f9252z);
            return this;
        }

        public a c() {
            this.f9264a.add(GoogleSignInOptions.A);
            return this;
        }

        public a d(String str) {
            this.f9267d = true;
            k(str);
            this.f9268e = str;
            return this;
        }

        public a e() {
            this.f9264a.add(GoogleSignInOptions.f9251y);
            return this;
        }

        public a f(Scope scope, Scope... scopeArr) {
            this.f9264a.add(scope);
            this.f9264a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a g(String str, boolean z10) {
            this.f9265b = true;
            k(str);
            this.f9268e = str;
            this.f9266c = z10;
            return this;
        }

        public a h(String str) {
            this.f9269f = new Account(s.f(str), "com.google");
            return this;
        }

        public a i(String str) {
            this.f9270g = s.f(str);
            return this;
        }

        public a j(String str) {
            this.f9272i = str;
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        B = scope;
        C = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.c();
        aVar.e();
        f9249w = aVar.a();
        a aVar2 = new a();
        aVar2.f(scope, new Scope[0]);
        f9250x = aVar2.a();
        CREATOR = new e();
        D = new d();
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, N1(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f9253a = i10;
        this.f9254b = arrayList;
        this.f9255c = account;
        this.f9256d = z10;
        this.f9257e = z11;
        this.f9258f = z12;
        this.f9259r = str;
        this.f9260s = str2;
        this.f9261t = new ArrayList(map.values());
        this.f9263v = map;
        this.f9262u = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3, y9.d dVar) {
        this(3, arrayList, account, z10, z11, z12, str, str2, map, str3);
    }

    public static GoogleSignInOptions C1(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    public static Map N1(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z9.a aVar = (z9.a) it.next();
            hashMap.put(Integer.valueOf(aVar.u1()), aVar);
        }
        return hashMap;
    }

    public boolean A1() {
        return this.f9257e;
    }

    public final String G1() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f9254b, D);
            Iterator it = this.f9254b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).u1());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f9255c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f9256d);
            jSONObject.put("forceCodeForRefreshToken", this.f9258f);
            jSONObject.put("serverAuthRequested", this.f9257e);
            if (!TextUtils.isEmpty(this.f9259r)) {
                jSONObject.put("serverClientId", this.f9259r);
            }
            if (!TextUtils.isEmpty(this.f9260s)) {
                jSONObject.put("hostedDomain", this.f9260s);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Account c1() {
        return this.f9255c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.c1()) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f9261t     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList r1 = r4.f9261t     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f9254b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.w1()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f9254b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.w1()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f9255c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.c1()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.c1()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f9259r     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.x1()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f9259r     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.x1()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f9258f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.y1()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f9256d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.z1()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f9257e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.A1()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f9262u     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.v1()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f9254b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).u1());
        }
        Collections.sort(arrayList);
        z9.b bVar = new z9.b();
        bVar.a(arrayList);
        bVar.a(this.f9255c);
        bVar.a(this.f9259r);
        bVar.c(this.f9258f);
        bVar.c(this.f9256d);
        bVar.c(this.f9257e);
        bVar.a(this.f9262u);
        return bVar.b();
    }

    public ArrayList<z9.a> u1() {
        return this.f9261t;
    }

    public String v1() {
        return this.f9262u;
    }

    public ArrayList<Scope> w1() {
        return new ArrayList<>(this.f9254b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9253a);
        ea.c.K(parcel, 2, w1(), false);
        ea.c.E(parcel, 3, c1(), i10, false);
        ea.c.g(parcel, 4, z1());
        ea.c.g(parcel, 5, A1());
        ea.c.g(parcel, 6, y1());
        ea.c.G(parcel, 7, x1(), false);
        ea.c.G(parcel, 8, this.f9260s, false);
        ea.c.K(parcel, 9, u1(), false);
        ea.c.G(parcel, 10, v1(), false);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f9259r;
    }

    public boolean y1() {
        return this.f9258f;
    }

    public boolean z1() {
        return this.f9256d;
    }
}
