.class public Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# instance fields
.field public a:Lio/flutter/plugin/common/MethodChannel;

.field public b:Ljava/lang/String;

.field public c:Landroidx/browser/customtabs/d$b;

.field public d:Lcom/maru/twitter_login/chrome_custom_tabs/a;

.field public e:Landroidx/browser/customtabs/i;

.field public f:Lnh/a;

.field protected final r:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->r:I

    return-void
.end method

.method static synthetic a(Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;Landroidx/browser/customtabs/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->d(Landroidx/browser/customtabs/d;)V

    return-void
.end method

.method private d(Landroidx/browser/customtabs/d;)V
    .locals 2

    iget-object v0, p1, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    invoke-static {p0}, Loh/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p1, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    invoke-static {p0, p1}, Loh/a;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->e:Landroidx/browser/customtabs/i;

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->a:Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "onClose"

    invoke-virtual {v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->a:Lio/flutter/plugin/common/MethodChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object v1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->f:Lnh/a;

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->b()V

    invoke-virtual {p0}, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->c()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lmh/a;->a:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "managerId"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lnh/a;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnh/a;

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->f:Lnh/a;

    const-string v0, "id"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->b:Ljava/lang/String;

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    iget-object v1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->f:Lnh/a;

    iget-object v1, v1, Lnh/a;->b:Lmh/b;

    invoke-virtual {v1}, Lmh/b;->b()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "twitter_login/auth_browser_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->a:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    const-string v0, "url"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/maru/twitter_login/chrome_custom_tabs/a;

    invoke-direct {v0}, Lcom/maru/twitter_login/chrome_custom_tabs/a;-><init>()V

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->d:Lcom/maru/twitter_login/chrome_custom_tabs/a;

    new-instance v1, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity$a;

    invoke-direct {v1, p0, p1, p0}, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity$a;-><init>(Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;Ljava/lang/String;Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;)V

    invoke-virtual {v0, v1}, Lcom/maru/twitter_login/chrome_custom_tabs/a;->f(Lcom/maru/twitter_login/chrome_custom_tabs/a$a;)V

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->d:Lcom/maru/twitter_login/chrome_custom_tabs/a;

    invoke-virtual {v0, p0}, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a(Landroid/app/Activity;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;->d:Lcom/maru/twitter_login/chrome_custom_tabs/a;

    invoke-virtual {v0, p0}, Lcom/maru/twitter_login/chrome_custom_tabs/a;->g(Landroid/app/Activity;)V

    return-void
.end method
