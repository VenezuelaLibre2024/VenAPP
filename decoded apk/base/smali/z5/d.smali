.class public final Lz5/d;
.super Ly5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz5/d$a;
    }
.end annotation


# static fields
.field public static final c:Lz5/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz5/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz5/d$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lz5/d;->c:Lz5/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly5/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Application;IZ)Lv5/c;
    .locals 0

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lz5/d;->p(Landroid/content/Context;I)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lv5/c;->Authorized:Lv5/c;

    goto :goto_0

    :cond_0
    sget-object p1, Lv5/c;->Denied:Lv5/c;

    :goto_0
    return-object p1
.end method

.method public f(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.ACCESS_MEDIA_LOCATION"

    invoke-virtual {p0, p1, v0}, Ly5/a;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public m(Ly5/c;Landroid/content/Context;IZ)V
    .locals 3

    const-string v0, "permissionsUtils"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx5/g;->a:Lx5/g;

    invoke-virtual {v0, p3}, Lx5/g;->d(I)Z

    move-result v1

    invoke-virtual {v0, p3}, Lx5/g;->c(I)Z

    move-result v2

    invoke-virtual {v0, p3}, Lx5/g;->b(I)Z

    move-result p3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_0

    const-string v1, "android.permission.READ_MEDIA_VIDEO"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz v2, :cond_1

    const-string v1, "android.permission.READ_MEDIA_IMAGES"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p3, :cond_2

    const-string p3, "android.permission.READ_MEDIA_AUDIO"

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz p4, :cond_3

    const-string p3, "android.permission.ACCESS_MEDIA_LOCATION"

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/String;

    invoke-interface {v0, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    array-length p4, p3

    invoke-static {p3, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    invoke-virtual {p0, p2, p3}, Ly5/a;->j(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Ly5/c;->e()Ly5/b;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1, v0}, Ly5/b;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p1, v0}, Ly5/a;->n(Ly5/c;Ljava/util/List;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public p(Landroid/content/Context;I)Z
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx5/g;->a:Lx5/g;

    invoke-virtual {v0, p2}, Lx5/g;->d(I)Z

    move-result v1

    invoke-virtual {v0, p2}, Lx5/g;->c(I)Z

    move-result v2

    invoke-virtual {v0, p2}, Lx5/g;->b(I)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz v1, :cond_0

    const-string v1, "android.permission.READ_MEDIA_VIDEO"

    invoke-virtual {p0, p1, v1}, Ly5/a;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/4 v3, 0x0

    if-eqz v2, :cond_2

    if-eqz v1, :cond_1

    const-string v1, "android.permission.READ_MEDIA_IMAGES"

    invoke-virtual {p0, p1, v1}, Ly5/a;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, v3

    :cond_2
    :goto_1
    if-eqz p2, :cond_4

    if-eqz v1, :cond_3

    const-string p2, "android.permission.READ_MEDIA_AUDIO"

    invoke-virtual {p0, p1, p2}, Ly5/a;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    move v0, v3

    :goto_2
    move v1, v0

    :cond_4
    return v1
.end method
