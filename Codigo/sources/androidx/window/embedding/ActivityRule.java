package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import dk.z;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.n;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    private final Set<ActivityFilter> filters;

    public ActivityRule(Set<ActivityFilter> filters, boolean z10) {
        Set<ActivityFilter> j02;
        n.e(filters, "filters");
        this.alwaysExpand = z10;
        j02 = z.j0(filters);
        this.filters = j02;
    }

    public /* synthetic */ ActivityRule(Set set, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(set, (i10 & 2) != 0 ? false : z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        return n.a(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + Boolean.hashCode(this.alwaysExpand);
    }

    public final ActivityRule plus$window_release(ActivityFilter filter) {
        Set j02;
        n.e(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        j02 = z.j0(linkedHashSet);
        return new ActivityRule(j02, this.alwaysExpand);
    }
}
