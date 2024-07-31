.class public final Lcom/facebook/login/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/internal/n0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/q;->r(Lcom/facebook/login/u$e;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lcom/facebook/login/q;

.field final synthetic c:Lcom/facebook/login/u$e;


# direct methods
.method constructor <init>(Landroid/os/Bundle;Lcom/facebook/login/q;Lcom/facebook/login/u$e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/q$c;->a:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/facebook/login/q$c;->b:Lcom/facebook/login/q;

    iput-object p3, p0, Lcom/facebook/login/q$c;->c:Lcom/facebook/login/u$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li4/r;)V
    .locals 8

    iget-object v0, p0, Lcom/facebook/login/q$c;->b:Lcom/facebook/login/q;

    invoke-virtual {v0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v0

    sget-object v1, Lcom/facebook/login/u$f;->t:Lcom/facebook/login/u$f$c;

    iget-object v2, p0, Lcom/facebook/login/q$c;->b:Lcom/facebook/login/q;

    invoke-virtual {v2}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/login/u;->o()Lcom/facebook/login/u$e;

    move-result-object v2

    const-string v3, "Caught exception"

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v4, p1

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/facebook/login/u$f$c;->d(Lcom/facebook/login/u$f$c;Lcom/facebook/login/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/facebook/login/u$f;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/login/u;->f(Lcom/facebook/login/u$f;)V

    return-void
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/facebook/login/q$c;->a:Landroid/os/Bundle;

    const-string v1, "com.facebook.platform.extra.USER_ID"

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "id"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/login/q$c;->b:Lcom/facebook/login/q;

    iget-object v0, p0, Lcom/facebook/login/q$c;->c:Lcom/facebook/login/u$e;

    iget-object v1, p0, Lcom/facebook/login/q$c;->a:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Lcom/facebook/login/q;->t(Lcom/facebook/login/u$e;Landroid/os/Bundle;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/facebook/login/q$c;->b:Lcom/facebook/login/q;

    invoke-virtual {v0}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v0

    sget-object v1, Lcom/facebook/login/u$f;->t:Lcom/facebook/login/u$f$c;

    iget-object v2, p0, Lcom/facebook/login/q$c;->b:Lcom/facebook/login/q;

    invoke-virtual {v2}, Lcom/facebook/login/f0;->d()Lcom/facebook/login/u;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/login/u;->o()Lcom/facebook/login/u$e;

    move-result-object v2

    const-string v3, "Caught exception"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/facebook/login/u$f$c;->d(Lcom/facebook/login/u$f$c;Lcom/facebook/login/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/facebook/login/u$f;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/login/u;->f(Lcom/facebook/login/u$f;)V

    :goto_1
    return-void
.end method
