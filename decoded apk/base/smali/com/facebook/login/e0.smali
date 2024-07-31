.class public Lcom/facebook/login/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/e0$a;,
        Lcom/facebook/login/e0$c;,
        Lcom/facebook/login/e0$b;
    }
.end annotation


# static fields
.field public static final j:Lcom/facebook/login/e0$b;

.field private static final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Ljava/lang/String;

.field private static volatile m:Lcom/facebook/login/e0;


# instance fields
.field private a:Lcom/facebook/login/t;

.field private b:Lcom/facebook/login/e;

.field private final c:Landroid/content/SharedPreferences;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Lcom/facebook/login/i0;

.field private h:Z

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/login/e0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/login/e0$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/login/e0;->j:Lcom/facebook/login/e0$b;

    invoke-static {v0}, Lcom/facebook/login/e0$b;->a(Lcom/facebook/login/e0$b;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/facebook/login/e0;->k:Ljava/util/Set;

    const-class v0, Lcom/facebook/login/e0;

    invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoginManager::class.java.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/login/e0;->l:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/login/t;->NATIVE_WITH_FALLBACK:Lcom/facebook/login/t;

    iput-object v0, p0, Lcom/facebook/login/e0;->a:Lcom/facebook/login/t;

    sget-object v0, Lcom/facebook/login/e;->FRIENDS:Lcom/facebook/login/e;

    iput-object v0, p0, Lcom/facebook/login/e0;->b:Lcom/facebook/login/e;

    const-string v0, "rerequest"

    iput-object v0, p0, Lcom/facebook/login/e0;->d:Ljava/lang/String;

    sget-object v0, Lcom/facebook/login/i0;->FACEBOOK:Lcom/facebook/login/i0;

    iput-object v0, p0, Lcom/facebook/login/e0;->g:Lcom/facebook/login/i0;

    invoke-static {}, Lcom/facebook/internal/o0;->l()V

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.facebook.loginManager"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/login/e0;->c:Landroid/content/SharedPreferences;

    sget-boolean v0, Li4/e0;->q:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/internal/f;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/login/d;

    invoke-direct {v0}, Lcom/facebook/login/d;-><init>()V

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.android.chrome"

    invoke-static {v1, v2, v0}, Landroidx/browser/customtabs/c;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/browser/customtabs/e;)Z

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/browser/customtabs/c;->b(Landroid/content/Context;Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method private final B(Lcom/facebook/login/n0;Lcom/facebook/login/u$e;)V
    .locals 8

    invoke-interface {p1}, Lcom/facebook/login/n0;->a()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/facebook/login/e0;->p(Landroid/content/Context;Lcom/facebook/login/u$e;)V

    sget-object v0, Lcom/facebook/internal/d;->b:Lcom/facebook/internal/d$b;

    sget-object v1, Lcom/facebook/internal/d$c;->Login:Lcom/facebook/internal/d$c;

    invoke-virtual {v1}, Lcom/facebook/internal/d$c;->h()I

    move-result v1

    new-instance v2, Lcom/facebook/login/d0;

    invoke-direct {v2, p0}, Lcom/facebook/login/d0;-><init>(Lcom/facebook/login/e0;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/internal/d$b;->c(ILcom/facebook/internal/d$a;)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/login/e0;->D(Lcom/facebook/login/n0;Lcom/facebook/login/u$e;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Li4/r;

    const-string v1, "Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest."

    invoke-direct {v0, v1}, Li4/r;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-interface {p1}, Lcom/facebook/login/n0;->a()Landroid/app/Activity;

    move-result-object v2

    sget-object v3, Lcom/facebook/login/u$f$a;->ERROR:Lcom/facebook/login/u$f$a;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, v0

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lcom/facebook/login/e0;->l(Landroid/content/Context;Lcom/facebook/login/u$f$a;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/u$e;)V

    throw v0
.end method

.method private static final C(Lcom/facebook/login/e0;ILandroid/content/Intent;)Z
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/facebook/login/e0;->r(Lcom/facebook/login/e0;ILandroid/content/Intent;Li4/o;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final D(Lcom/facebook/login/n0;Lcom/facebook/login/u$e;)Z
    .locals 2

    invoke-virtual {p0, p2}, Lcom/facebook/login/e0;->i(Lcom/facebook/login/u$e;)Landroid/content/Intent;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/facebook/login/e0;->u(Landroid/content/Intent;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/login/u;->x:Lcom/facebook/login/u$c;

    invoke-virtual {v0}, Lcom/facebook/login/u$c;->b()I

    move-result v0

    invoke-interface {p1, p2, v0}, Lcom/facebook/login/n0;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    return v1
.end method

.method public static synthetic a(Ljava/lang/String;Lcom/facebook/login/a0;Li4/r0;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/facebook/login/e0;->y(Ljava/lang/String;Lcom/facebook/login/a0;Li4/r0;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/login/e0;ILandroid/content/Intent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/facebook/login/e0;->C(Lcom/facebook/login/e0;ILandroid/content/Intent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lcom/facebook/login/e0;Li4/o;ILandroid/content/Intent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/facebook/login/e0;->t(Lcom/facebook/login/e0;Li4/o;ILandroid/content/Intent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d()Lcom/facebook/login/e0;
    .locals 1

    sget-object v0, Lcom/facebook/login/e0;->m:Lcom/facebook/login/e0;

    return-object v0
.end method

.method public static final synthetic e()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/facebook/login/e0;->k:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic f(Lcom/facebook/login/e0;)V
    .locals 0

    sput-object p0, Lcom/facebook/login/e0;->m:Lcom/facebook/login/e0;

    return-void
.end method

.method private final h(Li4/a;Li4/i;Lcom/facebook/login/u$e;Li4/r;ZLi4/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li4/a;",
            "Li4/i;",
            "Lcom/facebook/login/u$e;",
            "Li4/r;",
            "Z",
            "Li4/o<",
            "Lcom/facebook/login/g0;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object v0, Li4/a;->w:Li4/a$c;

    invoke-virtual {v0, p1}, Li4/a$c;->h(Li4/a;)V

    sget-object v0, Li4/s0;->s:Li4/s0$b;

    invoke-virtual {v0}, Li4/s0$b;->a()V

    :cond_0
    if-eqz p2, :cond_1

    sget-object v0, Li4/i;->f:Li4/i$b;

    invoke-virtual {v0, p2}, Li4/i$b;->a(Li4/i;)V

    :cond_1
    if-eqz p6, :cond_6

    if-eqz p1, :cond_2

    if-eqz p3, :cond_2

    sget-object v0, Lcom/facebook/login/e0;->j:Lcom/facebook/login/e0$b;

    invoke-virtual {v0, p3, p1, p2}, Lcom/facebook/login/e0$b;->c(Lcom/facebook/login/u$e;Li4/a;Li4/i;)Lcom/facebook/login/g0;

    move-result-object p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p5, :cond_5

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/facebook/login/g0;->b()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p4, :cond_4

    invoke-interface {p6, p4}, Li4/o;->a(Li4/r;)V

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/facebook/login/e0;->z(Z)V

    invoke-interface {p6, p2}, Li4/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    :goto_1
    invoke-interface {p6}, Li4/o;->onCancel()V

    :cond_6
    :goto_2
    return-void
.end method

.method public static j()Lcom/facebook/login/e0;
    .locals 1

    sget-object v0, Lcom/facebook/login/e0;->j:Lcom/facebook/login/e0$b;

    invoke-virtual {v0}, Lcom/facebook/login/e0$b;->d()Lcom/facebook/login/e0;

    move-result-object v0

    return-object v0
.end method

.method private final k()Z
    .locals 3

    iget-object v0, p0, Lcom/facebook/login/e0;->c:Landroid/content/SharedPreferences;

    const-string v1, "express_login_allowed"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private final l(Landroid/content/Context;Lcom/facebook/login/u$f$a;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/u$e;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/login/u$f$a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Exception;",
            "Z",
            "Lcom/facebook/login/u$e;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/facebook/login/e0$c;->a:Lcom/facebook/login/e0$c;

    invoke-virtual {v0, p1}, Lcom/facebook/login/e0$c;->a(Landroid/content/Context;)Lcom/facebook/login/a0;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-nez p6, :cond_1

    const-string p2, "fb_mobile_login_complete"

    const-string p3, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest."

    const/4 p4, 0x0

    const/4 p5, 0x4

    const/4 p6, 0x0

    move-object p1, v1

    invoke-static/range {p1 .. p6}, Lcom/facebook/login/a0;->o(Lcom/facebook/login/a0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    if-eqz p5, :cond_2

    const-string p1, "1"

    goto :goto_0

    :cond_2
    const-string p1, "0"

    :goto_0
    const-string p5, "try_login_activity"

    invoke-interface {v3, p5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p6}, Lcom/facebook/login/u$e;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p6}, Lcom/facebook/login/u$e;->r()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "foa_mobile_login_complete"

    goto :goto_1

    :cond_3
    const-string p1, "fb_mobile_login_complete"

    :goto_1
    move-object v7, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v7}, Lcom/facebook/login/a0;->f(Ljava/lang/String;Ljava/util/Map;Lcom/facebook/login/u$f$a;Ljava/util/Map;Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method private final p(Landroid/content/Context;Lcom/facebook/login/u$e;)V
    .locals 1

    sget-object v0, Lcom/facebook/login/e0$c;->a:Lcom/facebook/login/e0$c;

    invoke-virtual {v0, p1}, Lcom/facebook/login/e0$c;->a(Landroid/content/Context;)Lcom/facebook/login/a0;

    move-result-object p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/facebook/login/u$e;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "foa_mobile_login_start"

    goto :goto_0

    :cond_0
    const-string v0, "fb_mobile_login_start"

    :goto_0
    invoke-virtual {p1, p2, v0}, Lcom/facebook/login/a0;->m(Lcom/facebook/login/u$e;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static synthetic r(Lcom/facebook/login/e0;ILandroid/content/Intent;Li4/o;ILjava/lang/Object;)Z
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/login/e0;->q(ILandroid/content/Intent;Li4/o;)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onActivityResult"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final t(Lcom/facebook/login/e0;Li4/o;ILandroid/content/Intent;)Z
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3, p1}, Lcom/facebook/login/e0;->q(ILandroid/content/Intent;Li4/o;)Z

    move-result p0

    return p0
.end method

.method private final u(Landroid/content/Intent;)Z
    .locals 2

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private final x(Landroid/content/Context;Li4/r0;J)V
    .locals 11

    invoke-static {}, Li4/e0;->m()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v0, "randomUUID().toString()"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lcom/facebook/login/a0;

    if-nez p1, :cond_0

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {v10, v0, v8}, Lcom/facebook/login/a0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/login/e0;->k()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v10, v9}, Lcom/facebook/login/a0;->j(Ljava/lang/String;)V

    invoke-interface {p2}, Li4/r0;->a()V

    return-void

    :cond_1
    sget-object v0, Lcom/facebook/login/h0;->y:Lcom/facebook/login/h0$a;

    invoke-static {}, Li4/e0;->w()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    move-object v1, p1

    move-object v2, v8

    move-object v3, v9

    move-wide v5, p3

    invoke-virtual/range {v0 .. v7}, Lcom/facebook/login/h0$a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/facebook/login/h0;

    move-result-object p1

    new-instance p3, Lcom/facebook/login/c0;

    invoke-direct {p3, v9, v10, p2, v8}, Lcom/facebook/login/c0;-><init>(Ljava/lang/String;Lcom/facebook/login/a0;Li4/r0;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Lcom/facebook/internal/f0;->g(Lcom/facebook/internal/f0$b;)V

    invoke-virtual {v10, v9}, Lcom/facebook/login/a0;->k(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/internal/f0;->h()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v10, v9}, Lcom/facebook/login/a0;->j(Ljava/lang/String;)V

    invoke-interface {p2}, Li4/r0;->a()V

    :cond_2
    return-void
.end method

.method private static final y(Ljava/lang/String;Lcom/facebook/login/a0;Li4/r0;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 18

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p4

    const-string v1, "$loggerRef"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$logger"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$responseCallback"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$applicationId"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_a

    const-string v1, "com.facebook.platform.status.ERROR_TYPE"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "com.facebook.platform.status.ERROR_DESCRIPTION"

    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v1, :cond_0

    sget-object v0, Lcom/facebook/login/e0;->j:Lcom/facebook/login/e0$b;

    move-object v2, v6

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v5}, Lcom/facebook/login/e0$b;->b(Lcom/facebook/login/e0$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/a0;Li4/r0;)V

    goto/16 :goto_7

    :cond_0
    const-string v1, "com.facebook.platform.extra.ACCESS_TOKEN"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    sget-object v1, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    new-instance v1, Ljava/util/Date;

    const-wide/16 v8, 0x0

    invoke-direct {v1, v8, v9}, Ljava/util/Date;-><init>(J)V

    const-string v6, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH"

    invoke-static {v0, v6, v1}, Lcom/facebook/internal/n0;->y(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v14

    const-string v1, "com.facebook.platform.extra.PERMISSIONS"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v10

    const-string v1, "signed request"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "graph_domain"

    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v8, v9}, Ljava/util/Date;-><init>(J)V

    const-string v8, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME"

    invoke-static {v0, v8, v6}, Lcom/facebook/internal/n0;->y(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v16

    const/4 v0, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-nez v8, :cond_1

    goto :goto_0

    :cond_1
    move v8, v0

    goto :goto_1

    :cond_2
    :goto_0
    move v8, v6

    :goto_1
    if-nez v8, :cond_3

    sget-object v8, Lcom/facebook/login/f0;->c:Lcom/facebook/login/f0$a;

    invoke-virtual {v8, v1}, Lcom/facebook/login/f0$a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    move-object v9, v1

    if-eqz v7, :cond_5

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    move v1, v0

    goto :goto_4

    :cond_5
    :goto_3
    move v1, v6

    :goto_4
    if-nez v1, :cond_a

    if-eqz v10, :cond_7

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    move v1, v0

    goto :goto_6

    :cond_7
    :goto_5
    move v1, v6

    :goto_6
    if-nez v1, :cond_a

    if-eqz v9, :cond_8

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    move v0, v6

    :cond_9
    if-nez v0, :cond_a

    new-instance v0, Li4/a;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object v6, v0

    move-object/from16 v8, p3

    invoke-direct/range {v6 .. v17}, Li4/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Li4/h;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V

    sget-object v1, Li4/a;->w:Li4/a$c;

    invoke-virtual {v1, v0}, Li4/a$c;->h(Li4/a;)V

    sget-object v1, Li4/s0;->s:Li4/s0$b;

    invoke-virtual {v1}, Li4/s0$b;->a()V

    invoke-virtual {v4, v3}, Lcom/facebook/login/a0;->l(Ljava/lang/String;)V

    invoke-interface {v5, v0}, Li4/r0;->b(Li4/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v4, v3}, Lcom/facebook/login/a0;->j(Ljava/lang/String;)V

    invoke-interface/range {p2 .. p2}, Li4/r0;->a()V

    :goto_7
    return-void
.end method

.method private final z(Z)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/e0;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "express_login_allowed"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public final A(Lcom/facebook/login/t;)Lcom/facebook/login/e0;
    .locals 1

    const-string v0, "loginBehavior"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/login/e0;->a:Lcom/facebook/login/t;

    return-object p0
.end method

.method protected g(Lcom/facebook/login/v;)Lcom/facebook/login/u$e;
    .locals 14

    const-string v0, "loginConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/login/a;->S256:Lcom/facebook/login/a;

    :try_start_0
    sget-object v1, Lcom/facebook/login/m0;->a:Lcom/facebook/login/m0;

    invoke-virtual {p1}, Lcom/facebook/login/v;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/facebook/login/m0;->b(Ljava/lang/String;Lcom/facebook/login/a;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Li4/r; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lcom/facebook/login/a;->PLAIN:Lcom/facebook/login/a;

    invoke-virtual {p1}, Lcom/facebook/login/v;->a()Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v13, v0

    move-object v12, v1

    new-instance v0, Lcom/facebook/login/u$e;

    iget-object v3, p0, Lcom/facebook/login/e0;->a:Lcom/facebook/login/t;

    invoke-virtual {p1}, Lcom/facebook/login/v;->c()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Ldk/p;->j0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/login/e0;->b:Lcom/facebook/login/e;

    iget-object v6, p0, Lcom/facebook/login/e0;->d:Ljava/lang/String;

    invoke-static {}, Li4/e0;->m()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v1, "randomUUID().toString()"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, p0, Lcom/facebook/login/e0;->g:Lcom/facebook/login/i0;

    invoke-virtual {p1}, Lcom/facebook/login/v;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lcom/facebook/login/v;->a()Ljava/lang/String;

    move-result-object v11

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Lcom/facebook/login/u$e;-><init>(Lcom/facebook/login/t;Ljava/util/Set;Lcom/facebook/login/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/a;)V

    sget-object p1, Li4/a;->w:Li4/a$c;

    invoke-virtual {p1}, Li4/a$c;->g()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/facebook/login/u$e;->x(Z)V

    iget-object p1, p0, Lcom/facebook/login/e0;->e:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/facebook/login/u$e;->v(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/facebook/login/e0;->f:Z

    invoke-virtual {v0, p1}, Lcom/facebook/login/u$e;->y(Z)V

    iget-boolean p1, p0, Lcom/facebook/login/e0;->h:Z

    invoke-virtual {v0, p1}, Lcom/facebook/login/u$e;->u(Z)V

    iget-boolean p1, p0, Lcom/facebook/login/e0;->i:Z

    invoke-virtual {v0, p1}, Lcom/facebook/login/u$e;->z(Z)V

    return-object v0
.end method

.method protected i(Lcom/facebook/login/u$e;)Landroid/content/Intent;
    .locals 4

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/facebook/FacebookActivity;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->j()Lcom/facebook/login/t;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "com.facebook.LoginFragment:Request"

    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v1
.end method

.method public final m(Landroid/app/Activity;Lcom/facebook/login/v;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroidx/activity/result/d;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/login/e0;->l:Ljava/lang/String;

    const-string v1, "You\'re calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult()."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/login/e0;->g(Lcom/facebook/login/v;)Lcom/facebook/login/u$e;

    move-result-object p2

    new-instance v0, Lcom/facebook/login/e0$a;

    invoke-direct {v0, p1}, Lcom/facebook/login/e0$a;-><init>(Landroid/app/Activity;)V

    invoke-direct {p0, v0, p2}, Lcom/facebook/login/e0;->B(Lcom/facebook/login/n0;Lcom/facebook/login/u$e;)V

    return-void
.end method

.method public final n(Landroid/app/Activity;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/login/v;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p2, v1, v2, v1}, Lcom/facebook/login/v;-><init>(Ljava/util/Collection;Ljava/lang/String;ILkotlin/jvm/internal/g;)V

    invoke-virtual {p0, p1, v0}, Lcom/facebook/login/e0;->m(Landroid/app/Activity;Lcom/facebook/login/v;)V

    return-void
.end method

.method public o()V
    .locals 2

    sget-object v0, Li4/a;->w:Li4/a$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li4/a$c;->h(Li4/a;)V

    sget-object v0, Li4/i;->f:Li4/i$b;

    invoke-virtual {v0, v1}, Li4/i$b;->a(Li4/i;)V

    sget-object v0, Li4/s0;->s:Li4/s0$b;

    invoke-virtual {v0, v1}, Li4/s0$b;->c(Li4/s0;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/login/e0;->z(Z)V

    return-void
.end method

.method public q(ILandroid/content/Intent;Li4/o;)Z
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            "Li4/o<",
            "Lcom/facebook/login/g0;",
            ">;)Z"
        }
    .end annotation

    move/from16 v0, p1

    move-object/from16 v1, p2

    sget-object v2, Lcom/facebook/login/u$f$a;->ERROR:Lcom/facebook/login/u$f$a;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    const-class v6, Lcom/facebook/login/u$f;

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    const-string v6, "com.facebook.LoginFragment:Result"

    invoke-virtual {v1, v6}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/login/u$f;

    if-eqz v1, :cond_4

    iget-object v2, v1, Lcom/facebook/login/u$f;->f:Lcom/facebook/login/u$e;

    iget-object v6, v1, Lcom/facebook/login/u$f;->a:Lcom/facebook/login/u$f$a;

    const/4 v7, -0x1

    if-eq v0, v7, :cond_1

    if-eqz v0, :cond_0

    :goto_0
    move-object v0, v4

    move-object v7, v0

    goto :goto_1

    :cond_0
    move v5, v3

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/facebook/login/u$f$a;->SUCCESS:Lcom/facebook/login/u$f$a;

    if-ne v6, v0, :cond_2

    iget-object v0, v1, Lcom/facebook/login/u$f;->b:Li4/a;

    iget-object v7, v1, Lcom/facebook/login/u$f;->c:Li4/i;

    goto :goto_1

    :cond_2
    new-instance v0, Li4/n;

    iget-object v7, v1, Lcom/facebook/login/u$f;->d:Ljava/lang/String;

    invoke-direct {v0, v7}, Li4/n;-><init>(Ljava/lang/String;)V

    move-object v7, v4

    move-object v4, v0

    move-object v0, v7

    :goto_1
    iget-object v1, v1, Lcom/facebook/login/u$f;->r:Ljava/util/Map;

    move-object v8, v1

    move v13, v5

    move-object v1, v7

    move-object v7, v6

    goto :goto_2

    :cond_3
    if-nez v0, :cond_4

    sget-object v2, Lcom/facebook/login/u$f$a;->CANCEL:Lcom/facebook/login/u$f$a;

    move-object v7, v2

    move v13, v3

    move-object v0, v4

    move-object v1, v0

    move-object v2, v1

    move-object v8, v2

    goto :goto_2

    :cond_4
    move-object v7, v2

    move-object v0, v4

    move-object v1, v0

    move-object v2, v1

    move-object v8, v2

    move v13, v5

    :goto_2
    if-nez v4, :cond_5

    if-nez v0, :cond_5

    if-nez v13, :cond_5

    new-instance v4, Li4/r;

    const-string v5, "Unexpected call to LoginManager.onActivityResult"

    invoke-direct {v4, v5}, Li4/r;-><init>(Ljava/lang/String;)V

    :cond_5
    move-object v12, v4

    const/4 v10, 0x1

    const/4 v6, 0x0

    move-object v5, p0

    move-object v9, v12

    move-object v11, v2

    invoke-direct/range {v5 .. v11}, Lcom/facebook/login/e0;->l(Landroid/content/Context;Lcom/facebook/login/u$f$a;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/u$e;)V

    move-object v8, p0

    move-object v9, v0

    move-object v10, v1

    move-object/from16 v14, p3

    invoke-direct/range {v8 .. v14}, Lcom/facebook/login/e0;->h(Li4/a;Li4/i;Lcom/facebook/login/u$e;Li4/r;ZLi4/o;)V

    return v3
.end method

.method public final s(Li4/m;Li4/o;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li4/m;",
            "Li4/o<",
            "Lcom/facebook/login/g0;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/facebook/internal/d;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/facebook/internal/d;

    sget-object v0, Lcom/facebook/internal/d$c;->Login:Lcom/facebook/internal/d$c;

    invoke-virtual {v0}, Lcom/facebook/internal/d$c;->h()I

    move-result v0

    new-instance v1, Lcom/facebook/login/b0;

    invoke-direct {v1, p0, p2}, Lcom/facebook/login/b0;-><init>(Lcom/facebook/login/e0;Li4/o;)V

    invoke-virtual {p1, v0, v1}, Lcom/facebook/internal/d;->b(ILcom/facebook/internal/d$a;)V

    return-void

    :cond_0
    new-instance p1, Li4/r;

    const-string p2, "Unexpected CallbackManager, please use the provided Factory."

    invoke-direct {p1, p2}, Li4/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v(Landroid/content/Context;JLi4/r0;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseCallback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p4, p2, p3}, Lcom/facebook/login/e0;->x(Landroid/content/Context;Li4/r0;J)V

    return-void
.end method

.method public final w(Landroid/content/Context;Li4/r0;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x1388

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/facebook/login/e0;->v(Landroid/content/Context;JLi4/r0;)V

    return-void
.end method
