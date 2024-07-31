.class public final Lz5/e;
.super Ly5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz5/e$a;,
        Lz5/e$b;
    }
.end annotation


# static fields
.field public static final c:Lz5/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz5/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz5/e$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lz5/e;->c:Lz5/e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly5/a;-><init>()V

    return-void
.end method

.method private static final p(Lkotlin/jvm/internal/x;Lv5/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/x<",
            "Lv5/c;",
            ">;",
            "Lv5/c;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    sget-object v1, Lv5/c;->NotDetermined:Lv5/c;

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    return-void

    :cond_0
    check-cast v0, Lv5/c;

    sget-object v1, Lz5/e$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Lv5/c;->Limited:Lv5/c;

    iput-object p1, p0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object v0, Lv5/c;->Limited:Lv5/c;

    if-eq p1, v0, :cond_4

    sget-object v1, Lv5/c;->Denied:Lv5/c;

    if-ne p1, v1, :cond_5

    goto :goto_0

    :cond_3
    sget-object v0, Lv5/c;->Limited:Lv5/c;

    if-eq p1, v0, :cond_4

    sget-object v1, Lv5/c;->Authorized:Lv5/c;

    if-ne p1, v1, :cond_5

    :cond_4
    :goto_0
    iput-object v0, p0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Application;IZ)Lv5/c;
    .locals 3

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lkotlin/jvm/internal/x;

    invoke-direct {p3}, Lkotlin/jvm/internal/x;-><init>()V

    sget-object v0, Lv5/c;->NotDetermined:Lv5/c;

    iput-object v0, p3, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    sget-object v0, Lx5/g;->a:Lx5/g;

    invoke-virtual {v0, p2}, Lx5/g;->c(I)Z

    move-result v1

    invoke-virtual {v0, p2}, Lx5/g;->d(I)Z

    move-result v2

    invoke-virtual {v0, p2}, Lx5/g;->b(I)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "android.permission.READ_MEDIA_AUDIO"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ly5/a;->j(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lv5/c;->Authorized:Lv5/c;

    goto :goto_0

    :cond_0
    sget-object p2, Lv5/c;->Denied:Lv5/c;

    :goto_0
    invoke-static {p3, p2}, Lz5/e;->p(Lkotlin/jvm/internal/x;Lv5/c;)V

    :cond_1
    const-string p2, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    if-eqz v2, :cond_4

    const-string v0, "android.permission.READ_MEDIA_VIDEO"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ly5/a;->j(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lv5/c;->Authorized:Lv5/c;

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2}, Ly5/a;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lv5/c;->Limited:Lv5/c;

    goto :goto_1

    :cond_3
    sget-object v0, Lv5/c;->Denied:Lv5/c;

    :goto_1
    invoke-static {p3, v0}, Lz5/e;->p(Lkotlin/jvm/internal/x;Lv5/c;)V

    :cond_4
    if-eqz v1, :cond_7

    const-string v0, "android.permission.READ_MEDIA_IMAGES"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ly5/a;->j(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lv5/c;->Authorized:Lv5/c;

    goto :goto_2

    :cond_5
    invoke-virtual {p0, p1, p2}, Ly5/a;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lv5/c;->Limited:Lv5/c;

    goto :goto_2

    :cond_6
    sget-object p1, Lv5/c;->Denied:Lv5/c;

    :goto_2
    invoke-static {p3, p1}, Lz5/e;->p(Lkotlin/jvm/internal/x;Lv5/c;)V

    :cond_7
    iget-object p1, p3, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast p1, Lv5/c;

    return-object p1
.end method

.method public d(Ly5/c;Landroid/content/Context;[Ljava/lang/String;[ILjava/util/List;Ljava/util/List;Ljava/util/List;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly5/c;",
            "Landroid/content/Context;",
            "[",
            "Ljava/lang/String;",
            "[I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    const-string v5, "permissionsUtils"

    move-object/from16 v6, p1

    invoke-static {v6, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "context"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "permissions"

    move-object/from16 v7, p3

    invoke-static {v7, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "grantResults"

    move-object/from16 v7, p4

    invoke-static {v7, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "needToRequestPermissionsList"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "deniedPermissionsList"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "grantedPermissionsList"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0xbba

    const/4 v7, 0x1

    move/from16 v8, p8

    if-ne v8, v5, :cond_1

    invoke-virtual/range {p0 .. p0}, Ly5/a;->b()Lb6/e;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ly5/a;->o(Lb6/e;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string v5, "android.permission.READ_MEDIA_IMAGES"

    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "android.permission.READ_MEDIA_VIDEO"

    invoke-interface {v2, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    const-string v11, "android.permission.READ_MEDIA_AUDIO"

    invoke-interface {v2, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    const-string v13, "android.permission.ACCESS_MEDIA_LOCATION"

    invoke-interface {v2, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v14

    const-string v15, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    invoke-interface {v2, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v16

    if-nez v8, :cond_3

    if-nez v10, :cond_3

    if-eqz v16, :cond_2

    goto :goto_0

    :cond_2
    move v5, v7

    goto :goto_1

    :cond_3
    :goto_0
    filled-new-array {v15, v5, v9}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v1, v5}, Ly5/a;->e(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v5

    :goto_1
    const/4 v8, 0x0

    if-eqz v12, :cond_5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v1, v11}, Ly5/a;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v7

    goto :goto_2

    :cond_4
    move v5, v8

    :cond_5
    :goto_2
    if-eqz v14, :cond_7

    if-eqz v5, :cond_6

    invoke-virtual {v0, v1, v13}, Ly5/a;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    move v7, v8

    :goto_3
    move v5, v7

    :cond_7
    invoke-virtual/range {p1 .. p1}, Ly5/c;->e()Ly5/b;

    move-result-object v1

    if-nez v1, :cond_8

    return-void

    :cond_8
    if-eqz v5, :cond_9

    invoke-interface {v1, v2}, Ly5/b;->a(Ljava/util/List;)V

    goto :goto_4

    :cond_9
    invoke-interface {v1, v3, v4, v2}, Ly5/b;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    :goto_4
    return-void
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

.method public k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public l(Ly5/c;Landroid/app/Application;ILb6/e;)V
    .locals 1

    const-string v0, "permissionsUtils"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "resultHandler"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4}, Ly5/a;->o(Lb6/e;)V

    sget-object p2, Lx5/g;->a:Lx5/g;

    invoke-virtual {p2, p3}, Lx5/g;->c(I)Z

    move-result p4

    invoke-virtual {p2, p3}, Lx5/g;->d(I)Z

    move-result p2

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    if-nez p2, :cond_0

    if-eqz p4, :cond_1

    :cond_0
    const-string v0, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p2, :cond_2

    const-string p2, "android.permission.READ_MEDIA_VIDEO"

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz p4, :cond_3

    const-string p2, "android.permission.READ_MEDIA_IMAGES"

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0, p1, p3}, Ly5/a;->n(Ly5/c;Ljava/util/List;)V

    return-void
.end method

.method public m(Ly5/c;Landroid/content/Context;IZ)V
    .locals 6

    const-string v0, "permissionsUtils"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestPermission"

    invoke-static {v0}, Lb6/a;->a(Ljava/lang/Object;)V

    sget-object v0, Lx5/g;->a:Lx5/g;

    invoke-virtual {v0, p3}, Lx5/g;->c(I)Z

    move-result v1

    invoke-virtual {v0, p3}, Lx5/g;->d(I)Z

    move-result v2

    invoke-virtual {v0, p3}, Lx5/g;->b(I)Z

    move-result p3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v5, v4

    goto :goto_2

    :cond_1
    :goto_0
    const-string v5, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2, v5}, Ly5/a;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz p4, :cond_3

    const-string p4, "android.permission.ACCESS_MEDIA_LOCATION"

    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v5, :cond_2

    invoke-virtual {p0, p2, p4}, Ly5/a;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_2

    move v5, v4

    goto :goto_1

    :cond_2
    move v5, v3

    :cond_3
    :goto_1
    if-eqz v2, :cond_4

    const-string p4, "android.permission.READ_MEDIA_VIDEO"

    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eqz v1, :cond_5

    const-string p4, "android.permission.READ_MEDIA_IMAGES"

    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_2
    if-eqz p3, :cond_7

    const-string p3, "android.permission.READ_MEDIA_AUDIO"

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v5, :cond_6

    invoke-virtual {p0, p2, p3}, Ly5/a;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    move v3, v4

    :cond_6
    move v5, v3

    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Current permissions: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lb6/a;->a(Ljava/lang/Object;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "havePermission: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lb6/a;->a(Ljava/lang/Object;)V

    if-eqz v5, :cond_8

    invoke-virtual {p1}, Ly5/c;->e()Ly5/b;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-interface {p1, v0}, Ly5/b;->a(Ljava/util/List;)V

    goto :goto_3

    :cond_8
    invoke-virtual {p0, p1, v0}, Ly5/a;->n(Ly5/c;Ljava/util/List;)V

    :cond_9
    :goto_3
    return-void
.end method
