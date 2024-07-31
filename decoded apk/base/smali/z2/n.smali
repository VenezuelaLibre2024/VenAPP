.class public Lz2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ly2/a;)Lz2/o;
    .locals 1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p1, v0}, Landroidx/core/content/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lz2/o;->precise:Lz2/o;

    return-object p1

    :cond_0
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p1, v0}, Landroidx/core/content/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lz2/o;->reduced:Lz2/o;

    return-object p1

    :cond_1
    sget-object p1, Ly2/b;->permissionDenied:Ly2/b;

    invoke-interface {p2, p1}, Ly2/a;->a(Ly2/b;)V

    const/4 p1, 0x0

    return-object p1
.end method
