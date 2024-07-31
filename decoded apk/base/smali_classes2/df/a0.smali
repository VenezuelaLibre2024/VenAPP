.class public final Ldf/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldf/a0;

.field private static final b:Ljd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldf/a0;

    invoke-direct {v0}, Ldf/a0;-><init>()V

    sput-object v0, Ldf/a0;->a:Ldf/a0;

    new-instance v0, Lld/d;

    invoke-direct {v0}, Lld/d;-><init>()V

    sget-object v1, Ldf/c;->a:Lkd/a;

    invoke-virtual {v0, v1}, Lld/d;->i(Lkd/a;)Lld/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lld/d;->j(Z)Lld/d;

    move-result-object v0

    invoke-virtual {v0}, Lld/d;->h()Ljd/a;

    move-result-object v0

    const-string v1, "JsonDataEncoderBuilder()\u2026lues(true)\n      .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ldf/a0;->b:Ljd/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(Lef/b;)Ldf/d;
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Ldf/d;->COLLECTION_SDK_NOT_INSTALLED:Ldf/d;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lef/b;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ldf/d;->COLLECTION_ENABLED:Ldf/d;

    goto :goto_0

    :cond_1
    sget-object p1, Ldf/d;->COLLECTION_DISABLED:Ldf/d;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final a(Lzb/g;Ldf/y;Lff/f;Ldf/t;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)Ldf/z;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Ldf/y;",
            "Lff/f;",
            "Ldf/t;",
            "Ljava/util/List<",
            "Ldf/t;",
            ">;",
            "Ljava/util/Map<",
            "Lef/b$a;",
            "+",
            "Lef/b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ldf/z;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    const-string v2, "firebaseApp"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sessionDetails"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sessionsSettings"

    move-object/from16 v5, p3

    invoke-static {v5, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "currentProcessDetails"

    move-object/from16 v6, p4

    invoke-static {v6, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "appProcessDetails"

    move-object/from16 v6, p5

    invoke-static {v6, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "subscribers"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "firebaseInstallationId"

    move-object/from16 v11, p7

    invoke-static {v11, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ldf/z;

    sget-object v12, Ldf/i;->SESSION_START:Ldf/i;

    new-instance v13, Ldf/e0;

    invoke-virtual/range {p2 .. p2}, Ldf/y;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Ldf/y;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Ldf/y;->c()I

    move-result v8

    invoke-virtual/range {p2 .. p2}, Ldf/y;->d()J

    move-result-wide v9

    new-instance v14, Ldf/e;

    sget-object v4, Lef/b$a;->PERFORMANCE:Lef/b$a;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lef/b;

    invoke-direct {v0, v4}, Ldf/a0;->d(Lef/b;)Ldf/d;

    move-result-object v4

    sget-object v15, Lef/b$a;->CRASHLYTICS:Lef/b$a;

    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lef/b;

    invoke-direct {v0, v1}, Ldf/a0;->d(Lef/b;)Ldf/d;

    move-result-object v1

    move-object/from16 p4, v2

    invoke-virtual/range {p3 .. p3}, Lff/f;->b()D

    move-result-wide v2

    invoke-direct {v14, v4, v1, v2, v3}, Ldf/e;-><init>(Ldf/d;Ldf/d;D)V

    move-object v4, v13

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-wide v8, v9

    move-object v10, v14

    invoke-direct/range {v4 .. v11}, Ldf/e0;-><init>(Ljava/lang/String;Ljava/lang/String;IJLdf/e;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Ldf/a0;->b(Lzb/g;)Ldf/b;

    move-result-object v1

    move-object/from16 v2, p4

    invoke-direct {v2, v12, v13, v1}, Ldf/z;-><init>(Ldf/i;Ldf/e0;Ldf/b;)V

    return-object v2
.end method

.method public final b(Lzb/g;)Ldf/b;
    .locals 17

    const-string v0, "firebaseApp"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v0

    const-string v2, "firebaseApp.applicationContext"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v4, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-lt v3, v5, :cond_0

    invoke-static {v0}, Landroidx/core/content/pm/d;->a(Landroid/content/pm/PackageInfo;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    iget v3, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    move-object v6, v3

    new-instance v14, Ldf/b;

    invoke-virtual/range {p1 .. p1}, Lzb/g;->r()Lzb/p;

    move-result-object v3

    invoke-virtual {v3}, Lzb/p;->c()Ljava/lang/String;

    move-result-object v10

    const-string v3, "firebaseApp.options.applicationId"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v3, "MODEL"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "1.2.0"

    sget-object v13, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v3, "RELEASE"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v15, Ldf/s;->LOG_ENVIRONMENT_PROD:Ldf/s;

    new-instance v16, Ldf/a;

    const-string v3, "packageName"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v0, :cond_1

    move-object v5, v6

    goto :goto_1

    :cond_1
    move-object v5, v0

    :goto_1
    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v0, "MANUFACTURER"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ldf/u;->a:Ldf/u;

    invoke-virtual/range {p1 .. p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ldf/u;->d(Landroid/content/Context;)Ldf/t;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ldf/u;->c(Landroid/content/Context;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v3, v16

    invoke-direct/range {v3 .. v9}, Ldf/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldf/t;Ljava/util/List;)V

    move-object v7, v14

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object v12, v15

    move-object/from16 v13, v16

    invoke-direct/range {v7 .. v13}, Ldf/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldf/s;Ldf/a;)V

    return-object v14
.end method

.method public final c()Ljd/a;
    .locals 1

    sget-object v0, Ldf/a0;->b:Ljd/a;

    return-object v0
.end method
