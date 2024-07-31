.class public Lcom/facebook/login/p0;
.super Lcom/facebook/login/o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/p0$a;,
        Lcom/facebook/login/p0$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/login/p0;",
            ">;"
        }
    .end annotation
.end field

.field public static final u:Lcom/facebook/login/p0$c;


# instance fields
.field private f:Lcom/facebook/internal/s0;

.field private r:Ljava/lang/String;

.field private final s:Ljava/lang/String;

.field private final t:Li4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/login/p0$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/login/p0$c;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/login/p0;->u:Lcom/facebook/login/p0$c;

    new-instance v0, Lcom/facebook/login/p0$b;

    invoke-direct {v0}, Lcom/facebook/login/p0$b;-><init>()V

    sput-object v0, Lcom/facebook/login/p0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/o0;-><init>(Landroid/os/Parcel;)V

    const-string v0, "web_view"

    iput-object v0, p0, Lcom/facebook/login/p0;->s:Ljava/lang/String;

    sget-object v0, Li4/h;->WEB_VIEW:Li4/h;

    iput-object v0, p0, Lcom/facebook/login/p0;->t:Li4/h;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/p0;->r:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/login/u;)V
    .locals 1

    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/o0;-><init>(Lcom/facebook/login/u;)V

    const-string p1, "web_view"

    iput-object p1, p0, Lcom/facebook/login/p0;->s:Ljava/lang/String;

    sget-object p1, Li4/h;->WEB_VIEW:Li4/h;

    iput-object p1, p0, Lcom/facebook/login/p0;->t:Li4/h;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/p0;->f:Lcom/facebook/internal/s0;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/internal/s0;->cancel()V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/login/p0;->f:Lcom/facebook/internal/s0;

    :cond_1
    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/p0;->s:Ljava/lang/String;

    return-object v0
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public o(Lcom/facebook/login/u$e;)I
    .locals 6

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/facebook/login/o0;->r(Lcom/facebook/login/u$e;)Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lcom/facebook/login/p0$d;

    invoke-direct {v1, p0, p1}, Lcom/facebook/login/p0$d;-><init>(Lcom/facebook/login/p0;Lcom/facebook/login/u$e;)V

    sget-object v2, Lcom/facebook/login/u;->x:Lcom/facebook/login/u$c;

    invoke-virtual {v2}, Lcom/facebook/login/u$c;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/login/p0;->r:Ljava/lang/String;

    const-string v3, "e2e"

    invoke-virtual {p0, v3, v2}, Lcom/facebook/login/f0;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/login/u;->i()Landroidx/fragment/app/e;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {v2}, Lcom/facebook/internal/n0;->X(Landroid/content/Context;)Z

    move-result v3

    new-instance v4, Lcom/facebook/login/p0$a;

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p0, v2, v5, v0}, Lcom/facebook/login/p0$a;-><init>(Lcom/facebook/login/p0;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/facebook/login/p0;->r:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v4, v0}, Lcom/facebook/login/p0$a;->m(Ljava/lang/String;)Lcom/facebook/login/p0$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/login/p0$a;->p(Z)Lcom/facebook/login/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/login/p0$a;->k(Ljava/lang/String;)Lcom/facebook/login/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->j()Lcom/facebook/login/t;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/login/p0$a;->q(Lcom/facebook/login/t;)Lcom/facebook/login/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->k()Lcom/facebook/login/i0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/login/p0$a;->r(Lcom/facebook/login/i0;)Lcom/facebook/login/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->r()Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/facebook/login/p0$a;->o(Z)Lcom/facebook/login/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->A()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/facebook/login/p0$a;->s(Z)Lcom/facebook/login/p0$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/facebook/internal/s0$a;->h(Lcom/facebook/internal/s0$d;)Lcom/facebook/internal/s0$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/internal/s0$a;->a()Lcom/facebook/internal/s0;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/p0;->f:Lcom/facebook/internal/s0;

    new-instance p1, Lcom/facebook/internal/i;

    invoke-direct {p1}, Lcom/facebook/internal/i;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setRetainInstance(Z)V

    iget-object v1, p0, Lcom/facebook/login/p0;->f:Lcom/facebook/internal/s0;

    invoke-virtual {p1, v1}, Lcom/facebook/internal/i;->x(Landroid/app/Dialog;)V

    invoke-virtual {v2}, Landroidx/fragment/app/e;->getSupportFragmentManager()Landroidx/fragment/app/n;

    move-result-object v1

    const-string v2, "FacebookDialogFragment"

    invoke-virtual {p1, v1, v2}, Landroidx/fragment/app/d;->p(Landroidx/fragment/app/n;Ljava/lang/String;)V

    return v0

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t()Li4/h;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/p0;->t:Li4/h;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/facebook/login/f0;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/facebook/login/p0;->r:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public final x(Lcom/facebook/login/u$e;Landroid/os/Bundle;Li4/r;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/login/o0;->v(Lcom/facebook/login/u$e;Landroid/os/Bundle;Li4/r;)V

    return-void
.end method
