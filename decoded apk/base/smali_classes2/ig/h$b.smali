.class final Lig/h$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lig/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lig/h;


# direct methods
.method private constructor <init>(Lig/h;)V
    .locals 0

    iput-object p1, p0, Lig/h$b;->a:Lig/h;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lig/h;Lig/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lig/h$b;-><init>(Lig/h;)V

    return-void
.end method

.method public static synthetic a(Lig/h$b;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lig/h$b;->b(Z)V

    return-void
.end method

.method private synthetic b(Z)V
    .locals 1

    iget-object v0, p0, Lig/h$b;->a:Lig/h;

    invoke-static {v0, p1}, Lig/h;->b(Lig/h;Z)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "plugged"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lig/h$b;->a:Lig/h;

    invoke-static {p2}, Lig/h;->a(Lig/h;)Landroid/os/Handler;

    move-result-object p2

    new-instance v0, Lig/i;

    invoke-direct {v0, p0, p1}, Lig/i;-><init>(Lig/h$b;Z)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
