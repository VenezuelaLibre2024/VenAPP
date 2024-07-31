.class public final Ldf/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/k$b;
    }
.end annotation


# static fields
.field public static final c:Ldf/k$b;


# instance fields
.field private final a:Lzb/g;

.field private final b:Lff/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldf/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/k$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ldf/k;->c:Ldf/k$b;

    return-void
.end method

.method public constructor <init>(Lzb/g;Lff/f;Lgk/f;)V
    .locals 6

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/k;->a:Lzb/g;

    iput-object p2, p0, Ldf/k;->b:Lff/f;

    const-string p2, "Initializing Firebase Sessions SDK."

    const-string v0, "FirebaseSessions"

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of p2, p1, Landroid/app/Application;

    if-eqz p2, :cond_0

    check-cast p1, Landroid/app/Application;

    sget-object p2, Ldf/i0;->a:Ldf/i0;

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-static {p3}, Lzk/l0;->a(Lgk/f;)Lzk/k0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Ldf/k$a;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p3, p1}, Ldf/k$a;-><init>(Ldf/k;Lgk/f;Lgk/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lzk/h;->d(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/w1;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to register lifecycle callbacks, unexpected context "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static final synthetic a(Ldf/k;)Lzb/g;
    .locals 0

    iget-object p0, p0, Ldf/k;->a:Lzb/g;

    return-object p0
.end method

.method public static final synthetic b(Ldf/k;)Lff/f;
    .locals 0

    iget-object p0, p0, Ldf/k;->b:Lff/f;

    return-object p0
.end method
