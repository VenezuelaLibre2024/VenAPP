.class public final Lcom/facebook/internal/m;
.super Lcom/facebook/internal/s0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/m$a;
    }
.end annotation


# static fields
.field public static final B:Lcom/facebook/internal/m$a;

.field private static final C:Ljava/lang/String;


# instance fields
.field private A:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/internal/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/m$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/internal/m;->B:Lcom/facebook/internal/m$a;

    const-class v0, Lcom/facebook/internal/m;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/m;->C:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/s0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/facebook/internal/s0;->A(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/internal/m;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic E(Lcom/facebook/internal/m;)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/internal/m;->F(Lcom/facebook/internal/m;)V

    return-void
.end method

.method private static final F(Lcom/facebook/internal/m;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0}, Lcom/facebook/internal/s0;->cancel()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 4

    invoke-virtual {p0}, Lcom/facebook/internal/s0;->r()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/internal/s0;->u()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/facebook/internal/s0;->t()Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/facebook/internal/m;->A:Z

    if-eqz v1, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/internal/m;->A:Z

    const-string v1, "(function() {  var event = document.createEvent(\'Event\');  event.initEvent(\'fbPlatformDialogMustClose\',true,true);  document.dispatchEvent(event);})();"

    const-string v2, "javascript:"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/facebook/internal/l;

    invoke-direct {v1, p0}, Lcom/facebook/internal/l;-><init>(Lcom/facebook/internal/m;)V

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_2
    :goto_0
    invoke-super {p0}, Lcom/facebook/internal/s0;->cancel()V

    return-void
.end method

.method public w(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    sget-object v0, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/internal/n0;->p0(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "bridge_args"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/facebook/internal/n0;->d0(Ljava/lang/String;)Z

    move-result v0

    const-string v2, "Unable to parse bridge_args JSON"

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/facebook/internal/c;->a(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.facebook.platform.protocol.BRIDGE_ARGS"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    sget-object v1, Lcom/facebook/internal/m;->C:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/facebook/internal/n0;->l0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    const-string v0, "method_results"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/facebook/internal/n0;->d0(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/facebook/internal/c;->a(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.facebook.platform.protocol.RESULT_ARGS"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    sget-object v1, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    sget-object v1, Lcom/facebook/internal/m;->C:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/facebook/internal/n0;->l0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    const-string v0, "version"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    invoke-static {}, Lcom/facebook/internal/e0;->t()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object p1
.end method
