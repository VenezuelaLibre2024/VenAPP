.class Landroidx/browser/customtabs/c$a;
.super Landroidx/browser/customtabs/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/browser/customtabs/c;->b(Landroid/content/Context;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Landroidx/browser/customtabs/c$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Landroidx/browser/customtabs/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCustomTabsServiceConnected(Landroid/content/ComponentName;Landroidx/browser/customtabs/c;)V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p2, v0, v1}, Landroidx/browser/customtabs/c;->h(J)Z

    iget-object p1, p0, Landroidx/browser/customtabs/c$a;->a:Landroid/content/Context;

    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method