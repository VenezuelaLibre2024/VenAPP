.class public final Lcom/facebook/internal/x;
.super Lcom/facebook/internal/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/x$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/internal/x$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/internal/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/x$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/internal/x;->c:Lcom/facebook/internal/x$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/e;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    if-nez p2, :cond_0

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    :cond_0
    sget-object v0, Lcom/facebook/internal/x;->c:Lcom/facebook/internal/x$a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/internal/x$a;->a(Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/internal/e;->b(Landroid/net/Uri;)V

    return-void
.end method
