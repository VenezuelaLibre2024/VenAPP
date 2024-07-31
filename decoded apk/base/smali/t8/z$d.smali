.class final Lt8/z$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lt8/z;


# direct methods
.method private constructor <init>(Lt8/z;)V
    .locals 0

    iput-object p1, p0, Lt8/z$d;->a:Lt8/z;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lt8/z;Lt8/z$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt8/z$d;-><init>(Lt8/z;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-static {p1}, Lt8/z;->b(Landroid/content/Context;)I

    move-result p2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lt8/z$d;->a:Lt8/z;

    invoke-static {p1, p2}, Lt8/z$b;->a(Landroid/content/Context;Lt8/z;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lt8/z$d;->a:Lt8/z;

    invoke-static {p1, p2}, Lt8/z;->c(Lt8/z;I)V

    :goto_0
    return-void
.end method
