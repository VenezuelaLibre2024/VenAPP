package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f1 extends u0.c implements View.OnClickListener {
    private final int A;
    private boolean B;
    private int C;
    private ColorStateList D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;

    /* renamed from: w */
    private final SearchView f1460w;

    /* renamed from: x */
    private final SearchableInfo f1461x;

    /* renamed from: y */
    private final Context f1462y;

    /* renamed from: z */
    private final WeakHashMap<String, Drawable.ConstantState> f1463z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f1464a;

        /* renamed from: b */
        public final TextView f1465b;

        /* renamed from: c */
        public final ImageView f1466c;

        /* renamed from: d */
        public final ImageView f1467d;

        /* renamed from: e */
        public final ImageView f1468e;

        public a(View view) {
            this.f1464a = (TextView) view.findViewById(R.id.text1);
            this.f1465b = (TextView) view.findViewById(R.id.text2);
            this.f1466c = (ImageView) view.findViewById(R.id.icon1);
            this.f1467d = (ImageView) view.findViewById(R.id.icon2);
            this.f1468e = (ImageView) view.findViewById(g.f.f15354q);
        }
    }

    public f1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.B = false;
        this.C = 1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.f1460w = searchView;
        this.f1461x = searchableInfo;
        this.A = searchView.getSuggestionCommitIconResId();
        this.f1462y = context;
        this.f1463z = weakHashMap;
    }

    private void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = this.f1463z.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.D == null) {
            TypedValue typedValue = new TypedValue();
            this.f1462y.getTheme().resolveAttribute(g.a.K, typedValue, true);
            this.D = this.f1462y.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.D, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) {
        String obj;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f1462y.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, RecognitionOptions.ITF);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e10) {
            obj = e10.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        obj = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", obj);
        return null;
    }

    private Drawable m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1463z.containsKey(flattenToShortString)) {
            Drawable l10 = l(componentName);
            this.f1463z.put(flattenToShortString, l10 != null ? l10.getConstantState() : null);
            return l10;
        }
        Drawable.ConstantState constantState = this.f1463z.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1462y.getResources());
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    private Drawable o() {
        Drawable m10 = m(this.f1461x.getSearchActivity());
        return m10 != null ? m10 : this.f1462y.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1462y.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e10) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                }
            }
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    private Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1462y.getPackageName() + "/" + parseInt;
            Drawable j10 = j(str2);
            if (j10 != null) {
                return j10;
            }
            Drawable drawable = androidx.core.content.a.getDrawable(this.f1462y, parseInt);
            z(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable j11 = j(str);
            if (j11 != null) {
                return j11;
            }
            Drawable p10 = p(Uri.parse(str));
            z(str, p10);
            return p10;
        }
    }

    private Drawable s(Cursor cursor) {
        int i10 = this.H;
        if (i10 == -1) {
            return null;
        }
        Drawable r10 = r(cursor.getString(i10));
        return r10 != null ? r10 : o();
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.I;
        if (i10 == -1) {
            return null;
        }
        return r(cursor.getString(i10));
    }

    private static String v(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1463z.put(str, drawable.getConstantState());
        }
    }

    @Override // u0.a, u0.b.a
    public void a(Cursor cursor) {
        if (this.B) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.E = cursor.getColumnIndex("suggest_text_1");
                this.F = cursor.getColumnIndex("suggest_text_2");
                this.G = cursor.getColumnIndex("suggest_text_2_url");
                this.H = cursor.getColumnIndex("suggest_icon_1");
                this.I = cursor.getColumnIndex("suggest_icon_2");
                this.J = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // u0.b.a
    public Cursor b(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1460w.getVisibility() == 0 && this.f1460w.getWindowVisibility() == 0) {
            try {
                Cursor u10 = u(this.f1461x, charSequence2, 50);
                if (u10 != null) {
                    u10.getCount();
                    return u10;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // u0.a, u0.b.a
    public CharSequence convertToString(Cursor cursor) {
        String n10;
        String n11;
        if (cursor == null) {
            return null;
        }
        String n12 = n(cursor, "suggest_intent_query");
        if (n12 != null) {
            return n12;
        }
        if (this.f1461x.shouldRewriteQueryFromData() && (n11 = n(cursor, "suggest_intent_data")) != null) {
            return n11;
        }
        if (!this.f1461x.shouldRewriteQueryFromText() || (n10 = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return n10;
    }

    @Override // u0.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.J;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1464a != null) {
            y(aVar.f1464a, v(cursor, this.E));
        }
        if (aVar.f1465b != null) {
            String v10 = v(cursor, this.G);
            CharSequence k10 = v10 != null ? k(v10) : v(cursor, this.F);
            if (TextUtils.isEmpty(k10)) {
                TextView textView = aVar.f1464a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1464a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1464a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1464a.setMaxLines(1);
                }
            }
            y(aVar.f1465b, k10);
        }
        ImageView imageView = aVar.f1466c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f1467d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i12 = this.C;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f1468e.setVisibility(8);
            return;
        }
        aVar.f1468e.setVisibility(0);
        aVar.f1468e.setTag(aVar.f1464a.getText());
        aVar.f1468e.setOnClickListener(this);
    }

    @Override // u0.c, u0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View g10 = super.g(context, cursor, viewGroup);
        g10.setTag(new a(g10));
        ((ImageView) g10.findViewById(g.f.f15354q)).setImageResource(this.A);
        return g10;
    }

    @Override // u0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View f10 = f(this.f1462y, c(), viewGroup);
            if (f10 != null) {
                ((a) f10.getTag()).f1464a.setText(e10.toString());
            }
            return f10;
        }
    }

    @Override // u0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View g10 = g(this.f1462y, c(), viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f1464a.setText(e10.toString());
            }
            return g10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1460w.Q((CharSequence) tag);
        }
    }

    Drawable q(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1462y.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor u(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1462y.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i10) {
        this.C = i10;
    }
}
