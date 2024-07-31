.class public final Lcom/facebook/login/c;
.super Lcom/facebook/login/o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/c$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/login/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:Lcom/facebook/login/c$b;

.field public static w:Z


# instance fields
.field private f:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private final t:Ljava/lang/String;

.field private final u:Li4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/login/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/login/c$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/login/c;->v:Lcom/facebook/login/c$b;

    new-instance v0, Lcom/facebook/login/c$a;

    invoke-direct {v0}, Lcom/facebook/login/c$a;-><init>()V

    sput-object v0, Lcom/facebook/login/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/o0;-><init>(Landroid/os/Parcel;)V

    const-string v0, "custom_tab"

    iput-object v0, p0, Lcom/facebook/login/c;->t:Ljava/lang/String;

    sget-object v0, Li4/h;->CHROME_CUSTOM_TAB:Li4/h;

    iput-object v0, p0, Lcom/facebook/login/c;->u:Li4/h;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/c;->r:Ljava/lang/String;

    sget-object p1, Lcom/facebook/internal/f;->a:Lcom/facebook/internal/f;

    invoke-direct {p0}, Lcom/facebook/login/c;->z()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/internal/f;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/c;->s:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/login/u;)V
    .locals 1

    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/login/o0;-><init>(Lcom/facebook/login/u;)V

    const-string p1, "custom_tab"

    iput-object p1, p0, Lcom/facebook/login/c;->t:Ljava/lang/String;

    sget-object p1, Li4/h;->CHROME_CUSTOM_TAB:Li4/h;

    iput-object p1, p0, Lcom/facebook/login/c;->u:Li4/h;

    const/16 p1, 0x14

    invoke-static {p1}, Lcom/facebook/internal/n0;->t(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/c;->r:Ljava/lang/String;

    const/4 p1, 0x0

    sput-boolean p1, Lcom/facebook/login/c;->w:Z

    sget-object p1, Lcom/facebook/internal/f;->a:Lcom/facebook/internal/f;

    invoke-direct {p0}, Lcom/facebook/login/c;->z()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/internal/f;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/c;->s:Ljava/lang/String;

    return-void
.end method

.method private final A(Ljava/lang/String;Lcom/facebook/login/u$e;)V
    .locals 6

    if-eqz p1, :cond_b

    const-string v0, "fbconnect://cct."

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/facebook/login/f0;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v1, v2, v3}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    sget-object v0, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/n0;->p0(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/internal/n0;->p0(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Lcom/facebook/login/c;->C(Landroid/os/Bundle;)Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Li4/r;

    const-string v0, "Invalid state parameter"

    invoke-direct {p1, v0}, Li4/r;-><init>(Ljava/lang/String;)V

    invoke-super {p0, p2, v3, p1}, Lcom/facebook/login/o0;->v(Lcom/facebook/login/u$e;Landroid/os/Bundle;Li4/r;)V

    return-void

    :cond_1
    const-string p1, "error"

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "error_type"

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    const-string v1, "error_msg"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, "error_message"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    if-nez v1, :cond_4

    const-string v1, "error_description"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_4
    const-string v2, "error_code"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, -0x1

    if-nez v2, :cond_5

    goto :goto_0

    :cond_5
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :goto_0
    move v2, v4

    :goto_1
    invoke-static {p1}, Lcom/facebook/internal/n0;->d0(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {v1}, Lcom/facebook/internal/n0;->d0(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    if-ne v2, v4, :cond_7

    const-string p1, "access_token"

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-super {p0, p2, v0, v3}, Lcom/facebook/login/o0;->v(Lcom/facebook/login/u$e;Landroid/os/Bundle;Li4/r;)V

    return-void

    :cond_6
    invoke-static {}, Li4/e0;->t()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v1, Lcom/facebook/login/b;

    invoke-direct {v1, p0, p2, v0}, Lcom/facebook/login/b;-><init>(Lcom/facebook/login/c;Lcom/facebook/login/u$e;Landroid/os/Bundle;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_7
    if-eqz p1, :cond_9

    const-string v0, "access_denied"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "OAuthAccessDeniedException"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    new-instance p1, Li4/t;

    invoke-direct {p1}, Li4/t;-><init>()V

    goto :goto_2

    :cond_9
    const/16 v0, 0x1069

    if-ne v2, v0, :cond_a

    new-instance p1, Li4/t;

    invoke-direct {p1}, Li4/t;-><init>()V

    goto :goto_2

    :cond_a
    new-instance v0, Li4/u;

    invoke-direct {v0, v2, p1, v1}, Li4/u;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    new-instance p1, Li4/g0;

    invoke-direct {p1, v0, v1}, Li4/g0;-><init>(Li4/u;Ljava/lang/String;)V

    :goto_2
    invoke-super {p0, p2, v3, p1}, Lcom/facebook/login/o0;->v(Lcom/facebook/login/u$e;Landroid/os/Bundle;Li4/r;)V

    :cond_b
    :goto_3
    return-void
.end method

.method private static final B(Lcom/facebook/login/c;Lcom/facebook/login/u$e;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$values"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/login/f0;->k(Lcom/facebook/login/u$e;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/login/o0;->v(Lcom/facebook/login/u$e;Landroid/os/Bundle;Li4/r;)V
    :try_end_0
    .catch Li4/r; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/facebook/login/o0;->v(Lcom/facebook/login/u$e;Landroid/os/Bundle;Li4/r;)V

    :goto_0
    return-void
.end method

.method private final C(Landroid/os/Bundle;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "state"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return v0

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "7_challenge"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/facebook/login/c;->r:Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return v0
.end method

.method public static synthetic x(Lcom/facebook/login/c;Lcom/facebook/login/u$e;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/facebook/login/c;->B(Lcom/facebook/login/c;Lcom/facebook/login/u$e;Landroid/os/Bundle;)V

    return-void
.end method

.method private final y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/c;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/facebook/internal/f;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method private final z()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/facebook/login/f0;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/c;->t:Ljava/lang/String;

    return-object v0
.end method

.method protected g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/c;->s:Ljava/lang/String;

    return-object v0
.end method

.method public j(IILandroid/content/Intent;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    sget-object v1, Lcom/facebook/CustomTabMainActivity;->u:Ljava/lang/String;

    invoke-virtual {p3, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/login/f0;->j(IILandroid/content/Intent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/login/f0;->j(IILandroid/content/Intent;)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/login/u;->o()Lcom/facebook/login/u$e;

    move-result-object p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne p2, v2, :cond_4

    if-eqz p3, :cond_3

    sget-object p2, Lcom/facebook/CustomTabMainActivity;->r:Ljava/lang/String;

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_3
    invoke-direct {p0, v3, p1}, Lcom/facebook/login/c;->A(Ljava/lang/String;Lcom/facebook/login/u$e;)V

    return v1

    :cond_4
    new-instance p2, Li4/t;

    invoke-direct {p2}, Li4/t;-><init>()V

    invoke-super {p0, p1, v3, p2}, Lcom/facebook/login/o0;->v(Lcom/facebook/login/u$e;Landroid/os/Bundle;Li4/r;)V

    return v0
.end method

.method public l(Lorg/json/JSONObject;)V
    .locals 2

    const-string v0, "param"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "7_challenge"

    iget-object v1, p0, Lcom/facebook/login/c;->r:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public o(Lcom/facebook/login/u$e;)I
    .locals 7

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/login/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_1

    return v3

    :cond_1
    invoke-virtual {p0, p1}, Lcom/facebook/login/o0;->r(Lcom/facebook/login/u$e;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Lcom/facebook/login/o0;->p(Landroid/os/Bundle;Lcom/facebook/login/u$e;)Landroid/os/Bundle;

    move-result-object v1

    sget-boolean v4, Lcom/facebook/login/c;->w:Z

    if-eqz v4, :cond_2

    const-string v4, "cct_over_app_switch"

    const-string v5, "1"

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    sget-boolean v4, Li4/e0;->q:Z

    const-string v5, "oauth"

    if-eqz v4, :cond_4

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->s()Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Lcom/facebook/login/d;->a:Lcom/facebook/login/d$a;

    sget-object v6, Lcom/facebook/internal/x;->c:Lcom/facebook/internal/x$a;

    invoke-virtual {v6, v5, v1}, Lcom/facebook/internal/x$a;->a(Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;

    move-result-object v6

    goto :goto_1

    :cond_3
    sget-object v4, Lcom/facebook/login/d;->a:Lcom/facebook/login/d$a;

    sget-object v6, Lcom/facebook/internal/e;->b:Lcom/facebook/internal/e$a;

    invoke-virtual {v6, v5, v1}, Lcom/facebook/internal/e$a;->a(Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;

    move-result-object v6

    :goto_1
    invoke-virtual {v4, v6}, Lcom/facebook/login/d$a;->c(Landroid/net/Uri;)V

    :cond_4
    invoke-virtual {v0}, Lcom/facebook/login/u;->i()Landroidx/fragment/app/e;

    move-result-object v4

    if-nez v4, :cond_5

    return v3

    :cond_5
    new-instance v3, Landroid/content/Intent;

    const-class v6, Lcom/facebook/CustomTabMainActivity;

    invoke-direct {v3, v4, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v4, Lcom/facebook/CustomTabMainActivity;->d:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object v4, Lcom/facebook/CustomTabMainActivity;->e:Ljava/lang/String;

    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    sget-object v1, Lcom/facebook/CustomTabMainActivity;->f:Ljava/lang/String;

    invoke-direct {p0}, Lcom/facebook/login/c;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object v1, Lcom/facebook/CustomTabMainActivity;->s:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->k()Lcom/facebook/login/i0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/login/i0;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0}, Lcom/facebook/login/u;->k()Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1, v3, v2}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_2
    return v2
.end method

.method protected s()Ljava/lang/String;
    .locals 1

    const-string v0, "chrome_custom_tab"

    return-object v0
.end method

.method public t()Li4/h;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/c;->u:Li4/h;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/facebook/login/f0;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/facebook/login/c;->r:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
