.class public final Lca/j;
.super Lca/k;
.source "SourceFile"


# static fields
.field public static final f:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lca/k;->a:I

    sput v0, Lca/j;->f:I

    return-void
.end method

.method public static d(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    invoke-static {p0}, Lca/k;->d(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;)Landroid/content/res/Resources;
    .locals 0

    invoke-static {p0}, Lca/k;->e(Landroid/content/Context;)Landroid/content/res/Resources;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;I)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lca/k;->g(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method
