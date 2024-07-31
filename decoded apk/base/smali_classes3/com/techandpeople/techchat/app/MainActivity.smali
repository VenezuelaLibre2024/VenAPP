.class public final Lcom/techandpeople/techchat/app/MainActivity;
.super Lio/flutter/embedding/android/FlutterActivity;
.source "SourceFile"

# interfaces
.implements Lsa/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/techandpeople/techchat/app/MainActivity$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lcb/c;

.field private c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/android/FlutterActivity;-><init>()V

    const-string v0, "MyActivity"

    iput-object v0, p0, Lcom/techandpeople/techchat/app/MainActivity;->a:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/techandpeople/techchat/app/MainActivity;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static synthetic a(Lcom/techandpeople/techchat/app/MainActivity;Lcb/e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/techandpeople/techchat/app/MainActivity;->f(Lcom/techandpeople/techchat/app/MainActivity;Lcb/e;)V

    return-void
.end method

.method public static synthetic b(Lcom/techandpeople/techchat/app/MainActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/techandpeople/techchat/app/MainActivity;->e(Lcom/techandpeople/techchat/app/MainActivity;)V

    return-void
.end method

.method public static synthetic c(Lcom/techandpeople/techchat/app/MainActivity;Lcb/e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/techandpeople/techchat/app/MainActivity;->g(Lcom/techandpeople/techchat/app/MainActivity;Lcb/e;)V

    return-void
.end method

.method private final d()V
    .locals 3

    iget-object v0, p0, Lcom/techandpeople/techchat/app/MainActivity;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/techandpeople/techchat/app/a;->a:Lcom/techandpeople/techchat/app/a$a;

    invoke-virtual {p0}, Lio/flutter/embedding/android/FlutterActivity;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/techandpeople/techchat/app/a$a;->a(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/google/android/gms/ads/MobileAds;->d(Landroid/content/Context;)V

    return-void
.end method

.method private static final e(Lcom/techandpeople/techchat/app/MainActivity;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lth/c;

    invoke-direct {v0, p0}, Lth/c;-><init>(Lcom/techandpeople/techchat/app/MainActivity;)V

    invoke-static {p0, v0}, Lcb/f;->b(Landroid/app/Activity;Lcb/b$a;)V

    return-void
.end method

.method private static final f(Lcom/techandpeople/techchat/app/MainActivity;Lcb/e;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/techandpeople/techchat/app/MainActivity;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcb/e;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcb/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object p1, p0, Lcom/techandpeople/techchat/app/MainActivity;->b:Lcb/c;

    if-nez p1, :cond_1

    const-string p1, "consentInformation"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_1
    invoke-interface {p1}, Lcb/c;->canRequestAds()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/techandpeople/techchat/app/MainActivity;->d()V

    :cond_2
    return-void
.end method

.method private static final g(Lcom/techandpeople/techchat/app/MainActivity;Lcb/e;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/techandpeople/techchat/app/MainActivity;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcb/e;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcb/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lio/flutter/embedding/android/FlutterActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lsa/e$a;->LATEST:Lsa/e$a;

    invoke-static {p1, v0, p0}, Lsa/e;->b(Landroid/content/Context;Lsa/e$a;Lsa/g;)I

    new-instance p1, Lcb/d$a;

    invoke-direct {p1}, Lcb/d$a;-><init>()V

    invoke-virtual {p1}, Lcb/d$a;->a()Lcb/d;

    move-result-object p1

    invoke-static {p0}, Lcb/f;->a(Landroid/content/Context;)Lcb/c;

    move-result-object v0

    const-string v1, "getConsentInformation(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/techandpeople/techchat/app/MainActivity;->b:Lcb/c;

    const/4 v1, 0x0

    const-string v2, "consentInformation"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    new-instance v3, Lth/a;

    invoke-direct {v3, p0}, Lth/a;-><init>(Lcom/techandpeople/techchat/app/MainActivity;)V

    new-instance v4, Lth/b;

    invoke-direct {v4, p0}, Lth/b;-><init>(Lcom/techandpeople/techchat/app/MainActivity;)V

    invoke-interface {v0, p0, p1, v3, v4}, Lcb/c;->requestConsentInfoUpdate(Landroid/app/Activity;Lcb/d;Lcb/c$b;Lcb/c$a;)V

    iget-object p1, p0, Lcom/techandpeople/techchat/app/MainActivity;->b:Lcb/c;

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    invoke-interface {v1}, Lcb/c;->canRequestAds()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/techandpeople/techchat/app/MainActivity;->d()V

    :cond_2
    return-void
.end method

.method public onMapsSdkInitialized(Lsa/e$a;)V
    .locals 2

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/techandpeople/techchat/app/MainActivity$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const-string v1, "NewRendererLog"

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "The legacy version of the renderer is used."

    goto :goto_0

    :cond_1
    const-string p1, "The latest version of the renderer is used."

    :goto_0
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method
