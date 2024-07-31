.class public final Lcom/facebook/login/d;
.super Landroidx/browser/customtabs/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/d$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/login/d$a;

.field private static b:Landroidx/browser/customtabs/c;

.field private static c:Landroidx/browser/customtabs/i;

.field private static final d:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/login/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/login/d$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/login/d;->a:Lcom/facebook/login/d$a;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/facebook/login/d;->d:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/browser/customtabs/e;-><init>()V

    return-void
.end method

.method public static final synthetic a()Landroidx/browser/customtabs/c;
    .locals 1

    sget-object v0, Lcom/facebook/login/d;->b:Landroidx/browser/customtabs/c;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    sget-object v0, Lcom/facebook/login/d;->d:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public static final synthetic c()Landroidx/browser/customtabs/i;
    .locals 1

    sget-object v0, Lcom/facebook/login/d;->c:Landroidx/browser/customtabs/i;

    return-object v0
.end method

.method public static final synthetic d(Landroidx/browser/customtabs/i;)V
    .locals 0

    sput-object p0, Lcom/facebook/login/d;->c:Landroidx/browser/customtabs/i;

    return-void
.end method


# virtual methods
.method public onCustomTabsServiceConnected(Landroid/content/ComponentName;Landroidx/browser/customtabs/c;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "newClient"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p2, v0, v1}, Landroidx/browser/customtabs/c;->h(J)Z

    sput-object p2, Lcom/facebook/login/d;->b:Landroidx/browser/customtabs/c;

    sget-object p1, Lcom/facebook/login/d;->a:Lcom/facebook/login/d$a;

    invoke-static {p1}, Lcom/facebook/login/d$a;->a(Lcom/facebook/login/d$a;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
