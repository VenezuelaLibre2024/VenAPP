.class Landroidx/browser/customtabs/i$a;
.super Lb/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/browser/customtabs/i;->c(Landroidx/browser/customtabs/j;)Lb/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field final synthetic b:Landroidx/browser/customtabs/j;

.field final synthetic c:Landroidx/browser/customtabs/i;


# direct methods
.method constructor <init>(Landroidx/browser/customtabs/i;Landroidx/browser/customtabs/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/browser/customtabs/i$a;->c:Landroidx/browser/customtabs/i;

    iput-object p2, p0, Landroidx/browser/customtabs/i$a;->b:Landroidx/browser/customtabs/j;

    invoke-direct {p0}, Lb/c$a;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Landroidx/browser/customtabs/i$a;->a:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic f2(Landroidx/browser/customtabs/j;ILandroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/browser/customtabs/i$a;->i2(Landroidx/browser/customtabs/j;ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic g2(Landroidx/browser/customtabs/j;ZLandroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/browser/customtabs/i$a;->j2(Landroidx/browser/customtabs/j;ZLandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic h2(Landroidx/browser/customtabs/j;ZLandroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/browser/customtabs/i$a;->k2(Landroidx/browser/customtabs/j;ZLandroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic i2(Landroidx/browser/customtabs/j;ILandroid/os/Bundle;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Landroidx/browser/customtabs/j;->onGreatestScrollPercentageIncreased(ILandroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic j2(Landroidx/browser/customtabs/j;ZLandroid/os/Bundle;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Landroidx/browser/customtabs/j;->onSessionEnded(ZLandroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic k2(Landroidx/browser/customtabs/j;ZLandroid/os/Bundle;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Landroidx/browser/customtabs/j;->onVerticalScrollEvent(ZLandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public onGreatestScrollPercentageIncreased(ILandroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroidx/browser/customtabs/i$a;->a:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/browser/customtabs/i$a;->b:Landroidx/browser/customtabs/j;

    new-instance v2, Landroidx/browser/customtabs/h;

    invoke-direct {v2, v1, p1, p2}, Landroidx/browser/customtabs/h;-><init>(Landroidx/browser/customtabs/j;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onSessionEnded(ZLandroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroidx/browser/customtabs/i$a;->a:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/browser/customtabs/i$a;->b:Landroidx/browser/customtabs/j;

    new-instance v2, Landroidx/browser/customtabs/g;

    invoke-direct {v2, v1, p1, p2}, Landroidx/browser/customtabs/g;-><init>(Landroidx/browser/customtabs/j;ZLandroid/os/Bundle;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onVerticalScrollEvent(ZLandroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroidx/browser/customtabs/i$a;->a:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/browser/customtabs/i$a;->b:Landroidx/browser/customtabs/j;

    new-instance v2, Landroidx/browser/customtabs/f;

    invoke-direct {v2, v1, p1, p2}, Landroidx/browser/customtabs/f;-><init>(Landroidx/browser/customtabs/j;ZLandroid/os/Bundle;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
