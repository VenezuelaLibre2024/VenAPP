.class public final Lcom/facebook/login/r;
.super Lcom/facebook/login/k0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/r$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/login/r;",
            ">;"
        }
    .end annotation
.end field

.field public static final r:Lcom/facebook/login/r$b;


# instance fields
.field private final e:Ljava/lang/String;

.field private final f:Li4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/login/r$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/login/r$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/login/r;->r:Lcom/facebook/login/r$b;

    new-instance v0, Lcom/facebook/login/r$a;

    invoke-direct {v0}, Lcom/facebook/login/r$a;-><init>()V

    sput-object v0, Lcom/facebook/login/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/k0;-><init>(Landroid/os/Parcel;)V

    const-string p1, "instagram_login"

    iput-object p1, p0, Lcom/facebook/login/r;->e:Ljava/lang/String;

    sget-object p1, Li4/h;->INSTAGRAM_APPLICATION_WEB:Li4/h;

    iput-object p1, p0, Lcom/facebook/login/r;->f:Li4/h;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/login/u;)V
    .locals 1

    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/k0;-><init>(Lcom/facebook/login/u;)V

    const-string p1, "instagram_login"

    iput-object p1, p0, Lcom/facebook/login/r;->e:Ljava/lang/String;

    sget-object p1, Li4/h;->INSTAGRAM_APPLICATION_WEB:Li4/h;

    iput-object p1, p0, Lcom/facebook/login/r;->f:Li4/h;

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

    iget-object v0, p0, Lcom/facebook/login/r;->e:Ljava/lang/String;

    return-object v0
.end method

.method public o(Lcom/facebook/login/u$e;)I
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "request"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/login/u;->x:Lcom/facebook/login/u$c;

    invoke-virtual {v1}, Lcom/facebook/login/u$c;->a()Ljava/lang/String;

    move-result-object v15

    sget-object v3, Lcom/facebook/internal/e0;->a:Lcom/facebook/internal/e0;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/login/u;->i()Landroidx/fragment/app/e;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-static {}, Li4/e0;->l()Landroid/content/Context;

    move-result-object v3

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->n()Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->t()Z

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->p()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->g()Lcom/facebook/login/e;

    move-result-object v8

    if-nez v8, :cond_1

    sget-object v8, Lcom/facebook/login/e;->NONE:Lcom/facebook/login/e;

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/facebook/login/f0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->l()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->o()Z

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->r()Z

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/login/u$e;->A()Z

    move-result v14

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v15

    invoke-static/range {v2 .. v14}, Lcom/facebook/internal/e0;->j(Landroid/content/Context;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;ZZLcom/facebook/login/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "e2e"

    invoke-virtual {v0, v3, v15}, Lcom/facebook/login/f0;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/facebook/login/u$c;->b()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lcom/facebook/login/k0;->B(Landroid/content/Intent;I)Z

    move-result v1

    return v1
.end method

.method public u()Li4/h;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/r;->f:Li4/h;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/facebook/login/f0;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
