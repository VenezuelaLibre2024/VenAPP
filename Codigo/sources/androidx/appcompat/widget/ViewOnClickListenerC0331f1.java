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
import androidx.core.content.C0854a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p111g.C7377a;
import p111g.C7382f;
import p370u0.AbstractC11296c;

/* renamed from: androidx.appcompat.widget.f1 */
/* loaded from: classes.dex */
class ViewOnClickListenerC0331f1 extends AbstractC11296c implements View.OnClickListener {

    /* renamed from: A */
    private final int f1725A;

    /* renamed from: B */
    private boolean f1726B;

    /* renamed from: C */
    private int f1727C;

    /* renamed from: D */
    private ColorStateList f1728D;

    /* renamed from: E */
    private int f1729E;

    /* renamed from: F */
    private int f1730F;

    /* renamed from: G */
    private int f1731G;

    /* renamed from: H */
    private int f1732H;

    /* renamed from: I */
    private int f1733I;

    /* renamed from: J */
    private int f1734J;

    /* renamed from: w */
    private final SearchView f1735w;

    /* renamed from: x */
    private final SearchableInfo f1736x;

    /* renamed from: y */
    private final Context f1737y;

    /* renamed from: z */
    private final WeakHashMap<String, Drawable.ConstantState> f1738z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f1739a;

        /* renamed from: b */
        public final TextView f1740b;

        /* renamed from: c */
        public final ImageView f1741c;

        /* renamed from: d */
        public final ImageView f1742d;

        /* renamed from: e */
        public final ImageView f1743e;

