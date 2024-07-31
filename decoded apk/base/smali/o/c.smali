.class public Lo/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:Landroidx/browser/customtabs/d$b;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/os/Bundle;

.field private e:Lo/a;

.field private f:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/browser/customtabs/d$b;

    invoke-direct {v0}, Landroidx/browser/customtabs/d$b;-><init>()V

    iput-object v0, p0, Lo/c;->b:Landroidx/browser/customtabs/d$b;

    new-instance v0, Lo/a$a;

    invoke-direct {v0}, Lo/a$a;-><init>()V

    iput-object v0, p0, Lo/c;->e:Lo/a;

    const/4 v0, 0x0

    iput v0, p0, Lo/c;->f:I

    iput-object p1, p0, Lo/c;->a:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public a(Landroidx/browser/customtabs/i;)Lo/b;
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p0, Lo/c;->b:Landroidx/browser/customtabs/d$b;

    invoke-virtual {v0, p1}, Landroidx/browser/customtabs/d$b;->i(Landroidx/browser/customtabs/i;)Landroidx/browser/customtabs/d$b;

    iget-object p1, p0, Lo/c;->b:Landroidx/browser/customtabs/d$b;

    invoke-virtual {p1}, Landroidx/browser/customtabs/d$b;->b()Landroidx/browser/customtabs/d;

    move-result-object p1

    iget-object p1, p1, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    iget-object v0, p0, Lo/c;->a:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v0, "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v0, p0, Lo/c;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lo/c;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v1, "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_0
    iget-object v0, p0, Lo/c;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v1, "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/c;->e:Lo/a;

    invoke-interface {v1}, Lo/a;->a()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "androidx.browser.trusted.extra.DISPLAY_MODE"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const-string v1, "androidx.browser.trusted.extra.SCREEN_ORIENTATION"

    iget v2, p0, Lo/c;->f:I

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    new-instance v1, Lo/b;

    invoke-direct {v1, p1, v0}, Lo/b;-><init>(Landroid/content/Intent;Ljava/util/List;)V

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "CustomTabsSession is required for launching a TWA"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/util/List;)Lo/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lo/c;"
        }
    .end annotation

    iput-object p1, p0, Lo/c;->c:Ljava/util/List;

    return-object p0
.end method

.method public c(Landroidx/browser/customtabs/a;)Lo/c;
    .locals 1

    iget-object v0, p0, Lo/c;->b:Landroidx/browser/customtabs/d$b;

    invoke-virtual {v0, p1}, Landroidx/browser/customtabs/d$b;->e(Landroidx/browser/customtabs/a;)Landroidx/browser/customtabs/d$b;

    return-object p0
.end method

.method public d(Lo/a;)Lo/c;
    .locals 0

    iput-object p1, p0, Lo/c;->e:Lo/a;

    return-object p0
.end method

.method public e(I)Lo/c;
    .locals 0

    iput p1, p0, Lo/c;->f:I

    return-object p0
.end method
