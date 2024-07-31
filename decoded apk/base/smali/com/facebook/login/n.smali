.class public Lcom/facebook/login/n;
.super Lcom/facebook/login/f0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/n$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/login/n;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/facebook/login/n$b;

.field private static f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# instance fields
.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/login/n$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/login/n$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/login/n;->e:Lcom/facebook/login/n$b;

    new-instance v0, Lcom/facebook/login/n$a;

    invoke-direct {v0}, Lcom/facebook/login/n$a;-><init>()V

    sput-object v0, Lcom/facebook/login/n;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/f0;-><init>(Landroid/os/Parcel;)V

    const-string p1, "device_auth"

    iput-object p1, p0, Lcom/facebook/login/n;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/login/u;)V
    .locals 1

    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/f0;-><init>(Lcom/facebook/login/u;)V

    const-string p1, "device_auth"

    iput-object p1, p0, Lcom/facebook/login/n;->d:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic p()Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 1

    sget-object v0, Lcom/facebook/login/n;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object v0
.end method

.method public static final synthetic r(Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V
    .locals 0

    sput-object p0, Lcom/facebook/login/n;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-void
.end method

.method private final w(Lcom/facebook/login/u$e;)V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/u;->i()Landroidx/fragment/app/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/login/n;->s()Lcom/facebook/login/m;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/fragment/app/e;->getSupportFragmentManager()Landroidx/fragment/app/n;

    move-result-object v0

    const-string v2, "login_with_facebook"

    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/d;->p(Landroidx/fragment/app/n;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/facebook/login/m;->R(Lcom/facebook/login/u$e;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/n;->d:Ljava/lang/String;

    return-object v0
.end method

.method public o(Lcom/facebook/login/u$e;)I
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/n;->w(Lcom/facebook/login/u$e;)V

    const/4 p1, 0x1

    return p1
.end method

.method protected s()Lcom/facebook/login/m;
    .locals 1

    new-instance v0, Lcom/facebook/login/m;

    invoke-direct {v0}, Lcom/facebook/login/m;-><init>()V

    return-object v0
.end method

.method public t()V
    .locals 3

    sget-object v0, Lcom/facebook/login/u$f;->t:Lcom/facebook/login/u$f$c;

    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/login/u;->o()Lcom/facebook/login/u$e;

    move-result-object v1

    const-string v2, "User canceled log in."

    invoke-virtual {v0, v1, v2}, Lcom/facebook/login/u$f$c;->a(Lcom/facebook/login/u$e;Ljava/lang/String;)Lcom/facebook/login/u$f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/login/u;->g(Lcom/facebook/login/u$f;)V

    return-void
.end method

.method public u(Ljava/lang/Exception;)V
    .locals 8

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/login/u$f;->t:Lcom/facebook/login/u$f$c;

    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/u;->o()Lcom/facebook/login/u$e;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/facebook/login/u$f$c;->d(Lcom/facebook/login/u$f$c;Lcom/facebook/login/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/facebook/login/u$f;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/login/u;->g(Lcom/facebook/login/u$f;)V

    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Li4/h;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Li4/h;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    const-string v0, "accessToken"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li4/a;

    const/4 v12, 0x0

    const/16 v13, 0x400

    const/4 v14, 0x0

    move-object v1, v0

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v14}, Li4/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Li4/h;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ILkotlin/jvm/internal/g;)V

    sget-object v1, Lcom/facebook/login/u$f;->t:Lcom/facebook/login/u$f$c;

    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/login/u;->o()Lcom/facebook/login/u$e;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/facebook/login/u$f$c;->e(Lcom/facebook/login/u$e;Li4/a;)Lcom/facebook/login/u$f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/login/u;->g(Lcom/facebook/login/u$f;)V

    return-void
.end method