        public a(View view) {
            this.f1739a = (TextView) view.findViewById(R.id.text1);
            this.f1740b = (TextView) view.findViewById(R.id.text2);
            this.f1741c = (ImageView) view.findViewById(R.id.icon1);
            this.f1742d = (ImageView) view.findViewById(R.id.icon2);
            this.f1743e = (ImageView) view.findViewById(C7382f.f16825q);
        }
    }

    public ViewOnClickListenerC0331f1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1726B = false;
        this.f1727C = 1;
        this.f1729E = -1;
        this.f1730F = -1;
        this.f1731G = -1;
        this.f1732H = -1;
        this.f1733I = -1;
        this.f1734J = -1;
        this.f1735w = searchView;
        this.f1736x = searchableInfo;
        this.f1725A = searchView.getSuggestionCommitIconResId();
        this.f1737y = context;
        this.f1738z = weakHashMap;
    }

    /* renamed from: A */
    private void m1708A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: j */
    private Drawable m1709j(String str) {
        Drawable.ConstantState constantState = this.f1738z.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: k */
    private CharSequence m1710k(CharSequence charSequence) {
        if (this.f1728D == null) {
            TypedValue typedValue = new TypedValue();
            this.f1737y.getTheme().resolveAttribute(C7377a.f16694K, typedValue, true);
            this.f1728D = this.f1737y.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1728D, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: l */
    private Drawable m1711l(ComponentName componentName) {
        String obj;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f1737y.getPackageManager();
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

    /* renamed from: m */
    private Drawable m1712m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1738z.containsKey(flattenToShortString)) {
            Drawable m1711l = m1711l(componentName);
            this.f1738z.put(flattenToShortString, m1711l != null ? m1711l.getConstantState() : null);
            return m1711l;
        }
        Drawable.ConstantState constantState = this.f1738z.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1737y.getResources());
    }

    /* renamed from: n */
    public static String m1713n(Cursor cursor, String str) {
        return m1719v(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: o */
    private Drawable m1714o() {
        Drawable m1712m = m1712m(this.f1736x.getSearchActivity());
        return m1712m != null ? m1712m : this.f1737y.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: p */
    private Drawable m1715p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1727q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1737y.getContentResolver().openInputStream(uri);
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

    /* renamed from: r */
    private Drawable m1716r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1737y.getPackageName() + "/" + parseInt;
            Drawable m1709j = m1709j(str2);
            if (m1709j != null) {
                return m1709j;
            }
            Drawable drawable = C0854a.getDrawable(this.f1737y, parseInt);
            m1722z(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m1709j2 = m1709j(str);
            if (m1709j2 != null) {
                return m1709j2;
            }
            Drawable m1715p = m1715p(Uri.parse(str));
            m1722z(str, m1715p);
            return m1715p;
        }
    }

    /* renamed from: s */
    private Drawable m1717s(Cursor cursor) {
        int i10 = this.f1732H;
        if (i10 == -1) {
            return null;
        }
        Drawable m1716r = m1716r(cursor.getString(i10));
        return m1716r != null ? m1716r : m1714o();
    }

    /* renamed from: t */
    private Drawable m1718t(Cursor cursor) {
        int i10 = this.f1733I;
        if (i10 == -1) {
            return null;
        }
        return m1716r(cursor.getString(i10));
    }

    /* renamed from: v */
    private static String m1719v(Cursor cursor, int i10) {
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

    /* renamed from: x */
    private void m1720x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: y */
    private void m1721y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: z */
    private void m1722z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1738z.put(str, drawable.getConstantState());
        }
    }

    @Override // p370u0.AbstractC11294a, p370u0.C11295b.a
    /* renamed from: a */
    public void mo1723a(Cursor cursor) {
        if (this.f1726B) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1723a(cursor);
            if (cursor != null) {
                this.f1729E = cursor.getColumnIndex("suggest_text_1");
                this.f1730F = cursor.getColumnIndex("suggest_text_2");
                this.f1731G = cursor.getColumnIndex("suggest_text_2_url");
                this.f1732H = cursor.getColumnIndex("suggest_icon_1");
                this.f1733I = cursor.getColumnIndex("suggest_icon_2");
                this.f1734J = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p370u0.C11295b.a
    /* renamed from: b */
    public Cursor mo1724b(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1735w.getVisibility() == 0 && this.f1735w.getWindowVisibility() == 0) {
            try {
                Cursor m1728u = m1728u(this.f1736x, charSequence2, 50);
                if (m1728u != null) {
                    m1728u.getCount();
                    return m1728u;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // p370u0.AbstractC11294a, p370u0.C11295b.a
    public CharSequence convertToString(Cursor cursor) {
        String m1713n;
        String m1713n2;
        if (cursor == null) {
            return null;
        }
        String m1713n3 = m1713n(cursor, "suggest_intent_query");
        if (m1713n3 != null) {
            return m1713n3;
        }
        if (this.f1736x.shouldRewriteQueryFromData() && (m1713n2 = m1713n(cursor, "suggest_intent_data")) != null) {
            return m1713n2;
        }
        if (!this.f1736x.shouldRewriteQueryFromText() || (m1713n = m1713n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m1713n;
    }

    @Override // p370u0.AbstractC11294a
    /* renamed from: d */
    public void mo1725d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f1734J;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1739a != null) {
            m1721y(aVar.f1739a, m1719v(cursor, this.f1729E));
        }
        if (aVar.f1740b != null) {
            String m1719v = m1719v(cursor, this.f1731G);
            CharSequence m1710k = m1719v != null ? m1710k(m1719v) : m1719v(cursor, this.f1730F);
            if (TextUtils.isEmpty(m1710k)) {
                TextView textView = aVar.f1739a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1739a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1739a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1739a.setMaxLines(1);
                }
            }
            m1721y(aVar.f1740b, m1710k);
        }
        ImageView imageView = aVar.f1741c;
        if (imageView != null) {
            m1720x(imageView, m1717s(cursor), 4);
        }
        ImageView imageView2 = aVar.f1742d;
        if (imageView2 != null) {
            m1720x(imageView2, m1718t(cursor), 8);
        }
        int i12 = this.f1727C;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f1743e.setVisibility(8);
            return;
        }
        aVar.f1743e.setVisibility(0);
        aVar.f1743e.setTag(aVar.f1739a.getText());
        aVar.f1743e.setOnClickListener(this);
    }

    @Override // p370u0.AbstractC11296c, p370u0.AbstractC11294a
    /* renamed from: g */
    public View mo1726g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo1726g = super.mo1726g(context, cursor, viewGroup);
        mo1726g.setTag(new a(mo1726g));
        ((ImageView) mo1726g.findViewById(C7382f.f16825q)).setImageResource(this.f1725A);
        return mo1726g;
    }

    @Override // p370u0.AbstractC11294a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo35294f = mo35294f(this.f1737y, mo35292c(), viewGroup);
            if (mo35294f != null) {
                ((a) mo35294f.getTag()).f1739a.setText(e10.toString());
            }
            return mo35294f;
        }
    }

    @Override // p370u0.AbstractC11294a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo1726g = mo1726g(this.f1737y, mo35292c(), viewGroup);
            if (mo1726g != null) {
                ((a) mo1726g.getTag()).f1739a.setText(e10.toString());
            }
            return mo1726g;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1708A(mo35292c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1708A(mo35292c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1735w.m1493Q((CharSequence) tag);
        }
    }

    /* renamed from: q */
    Drawable m1727q(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1737y.getPackageManager().getResourcesForApplication(authority);
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

    /* renamed from: u */
    Cursor m1728u(SearchableInfo searchableInfo, String str, int i10) {
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
        return this.f1737y.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: w */
    public void m1729w(int i10) {
        this.f1727C = i10;
    }
}
