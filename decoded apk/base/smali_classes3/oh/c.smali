.class public Loh/c;
.super Landroidx/browser/customtabs/e;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Loh/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Loh/d;)V
    .locals 1

    invoke-direct {p0}, Landroidx/browser/customtabs/e;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Loh/c;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onCustomTabsServiceConnected(Landroid/content/ComponentName;Landroidx/browser/customtabs/c;)V
    .locals 0

    iget-object p1, p0, Loh/c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Loh/d;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Loh/d;->onServiceConnected(Landroidx/browser/customtabs/c;)V

    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    iget-object p1, p0, Loh/c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Loh/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Loh/d;->onServiceDisconnected()V

    :cond_0
    return-void
.end method
