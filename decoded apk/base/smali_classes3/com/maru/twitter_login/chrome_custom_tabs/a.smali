.class public Lcom/maru/twitter_login/chrome_custom_tabs/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loh/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/maru/twitter_login/chrome_custom_tabs/a$a;
    }
.end annotation


# instance fields
.field private a:Landroidx/browser/customtabs/i;

.field private b:Landroidx/browser/customtabs/c;

.field private c:Landroidx/browser/customtabs/e;

.field private d:Lcom/maru/twitter_login/chrome_custom_tabs/a$a;

.field private e:Landroidx/browser/customtabs/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/app/Activity;)Z
    .locals 0

    invoke-static {p0}, Loh/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Landroid/app/Activity;Landroidx/browser/customtabs/d;Landroid/net/Uri;I)V
    .locals 1

    iget-object v0, p1, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p1, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    invoke-virtual {p0, p1, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Landroidx/browser/customtabs/c;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Loh/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v1, Loh/c;

    invoke-direct {v1, p0}, Loh/c;-><init>(Loh/d;)V

    iput-object v1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->c:Landroidx/browser/customtabs/e;

    invoke-static {p1, v0, v1}, Landroidx/browser/customtabs/c;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/browser/customtabs/e;)Z

    return-void
.end method

.method public b()Landroidx/browser/customtabs/i;
    .locals 2

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Landroidx/browser/customtabs/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Landroidx/browser/customtabs/i;

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Landroidx/browser/customtabs/i;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->e:Landroidx/browser/customtabs/b;

    invoke-virtual {v0, v1}, Landroidx/browser/customtabs/c;->f(Landroidx/browser/customtabs/b;)Landroidx/browser/customtabs/i;

    move-result-object v0

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Landroidx/browser/customtabs/i;

    return-object v0
.end method

.method public d(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/os/Bundle;",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Landroidx/browser/customtabs/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b()Landroidx/browser/customtabs/i;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Landroidx/browser/customtabs/i;->i(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public f(Lcom/maru/twitter_login/chrome_custom_tabs/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->d:Lcom/maru/twitter_login/chrome_custom_tabs/a$a;

    return-void
.end method

.method public g(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->c:Landroidx/browser/customtabs/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Landroidx/browser/customtabs/c;

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Landroidx/browser/customtabs/i;

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->c:Landroidx/browser/customtabs/e;

    return-void
.end method

.method public onServiceConnected(Landroidx/browser/customtabs/c;)V
    .locals 2

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Landroidx/browser/customtabs/c;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/browser/customtabs/c;->h(J)Z

    iget-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->d:Lcom/maru/twitter_login/chrome_custom_tabs/a$a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/maru/twitter_login/chrome_custom_tabs/a$a;->onCustomTabsConnected()V

    :cond_0
    return-void
.end method

.method public onServiceDisconnected()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Landroidx/browser/customtabs/c;

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Landroidx/browser/customtabs/i;

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->d:Lcom/maru/twitter_login/chrome_custom_tabs/a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/maru/twitter_login/chrome_custom_tabs/a$a;->onCustomTabsDisconnected()V

    :cond_0
    return-void
.end method
